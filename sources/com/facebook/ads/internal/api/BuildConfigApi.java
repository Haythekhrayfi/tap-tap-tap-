package com.facebook.ads.internal.api;

import android.content.Context;
import androidx.activity.k;
import androidx.annotation.Keep;
import com.facebook.ads.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class BuildConfigApi {
    public static final String UNITY_SHARED_PREFERENCES_SUFIX = ".v2.playerprefs";
    public static final String UNITY_TAG = "an_isUnitySDK";
    public static final String UNITY_VERSION_SUFIX = "-unity";

    public static String getVersionName(Context context) {
        return isUnity(context) ? k.a(new StringBuilder(), BuildConfig.VERSION_NAME, UNITY_VERSION_SUFIX) : BuildConfig.VERSION_NAME;
    }

    public static boolean isDebug() {
        return BuildConfig.DEBUG;
    }

    private static boolean isUnity(Context context) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getPackageName());
        sb2.append(UNITY_SHARED_PREFERENCES_SUFIX);
        return context.getSharedPreferences(sb2.toString(), 0).contains(UNITY_TAG) || context.getSharedPreferences(context.getPackageName(), 0).contains(UNITY_TAG);
    }
}
