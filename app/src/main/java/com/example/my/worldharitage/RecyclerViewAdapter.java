package com.example.my.worldharitage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
Context mContext;
List<Contact> mData;
Dialog myDialog;

    public RecyclerViewAdapter(Context mContext, List<Contact> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_contact,parent,false);
        final MyViewHolder viewHolder = new MyViewHolder(v);

        //Dialog init
        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.dialog_content);

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        viewHolder.row_linearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dialog_name = myDialog.findViewById(R.id.dialog_name_id);
                TextView dialog_phone = myDialog.findViewById(R.id.dialog_phone_id);
                ImageView dialog_img = myDialog.findViewById(R.id.dialog_img);

                dialog_name.setText(mData.get(viewHolder.getAdapterPosition()).getName());
                dialog_phone.setText(mData.get(viewHolder.getAdapterPosition()).getPhone());
                dialog_img.setImageResource(mData.get(viewHolder.getAdapterPosition()).getPhoto());

                Toast.makeText(mContext,"Toast Click "+String.valueOf(viewHolder.getAdapterPosition()),Toast.LENGTH_SHORT).show();
                myDialog.show();
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
       holder.tv_name.setText(mData.get(position).getName());
       holder.tv_phone.setText(mData.get(position).getPhone());
      holder.img.setImageResource(mData.get(position).getPhoto());


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_name;
        private TextView tv_phone;
        private ImageView img;
        LinearLayout row_linearlayout;
        public MyViewHolder(View itemView) {

            super(itemView);
            tv_name = itemView.findViewById(R.id.contact_name);
            tv_phone = itemView.findViewById(R.id.phone_contact);
            img = itemView.findViewById(R.id.image_contact);
            row_linearlayout = itemView.findViewById(R.id.contact_item);
        }
    }
}
