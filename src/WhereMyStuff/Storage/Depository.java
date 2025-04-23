package Storage;

import java.util.HashMap;

public class Depository{
    private  String name;
    private final String ID;
    private HashMap<String, String> storageIDs = new HashMap<>();// <String, String> storageName, storageID
    private HashMap<String, Storage> storageMap = new HashMap<>();// <String, Storage> storageID, Storage storage

    

    public Depository(String name, String ID){
        this.name = name;
        this.ID = ID;
    }

    public Depository( String ID){
        this.name = "Magazyn "+ ID;
        this.ID = ID;
    }

    private void addStorage(Storage storage){
        this.storageMap.put(storage.getNAME(), storage);
    }

    
        
    
}