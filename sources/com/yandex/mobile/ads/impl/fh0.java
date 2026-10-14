package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public final class fh0 extends TimerTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final eh0 f20709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xg0 f20710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakReference<ViewPager2> f20711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20712e;

    public fh0(ViewPager2 viewPager2, eh0 eh0Var, xg0 xg0Var) {
        fd.j0.i(viewPager2, "viewPager");
        fd.j0.i(eh0Var, "multiBannerSwiper");
        fd.j0.i(xg0Var, "multiBannerEventTracker");
        this.f20709b = eh0Var;
        this.f20710c = xg0Var;
        this.f20711d = new WeakReference<>(viewPager2);
        this.f20712e = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(fh0 fh0Var, ViewPager2 viewPager2) {
        fd.j0.i(fh0Var, "this$0");
        fd.j0.i(viewPager2, "$viewPager");
        RecyclerView.g adapter = viewPager2.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (itemCount != 0) {
            int currentItem = viewPager2.getCurrentItem();
            if (currentItem == 0) {
                fh0Var.f20712e = 1;
            } else if (currentItem == itemCount - 1) {
                fh0Var.f20712e = 2;
            }
        } else {
            fh0Var.cancel();
        }
        int iA = a6.a(fh0Var.f20712e);
        if (iA == 0) {
            fh0Var.f20709b.a();
        } else if (iA == 1) {
            fh0Var.f20709b.b();
        }
        fh0Var.f20710c.a();
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        ViewPager2 viewPager2 = this.f20711d.get();
        if (viewPager2 == null) {
            cancel();
        } else if (eh1.b(viewPager2) > 0) {
            viewPager2.post(new do1(this, viewPager2));
        }
    }
}
