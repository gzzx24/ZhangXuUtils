package apputils.zhangxu.zhangxuutils.toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import apputils.zhangxu.zhangxuutils.R;
import apputils.zhangxu.zhangxuutils.toolbar.Activity.ToolbarAndAppCompatActivity;

public class ToolbarActivity extends AppCompatActivity {

    private String [] title = {"toolbar与AppCompatActivity","Button","ToggleButton","CheckBox","RadioButton"};
    private ListView lv_toolbar_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        setTitle("toolbar列表");

        lv_toolbar_list = (ListView) findViewById(R.id.lv_toolbar_list);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,title);
        lv_toolbar_list.setAdapter(adapter);

        lv_toolbar_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Intent intent = new Intent(ToolbarActivity.this, ToolbarAndAppCompatActivity.class);
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
