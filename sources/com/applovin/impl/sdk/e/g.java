package com.applovin.impl.sdk.e;

import android.net.Uri;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f10558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f10559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f10560l;

    public g(com.applovin.impl.sdk.ad.a aVar, com.applovin.impl.sdk.o oVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, oVar, appLovinAdLoadListener);
        this.f10558j = aVar;
    }

    private void l() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.b(this.f10535g, "Caching HTML resources...");
        }
        String strA = a(this.f10558j.b(), this.f10558j.L(), this.f10558j);
        if (this.f10558j.q() && this.f10558j.isOpenMeasurementEnabled()) {
            strA = this.f10534f.ad().a(strA);
        }
        this.f10558j.a(strA);
        this.f10558j.a(true);
        if (com.applovin.impl.sdk.y.a()) {
            com.applovin.impl.sdk.y yVar = this.f10536h;
            String str = this.f10535g;
            StringBuilder sbA = defpackage.a.a("Finish caching non-video resources for ad #");
            sbA.append(this.f10558j.getAdIdNumber());
            yVar.b(str, sbA.toString());
        }
        com.applovin.impl.sdk.y yVar2 = this.f10536h;
        String str2 = this.f10535g;
        StringBuilder sbA2 = defpackage.a.a("Ad updated with cachedHTML = ");
        sbA2.append(this.f10558j.b());
        yVar2.a(str2, sbA2.toString());
    }

    private void m() {
        Uri uriB;
        if (b() || (uriB = b(this.f10558j.i())) == null) {
            return;
        }
        if (this.f10558j.aR()) {
            this.f10558j.a(this.f10558j.b().replaceFirst(this.f10558j.e(), uriB.toString()));
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.b(this.f10535g, "Replaced video URL with cached video URI in HTML for web video ad");
            }
        }
        this.f10558j.g();
        this.f10558j.a(uriB);
    }

    private c n() {
        return b(this.f10558j.i(), new c.a() { // from class: com.applovin.impl.sdk.e.g.1
            @Override // com.applovin.impl.sdk.e.c.a
            public void a(Uri uri) {
                if (uri != null) {
                    if (g.this.f10558j.aR()) {
                        g.this.f10558j.a(g.this.f10558j.b().replaceFirst(g.this.f10558j.e(), uri.toString()));
                        com.applovin.impl.sdk.y yVar = g.this.f10536h;
                        if (com.applovin.impl.sdk.y.a()) {
                            g gVar = g.this;
                            gVar.f10536h.b(gVar.f10535g, "Replaced video URL with cached video URI in HTML for web video ad");
                        }
                    }
                    g.this.f10558j.g();
                    g.this.f10558j.a(uri);
                }
            }
        });
    }

    private b o() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.b(this.f10535g, "Caching HTML resources...");
        }
        return a(this.f10558j.b(), this.f10558j.L(), new f.a() { // from class: com.applovin.impl.sdk.e.g.2
            @Override // com.applovin.impl.sdk.e.f.a
            public void a(String str) {
                if (g.this.f10558j.q() && g.this.f10558j.isOpenMeasurementEnabled()) {
                    str = g.this.f10534f.ad().a(str);
                }
                g.this.f10558j.a(str);
                g.this.f10558j.a(true);
                com.applovin.impl.sdk.y yVar = g.this.f10536h;
                if (com.applovin.impl.sdk.y.a()) {
                    g gVar = g.this;
                    com.applovin.impl.sdk.y yVar2 = gVar.f10536h;
                    String str2 = gVar.f10535g;
                    StringBuilder sbA = defpackage.a.a("Finish caching non-video resources for ad #");
                    sbA.append(g.this.f10558j.getAdIdNumber());
                    yVar2.b(str2, sbA.toString());
                }
                g gVar2 = g.this;
                com.applovin.impl.sdk.y yVar3 = gVar2.f10536h;
                String str3 = gVar2.f10535g;
                StringBuilder sbA2 = defpackage.a.a("Ad updated with cachedHTML = ");
                sbA2.append(g.this.f10558j.b());
                yVar3.a(str3, sbA2.toString());
            }
        });
    }

    public void b(boolean z10) {
        this.f10559k = z10;
    }

    public void c(boolean z10) {
        this.f10560l = z10;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f1 A[PHI: r0
  0x00f1: PHI (r0v5 com.applovin.impl.sdk.e.a) = (r0v4 com.applovin.impl.sdk.e.a), (r0v8 com.applovin.impl.sdk.e.a), (r0v11 com.applovin.impl.sdk.e.a) binds: [B:41:0x00ef, B:38:0x00e5, B:32:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.applovin.impl.sdk.e.f, java.lang.Runnable
    public void run() {
        a aVarO;
        super.run();
        boolean zF = this.f10558j.f();
        boolean z10 = this.f10560l;
        if (zF || z10) {
            if (com.applovin.impl.sdk.y.a()) {
                com.applovin.impl.sdk.y yVar = this.f10536h;
                String str = this.f10535g;
                StringBuilder sbA = defpackage.a.a("Begin caching for streaming ad #");
                sbA.append(this.f10558j.getAdIdNumber());
                sbA.append("...");
                yVar.b(str, sbA.toString());
            }
            if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.bH)).booleanValue()) {
                a(h());
                ArrayList arrayList = new ArrayList();
                if (!zF) {
                    k();
                    aVarO = o();
                    if (aVarO != null) {
                        arrayList.add(aVarO);
                    }
                } else if (this.f10559k) {
                    k();
                    b bVarO = o();
                    if (bVarO != null) {
                        arrayList.add(bVarO);
                    }
                    aVarO = n();
                    if (aVarO != null) {
                        arrayList.add(aVarO);
                    }
                } else {
                    b bVarO2 = o();
                    if (bVarO2 != null) {
                        a(Arrays.asList(bVarO2));
                    }
                    k();
                    aVarO = n();
                    if (aVarO != null) {
                        arrayList.add(aVarO);
                    }
                }
                a(arrayList);
            } else {
                i();
                if (zF) {
                    if (this.f10559k) {
                        k();
                    }
                    l();
                    if (!this.f10559k) {
                        k();
                    }
                    m();
                } else {
                    k();
                    l();
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f10558j.getCreatedAtMillis();
            com.applovin.impl.sdk.d.d.a(this.f10558j, this.f10534f);
            com.applovin.impl.sdk.d.d.a(jCurrentTimeMillis, this.f10558j, this.f10534f);
            a(this.f10558j);
            a();
        }
        if (com.applovin.impl.sdk.y.a()) {
            com.applovin.impl.sdk.y yVar2 = this.f10536h;
            String str2 = this.f10535g;
            StringBuilder sbA2 = defpackage.a.a("Begin processing for non-streaming ad #");
            sbA2.append(this.f10558j.getAdIdNumber());
            sbA2.append("...");
            yVar2.b(str2, sbA2.toString());
        }
        if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.bH)).booleanValue()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(h());
            b bVarO3 = o();
            if (bVarO3 != null) {
                arrayList2.add(bVarO3);
            }
            c cVarN = n();
            if (cVarN != null) {
                arrayList2.add(cVarN);
            }
            a(arrayList2);
        } else {
            i();
            l();
            m();
        }
        k();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f10558j.getCreatedAtMillis();
        com.applovin.impl.sdk.d.d.a(this.f10558j, this.f10534f);
        com.applovin.impl.sdk.d.d.a(jCurrentTimeMillis2, this.f10558j, this.f10534f);
        a(this.f10558j);
        a();
    }
}
