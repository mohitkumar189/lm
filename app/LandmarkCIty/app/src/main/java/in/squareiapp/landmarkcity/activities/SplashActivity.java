package in.squareiapp.landmarkcity.activities;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.view.View;

import in.squareiapp.landmarkcity.R;
import in.squareiapp.landmarkcity.activities.useraccesspackage.LoginActivity;
import in.squareiapp.landmarkcity.interfaces.AppConstants;
import in.squareiapp.landmarkcity.utils.SharedPrefUtils;

public class SplashActivity extends BaseActivity {
    private final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hideStatusBar();
        setContentView(R.layout.activity_splash);
        startMyACtivtiy();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                System.out.println(TAG);

                boolean loginStatus = SharedPrefUtils.getInstance(context).getBoolean(SharedPrefUtils.LOGIN_STATUS);
                if (loginStatus) {
                    startNewActivity(currentActivity, UserDashboardActivity.class);
                } else {
                    startNewActivity(currentActivity, LoginActivity.class);
                }

            }
        }, AppConstants.APP_SPLASH_TIME);
    }

    @Override
    protected void initContext() {
        context = SplashActivity.this;
        currentActivity = SplashActivity.this;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initListners() {

    }

    @Override
    protected void initToolbar() {

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }

    @Override
    public void onClick(View v) {

    }

}
