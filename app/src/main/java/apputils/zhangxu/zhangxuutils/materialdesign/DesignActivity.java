package apputils.zhangxu.zhangxuutils.materialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import apputils.zhangxu.zhangxuutils.R;
import apputils.zhangxu.zhangxuutils.materialdesign.activity.DesignTabActivity;
import apputils.zhangxu.zhangxuutils.materialdesign.activity.DesignWidgetActivity;

public class DesignActivity extends AppCompatActivity {

    private String [] title = {"常规控件的使用介绍","符合 MD 设计的菜单控件","具有过渡动画效果的布局 layout","toolbar"};
    private ListView lv_design_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Material Design 特点 \n扁平化、简介\n水波纹反馈\n过渡动画\n材料空间位置的变化", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        lv_design_list = (ListView) findViewById(R.id.lv_design_list);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,title);
        lv_design_list.setAdapter(adapter);

        lv_design_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Intent intent = new Intent(DesignActivity.this, DesignWidgetActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent2 = new Intent(DesignActivity.this, DesignTabActivity.class);
                        startActivity(intent2);

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
