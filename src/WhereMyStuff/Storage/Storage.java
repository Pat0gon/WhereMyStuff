package Storage;

import java.util.HashMap;

public class Storage{
    private final String NAME;
    private final String ID;
    private final String ownersID;
    private HashMap<String, String> storageIDs = new HashMap<>();// <String, String> ContainerName, ContainerID
    private HashMap<String, Storage> containerMap = new HashMap<>();// <String, Storage> ContainerID, Container
    
    public Storage(String NAME, String ID, String ownersName, String ownersID){
        this.NAME = NAME;
        this.ID = ID;
        this.ownersID = ownersID;
    }

    public Storage(int ID, String ownersName, String ownersID){
        this.NAME = ownersName + "'s Storage "+ ID;
        this.ID = String.valueOf(ID);
        this.ownersID = ownersID;
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


