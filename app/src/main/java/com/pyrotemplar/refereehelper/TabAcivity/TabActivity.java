package com.pyrotemplar.refereehelper.TabAcivity;

import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.pyrotemplar.refereehelper.Adapters.PageAdapter;
import com.pyrotemplar.refereehelper.R;
import com.pyrotemplar.refereehelper.Utils.NonSwipeViewPager;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by Manuel Montes de Oca on 4/21/2017.
 */

public class TabActivity extends AppCompatActivity implements TabActivityContract.View {

    @BindView(R.id.tabLayout)
    TabLayout mTabLayout;
    @BindView(R.id.pager)
    NonSwipeViewPager mPager;
    @BindView(R.id.adView)
    AdView adView;

    private PageAdapter mPageAdapter;
    private TabActivityPresenter presenter;
    private long back_pressed;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_activity_layout);
        ButterKnife.bind(this);

        presenter = new TabActivityPresenter(this);

        mPageAdapter = new PageAdapter(getSupportFragmentManager());

        mPager.setAdapter(mPageAdapter);
        //disable the scrolling of views.
        mPager.setPagingEnabled(false);
        //start app on clicker tab(2)
      //  mPager.setCurrentItem(2);
        mPager.setOffscreenPageLimit(2);
        mTabLayout.setupWithViewPager(mPager);
        presenter.setTabIcons();

        AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).
                addTestDevice(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID)).build();

        // change request to this line for publishing.
        //AdRequest adRequest = new AdRequest.Builder().build();

        adView.loadAd(adRequest);


    }

    @Override
    public void showTabIcons(int location, int tabIconId, String IconText) {

        // Populates Tabs with icons
         //  ImageView imageView = new ImageView(this);
         //  imageView.setImageResource(tabIconId);
        //   imageView.setPadding(0,10,0,20);

          //mTabLayout.getTabAt(location).setCustomView(imageView);

        mTabLayout.getTabAt(location).setIcon(tabIconId);
        mTabLayout.getTabAt(location).setText(IconText);
    }

    @Override
    public void onBackPressed() {
        if (back_pressed + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
        } else {
            Toast.makeText(getBaseContext(),
                    "Press once again to exit!", Toast.LENGTH_SHORT)
                    .show();
        }
        back_pressed = System.currentTimeMillis();
    }
}

