package com.example.shihan.seeing;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.andtinder.model.*;
import com.andtinder.view.*;

/**
 * Created by shihan on 15/9/20.
 */
public class DiscoverFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        Resources r = getResources();
        View view = inflater.inflate(R.layout.discover_view, container, false);
        CardContainer mCardContainer = (CardContainer) view.findViewById(R.id.card_container_view);
        CardModel card = new CardModel("Henry", "Description goes here", r.getDrawable(R.drawable.img1));
        SimpleCardStackAdapter adapter = new SimpleCardStackAdapter(this.getActivity());
        card.setOnClickListener(new CardModel.OnClickListener() {
            @Override
            public void OnClickListener() {
                Toast.makeText(getActivity(), "You clicked photo",
                        Toast.LENGTH_SHORT).show();
            }
        });
        adapter.add(card);
        adapter.add(card);
        adapter.add(card);
        mCardContainer.setAdapter(adapter);
        return view;
    }
}
