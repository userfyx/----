package fileio.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView read;
    private TextView read_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //点击读取
        read = (TextView) findViewById(R.id.read);
        //监听
        read.setOnClickListener(this);
        //读取展示
        read_show = (TextView) findViewById(R.id.read_content_show);

    }


    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.read:

                try {
                    //file文件地址
                    File file=new File("D://file.txt");
                    //读取
                    //BufferedReader br=new BufferedReader(new FileReader(file));
                    //BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(file),"gbk"));

                    //读取本地文件
                    //InputStream inputStream = getResources().getAssets().open("file.txt");

                    BufferedReader br = new BufferedReader(new InputStreamReader(getResources().getAssets().open("file.txt")));

                    StringBuffer sb=new StringBuffer();
                    String reading=null;
                    while((reading=br.readLine())!=null){
                        sb.append(reading);
                    }
                    //展示
                    read_show.setText(sb);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

        }
    }
}
