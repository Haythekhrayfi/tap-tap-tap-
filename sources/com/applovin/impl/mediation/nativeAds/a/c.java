package com.applovin.impl.mediation.nativeAds.a;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap<View, Integer> f10008a = new WeakHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f10009b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f10010c = new Handler();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10011d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference<View> f10012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f10013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f10014g;

    public interface a {
        void a(int i10, int i11);
    }

    public c(View view) {
        this.f10012e = new WeakReference<>(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f10013f = null;
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.mediation.nativeAds.a.c.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                c.this.b();
                return true;
            }
        };
        this.f10013f = onPreDrawListener;
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f10011d) {
            return;
        }
        this.f10011d = true;
        this.f10010c.postDelayed(new Runnable() { // from class: com.applovin.impl.mediation.nativeAds.a.c.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this.f10009b) {
                    c.this.f10011d = false;
                    int iMin = -1;
                    int iMax = -1;
                    for (Map.Entry entry : c.this.f10008a.entrySet()) {
                        if (c.this.b((View) entry.getKey())) {
                            Integer num = (Integer) entry.getValue();
                            if (iMin == -1 && iMax == -1) {
                                iMin = num.intValue();
                                iMax = num.intValue();
                            } else {
                                iMin = Math.min(iMin, ((Integer) entry.getValue()).intValue());
                                iMax = Math.max(iMax, ((Integer) entry.getValue()).intValue());
                            }
                        }
                    }
                    if (c.this.f10014g != null) {
                        c.this.f10014g.a(iMin, iMax);
                    }
                }
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f10014g = null;
        View view = this.f10012e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f10013f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f10012e.clear();
        }
    }

    public void a(View view) {
        synchronized (this.f10009b) {
            this.f10008a.remove(view);
        }
    }

    public void a(View view, int i10) {
        synchronized (this.f10009b) {
            this.f10008a.put(view, Integer.valueOf(i10));
            b();
        }
    }

    public void a(a aVar) {
        this.f10014g = aVar;
    }
}
