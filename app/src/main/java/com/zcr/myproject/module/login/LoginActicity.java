package com.zcr.myproject.module.login;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.flyco.tablayout.SegmentTabLayout;
import com.zcr.myproject.R;
import com.zcr.myproject.module.base.BaseActivity;
import com.zcr.myproject.module.login.fragment.LoginCompanyFragment;
import com.zcr.myproject.module.login.fragment.LoginUserFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActicity extends BaseActivity {
    @BindView(R.id.segmentTabLayout)
    SegmentTabLayout segmentTabLayout;
    @BindView(R.id.tv_title)
    TextView mTvTitle;
    @BindView(R.id.other)
    TextView mOther;
    @BindView(R.id.tv_back)
    TextView mTvBack;
    @BindView(R.id.fl_content)
    FrameLayout mFlContent;
    @BindView(R.id.rv_content)
    RecyclerView mRvContent;
    private ArrayList<Fragment> mFragments = new ArrayList<>();
    private String[] mTitles = {"企业账号登录", "认证手机登录"};

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_login_acticity;
    }

    @Override
    protected void initInjector() {

    }

    @Override
    protected void initViews() {
        mTvTitle.setText("登陆");
        LoginCompanyFragment lcf = new LoginCompanyFragment();
        LoginUserFragment luf = new LoginUserFragment();
        mFragments.add(lcf);
        mFragments.add(luf);
        segmentTabLayout.setTabData(mTitles, this, R.id.fl_content, mFragments);
    }

    @Override
    protected void updateViews(boolean isRefresh) {

    }


    @Override
    public void showEmpty() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
