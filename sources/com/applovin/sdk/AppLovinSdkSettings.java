package com.applovin.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.recyclerview.widget.s;
import com.applovin.impl.b.a.b;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import defpackage.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import y.q;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinSdkSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11585b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f11590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TermsFlowSettings f11591h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private o f11596m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f11597n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f11589f = true;
    private final Map<String, Object> localSettings = new HashMap();
    private final Map<String, String> metaData = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<String> f11592i = Collections.emptyList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<String> f11593j = Collections.emptyList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<String, String> f11594k = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f11595l = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11586c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11587d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11588e = true;

    public interface TermsFlowSettings {
        Uri getPrivacyPolicyUri();

        Uri getTermsOfServiceUri();

        boolean isEnabled();

        void setEnabled(boolean z10);

        void setPrivacyPolicyUri(Uri uri);

        void setTermsOfServiceUri(Uri uri);
    }

    public AppLovinSdkSettings(Context context) {
        this.f11597n = "";
        this.f11584a = w.a(context);
        this.f11591h = b.a(context);
        a(context);
        if (context != null) {
            this.f11597n = context.getPackageName();
        }
    }

    @SuppressLint({"DiscouragedApi"})
    private void a(Context context) {
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String strA = w.a(identifier, context, (o) null);
        Map<String, String> mapTryToStringMap = JsonUtils.tryToStringMap(StringUtils.isValidString(strA) ? JsonUtils.jsonObjectFromJsonString(strA, new JSONObject()) : new JSONObject());
        synchronized (this.f11595l) {
            this.f11594k.putAll(mapTryToStringMap);
        }
    }

    public void attachAppLovinSdk(o oVar) {
        this.f11596m = oVar;
        if (StringUtils.isValidString(this.f11590g)) {
            oVar.as().a(this.f11590g);
            this.f11590g = null;
        }
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f11595l) {
            map = CollectionUtils.map(this.f11594k);
        }
        return map;
    }

    public List<String> getInitializationAdUnitIds() {
        return this.f11593j;
    }

    public TermsFlowSettings getTermsFlowSettings() {
        return this.f11591h;
    }

    public List<String> getTestDeviceAdvertisingIds() {
        return this.f11592i;
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f11586c;
    }

    public boolean isExceptionHandlerEnabled() {
        return this.f11587d;
    }

    public boolean isLocationCollectionEnabled() {
        return this.f11588e;
    }

    public boolean isMuted() {
        return this.f11585b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f11584a;
    }

    public void setCreativeDebuggerEnabled(boolean z10) {
        y.k("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z10 + ")");
        if (this.f11586c == z10) {
            return;
        }
        this.f11586c = z10;
        o oVar = this.f11596m;
        if (oVar == null) {
            return;
        }
        if (z10) {
            oVar.ac().a();
        } else {
            oVar.ac().b();
        }
    }

    public void setExceptionHandlerEnabled(boolean z10) {
        y.k("AppLovinSdkSettings", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z10 + ")");
        this.f11587d = z10;
    }

    public void setExtraParameter(String str, String str2) {
        y.k("AppLovinSdkSettings", q.a("setExtraParameter(key=", str, ", value=", str2, ")"));
        if (TextUtils.isEmpty(str)) {
            y.j("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String strTrim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.f11596m == null) {
                this.f11590g = strTrim;
            } else if (StringUtils.isValidString(strTrim)) {
                this.f11596m.as().a(strTrim);
            } else {
                this.f11596m.as().a((String) null);
            }
        } else if ((AppLovinSdkExtraParameterKey.FILTER_AD_NETWORK.equals(str) || AppLovinSdkExtraParameterKey.ENABLE_SEQUENTIAL_CACHING.equals(str)) && !this.f11597n.startsWith("com.unity.")) {
            return;
        }
        synchronized (this.f11595l) {
            this.f11594k.put(str, strTrim);
        }
    }

    public void setInitializationAdUnitIds(List<String> list) {
        y.k("AppLovinSdkSettings", "setInitializationAdUnitIds(initializationAdUnitIds=" + list + ")");
        if (list == null) {
            this.f11593j = Collections.emptyList();
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (StringUtils.isValidString(str) && str.length() > 0) {
                if (str.length() == 16) {
                    arrayList.add(str);
                } else {
                    y.j("AppLovinSdkSettings", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                }
            }
        }
        this.f11593j = arrayList;
    }

    public void setLocationCollectionEnabled(boolean z10) {
        y.k("AppLovinSdkSettings", "setLocationCollectionEnabled(locationCollectionEnabled=" + z10 + ")");
        this.f11588e = z10;
    }

    public void setMuted(boolean z10) {
        y.k("AppLovinSdkSettings", "setMuted(muted=" + z10 + ")");
        this.f11585b = z10;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z10) {
        y.k("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z10 + ")");
        this.f11589f = z10;
    }

    public void setTestDeviceAdvertisingIds(List<String> list) {
        y.k("AppLovinSdkSettings", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
        if (list == null) {
            this.f11592i = Collections.emptyList();
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (str == null || str.length() != 36) {
                y.j("AppLovinSdkSettings", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
            } else {
                arrayList.add(str);
            }
        }
        this.f11592i = arrayList;
    }

    public void setVerboseLogging(boolean z10) {
        y.k("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z10 + ")");
        if (!w.a()) {
            this.f11584a = z10;
            return;
        }
        y.j("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        if (w.a((Context) null) != z10) {
            y.j("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f11589f;
    }

    public String toString() {
        StringBuilder sbA = a.a("AppLovinSdkSettings{isVerboseLoggingEnabled=");
        sbA.append(this.f11584a);
        sbA.append(", muted=");
        sbA.append(this.f11585b);
        sbA.append(", testDeviceAdvertisingIds=");
        sbA.append(this.f11592i.toString());
        sbA.append(", initializationAdUnitIds=");
        sbA.append(this.f11593j.toString());
        sbA.append(", creativeDebuggerEnabled=");
        sbA.append(this.f11586c);
        sbA.append(", exceptionHandlerEnabled=");
        sbA.append(this.f11587d);
        sbA.append(", locationCollectionEnabled=");
        return s.a(sbA, this.f11588e, '}');
    }
}
