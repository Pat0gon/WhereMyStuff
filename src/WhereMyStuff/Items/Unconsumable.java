package Items;

import Storage.Container;

public class Unconsumable extends Item {
    private final String NAME;
    private final String DESCRIPTION;
    private final ItemQuantityType quantityType;
    private float quantity = 0;
    private float price = 0;

    public Unconsumable(String NAME, String DESCRIPTION, ItemQuantityType quantityType, float quantity, String containerID){
        super(NAME, DESCRIPTION, quantityType, quantity, containerID);
        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
        this.quantityType = quantityType;
        this.quantity = quantity;
        
    }

    


}
