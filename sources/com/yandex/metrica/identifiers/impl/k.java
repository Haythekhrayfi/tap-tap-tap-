package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import fd.j0;
import r2.a;

/* JADX INFO: loaded from: classes.dex */
public final class k implements i {
    @Override // com.yandex.metrica.identifiers.impl.i
    public g a(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            j0.h(advertisingIdInfo, "AdvertisingIdClient.getAdvertisingIdInfo(context)");
            return new g(l.f13602b, new f("google", advertisingIdInfo.getId(), Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled())), null, 4);
        } catch (GooglePlayServicesNotAvailableException unused) {
            return new g(l.f13603c, null, "could not resolve google services", 2);
        } catch (Throwable th) {
            return new g(l.f13604d, null, a.a(th, defpackage.a.a("exception while fetching google adv_id: ")), 2);
        }
    }
}
