package items;

import java.time.LocalDate;

public class Consumable extends Item {
    private final String NAME;
    private final String DESCRIPTION;
    private ItemQuantityType quantityType;
    private short quantity = 0;
    private float amount = 0;
    private float price = 0;
    private LocalDate storeDate;
    private final LocalDate expirationDate;
    private boolean isExpired = false;


    public Consumable(String NAME, String DESCRIPTION, ItemQuantityType quantityType, short quantity, Date expirationDate) {
        super(NAME, DESCRIPTION, quantityType, quantity);
        this.storeDate = LocalDate().now();

    }

    
    public Consumable(String NAME, String DESCRIPTION, ItemQuantityType quantityType, float amount) {
        
        super(NAME, DESCRIPTION, quantityType, amount);
        this.amount = amount;
    }

    
}
