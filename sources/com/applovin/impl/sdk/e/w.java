package com.applovin.impl.sdk.e;

import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdType;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
class w extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.c.e f10663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppLovinAdLoadListener f10664b;

    public w(com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.o oVar) {
        super("TaskRenderVastAd", oVar);
        this.f10664b = appLovinAdLoadListener;
        this.f10663a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.b(this.f10535g, "Rendering VAST ad...");
        }
        int size = this.f10663a.b().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String strA = "";
        com.applovin.impl.c.j jVarA = null;
        com.applovin.impl.c.n nVarA = null;
        com.applovin.impl.c.d dVarA = null;
        com.applovin.impl.c.c cVarA = null;
        String strA2 = "";
        for (com.applovin.impl.sdk.utils.aa aaVar : this.f10663a.b()) {
            com.applovin.impl.sdk.utils.aa aaVarC = aaVar.c(com.applovin.impl.c.m.a(aaVar) ? "Wrapper" : "InLine");
            if (aaVarC != null) {
                com.applovin.impl.sdk.utils.aa aaVarC2 = aaVarC.c("AdSystem");
                if (aaVarC2 != null) {
                    jVarA = com.applovin.impl.c.j.a(aaVarC2, jVarA, this.f10534f);
                }
                strA = com.applovin.impl.c.m.a(aaVarC, "AdTitle", strA);
                strA2 = com.applovin.impl.c.m.a(aaVarC, "Description", strA2);
                com.applovin.impl.c.m.a(aaVarC.a("Impression"), hashSet, this.f10663a, this.f10534f);
                com.applovin.impl.sdk.utils.aa aaVarB = aaVarC.b("ViewableImpression");
                if (aaVarB != null) {
                    com.applovin.impl.c.m.a(aaVarB.a("Viewable"), hashSet, this.f10663a, this.f10534f);
                }
                com.applovin.impl.sdk.utils.aa aaVarC3 = aaVarC.c("AdVerifications");
                if (aaVarC3 != null) {
                    cVarA = com.applovin.impl.c.c.a(aaVarC3, cVarA, this.f10663a, this.f10534f);
                }
                com.applovin.impl.c.m.a(aaVarC.a("Error"), hashSet2, this.f10663a, this.f10534f);
                com.applovin.impl.sdk.utils.aa aaVarB2 = aaVarC.b("Creatives");
                if (aaVarB2 != null) {
                    for (com.applovin.impl.sdk.utils.aa aaVar2 : aaVarB2.d()) {
                        com.applovin.impl.sdk.utils.aa aaVarB3 = aaVar2.b("Linear");
                        if (aaVarB3 != null) {
                            nVarA = com.applovin.impl.c.n.a(aaVarB3, nVarA, this.f10663a, this.f10534f);
                        } else {
                            com.applovin.impl.sdk.utils.aa aaVarC4 = aaVar2.c("CompanionAds");
                            if (aaVarC4 != null) {
                                com.applovin.impl.sdk.utils.aa aaVarC5 = aaVarC4.c("Companion");
                                if (aaVarC5 != null) {
                                    dVarA = com.applovin.impl.c.d.a(aaVarC5, dVarA, this.f10663a, this.f10534f);
                                }
                            } else if (com.applovin.impl.sdk.y.a()) {
                                this.f10536h.e(this.f10535g, "Received and will skip rendering for an unidentified creative: " + aaVar2);
                            }
                        }
                    }
                }
            } else if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.e(this.f10535g, "Did not find wrapper or inline response for node: " + aaVar);
            }
        }
        com.applovin.impl.c.a aVarA = new com.applovin.impl.c.a.C0119a().a(this.f10534f).a(this.f10663a.c()).b(this.f10663a.d()).a(this.f10663a.e()).a(this.f10663a.f()).a(strA).b(strA2).a(jVarA).a(nVarA).a(dVarA).a(cVarA).a(hashSet).a(cVarA).b(hashSet2).a();
        com.applovin.impl.c.f fVarA = com.applovin.impl.c.m.a(aVarA);
        if (fVarA != null) {
            com.applovin.impl.c.m.a(this.f10663a, this.f10664b, fVarA, -6, this.f10534f);
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.b(this.f10535g, "Finished rendering VAST ad: " + aVarA);
        }
        aVarA.o().b();
        h hVar = new h(aVarA, this.f10534f, this.f10664b);
        r.b bVar = r.b.CACHING_OTHER;
        if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.bx)).booleanValue()) {
            if (aVarA.getType() == AppLovinAdType.REGULAR) {
                bVar = r.b.CACHING_INTERSTITIAL;
            } else if (aVarA.getType() == AppLovinAdType.INCENTIVIZED) {
                bVar = r.b.CACHING_INCENTIVIZED;
            } else if (aVarA.getType() == AppLovinAdType.NATIVE) {
                bVar = r.b.CACHING_NATIVE;
            }
        }
        this.f10534f.G().a(hVar, bVar);
    }
}
