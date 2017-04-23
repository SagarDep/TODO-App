package com.popularmovies.vpaliy.todo.mvp;

import android.support.annotation.NonNull;

public interface BasePresenter<V extends BaseView> {
    void attachView(@NonNull V view);
}