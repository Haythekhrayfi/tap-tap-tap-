package ha;

import android.content.Context;
import android.view.View;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import fa.t;
import gb.x;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements MaxAdViewAdListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fd.i<x<? extends View>> f31006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fa.o f31007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MaxAdView f31008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f31009f;

    /* JADX WARN: Multi-variable type inference failed */
    public c(fd.i<? super x<? extends View>> iVar, fa.o oVar, MaxAdView maxAdView, Context context) {
        this.f31006c = iVar;
        this.f31007d = oVar;
        this.f31008e = maxAdView;
        this.f31009f = context;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        this.f31007d.a();
        xe.a.c cVarB = xe.a.b("AppLovin");
        StringBuilder sbA = defpackage.a.a("adClicked()-> ");
        sbA.append(maxAd != null ? maxAd.getDspId() : null);
        cVarB.a(sbA.toString(), new Object[0]);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        xe.a.b("AppLovin").b("failedToReceiveAd()-> Error : " + maxError, new Object[0]);
        this.f31007d.c(new t(maxError != null ? maxError.getCode() : -1, "adFailedToDisplay", "", ""));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        xe.a.c cVarB = xe.a.b("AppLovin");
        StringBuilder sbA = defpackage.a.a("adDisplayed()-> ");
        sbA.append(maxAd != null ? maxAd.getDspName() : null);
        cVarB.a(sbA.toString(), new Object[0]);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        xe.a.c cVarB = xe.a.b("AppLovin");
        StringBuilder sbA = defpackage.a.a("adHidden()-> ");
        sbA.append(maxAd != null ? maxAd.getAdUnitId() : null);
        cVarB.a(sbA.toString(), new Object[0]);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        xe.a.b("AppLovin").b("failedToReceiveAd()-> Error: " + maxError, new Object[0]);
        fa.g.f29433a.a(this.f31009f, "banner", maxError != null ? maxError.getMessage() : null);
        this.f31007d.c(new t(maxError != null ? maxError.getCode() : -1, "failedToReceiveAd", "", ""));
        if (this.f31006c.a()) {
            fd.i<x<? extends View>> iVar = this.f31006c;
            jc.i.a aVar = jc.i.f31813c;
            iVar.resumeWith(new x.b(new IllegalStateException("Can't load banner. Error: " + maxError)));
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        if (this.f31006c.a()) {
            this.f31007d.d();
            fd.i<x<? extends View>> iVar = this.f31006c;
            jc.i.a aVar = jc.i.f31813c;
            iVar.resumeWith(new x.c(this.f31008e));
        }
    }
}
