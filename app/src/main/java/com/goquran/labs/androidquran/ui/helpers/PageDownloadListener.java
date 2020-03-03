package com.goquran.labs.androidquran.ui.helpers;

import android.graphics.drawable.BitmapDrawable;

import com.goquran.labs.androidquran.common.Response;

public interface PageDownloadListener {
  void onLoadImageResponse(BitmapDrawable drawable, Response response);
}
