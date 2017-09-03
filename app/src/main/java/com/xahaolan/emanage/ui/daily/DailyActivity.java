package com.xahaolan.emanage.ui.daily;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;

import com.xahaolan.emanage.R;
import com.xahaolan.emanage.base.BaseActivity;

/**
 * Created by helinjie on 2017/9/3.     日报
 */

public class DailyActivity extends BaseActivity {
    private static final String TAG = DailyActivity.class.getSimpleName();
    private SwipeRefreshLayout swipeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setcontentLayout(R.layout.activity_daily);
    }

    @Override
    public void setTitleAttribute() {
        setTitle(0, R.color.titleBg, R.drawable.ic_launcher_round, "", R.color.baseTextMain, "日报", R.color.baseTextMain, "", R.color.baseTextMain, 0);
    }

    @Override
    public void initView() {
        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        swipeLayout.setEnabled(false); //禁止下拉刷新
        setSwipRefresh(swipeLayout, null);
    }

    @Override
    public void initData() {

    }
}
