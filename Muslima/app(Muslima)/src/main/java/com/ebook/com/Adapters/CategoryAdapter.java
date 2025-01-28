package com.ebook.com.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ebook.com.Models.CategoryMode;
import com.ebook.com.ShowPdfActivity;
import com.ebook.com.databinding.ItemCategoryBinding;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    Context context;
    ArrayList<CategoryMode>list;

    public CategoryAdapter(Context context, ArrayList<CategoryMode> list){
        this.context = context;
        this.list = list;
    }

    // Constructor, dataset, or other necessary members can be added here.

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate your item layout here.
        View view = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.simple_list_item_1, parent, false); // Replace with your layout
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Bind your data to the views here.
        CategoryMode mode = list.get(position);
        holder.binding.CategoryName.setText(mode.getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ShowPdfActivity.class);
                intent.putExtra("title", mode.getTitle());
                intent.putExtra("pos", position);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        // Return the size of your dataset.
        return list.size(); // Replace with the actual dataset size.
    }

    // ViewHolder class
    public static class ViewHolder extends RecyclerView.ViewHolder {

        ItemCategoryBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            binding = ItemCategoryBinding.bind(itemView);
            // Initialize your views here (if any).
        }
    }
}
