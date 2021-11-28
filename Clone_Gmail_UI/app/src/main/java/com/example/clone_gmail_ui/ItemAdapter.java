package com.example.clone_gmail_ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

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


            view.setTag(viewHolder);
        } else
            viewHolder = (ViewHolder) view.getTag();

        ItemModel item= items.get(i);

        viewHolder.imageAvatar.setImageResource(item.getAvatarResource());
        viewHolder.textTitle.setText(item.getTitle());
        viewHolder.textContent.setText(item.getContent());
        viewHolder.textSubject.setText(item.getSubject());
        viewHolder.textTime.setText(item.getTime());





        return view;
    }

    private class ViewHolder{
        public ImageView imageAvatar;
        public TextView textTitle;
        public TextView textContent;
        public TextView textSubject;
        public TextView textTime;
    }
}
