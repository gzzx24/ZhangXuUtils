package apputils.zhangxu.zhangxuutils.materialdesign.activity;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import apputils.zhangxu.zhangxuutils.R;

public class CoordinatorLayoutActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private CollapsingToolbarLayout ctbl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_layout);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        ctbl = (CollapsingToolbarLayout) findViewById(R.id.collaspingtl);
        ctbl.setTitle("动画演示");
        setSupportActionBar(toolbar);


    }
}
