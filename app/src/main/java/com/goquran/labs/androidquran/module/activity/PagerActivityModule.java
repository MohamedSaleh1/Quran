package com.goquran.labs.androidquran.module.activity;

import android.content.Context;

import com.goquran.labs.androidquran.R;
import com.goquran.labs.androidquran.data.QuranInfo;
import com.goquran.labs.androidquran.di.ActivityScope;
import com.goquran.labs.androidquran.ui.PagerActivity;
import com.goquran.labs.androidquran.ui.helpers.AyahSelectedListener;
import com.goquran.labs.androidquran.util.QuranScreenInfo;
import com.goquran.labs.androidquran.util.QuranUtils;
import com.goquran.labs.androidquran.util.TranslationUtil;

import dagger.Module;
import dagger.Provides;

@Module
public class PagerActivityModule {
  private final PagerActivity pagerActivity;

  public PagerActivityModule(PagerActivity pagerActivity) {
    this.pagerActivity = pagerActivity;
  }

  @Provides
  AyahSelectedListener provideAyahSelectedListener() {
    return this.pagerActivity;
  }

  @Provides
  @ActivityScope
  String provideImageWidth(QuranScreenInfo screenInfo) {
    return QuranUtils.isDualPages(pagerActivity, screenInfo) ?
        screenInfo.getTabletWidthParam() : screenInfo.getWidthParam();
  }

  @Provides
  @ActivityScope
  TranslationUtil provideTranslationUtil(Context context, QuranInfo quranInfo) {
    return new TranslationUtil(
        context.getResources().getColor(R.color.translation_translator_color),
        quranInfo);
  }
}
