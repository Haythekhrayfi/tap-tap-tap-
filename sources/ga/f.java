package ga;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import fd.j0;
import gb.x;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends InterstitialAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd.i<x<? extends InterstitialAd>> f30159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f30160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f30161c;

    /* JADX WARN: Multi-variable type inference failed */
    public f(fd.i<? super x<? extends InterstitialAd>> iVar, g gVar, Context context) {
        this.f30159a = iVar;
        this.f30160b = gVar;
        this.f30161c = context;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        j0.i(loadAdError, "error");
        xe.a.c cVarB = xe.a.b("PremiumHelper");
        StringBuilder sbA = defpackage.a.a("AdMobInterstitial: Failed to load ");
        sbA.append(loadAdError.getCode());
        sbA.append(" (");
        sbA.append(loadAdError.getMessage());
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        cVarB.b(sbA.toString(), new Object[0]);
        fa.g.f29433a.a(this.f30161c, "interstitial", loadAdError.getMessage());
        if (this.f30159a.a()) {
            fd.i<x<? extends InterstitialAd>> iVar = this.f30159a;
            jc.i.a aVar = jc.i.f31813c;
            iVar.resumeWith(new x.b(new IllegalStateException(loadAdError.getMessage())));
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd interstitialAd2 = interstitialAd;
        j0.i(interstitialAd2, "ad");
        xe.a.c cVarB = xe.a.b("PremiumHelper");
        StringBuilder sbA = defpackage.a.a("AdMobInterstitial: loaded ad from ");
        sbA.append(interstitialAd2.getResponseInfo().getMediationAdapterClassName());
        cVarB.a(sbA.toString(), new Object[0]);
        if (this.f30159a.a()) {
            interstitialAd2.setOnPaidEventListener(new e(this.f30160b, interstitialAd2));
            fd.i<x<? extends InterstitialAd>> iVar = this.f30159a;
            jc.i.a aVar = jc.i.f31813c;
            iVar.resumeWith(new x.c(interstitialAd2));
        }
    }
}
