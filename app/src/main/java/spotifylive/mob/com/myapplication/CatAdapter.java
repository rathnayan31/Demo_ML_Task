package spotifylive.mob.com.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CatAdapter extends RecyclerView.Adapter<CatAdapter.MyViewHolder> {

    public CatAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CatAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CatAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageCategory;

        public MyViewHolder(View itemView) {
            super(itemView);

            imageCategory =  itemView.findViewById(R.id.imageCategory);
        }
    }
}


