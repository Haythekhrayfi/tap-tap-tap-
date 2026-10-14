package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.adview.AppLovinAdView;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a implements c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f11611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdSize f11612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f11613c;

    public a(b bVar, Bundle bundle, AppLovinAdSize appLovinAdSize) {
        this.f11613c = bVar;
        this.f11611a = bundle;
        this.f11612b = appLovinAdSize;
    }

    @Override // com.google.ads.mediation.applovin.c.b
    public void onInitializeSuccess(String str) {
        b bVar = this.f11613c;
        bVar.f11616d = bVar.f11619g.c(this.f11611a, bVar.f11617e);
        this.f11613c.f11618f = AppLovinUtils.retrieveZoneId(this.f11611a);
        int i10 = b.f11614l;
        StringBuilder sbA = defpackage.a.a("Requesting banner of size ");
        sbA.append(this.f11612b);
        sbA.append(" for zone: ");
        sbA.append(this.f11613c.f11618f);
        Log.d("b", sbA.toString());
        b bVar2 = this.f11613c;
        p4.a aVar = bVar2.f11620h;
        AppLovinSdk appLovinSdk = bVar2.f11616d;
        AppLovinAdSize appLovinAdSize = this.f11612b;
        Context context = bVar2.f11617e;
        Objects.requireNonNull(aVar);
        bVar2.f11615c = new g6.c(appLovinSdk, appLovinAdSize, context);
        b bVar3 = this.f11613c;
        ((AppLovinAdView) bVar3.f11615c.f30015b).setAdDisplayListener(bVar3);
        b bVar4 = this.f11613c;
        ((AppLovinAdView) bVar4.f11615c.f30015b).setAdClickListener(bVar4);
        b bVar5 = this.f11613c;
        ((AppLovinAdView) bVar5.f11615c.f30015b).setAdViewEventListener(bVar5);
        if (TextUtils.isEmpty(this.f11613c.f11618f)) {
            this.f11613c.f11616d.getAdService().loadNextAd(this.f11612b, this.f11613c);
            return;
        }
        AppLovinAdService adService = this.f11613c.f11616d.getAdService();
        b bVar6 = this.f11613c;
        adService.loadNextAdForZoneId(bVar6.f11618f, bVar6);
    }
}
