package ga;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements OnPaidEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f30157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterstitialAd f30158b;

    public e(g gVar, InterstitialAd interstitialAd) {
        this.f30157a = gVar;
        this.f30158b = interstitialAd;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void onPaidEvent(AdValue adValue) {
        j0.i(adValue, "adValue");
        ma.h.f33410y.a().f33419h.m(this.f30157a.f30162a, adValue, this.f30158b.getResponseInfo().getMediationAdapterClassName());
    }
}
