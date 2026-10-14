package com.applovin.mediation.adapters;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinSdk;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class TaboolaMediationAdapter extends MediationAdapterBase {
    private static final String ADAPTER_VERSION = "2.0.0";
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private static MaxAdapter.InitializationStatus status;
    private static com.applovin.impl.mediation.b.b.a taboolaApiService;
    private AppLovinNativeAd loadedNativeAd;

    public class MaxAppLovinNativeAd extends MaxNativeAd {
        public MaxAppLovinNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
            AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) TaboolaMediationAdapter.this.loadedNativeAd;
            if (appLovinNativeAdImpl == null) {
                TaboolaMediationAdapter.this.e("Failed to register native ad view for interaction. Native ad is null");
                return;
            }
            TaboolaMediationAdapter.this.d("Preparing view for interaction: " + maxNativeAdView);
            ArrayList arrayList = new ArrayList(4);
            if (StringUtils.isValidString(getTitle()) && maxNativeAdView.getTitleTextView() != null) {
                TaboolaMediationAdapter taboolaMediationAdapter = TaboolaMediationAdapter.this;
                StringBuilder sbA = defpackage.a.a("Adding title TextView: ");
                sbA.append(maxNativeAdView.getTitleTextView());
                taboolaMediationAdapter.d(sbA.toString());
                arrayList.add(maxNativeAdView.getTitleTextView());
            }
            if (StringUtils.isValidString(getBody()) && maxNativeAdView.getBodyTextView() != null) {
                TaboolaMediationAdapter taboolaMediationAdapter2 = TaboolaMediationAdapter.this;
                StringBuilder sbA2 = defpackage.a.a("Adding body TextView: ");
                sbA2.append(maxNativeAdView.getBodyTextView());
                taboolaMediationAdapter2.d(sbA2.toString());
                arrayList.add(maxNativeAdView.getBodyTextView());
            }
            if (StringUtils.isValidString(getCallToAction()) && maxNativeAdView.getCallToActionButton() != null) {
                TaboolaMediationAdapter taboolaMediationAdapter3 = TaboolaMediationAdapter.this;
                StringBuilder sbA3 = defpackage.a.a("Adding CTA button: ");
                sbA3.append(maxNativeAdView.getCallToActionButton());
                taboolaMediationAdapter3.d(sbA3.toString());
                TaboolaMediationAdapter taboolaMediationAdapter4 = TaboolaMediationAdapter.this;
                StringBuilder sbA4 = defpackage.a.a("CTA button is clickable: ");
                sbA4.append(maxNativeAdView.getCallToActionButton().isClickable());
                taboolaMediationAdapter4.d(sbA4.toString());
                TaboolaMediationAdapter taboolaMediationAdapter5 = TaboolaMediationAdapter.this;
                StringBuilder sbA5 = defpackage.a.a("CTA button is enabled: ");
                sbA5.append(maxNativeAdView.getCallToActionButton().isEnabled());
                taboolaMediationAdapter5.d(sbA5.toString());
                TaboolaMediationAdapter taboolaMediationAdapter6 = TaboolaMediationAdapter.this;
                StringBuilder sbA6 = defpackage.a.a("CTA button has onClickListeners: ");
                sbA6.append(maxNativeAdView.getCallToActionButton().hasOnClickListeners());
                taboolaMediationAdapter6.d(sbA6.toString());
                arrayList.add(maxNativeAdView.getCallToActionButton());
            }
            if (getIcon() != null && maxNativeAdView.getIconImageView() != null) {
                TaboolaMediationAdapter taboolaMediationAdapter7 = TaboolaMediationAdapter.this;
                StringBuilder sbA7 = defpackage.a.a("Adding icon image view: ");
                sbA7.append(maxNativeAdView.getIconImageView());
                taboolaMediationAdapter7.d(sbA7.toString());
                arrayList.add(maxNativeAdView.getIconImageView());
            }
            appLovinNativeAdImpl.registerViewsForInteraction(arrayList, maxNativeAdView);
        }
    }

    public TaboolaMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public static Bundle getExtraInfo(AppLovinAd appLovinAd) {
        Bundle bundle = new Bundle(1);
        bundle.putBundle("ad_values", ((AppLovinAdImpl) appLovinAd).getMAXAdValues());
        return bundle;
    }

    public static MaxAdapterError toMaxError(AppLovinError appLovinError) {
        MaxAdapterError maxAdapterError;
        if (appLovinError.getCode() == -1009) {
            maxAdapterError = MaxAdapterError.NO_CONNECTION;
        } else if (appLovinError.getCode() == 204) {
            maxAdapterError = MaxAdapterError.NO_FILL;
        } else {
            maxAdapterError = appLovinError.getCode() >= 500 ? MaxAdapterError.SERVER_ERROR : MaxAdapterError.UNSPECIFIED;
        }
        return new MaxAdapterError(maxAdapterError.getCode(), maxAdapterError.getErrorMessage(), appLovinError.getCode(), appLovinError.getMessage());
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return ADAPTER_VERSION;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return "2.0";
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        MaxAdapter.InitializationStatus initializationStatus;
        String str;
        if (!initialized.compareAndSet(false, true)) {
            onCompletionListener.onCompletion(status, null);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(maxAdapterInitializationParameters.getServerParameters().getString("app_id", ""));
            String string = JsonUtils.getString(jSONObject, "pub_id", null);
            String string2 = JsonUtils.getString(jSONObject, "api_key", null);
            String string3 = JsonUtils.getString(jSONObject, "base_url", null);
            if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string)) {
                initializationStatus = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                status = initializationStatus;
                str = "API Key or Publisher ID cannot be null.";
                onCompletionListener.onCompletion(initializationStatus, str);
                return;
            }
            status = MaxAdapter.InitializationStatus.INITIALIZING;
            com.applovin.impl.mediation.b.b.a aVar = new com.applovin.impl.mediation.b.b.a(string2, string, string3, getWrappingSdk().a());
            taboolaApiService = aVar;
            aVar.a(maxAdapterInitializationParameters, new com.applovin.impl.mediation.b.b.b() { // from class: com.applovin.mediation.adapters.TaboolaMediationAdapter.1
                @Override // com.applovin.impl.mediation.b.b.b
                public void onInitialized(boolean z10, String str2) {
                    MaxAdapter.InitializationStatus initializationStatus2;
                    if (z10) {
                        TaboolaMediationAdapter.this.log("Taboola API successfully initialized");
                        initializationStatus2 = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                    } else {
                        TaboolaMediationAdapter.this.log("Taboola API failed to initialized");
                        initializationStatus2 = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                    }
                    MaxAdapter.InitializationStatus unused = TaboolaMediationAdapter.status = initializationStatus2;
                    onCompletionListener.onCompletion(TaboolaMediationAdapter.status, str2);
                }
            });
        } catch (JSONException unused) {
            initializationStatus = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
            status = initializationStatus;
            str = "Failed to serialize app id json string.";
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(final MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        if (taboolaApiService == null) {
            log("Taboola Service is not initialized");
            maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        d("Loading native ad: " + thirdPartyAdPlacementId + "...");
        taboolaApiService.a(maxAdapterResponseParameters, new AppLovinNativeAdLoadListener() { // from class: com.applovin.mediation.adapters.TaboolaMediationAdapter.2
            @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener
            public void onNativeAdLoadFailed(AppLovinError appLovinError) {
                TaboolaMediationAdapter taboolaMediationAdapter = TaboolaMediationAdapter.this;
                StringBuilder sbA = defpackage.a.a("Native ad: ");
                sbA.append(thirdPartyAdPlacementId);
                sbA.append(" failed to load with error: ");
                sbA.append(appLovinError.getMessage());
                taboolaMediationAdapter.d(sbA.toString());
                maxNativeAdAdapterListener.onNativeAdLoadFailed(TaboolaMediationAdapter.toMaxError(appLovinError));
            }

            @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener
            public void onNativeAdLoaded(AppLovinNativeAd appLovinNativeAd) {
                TaboolaMediationAdapter taboolaMediationAdapter = TaboolaMediationAdapter.this;
                StringBuilder sbA = defpackage.a.a("Native ad loaded: ");
                sbA.append(thirdPartyAdPlacementId);
                taboolaMediationAdapter.d(sbA.toString());
                if (!StringUtils.isValidString(BundleUtils.getString("template", "", maxAdapterResponseParameters.getServerParameters())) || !TextUtils.isEmpty(appLovinNativeAd.getTitle())) {
                    ((AppLovinNativeAdImpl) appLovinNativeAd).setEventListener(new AppLovinNativeAdEventListener() { // from class: com.applovin.mediation.adapters.TaboolaMediationAdapter.2.1
                        @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener
                        public void onNativeAdClicked(AppLovinNativeAd appLovinNativeAd2) {
                            TaboolaMediationAdapter taboolaMediationAdapter2 = TaboolaMediationAdapter.this;
                            StringBuilder sbA2 = defpackage.a.a("Native ad clicked: ");
                            sbA2.append(thirdPartyAdPlacementId);
                            taboolaMediationAdapter2.d(sbA2.toString());
                            maxNativeAdAdapterListener.onNativeAdClicked();
                        }
                    });
                    TaboolaMediationAdapter.this.loadedNativeAd = appLovinNativeAd;
                    maxNativeAdAdapterListener.onNativeAdLoaded(TaboolaMediationAdapter.this.new MaxAppLovinNativeAd(new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(appLovinNativeAd.getTitle()).setAdvertiser(appLovinNativeAd.getAdvertiser()).setBody(appLovinNativeAd.getBody()).setCallToAction(appLovinNativeAd.getCallToAction()).setIcon(new MaxNativeAd.MaxNativeAdImage(appLovinNativeAd.getIconUri())).setOptionsView(appLovinNativeAd.getOptionsView()).setMediaView(appLovinNativeAd.getMediaView()).setMainImage(new MaxNativeAd.MaxNativeAdImage(((AppLovinNativeAdImpl) appLovinNativeAd).getMainImageUri())).setMediaContentAspectRatio(appLovinNativeAd.getMediaView().getAspectRatio())), null);
                    return;
                }
                TaboolaMediationAdapter taboolaMediationAdapter2 = TaboolaMediationAdapter.this;
                StringBuilder sbA2 = defpackage.a.a("Native ad does not have required assets: ");
                sbA2.append(thirdPartyAdPlacementId);
                taboolaMediationAdapter2.e(sbA2.toString());
                maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        AppLovinNativeAd appLovinNativeAd = this.loadedNativeAd;
        if (appLovinNativeAd instanceof AppLovinNativeAdImpl) {
            ((AppLovinNativeAdImpl) appLovinNativeAd).destroy();
            this.loadedNativeAd = null;
        }
    }
}
