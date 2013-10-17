package org.mobtakeran.to_do_list;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        ListView listView = (ListView) findViewById(R.id.list);
        TimeTrackerAdapter timeTrackerAdapter = new TimeTrackerAdapter();
        listView.setAdapter(timeTrackerAdapter);
    }
}