package com.cloudteddy.newsreader;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RelatedAdapter extends RecyclerView.Adapter<RelatedAdapter.Holder> {

    private RelatedItem[] relatedItems = new RelatedItem[] {
            new RelatedItem("Chelsea-Conte tranh James Rodriguez với MU-Mourinho", "Sport | 2 giờ trước", R.drawable.tinlq1),
            new RelatedItem("Arsenal – Bournemouth: Chờ Giroud phá dớp", "Sport | 3 phút trước", R.drawable.tinlq2),
            new RelatedItem("MU - West Ham: Mourinho hưng phấn đón \"Búa tạ\"", "Sport | 2 ngày trước", R.drawable.tinlq3),
    };

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.component_related, parent, false);
        return new Holder(convertView);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.title.setText(relatedItems[position].title);
        holder.tag.setText(relatedItems[position].tag);
        holder.cover.setImageResource(relatedItems[position].cover);
    }

    @Override
    public int getItemCount() {
        return relatedItems.length;
    }

    private static class RelatedItem {

        RelatedItem(String title, String tag, int cover) {
            this.title = title;
            this.tag = tag;
            this.cover = cover;
        }

        String title;
        String tag;
        int cover;
    }

    static class Holder extends RecyclerView.ViewHolder {

        ImageView cover;
        TextView title;
        TextView tag;

        Holder(View itemView) {
            super(itemView);
            cover = (ImageView) itemView.findViewById(R.id.cover);
            title = (TextView) itemView.findViewById(R.id.title);
            tag = (TextView) itemView.findViewById(R.id.tag);
        }
    }
}
