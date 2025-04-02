package items;

public class Item{
    private final String NAME;
    private final String DESCRIPTION;
    private ItemQuantityType quantityType;
    private short quantity = 0;
    private float amount = 0;
    private float price = 0;
    
    public Item(String NAME, String DESCRIPTION, ItemQuantityType quantityType, short quantity) {

        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
        this.quantityType = quantityType;
        this.quantity = quantity;

    }

    
    public Item(String NAME, String DESCRIPTION, ItemQuantityType quantityType, float amount) {
        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
        this.quantityType = quantityType;
        this.amount = amount;
    }

    public Item(String NAME, String DESCRIPTION, ItemQuantityType quantityType, float amount, float price) {
        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
        this.quantityType = quantityType;
        this.amount = amount;
        this.price = price;
    }

    public Item(String NAME, String DESCRIPTION, ItemQuantityType quantityType, short quantity, float price) {
        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
        this.quantityType = quantityType;
        this.quantity = quantity;
        this.price = price;
    }
} 
