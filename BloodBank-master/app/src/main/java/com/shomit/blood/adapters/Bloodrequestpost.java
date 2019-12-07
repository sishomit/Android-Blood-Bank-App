package com.shomit.blood.adapters;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shomit.blood.R;
import com.shomit.blood.viewmodels.Profileset;

import java.util.List;

/***
 Project: BloodBank
 Date: 05/19
 Developer: shomit
 Email: shomitcse@outlook.com
 ***/

public class Bloodrequestpost extends RecyclerView.Adapter<Bloodrequestpost.PostHolder> {


    private List<Profileset> postLists;

    public class PostHolder extends RecyclerView.ViewHolder
    {
        TextView Name,details, bloodgroup, Address, contact, posted,quantity;

        public PostHolder(@NonNull View itemView) {
            super(itemView);

            Name = itemView.findViewById(R.id.reqstUser);
            details =itemView.findViewById(R.id.getdetails);
            contact = itemView.findViewById(R.id.targetCN);
            bloodgroup = itemView.findViewById(R.id.targetBG);
            Address = itemView.findViewById(R.id.reqstLocation);
            posted = itemView.findViewById(R.id.posted);
            quantity=itemView.findViewById(R.id.quantity);


        }
    }

    public Bloodrequestpost(List<Profileset> postLists)
    {
        this.postLists = postLists;
    }

    @Override
    public PostHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View listitem = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.request_list_item, viewGroup, false);

        return new PostHolder(listitem);
    }

    @Override
    public void onBindViewHolder(PostHolder postHolder, int i) {

        if(i%2==0)
        {
            postHolder.itemView.setBackgroundColor(Color.parseColor("#C13F31"));
        }
        else
        {
            postHolder.itemView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        Profileset profileset = postLists.get(i);
        postHolder.Name.setText("Posted by: "+ profileset.getName());
        postHolder.Address.setText("From: "+ profileset.getAddress()+", "+ profileset.getDivision());
        postHolder.bloodgroup.setText("Needs "+ profileset.getBloodGroup());
        postHolder.posted.setText("Posted on:"+ profileset.getTime()+", "+ profileset.getDate());
        postHolder.contact.setText(profileset.getContact());
        postHolder.details.setText(profileset.getdetails());
        postHolder.quantity.setText(profileset.getQuantity());

    }
    public void MessageBox(String message)
    {

    }

    @Override
    public int getItemCount() {
        return postLists.size();
    }
}
