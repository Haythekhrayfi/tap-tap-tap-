package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import com.applovin.adview.AppLovinAdView;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f11353a = new StringBuilder();

    public p a() {
        this.f11353a.append("\n========================================");
        return this;
    }

    public p a(Bundle bundle) {
        if (bundle == null) {
            return this;
        }
        for (String str : bundle.keySet()) {
            a(str, bundle.get(str));
        }
        return this;
    }

    public p a(AppLovinAdView appLovinAdView) {
        return a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).a("Visibility", x.b(appLovinAdView.getVisibility()));
    }

    public p a(com.applovin.impl.mediation.a.a aVar) {
        return a("Network", aVar.ac()).a("Adapter Version", aVar.n()).a("Format", aVar.getFormat().getLabel()).a("Ad Unit ID", aVar.getAdUnitId()).a("Placement", aVar.getPlacement()).a("Network Placement", aVar.x()).a("Serve ID", aVar.j()).a("Creative ID", StringUtils.isValidString(aVar.getCreativeId()) ? aVar.getCreativeId() : "None").a("Ad Review Creative ID", StringUtils.isValidString(aVar.getAdReviewCreativeId()) ? aVar.getAdReviewCreativeId() : "None").a("Ad Domain", StringUtils.isValidString(aVar.k()) ? aVar.k() : "None").a("DSP Name", StringUtils.isValidString(aVar.getDspName()) ? aVar.getDspName() : "None").a("DSP ID", StringUtils.isValidString(aVar.getDspId()) ? aVar.getDspId() : "None").a("Server Parameters", aVar.al());
    }

    public p a(com.applovin.impl.sdk.ad.e eVar) {
        boolean z10 = eVar instanceof com.applovin.impl.c.a;
        a("Format", eVar.getAdZone().b() != null ? eVar.getAdZone().b().getLabel() : null).a("Ad ID", Long.valueOf(eVar.getAdIdNumber())).a("Zone ID", eVar.getAdZone().a()).a("Source", eVar.getSource()).a("Ad Class", z10 ? "VastAd" : "AdServerAd");
        String dspName = eVar.getDspName();
        if (StringUtils.isValidString(dspName)) {
            a("DSP Name", dspName);
        }
        if (z10) {
            a("VAST DSP", ((com.applovin.impl.c.a) eVar).n());
        }
        return this;
    }

    public p a(com.applovin.impl.sdk.o oVar) {
        return a("Muted", Boolean.valueOf(oVar.ay().isMuted()));
    }

    public p a(String str) {
        StringBuilder sb2 = this.f11353a;
        sb2.append("\n");
        sb2.append(str);
        return this;
    }

    public p a(String str, Object obj) {
        return a(str, obj, "");
    }

    public p a(String str, Object obj, String str2) {
        StringBuilder sb2 = this.f11353a;
        sb2.append("\n");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append(str2);
        return this;
    }

    public p b(com.applovin.impl.sdk.ad.e eVar) {
        a("Target", eVar.p()).a("close_style", eVar.v()).a("close_delay_graphic", Long.valueOf(eVar.t()), "s");
        if (eVar instanceof com.applovin.impl.sdk.ad.a) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) eVar;
            a("HTML", aVar.b().substring(0, Math.min(aVar.b().length(), 64)));
        }
        if (eVar.hasVideoUrl()) {
            a("close_delay", Long.valueOf(eVar.r()), "s").a("skip_style", eVar.x()).a("Streaming", Boolean.valueOf(eVar.f())).a("Video Location", eVar.d()).a("video_button_properties", eVar.D());
        }
        return this;
    }

    public p b(String str) {
        this.f11353a.append(str);
        return this;
    }

    public String toString() {
        return this.f11353a.toString();
    }
}
