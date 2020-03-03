package com.goquran.labs.androidquran.module.application;

import android.content.Context;

import com.goquran.labs.androidquran.data.QuranInfo;
import com.goquran.labs.androidquran.database.BookmarksDBAdapter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DatabaseModule {

  @Provides
  @Singleton
  static BookmarksDBAdapter provideBookmarkDatabaseAdapter(Context context, QuranInfo quranInfo) {
    return new BookmarksDBAdapter(context, quranInfo.getNumberOfPages());
  }
}
