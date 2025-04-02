package items;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Consumable extends Item {
    private final String NAME;
    private final String DESCRIPTION;
    private final ItemQuantityType quantityType;
    private float quantity = 0;
    private float price = 0;
    private LocalDate storeDate;
    private final LocalDate expirationDate;
    private boolean isExpired = false;


    public Consumable(String NAME, String DESCRIPTION, ItemQuantityType quantityType, float quantity, String expirationDate) {
        super(NAME, DESCRIPTION, quantityType, quantity);
        this.storeDate = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.expirationDate = LocalDate.parse(expirationDate, dtf);
        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
        this.quantityType = quantityType;
    }

    boolean consume(float consumedQuantity){
        if(getQuantity() <= consumedQuantity){
            return true;
        } else {
            setQuantity(0);
            return false;
        }
    }



    void checkExpiration(){
        if (LocalDate.now().isAfter(expirationDate)) {
            isExpired = true;
        } else {
            isExpired = false;
        }
    }
}
