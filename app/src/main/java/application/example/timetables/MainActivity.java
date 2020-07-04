package application.example.timetables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;
    ArrayList<String> timeTable;
    ArrayAdapter adapter;
    public void editText(View view)
    {
adapter.clear();

        EditText number=(EditText) findViewById(R.id.button);

        for(int i=1;i<=10;i++)
        {
            Double num=i*Double.parseDouble(number.getText().toString());
            num= Double.valueOf(Math.round(num*100.0)/100.0);
            timeTable.add(Double.toString(num));
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView) findViewById(R.id.listView);
        timeTable=new ArrayList<String>();
        adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,timeTable);

        list.setAdapter(adapter);

    }
}
