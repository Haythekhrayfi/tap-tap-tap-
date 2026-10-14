package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class l implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadFactory f12208a = new l();

    private l() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}
