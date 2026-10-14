package com.applovin.impl.sdk;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f10309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<com.applovin.impl.sdk.ad.g> f10310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference<b.a> f10311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.utils.t f10312d;

    private c(com.applovin.impl.sdk.ad.g gVar, b.a aVar, o oVar) {
        this.f10310b = new WeakReference<>(gVar);
        this.f10311c = new WeakReference<>(aVar);
        this.f10309a = oVar;
    }

    public static c a(com.applovin.impl.sdk.ad.g gVar, b.a aVar, o oVar) {
        c cVar = new c(gVar, aVar, oVar);
        cVar.a(gVar.U());
        return cVar;
    }

    public com.applovin.impl.sdk.ad.g a() {
        return this.f10310b.get();
    }

    public void a(long j10) {
        b();
        if (((Boolean) this.f10309a.a(com.applovin.impl.sdk.c.b.bK)).booleanValue() || !this.f10309a.U().isApplicationPaused()) {
            this.f10312d = com.applovin.impl.sdk.utils.t.a(j10, this.f10309a, new Runnable() { // from class: com.applovin.impl.sdk.c.1
                @Override // java.lang.Runnable
                public void run() {
                    c.this.c();
                    c.this.f10309a.R().a(c.this);
                }
            });
        }
    }

    public void b() {
        com.applovin.impl.sdk.utils.t tVar = this.f10312d;
        if (tVar != null) {
            tVar.d();
            this.f10312d = null;
        }
    }

    public void c() {
        b();
        com.applovin.impl.sdk.ad.g gVarA = a();
        if (gVarA == null) {
            return;
        }
        gVarA.V();
        b.a aVar = this.f10311c.get();
        if (aVar == null) {
            return;
        }
        aVar.onAdExpired(gVarA);
    }
}
