package com.yandex.mobile.ads.mediation.interstitial;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.b7;
import com.yandex.mobile.ads.impl.id0;
import com.yandex.mobile.ads.impl.nx;
import com.yandex.mobile.ads.impl.t2;
import com.yandex.mobile.ads.impl.u20;
import com.yandex.mobile.ads.impl.vw;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class a<T extends nx<T>> implements MediatedInterstitialAdapter.MediatedInterstitialAdapterListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<vw<T>> f27535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<nx<T>> f27536b = new WeakReference<>(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final id0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> f27537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u20 f27538d;

    public a(vw<T> vwVar, id0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> id0Var) {
        this.f27535a = new WeakReference<>(vwVar);
        this.f27537c = id0Var;
        this.f27538d = new u20(id0Var);
    }

    public final void a(nx<T> nxVar) {
        this.f27536b = new WeakReference<>(nxVar);
    }

    @Override // com.yandex.mobile.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onAdImpression() {
        nx<T> nxVar;
        if (this.f27537c.b() || (nxVar = this.f27536b.get()) == null) {
            return;
        }
        Context contextC = nxVar.c();
        id0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> id0Var = this.f27537c;
        Objects.requireNonNull(id0Var);
        id0Var.b(contextC, new HashMap());
        nxVar.a(this.f27538d.a());
    }

    @Override // com.yandex.mobile.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialClicked() {
        nx<T> nxVar = this.f27536b.get();
        if (nxVar != null) {
            Context contextC = nxVar.c();
            id0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> id0Var = this.f27537c;
            Objects.requireNonNull(id0Var);
            id0Var.a(contextC, new HashMap());
        }
    }

    @Override // com.yandex.mobile.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialDismissed() {
        nx<T> nxVar = this.f27536b.get();
        if (nxVar != null) {
            nxVar.o();
        }
    }

    @Override // com.yandex.mobile.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialFailedToLoad(AdRequestError adRequestError) {
        vw<T> vwVar = this.f27535a.get();
        if (vwVar != null) {
            this.f27537c.b(vwVar.i(), new t2(adRequestError.getCode(), adRequestError.getDescription()), this);
        }
    }

    @Override // com.yandex.mobile.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialLeftApplication() {
        nx<T> nxVar = this.f27536b.get();
        if (nxVar != null) {
            nxVar.onLeftApplication();
        }
    }

    @Override // com.yandex.mobile.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialLoaded() {
        vw<T> vwVar = this.f27535a.get();
        if (vwVar != null) {
            Context contextI = vwVar.i();
            id0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> id0Var = this.f27537c;
            Objects.requireNonNull(id0Var);
            id0Var.c(contextI, new HashMap());
            vwVar.b(new b7(this.f27537c).a());
            vwVar.p();
        }
    }

    @Override // com.yandex.mobile.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialShown() {
        nx<T> nxVar;
        nx<T> nxVar2 = this.f27536b.get();
        if (nxVar2 != null) {
            nxVar2.p();
            this.f27537c.c(nxVar2.c());
        }
        if (!this.f27537c.b() || (nxVar = this.f27536b.get()) == null) {
            return;
        }
        Context contextC = nxVar.c();
        id0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> id0Var = this.f27537c;
        Objects.requireNonNull(id0Var);
        id0Var.b(contextC, new HashMap());
        nxVar.a(this.f27538d.a());
    }
}
