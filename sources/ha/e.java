package ha;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements MaxAdRevenueListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f31048c = new e();

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public final void onAdRevenuePaid(MaxAd maxAd) {
        com.zipoapps.premiumhelper.a aVar = ma.h.f33410y.a().f33419h;
        j0.h(maxAd, "ad");
        aVar.l(l.a(maxAd));
    }
}
