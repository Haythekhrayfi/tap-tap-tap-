package o4;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AdListener implements AppEventListener, zza {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractAdViewAdapter f33953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediationBannerListener f33954d;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f33953c = abstractAdViewAdapter;
        this.f33954d = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f33954d.onAdClicked(this.f33953c);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f33954d.onAdClosed(this.f33953c);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f33954d.onAdFailedToLoad(this.f33953c, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f33954d.onAdLoaded(this.f33953c);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f33954d.onAdOpened(this.f33953c);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.f33954d.zzd(this.f33953c, str, str2);
    }
}
