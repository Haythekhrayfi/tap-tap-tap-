package fa;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements MaxAdViewAdListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f29484c;

    public j(o oVar) {
        this.f29484c = oVar;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        this.f29484c.a();
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f29484c.c(new t(maxError != null ? maxError.getCode() : -1, "adFailedToDisplay", "", ""));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        this.f29484c.c(new t(maxError != null ? maxError.getCode() : -1, "failedToReceiveAd", "", ""));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        this.f29484c.d();
    }
}
