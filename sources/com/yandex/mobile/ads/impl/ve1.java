package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.VideoEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class ve1 implements af1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f25970a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private VideoEventListener f25971b;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        VideoEventListener videoEventListener = this.f25971b;
        if (videoEventListener != null) {
            videoEventListener.onVideoComplete();
        }
    }

    @Override // com.yandex.mobile.ads.impl.af1
    public final void a() {
        this.f25970a.post(new pp1(this));
    }

    public final void a(VideoEventListener videoEventListener) {
        this.f25971b = videoEventListener;
    }
}
