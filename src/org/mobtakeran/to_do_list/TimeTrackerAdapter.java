package org.mobtakeran.to_do_list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: system1
 * Date: 10/9/13
 * Time: 5:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class TimeTrackerAdapter extends BaseAdapter {

    private List<TimeRecord> times = new ArrayList<TimeRecord>();

    public TimeTrackerAdapter() {
        times.add(new TimeRecord("22:00", "Go ever!",true));
        times.add(new TimeRecord("22:30", "Go to bed!",true));

        times.add(new TimeRecord("22:00", "Go ever!",true));
        times.add(new TimeRecord("22:30", "Go to bed!",true));

        times.add(new TimeRecord("22:00", "Go ever!",true));
        times.add(new TimeRecord("22:30", "Go to bed!",true));

        times.add(new TimeRecord("22:00", "Go ever!",true));
        times.add(new TimeRecord("22:30", "Go to bed!",true));

        times.add(new TimeRecord("22:00", "Go ever!",true));
        times.add(new TimeRecord("22:30", "Go to bed!",true));

        times.add(new TimeRecord("22:00", "Go ever!",true));
        times.add(new TimeRecord("22:30", "Go to bed!",true));

        times.add(new TimeRecord("22:00", "Go ever!",true));
        times.add(new TimeRecord("22:30", "Go to bed!",true));

        times.add(new TimeRecord("22:00", "Go ever!",true));
        times.add(new TimeRecord("22:30", "Go to bed!",true));

        times.add(new TimeRecord("22:00", "Go ever!",true));
        times.add(new TimeRecord("22:30", "Go to bed!",true));

        times.add(new TimeRecord("22:00", "Go ever!",true));
        times.add(new TimeRecord("22:30", "Go to bed!",true));


    }

    @Override
    public int getCount() {
        return times.size();
    }

    @Override
    public TimeRecord getItem(int index) {
        //if()
        return times.get(index);
    }

    @Override
    public long getItemId(int index) {
        return index;
    }

    @Override
    public View getView(int index, View view1, ViewGroup viewGroup) {
        if (view1 == null) {
            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
            view1 = inflater.inflate(R.layout.list_items_layout, null);
        }
        TimeRecord timeRecord = getItem(index);
        boolean hide = timeRecord.getDeleted();
        if (!hide)
        {
        TextView time = (TextView) view1.findViewById(R.id.time);
        time.setText(timeRecord.getTime());
        TextView note = (TextView) view1.findViewById(R.id.note);
        note.setText(timeRecord.getNote());

        Button delete = (Button) view1.findViewById(R.id.btndelete);
            delete.setOnClickListener(new View.OnClickListener(){
                @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.
                //view.getId()
                //this.view1.setDeleted(false);
                    //timeRecord.setDeleted(false);
                    //view.
            }

            });
        }
//        Button delete = (Button) view1.findViewById(R.id.btndelete);
//        delete.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //To change body of implemented methods use File | Settings | File Templates.
//                //view.getId()
//                //this.view1.setDeleted(false);
//
//            }
//        });

//        if()
        return view1;
    }
}
