package com.goquran.labs.androidquran.component.application;

import com.goquran.data.page.provider.QuranPageModule;
import com.goquran.labs.androidquran.QuranApplication;
import com.goquran.labs.androidquran.QuranDataActivity;
import com.goquran.labs.androidquran.QuranForwarderActivity;
import com.goquran.labs.androidquran.QuranImportActivity;
import com.goquran.labs.androidquran.SearchActivity;
import com.goquran.labs.androidquran.component.activity.PagerActivityComponent;
import com.goquran.labs.androidquran.data.QuranDataModule;
import com.goquran.labs.androidquran.data.QuranDataProvider;
import com.goquran.labs.androidquran.module.application.ApplicationModule;
import com.goquran.labs.androidquran.module.application.DatabaseModule;
import com.goquran.common.networking.NetworkModule;
import com.goquran.labs.androidquran.pageselect.PageSelectActivity;
import com.goquran.labs.androidquran.service.AudioService;
import com.goquran.labs.androidquran.service.QuranDownloadService;
import com.goquran.labs.androidquran.ui.AudioManagerActivity;
import com.goquran.labs.androidquran.ui.QuranActivity;
import com.goquran.labs.androidquran.ui.TranslationManagerActivity;
import com.goquran.labs.androidquran.ui.fragment.AddTagDialog;
import com.goquran.labs.androidquran.ui.fragment.AyahPlaybackFragment;
import com.goquran.labs.androidquran.ui.fragment.BookmarksFragment;
import com.goquran.labs.androidquran.ui.fragment.JumpFragment;
import com.goquran.labs.androidquran.ui.fragment.JuzListFragment;
import com.goquran.labs.androidquran.ui.fragment.QuranAdvancedSettingsFragment;
import com.goquran.labs.androidquran.ui.fragment.QuranSettingsFragment;
import com.goquran.labs.androidquran.ui.fragment.SuraListFragment;
import com.goquran.labs.androidquran.ui.fragment.TagBookmarkDialog;

import com.goquran.labs.androidquran.core.worker.di.WorkerModule;
import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
    ApplicationModule.class,
    DatabaseModule.class,
    NetworkModule.class,
    QuranDataModule.class,
    QuranPageModule.class,
    WorkerModule.class
} )
public interface ApplicationComponent {
  // subcomponents
  PagerActivityComponent.Builder pagerActivityComponentBuilder();

  // application
  void inject(QuranApplication quranApplication);

  // content provider
  void inject(QuranDataProvider quranDataProvider);

  // services
  void inject(AudioService audioService);
  void inject(QuranDownloadService quranDownloadService);

  // activities
  void inject(QuranActivity quranActivity);
  void inject(QuranDataActivity quranDataActivity);
  void inject(QuranImportActivity quranImportActivity);
  void inject(AudioManagerActivity audioManagerActivity);
  void inject(QuranForwarderActivity quranForwarderActivity);
  void inject(SearchActivity searchActivity);
  void inject(PageSelectActivity pageSelectActivity);

  // fragments
  void inject(BookmarksFragment bookmarksFragment);
  void inject(QuranSettingsFragment fragment);
  void inject(TranslationManagerActivity translationManagerActivity);
  void inject(QuranAdvancedSettingsFragment quranAdvancedSettingsFragment);
  void inject(SuraListFragment suraListFragment);
  void inject(JuzListFragment juzListFragment);
  void inject(AyahPlaybackFragment ayahPlaybackFragment);
  void inject(JumpFragment jumpFragment);

  // dialogs
  void inject(TagBookmarkDialog tagBookmarkDialog);
  void inject(AddTagDialog addTagDialog);
}
