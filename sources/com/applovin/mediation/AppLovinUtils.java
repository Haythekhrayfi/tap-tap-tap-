package com.applovin.mediation;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import i.f;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinUtils {
    private static final String DEFAULT_ZONE = "";
    public static final String ERROR_MSG_REASON_PREFIX = "AppLovin SDK returned a load failure callback with reason: ";

    public static class ServerParameterKeys {
        public static final String SDK_KEY = "sdkKey";
        public static final String ZONE_ID = "zone_id";

        private ServerParameterKeys() {
        }
    }

    public static AppLovinAdSize appLovinAdSizeFromAdMobAdSize(Context context, AdSize adSize) {
        ArrayList arrayList = new ArrayList();
        AdSize adSize2 = AdSize.BANNER;
        arrayList.add(adSize2);
        AdSize adSize3 = AdSize.LEADERBOARD;
        arrayList.add(adSize3);
        AdSize adSize4 = AdSize.MEDIUM_RECTANGLE;
        arrayList.add(adSize4);
        AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSize2.equals(adSizeFindClosestSize)) {
            return AppLovinAdSize.BANNER;
        }
        if (adSize4.equals(adSizeFindClosestSize)) {
            return AppLovinAdSize.MREC;
        }
        if (adSize3.equals(adSizeFindClosestSize)) {
            return AppLovinAdSize.LEADER;
        }
        return null;
    }

    public static AdError getAdError(int i10) {
        String strA = a.a("AppLovin error code ", i10);
        if (i10 == -8) {
            strA = "INVALID_AD_TOKEN";
        } else if (i10 == -7) {
            strA = "INVALID_ZONE";
        } else if (i10 != -6) {
            switch (i10) {
                case -1009:
                    strA = "NO_NETWORK";
                    break;
                case -1001:
                    strA = "FETCH_AD_TIMEOUT";
                    break;
                case AppLovinErrorCodes.INVALID_URL /* -900 */:
                    strA = "INVALID_URL";
                    break;
                case AppLovinErrorCodes.INVALID_RESPONSE /* -800 */:
                    strA = "INVALID_RESPONSE";
                    break;
                case AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO /* -600 */:
                    strA = "INCENTIVIZED_USER_CLOSED_VIDEO";
                    break;
                case AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT /* -500 */:
                    strA = "INCENTIVIZED_SERVER_TIMEOUT";
                    break;
                case AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR /* -400 */:
                    strA = "INCENTIVIZED_UNKNOWN_SERVER_ERROR";
                    break;
                case -300:
                    strA = "INCENTIVIZED_NO_AD_PRELOADED";
                    break;
                case AppLovinErrorCodes.SDK_DISABLED /* -22 */:
                    strA = "SDK_DISABLED";
                    break;
                case -1:
                    strA = "UNSPECIFIED_ERROR";
                    break;
                case 204:
                    strA = "NO_FILL";
                    break;
                default:
                    switch (i10) {
                        case AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES /* -202 */:
                            strA = "UNABLE_TO_PRECACHE_VIDEO_RESOURCES";
                            break;
                        case AppLovinErrorCodes.UNABLE_TO_PRECACHE_IMAGE_RESOURCES /* -201 */:
                            strA = "UNABLE_TO_PRECACHE_IMAGE_RESOURCES";
                            break;
                        case -200:
                            strA = "UNABLE_TO_PRECACHE_RESOURCES";
                            break;
                    }
                    break;
            }
        } else {
            strA = "UNABLE_TO_RENDER_AD";
        }
        return new AdError(i10, f.a(ERROR_MSG_REASON_PREFIX, strA), AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
    }

    private static Bundle retrieveMetadata(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static String retrieveSdkKey(Context context, Bundle bundle) {
        Bundle bundleRetrieveMetadata;
        String string = bundle != null ? bundle.getString(ServerParameterKeys.SDK_KEY) : null;
        return (!TextUtils.isEmpty(string) || (bundleRetrieveMetadata = retrieveMetadata(context)) == null) ? string : bundleRetrieveMetadata.getString("applovin.sdk.key");
    }

    public static String retrieveZoneId(Bundle bundle) {
        return bundle.containsKey(ServerParameterKeys.ZONE_ID) ? bundle.getString(ServerParameterKeys.ZONE_ID) : "";
    }

    public static boolean shouldMuteAudio(Bundle bundle) {
        return bundle != null && bundle.getBoolean(AppLovinExtras.Keys.MUTE_AUDIO);
    }
}
