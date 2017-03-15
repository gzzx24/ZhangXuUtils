package apputils.zhangxu.zhangxuutils.materialdesign.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import apputils.zhangxu.zhangxuutils.R;

public class DesignTabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_tab);

        TabLayout tabs = (TabLayout) findViewById(R.id.tl);
        List<String> titles = new ArrayList<>();
        List<Fragment> fragments = new ArrayList<>();
        for (int i = 0;i<=6;i++){
            String title = "tab" + i;
            tabs.addTab(tabs.newTab().setText(title));
            titles.add(title);
            Fragment fragment = TabFragment.newInstance(title,"");
            fragments.add(fragment);
        }
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        TabFragmentAdapter mAdapter = new TabFragmentAdapter(getSupportFragmentManager(),titles,fragments);
        viewPager.setAdapter(mAdapter);
        tabs.setupWithViewPager(viewPager);
        tabs.setTabsFromPagerAdapter(mAdapter);
    }
}
