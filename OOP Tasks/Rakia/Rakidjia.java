/**
 * Created by mladen.d.dinev on 22/03/2017.
 */

public class Rakidjia extends Thread {

    private String name;
    private int age;
    private Kazan variKazan;
    private IzbaSRakia.TypesRakia typeVarene;

    public Rakidjia(String name, int age, Kazan kazan) {
        this.name = name;
        this.age = age;
        this.variKazan = kazan;
    }

    private void setTipRakiqZaVarene(IzbaSRakia.TypesRakia rakia) {
        this.typeVarene = rakia;
    }

    @Override
    public void start() {
        try {
            variKazan.variRakia();
            Thread.currentThread().interrupt();
        } catch (Exception e) {
            System.out.println("Oops");
        }

    }
}
