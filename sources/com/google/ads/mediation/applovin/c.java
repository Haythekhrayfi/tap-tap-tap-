package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.BuildConfig;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import p4.f;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c f11624d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, Integer> f11626b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, ArrayList<b>> f11627c = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f11625a = new f();

    public class a implements AppLovinSdk.SdkInitializationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f11628a;

        public a(String str) {
            this.f11628a = str;
        }

        @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
        public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
            c.this.f11626b.put(this.f11628a, 2);
            ArrayList<b> arrayList = c.this.f11627c.get(this.f11628a);
            if (arrayList != null) {
                Iterator<b> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onInitializeSuccess(this.f11628a);
                }
                arrayList.clear();
            }
        }
    }

    public interface b {
        void onInitializeSuccess(String str);
    }

    public static c a() {
        if (f11624d == null) {
            f11624d = new c();
        }
        return f11624d;
    }

    public void b(Context context, String str, b bVar) {
        if (!this.f11626b.containsKey(str)) {
            this.f11626b.put(str, 0);
            this.f11627c.put(str, new ArrayList<>());
        }
        Integer num = 2;
        if (num.equals(this.f11626b.get(str))) {
            bVar.onInitializeSuccess(str);
            return;
        }
        this.f11627c.get(str).add(bVar);
        Integer num2 = 1;
        if (num2.equals(this.f11626b.get(str))) {
            return;
        }
        this.f11626b.put(str, 1);
        Log.d("c", String.format("Attempting to initialize SDK with SDK Key: %s", str));
        f fVar = this.f11625a;
        if (fVar.f34459a == null) {
            fVar.f34459a = new AppLovinSdkSettings(context);
        }
        AppLovinSdkSettings appLovinSdkSettings = fVar.f34459a;
        Objects.requireNonNull(this.f11625a);
        AppLovinSdk appLovinSdk = AppLovinSdk.getInstance(str, appLovinSdkSettings, context);
        appLovinSdk.setPluginVersion(BuildConfig.ADAPTER_VERSION);
        appLovinSdk.setMediationProvider(AppLovinMediationProvider.ADMOB);
        appLovinSdk.initializeSdk(new a(str));
    }

    public AppLovinSdk c(Bundle bundle, Context context) {
        AppLovinSdk appLovinSdk;
        String string = bundle != null ? bundle.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY) : null;
        f fVar = this.f11625a;
        if (fVar.f34459a == null) {
            fVar.f34459a = new AppLovinSdkSettings(context);
        }
        AppLovinSdkSettings appLovinSdkSettings = fVar.f34459a;
        if (TextUtils.isEmpty(string)) {
            Objects.requireNonNull(this.f11625a);
            appLovinSdk = AppLovinSdk.getInstance(appLovinSdkSettings, context);
        } else {
            Objects.requireNonNull(this.f11625a);
            appLovinSdk = AppLovinSdk.getInstance(string, appLovinSdkSettings, context);
        }
        appLovinSdk.setPluginVersion(BuildConfig.ADAPTER_VERSION);
        appLovinSdk.setMediationProvider(AppLovinMediationProvider.ADMOB);
        return appLovinSdk;
    }
}
