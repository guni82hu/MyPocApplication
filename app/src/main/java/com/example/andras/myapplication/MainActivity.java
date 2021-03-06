package com.example.andras.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.example.andras.myapplication.account.AccountActivity;
import com.example.andras.myapplication.architecture.ArchitectureActivity;
import com.example.andras.myapplication.dagger.DaggerPoc;
import com.example.andras.myapplication.dagger2.ui.feature1.list.Feature1ListActivity;
import com.example.andras.myapplication.databinding.DataBindingActivity;
import com.example.andras.myapplication.java8.GuavaOptionalTest;
import com.example.andras.myapplication.java8.RetrolambdaTest;
import com.example.andras.myapplication.kotlin.KotlinSketch;
import com.example.andras.myapplication.material.MaterialTestActivity;
import com.example.andras.myapplication.ormlite.OrmLiteActivity;
import com.example.andras.myapplication.sniplets.ConstraintLayoutPerformanceActivity;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new KotlinSketch().start();
        new RetrolambdaTest();
        new GuavaOptionalTest();
        Log.d(TAG, "Gradle module test: " + getString(hu.andras.mypocapplication.module1.R.string.module_test_label)
                + " and " + getString(R.string.flavor_test_label));
        new DaggerPoc();
//        new RxPoc().testHot();
//        startDaggerTest();
    }

    private void startDaggerTest() {
        startActivity(new Intent(this, Feature1ListActivity.class));
    }

    public void onDragNDropButtonClick(View view) {
        startActivity(new Intent(this, DragDropActivity.class));
    }

    public void onNotificationButtonClick(View view) {
        startActivity(new Intent(this, NotificationActivity.class));
    }

    public void onActionBarButtonClick(View view) {
        startActivity(new Intent(this, ActionBarActivity.class));
    }

    public void onPropertyAnimButtonClick(View view) {
        startActivity(new Intent(this, PropertyAnimationActivity.class));
    }

    public void onMapsButtonClick(View view) {
        startActivity(new Intent(this, MapsActivity.class));
    }

    public void onLocationButtonClick(View view) {
        startActivity(new Intent(this, LocationActivity.class));
    }

    public void onDesignDemoButtonClick(View view) {
        startActivity(new Intent(this, MaterialTestActivity.class));
    }

    public void onGesturesButtonClick(View view) {
        startActivity(new Intent(this, GesturesActivity.class));
    }

    public void onCameraButtonClick(View view) {
        startActivity(new Intent(this, CameraActivity.class));
    }

    public void onOrmLiteButtonClick(View view) {
        startActivity(new Intent(this, OrmLiteActivity.class));
    }

    public void onSignInButtonClick(View view) {
        startActivity(new Intent(this, GoogleSignInActivity.class));
    }

    public void onDataBindingButtonClick(View view) {
        startActivity(new Intent(this, DataBindingActivity.class));
    }

    public void onConstraintLayoutPerformanceButtonClick(View view) {
        Intent intent = new Intent(this, ConstraintLayoutPerformanceActivity.class);
        intent.putExtra(ConstraintLayoutPerformanceActivity.EXTRA_START_TIME, System.currentTimeMillis());
        startActivity(intent);
    }

    public void onKeystoreButtonClick(View view) {
        startActivity(new Intent(this, KeystoreActivity.class));
    }

    public void onAccountButtonClick(View view) {
        startActivity(new Intent(this, AccountActivity.class));
    }

    public void onArchitecturalComponentsButtonClick(View view) {
        startActivity(new Intent(this, ArchitectureActivity.class));
    }
}
