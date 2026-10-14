package ga;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements OnPaidEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdView f30120a;

    public a(AdView adView) {
        this.f30120a = adView;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void onPaidEvent(AdValue adValue) {
        j0.i(adValue, "adValue");
        com.zipoapps.premiumhelper.a aVar = ma.h.f33410y.a().f33419h;
        String adUnitId = this.f30120a.getAdUnitId();
        j0.h(adUnitId, "adUnitId");
        ResponseInfo responseInfo = this.f30120a.getResponseInfo();
        aVar.m(adUnitId, adValue, responseInfo != null ? responseInfo.getMediationAdapterClassName() : null);
    }
}
