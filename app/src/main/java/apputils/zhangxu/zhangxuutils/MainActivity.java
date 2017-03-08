package apputils.zhangxu.zhangxuutils;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import apputils.zhangxu.zhangxuutils.toolbar.ToolbarActivity;
import apputils.zhangxu.zhangxuutils.widgets.WidgetsActivity;

public class MainActivity extends AppCompatActivity {

    private String [] title = {"控件","第三方控件","toolbar","交互式通信","多媒体","第三方控件"};
    private ListView lv_main_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("首页");

        lv_main_list = (ListView) findViewById(R.id.lv_main_list);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,title);
        lv_main_list.setAdapter(adapter);

        lv_main_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Intent intent = new Intent(MainActivity.this, WidgetsActivity.class);
                        startActivity(intent);
                        break;
                    case 1:

                        break;
                    case 2:
                        Intent intent2 = new Intent(MainActivity.this, ToolbarActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:

                        break;
                }
            }
        });
    }
}
