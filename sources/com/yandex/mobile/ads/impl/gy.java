package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class gy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final iv0 f21231b = new iv0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g8 f21232c = new g8();

    public gy(Context context) {
        this.f21230a = context.getApplicationContext();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
    public final f8 a() {
        try {
            Objects.requireNonNull(this.f21231b);
            if (AdvertisingIdClient.class == 0) {
                return null;
            }
            iv0 iv0Var = this.f21231b;
            Object[] objArr = {this.f21230a};
            Objects.requireNonNull(iv0Var);
            Object objA = iv0.a(AdvertisingIdClient.class, "getAdvertisingIdInfo", objArr);
            if (objA == null) {
                return null;
            }
            String str = (String) iv0.a(objA, "getId", new Object[0]);
            Boolean bool = (Boolean) iv0.a(objA, "isLimitAdTrackingEnabled", new Object[0]);
            Objects.requireNonNull(this.f21232c);
            if (bool == null || str == null) {
                return null;
            }
            return new f8(str, bool.booleanValue());
        } catch (Throwable th) {
            x60.a(th, "Exception during advertising info receiving from GMS client API", new Object[0]);
            return null;
        }
    }
}
