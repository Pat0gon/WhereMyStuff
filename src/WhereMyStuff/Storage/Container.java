package Storage;

import java.util.HashMap;

import Items.Item;

import java.util.LinkedList;

public class Container{
    private final String NAME;
    private final String ID;
    private String location = null; //name or id of Storage or container it is stotred in
    private LinkedList<Container> containersInside = new LinkedList<>();
    private HashMap<String, Item> itemsInside = new HashMap<>();

    public Container(String NAME, String ID){
        this.NAME = NAME;
        this.ID = ID;
    }
}
