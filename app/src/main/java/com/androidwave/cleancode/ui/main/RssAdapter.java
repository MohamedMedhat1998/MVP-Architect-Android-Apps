package com.androidwave.cleancode.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.androidwave.cleancode.R;
import com.androidwave.cleancode.data.network.pojo.SimplifiedFeedItem;
import com.androidwave.cleancode.ui.base.BaseViewHolder;
import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created on : Feb 11, 2019
 * Author     : AndroidWave
 */
public class RssAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private static final String TAG = "RssAdapter";
    public static final int VIEW_TYPE_EMPTY = 0;
    public static final int VIEW_TYPE_NORMAL = 1;

    private Callback mCallback;
    private OnItemClickedListener onItemClickedListener;
    private List<SimplifiedFeedItem> mFeedItems;


    public RssAdapter(List<SimplifiedFeedItem> countryList) {
        mFeedItems = countryList;
    }

    public void setCallback(Callback callback) {
        mCallback = callback;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.onBind(position);
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        switch (viewType) {
            case VIEW_TYPE_NORMAL:
                return new ViewHolder(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false));
            case VIEW_TYPE_EMPTY:
            default:
                return new EmptyViewHolder(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.item_empty_view, parent, false));
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (mFeedItems != null && mFeedItems.size() > 0) {
            return VIEW_TYPE_NORMAL;
        } else {
            return VIEW_TYPE_EMPTY;
        }
    }

    @Override
    public int getItemCount() {
        return mFeedItems.size();
    }

    public void setData(List<SimplifiedFeedItem> countryList) {
        mFeedItems = countryList;
        notifyDataSetChanged();
    }

    public void setOnItemClickedListener(OnItemClickedListener onItemClickedListener) {
        this.onItemClickedListener = onItemClickedListener;
    }

    public interface Callback {
        void onEmptyViewRetryClick();
    }

    public class ViewHolder extends BaseViewHolder {

        @BindView(R.id.ivFlag)
        ImageView ivFlag;
        @BindView(R.id.tvCountryName)
        TextView tvCountryName;
        @BindView(R.id.tvTotalCases)
        TextView tvTotalCases;
        @BindView(R.id.tvDeath)
        TextView tvDeath;
        @BindView(R.id.tvRecovered)
        TextView tvRecovered;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        protected void clear() {

        }


        public void onBind(int position) {
            super.onBind(position);

            SimplifiedFeedItem feedItem = mFeedItems.get(position);

            tvCountryName.setText(feedItem.getCountryName());
            tvTotalCases.setText("" + feedItem.getTotalCases());
            tvDeath.setText("" + feedItem.getDeaths());
            tvRecovered.setText("" + feedItem.getRecovered());
            Glide.with(itemView.getContext())
                    .load(feedItem.getFlagLink())
                    .into(ivFlag);

            itemView.setOnClickListener(view -> {
                onItemClickedListener.onItemClicked(feedItem);
            });
        }
    }

    public class EmptyViewHolder extends BaseViewHolder {

        TextView messageTextView;
        TextView buttonRetry;

        EmptyViewHolder(View itemView) {
            super(itemView);
            buttonRetry = itemView.findViewById(R.id.buttonRetry);
            buttonRetry.setOnClickListener(v -> mCallback.onEmptyViewRetryClick());
        }

        @Override
        protected void clear() {

        }

    }
}
