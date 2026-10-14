package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class m4 implements mx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f22897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d1 f22898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uk f22899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final NativeAdView f22900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c1 f22901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList f22902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22903g;

    public final class a implements h2 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.h2
        public final void a() {
            m4.this.a();
        }
    }

    public /* synthetic */ m4(Context context, n21 n21Var, fy0 fy0Var, ArrayList arrayList, yp ypVar, ViewGroup viewGroup, d1 d1Var, uk ukVar, e80 e80Var) {
        this(context, n21Var, fy0Var, arrayList, ypVar, viewGroup, d1Var, ukVar, e80Var, new NativeAdView(context), new c1(n21Var, ukVar));
    }

    public m4(Context context, n21 n21Var, fy0 fy0Var, ArrayList arrayList, yp ypVar, ViewGroup viewGroup, d1 d1Var, uk ukVar, e80 e80Var, NativeAdView nativeAdView, c1 c1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(n21Var, "sliderAdPrivate");
        fd.j0.i(fy0Var, "closeVerificationController");
        fd.j0.i(viewGroup, "subAdsContainer");
        fd.j0.i(d1Var, "adBlockCompleteListener");
        fd.j0.i(ukVar, "contentCloseListener");
        fd.j0.i(e80Var, "layoutDesignsControllerCreator");
        fd.j0.i(nativeAdView, "nativeAdView");
        fd.j0.i(c1Var, "adBlockBinder");
        this.f22897a = viewGroup;
        this.f22898b = d1Var;
        this.f22899c = ukVar;
        this.f22900d = nativeAdView;
        this.f22901e = c1Var;
        this.f22902f = e80Var.a(context, nativeAdView, n21Var, new a(), fy0Var, arrayList, ypVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        if (this.f22903g >= this.f22902f.size()) {
            this.f22898b.a();
            return;
        }
        boolean zA = ((d80) this.f22902f.get(this.f22903g)).a();
        int i10 = this.f22903g + 1;
        this.f22903g = i10;
        if (zA) {
            return;
        }
        if (i10 >= this.f22902f.size()) {
            this.f22899c.e();
        } else {
            a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mx
    public final void c() {
        ViewGroup viewGroup = this.f22897a;
        NativeAdView nativeAdView = this.f22900d;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        viewGroup.removeAllViews();
        viewGroup.addView(nativeAdView, layoutParams);
        if (this.f22901e.a(this.f22900d)) {
            d80 d80Var = (d80) kc.t.s(this.f22902f);
            boolean zA = d80Var != null ? d80Var.a() : false;
            this.f22903g = 1;
            if (zA) {
                return;
            }
            if (1 >= this.f22902f.size()) {
                this.f22899c.e();
            } else {
                a();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.mx
    public final void invalidate() {
        Iterator it = this.f22902f.iterator();
        while (it.hasNext()) {
            ((d80) it.next()).b();
        }
        Objects.requireNonNull(this.f22901e);
    }
}
