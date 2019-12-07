package com.shomit.blood.adapters;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shomit.blood.R;
import com.shomit.blood.viewmodels.Donor;

import java.util.List;

/***
 Project: BloodBank
 Date: 05/19
 Developer: shomit
 Email: shomitcse@outlook.com
 ***/

public class Donorsearch extends RecyclerView.Adapter<Donorsearch.PostHolder> {


    private List<Donor> postLists;

    public class PostHolder extends RecyclerView.ViewHolder
    {
        TextView Name, Address, contact, posted, totaldonate;

        public PostHolder(@NonNull View itemView) {
            super(itemView);

            Name = itemView.findViewById(R.id.donorName);
            contact = itemView.findViewById(R.id.donorContact);
            totaldonate = itemView.findViewById(R.id.totaldonate);
            Address = itemView.findViewById(R.id.donorAddress);
            posted = itemView.findViewById(R.id.lastdonate);

        }
    }

    public Donorsearch(List<Donor> postLists)
    {
        this.postLists = postLists;
    }

    @Override
    public PostHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View listitem = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.donor_search_result_item, viewGroup, false);

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
        Donor donor = postLists.get(i);
        postHolder.Name.setText("Name: "+ donor.getName());
        postHolder.contact.setText(donor.getContact());
        postHolder.Address.setText("Address: "+ donor.getAddress());
        postHolder.totaldonate.setText("Total Donation: "+ donor.getTotalDonate()+" times");
        postHolder.posted.setText("Last Donation: "+ donor.getLastDonate());


    }

    @Override
    public int getItemCount() {
        return postLists.size();
    }
}
