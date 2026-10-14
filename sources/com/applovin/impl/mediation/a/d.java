package com.applovin.impl.mediation.a;

import android.os.SystemClock;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d extends e implements com.applovin.impl.sdk.ad.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f9046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f9047d;

    public d(int i10, Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, o oVar) {
        super(i10, map, jSONObject, jSONObject2, null, oVar);
        this.f9046c = new AtomicBoolean();
        this.f9047d = new AtomicBoolean();
    }

    private d(d dVar, com.applovin.impl.mediation.g gVar) {
        super(dVar.H(), dVar.ak(), dVar.aa(), dVar.Z(), gVar, dVar.f9049b);
        this.f9046c = new AtomicBoolean();
        this.f9047d = new AtomicBoolean();
    }

    private long O() {
        long jB = b("ad_expiration_ms", -1L);
        return jB < 0 ? a("ad_expiration_ms", ((Long) this.f9049b.a(com.applovin.impl.sdk.c.a.D)).longValue()) : jB;
    }

    public MaxNativeAdView I() {
        return ((a) this).f9031a.c();
    }

    public String J() {
        return BundleUtils.getString("template", "", al());
    }

    public boolean K() {
        return b("inacc", (Boolean) this.f9049b.a(com.applovin.impl.sdk.c.a.V)).booleanValue();
    }

    public boolean L() {
        return ((a) this).f9031a == null;
    }

    public AtomicBoolean M() {
        return this.f9046c;
    }

    public AtomicBoolean N() {
        return this.f9047d;
    }

    @Override // com.applovin.impl.sdk.ad.g
    public long U() {
        return O() - (SystemClock.elapsedRealtime() - C());
    }

    @Override // com.applovin.impl.sdk.ad.g
    public void V() {
        MaxNativeAd nativeAd = getNativeAd();
        if (nativeAd != null) {
            nativeAd.setExpired();
        }
    }

    @Override // com.applovin.impl.mediation.a.a
    public a a(com.applovin.impl.mediation.g gVar) {
        return new d(this, gVar);
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        ((a) this).f9031a.a(maxNativeAdView);
    }
}
