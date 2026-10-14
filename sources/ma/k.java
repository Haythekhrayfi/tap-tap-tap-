package ma;

import com.applovin.sdk.AppLovinSdk;
import gb.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f33479a;

    public k(h hVar) {
        this.f33479a = hVar;
    }

    @Override // gb.a0.a
    public void a() {
        com.zipoapps.ads.a aVar = this.f33479a.f33421j;
        oa.b.a aVar2 = aVar.f28028e;
        if (aVar2 == oa.b.a.APPLOVIN) {
            if (com.zipoapps.ads.a.c.f28038a[aVar2.ordinal()] == 2) {
                AppLovinSdk.getInstance(aVar.f28024a).showMediationDebugger();
                return;
            }
            ta.d dVarD = aVar.d();
            StringBuilder sbA = defpackage.a.a("Current provider doesn't support debug screen. ");
            sbA.append(aVar.f28028e);
            dVarD.b(sbA.toString(), new Object[0]);
        }
    }
}
