package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class dl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2 f19897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdResponse<String> f19898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f19899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ax f19900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final uw f19901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final xw f19902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final kw f19903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final tw f19904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final al f19905j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final nw f19906k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final View f19907l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final vm f19908m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AdResultReceiver f19909n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final dx f19910o;

    public dl1(Context context, k2 k2Var, AdResponse<String> adResponse, String str) throws xi1 {
        Context applicationContext = context.getApplicationContext();
        this.f19896a = applicationContext;
        this.f19897b = k2Var;
        this.f19898c = adResponse;
        this.f19899d = str;
        this.f19908m = new wm(context, nx0.a(adResponse)).a();
        AdResultReceiver adResultReceiver = new AdResultReceiver(new Handler(Looper.getMainLooper()));
        this.f19909n = adResultReceiver;
        this.f19910o = new dx();
        ax axVarB = b();
        this.f19900e = axVarB;
        uw uwVar = new uw(applicationContext, k2Var, adResponse, adResultReceiver);
        this.f19901f = uwVar;
        this.f19902g = new xw(applicationContext, k2Var, adResponse, adResultReceiver);
        kw kwVar = new kw();
        this.f19903h = kwVar;
        this.f19904i = c();
        al alVarA = a();
        this.f19905j = alVarA;
        nw nwVar = new nw(alVarA);
        this.f19906k = nwVar;
        kwVar.a(nwVar);
        uwVar.a(nwVar);
        this.f19907l = alVarA.a(axVarB, adResponse);
    }

    private al a() {
        boolean zA = xf0.a(this.f19899d);
        FrameLayout frameLayoutA = o5.a(this.f19896a);
        frameLayoutA.setOnClickListener(new qi(this.f19903h, this.f19904i, this.f19908m));
        return new bl().a(frameLayoutA, this.f19898c, this.f19908m, zA, this.f19898c.L());
    }

    private ax b() throws xi1 {
        return new bx().a(this.f19896a, this.f19898c, this.f19897b);
    }

    private tw c() {
        boolean zA = xf0.a(this.f19899d);
        Objects.requireNonNull(xz.a());
        wz wzVarA = xz.a(zA);
        ax axVar = this.f19900e;
        uw uwVar = this.f19901f;
        xw xwVar = this.f19902g;
        return wzVarA.a(axVar, uwVar, xwVar, this.f19903h, xwVar);
    }

    public final void a(Context context, AdResultReceiver adResultReceiver) {
        o0 o0Var = new o0(new o0.a(this.f19898c).a(this));
        this.f19909n.a(adResultReceiver);
        this.f19910o.a(context, o0Var, this.f19909n);
    }

    public final void a(RelativeLayout relativeLayout) {
        this.f19905j.a(relativeLayout);
        relativeLayout.addView(this.f19907l);
        this.f19905j.c();
    }

    public final void a(uk ukVar) {
        this.f19903h.a(ukVar);
    }

    public final void a(zk zkVar) {
        this.f19901f.a(zkVar);
    }

    public final void d() {
        this.f19903h.a((uk) null);
        this.f19901f.a((zk) null);
        this.f19904i.invalidate();
        this.f19905j.d();
    }

    public final mw e() {
        return this.f19906k.a();
    }

    public final void f() {
        this.f19905j.b();
        ax axVar = this.f19900e;
        Objects.requireNonNull(axVar);
        int i10 = t6.f25286b;
        try {
            WebView.class.getDeclaredMethod("onPause", new Class[0]).invoke(axVar, new Object[0]);
        } catch (Exception unused) {
        }
        x60.d("WebView component <%s> was paused", ax.class.toString());
    }

    public final void g() {
        this.f19904i.a(this.f19899d);
    }

    public final void h() {
        ax axVar = this.f19900e;
        Objects.requireNonNull(axVar);
        int i10 = t6.f25286b;
        try {
            WebView.class.getDeclaredMethod("onResume", new Class[0]).invoke(axVar, new Object[0]);
        } catch (Exception unused) {
        }
        x60.d("WebView component <%s> was resumed", ax.class.toString());
        this.f19905j.a();
    }
}
