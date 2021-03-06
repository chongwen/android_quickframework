package com.zcw.quickframework;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTabHost;


public class FragmentTabHostActivity extends AppCompatActivity implements TabHost.OnTabChangeListener {
    private Fragment[] mFragments;
    private FragmentTabHost mTabHost;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_tab_host_ac_layout);
        mFragments = TabGenerator.getFragments("FragmentTabHost Tab");
        initView();

    }

    private void initView() {
        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);

        // 关联TabHost
        mTabHost.setup(this, getSupportFragmentManager(), R.id.home_container);
        //注意，监听要设置在添加Tab之前
        mTabHost.setOnTabChangedListener(this);


        //添加Tab
        for (int i = 0; i < 4; i++) {
            //生成TabSpec
            TabHost.TabSpec tabSpec = mTabHost.newTabSpec(TabGenerator.mTabTitle[i]).setIndicator(TabGenerator.getTabView(this, i));
            // 添加Tab 到TabHost，并绑定Fragment
            Bundle bundle = new Bundle();
            bundle.putString("from", "FragmentTabHost Tab");
            mTabHost.addTab(tabSpec, mFragments[i].getClass(), bundle);
        }


        //去掉Tab 之间的分割线
        mTabHost.getTabWidget().setDividerDrawable(null);
        //
        mTabHost.setCurrentTab(0);
    }


    @Override
    public void onTabChanged(String tabId) {
        updateTabState();

    }

    /**
     * 更新Tab 的状态
     */
    private void updateTabState() {
        TabWidget tabWidget = mTabHost.getTabWidget();
        for (int i = 0; i < tabWidget.getTabCount(); i++) {
            View view = tabWidget.getChildTabViewAt(i);
            ImageView tabIcon = (ImageView) view.findViewById(R.id.tab_content_image);
            TextView tabText = (TextView) view.findViewById(R.id.tab_content_text);
            if (i == mTabHost.getCurrentTab()) {
                tabIcon.setImageResource(TabGenerator.mTabResPressed[i]);
                tabText.setTextColor(getResources().getColor(android.R.color.black));
            } else {
                tabIcon.setImageResource(TabGenerator.mTabRes[i]);
                tabText.setTextColor(getResources().getColor(android.R.color.darker_gray));
            }
        }
    }
}
