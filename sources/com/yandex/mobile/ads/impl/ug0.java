package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import java.util.Timer;

/* JADX INFO: loaded from: classes3.dex */
public final class ug0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eh0 f25626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xg0 f25627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference<ViewPager2> f25628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Timer f25629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private fh0 f25630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f25631f;

    public ug0(ViewPager2 viewPager2, eh0 eh0Var, xg0 xg0Var) {
        fd.j0.i(viewPager2, "viewPager");
        fd.j0.i(eh0Var, "multiBannerSwiper");
        fd.j0.i(xg0Var, "multiBannerEventTracker");
        this.f25626a = eh0Var;
        this.f25627b = xg0Var;
        this.f25628c = new WeakReference<>(viewPager2);
        this.f25629d = new Timer();
        this.f25631f = true;
    }

    public final void a() {
        b();
        this.f25631f = false;
        this.f25629d.cancel();
    }

    public final void a(long j10) {
        jc.w wVar;
        if (j10 <= 0 || !this.f25631f) {
            return;
        }
        b();
        ViewPager2 viewPager2 = this.f25628c.get();
        if (viewPager2 != null) {
            fh0 fh0Var = new fh0(viewPager2, this.f25626a, this.f25627b);
            this.f25630e = fh0Var;
            try {
                this.f25629d.schedule(fh0Var, j10, j10);
            } catch (Exception unused) {
                b();
            }
            wVar = jc.w.f31842a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            a();
        }
    }

    public final void b() {
        fh0 fh0Var = this.f25630e;
        if (fh0Var != null) {
            fh0Var.cancel();
        }
        this.f25630e = null;
    }
}
