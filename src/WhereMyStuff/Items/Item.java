package Items;
import java.util.HashMap;

public class Item{
    private final String NAME;
    private String description;
    private final ItemQuantityType quantityType;
    private float value = 0;
    private HashMap<String, Float> containerQuantityMap = new HashMap<>();//containerID where item's stored and its quantity

    
    
    public Item(String NAME, String description, ItemQuantityType quantityType,float value, float quantity, String containerID) {

        this.NAME = NAME;
        this.description = description;
        this.quantityType = quantityType;
        this.value = value;
        this.containerQuantityMap.put(containerID, quantity);
    }

    public Item(String NAME, String description, ItemQuantityType quantityType, float quantity, String containerID) {

        this.NAME = NAME;
        this.description = description;
        this.quantityType = quantityType;
        this.containerQuantityMap.put(containerID, quantity);
    }


    String getNAME() {
        return this.NAME;
    }
    String getDescription() {
        return this.description;
    }

    ItemQuantityType getQuantityType() {
        return this.quantityType;
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
    
    public HashMap<String, Float> getContainerQuantityMap() {
        return this.containerQuantityMap;
    }

    public float getValue() {
        return this.value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
} 
