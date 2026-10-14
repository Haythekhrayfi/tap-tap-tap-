package com.yandex.mobile.ads.impl;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class fu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s90 f20868a;

    public fu(s90 s90Var) {
        fd.j0.i(s90Var, "mainThreadHandler");
        this.f20868a = s90Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(long j10, uc.a aVar) {
        fd.j0.i(aVar, "$successCallback");
        if (SystemClock.elapsedRealtime() - j10 <= 5000) {
            aVar.invoke();
        }
    }

    public final void a(uc.a<jc.w> aVar) {
        fd.j0.i(aVar, "successCallback");
        this.f20868a.a(new com.applovin.exoplayer2.b.c0(SystemClock.elapsedRealtime(), aVar));
    }
}
