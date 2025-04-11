package Storage;

import java.util.HashMap;
import java.util.ArrayList;
import Items.Item;

public class Container{
    private final String NAME;
    private final String ID;
    private String location = null; //name or id of Storage or container it is stotred in
    private ArrayList<Container> containersInside = new ArrayList<>();
    private HashMap<String, Item> itemsInside = new HashMap<>();

    public Container(String NAME, String ID){
        this.NAME = NAME;
        this.ID = ID;
    }
}
