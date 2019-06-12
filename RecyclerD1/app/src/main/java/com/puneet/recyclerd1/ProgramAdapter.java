package com.puneet.recyclerd1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramAdapter extends RecyclerView.Adapter<ProgramAdapter.ProgramViewHolder> {

    private String[] data;
    //is adapter me apna data bhejunga jo is data ko adapt karke recyler view mw show karega
    ProgramAdapter (String[] data){
        this.data = data;
    }

    //jo view chahiye honge unko create karega aur uske andar view store karega(views will be of type ProgramViewHolder)
    @NonNull
    @Override
    public ProgramViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout,parent,false);
        return new ProgramViewHolder(view);
    }

    //jo view create hue hai unhe data k saath bind kar dega
    @Override
    public void onBindViewHolder(@NonNull ProgramViewHolder holder, int position) {
        String title = data[position];
        holder.text.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }
    public class ProgramViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView text;
        public ProgramViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_view);
            text = itemView.findViewById(R.id.text1);
        }
    }
}
