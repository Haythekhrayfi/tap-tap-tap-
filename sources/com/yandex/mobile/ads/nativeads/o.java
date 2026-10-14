package com.yandex.mobile.ads.nativeads;

import android.annotation.SuppressLint;
import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.impl.ae;
import com.yandex.mobile.ads.impl.cj0;
import com.yandex.mobile.ads.impl.e51;
import com.yandex.mobile.ads.impl.ej0;
import com.yandex.mobile.ads.impl.fi0;
import com.yandex.mobile.ads.impl.gi0;
import com.yandex.mobile.ads.impl.hj0;
import com.yandex.mobile.ads.impl.l6;
import com.yandex.mobile.ads.impl.pi0;
import com.yandex.mobile.ads.impl.s70;
import com.yandex.mobile.ads.impl.si0;
import com.yandex.mobile.ads.impl.t2;
import com.yandex.mobile.ads.impl.v3;
import com.yandex.mobile.ads.impl.v4;
import com.yandex.mobile.ads.impl.w3;
import com.yandex.mobile.ads.impl.wk0;
import com.yandex.mobile.ads.impl.ww0;
import com.yandex.mobile.ads.impl.xd;
import com.yandex.mobile.ads.impl.yk0;
import com.yandex.mobile.ads.impl.z3;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends ae<cj0> {
    private final t A;
    private final w3 B;
    private final e51 C;
    private ww0<cj0> D;
    private NativeAdRequestConfiguration E;
    private si0 F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final fi0 f27795w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final gi0 f27796x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ej0 f27797y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final hj0 f27798z;

    public class a implements fi0 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.fi0
        public final void a(t2 t2Var) {
            o.this.B.a(v3.f25800c);
            o.this.b(t2Var);
        }

        @Override // com.yandex.mobile.ads.impl.fi0
        public final void a(NativeAd nativeAd) {
            o.this.o();
            o.this.A.a(nativeAd);
        }

        @Override // com.yandex.mobile.ads.impl.fi0
        public final void a(SliderAd sliderAd) {
            o.this.o();
            o.this.A.a(sliderAd);
        }

        @Override // com.yandex.mobile.ads.impl.fi0
        public final void a(ArrayList arrayList) {
            o.this.o();
            o.this.A.a(arrayList);
        }
    }

    public o(Context context, t tVar, w3 w3Var) {
        super(context, l6.f22630e, w3Var);
        this.A = tVar;
        this.B = w3Var;
        this.f27795w = new a();
        this.f27796x = new gi0(context, d(), w3Var);
        this.f27797y = new ej0();
        hj0 hj0Var = new hj0();
        this.f27798z = hj0Var;
        tVar.a(hj0Var);
        this.F = new si0(context, this);
        this.C = e51.a();
    }

    @Override // com.yandex.mobile.ads.impl.ae
    public final xd<cj0> a(String str, String str2) {
        return this.F.a(this.D, this.f18888f, this.E, str, str2);
    }

    @Override // com.yandex.mobile.ads.impl.ae, com.yandex.mobile.ads.impl.gx0.b
    public final void a(AdResponse<cj0> adResponse) {
        super.a((AdResponse) adResponse);
        this.f27798z.a(adResponse);
        if (k()) {
            return;
        }
        Objects.requireNonNull(this.f27797y);
        ej0.a(adResponse).a(this).a(this.f18884b, adResponse);
    }

    public final void a(AdResponse<cj0> adResponse, pi0 pi0Var, String str) {
        b(str);
        if (k()) {
            return;
        }
        this.f27796x.a(this.f18884b, adResponse, adResponse.C(), pi0Var, this.f27795w);
    }

    @Override // com.yandex.mobile.ads.impl.ae
    public final void a(t2 t2Var) {
        this.A.b(t2Var);
    }

    public final void a(NativeAdLoadListener nativeAdLoadListener) {
        this.A.a(nativeAdLoadListener);
    }

    public final void a(NativeAdRequestConfiguration nativeAdRequestConfiguration, wk0 wk0Var, yk0 yk0Var, ww0<cj0> ww0Var, int i10) {
        this.E = nativeAdRequestConfiguration;
        this.D = ww0Var;
        if (!ww0Var.a()) {
            b(v4.f25829l);
            return;
        }
        this.B.b(v3.f25800c);
        this.C.b(s70.f24994a, this);
        this.f18888f.a(i10);
        this.f18888f.a(nativeAdRequestConfiguration.a());
        this.f18888f.a(wk0Var);
        this.f18888f.a(nativeAdRequestConfiguration.j());
        this.f18888f.a(yk0Var);
        AdRequest adRequestBuild = new AdRequest.Builder().setAge(nativeAdRequestConfiguration.b()).setBiddingData(nativeAdRequestConfiguration.c()).setContextQuery(nativeAdRequestConfiguration.d()).setContextTags(nativeAdRequestConfiguration.e()).setGender(nativeAdRequestConfiguration.f()).setLocation(nativeAdRequestConfiguration.g()).setParameters(nativeAdRequestConfiguration.h()).setPreferredTheme(nativeAdRequestConfiguration.i()).build();
        synchronized (this) {
            c(adRequestBuild);
        }
    }

    public final void a(NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.A.a(nativeBulkAdLoadListener);
    }

    public final void a(SliderAdLoadListener sliderAdLoadListener) {
        this.A.a(sliderAdLoadListener);
    }

    @Override // com.yandex.mobile.ads.impl.ae
    public final boolean a(AdRequest adRequest) {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.ae
    public final synchronized void b(AdRequest adRequest) {
        throw null;
    }

    @Override // com.yandex.mobile.ads.impl.ae
    @SuppressLint({"VisibleForTests"})
    public final t2 t() {
        return this.f18893k.c();
    }

    public final void u() {
        b();
        this.f18894l.a();
        this.f18885c.b();
        this.A.a();
        this.C.a(s70.f24994a, this);
        a(z3.f27197a);
        this.f27796x.a();
    }
}
