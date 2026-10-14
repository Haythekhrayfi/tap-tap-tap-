package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class qk implements id {
    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.id
    public final int a(Context context, int i10) {
        double d10;
        double d11;
        int iB;
        int i11;
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        float fB = bd.e.b(100.0f, eh1.b(context) * 0.15f);
        if (i10 <= 655) {
            if (i10 > 632) {
                iB = 81;
            } else if (i10 > 526) {
                d10 = ((double) i10) / 468.0d;
                d11 = 60.0d;
            } else if (i10 > 432) {
                iB = 68;
            } else {
                d10 = ((double) i10) / 320.0d;
                d11 = 50.0d;
            }
            i11 = (int) fB;
            if (iB > i11) {
                iB = i11;
            }
            if (iB < 50) {
                return 50;
            }
            return iB;
        }
        d10 = ((double) i10) / 728.0d;
        d11 = 90.0d;
        iB = xc.b.b(d10 * d11);
        i11 = (int) fB;
        if (iB > i11) {
            iB = i11;
        }
        if (iB < 50) {
            return 50;
        }
        return iB;
    }
}
