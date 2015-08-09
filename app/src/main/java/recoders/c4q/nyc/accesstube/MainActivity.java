package recoders.c4q.nyc.accesstube;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends FragmentActivity {


    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    private MainPagerAdapter mAdapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mTabLayout = (TabLayout) findViewById(R.id.sliding_tabs);

        mAdapter = new MainPagerAdapter(getSupportFragmentManager(), getApplicationContext());

        mViewPager.setAdapter(mAdapter);

        mTabLayout.setupWithViewPager(mViewPager);


    }




}