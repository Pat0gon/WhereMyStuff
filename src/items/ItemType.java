package items;

import java.util.ArrayList;
import java.util.LinkedList;

public class ItemType {
    private String name;  
    private ItemType parent;
    @SuppressWarnings("FieldMayBeFinal")
    private LinkedList<ItemType> itemTypes = new LinkedList<>();
    @SuppressWarnings("FieldMayBeFinal")
    private ArrayList<Item> items = new ArrayList<>();

    public ItemType(String name){
        this.name = name;
        this.parent = null;  
    }

    

    public String getName(){
        return this.name;
    }

    public void setParent(ItemType parent) {
        this.parent = parent;
    }

    public LinkedList<ItemType> getItemTypes() {
        return itemTypes;
    }

    public ArrayList getItems(){
        return items;
    }


    public void addBranch(ItemType itemType){
        itemType.setParent(this);
        itemTypes.add(itemType);
    }

    public void addItem(Consumable item){
        items.add(item);
    }
    public void addItem(Unconsumable item){
        items.add(item);
        
    }
    public void consumeItem(String itemName){
        for (Item item : items) {
            if (item.getNAME().equals(itemName)) {
                items.remove(item);
                break;
            }
        }    
    }

    public void consumeItem(String itemName, float quantity) {
        for (Item item : items) {
            if (item.getNAME().equals(itemName)) {
                if (item instanceof Consumable consumable) {
                    consumable.checkExpiration();
                }
                
                break;
            }
        }
    }
}
