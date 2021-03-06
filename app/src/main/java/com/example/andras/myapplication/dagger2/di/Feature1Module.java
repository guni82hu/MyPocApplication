package com.example.andras.myapplication.dagger2.di;

import com.example.andras.myapplication.dagger2.interactor.Feature1Interactor;
import com.example.andras.myapplication.dagger2.ui.common.Navigator;
import com.example.andras.myapplication.dagger2.ui.feature1.list.Feature1ListPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Andras Nemeth on 2017. 06. 05..
 */

@Module(includes = {CommonModule.class})
public class Feature1Module {

    @ActivityScope
    @Provides
    Feature1ListPresenter provideFeature1ListPresenter(Feature1Interactor interactor, Navigator navigator) {
        return new Feature1ListPresenter(interactor, navigator);
    }
}
