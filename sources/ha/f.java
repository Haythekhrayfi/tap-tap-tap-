package ha;

import android.app.Activity;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxInterstitialAd;
import gb.x;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements MaxAdListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fd.i<x<? extends MaxInterstitialAd>> f31049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaxInterstitialAd f31050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f31051e;

    /* JADX WARN: Multi-variable type inference failed */
    public f(fd.i<? super x<? extends MaxInterstitialAd>> iVar, MaxInterstitialAd maxInterstitialAd, Activity activity) {
        this.f31049c = iVar;
        this.f31050d = maxInterstitialAd;
        this.f31051e = activity;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        xe.a.b("PremiumHelper").b("AppLovinInterstitialProvider.onAdDisplayFailed(): " + maxError, new Object[0]);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        xe.a.b("PremiumHelper").b("AppLovinInterstitialProvider: Failed to load " + maxError, new Object[0]);
        fa.g.f29433a.a(this.f31051e, "interstitial", maxError != null ? maxError.getMessage() : null);
        if (this.f31049c.a()) {
            fd.i<x<? extends MaxInterstitialAd>> iVar = this.f31049c;
            jc.i.a aVar = jc.i.f31813c;
            StringBuilder sbA = defpackage.a.a("AppLovinInterstitialProvider: Can't load ad. Error code: ");
            sbA.append(maxError != null ? Integer.valueOf(maxError.getCode()) : null);
            sbA.append(" Message - ");
            sbA.append(maxError != null ? maxError.getMessage() : null);
            iVar.resumeWith(new x.b(new IllegalStateException(sbA.toString())));
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        xe.a.c cVarB = xe.a.b("PremiumHelper");
        StringBuilder sbA = defpackage.a.a("AppLovinInterstitialProvider: loaded ad ID ");
        w wVar = null;
        sbA.append(maxAd != null ? maxAd.getDspId() : null);
        cVarB.a(sbA.toString(), new Object[0]);
        if (this.f31049c.a()) {
            if (maxAd != null) {
                fd.i<x<? extends MaxInterstitialAd>> iVar = this.f31049c;
                MaxInterstitialAd maxInterstitialAd = this.f31050d;
                jc.i.a aVar = jc.i.f31813c;
                iVar.resumeWith(new x.c(maxInterstitialAd));
                wVar = w.f31842a;
            }
            if (wVar == null) {
                fd.i<x<? extends MaxInterstitialAd>> iVar2 = this.f31049c;
                jc.i.a aVar2 = jc.i.f31813c;
                iVar2.resumeWith(new x.b(new IllegalStateException("AppLovinInterstitialProvider: The ad is empty !")));
            }
        }
    }
}
