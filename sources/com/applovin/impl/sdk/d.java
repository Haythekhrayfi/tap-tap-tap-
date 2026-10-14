package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f10415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f10416b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<com.applovin.impl.sdk.ad.d, aa> f10418d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<com.applovin.impl.sdk.ad.d, aa> f10419e = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10417c = new Object();

    public d(o oVar) {
        this.f10415a = oVar;
        this.f10416b = oVar.F();
        for (com.applovin.impl.sdk.ad.d dVar : com.applovin.impl.sdk.ad.d.f()) {
            this.f10418d.put(dVar, new aa());
            this.f10419e.put(dVar, new aa());
        }
    }

    private aa d(com.applovin.impl.sdk.ad.d dVar) {
        aa aaVar;
        synchronized (this.f10417c) {
            aaVar = this.f10418d.get(dVar);
            if (aaVar == null) {
                aaVar = new aa();
                this.f10418d.put(dVar, aaVar);
            }
        }
        return aaVar;
    }

    private aa e(com.applovin.impl.sdk.ad.d dVar) {
        aa aaVar;
        synchronized (this.f10417c) {
            aaVar = this.f10419e.get(dVar);
            if (aaVar == null) {
                aaVar = new aa();
                this.f10419e.put(dVar, aaVar);
            }
        }
        return aaVar;
    }

    private aa f(com.applovin.impl.sdk.ad.d dVar) {
        synchronized (this.f10417c) {
            aa aaVarE = e(dVar);
            if (aaVarE.a() > 0) {
                return aaVarE;
            }
            return d(dVar);
        }
    }

    public AppLovinAdImpl a(com.applovin.impl.sdk.ad.d dVar) {
        com.applovin.impl.sdk.ad.f fVar;
        y yVar;
        String str;
        StringBuilder sb2;
        String str2;
        synchronized (this.f10417c) {
            aa aaVarD = d(dVar);
            if (aaVarD.a() > 0) {
                e(dVar).a(aaVarD.c());
                fVar = new com.applovin.impl.sdk.ad.f(dVar, this.f10415a);
            } else {
                fVar = null;
            }
        }
        boolean zA = y.a();
        if (fVar != null) {
            if (zA) {
                yVar = this.f10416b;
                str = "AdPreloadManager";
                sb2 = new StringBuilder();
                str2 = "Retrieved ad of zone ";
                sb2.append(str2);
                sb2.append(dVar);
                sb2.append("...");
                yVar.b(str, sb2.toString());
            }
        } else if (zA) {
            yVar = this.f10416b;
            str = "AdPreloadManager";
            sb2 = new StringBuilder();
            str2 = "Unable to retrieve ad of zone ";
            sb2.append(str2);
            sb2.append(dVar);
            sb2.append("...");
            yVar.b(str, sb2.toString());
        }
        return fVar;
    }

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f10417c) {
            d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
            if (y.a()) {
                this.f10416b.b("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
            }
        }
    }

    public AppLovinAdImpl b(com.applovin.impl.sdk.ad.d dVar) {
        AppLovinAdImpl appLovinAdImplC;
        synchronized (this.f10417c) {
            appLovinAdImplC = f(dVar).c();
        }
        return appLovinAdImplC;
    }

    public AppLovinAdBase c(com.applovin.impl.sdk.ad.d dVar) {
        AppLovinAdImpl appLovinAdImplD;
        synchronized (this.f10417c) {
            appLovinAdImplD = f(dVar).d();
        }
        return appLovinAdImplD;
    }
}
