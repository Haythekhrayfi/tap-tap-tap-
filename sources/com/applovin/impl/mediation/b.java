package com.applovin.impl.mediation;

import com.applovin.impl.sdk.o;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class b implements a.InterfaceC0120a, c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f9171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f9172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MaxAdListener f9173c;

    public b(o oVar, MaxAdListener maxAdListener) {
        this.f9173c = maxAdListener;
        this.f9171a = new a(oVar);
        this.f9172b = new c(oVar, this);
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0120a
    public void a(final com.applovin.impl.mediation.a.c cVar) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.f9173c.onAdHidden(cVar);
            }
        }, cVar.K());
    }

    public void a(MaxAd maxAd) {
        this.f9172b.a();
        this.f9171a.a();
    }

    public void b(com.applovin.impl.mediation.a.c cVar) {
        long jI = cVar.I();
        if (jI >= 0) {
            this.f9172b.a(cVar, jI);
        }
        if (cVar.J()) {
            this.f9171a.a(cVar, this);
        }
    }

    @Override // com.applovin.impl.mediation.c.a
    public void c(com.applovin.impl.mediation.a.c cVar) {
        this.f9173c.onAdHidden(cVar);
    }
}
