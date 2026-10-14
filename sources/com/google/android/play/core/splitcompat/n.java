package com.google.android.play.core.splitcompat;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SplitCompat f12361a;

    public n(SplitCompat splitCompat) {
        this.f12361a = splitCompat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f12361a.f12336b.a();
        } catch (Exception e10) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e10);
        }
    }
}
