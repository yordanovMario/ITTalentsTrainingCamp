/**
 * Created by mladen.d.dinev on 22/03/2017.
 */

import java.util.Random;

public class Kazan {

    private static final int MIN_KILOS_FRUIT     = 10;
    private int kilos;
    private IzbaSRakia.TypesRakia typeRakia;
    private int TotalProduction = 0;
    private IzbaSRakia izba;
    private boolean variRakiaAre= false;
    private boolean isItNew;
    private boolean isItBusy;

    public Kazan(IzbaSRakia.TypesRakia rakiika, boolean status){
        this.kilos=0;
        this.isItNew = status;
        this.typeRakia = rakiika;
    }


    public void setStatusKazan(boolean newStatusKazan) {
        this.isItNew = newStatusKazan;
    }

    public synchronized void sipiFruits(){
        while(this.variRakiaAre) {
            try {
                Rakidjia rakidjia = new Rakidjia("peca", 10, this);
                rakidjia.start();
                this.wait();
            } catch (InterruptedException e) {
            }
        }

        kilos++;
        if(kilos == MIN_KILOS_FRUIT)
            this.variRakiaAre = true;
        System.out.println(this.typeRakia + " " +  kilos);
    }

    public synchronized void variRakia() throws InterruptedException {
        int production = getProduction();
        System.out.println("Production for " + typeRakia + " " + production);
        if (IzbaSRakia.skladRakia.get(typeRakia) != null){
            int previousProduction  =  IzbaSRakia.getQuantity(typeRakia);
            production += previousProduction;
        }
        else{
            IzbaSRakia.updateQuantity(typeRakia,production);
        }
        System.out.println("After varene " + this.typeRakia + " " + production );
        if (production >= 10){
            System.exit(0);
        }
        kilos = 0;
        Thread.sleep(1000);
        this.variRakiaAre = false;
        notifyAll();
    }

    private int getProduction() {
        return new Random().nextInt(kilos) + 1;
    }

    public void setRakia(IzbaSRakia.TypesRakia newrakiika){
        this.typeRakia = newrakiika;
    }

    public IzbaSRakia.TypesRakia getTypeRakia() {
        return typeRakia;
    }

    public boolean isItNewKazan () {
        return isItNew;
    }

}
