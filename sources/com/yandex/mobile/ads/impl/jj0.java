package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdException;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class jj0 implements x7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.yandex.mobile.ads.nativeads.u> f22064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NativeAdEventListener f22065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rp f22066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rt f22067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final st f22068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.y f22069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final iq f22070g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jj0(n21 n21Var, NativeAdEventListener nativeAdEventListener) {
        this(n21Var.c(), nativeAdEventListener, new rp(), new rt(), new st(), new com.yandex.mobile.ads.nativeads.y(new aq().a(n21Var)), new iq());
        fd.j0.i(n21Var, "sliderAdPrivate");
        fd.j0.i(nativeAdEventListener, "nativeAdEventListener");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jj0(List<? extends com.yandex.mobile.ads.nativeads.u> list, NativeAdEventListener nativeAdEventListener, rp rpVar, rt rtVar, st stVar, com.yandex.mobile.ads.nativeads.y yVar, iq iqVar) {
        fd.j0.i(list, "nativeAds");
        fd.j0.i(nativeAdEventListener, "nativeAdEventListener");
        fd.j0.i(rpVar, "divExtensionProvider");
        fd.j0.i(rtVar, "extensionPositionParser");
        fd.j0.i(stVar, "extensionViewNameParser");
        fd.j0.i(yVar, "nativeAdViewBinderFromProviderCreator");
        fd.j0.i(iqVar, "divKitNewBinderFeature");
        this.f22064a = list;
        this.f22065b = nativeAdEventListener;
        this.f22066c = rpVar;
        this.f22067d = rtVar;
        this.f22068e = stVar;
        this.f22069f = yVar;
        this.f22070g = iqVar;
    }

    @Override // x7.c
    public /* bridge */ /* synthetic */ void beforeBindView(i8.k kVar, View view, y9.g0 g0Var) {
        super.beforeBindView(kVar, view, g0Var);
    }

    @Override // x7.c
    public final void bindView(i8.k kVar, View view, y9.g0 g0Var) {
        fd.j0.i(kVar, "div2View");
        fd.j0.i(view, "view");
        fd.j0.i(g0Var, "divBase");
        view.setVisibility(8);
        Objects.requireNonNull(this.f22066c);
        y9.z1 z1VarA = rp.a(g0Var);
        if (z1VarA != null) {
            Objects.requireNonNull(this.f22067d);
            Integer numA = rt.a(z1VarA);
            if (numA == null || numA.intValue() < 0 || numA.intValue() >= this.f22064a.size()) {
                return;
            }
            com.yandex.mobile.ads.nativeads.u uVar = this.f22064a.get(numA.intValue());
            NativeAdViewBinder nativeAdViewBinderA = this.f22069f.a(view, new rn0(numA.intValue()));
            fd.j0.h(nativeAdViewBinderA, "nativeAdViewBinderFromPr…(view, assetViewProvider)");
            try {
                iq iqVar = this.f22070g;
                Context context = kVar.getContext();
                fd.j0.h(context, "div2View.context");
                Objects.requireNonNull(iqVar);
                if (iq.a(context)) {
                    yh yhVar = new yh();
                    p7.j actionHandler = kVar.getActionHandler();
                    tp tpVar = actionHandler instanceof tp ? (tp) actionHandler : null;
                    if (tpVar != null) {
                        tpVar.a(numA.intValue(), yhVar);
                    }
                    uVar.a(nativeAdViewBinderA, yhVar);
                } else {
                    uVar.bindNativeAd(nativeAdViewBinderA);
                }
                view.setVisibility(0);
                uVar.setNativeAdEventListener(this.f22065b);
            } catch (NativeAdException unused) {
            }
        }
    }

    @Override // x7.c
    public final boolean matches(y9.g0 g0Var) {
        fd.j0.i(g0Var, "divBase");
        Objects.requireNonNull(this.f22066c);
        y9.z1 z1VarA = rp.a(g0Var);
        if (z1VarA == null) {
            return false;
        }
        Objects.requireNonNull(this.f22067d);
        Integer numA = rt.a(z1VarA);
        Objects.requireNonNull(this.f22068e);
        return numA != null && fd.j0.d("native_ad_view", st.a(z1VarA));
    }

    @Override // x7.c
    public /* bridge */ /* synthetic */ void preprocess(y9.g0 g0Var, v9.d dVar) {
        super.preprocess(g0Var, dVar);
    }

    @Override // x7.c
    public final void unbindView(i8.k kVar, View view, y9.g0 g0Var) {
        fd.j0.i(kVar, "div2View");
        fd.j0.i(view, "view");
        fd.j0.i(g0Var, "divBase");
    }
}
