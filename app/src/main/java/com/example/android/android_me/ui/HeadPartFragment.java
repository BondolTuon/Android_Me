package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import butterknife.BindView;
import butterknife.ButterKnife;

/***
 *
 * @author TUON BONDOL on 8/14/17.
 *
 */

public class HeadPartFragment extends Fragment {

    @BindView(R.id.ivHead)
    ImageView mHeadImageView;

    public HeadPartFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.from(container.getContext()).inflate(R.layout.fragment_head_part, container, false);

        ButterKnife.bind(this, rootView);

        mHeadImageView.setImageResource(AndroidImageAssets.getHeads().get(0));

        return rootView;
    }
}
