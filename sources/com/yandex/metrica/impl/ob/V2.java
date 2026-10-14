package com.yandex.metrica.impl.ob;

import android.app.WallpaperManager;

/* JADX INFO: loaded from: classes.dex */
final class V2<T, R> implements Wm<WallpaperManager, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15204a;

    public V2(int i10) {
        this.f15204a = i10;
    }

    @Override // com.yandex.metrica.impl.ob.Wm
    public Integer a(WallpaperManager wallpaperManager) {
        return Integer.valueOf(wallpaperManager.getWallpaperId(this.f15204a));
    }
}
