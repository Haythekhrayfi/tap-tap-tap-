package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.webkit.URLUtil;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AtomicLong f26669a = new AtomicLong(SystemClock.elapsedRealtime() - 2000);
    }

    public static void a(Context context, jw0 jw0Var, String str, ResultReceiver resultReceiver, boolean z10) {
        sf sfVar;
        String strG;
        ((gi) jw0Var).a(com.applovin.impl.mediation.b.a.c.a("click_type", "default"));
        if (resultReceiver != null) {
            resultReceiver.send(9, null);
        }
        if (context != null) {
            AtomicLong atomicLong = a.f26669a;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long andSet = jElapsedRealtime - atomicLong.getAndSet(jElapsedRealtime);
            boolean z11 = true;
            if (andSet < 0 || andSet > 1000) {
                nz0 nz0VarA = i01.b().a(context);
                int iA = (nz0VarA == null || (strG = nz0VarA.g()) == null) ? 0 : bi.a(strG);
                if ((!z10 || iA != 0) && !a6.a(2, iA)) {
                    z11 = false;
                }
                if (z11 && t91.a(str)) {
                    sfVar = new sf(context, resultReceiver);
                } else if (new v91().a(context, str)) {
                    resultReceiver.send(7, null);
                    return;
                } else if (!URLUtil.isNetworkUrl(str)) {
                    return;
                } else {
                    sfVar = new sf(context, resultReceiver);
                }
                sfVar.a(str);
            }
        }
    }
}
