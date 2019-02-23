package com.example.singletontest.volatile_static_synchronized_singleton;
import android.util.Log;
import java.util.ArrayList;

public class SimpleSingleton {
    private volatile static SimpleSingleton uniqueInstance=null;
    private ArrayList<String> arr;
    private int testValue;

    //생성자
    private SimpleSingleton(){
        this.arr=new ArrayList<String>();
        testValue=3;
    }
    //getinstance
    public static SimpleSingleton getInstance(){
        if(uniqueInstance==null){
            synchronized (SimpleSingleton.class){
                if(uniqueInstance==null)
                    uniqueInstance=new SimpleSingleton();
            }
        }
        return uniqueInstance;
    }
    //초기화
    public void deleteInstance(){
        //uniqueInstance=null;
        arr.clear();
        testValue=3;
    }

    //=======================================
    //정보저장
    //=======================================
    public int isStringThere(String name){
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).equals(name))
                return i;
        }
        return -1;
    }
    public int addString(int testValue,String name){
        this.testValue=testValue;
        int idx=isStringThere(name);
        if(idx==-1){
            this.arr.add(name);
            return isStringThere(name);
        }else{
            return idx;
        }
    }
    //=======================================
    //출력으로 정보가 잘 저장되었는지 테스트
    //=======================================
    public void print_arr(){
        Log.d("print_arr","print시작");
        for(int i=0;i<arr.size();i++){
            Log.d("print_arr","사람이름="+arr.get(i) );
        }
    }
}
