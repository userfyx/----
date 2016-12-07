package com.hhzmy.third;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hhzmy.main.R;

public class ZhuCeActivity extends AppCompatActivity {

    private EditText input_phone;
    private String phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhu_ce);



        ImageView iv_back_amg= (ImageView) findViewById(R.id.iv_back_amg);
        iv_back_amg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        //手机号
        input_phone=(EditText)findViewById(R.id.input_phone);
        //手机号空格
//        input_phone.addTextChangedListener(new PhoneTextWatcher(input_phone));
        //判断手机号
        if (phone ==null){
            Toast.makeText(ZhuCeActivity.this,"手机号不为空",Toast.LENGTH_SHORT).show();
        }else if(phone.length()<=11&& phone.length()>0){
            Toast.makeText(ZhuCeActivity.this,"手机号为11位数",Toast.LENGTH_SHORT).show();
        }

        //手机号取消
        final ImageView phone_cancel= (ImageView) findViewById(R.id.phone_cancel);
        phone_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //清空
                input_phone.getText().clear();
            }
        });
        //选择框
       CheckBox box= (CheckBox) findViewById(R.id.box);
        box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });

        TextView content= (TextView) findViewById(R.id.tv_content);
        String text=content.getText().toString().trim();
        //图文混排
        SpannableStringBuilder ssb=new SpannableStringBuilder(text);
        //加颜色
        ssb.setSpan(new ForegroundColorSpan(Color.parseColor("#f7f006")),2,9,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        //下划线
        ssb.setSpan(new UnderlineSpan(), 2, 9,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //下划线
        ssb.setSpan(new UnderlineSpan(), 11, 15,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //加颜色
        ssb.setSpan(new ForegroundColorSpan(Color.parseColor("#f7f006")),11,15,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        content.setText(ssb);
        //下一步
        Button next= (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                phone = input_phone.getText().toString();
                Toast.makeText(ZhuCeActivity.this,""+phone,Toast.LENGTH_SHORT).show();

                startActivity(new Intent(ZhuCeActivity.this,PassWordActivity.class));

               cn.smssdk.SMSSDK.initSDK(ZhuCeActivity.this, "19a1dfb34900e", "afd2cd716a3c44ea4d16010f8df066f9");
                //发送短信
                cn.smssdk.SMSSDK.getVerificationCode("86",phone);



            }
        });

    }
}
