package com.applovin.impl.b.a;

import android.net.Uri;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdkSettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c implements AppLovinSdkSettings.TermsFlowSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f8671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f8672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f8673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<Uri> f8674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f8675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<Uri> f8677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f8678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8679j;

    public enum a {
        TERMS("default"),
        UNIFIED("unified");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f8683c;

        a(String str) {
            this.f8683c = str;
        }

        public String a() {
            return this.f8683c;
        }
    }

    public c(boolean z10, Uri uri, Uri uri2) {
        this(z10, a.TERMS, uri, uri2, Collections.emptyList(), false, Collections.emptyList(), false);
    }

    public c(boolean z10, a aVar, Uri uri, Uri uri2, List<Uri> list, boolean z11, List<Uri> list2, boolean z12) {
        this.f8675f = new Object();
        this.f8678i = new Object();
        this.f8670a = z10;
        this.f8671b = aVar;
        this.f8672c = uri;
        this.f8673d = uri2;
        this.f8674e = list;
        this.f8676g = z11;
        this.f8677h = list2;
        this.f8679j = z12;
        if (z10) {
            y.f("ConsentFlowSettings", "Creating with initial values: isEnabled=" + z10 + ",\n\tprivacyPolicyUri=" + uri + ",\n\ttermsOfServiceUri=" + uri2 + ",\n\tadvertisingPartnerUris=" + list + ",\n\tshouldIncludeDefaultAdvertisingPartnerUris=" + z11 + ",\n\tanalyticsPartnerUris=" + list2 + ",\n\tshouldIncludeDefaultAnalyticsPartnerUris=" + z12);
        }
    }

    public a a() {
        return this.f8671b;
    }

    public List<Uri> b() {
        ArrayList arrayList;
        synchronized (this.f8675f) {
            arrayList = new ArrayList(this.f8674e);
        }
        return arrayList;
    }

    public boolean c() {
        return this.f8676g;
    }

    public List<Uri> d() {
        ArrayList arrayList;
        synchronized (this.f8678i) {
            arrayList = new ArrayList(this.f8677h);
        }
        return arrayList;
    }

    public boolean e() {
        return this.f8679j;
    }

    @Override // com.applovin.sdk.AppLovinSdkSettings.TermsFlowSettings
    public Uri getPrivacyPolicyUri() {
        return this.f8672c;
    }

    @Override // com.applovin.sdk.AppLovinSdkSettings.TermsFlowSettings
    public Uri getTermsOfServiceUri() {
        return this.f8673d;
    }

    @Override // com.applovin.sdk.AppLovinSdkSettings.TermsFlowSettings
    public boolean isEnabled() {
        return this.f8670a;
    }

    @Override // com.applovin.sdk.AppLovinSdkSettings.TermsFlowSettings
    public void setEnabled(boolean z10) {
        y.f("ConsentFlowSettingsImpl", "Setting consent flow enabled: " + z10);
        this.f8670a = z10;
    }

    @Override // com.applovin.sdk.AppLovinSdkSettings.TermsFlowSettings
    public void setPrivacyPolicyUri(Uri uri) {
        y.f("ConsentFlowSettingsImpl", "Setting privacy policy: " + uri);
        this.f8672c = uri;
    }

    @Override // com.applovin.sdk.AppLovinSdkSettings.TermsFlowSettings
    public void setTermsOfServiceUri(Uri uri) {
        y.f("ConsentFlowSettingsImpl", "Setting terms of service: " + uri);
        this.f8673d = uri;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ConsentFlowSettings{isEnabled=");
        sbA.append(this.f8670a);
        sbA.append(", privacyPolicyUri=");
        sbA.append(this.f8672c);
        sbA.append(", termsOfServiceUri=");
        sbA.append(this.f8673d);
        sbA.append(", advertisingPartnerUris=");
        sbA.append(this.f8674e);
        sbA.append(", analyticsPartnerUris=");
        return l1.f.a(sbA, this.f8677h, '}');
    }
}
