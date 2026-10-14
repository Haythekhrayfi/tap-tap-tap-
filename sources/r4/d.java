package r4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class d extends UnifiedNativeAdMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationNativeAdConfiguration f35159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f35160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NativeAdBase f35161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediationNativeAdCallback f35162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MediaView f35163e;

    public class a extends NativeAd.Image {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f35164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Uri f35165b;

        public a(d dVar) {
        }

        public a(d dVar, Drawable drawable) {
            this.f35164a = drawable;
        }

        public a(d dVar, Uri uri) {
            this.f35165b = uri;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.f35164a;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.f35165b;
        }
    }

    public class b implements AdListener, NativeAdListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WeakReference<Context> f35166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final NativeAdBase f35167d;

        public b(Context context, NativeAdBase nativeAdBase) {
            this.f35167d = nativeAdBase;
            this.f35166c = new WeakReference<>(context);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            d.this.f35162d.reportAdClicked();
            d.this.f35162d.onAdOpened();
            d.this.f35162d.onAdLeftApplication();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            if (ad2 != this.f35167d) {
                AdError adError = new AdError(106, "Ad Loaded is not a Native Ad.", FacebookMediationAdapter.ERROR_DOMAIN);
                Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
                d.this.f35160b.onFailure(adError);
                return;
            }
            Context context = this.f35166c.get();
            if (context == null) {
                AdError adError2 = new AdError(107, "Context is null.", FacebookMediationAdapter.ERROR_DOMAIN);
                Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
                d.this.f35160b.onFailure(adError2);
                return;
            }
            d dVar = d.this;
            NativeAdBase nativeAdBase = dVar.f35161c;
            boolean z10 = false;
            boolean z11 = (nativeAdBase.getAdHeadline() == null || nativeAdBase.getAdBodyText() == null || nativeAdBase.getAdIcon() == null || nativeAdBase.getAdCallToAction() == null) ? false : true;
            if (!(nativeAdBase instanceof NativeBannerAd)) {
                if (z11 && nativeAdBase.getAdCoverImage() != null && dVar.f35163e != null) {
                    z10 = true;
                }
                z11 = z10;
            }
            if (!z11) {
                AdError adError3 = new AdError(108, "Ad from Meta Audience Network doesn't have all required assets.", FacebookMediationAdapter.ERROR_DOMAIN);
                String str = FacebookMediationAdapter.TAG;
                Log.w(str, adError3.getMessage());
                Log.w(str, adError3.getMessage());
                d.this.f35160b.onFailure(adError3);
                return;
            }
            dVar.setHeadline(dVar.f35161c.getAdHeadline());
            if (dVar.f35161c.getAdCoverImage() != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new a(dVar, Uri.parse(dVar.f35161c.getAdCoverImage().getUrl())));
                dVar.setImages(arrayList);
            }
            dVar.setBody(dVar.f35161c.getAdBodyText());
            if (dVar.f35161c.getPreloadedIconViewDrawable() == null) {
                dVar.setIcon(dVar.f35161c.getAdIcon() == null ? new a(dVar) : new a(dVar, Uri.parse(dVar.f35161c.getAdIcon().getUrl())));
            } else {
                dVar.setIcon(new a(dVar, dVar.f35161c.getPreloadedIconViewDrawable()));
            }
            dVar.setCallToAction(dVar.f35161c.getAdCallToAction());
            dVar.setAdvertiser(dVar.f35161c.getAdvertiserName());
            dVar.f35163e.setListener(new c(dVar));
            dVar.setHasVideoContent(true);
            dVar.setMediaView(dVar.f35163e);
            Bundle bundle = new Bundle();
            bundle.putCharSequence(FacebookMediationAdapter.KEY_ID, dVar.f35161c.getId());
            bundle.putCharSequence(FacebookMediationAdapter.KEY_SOCIAL_CONTEXT_ASSET, dVar.f35161c.getAdSocialContext());
            dVar.setExtras(bundle);
            dVar.setAdChoicesContent(new AdOptionsView(context, dVar.f35161c, null));
            d dVar2 = d.this;
            dVar2.f35162d = dVar2.f35160b.onSuccess(dVar2);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            d.this.f35160b.onFailure(adError2);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad2) {
            Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
        }
    }

    public d(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.f35160b = mediationAdLoadCallback;
        this.f35159a = mediationNativeAdConfiguration;
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        setOverrideClickHandling(true);
        ArrayList arrayList = new ArrayList(map.values());
        View view2 = map.get("3003");
        NativeAdBase nativeAdBase = this.f35161c;
        if (nativeAdBase instanceof NativeBannerAd) {
            if (view2 == null) {
                Log.w(FacebookMediationAdapter.TAG, "Missing or invalid native ad icon asset. Meta Audience Network impression recording might be impacted for this ad.");
                return;
            } else if (view2 instanceof ImageView) {
                ((NativeBannerAd) nativeAdBase).registerViewForInteraction(view, (ImageView) view2, arrayList);
                return;
            } else {
                Log.w(FacebookMediationAdapter.TAG, String.format("Native ad icon asset is rendered with an incompatible class type. Meta Audience Network impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", view2.getClass()));
                return;
            }
        }
        if (!(nativeAdBase instanceof com.facebook.ads.NativeAd)) {
            Log.w(FacebookMediationAdapter.TAG, "Native ad type is not of type NativeAd or NativeBannerAd. It is not currently supported by the Meta Audience Network Adapter. Meta Audience Network impression recording might be impacted for this ad.");
            return;
        }
        com.facebook.ads.NativeAd nativeAd = (com.facebook.ads.NativeAd) nativeAdBase;
        if (view2 instanceof ImageView) {
            nativeAd.registerViewForInteraction(view, this.f35163e, (ImageView) view2, arrayList);
        } else {
            Log.w(FacebookMediationAdapter.TAG, "Native icon asset is not of type ImageView. Calling registerViewForInteraction() without a reference to the icon view.");
            nativeAd.registerViewForInteraction(view, this.f35163e, arrayList);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        NativeAdBase nativeAdBase = this.f35161c;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
        }
        super.untrackView(view);
    }
}
