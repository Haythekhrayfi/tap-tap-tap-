package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.Trace;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05572c {
    public static void A00() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    public static void A01(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
