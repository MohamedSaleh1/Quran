package com.goquran.labs.androidquran.data;

import com.goquran.data.source.PageProvider;

import java.util.Map;

import dagger.Module;
import dagger.Provides;

@Module
public class QuranDataModule {

  @Provides
  static PageProvider provideQuranPageProvider(Map<String, PageProvider> providers) {
    return providers.get("warsh");
  }
}
