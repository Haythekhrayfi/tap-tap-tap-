package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class xd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nd1 f26502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ud1 f26503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f26504c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26505d;

    public class a implements Runnable {
        private a() {
        }

        public /* synthetic */ a(xd1 xd1Var, int i10) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
            long adPosition = xd1.this.f26502a.getAdPosition();
            xd1.this.f26503b.a(xd1.this.f26502a.d(), adPosition);
            if (xd1.this.f26505d) {
                xd1.this.f26504c.postDelayed(this, 200L);
            }
        }
    }

    public xd1(nd1 nd1Var, ud1 ud1Var) {
        this.f26502a = nd1Var;
        this.f26503b = ud1Var;
    }

    public final void a() {
        if (this.f26505d) {
            return;
        }
        this.f26505d = true;
        this.f26503b.a();
        this.f26504c.post(new a(this, 0));
    }

    public final void b() {
        if (this.f26505d) {
            this.f26503b.b();
            this.f26504c.removeCallbacksAndMessages(null);
            this.f26505d = false;
        }
    }
}
