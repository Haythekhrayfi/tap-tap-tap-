package com.google.firebase.analytics;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Callable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseAnalytics f12558c;

    public a(FirebaseAnalytics firebaseAnalytics) {
        this.f12558c = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        return this.f12558c.f12556a.zzk();
    }
}
