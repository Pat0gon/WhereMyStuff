package Storage;

import java.util.HashMap;

public class Storage{
    private final String NAME;
    private final String ID;
    private final String OwnersID;
    private HashMap<String, String> storageIDs = new HashMap<>();// <String, String> ContainerName, ContainerID
    private HashMap<String, Storage> containerMap = new HashMap<>();// <String, Storage> ContainerID, Container
    
    public Storage(String NAME, String ID, String OwnersID){
        this.NAME = NAME;
        this.ID = ID;
        this.OwnersID = OwnersID;
    }

    public String getNAME() {
        return this.NAME;
    }
   
    public String getID() {
        return this.ID;
    }
    
    public HashMap<String, String> getStorageIDs() {
        return storageIDs;
    }
    public HashMap<String, Storage> getContainerMap() {
        return this.containerMap;
    }
    
}


