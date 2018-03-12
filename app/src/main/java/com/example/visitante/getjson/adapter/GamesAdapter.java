package com.example.visitante.getjson.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.visitante.getjson.R;

import java.util.List;

public class GamesAdapter extends RecyclerView.Adapter<GamesAdapter.ViewHolder> {
    private List<Fixture> data;
    public GamesAdapter(List<Fixture> data) { this.data = data; }

    @Override
    public GamesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext().inflate(R.layout.row_user,parent,false));
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvt1.setText(data.get(position).getHomeTeamName());
        holder.tvt2.setText(data.get(position).getAwayTeamName());
        holder.tvp.setText(data.get(position).getStatus());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<Fixture> data) { this.data = data; }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvt1;
        TextView tvt2;
        TextView tvp;
        public ViewHolder(View itemView) {
            super(itemView);
            tvt1 = itemView.findViewById(R.id.tvTeam1);
            tvt2 = itemView.findViewById(R.id.tvLastTeam2);
            tvp = itemView.findViewById(R.id.tvPassed);
        }
    }
}
