package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.logging.Logger;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes3.dex */
public final class z51 {
    public static final String a(long j10) {
        StringBuilder sb2;
        long j11;
        long j12;
        long j13;
        if (j10 > -999500000) {
            if (j10 > -999500) {
                if (j10 <= 0) {
                    sb2 = new StringBuilder();
                    j13 = j10 - ((long) 500);
                } else if (j10 < 999500) {
                    sb2 = new StringBuilder();
                    j13 = j10 + ((long) 500);
                } else if (j10 < 999500000) {
                    sb2 = new StringBuilder();
                    j12 = j10 + ((long) 500000);
                } else {
                    sb2 = new StringBuilder();
                    j11 = j10 + ((long) 500000000);
                }
                sb2.append(j13 / ((long) 1000));
                sb2.append(" µs");
                String str = String.format("%6s", Arrays.copyOf(new Object[]{sb2.toString()}, 1));
                fd.j0.h(str, "format(format, *args)");
                return str;
            }
            sb2 = new StringBuilder();
            j12 = j10 - ((long) 500000);
            sb2.append(j12 / ((long) 1000000));
            sb2.append(" ms");
            String str2 = String.format("%6s", Arrays.copyOf(new Object[]{sb2.toString()}, 1));
            fd.j0.h(str2, "format(format, *args)");
            return str2;
        }
        sb2 = new StringBuilder();
        j11 = j10 - ((long) 500000000);
        sb2.append(j11 / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
        sb2.append(" s ");
        String str3 = String.format("%6s", Arrays.copyOf(new Object[]{sb2.toString()}, 1));
        fd.j0.h(str3, "format(format, *args)");
        return str3;
    }

    public static final void a(y51 y51Var, b61 b61Var, String str) {
        c61 c61Var = c61.f19395h;
        Logger loggerA = c61.b.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b61Var.f());
        sb2.append(' ');
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        fd.j0.h(str2, "format(format, *args)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(y51Var.b());
        loggerA.fine(sb2.toString());
    }
}
