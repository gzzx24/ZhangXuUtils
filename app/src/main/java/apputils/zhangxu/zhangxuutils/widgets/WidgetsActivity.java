package apputils.zhangxu.zhangxuutils.widgets;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import apputils.zhangxu.zhangxuutils.R;

public class WidgetsActivity extends AppCompatActivity {

    private String [] title = {"TextView","Button","ToggleButton","CheckBox","RadioButton"};
    private ListView lv_widgets_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets);
        setTitle("控件列表");

        lv_widgets_list = (ListView) findViewById(R.id.lv_widgets_list);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,title);
        lv_widgets_list.setAdapter(adapter);

        lv_widgets_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Intent intent = new Intent(WidgetsActivity.this, WidgetsActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                }
            }
        });
    }
}
