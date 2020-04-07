package com.example.get_started_with_retrofit_2_http_client.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.get_started_with_retrofit_2_http_client.R;
import com.example.get_started_with_retrofit_2_http_client.data.model.Item;

import java.util.List;

public class AnswersAdapter extends RecyclerView.Adapter<AnswersAdapter.ViewHolder> {

    private List<Item> mItems;
    private Context mContext;
    private PostItemListener mItemListener;

    public AnswersAdapter(Context context, List<Item> posts, PostItemListener itemListener) {
        this.mItems = posts;
        this.mContext = context;
        this.mItemListener = itemListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View postView = inflater.inflate(R.layout.support_simple_spinner_dropdown_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(postView, this.mItemListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = mItems.get(position);
        TextView textView = holder.title;
        textView.setText(item.getOwner().getDisplayName());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView title;

        PostItemListener mPostItemListener;

        public ViewHolder(@NonNull View itemView, PostItemListener postItemListener) {
            super(itemView);
            this.title = itemView.findViewById(android.R.id.text1);
            this.mPostItemListener = postItemListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }

    }

    public void updateAnswers(List<Item> items){
        mItems = items;
        notifyDataSetChanged();
    }

    private Item getItem(int adapterPosition){
        return mItems.get(adapterPosition);
    }

    public interface PostItemListener {
        void onPostClick(long id);
    }
}
