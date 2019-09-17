package com.bawei.rikao0905.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.bawei.rikao0905.R;
import com.bawei.rikao0905.adapter.PagersAdapter;
import com.bawei.rikao0905.fragment.Fragment01;
import com.bawei.rikao0905.fragment.Fragment02;
import com.bawei.rikao0905.fragment.Fragment03;
import com.bawei.rikao0905.fragment.Fragment04;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private List<Fragment> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tablayout);
        list=new ArrayList<>();
        list.add(new Fragment01());
        list.add(new Fragment02());
        list.add(new Fragment03());
        list.add(new Fragment04());
        PagersAdapter adapter = new PagersAdapter(getSupportFragmentManager(), list);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.getTabAt(0).setText("首页");
        tabLayout.getTabAt(1).setText("发现");
        tabLayout.getTabAt(2).setText("我的");
        tabLayout.getTabAt(3).setText("我的订单");
    }
}