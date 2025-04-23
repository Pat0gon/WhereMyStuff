package Items;
import java.util.HashMap;

import Storage.Container;

public class Item{
    private final String NAME;
    private final String DESCRIPTION;
    private final ItemQuantityType quantityType;
    private float price = 0;
    private HashMap<String, Float> containerQuantityMap = new HashMap<>();//containerID where item's stored and its quantity

    
    
    public Item(String NAME, String DESCRIPTION, ItemQuantityType quantityType, float quantity, String containerID) {

        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
        this.quantityType = quantityType;
        this.containerQuantityMap.put(containerID, quantity);
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
    
    float getQuantityInContainer(String containerKey) {
        return containerQuantityMap.get(containerKey);
     }
    float getTotalQuantity(){
        float TotalQuantity = 0;
        for (String containerID : containerQuantityMap.keySet()) {
            TotalQuantity += containerQuantityMap.get(containerID);
        }
        return TotalQuantity;
    }

    void setQuantity(String containerID, float quantity) {
         this.containerQuantityMap.put(containerID, quantity);
     }
    
    void setPrice(float price) {
        this.price = price;
    }

    float getPrice() {
        return price;
    }

    public HashMap<String, Float> getContainerQuantityMap() {
        return containerQuantityMap;
    }

    
} 
