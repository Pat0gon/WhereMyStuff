package Items;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Consumable extends Item {
    private final String NAME;
    private final String DESCRIPTION;
    private final ItemQuantityType quantityType;
    private float price = 0;
    private LocalDate storeDate;
    private final LocalDate expirationDate;
    private boolean isExpired = false;


    public Consumable(String NAME, String DESCRIPTION, ItemQuantityType quantityType, float quantity, String containerID, String expirationDate) {
        super(NAME, DESCRIPTION, quantityType, quantity, containerID);
        this.storeDate = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.expirationDate = LocalDate.parse(expirationDate, dtf);
        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
        this.quantityType = quantityType;
    }

    boolean consume(float consumedQuantity, String containerID) {
        if(getQuantityInContainer(containerID) <= consumedQuantity){
            setQuantity(containerID, getQuantityInContainer(containerID)-consumedQuantity);
            return false;
        } else {
            setQuantity(containerID,0);
            return true;
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
