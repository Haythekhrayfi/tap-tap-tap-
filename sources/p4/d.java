package p4;

import android.util.Log;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements MediationRewardedAd, AppLovinAdLoadListener, AppLovinAdRewardListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
    public static final String ERROR_MSG_AD_NOT_READY = "Ad not ready to show.";
    public static final String ERROR_MSG_MULTIPLE_REWARDED_AD = "Cannot load multiple rewarded ads with the same Zone ID. Display one ad before attempting to load another.";
    public static final String TAG = "d";
    public final MediationRewardedAdConfiguration adConfiguration;
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> adLoadCallback;
    public final p4.a appLovinAdFactory;
    public final com.google.ads.mediation.applovin.c appLovinInitializer;
    public AppLovinSdk appLovinSdk;
    public final e appLovinSdkUtilsWrapper;
    private boolean fullyWatched;
    public AppLovinIncentivizedInterstitial incentivizedInterstitial;
    private c rewardItem;
    public MediationRewardedAdCallback rewardedAdCallback;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.rewardedAdCallback = dVar.adLoadCallback.onSuccess(dVar);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AdError f34457c;

        public b(AdError adError) {
            this.f34457c = adError;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.adLoadCallback.onFailure(this.f34457c);
        }
    }

    public d(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, com.google.ads.mediation.applovin.c cVar, p4.a aVar, e eVar) {
        this.adConfiguration = mediationRewardedAdConfiguration;
        this.adLoadCallback = mediationAdLoadCallback;
        this.appLovinInitializer = cVar;
        this.appLovinAdFactory = aVar;
        this.appLovinSdkUtilsWrapper = eVar;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video clicked.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video displayed.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onAdOpened();
        this.rewardedAdCallback.reportAdImpression();
    }

    public void adHidden(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video dismissed.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        if (this.fullyWatched) {
            mediationRewardedAdCallback.onUserEarnedReward(this.rewardItem);
        }
        this.rewardedAdCallback.onAdClosed();
    }

    public void adReceived(AppLovinAd appLovinAd) {
        String str = TAG;
        StringBuilder sbA = defpackage.a.a("Rewarded video did load ad: ");
        sbA.append(appLovinAd.getAdIdNumber());
        Log.i(str, sbA.toString());
        e eVar = this.appLovinSdkUtilsWrapper;
        a aVar = new a();
        Objects.requireNonNull(eVar);
        AppLovinSdkUtils.runOnUiThread(aVar);
    }

    public void failedToReceiveAd(int i10) {
        AdError adError = AppLovinUtils.getAdError(i10);
        Log.w(TAG, adError.toString());
        e eVar = this.appLovinSdkUtilsWrapper;
        b bVar = new b(adError);
        Objects.requireNonNull(eVar);
        AppLovinSdkUtils.runOnUiThread(bVar);
    }

    public abstract void loadAd();

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
        Log.e(TAG, "Rewarded video validation request for ad did exceed quota with response: " + map);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
        Log.e(TAG, "Rewarded video validation request was rejected with response: " + map);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
        String str = map.get(AppLovinEventParameters.REVENUE_CURRENCY);
        int i10 = (int) Double.parseDouble(map.get(AppLovinEventParameters.REVENUE_AMOUNT));
        Log.d(TAG, "Rewarded " + i10 + " " + str);
        this.rewardItem = new c(i10, str);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
        Log.e(TAG, "Rewarded video validation request for ad failed with error code: " + i10);
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackBegan(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video playback began.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
        Log.d(TAG, "Rewarded video playback ended at playback percent: " + d10 + "%.");
        this.fullyWatched = z10;
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback == null || !z10) {
            return;
        }
        mediationRewardedAdCallback.onVideoComplete();
    }
}
