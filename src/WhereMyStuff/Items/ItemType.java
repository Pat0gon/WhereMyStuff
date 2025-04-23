package Items;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;



public class ItemType {
    private String name;  
    private ItemType parent;
    private ArrayList<ItemType> itemTypes = new ArrayList<>();
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

    public ArrayList<ItemType> getItemTypes(){
        return this.itemTypes;
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }


    public void addBranch(ItemType itemType)throws ElementAlreadyExistsException{
        if (itemTypes.contains(itemType)){
                throw new ElementAlreadyExistsException("Item type already exists: " + itemType.getName());
         }
        else{  
            itemType.setParent(this);
            itemTypes.add(itemType);
        }
      
    }

    public void addItem(Item item, float quantity, String containerID) throws ElementAlreadyExistsException{
        if(items.contains(item)){
            int index = items.indexOf(item);
            ( items.get(index)).setQuantity(containerID, ( items.get(index)).getQuantityInContainer(containerID) + quantity);
        }
        items.add(item);
    }
    public void addItem(Unconsumable item){
        items.add(item);
        
    }
    
    public void consumeItem(String itemName, float quantity, String containerID) throws NoSuchElementException{
        for(Item item : items){
            if(item.getNAME().equals(itemName)){
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
