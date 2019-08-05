package com.example.dnb;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;

import java.util.ArrayList;

public class dnb_i_library extends AppCompatActivity {

    private ArrayList<Book> bookArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dnb_i_library);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.i_library_menu, menu);
        menu.setHeaderTitle("Choose an Option");
        super.onCreateContextMenu(menu, v, menuInfo);


        //Making floating action button a context  menu
        FloatingActionButton floatingActionButton =findViewById(R.id.ifab);
        registerForContextMenu(floatingActionButton);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.i_library_List);

        // Initialize contacts
        bookArrayList = Book.createBooksList(20);
        // Create adapter passing in the sample user data
        BookRecyclerAdapter adapter = new BookRecyclerAdapter(bookArrayList);
        // Attach the adapter to the recyclerview to populate items
        recyclerView.setAdapter(adapter);
        // Set layout manager to position the items
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // That's all!



        FloatingActionButton fab = findViewById(R.id.ifab);fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null);
            }
        });
    }

}
