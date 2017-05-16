import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Kazan kazan1 = new Kazan(IzbaSRakia.TypesRakia.PRAZEN,true);
        Kazan kazan2 = new Kazan(IzbaSRakia.TypesRakia.PRAZEN,true);
        Kazan kazan3 = new Kazan(IzbaSRakia.TypesRakia.PRAZEN,true);
        Kazan kazan4 = new Kazan(IzbaSRakia.TypesRakia.PRAZEN,true);
        Kazan kazan5 = new Kazan(IzbaSRakia.TypesRakia.PRAZEN,true);

        StoreKazani.listKazani.add(kazan1);
        StoreKazani.listKazani.add(kazan2);
        StoreKazani.listKazani.add(kazan3);
        StoreKazani.listKazani.add(kazan4);
        StoreKazani.listKazani.add(kazan5);


        Berach berach1 = new Berach("kolio",20);
        Berach berach2 = new Berach("kolio",21);
        Berach berach3 = new Berach("kolio",22);
        Berach berach4 = new Berach("kolio",23);
        Berach berach5 = new Berach("kolio",25);
        Berach berach6 = new Berach("kolio",26);
        Berach berach7 = new Berach("kolio",27);

        while(true){
            berach1.start();
            berach2.start();
            berach3.start();
            berach4.start();
            berach5.start();
            berach6.start();
            berach7.start();
        }


    }
}
