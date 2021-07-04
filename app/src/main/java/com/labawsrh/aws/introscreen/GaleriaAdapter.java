package com.labawsrh.aws.introscreen;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GaleriaAdapter  extends BaseAdapter {

    private Context mContext;
    public int [] imagenesArray = {
            R.drawable.grid1,
            R.drawable.grid2,
            R.drawable.grid3,
            R.drawable.grid4,
            R.drawable.grid5,
            R.drawable.grid6,
            R.drawable.grid7,
            R.drawable.grid8,
            R.drawable.grid9,
            R.drawable.grid10,
            R.drawable.grid11,
            R.drawable.grid12,
            R.drawable.grid13,
            R.drawable.grid14,
            R.drawable.grid15,
    };

    public GaleriaAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imagenesArray.length;
    }

    @Override
    public Object getItem(int i) {
        return imagenesArray[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(imagenesArray[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(340,350));


        return imageView;
    }
}
