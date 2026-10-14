package ha;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import fd.j0;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements MaxAdRevenueListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f31055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fa.o f31056d;

    public i(boolean z10, fa.o oVar) {
        this.f31055c = z10;
        this.f31056d = oVar;
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public final void onAdRevenuePaid(MaxAd maxAd) {
        if (!this.f31055c) {
            ma.h.f33410y.a().f33419h.h(com.zipoapps.ads.a.EnumC0215a.NATIVE, null);
        }
        com.zipoapps.premiumhelper.a aVar = ma.h.f33410y.a().f33419h;
        j0.h(maxAd, "ad");
        aVar.l(l.a(maxAd));
        Objects.requireNonNull(this.f31056d);
    }
}
