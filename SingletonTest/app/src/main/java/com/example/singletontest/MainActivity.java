package com.example.singletontest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.singletontest.volatile_static_synchronized_singleton.SimpleSingleton;
import com.example.singletontest.volatile_static_synchronized_singleton.SimpleUseSingleton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        volatile_static_synchronized_singleton_test();
    }
    private void volatile_static_synchronized_singleton_test(){
        SimpleSingleton sd=SimpleSingleton.getInstance();
        SimpleUseSingleton f=new SimpleUseSingleton();
        f.StoreData(12,"a");
        sd.print_arr();

        f.StoreData(23,"b");
        sd.print_arr();

        sd.deleteInstance();
        sd.print_arr();

        f.StoreData(34,"c");
        sd.print_arr();
    }
}


