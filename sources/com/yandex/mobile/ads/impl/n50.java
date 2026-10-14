package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.instream.InstreamAdListener;

/* JADX INFO: loaded from: classes3.dex */
public final class n50 implements g60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f23236a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InstreamAdListener f23237b;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        InstreamAdListener instreamAdListener = this.f23237b;
        if (instreamAdListener != null) {
            instreamAdListener.onInstreamAdPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        InstreamAdListener instreamAdListener = this.f23237b;
        if (instreamAdListener != null) {
            instreamAdListener.onError(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        InstreamAdListener instreamAdListener = this.f23237b;
        if (instreamAdListener != null) {
            instreamAdListener.onInstreamAdCompleted();
        }
    }

    public final void a(InstreamAdListener instreamAdListener) {
        this.f23237b = instreamAdListener;
    }

    public final void c() {
        this.f23236a.post(new cp1(this, 0));
    }

    public final void d() {
        this.f23236a.post(new cp1(this, 1));
    }

    public final void e() {
        this.f23236a.post(new do1(this, "Video player returned error"));
    }
}
