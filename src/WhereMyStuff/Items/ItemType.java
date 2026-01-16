package Items;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;



public class ItemType<T> {
    private String name;  
    private ItemType<?> parent;
    private ArrayList<T> itemTypes = new ArrayList<>();

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

    public ArrayList<?> getItemTypes(){
        return this.itemTypes;
    }

    public ArrayList<Item> getItems(){
        ArrayList<Item> items = new ArrayList<>();
        for (T element : itemTypes) {
            if (element instanceof Item item) {
                items.add(item);
            }
        }
        if (items.isEmpty()) {
            throw new NoSuchElementException("No items found in this ItemType.");
        }
        return items;
    }


    public void addBranch(T itemType)throws ElementAlreadyExistsException{
        if (itemTypes.contains(itemType)){
                throw new ElementAlreadyExistsException("Item type already exists: " + ((ItemType<?>) itemType).getName());
         }
        else{  
            ((ItemType<?>) itemType).setParent(this);
            itemTypes.add(itemType);
        }
      
    }

    public void addItem(Item item, float quantity, String containerID) throws ElementAlreadyExistsException{
        if(itemTypes.contains(item)){
            int index = itemTypes.indexOf(item);
            ((Item) itemTypes.get(index)).setQuantity(containerID, ((Item) itemTypes.get(index)).getQuantityInContainer(containerID) + quantity);
        }
        itemTypes.add((T)item);
    }
    public void addItem(Unconsumable item){
        itemTypes.add((T)item);
        
    }
    
    public void consumeItem(String itemName, float quantity, String containerID) throws NoSuchElementException{
        for(Item item : itemTypes){
            if(itemitem.getNAME().equals(itemName)){
                if(item instanceof Consumable itemC){
                    if(itemC.consume(quantity,containerID)){
                        items.remove(item);
                    }
                }
            }
        }
    }
    public Item removeItem (String itemName) throws NoSuchElementException{
        for(Item item : items){
            if(item.getNAME().equals(itemName)){
                items.remove(item);
                return (Item) item;
            }
        }
        throw new NoSuchElementException("Item not found: " + itemName);
    }

    public void setName(String name) {
        this.name = name;
    }



    public ItemType getParent() {
        return parent;
    }



    public void setItemTypes(ArrayList<ItemType> itemTypes) {
       this.itemTypes = itemTypes;
    }



    public void setItems(ArrayList<Item> items) {
        this.items =  items;
    }

    
}
