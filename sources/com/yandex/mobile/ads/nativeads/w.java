package com.yandex.mobile.ads.nativeads;

import android.view.View;
import com.yandex.mobile.ads.impl.ad0;
import com.yandex.mobile.ads.impl.d11;
import com.yandex.mobile.ads.impl.db;
import com.yandex.mobile.ads.impl.g20;
import com.yandex.mobile.ads.impl.k2;
import com.yandex.mobile.ads.impl.kj0;
import com.yandex.mobile.ads.impl.lk0;
import com.yandex.mobile.ads.impl.lm0;
import com.yandex.mobile.ads.impl.pi0;
import com.yandex.mobile.ads.impl.qa;
import com.yandex.mobile.ads.impl.ra;
import com.yandex.mobile.ads.impl.ta;
import com.yandex.mobile.ads.impl.v20;
import com.yandex.mobile.ads.impl.x60;
import com.yandex.mobile.ads.impl.zj0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class w<T extends View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f27990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g20 f27991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b0 f27992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f27993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x f27994e;

    public w(T t10, kj0<T> kj0Var, k2 k2Var, g20 g20Var, v20 v20Var, c cVar, pi0 pi0Var, db dbVar, lk0 lk0Var, zj0 zj0Var, lm0 lm0Var, d11 d11Var) {
        this.f27990a = cVar;
        this.f27991b = g20Var;
        ad0 ad0Var = new ad0(dbVar, k2Var, v20Var, pi0Var.c(), d11Var);
        b0 b0VarA = kj0Var.a(t10);
        this.f27992c = b0VarA;
        this.f27993d = new ta(b0VarA, g20Var, ad0Var, lk0Var, zj0Var, lm0Var).a();
        this.f27994e = new x();
    }

    public final ra a(qa qaVar) {
        if (qaVar != null) {
            return (ra) this.f27993d.get(qaVar.b());
        }
        return null;
    }

    public final void a() {
        for (ra raVar : this.f27993d.values()) {
            if (raVar != null) {
                raVar.a();
            }
        }
    }

    public final void b() {
        for (ra raVar : this.f27993d.values()) {
            if (raVar != null) {
                raVar.destroy();
            }
        }
    }

    public final Map<String, ra<?>> c() {
        return this.f27993d;
    }

    public final g20 d() {
        return this.f27991b;
    }

    public final View e() {
        return this.f27992c.l();
    }

    public final NativeAdViewBinder f() {
        View viewL = this.f27992c.l();
        if (viewL == null) {
            return null;
        }
        x xVar = this.f27994e;
        b0 b0Var = this.f27992c;
        Objects.requireNonNull(xVar);
        NativeAdViewBinder.Builder builder = new NativeAdViewBinder.Builder(viewL);
        try {
            NativeAdViewBinder.Builder priceView = builder.setAgeView(b0Var.a()).setBodyView(b0Var.c()).setCallToActionView(b0Var.d()).setDomainView(b0Var.f()).setFaviconView(b0Var.g()).setFeedbackView(b0Var.h()).setIconView(b0Var.i()).setMediaView(b0Var.k()).setPriceView(b0Var.m());
            View viewN = b0Var.n();
            priceView.setRatingView(viewN instanceof Rating ? viewN : null).setReviewCountView(b0Var.o()).setSponsoredView(b0Var.p()).setTitleView(b0Var.q()).setWarningView(b0Var.r());
        } catch (Exception e10) {
            x60.a(e10, e10.getMessage(), new Object[0]);
        }
        return builder.build();
    }

    public final c g() {
        return this.f27990a;
    }

    public final b0 h() {
        return this.f27992c;
    }
}
