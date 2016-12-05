package com.hhzmy.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hhzmy.main.R;
import com.hhzmy.third.ZhuCeActivity;
import com.hhzmy.tools.ClassPathResource;
import com.hhzmy.tools.PhoneTextWatcher;


public class MineFragment extends Fragment{

    private ImageView iv_back;
    private EditText Zhao;
    private EditText passW;
    private Button my_bt_login;
    private EditText YZM;
    private String name;
    private String password;
    private String yzm;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mine, container, false);

        iv_back = (ImageView) view.findViewById(R.id.iv_back);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //账号
        Zhao = (EditText) view.findViewById(R.id.input_ZHao);
        name = Zhao.getText().toString().trim();
        //空格
        Zhao.addTextChangedListener(new PhoneTextWatcher(Zhao));

            //密码
        passW = (EditText) view.findViewById(R.id.input_passW);
        password = passW.getText().toString().trim();

        /*if (name.length() <= 0 && password.length() <= 0) {
            Toast.makeText(getActivity(), "账号或密码为空", Toast.LENGTH_SHORT).show();
        } else if (name.length() <= 0) {
            Toast.makeText(getActivity(), "账号不能为空", Toast.LENGTH_SHORT).show();
        } else if (password.length() <= 0) {
            Toast.makeText(getActivity(), "密码不能为空", Toast.LENGTH_SHORT).show();
        }*/ /*else if (name != null && password != null) {

            // 获取存储的数据
            SharedPreferences sp = getSharedPreferences("config", MODE_PRIVATE);
            String savename = sp.getString("username", "");
            int savepassword = sp.getInt("password", 0);

            //判断用户名与密码是否和保存的数据一致，进行提醒或者登录
            if (savename.equals(name) && savepassword == Integer.parseInt(password)) {
                //实现界面的跳转
                Intent intent = new Intent();
                startActivity(intent);
                //关闭当前界面
                //finish();
            } else {
                Toast.makeText(getActivity(), "账号或密码错误", Toast.LENGTH_SHORT).show();
            }

        }*/
            //验证码
            YZM = (EditText) view.findViewById(R.id.input_YanZM);
            yzm = YZM.getText().toString().trim();
            //登录
            my_bt_login = (Button) view.findViewById(R.id.my_bt_login);
            my_bt_login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //验证账号密码
                    if (name.equals("")) {
                        Toast.makeText(getActivity(), "请输入账号", Toast.LENGTH_SHORT).show();
                    } else {
                        if (name.length() > 1 && name.length() < 11) {
                            Toast.makeText(getActivity(), "请输入正确的账号长度", Toast.LENGTH_SHORT).show();
                        } else if (name.length() == 11
                                && ClassPathResource.isChinaPhoneLegal(name) != true) {
                            Toast.makeText(getActivity(), "请输入正确的账号", Toast.LENGTH_SHORT).show();
                        } else if (name.length() == 11
                                && ClassPathResource.isChinaPhoneLegal(name) == true || name != "" && TextUtils.isEmpty(password)) {
                            Toast.makeText(getActivity(), "账号正确,请输入密码", Toast.LENGTH_SHORT).show();
                        } else{
                            // 进行网咯情求 判断登录
                            Toast.makeText(getActivity(), "登录成功", Toast.LENGTH_SHORT).show();
                        }
                    }

                }
            });
        //忘记密码
        TextView my_buy_nopassword= (TextView) view.findViewById(R.id.my_buy_nopassword);
        my_buy_nopassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        //
        Button ZC= (Button) view.findViewById(R.id.ZC);
        ZC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(getActivity(), ZhuCeActivity.class));
            }
        });


        CheckBox cb = (CheckBox) view.findViewById(R.id.iv);
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    //如果选中，显示密码
                    passW.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    //否则隐藏密码
                    passW.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });

        return view;
        }



}
