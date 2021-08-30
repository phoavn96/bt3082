package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvContact;
    private List<ContactModel> listcontacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        lvContact = (ListView) findViewById(R.id.lvContact);
        ContactAdapter contactAdapter = new ContactAdapter(listcontacts,this);
        lvContact.setAdapter(contactAdapter);
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ContactModel contactModel = listcontacts.get(i);
                Toast.makeText(MainActivity.this,contactModel.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initData(){
        ContactModel contact = new ContactModel("Pham Van Hoa","0123456789",R.drawable.img);
        listcontacts.add(contact);
        contact = new ContactModel("Pham Van Hoa","0123456789",R.drawable.img_1);
        listcontacts.add(contact);
        contact = new ContactModel("Pham  Hoa","0123456789",R.drawable.img_2);
        listcontacts.add(contact);
        contact = new ContactModel("Pham Van","0123456789",R.drawable.img_3);
        listcontacts.add(contact);
        contact = new ContactModel("Pham Van Hoa","0123456789",R.drawable.img);
        listcontacts.add(contact);
        contact = new ContactModel("Pham  Hoa","0123456789",R.drawable.img);
        listcontacts.add(contact);
        contact = new ContactModel("Pham Van","0123456789",R.drawable.img);
        listcontacts.add(contact);
    }
}