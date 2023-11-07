package com.android.personal_portfolio.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.personal_portfolio.R;

import java.util.ArrayList;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ViewHolder> {
    private Context context;

    // create an array list to store data for the views.
    ArrayList<Projects> projects;

    public ProjectsAdapter(Context context, ArrayList<Projects> projects) {
        this.context = context;
        this.projects = projects;
    }

    @NonNull
    @Override
    public ProjectsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.recycler_items, parent, false);
        return new ProjectsAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectsAdapter.ViewHolder holder, int position) {
        // create an object of the class here and get the positon of items

        Projects projects1 = projects.get(position);
        holder.txtTitle.setText(projects1.projectTitle);
        holder.txtSubTitle.setText(projects1.projectSub_title);
        holder.txtDesc.setText(projects1.projectDescription);
        holder.viewersCount.setText(projects1.viewersCount);
        holder.viewersTotal.setText(projects1.totalViewers);
        holder.viewsIcon.setImageResource(projects1.viewersIcon);
        holder.projectImage.setImageResource(projects1.projectImage);
        
    }

    @Override
    public int getItemCount() {
        return projects.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle, txtSubTitle,txtDesc, viewersCount, viewersTotal;
        Button viewProjectBtn;
        ImageView viewsIcon, projectImage ;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtTitle = itemView.findViewById(R.id.project_title);
            txtSubTitle = (itemView).findViewById(R.id.projectSub_title);
            txtDesc = (itemView).findViewById(R.id.project_description);
            viewProjectBtn = (itemView).findViewById(R.id.view_project);
            viewersCount = (itemView).findViewById(R.id.viewersCount);
            viewersTotal = (itemView).findViewById(R.id.viewersTotal);
            viewsIcon = (itemView).findViewById(R.id.viewsIcon);
            projectImage = (itemView).findViewById(R.id.project_image);
        }
    }
}
