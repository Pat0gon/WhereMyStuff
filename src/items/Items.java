package items;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;

public class Items{
    ItemType node;

    public Items(){
        this.node = new ItemType("root");
    }

    void returnToRoot(){
        while(node.getName() != "root"){
            node = node.getParent();
        }
    }

    public void addItem(Consumable item, Queue<String> itemTypes){
        LinkedList<ItemType> branches = node.getItemTypes();
        while(!itemTypes.isEmpty()){
            if(branches.contains(new ItemType(itemTypes.peek()))){
                for(ItemType branch : branches){
                    if(branch.getName().equals(itemTypes.peek())){
                        node = branch;
                        itemTypes.remove();
                        break;
                    }
                }
            }
            else{
                ItemType branch = new ItemType(itemTypes.remove());
                node.addBranch(branch);
                node = branch;
            }
        }
        node.addItem(item);
        returnToRoot();
    }

    public void addItem(Unconsumable item, Queue<String> itemTypes){
        LinkedList<ItemType> branches = node.getItemTypes();
        while(!itemTypes.isEmpty()){
            if(branches.contains(new ItemType(itemTypes.peek()))){
                for(ItemType branch : branches){
                    if(branch.getName().equals(itemTypes.peek())){
                        node = branch;
                        itemTypes.remove();
                        break;
                    }
                }
            }
            else{
                ItemType branch = new ItemType(itemTypes.remove());
                node.addBranch(branch);
                node = branch;
            }
        }
        node.addItem(item);
        returnToRoot();
    }
    
    public Item findItem(String itemName) {
        LinkedList<ItemType> branches = node.getItemTypes();
        for(ItemType branch : branches){
            ArrayList<Item> items = branch.getItems();
            for(Item item : items){
                if(item.getNAME().equals(itemName)){
                    return item;
                }
            }
        }
        return null;
    }

    public boolean consumeItem(String itemName, float quantity) {
        LinkedList<ItemType> branches = node.getItemTypes();
        for(ItemType branch : branches){
            ArrayList<Item> items = branch.getItems();
            for(Item item : items){
                if(item.getNAME().equals(itemName)){
                    if(item instanceof Consumable consumable){
                        return consumable.consume(quantity);
                    }
                }
            }
        }
        return false;
    }

    public void checkExpiration(){
        LinkedList<ItemType> branches = node.getItemTypes();
        for(ItemType branch : branches){
            ArrayList<Item> items = branch.getItems();
            for(Item item : items){
                if(item instanceof Consumable consumable){
                    consumable.checkExpiration();
                }
            }
        }
    }

    

    


    
}
