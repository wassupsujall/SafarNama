package com.example.safarnama;

import android.content.Context;
import android.content.Intent;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class ViewHolder2 extends RecyclerView.Adapter<ViewHolder2.MyViewHolder> {
    //create a list to pass our Model class
    List<Model2> modelList1;
    Context context;
    public ViewHolder2(List<Model2> modelList1, Context context) {
        this.modelList1 = modelList1;
        this.context = context;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflate our custom view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_custom1,parent,false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //bind all custom views by its position
        //to get the positions we call our Model class
        final Model2 model = modelList1.get(position);
        holder.name.setText(model.getName());
        holder.tag.setText(model.getTag());
        holder.tag1.setText(model.getTag1());
        holder.tag2.setText(model.getTag2());
        holder.tag3.setText(model.getTag3());
        holder.tag4.setText(model.getTag4());
        holder.tag5.setText(model.getTag5());
        holder.imageView.setImageDrawable(context.getResources().getDrawable(model.getImage()));
        //click listener
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Detail3Activity.class);
                intent.putExtra("image",model.getImage());
                intent.putExtra("name",model.getName());
                intent.putExtra("tag",model.getTag());
                intent.putExtra("tag2",model.getTag2());
                intent.putExtra("tag1",model.getTag1());
                intent.putExtra("tag3",model.getTag3());
                intent.putExtra("tag4",model.getTag4());
                intent.putExtra("tag5",model.getTag5());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return modelList1.size();
    }
    //all the custom view will be hold here or initialize here inside MyViewHolder
    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name, tag,tag1,tag2,tag3,tag4,tag5;
        RelativeLayout relativeLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            tag = itemView.findViewById(R.id.tag);
            tag1 = itemView.findViewById(R.id.tag1);
            tag2 = itemView.findViewById(R.id.tag2);
            tag3 = itemView.findViewById(R.id.tag3);
            tag4=itemView.findViewById(R.id.tag4);
            tag5=itemView.findViewById(R.id.tag5);
            tag5.setLinksClickable(true);
            Linkify.addLinks(tag5, Linkify.WEB_URLS);
            tag5.setMovementMethod(LinkMovementMethod.getInstance());

            relativeLayout = itemView.findViewById(R.id.item);
        }
    }
}