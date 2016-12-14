package com.lrucachedome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView photo_wall;
    private int mImageThumbSize;
    private int mImageThumbSpacing;
    private List<String> imageList=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageThumbSize = getResources().getDimensionPixelSize(
                R.dimen.image_thumbnail_size);
        mImageThumbSpacing = getResources().getDimensionPixelSize(
                R.dimen.image_thumbnail_spacing);
        //找控件
        photo_wall = (RecyclerView) findViewById(R.id.photo_wall);
        //布局管理器
        photo_wall.setLayoutManager(new GridLayoutManager(this,4));

        Images images=new Images();
        String[] imageThumbUrls = images.imageThumbUrls;

          for (String image:imageThumbUrls) {
              imageList.add(image);
              //适配器
              MyAdapter myAdapter = new MyAdapter(imageList);
              photo_wall.setAdapter(myAdapter);
        }



    }
    class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

        private List<String> imageList;

        public MyAdapter(List<String> imageList){

            this.imageList = imageList;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                    MainActivity.this).inflate(R.layout.photo_layout, parent,
                    false));
            return holder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            //holder.tv.setText(mDatas.get(position));
            DisplayImageOptions options=new DisplayImageOptions.Builder().build();
            ImageLoader instance = ImageLoader.getInstance();
            //初始值
            instance.init(ImageLoaderConfiguration.createDefault(MainActivity.this));
            instance.displayImage(imageList.get(position),holder.imageview);
        }
        @Override
        public int getItemCount() {
            return imageList.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder{

            ImageView imageview;
            public MyViewHolder(View view){
                super(view);
                imageview=(ImageView) view.findViewById(R.id.photo);
            }
        }
    }



}
