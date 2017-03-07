package nyest.labshareelement;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by nyest on 3/7/2017 AD.
 */

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {

    private Context context;
    private List<ImageItem> imageItemList;

    public ImageAdapter(Context context, List<ImageItem> imageItemList) {
        this.context = context;
        this.imageItemList = imageItemList;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ImageViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.view_image, parent, false));
    }

    @Override
    public void onBindViewHolder(final ImageViewHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, ShareActivity.class);
                intent.putExtra("imageSrc", imageItemList.get(position).getSrc());

                context.startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(
                        (Activity)context, holder.ivItem, "shareView").toBundle()
                );
            }
        });


        holder.ivItem.setImageResource(imageItemList.get(position).getSrc());
    }

    @Override
    public int getItemCount() {
        return imageItemList.size();
    }

    class ImageViewHolder extends RecyclerView.ViewHolder {

        ImageView ivItem;

        public ImageViewHolder(View itemView) {
            super(itemView);
            ivItem = (ImageView) itemView.findViewById(R.id.ivItem);
        }

    }

}
