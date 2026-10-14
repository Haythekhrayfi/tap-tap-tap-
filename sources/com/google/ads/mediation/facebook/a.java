package com.google.ads.mediation.facebook;

import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class a implements AudienceNetworkAds.InitListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f11642d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11643a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11644b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<InterfaceC0154a> f11645c = new ArrayList<>();

    /* JADX INFO: renamed from: com.google.ads.mediation.facebook.a$a, reason: collision with other inner class name */
    public interface InterfaceC0154a {
        void a(AdError adError);

        void b();
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public void onInitialized(AudienceNetworkAds.InitResult initResult) {
        this.f11643a = false;
        this.f11644b = initResult.isSuccess();
        for (InterfaceC0154a interfaceC0154a : this.f11645c) {
            if (initResult.isSuccess()) {
                interfaceC0154a.b();
            } else {
                interfaceC0154a.a(new AdError(104, initResult.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN));
            }
        }
        this.f11645c.clear();
    }
}
