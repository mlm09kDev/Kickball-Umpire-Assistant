package com.pyrotemplar.refereehelper.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pyrotemplar.refereehelper.R;

/**
 * Created by Manuel Montes de Oca on 4/25/2017.
 */

public class GamesHistoryFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.test, null);

    }
}
