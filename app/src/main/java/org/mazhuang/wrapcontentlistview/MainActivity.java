package org.mazhuang.wrapcontentlistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private ListView mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ListItemModel> dataList = new ArrayList<ListItemModel>();
        dataList.add(new ListItemModel("item 1", 50));
        dataList.add(new ListItemModel("item 2", 60));
        dataList.add(new ListItemModel("item 3", 70));
        dataList.add(new ListItemModel("item 4", 80));
        dataList.add(new ListItemModel("item 5", 90));
        dataList.add(new ListItemModel("item 6", 100));
        dataList.add(new ListItemModel("item 7", 110));
        dataList.add(new ListItemModel("item 8", 120));
        dataList.add(new ListItemModel("item 9", 130));
        dataList.add(new ListItemModel("item 10", 140));
        dataList.add(new ListItemModel("item 11", 150));
        dataList.add(new ListItemModel("item 12", 160));

        mList = (ListView)findViewById(R.id.list_wrap_content);
        mList.setAdapter(new MyListAdapter(dataList));
    }

    class MyListAdapter extends ArrayAdapter<ListItemModel> {
        public MyListAdapter(ArrayList<ListItemModel> list) {
            super(MainActivity.this, 0, list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = MainActivity.this.getLayoutInflater()
                        .inflate(R.layout.item_for_list, null);
            }

            ListItemModel item = getItem(position);

            TextView tvTitle = (TextView)convertView.findViewById(R.id.text_title);
            tvTitle.setText(item.mText);
            tvTitle.setHeight(item.mHeight);

            return convertView;
        }
    }

    class ListItemModel {
        private String mText;
        private int mHeight;
        public ListItemModel(String text, int height) {
            mText = text;
            mHeight = height;
        }
    }
}
