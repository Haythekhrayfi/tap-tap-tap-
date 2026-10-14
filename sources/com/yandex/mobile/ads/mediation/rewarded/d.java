package com.yandex.mobile.ads.mediation.rewarded;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.b7;
import com.yandex.mobile.ads.impl.by0;
import com.yandex.mobile.ads.impl.dy0;
import com.yandex.mobile.ads.impl.id0;
import com.yandex.mobile.ads.impl.t2;
import com.yandex.mobile.ads.impl.u20;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class d implements MediatedRewardedAdapterListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<dy0> f27638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<by0> f27639b = new WeakReference<>(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final id0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> f27640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u20 f27641d;

    public d(dy0 dy0Var, id0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> id0Var) {
        this.f27638a = new WeakReference<>(dy0Var);
        this.f27640c = id0Var;
        this.f27641d = new u20(id0Var);
    }

    public final void a(by0 by0Var) {
        this.f27639b = new WeakReference<>(by0Var);
    }

    @Override // com.yandex.mobile.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onAdImpression() {
        by0 by0Var;
        if (this.f27640c.b() || (by0Var = this.f27639b.get()) == null) {
            return;
        }
        Context contextC = by0Var.c();
        id0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> id0Var = this.f27640c;
        Objects.requireNonNull(id0Var);
        id0Var.b(contextC, new HashMap());
        by0Var.a(this.f27641d.a());
    }

    @Override // com.yandex.mobile.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewarded(MediatedReward mediatedReward) {
        by0 by0Var = this.f27639b.get();
        if (by0Var != null) {
            this.f27640c.a(by0Var.c(), by0Var.b());
            by0Var.r();
        }
    }

    @Override // com.yandex.mobile.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdClicked() {
        by0 by0Var = this.f27639b.get();
        if (by0Var != null) {
            Context contextC = by0Var.c();
            id0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> id0Var = this.f27640c;
            Objects.requireNonNull(id0Var);
            id0Var.a(contextC, new HashMap());
        }
    }

    @Override // com.yandex.mobile.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdDismissed() {
        by0 by0Var = this.f27639b.get();
        if (by0Var != null) {
            by0Var.o();
        }
    }

    @Override // com.yandex.mobile.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdFailedToLoad(AdRequestError adRequestError) {
        dy0 dy0Var = this.f27638a.get();
        if (dy0Var != null) {
            this.f27640c.b(dy0Var.i(), new t2(adRequestError.getCode(), adRequestError.getDescription()), this);
        }
    }

    @Override // com.yandex.mobile.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdLeftApplication() {
        by0 by0Var = this.f27639b.get();
        if (by0Var != null) {
            by0Var.onLeftApplication();
        }
    }

    @Override // com.yandex.mobile.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdLoaded() {
        dy0 dy0Var = this.f27638a.get();
        if (dy0Var != null) {
            Context contextI = dy0Var.i();
            id0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> id0Var = this.f27640c;
            Objects.requireNonNull(id0Var);
            id0Var.c(contextI, new HashMap());
            dy0Var.b(new b7(this.f27640c).a());
            dy0Var.p();
        }
    }

    @Override // com.yandex.mobile.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdShown() {
        by0 by0Var;
        by0 by0Var2 = this.f27639b.get();
        if (by0Var2 != null) {
            by0Var2.p();
            this.f27640c.c(by0Var2.c());
        }
        if (!this.f27640c.b() || (by0Var = this.f27639b.get()) == null) {
            return;
        }
        Context contextC = by0Var.c();
        id0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> id0Var = this.f27640c;
        Objects.requireNonNull(id0Var);
        id0Var.b(contextC, new HashMap());
        by0Var.a(this.f27641d.a());
    }
}
