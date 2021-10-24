package com.Mindhub.android.ejemplofragmentdinamicos;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private List<UserModel> userModelList;

    public UserAdapter(List<UserModel> userModelList) {
        this.userModelList = userModelList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_list_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String name = userModelList.get(position).getName();
        holder.name.setText(name);

        holder.itemImage.setImageResource(validateItem(name));
    }

    @Override
    public int getItemCount() {
        return userModelList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private ImageView itemImage;

        public ViewHolder(View v) {
            super(v);
            name = (TextView) v.findViewById(R.id.textUserName);
            itemImage = (ImageView) v.findViewById(R.id.itemImage);
        }
    }

    public int validateItem(String name) {
        try {
            Integer.parseInt(name);
            return R.drawable.ic_person_outline;
        } catch (NumberFormatException nfe) {
            return R.drawable.ic_person;
        }


    }


}

