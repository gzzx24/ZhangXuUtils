package apputils.zhangxu.zhangxuutils.materialdesign.activity;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import apputils.zhangxu.zhangxuutils.R;

public class NavigationActivity extends AppCompatActivity {

    private DrawerLayout mDrawer;
    private Button btn_open;
    private Button btn_close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        mDrawer = (DrawerLayout) findViewById(R.id.activity_navigation);
        mDrawer.setDrawerListener(new DrawerLayout.DrawerListener() { //监听DrawerLayout的侧滑
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

            }

            @Override
            public void onDrawerOpened(View drawerView) {
                Toast.makeText(NavigationActivity.this, "onDrawerOpened", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                Toast.makeText(NavigationActivity.this, "onDrawerClosed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });

        btn_open = (Button) findViewById(R.id.btn_open);
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.openDrawer(Gravity.LEFT);
            }
        });

        btn_close= (Button) findViewById(R.id.btn_close);
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.closeDrawer(Gravity.LEFT);
            }
        });
    }
}
