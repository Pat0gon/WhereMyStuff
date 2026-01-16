package Storage;

import java.util.HashMap;

import Items.Item;

import java.util.LinkedList;

public class Container<T> extends basicContainer{
    private final String NAME;
    private final String ID;
    private T parent = null; 
    private LinkedList<Container<?>> containersInside = new LinkedList<>();
    private HashMap<String, Item> itemsInside = new HashMap<>();

    public Container(String NAME, String ID){
        this.NAME = NAME;
        this.ID = ID;
    }
}
