package com.google.android.play.core.assetpacks;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AssetLocation {
    public static AssetLocation a(String str, long j10, long j11) {
        return new bf(str, j10, j11);
    }

    public abstract long offset();

    public abstract String path();

    public abstract long size();
}
