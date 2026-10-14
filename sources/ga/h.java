package ga;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.nativead.NativeAd;
import fd.j0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements NativeAd.OnNativeAdLoadedListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NativeAd.OnNativeAdLoadedListener f30163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f30164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f30165e;

    public static final class a implements OnPaidEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f30166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f30167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ NativeAd f30168c;

        public a(boolean z10, j jVar, NativeAd nativeAd) {
            this.f30166a = z10;
            this.f30167b = jVar;
            this.f30168c = nativeAd;
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public final void onPaidEvent(AdValue adValue) {
            j0.i(adValue, "adValue");
            if (!this.f30166a) {
                com.zipoapps.premiumhelper.a aVar = ma.h.f33410y.a().f33419h;
                com.zipoapps.ads.a.EnumC0215a enumC0215a = com.zipoapps.ads.a.EnumC0215a.NATIVE;
                KProperty<Object>[] kPropertyArr = com.zipoapps.premiumhelper.a.f28252m;
                aVar.h(enumC0215a, null);
            }
            com.zipoapps.premiumhelper.a aVar2 = ma.h.f33410y.a().f33419h;
            String str = this.f30167b.f30172a;
            ResponseInfo responseInfo = this.f30168c.getResponseInfo();
            aVar2.m(str, adValue, responseInfo != null ? responseInfo.getMediationAdapterClassName() : null);
        }
    }

    public h(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener, boolean z10, j jVar) {
        this.f30163c = onNativeAdLoadedListener;
        this.f30164d = z10;
        this.f30165e = jVar;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        j0.i(nativeAd, "ad");
        xe.a.c cVarB = xe.a.b("PremiumHelper");
        StringBuilder sbA = defpackage.a.a("AdMobNative: forNativeAd ");
        sbA.append(nativeAd.getHeadline());
        cVarB.a(sbA.toString(), new Object[0]);
        nativeAd.setOnPaidEventListener(new a(this.f30164d, this.f30165e, nativeAd));
        xe.a.c cVarB2 = xe.a.b("PremiumHelper");
        StringBuilder sbA2 = defpackage.a.a("AdMobNative: loaded ad from ");
        ResponseInfo responseInfo = nativeAd.getResponseInfo();
        sbA2.append(responseInfo != null ? responseInfo.getMediationAdapterClassName() : null);
        cVarB2.a(sbA2.toString(), new Object[0]);
        this.f30163c.onNativeAdLoaded(nativeAd);
    }
}
