package items;

import java.util.ArrayList;
import java.util.LinkedList;

public class ItemType {
    private String name;  
    private ItemType parent;
    private LinkedList<ItemType> itemTypes = new LinkedList<>();
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

    public ArrayList<Item> getItems(){
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
    
    public void consumeItem(String itemName, float quantity){
        for(Item item : items){
            if(item.getNAME().equals(itemName)){
                if(item instanceof Consumable itemC){
                    if(itemC.consume(quantity)){
                        items.remove(item);
                    }
                }
            }
        }
    }
    public Item removeItem(String itemName){
        for(Item item : items){
            if(item.getNAME().equals(itemName)){
                items.remove(item);
                return (Item) item;
            }
            }
        return new Item("","",null,0); // Return an empty item if not found
    }

    public void setName(String name) {
        this.name = name;
    }



    public ItemType getParent() {
        return parent;
    }



    public void setItemTypes(LinkedList<ItemType> itemTypes) {
        this.itemTypes = itemTypes;
    }



    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
