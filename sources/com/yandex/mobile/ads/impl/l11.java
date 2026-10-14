package com.yandex.mobile.ads.impl;

import android.os.ConditionVariable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class l11 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f22600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m11 f22601c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l11(m11 m11Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f22601c = m11Var;
        this.f22600b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f22601c) {
            this.f22600b.open();
            m11.a(this.f22601c);
            Objects.requireNonNull(this.f22601c.f22875b);
        }
    }
}
