package items;

public class Item extends {
    private final String NAME;
    private final String DESCRIPTION;
    private ItemQuantityType quantityType;
    private short quantity = 0;
    private float amount = 0;
    private float price = 0;
    
    public Item(String NAME, String dESCRIPTION, ItemQuantityType quantityType, short quantity) {

        NAME = nAME;
        DESCRIPTION = dESCRIPTION;
        this.quantityType = quantityType;
        this.quantity = quantity;

    }

    
    public Item(String NAME, String dESCRIPTION, ItemQuantityType quantityType, float amount) {
        NAME = nAME;
        DESCRIPTION = dESCRIPTION;
        this.quantityType = quantityType;
        this.amount = amount;
    }

    public Item(String NAME, String dESCRIPTION, ItemQuantityType quantityType, float amount, float price) {
        NAME = nAME;
        DESCRIPTION = dESCRIPTION;
        this.quantityType = quantityType;
        this.amount = amount;
        this.price = price;
    }

    public Item(String NAME, String dESCRIPTION, ItemQuantityType quantityType, short quantity, float price) {
        NAME = nAME;
        DESCRIPTION = dESCRIPTION;
        this.quantityType = quantityType;
        this.quantity = quantity;
        this.price = price;
    }
} 
