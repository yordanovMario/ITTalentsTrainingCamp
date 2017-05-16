/**
 * Created by mladen.d.dinev on 22/03/2017.
 */
import java.util.HashMap;

public class IzbaSRakia {

    public enum TypesRakia {PRAZEN,GROZDOVA, SLIVOVA, KAISIEVA};


    public static HashMap<TypesRakia, Integer> skladRakia = new HashMap<TypesRakia, Integer>();

    public static void updateQuantity(TypesRakia typesRakia, int quantity) {
        skladRakia.put(typesRakia,quantity);
    }
    public static int getQuantity(TypesRakia typesRakia) {
        return skladRakia.get(typesRakia);
    }
}