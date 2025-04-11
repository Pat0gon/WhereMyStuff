package Storage;

import java.util.HashMap;

public class Depository{
    private final String NAME;
    private final String ID;
    private HashMap<String, String> storageIDs = new HashMap<>();// <String, String> storageName, storageID
    private HashMap<String, Storage> storageMap = new HashMap<>();// <String, Storage> storageID, Storage storage

    

    public Depository(String NAME, String ID){
        this.NAME = NAME;
        this.ID = ID;
    }

    private void addStorage(Storage storage){
        this.storageMap.put(storage.getNAME(), storage);
    }

    
        
    
}