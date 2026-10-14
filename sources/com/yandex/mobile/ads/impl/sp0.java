package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class sp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sz f25157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c00 f25158b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f25162f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w11 f25160d = new w11();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f25159c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r4 f25161e = new r4();

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f25163b;

        public a(long j10) {
            this.f25163b = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            x60.d("A page has finished loading. Waiting onHtmlWebViewRender", new Object[0]);
            sp0.this.f25159c.postDelayed(sp0.this.f25161e, this.f25163b);
        }
    }

    public sp0(uz uzVar, sz szVar) {
        this.f25158b = uzVar;
        this.f25157a = szVar;
    }

    public final void a() {
        this.f25159c.removeCallbacksAndMessages(null);
        this.f25161e.a(null);
    }

    public final void a(int i10, String str) {
        this.f25162f = true;
        this.f25159c.removeCallbacks(this.f25161e);
        this.f25159c.post(new zi1(i10, str, this.f25158b));
    }

    public final void a(b00 b00Var) {
        this.f25161e.a(b00Var);
    }

    public final void b() {
        if (this.f25162f) {
            return;
        }
        this.f25160d.a(new a(this.f25157a.a()));
    }
}
