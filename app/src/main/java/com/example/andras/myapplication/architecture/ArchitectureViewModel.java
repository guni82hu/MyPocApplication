package com.example.andras.myapplication.architecture;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;

/**
 * Created by Andras_Nemeth on 2017. 07. 31..
 */

public class ArchitectureViewModel extends ViewModel implements LifecycleObserver {

    private SomeDataProducerService service;
    private ArchitectureActivity view;


    public ArchitectureViewModel() {
        Injector.inject(this);
    }

    public void setView(ArchitectureActivity view) {
        this.view = view;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onStart() {
        service.start();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStop() {
        service.stop();
    }

    private void onDataReceived(String s) {
        view.displayText(s);
    }

    public void setService(SomeDataProducerService service) {
        this.service = service;
        service.setCallback(this::onDataReceived);
    }
}
