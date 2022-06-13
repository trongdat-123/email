package com.example.email;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import java.util.List;
import java.util.Random;

public class ItemAdapter extends BaseAdapter {

    Context context;
    List<ItemModel> items;

    public ItemAdapter(Context context, List<ItemModel> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public int getRandomColor(){
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null)
        {
            view = LayoutInflater.from(context).inflate(R.layout.custom_layout_item, null);

        }

        TextView viewCircle = view.findViewById(R.id.circleText);
        TextView textCaption = view.findViewById(R.id.text_caption);
        TextView time = view.findViewById(R.id.time);
        TextView content = view.findViewById(R.id.content);

        ItemModel item = items.get(i);

        viewCircle.setText(item.getCaption().substring(0,1).toUpperCase());
        viewCircle.setBackgroundColor(getRandomColor());
        textCaption.setText(item.getCaption());
        time.setText(item.getTime());
        content.setText(item.getContent());

        return view;
    }
}
