package com.example.singletontest.volatile_static_synchronized_singleton;

public class SimpleUseSingleton {
    public void StoreData(int testValue,String saveName){
        SimpleSingleton sd=SimpleSingleton.getInstance();
        int idx=sd.addString(testValue,saveName);
    }
}
