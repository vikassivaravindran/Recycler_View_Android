package com.example.sample_recycler_view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {

    ArrayList<Student> data;

    public StudentAdapter(ArrayList<Student> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View recycledView = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.email_item, viewGroup, false);

        ViewHolder view = new ViewHolder(recycledView);
        return view;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        Student s = data.get(i);
        viewHolder.email_sender.setText(s.Sender);
        viewHolder.email_subject.setText(s.Subject);
        viewHolder.email_content.setText(s.Summary);
        viewHolder.studentDetails = s;

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView email_sender, email_subject, email_content;
        Student studentDetails;

        public ViewHolder(View itemView){
            super(itemView);
            email_sender = itemView.findViewById(R.id.email_name);
            email_subject = itemView.findViewById(R.id.email_subject);
            email_content = itemView.findViewById(R.id.email_content);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("Clicked on:",studentDetails.Sender+" "+studentDetails.Subject+studentDetails.Summary);
                }
            });

        }


    }


}
