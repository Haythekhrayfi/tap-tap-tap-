package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.d.c;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.e;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AppLovinSdk {
    private static final String TAG = "AppLovinSdk";
    public static final String VERSION = getVersion();
    public static final int VERSION_CODE = getVersionCode();
    private static final Map<String, AppLovinSdk> sdkInstances = new HashMap(1);
    private static final Object sdkInstancesLock = new Object();
    private final o coreSdk;

    public interface SdkInitializationListener {
        void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    public static class a extends AppLovinSdkSettings {
        public a(Context context) {
            super(context);
        }
    }

    private AppLovinSdk(o oVar) {
        this.coreSdk = oVar;
    }

    public static AppLovinSdk getInstance(Context context) {
        return getInstance(new a(context), context);
    }

    public static AppLovinSdk getInstance(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (context != null) {
            return getInstance(e.a(context).a("applovin.sdk.key", ""), appLovinSdkSettings, context);
        }
        throw new IllegalArgumentException("No context specified");
    }

    public static AppLovinSdk getInstance(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        AppLovinSdk appLovinSdk;
        if (appLovinSdkSettings == null) {
            throw new IllegalArgumentException("No userSettings specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        synchronized (sdkInstancesLock) {
            Map<String, AppLovinSdk> map = sdkInstances;
            if (map.containsKey(str)) {
                appLovinSdk = map.get(str);
            } else {
                if (!TextUtils.isEmpty(str)) {
                    String str2 = File.separator;
                    if (str.contains(str2)) {
                        y.j(TAG, "\n**************************************************\nINVALID SDK KEY: " + str + "\n**************************************************\n");
                        if (!map.isEmpty()) {
                            return map.values().iterator().next();
                        }
                        str = str.replace(str2, "");
                    }
                }
                o oVar = new o();
                oVar.a(str, appLovinSdkSettings, context);
                AppLovinSdk appLovinSdk2 = new AppLovinSdk(oVar);
                oVar.a(appLovinSdk2);
                appLovinSdkSettings.attachAppLovinSdk(oVar);
                map.put(str, appLovinSdk2);
                appLovinSdk = appLovinSdk2;
            }
            if (appLovinSdk != null) {
                appLovinSdk.coreSdk.i();
            }
            return appLovinSdk;
        }
    }

    private static String getVersion() {
        return "11.11.2";
    }

    private static int getVersionCode() {
        return 11110299;
    }

    public static void initializeSdk(Context context) {
        initializeSdk(context, null);
    }

    public static void initializeSdk(Context context, SdkInitializationListener sdkInitializationListener) {
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        AppLovinSdk appLovinSdk = getInstance(context);
        if (appLovinSdk != null) {
            appLovinSdk.initializeSdk(sdkInitializationListener);
        } else {
            y.j(TAG, "Unable to initialize AppLovin SDK: SDK object not created");
        }
    }

    public static void reinitializeAll(Boolean bool, Boolean bool2, Boolean bool3) {
        synchronized (sdkInstancesLock) {
            for (AppLovinSdk appLovinSdk : sdkInstances.values()) {
                appLovinSdk.coreSdk.b();
                appLovinSdk.coreSdk.k();
                if (bool != null) {
                    appLovinSdk.coreSdk.F();
                    if (y.a()) {
                        appLovinSdk.coreSdk.F().c(TAG, "Toggled 'huc' to " + bool);
                    }
                    appLovinSdk.getEventService().trackEvent(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, CollectionUtils.map("value", bool.toString()));
                }
                if (bool2 != null) {
                    appLovinSdk.coreSdk.F();
                    if (y.a()) {
                        appLovinSdk.coreSdk.F().c(TAG, "Toggled 'aru' to " + bool2);
                    }
                    appLovinSdk.getEventService().trackEvent(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, CollectionUtils.map("value", bool2.toString()));
                }
                if (bool3 != null) {
                    appLovinSdk.coreSdk.F();
                    if (y.a()) {
                        appLovinSdk.coreSdk.F().c(TAG, "Toggled 'dns' to " + bool3);
                    }
                    appLovinSdk.getEventService().trackEvent(AppLovinSdkExtraParameterKey.DO_NOT_SELL, CollectionUtils.map("value", bool3.toString()));
                }
            }
        }
    }

    public o a() {
        return this.coreSdk;
    }

    public AppLovinAdService getAdService() {
        return this.coreSdk.v();
    }

    public List<MaxMediatedNetworkInfo> getAvailableMediatedNetworks() {
        JSONArray jSONArrayA = c.a(this.coreSdk);
        ArrayList arrayList = new ArrayList(jSONArrayA.length());
        for (int i10 = 0; i10 < jSONArrayA.length(); i10++) {
            arrayList.add(new MaxMediatedNetworkInfoImpl(JsonUtils.getJSONObject(jSONArrayA, i10, (JSONObject) null)));
        }
        return arrayList;
    }

    public AppLovinCFService getCFService() {
        return this.coreSdk.z();
    }

    public AppLovinSdkConfiguration getConfiguration() {
        return this.coreSdk.aD();
    }

    public AppLovinEventService getEventService() {
        return this.coreSdk.x();
    }

    public String getMediationProvider() {
        return this.coreSdk.u();
    }

    @Deprecated
    public AppLovinPostbackService getPostbackService() {
        return this.coreSdk.ah();
    }

    public String getSdkKey() {
        return this.coreSdk.ax();
    }

    public AppLovinSdkSettings getSettings() {
        return this.coreSdk.ay();
    }

    public AppLovinTargetingData getTargetingData() {
        return this.coreSdk.t();
    }

    public String getUserIdentifier() {
        return this.coreSdk.q();
    }

    public AppLovinUserSegment getUserSegment() {
        return this.coreSdk.az();
    }

    public AppLovinUserService getUserService() {
        return this.coreSdk.y();
    }

    public AppLovinVariableService getVariableService() {
        return this.coreSdk.A();
    }

    public void initializeSdk() {
    }

    public void initializeSdk(SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.a(sdkInitializationListener);
    }

    public boolean isEnabled() {
        return this.coreSdk.d();
    }

    public boolean isInitialized() {
        return this.coreSdk.d();
    }

    public void setMediationProvider(String str) {
        this.coreSdk.d(str);
    }

    public void setPluginVersion(String str) {
        this.coreSdk.b(str);
    }

    public void setUserIdentifier(String str) {
        this.coreSdk.c(str);
    }

    public void showCreativeDebugger() {
        this.coreSdk.o();
    }

    public void showMediationDebugger() {
        this.coreSdk.n();
    }

    public void showMediationDebugger(Map<String, List<?>> map) {
        this.coreSdk.a(map);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("AppLovinSdk{sdkKey='");
        sbA.append(getSdkKey());
        sbA.append("', isEnabled=");
        sbA.append(isEnabled());
        sbA.append(", isFirstSession=");
        sbA.append(this.coreSdk.aB());
        sbA.append('}');
        return sbA.toString();
    }
}
