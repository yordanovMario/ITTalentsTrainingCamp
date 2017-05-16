import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by mladen.d.dinev on 22/03/2017.
 */
public class StoreKazani {
    public static List<Kazan> listKazani = Collections.synchronizedList(new ArrayList<Kazan>());

    public List<Kazan> returnKazani(){
        return listKazani;
    }

}
