package com.kamiture.kamui.haikupost;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import static android.support.v7.widget.RecyclerView.*;

public class PostAdapter extends ArrayAdapter<Post> {
    List<Post> items;

    public PostAdapter(Context context, int resource, List<Post> objects) {
        super(context, resource, objects);
        items = objects;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Post getItem(int position) {
        return items.get(position);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Post item = getItem(position);
        final ViewHolder viewHolder;
        if (convertView != null) {
            viewHolder = (ViewHolder) convertView.getTag();
        } else {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listview_item_post, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.kamiku = (TextView) convertView.findViewById(R.id.kamiku);
            viewHolder.nakaku = (TextView) convertView.findViewById(R.id.nakaku);
            viewHolder.simoku = (TextView) convertView.findViewById(R.id.simoku);
            convertView.setTag(viewHolder);
        }
        viewHolder.kamiku.setText(item.getKamiku());
        viewHolder.nakaku.setText(item.getNakaku());
        viewHolder.simoku.setText(item.getSimoku());
        return convertView;
    }

    static class ViewHolder {
        TextView kamiku;
        TextView nakaku;
        TextView simoku;
    }

}

