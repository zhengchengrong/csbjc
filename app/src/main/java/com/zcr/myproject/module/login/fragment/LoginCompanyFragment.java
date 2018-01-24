package com.zcr.myproject.module.login.fragment;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.coorchice.library.SuperTextView;
import com.zcr.myproject.R;
import com.zcr.myproject.module.base.BaseFragment;
import com.zcr.myproject.module.login.LoginActicity;
import com.zcr.myproject.widget.CodeView;
import com.zcr.myproject.widget.SuperEditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by llz on 2017/11/9.
 */

public class LoginCompanyFragment extends BaseFragment implements View.OnClickListener {


    @BindView(R.id.ed_account)
    SuperEditText mEdAccount;
    @BindView(R.id.ed_user)
    SuperEditText mEdUser;
    @BindView(R.id.ed_pass)
    SuperEditText mEdPass;
    @BindView(R.id.ed_key)
    SuperEditText mEdKey;
    @BindView(R.id.iv_code)
    ImageView mIvCode;
    @BindView(R.id.tv_login)
    SuperTextView mTvLogin;
    Unbinder unbinder;
    private CodeView mCodeView;

    @Override
    public void showToast(String msg) {

    }

    @Override
    protected void initInjector() {

    }

    @Override
    protected void initViews() {
        mTvLogin.setOnClickListener(this);
        mIvCode.setOnClickListener(this);
        mCodeView = CodeView.getInstance();
        Bitmap bitmap = mCodeView.createBitmap();
        mIvCode.setImageBitmap(bitmap);
    }

    @Override
    protected void updateViews(boolean isRefresh) {

    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_logincompany;
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
                if (!mEdKey.getText().toString().equals(mCodeView.getCode())) {
                    ((LoginActicity) getActivity()).showToast("验证码有误");
                }
                break;
            case R.id.iv_code:
                mIvCode.setImageBitmap(mCodeView.createBitmap());
                break;
        }
    }
}
