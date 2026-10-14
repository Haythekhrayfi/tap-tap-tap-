package com.applovin.impl.sdk;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f10171a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f10175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f10176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference<View> f10177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f10178h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f10181k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f10182l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f10183m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f10184n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f10172b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f10173c = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f10179i = new WeakReference<>(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference<View> f10180j = new WeakReference<>(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f10185o = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f10174d = new Handler(Looper.getMainLooper());

    public interface a {
        void onLogVisibilityImpression();
    }

    public ad(final View view, o oVar, a aVar) {
        this.f10171a = oVar.F();
        this.f10178h = ((Long) oVar.a(com.applovin.impl.sdk.c.b.cl)).longValue();
        this.f10177g = new WeakReference<>(view);
        final WeakReference weakReference = new WeakReference(aVar);
        this.f10175e = new Runnable() { // from class: com.applovin.impl.sdk.ad.1
            @Override // java.lang.Runnable
            public void run() {
                View view2 = (View) ad.this.f10177g.get();
                ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                View view3 = (View) ad.this.f10180j.get();
                if (viewGroup == null || view3 == null) {
                    return;
                }
                if (!ad.this.b(viewGroup, view3)) {
                    ad.this.b();
                    return;
                }
                y unused = ad.this.f10171a;
                if (y.a()) {
                    ad.this.f10171a.b("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
                }
                ad.this.a();
                a aVar2 = (a) weakReference.get();
                if (aVar2 != null) {
                    aVar2.onLogVisibilityImpression();
                }
            }
        };
        this.f10176f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.sdk.ad.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                ad.this.b();
                ad.this.b(view);
                return true;
            }
        };
    }

    private void a(View view) {
        View viewA = com.applovin.impl.sdk.utils.w.a(this.f10177g.get());
        if (viewA == null) {
            viewA = com.applovin.impl.sdk.utils.w.a(view);
        }
        if (viewA == null) {
            if (y.a()) {
                this.f10171a.b("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = viewA.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f10179i = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f10176f);
        } else if (y.a()) {
            this.f10171a.d("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
        }
    }

    private boolean a(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f10173c)) {
            return false;
        }
        long jPxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.f10173c.height()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f10173c.width());
        if (jPxToDp < this.f10181k) {
            return false;
        }
        if ((jPxToDp / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()))) * 100.0f < this.f10182l) {
            return false;
        }
        return (((float) ((long) (this.f10173c.height() * this.f10173c.width()))) / ((float) ((long) (view2.getHeight() * view2.getWidth())))) * 100.0f >= this.f10183m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f10174d.postDelayed(this.f10175e, this.f10178h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view) {
        y yVar;
        String str;
        ViewTreeObserver viewTreeObserver = this.f10179i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f10176f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f10176f);
            } else if (y.a()) {
                yVar = this.f10171a;
                str = "Could not remove on pre-draw listener. View tree observer is not alive.";
                yVar.b("VisibilityTracker", str);
            }
        } else if (y.a()) {
            yVar = this.f10171a;
            str = "Could not remove on pre-draw listener. Root view is null.";
            yVar.b("VisibilityTracker", str);
        }
        this.f10179i.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(View view, View view2) {
        if (!a(view, view2)) {
            return false;
        }
        if (this.f10185o == Long.MIN_VALUE) {
            this.f10185o = SystemClock.uptimeMillis();
        }
        return SystemClock.uptimeMillis() - this.f10185o >= this.f10184n;
    }

    public void a() {
        synchronized (this.f10172b) {
            this.f10174d.removeMessages(0);
            b(this.f10177g.get());
            this.f10185o = Long.MIN_VALUE;
            this.f10180j.clear();
        }
    }

    public void a(int i10, float f10, float f11, long j10, View view) {
        synchronized (this.f10172b) {
            if (y.a()) {
                this.f10171a.b("VisibilityTracker", "Tracking visibility for " + view);
            }
            a();
            WeakReference<View> weakReference = new WeakReference<>(view);
            this.f10180j = weakReference;
            this.f10181k = i10;
            this.f10182l = f10;
            this.f10183m = f11;
            this.f10184n = j10;
            a(weakReference.get());
        }
    }

    public void a(com.applovin.impl.mediation.a.e eVar) {
        View viewI;
        if (eVar instanceof com.applovin.impl.mediation.a.b) {
            viewI = eVar.w();
        } else if (!(eVar instanceof com.applovin.impl.mediation.a.d)) {
            return;
        } else {
            viewI = ((com.applovin.impl.mediation.a.d) eVar).I();
        }
        a(eVar.S(), eVar.T(), eVar.W(), eVar.Y(), viewI);
    }
}
