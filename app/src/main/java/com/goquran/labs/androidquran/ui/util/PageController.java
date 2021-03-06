package com.goquran.labs.androidquran.ui.util;

import android.view.MotionEvent;

import com.goquran.labs.androidquran.ui.helpers.AyahSelectedListener;

public interface PageController {
  boolean handleTouchEvent(MotionEvent event, AyahSelectedListener.EventType eventType, int page);
  void handleRetryClicked();
  void onScrollChanged(int x, int y, int oldx, int oldy);
}
