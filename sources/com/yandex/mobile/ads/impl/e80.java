package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse<?> f20111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uk f20112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q0 f20113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v0 f20115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f80 f20116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final NativeAdEventListener f20117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final um f20118h;

    public /* synthetic */ e80(Context context, AdResponse adResponse, uk ukVar, q0 q0Var, int i10, a1 a1Var) {
        this(context, adResponse, ukVar, q0Var, i10, a1Var, new f80(), new ak0(a1Var, new kx(i01.b().a(context))), new wm(context, nx0.a(adResponse)).a());
    }

    public e80(Context context, AdResponse adResponse, uk ukVar, q0 q0Var, int i10, a1 a1Var, f80 f80Var, NativeAdEventListener nativeAdEventListener, um umVar) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(adResponse, "adResponse");
        fd.j0.i(ukVar, "contentCloseListener");
        fd.j0.i(q0Var, "eventController");
        fd.j0.i(a1Var, "adActivityListener");
        fd.j0.i(f80Var, "layoutDesignsProvider");
        fd.j0.i(nativeAdEventListener, "adEventListener");
        fd.j0.i(umVar, "debugEventsReporter");
        this.f20111a = adResponse;
        this.f20112b = ukVar;
        this.f20113c = q0Var;
        this.f20114d = i10;
        this.f20115e = a1Var;
        this.f20116f = f80Var;
        this.f20117g = nativeAdEventListener;
        this.f20118h = umVar;
    }

    public final d80<NativeAdView> a(Context context, ViewGroup viewGroup, com.yandex.mobile.ads.nativeads.u uVar, h2 h2Var, fy0 fy0Var, yp ypVar) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(viewGroup, "container");
        fd.j0.i(uVar, "nativeAdPrivate");
        fd.j0.i(h2Var, "adCompleteListener");
        fd.j0.i(fy0Var, "closeVerificationController");
        ap apVarA = cp.a(this.f20111a, this.f20115e, this.f20114d);
        fd.j0.h(apVarA, "designsProviderFactory\n …er, requestedOrientation)");
        ArrayList arrayListA = apVarA.a(context, this.f20111a, uVar, this.f20112b, this.f20113c, this.f20118h, h2Var, fy0Var, ypVar);
        fd.j0.h(arrayListA, "designCreatorsProvider.g…   divKitDesign\n        )");
        f80 f80Var = this.f20116f;
        AdResponse<?> adResponse = this.f20111a;
        uk ukVar = this.f20112b;
        NativeAdEventListener nativeAdEventListener = this.f20117g;
        q0 q0Var = this.f20113c;
        Objects.requireNonNull(f80Var);
        ArrayList arrayListA2 = f80.a(context, adResponse, uVar, ukVar, nativeAdEventListener, q0Var, arrayListA);
        fd.j0.h(arrayListA2, "layoutDesignsProvider.ge… designCreators\n        )");
        return new d80<>(context, viewGroup, arrayListA2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList a(Context context, ViewGroup viewGroup, n21 n21Var, h2 h2Var, fy0 fy0Var, ArrayList arrayList, yp ypVar) {
        Object objA;
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(viewGroup, "container");
        fd.j0.i(n21Var, "sliderAdPrivate");
        fd.j0.i(h2Var, "adCompleteListener");
        fd.j0.i(fy0Var, "closeVerificationController");
        ArrayList arrayListC = n21Var.c();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayListC.size();
        int i10 = 0;
        while (true) {
            objA = null;
            if (i10 >= size) {
                break;
            }
            com.yandex.mobile.ads.nativeads.u uVar = (com.yandex.mobile.ads.nativeads.u) arrayListC.get(i10);
            if (arrayList != null) {
                objA = (yp) kc.t.t(arrayList, i10);
            }
            arrayList2.add(a(context, viewGroup, uVar, h2Var, fy0Var, objA));
            i10++;
        }
        objA = ypVar != null ? a(context, viewGroup, n21Var, h2Var, fy0Var, ypVar) : null;
        if (objA != null) {
            arrayList2.add(objA);
        }
        return arrayList2;
    }
}
