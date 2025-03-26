package items;

import java.util.ArrayList;
import java.util.Queue;

public class Items{
    ItemType node;

    public Items(){
        this.node = new ItemType("root");
    }

    public void addItem(Consumable item, Queue<String> itemTypes){
        ArrayList<ItemType> branches = node.getBranches();
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
    }

    public void addItem(Unconsumable item, Queue<String> itemTypes){
        ArrayList<ItemType> branches = node.getBranches();
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
    }

    


    public void addItemType(ItemType type){
        
    }
}
