package de.markusdamm.financesharer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    List<String> financersList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();
        fillList();
        addListenerOnListViewItemSelection();
    }

    private void initializeViews() {
        listView = (ListView) findViewById(R.id.lvFinances);
    }

    private void fillList(){
        financersList.add("abc");
        financersList.add("def");
        ListAdapter listAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,financersList);
        listView.setAdapter(listAdapter);
    }

    public void addListenerOnListViewItemSelection() {
        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = listView.getItemAtPosition(position).toString();
                Intent intent = new Intent(view.getContext(), SingleFinance.class);
                intent.putExtra("singleFinanceName", item);
                startActivity(intent);
            }
        });

    }
}
