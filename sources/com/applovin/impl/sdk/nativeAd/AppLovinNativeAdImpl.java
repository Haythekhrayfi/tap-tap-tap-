package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ad;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.network.l;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.u;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinNativeAdImpl extends AppLovinAdBase implements View.OnClickListener, AppLovinNativeAd {
    private static final String AD_RESPONSE_TYPE_APPLOVIN = "applovin";
    private static final String AD_RESPONSE_TYPE_ORTB = "ortb";
    private static final String AD_RESPONSE_TYPE_UNDEFINED = "undefined";
    private static final String DEFAULT_APPLOVIN_PRIVACY_URL = "https://www.applovin.com/privacy/";
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private static final String TAG = "AppLovinNativeAd";
    private static final int VIEWABLE_MRC100_PERCENTAGE = 100;
    private static final int VIEWABLE_MRC50_PERCENTAGE = 50;
    private static final int VIEWABLE_MRC_REQUIRED_SECONDS = 1;
    private static final int VIEWABLE_VIDEO_MRC_REQUIRED_SECONDS = 2;
    private final com.applovin.impl.sdk.a.e adEventTracker;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final Uri clickDestinationBackupUri;
    private final Uri clickDestinationUri;
    private final List<String> clickTrackingUrls;
    private AppLovinNativeAdEventListener eventListener;
    private Uri iconUri;
    private final List<l> impressionRequests;
    private final AtomicBoolean impressionTracked;
    private final List<String> jsTrackers;
    private Uri mainImageUri;
    private AppLovinMediaView mediaView;
    private ViewGroup nativeAdView;
    private final a onAttachStateChangeHandler;
    private AppLovinOptionsView optionsView;
    private Uri privacyDestinationUri;
    private Uri privacyIconUri;
    private final List<View> registeredViews;
    private final Double starRating;
    private final String tag;
    private final String title;
    private final com.applovin.impl.c.a vastAd;
    private View videoView;
    private final b viewableMRC100Callback;
    private ad viewableMRC100Tracker;
    private final b viewableMRC50Callback;
    private ad viewableMRC50Tracker;
    private b viewableVideoMRC50Callback;
    private ad viewableVideoMRC50Tracker;

    public static class Builder {
        private final JSONObject adObject;
        private String advertiser;
        private String body;
        private String callToAction;
        private Uri clickDestinationBackupUri;
        private Uri clickDestinationUri;
        private List<String> clickTrackingUrls;
        private final JSONObject fullResponse;
        private Uri iconUri;
        private List<l> impressionRequests;
        private List<String> jsTrackers;
        private Uri mainImageUri;
        private Uri privacyDestinationUri;
        private Uri privacyIconUri;
        private final o sdk;
        private Double starRating;
        private String title;
        private com.applovin.impl.c.a vastAd;
        private List<l> viewableMRC100Requests;
        private List<l> viewableMRC50Requests;
        private List<l> viewableVideo50Requests;

        public Builder(JSONObject jSONObject, JSONObject jSONObject2, o oVar) {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.sdk = oVar;
        }

        public AppLovinNativeAdImpl build() {
            return new AppLovinNativeAdImpl(this);
        }

        public Builder setAdvertiser(String str) {
            this.advertiser = str;
            return this;
        }

        public Builder setBody(String str) {
            this.body = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.callToAction = str;
            return this;
        }

        public Builder setClickDestinationBackupUri(Uri uri) {
            this.clickDestinationBackupUri = uri;
            return this;
        }

        public Builder setClickDestinationUri(Uri uri) {
            this.clickDestinationUri = uri;
            return this;
        }

        public Builder setClickTrackingUrls(List<String> list) {
            this.clickTrackingUrls = list;
            return this;
        }

        public Builder setIconUri(Uri uri) {
            this.iconUri = uri;
            return this;
        }

        public Builder setImpressionRequests(List<l> list) {
            this.impressionRequests = list;
            return this;
        }

        public Builder setJsTrackers(List<String> list) {
            this.jsTrackers = list;
            return this;
        }

        public Builder setMainImageUri(Uri uri) {
            this.mainImageUri = uri;
            return this;
        }

        public Builder setPrivacyDestinationUri(Uri uri) {
            this.privacyDestinationUri = uri;
            return this;
        }

        public Builder setPrivacyIconUri(Uri uri) {
            this.privacyIconUri = uri;
            return this;
        }

        public Builder setStarRating(Double d10) {
            this.starRating = d10;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setVastAd(com.applovin.impl.c.a aVar) {
            this.vastAd = aVar;
            return this;
        }

        public Builder setViewableMRC100Requests(List<l> list) {
            this.viewableMRC100Requests = list;
            return this;
        }

        public Builder setViewableMRC50Requests(List<l> list) {
            this.viewableMRC50Requests = list;
            return this;
        }

        public Builder setViewableVideo50Requests(List<l> list) {
            this.viewableVideo50Requests = list;
            return this;
        }
    }

    public static class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AppLovinNativeAdImpl f10774a;

        public a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f10774a = appLovinNativeAdImpl;
        }

        public AppLovinNativeAdImpl a() {
            return this.f10774a;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            AppLovinNativeAdImpl appLovinNativeAdImplA = a();
            AppLovinNativeAdImpl appLovinNativeAdImplA2 = aVar.a();
            return appLovinNativeAdImplA != null ? appLovinNativeAdImplA.equals(appLovinNativeAdImplA2) : appLovinNativeAdImplA2 == null;
        }

        public int hashCode() {
            AppLovinNativeAdImpl appLovinNativeAdImplA = a();
            return 59 + (appLovinNativeAdImplA == null ? 43 : appLovinNativeAdImplA.hashCode());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f10774a.maybeHandleOnAttachedToWindow(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("AppLovinNativeAdImpl.OnAttachStateChangeHandler(ad=");
            sbA.append(a());
            sbA.append(")");
            return sbA.toString();
        }
    }

    public class b implements ad.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<l> f10776b;

        public b(List<l> list) {
            this.f10776b = list;
        }

        public List<l> a() {
            return this.f10776b;
        }

        public boolean a(Object obj) {
            return obj instanceof b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.a(this)) {
                return false;
            }
            List<l> listA = a();
            List<l> listA2 = bVar.a();
            return listA != null ? listA.equals(listA2) : listA2 == null;
        }

        public int hashCode() {
            List<l> listA = a();
            return 59 + (listA == null ? 43 : listA.hashCode());
        }

        @Override // com.applovin.impl.sdk.ad.a
        public void onLogVisibilityImpression() {
            Iterator<l> it = this.f10776b.iterator();
            while (it.hasNext()) {
                AppLovinNativeAdImpl.this.sdk.ah().dispatchPostbackRequest(it.next(), null);
            }
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("AppLovinNativeAdImpl.VisibilityCallback(requests=");
            sbA.append(a());
            sbA.append(")");
            return sbA.toString();
        }
    }

    private AppLovinNativeAdImpl(Builder builder) {
        Uri uri;
        super(builder.adObject, builder.fullResponse, builder.sdk);
        this.impressionTracked = new AtomicBoolean();
        this.registeredViews = new ArrayList();
        this.onAttachStateChangeHandler = new a(this);
        this.adEventTracker = new com.applovin.impl.sdk.a.e(this);
        this.title = builder.title;
        this.advertiser = builder.advertiser;
        this.body = builder.body;
        this.callToAction = builder.callToAction;
        this.iconUri = builder.iconUri;
        this.mainImageUri = builder.mainImageUri;
        this.privacyIconUri = builder.privacyIconUri;
        com.applovin.impl.c.a aVar = builder.vastAd;
        this.vastAd = aVar;
        this.clickDestinationUri = builder.clickDestinationUri;
        this.clickDestinationBackupUri = builder.clickDestinationBackupUri;
        this.clickTrackingUrls = builder.clickTrackingUrls;
        this.jsTrackers = builder.jsTrackers;
        this.impressionRequests = builder.impressionRequests;
        Double d10 = builder.starRating;
        this.starRating = (d10 == null || d10.doubleValue() < 3.0d) ? null : d10;
        if (builder.privacyDestinationUri == null) {
            uri = (!isDspAd() || getSdk().as().a()) ? Uri.parse(DEFAULT_APPLOVIN_PRIVACY_URL) : uri;
            this.viewableMRC50Callback = new b(builder.viewableMRC50Requests);
            this.viewableMRC100Callback = new b(builder.viewableMRC100Requests);
            if (aVar != null && aVar.hasVideoUrl()) {
                this.viewableVideoMRC50Callback = new b(builder.viewableVideo50Requests);
            }
            StringBuilder sbA = defpackage.a.a("AppLovinNativeAd:");
            sbA.append(getAdIdNumber());
            this.tag = sbA.toString();
        }
        uri = builder.privacyDestinationUri;
        this.privacyDestinationUri = uri;
        this.viewableMRC50Callback = new b(builder.viewableMRC50Requests);
        this.viewableMRC100Callback = new b(builder.viewableMRC100Requests);
        if (aVar != null) {
            this.viewableVideoMRC50Callback = new b(builder.viewableVideo50Requests);
        }
        StringBuilder sbA2 = defpackage.a.a("AppLovinNativeAd:");
        sbA2.append(getAdIdNumber());
        this.tag = sbA2.toString();
    }

    private List<com.applovin.impl.sdk.d.a> getDirectClickTrackingPostbacks() {
        List<com.applovin.impl.sdk.d.a> listA;
        synchronized (this.adObjectLock) {
            listA = w.a("click_tracking_urls", this.adObject, getClCode(), getStringFromAdObject("click_tracking_url", null), this.sdk);
        }
        return listA;
    }

    private boolean isDspAd() {
        return AD_RESPONSE_TYPE_ORTB.equalsIgnoreCase(getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchUri(Uri uri, Uri uri2, Context context) {
        if (u.a(uri, context, this.sdk)) {
            this.sdk.F();
            if (y.a()) {
                this.sdk.F().b(this.tag, "Opening URL: " + uri);
                return;
            }
            return;
        }
        if (u.a(uri2, context, this.sdk)) {
            this.sdk.F();
            if (y.a()) {
                this.sdk.F().b(this.tag, "Opening backup URL: " + uri2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandleOnAttachedToWindow(View view) {
        if (this.impressionTracked.compareAndSet(false, true)) {
            ad adVar = new ad(this.nativeAdView, this.sdk, this.viewableMRC50Callback);
            this.viewableMRC50Tracker = adVar;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            adVar.a(0, 50.0f, 50.0f, timeUnit.toMillis(1L), this.nativeAdView);
            ad adVar2 = new ad(this.nativeAdView, this.sdk, this.viewableMRC100Callback);
            this.viewableMRC100Tracker = adVar2;
            adVar2.a(0, 100.0f, 100.0f, timeUnit.toMillis(1L), this.nativeAdView);
            com.applovin.impl.c.a aVar = this.vastAd;
            if (aVar != null && aVar.hasVideoUrl()) {
                ad adVar3 = new ad(this.nativeAdView, this.sdk, this.viewableVideoMRC50Callback);
                this.viewableVideoMRC50Tracker = adVar3;
                adVar3.a(0, 50.0f, 50.0f, timeUnit.toMillis(2L), this.videoView);
            }
            List<String> list = this.jsTrackers;
            if (list != null && list.size() > 0) {
                if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.gG)).booleanValue()) {
                    Iterator<String> it = this.jsTrackers.iterator();
                    while (it.hasNext()) {
                        this.sdk.W().a(it.next());
                    }
                } else {
                    String str = this.jsTrackers.get(0);
                    if (StringUtils.isValidString(str)) {
                        final com.applovin.impl.adview.d dVar = new com.applovin.impl.adview.d(null, this.sdk, view.getContext());
                        dVar.loadData(str, "text/html", "UTF-8");
                        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.1
                            @Override // java.lang.Runnable
                            public void run() {
                                dVar.stopLoading();
                            }
                        }, timeUnit.toMillis(5L));
                    }
                }
            }
            Iterator<l> it2 = this.impressionRequests.iterator();
            while (it2.hasNext()) {
                this.sdk.ah().dispatchPostbackRequest(it2.next(), null);
            }
            this.adEventTracker.a(view);
            this.adEventTracker.d();
        }
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void destroy() {
        unregisterViewsForInteraction();
        this.eventListener = null;
        this.adEventTracker.e();
    }

    public com.applovin.impl.sdk.a.e getAdEventTracker() {
        return this.adEventTracker;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getBody() {
        return this.body;
    }

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getCallToAction() {
        return this.callToAction;
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public Bundle getDirectDownloadParameters() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("ah_parameters", null);
        if (jsonObjectFromAdObject != null) {
            return JsonUtils.toBundle(jsonObjectFromAdObject);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", null);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public Uri getIconUri() {
        return this.iconUri;
    }

    public Uri getMainImageUri() {
        return this.mainImageUri;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public AppLovinMediaView getMediaView() {
        return this.mediaView;
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.a.a
    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.adObjectLock) {
            JSONArray jSONArray = JsonUtils.getJSONArray(this.adObject, "omid_verification_script_resources", null);
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
                    try {
                        URL url = new URL(JsonUtils.getString(jSONObject, ImagesContract.URL, null));
                        String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                        String string2 = JsonUtils.getString(jSONObject, "parameters", null);
                        arrayList.add((StringUtils.isValidString(string) && StringUtils.isValidString(string2)) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                    } catch (Throwable th) {
                        this.sdk.F();
                        if (y.a()) {
                            this.sdk.F().b(this.tag, "Failed to parse OMID verification script resource", th);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public AppLovinOptionsView getOptionsView() {
        return this.optionsView;
    }

    public Uri getPrivacyDestinationUri() {
        return this.privacyDestinationUri;
    }

    public Uri getPrivacyIconUri() {
        return this.privacyIconUri;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public Double getStarRating() {
        return this.starRating;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return getStringFromAdObject("type", "undefined");
    }

    public com.applovin.impl.c.a getVastAd() {
        return this.vastAd;
    }

    public void handleNativeAdClick(final Uri uri, final Uri uri2, final Context context) {
        Iterator<String> it = this.clickTrackingUrls.iterator();
        while (it.hasNext()) {
            this.sdk.ah().dispatchPostbackAsync(it.next(), null);
        }
        com.applovin.impl.sdk.utils.o.a(this.eventListener, this);
        if (isDirectDownloadEnabled()) {
            this.sdk.af().startDirectInstallOrDownloadProcess(this, false, new ArrayService.DirectDownloadListener() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.2
                @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                public void onAppDetailsDismissed() {
                }

                @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                public void onAppDetailsDisplayed() {
                }

                @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                public void onFailure() {
                    AppLovinNativeAdImpl.this.launchUri(uri, uri2, context);
                }
            });
        } else {
            launchUri(uri, uri2, context);
        }
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return StringUtils.isValidString(getDirectDownloadToken());
    }

    @Override // com.applovin.impl.sdk.a.a
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.sdk.F();
        if (y.a()) {
            this.sdk.F().b(this.tag, "Handle view clicked");
        }
        this.sdk.v().maybeSubmitPersistentPostbacks(getDirectClickTrackingPostbacks());
        handleNativeAdClick(this.clickDestinationUri, this.clickDestinationBackupUri, view.getContext());
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void registerViewsForInteraction(List<View> list, ViewGroup viewGroup) {
        y yVarF;
        String str;
        StringBuilder sb2;
        String str2;
        this.nativeAdView = viewGroup;
        if (!(h.c() && this.nativeAdView.isAttachedToWindow()) && (h.c() || this.nativeAdView.getParent() == null)) {
            this.nativeAdView.addOnAttachStateChangeListener(this.onAttachStateChangeHandler);
        } else {
            maybeHandleOnAttachedToWindow(this.nativeAdView);
        }
        this.sdk.F();
        if (y.a()) {
            y yVarF2 = this.sdk.F();
            String str3 = this.tag;
            StringBuilder sbA = defpackage.a.a("Registered ad view for impressions: ");
            sbA.append(this.nativeAdView);
            yVarF2.b(str3, sbA.toString());
        }
        if (this.clickDestinationUri == null && this.clickDestinationBackupUri == null) {
            this.sdk.F();
            if (y.a()) {
                this.sdk.F().b(this.tag, "Skipping click registration - no click URLs provided");
                return;
            }
            return;
        }
        for (View view : list) {
            if (view.hasOnClickListeners()) {
                this.sdk.F();
                if (y.a()) {
                    this.sdk.F().d(this.tag, "View has an onClickListener already - " + view);
                }
            }
            if (!view.isClickable()) {
                this.sdk.F();
                if (y.a()) {
                    this.sdk.F().d(this.tag, "View is not clickable - " + view);
                }
            }
            if (!view.isEnabled()) {
                this.sdk.F();
                if (y.a()) {
                    this.sdk.F().e(this.tag, "View is not enabled - " + view);
                }
            }
            if (view instanceof Button) {
                this.sdk.F();
                if (y.a()) {
                    yVarF = this.sdk.F();
                    str = this.tag;
                    sb2 = new StringBuilder();
                    str2 = "Registering click for button: ";
                    sb2.append(str2);
                    sb2.append(view);
                    yVarF.b(str, sb2.toString());
                }
            } else {
                this.sdk.F();
                if (y.a()) {
                    yVarF = this.sdk.F();
                    str = this.tag;
                    sb2 = new StringBuilder();
                    str2 = "Registering click for view: ";
                    sb2.append(str2);
                    sb2.append(view);
                    yVarF.b(str, sb2.toString());
                }
            }
            view.setOnClickListener(this);
            this.registeredViews.add(view);
        }
        this.sdk.F();
        if (y.a()) {
            y yVarF3 = this.sdk.F();
            String str4 = this.tag;
            StringBuilder sbA2 = defpackage.a.a("Registered views: ");
            sbA2.append(this.registeredViews);
            yVarF3.b(str4, sbA2.toString());
        }
    }

    public void setEventListener(AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        this.eventListener = appLovinNativeAdEventListener;
    }

    public void setIconUri(Uri uri) {
        this.iconUri = uri;
    }

    public void setMainImageUri(Uri uri) {
        this.mainImageUri = uri;
    }

    public void setPrivacyIconUri(Uri uri) {
        this.privacyIconUri = uri;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    /* JADX WARN: Code duplicated, block: B:20:0x0074  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public void setUpNativeAdViewComponents() {
        AppLovinMediaView appLovinMediaView;
        com.applovin.impl.c.a aVar = this.vastAd;
        if (aVar != null && aVar.hasVideoUrl()) {
            try {
                this.mediaView = new AppLovinVastMediaView(this, this.sdk, o.au());
            } catch (Throwable th) {
                this.sdk.F();
                if (y.a()) {
                    this.sdk.F().a(this.tag, "Failed to create ExoPlayer VAST media view. Falling back to static image for media view.", th);
                }
                this.sdk.ag().a(TAG, "createExoPlayerVASTMediaView", th);
                appLovinMediaView = new AppLovinMediaView(this, this.sdk, o.au());
                this.mediaView = appLovinMediaView;
            }
            if (this.privacyDestinationUri != null) {
                this.optionsView = new AppLovinOptionsView(this, this.sdk, o.au());
                return;
            }
            this.sdk.F();
            if (y.a()) {
                this.sdk.F().b(this.tag, "Privacy icon will not render because no native ad privacy URL is provided.");
            }
        }
        appLovinMediaView = new AppLovinMediaView(this, this.sdk, o.au());
        this.mediaView = appLovinMediaView;
        if (this.privacyDestinationUri != null) {
            this.optionsView = new AppLovinOptionsView(this, this.sdk, o.au());
            return;
        }
        this.sdk.F();
        if (y.a()) {
            this.sdk.F().b(this.tag, "Privacy icon will not render because no native ad privacy URL is provided.");
        }
    }

    public void setVideoView(View view) {
        this.videoView = view;
    }

    public boolean shouldInjectOpenMeasurementScriptDuringCaching() {
        return false;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("AppLovinNativeAd{adIdNumber=");
        sbA.append(getAdIdNumber());
        sbA.append(" - ");
        sbA.append(getTitle());
        sbA.append("}");
        return sbA.toString();
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void unregisterViewsForInteraction() {
        Iterator<View> it = this.registeredViews.iterator();
        while (it.hasNext()) {
            it.next().setOnClickListener(null);
        }
        this.sdk.F();
        if (y.a()) {
            y yVarF = this.sdk.F();
            String str = this.tag;
            StringBuilder sbA = defpackage.a.a("Unregistered views: ");
            sbA.append(this.registeredViews);
            yVarF.b(str, sbA.toString());
        }
        this.registeredViews.clear();
        ad adVar = this.viewableMRC50Tracker;
        if (adVar != null) {
            adVar.a();
        }
        ad adVar2 = this.viewableMRC100Tracker;
        if (adVar2 != null) {
            adVar2.a();
        }
        ad adVar3 = this.viewableVideoMRC50Tracker;
        if (adVar3 != null) {
            adVar3.a();
        }
        ViewGroup viewGroup = this.nativeAdView;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this.onAttachStateChangeHandler);
            this.nativeAdView = null;
        }
        AppLovinMediaView appLovinMediaView = this.mediaView;
        if (appLovinMediaView != null) {
            appLovinMediaView.destroy();
        }
        AppLovinOptionsView appLovinOptionsView = this.optionsView;
        if (appLovinOptionsView != null) {
            appLovinOptionsView.destroy();
        }
    }
}
