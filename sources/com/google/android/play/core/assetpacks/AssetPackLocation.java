package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.model.AssetPackStorageMethod;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AssetPackLocation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AssetPackLocation f11814a = new bg(1, null, null);

    public static AssetPackLocation a() {
        return f11814a;
    }

    public static AssetPackLocation a(String str, String str2) {
        return new bg(0, str, str2);
    }

    public abstract String assetsPath();

    @AssetPackStorageMethod
    public abstract int packStorageMethod();

    public abstract String path();
}
