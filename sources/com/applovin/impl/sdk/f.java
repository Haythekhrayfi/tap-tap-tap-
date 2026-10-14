package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class f implements AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f10675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f10676b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashMap<String, Bundle> f10677c = new LinkedHashMap<String, Bundle>() { // from class: com.applovin.impl.sdk.f.1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, Bundle> entry) {
            return size() > 16;
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<a> f10678d = Collections.synchronizedSet(new HashSet());

    public interface a {
        void onCreativeIdGenerated(String str, String str2);
    }

    public f(o oVar) {
        this.f10675a = oVar;
        if (StringUtils.isValidString(a())) {
            AppLovinCommunicator.getInstance(o.au()).subscribe(this, "safedk_ad_info");
        }
    }

    public static String a() {
        return c("getVersion");
    }

    public static String b() {
        return c("getSdkKey");
    }

    private static String c(String str) {
        Class<?> cls;
        try {
            try {
                cls = Class.forName("com.applovin.quality.AppLovinQualityService");
            } catch (Throwable unused) {
                cls = Class.forName("com.safedk.android.SafeDK");
            }
            return (String) cls.getMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused2) {
            return "";
        }
    }

    public Bundle a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f10676b) {
            bundle = this.f10677c.get(str);
        }
        return bundle;
    }

    public void a(a aVar) {
        this.f10678d.add(aVar);
    }

    public void b(a aVar) {
        this.f10678d.remove(aVar);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f10676b) {
            this.f10677c.remove(str);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "f";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle == null) {
                this.f10675a.F();
                if (y.a()) {
                    this.f10675a.F().d("AppLovinSdk", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f10675a.F();
                if (y.a()) {
                    this.f10675a.F().d("AppLovinSdk", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.f10675a.F();
                if (y.a()) {
                    this.f10675a.F().d("AppLovinSdk", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            final String string = bundle2.getString(FacebookMediationAdapter.KEY_ID);
            if (TextUtils.isEmpty(string)) {
                this.f10675a.F();
                if (y.a()) {
                    this.f10675a.F().d("AppLovinSdk", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.f10676b) {
                this.f10675a.F();
                if (y.a()) {
                    this.f10675a.F().b("AppLovinSdk", "Storing current SafeDK ad info for serve id: " + string);
                }
                this.f10677c.put(string, bundle);
            }
            final String string2 = bundle.getString("ad_review_creative_id");
            if (!StringUtils.isValidString(string2) || this.f10678d.isEmpty()) {
                return;
            }
            for (final a aVar : new HashSet(this.f10678d)) {
                this.f10675a.G().a(new com.applovin.impl.sdk.e.ac(this.f10675a, "creativeIdGenerated", new Runnable() { // from class: com.applovin.impl.sdk.f.2
                    @Override // java.lang.Runnable
                    public void run() {
                        aVar.onCreativeIdGenerated(string, string2);
                    }
                }), com.applovin.impl.sdk.e.r.b.BACKGROUND);
            }
        }
    }
}
