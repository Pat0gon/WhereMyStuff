package items;

import java.util.ArrayList;

public class ItemType {
    private String name;  
    private ItemType parent;
    private ArrayList branches;

    public ItemType(String name) {
        this.name = name;
        this.parent = null;
        this.branches = new ArrayList<>();
    }

    

    public String getName(){
        return this.name;
    }

    public void setParent(ItemType parent) {
        this.parent = parent;
    }

    public ArrayList getBranches() {
        return branches;
    }

    public void setBranches(ArrayList branches) {
        this.branches = branches;
    }

    public void addBranch(ItemType branch){
        branch.setParent(this);
        branches.add(branch);
    }

    public void addItem(Consumable item){
        branches.add(item);
    }
    public void addItem(Unconsumable item){
        branches.add(item);
        
    }
}
