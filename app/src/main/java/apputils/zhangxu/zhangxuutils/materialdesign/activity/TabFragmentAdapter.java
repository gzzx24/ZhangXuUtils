package apputils.zhangxu.zhangxuutils.materialdesign.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by zhangxu on 17/3/14.
 */

public class TabFragmentAdapter extends FragmentStatePagerAdapter{

    List<String> mTitles;
    List<Fragment> mFragments;

    public TabFragmentAdapter(FragmentManager fm,List<String> titles,List<Fragment> fragments) {
        super(fm);
        mTitles = titles;
        mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }
}
