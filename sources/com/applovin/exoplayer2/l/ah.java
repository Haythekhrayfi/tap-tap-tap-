package com.applovin.exoplayer2.l;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class ah {
    public static void a() {
        if (ai.f7595a >= 18) {
            b();
        }
    }

    public static void a(String str) {
        if (ai.f7595a >= 18) {
            b(str);
        }
    }

    private static void b() {
        Trace.endSection();
    }

    private static void b(String str) {
        Trace.beginSection(str);
    }
}
