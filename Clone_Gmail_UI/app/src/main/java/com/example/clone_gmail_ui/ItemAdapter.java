package com.example.clone_gmail_ui;

import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;
import java.util.Random;

public class ItemAdapter extends BaseAdapter {

    List<ItemModel> items;


    public ItemAdapter(List<ItemModel> items) {
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

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gmail_layout, null);

            viewHolder = new ViewHolder();
            viewHolder.imageAvatar= view.findViewById(R.id.image_avatar);
            viewHolder.textTitle = view.findViewById(R.id.text_title);
            viewHolder.textContent = view.findViewById(R.id.text_content);
            viewHolder.textSubject = view.findViewById(R.id.text_chude);
            viewHolder.textTime= view.findViewById(R.id.text_time);
            viewHolder.imageStart= view.findViewById(R.id.image_star);


            view.setTag(viewHolder);
        } else
            viewHolder = (ViewHolder) view.getTag();

        ItemModel item= items.get(i);
//        Random rnd = new Random();
//        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        viewHolder.imageAvatar.setBackgroundResource(item.getAvatarResource());
        viewHolder.imageAvatar.setText(Character.toString(item.getTitle().charAt(0)));
//        viewHolder.imageAvatar.setBackgroundColor(color);
        viewHolder.textTitle.setText(item.getTitle());
        viewHolder.textContent.setText(item.getContent());
        viewHolder.textSubject.setText(item.getSubject());
        viewHolder.textTime.setText(item.getTime());

        viewHolder.imageStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                item.setToggle(!item.isToggle());
                if(!item.isToggle()) {
                    viewHolder.imageStart.setImageResource(R.drawable.ic_baseline_star_outline_24);
                    Log.v("TAG", getItemId(i) + " is selected");
                } else {
                    viewHolder.imageStart.setImageResource(R.drawable.ic_baseline_star_24);
                    Log.v("TAG", getItemId(i) + " is selected");
                }

                notifyDataSetChanged();
            }
        });




        return view;
    }

    private class ViewHolder{
        public Button imageAvatar;
        public TextView textTitle;
        public TextView textContent;
        public TextView textSubject;
        public TextView textTime;
        public ImageView imageStart;


    }
}
