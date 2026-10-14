package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class da0 implements InstreamAdBreakEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f19801a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InstreamAdBreakEventListener f19802b;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        InstreamAdBreakEventListener instreamAdBreakEventListener = this.f19802b;
        if (instreamAdBreakEventListener != null) {
            instreamAdBreakEventListener.onInstreamAdBreakCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        InstreamAdBreakEventListener instreamAdBreakEventListener = this.f19802b;
        if (instreamAdBreakEventListener != null) {
            instreamAdBreakEventListener.onInstreamAdBreakError(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        InstreamAdBreakEventListener instreamAdBreakEventListener = this.f19802b;
        if (instreamAdBreakEventListener != null) {
            instreamAdBreakEventListener.onInstreamAdBreakPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        InstreamAdBreakEventListener instreamAdBreakEventListener = this.f19802b;
        if (instreamAdBreakEventListener != null) {
            instreamAdBreakEventListener.onInstreamAdBreakStarted();
        }
    }

    public final void a(InstreamAdBreakEventListener instreamAdBreakEventListener) {
        this.f19802b = instreamAdBreakEventListener;
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakEventListener
    public final void onInstreamAdBreakCompleted() {
        this.f19801a.post(new un1(this, 2));
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakEventListener
    public final void onInstreamAdBreakError(String str) {
        this.f19801a.post(new do1(this, str));
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakEventListener
    public final void onInstreamAdBreakPrepared() {
        this.f19801a.post(new un1(this, 1));
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakEventListener
    public final void onInstreamAdBreakStarted() {
        this.f19801a.post(new un1(this, 0));
    }
}
