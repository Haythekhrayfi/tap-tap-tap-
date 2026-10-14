package p4;

import android.util.Log;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements MediationInterstitialAd, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener, AppLovinAdLoadListener {
    public static final String ERROR_MSG_MULTIPLE_INTERSTITIAL_AD = " Cannot load multiple interstitial ads with the same Zone ID. Display one ad before attempting to load another. ";
    public static final String TAG = "b";
    public final a appLovinAdFactory;
    public final com.google.ads.mediation.applovin.c appLovinInitializer;
    public AppLovinAd appLovinInterstitialAd;
    private MediationInterstitialAdCallback interstitialAdCallback;
    public final MediationInterstitialAdConfiguration interstitialAdConfiguration;
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> interstitialAdLoadCallback;
    public String zoneId;

    public b(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, com.google.ads.mediation.applovin.c cVar, a aVar) {
        this.interstitialAdConfiguration = mediationInterstitialAdConfiguration;
        this.interstitialAdLoadCallback = mediationAdLoadCallback;
        this.appLovinInitializer = cVar;
        this.appLovinAdFactory = aVar;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        Log.d(TAG, "Interstitial clicked.");
        this.interstitialAdCallback.reportAdClicked();
        this.interstitialAdCallback.onAdLeftApplication();
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        Log.d(TAG, "Interstitial displayed.");
        this.interstitialAdCallback.onAdOpened();
    }

    public void adHidden(AppLovinAd appLovinAd) {
        Log.d(TAG, "Interstitial dismissed.");
        this.interstitialAdCallback.onAdClosed();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        String str = TAG;
        StringBuilder sbA = defpackage.a.a("Interstitial did load ad: ");
        sbA.append(appLovinAd.getAdIdNumber());
        sbA.append(" for zone: ");
        sbA.append(this.zoneId);
        Log.d(str, sbA.toString());
        this.appLovinInterstitialAd = appLovinAd;
        this.interstitialAdCallback = this.interstitialAdLoadCallback.onSuccess(this);
    }

    public void failedToReceiveAd(int i10) {
        AdError adError = AppLovinUtils.getAdError(i10);
        Log.w(TAG, adError.getMessage());
        this.interstitialAdLoadCallback.onFailure(adError);
    }

    public abstract void loadAd();

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackBegan(AppLovinAd appLovinAd) {
        Log.d(TAG, "Interstitial video playback began.");
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
        Log.d(TAG, "Interstitial video playback ended at playback percent: " + d10 + "%.");
    }
}
