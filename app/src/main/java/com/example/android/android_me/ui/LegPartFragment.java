package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;

import java.util.List;

/***
 *
 * @author TUON BONDOL on 8/14/17.
 *
 */

public class LegPartFragment extends Fragment {

    private List<Integer> mImageIds;
    private int mListIndex;

    public LegPartFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the Android-Me fragment layout
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        // Get a reference to the ImageView in the fragment layout
        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);

        // Set the image to the first in our list of head images
        imageView.setImageResource(mImageIds.get(mListIndex));

        // TODO (3) If a list of image ids exists, set the image resource to the correct item in that list
        // Otherwise, create a Log statement that indicates that the list was not found

        // Return the rootView
        return rootView;
    }

    public void setmImageIds(List<Integer> list){
        mImageIds = list;
    }

    public void setmListIndex(int selectedId){
        mListIndex = selectedId;
    }

}
