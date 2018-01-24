package com.zcr.myproject.module.login.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.coorchice.library.SuperTextView;
import com.zcr.myproject.R;
import com.zcr.myproject.module.base.BaseFragment;
import com.zcr.myproject.module.mian.MainActivity;
import com.zcr.myproject.widget.SuperEditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by llz on 2017/11/9.
 */

public class LoginUserFragment extends BaseFragment implements View.OnClickListener {
    @BindView(R.id.ed_user)
    SuperEditText mEdUser;
    @BindView(R.id.ed_pass)
    SuperEditText mEdPass;
    @BindView(R.id.tv_login)
    SuperTextView mTvLogin;
    Unbinder unbinder;

    @Override
    protected void initInjector() {

    }

    @Override
    protected void initViews() {
        mTvLogin.setOnClickListener(this);
    }

    @Override
    protected void updateViews(boolean isRefresh) {

    }


    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_loginuser;
    }

    @Override
    public void showToast(String msg) {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_login:
                Intent intent = new Intent(mActivity,MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
