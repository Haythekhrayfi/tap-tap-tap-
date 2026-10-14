package com.applovin.impl.sdk;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f11423a;

    public static void a() {
        f11423a = true;
    }

    public static void a(final o oVar) {
        Long l10 = (Long) oVar.a(com.applovin.impl.sdk.c.a.Z);
        if (l10.longValue() <= 0) {
            return;
        }
        oVar.G().a(new com.applovin.impl.sdk.e.ac(oVar, true, "submitIntegrationErrorReport", new Runnable() { // from class: com.applovin.impl.sdk.w.1
            @Override // java.lang.Runnable
            public void run() {
                if (w.f11423a) {
                    return;
                }
                oVar.ag().a(s.a.INTEGRATION_ERROR);
            }
        }), com.applovin.impl.sdk.e.r.b.MAIN, TimeUnit.SECONDS.toMillis(l10.longValue()));
    }
}
