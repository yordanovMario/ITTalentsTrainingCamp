import java.util.Iterator;
import java.util.Random;

/**
 * Created by mladen.d.dinev on 22/03/2017.
 */
public class Berach extends Thread {

    private String name;
    private int age;
    private IzbaSRakia.TypesRakia berachVidRakia;

    public Berach(String name, int age) {
        this.name = name;
        this.age = age;
        int randTypeFruit = new Random().nextInt(3);
        switch (randTypeFruit) {
            case 0:
                berachVidRakia = IzbaSRakia.TypesRakia.GROZDOVA;
                break;
            case 1:
                berachVidRakia = IzbaSRakia.TypesRakia.SLIVOVA;
                break;
            case 2:
                berachVidRakia = IzbaSRakia.TypesRakia.KAISIEVA;
                break;
            default:
                berachVidRakia = IzbaSRakia.TypesRakia.PRAZEN;
                break;
        }
    }

    @Override
    public void start() {
        try {
            int count = 0;
            for (Kazan kazan : StoreKazani.listKazani) {
                count++;
                if (kazan.getTypeRakia() == this.berachVidRakia || kazan.isItNewKazan()) {

                    if (kazan.isItNewKazan()) {
                        kazan.setStatusKazan(false);
                        kazan.setRakia(this.berachVidRakia);
                    }
                    kazan.sipiFruits();
                    Thread.sleep(200);
                    break;

                }
            }

        } catch (InterruptedException e) {
            System.out.println("Oops");
        }
    }
}
