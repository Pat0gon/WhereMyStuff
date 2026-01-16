package Items;

import java.util.HashMap;
import javafx.util.Pair;

public class Unconsumable  extends Item {
    private final String NAME;
    private final String DESCRIPTION;
    private final ItemQuantityType quantityType;
    private Pair<Short,Short> value;
    private HashMap<String, Float> containerQuantityMap = new HashMap<>();



    public Unconsumable(String NAME, String DESCRIPTION, ItemQuantityType quantityType, float quantity, String containerID){
        super(NAME, DESCRIPTION, quantityType, quantity, containerID);
        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
        this.quantityType = quantityType;
        this.quantity = quantity;
        
    }



    


}
