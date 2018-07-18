package com.example.my.worldharitage;



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View v;
    private RecyclerView  myrecyclerView;
    private List<Contact> listContact;
    public FragmentContact() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.contact_fragment,container,false);
        myrecyclerView = v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),listContact);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerView.setAdapter(recyclerViewAdapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listContact = new ArrayList<>();
        listContact.add(new Contact("Abdur Rahim Nishad","01866331195",R.drawable.p1));
        listContact.add(new Contact("Abdur Rahim Nishad","01866331195",R.drawable.p1));
        listContact.add(new Contact("Abdur Rahim Nishad","01866331195",R.drawable.p1));
        listContact.add(new Contact("Abdur Rahim Nishad","01866331195",R.drawable.p1));
        listContact.add(new Contact("Abdur Rahim Nishad","01866331195",R.drawable.p1));
        listContact.add(new Contact("Abdur Rahim Nishad","01866331195",R.drawable.p1));
        listContact.add(new Contact("Abdur Rahim Nishad","01866331195",R.drawable.p1));
        listContact.add(new Contact("Abdur Rahim Nishad","01866331195",R.drawable.p1));
        listContact.add(new Contact("Abdur Rahim Nishad","01866331195",R.drawable.p1));
        listContact.add(new Contact("Abdur Rahim Nishad","01866331195",R.drawable.p1));
        listContact.add(new Contact("Abdur Rahim Nishad","01866331195",R.drawable.p1));
        listContact.add(new Contact("Abdur Rahim Nishad","01866331195",R.drawable.p1));
    }
}
