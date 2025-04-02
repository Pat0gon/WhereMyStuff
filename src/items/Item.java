package items;

public class Item{
    private final String NAME;
    private final String DESCRIPTION;
    private final ItemQuantityType quantityType;
    private float quantity = 0;
    private float price = 0;
    
    public Item(String NAME, String DESCRIPTION, ItemQuantityType quantityType, float quantity) {

        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
        this.quantityType = quantityType;
        this.quantity = quantity;

    }


    String getNAME() {
        return NAME;
    }
    String getDESCRIPTION() {
        return DESCRIPTION;
    }

    ItemQuantityType getQuantityType() {
        return quantityType;
    }
    
    float getQuantity() {
        return quantity;
    }

    void setQuantity(float quantity) {
        this.quantity = quantity;
    }
    
    void setPrice(float price) {
        this.price = price;
    }

    float getPrice() {
        return price;
    }
} 
