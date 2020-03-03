package com.goquran.labs.androidquran.component.fragment;

import com.goquran.labs.androidquran.di.QuranPageScope;
import com.goquran.labs.androidquran.module.fragment.QuranPageModule;
import com.goquran.labs.androidquran.ui.fragment.QuranPageFragment;
import com.goquran.labs.androidquran.ui.fragment.TabletFragment;
import com.goquran.labs.androidquran.ui.fragment.TranslationFragment;

import dagger.Subcomponent;

@QuranPageScope
@Subcomponent(modules = QuranPageModule.class)
public interface QuranPageComponent {
  void inject(QuranPageFragment quranPageFragment);
  void inject(TabletFragment tabletFragment);
  void inject(TranslationFragment translationFragment);

  @Subcomponent.Builder interface Builder {
    Builder withQuranPageModule(QuranPageModule quranPageModule);
    QuranPageComponent build();
  }
}
