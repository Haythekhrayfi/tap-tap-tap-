package com.applovin.exoplayer2;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class aq implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g.a<aq> f4293b = com.applovin.exoplayer2.a.p.f3993i;

    /* JADX INFO: Access modifiers changed from: private */
    public static aq a(Bundle bundle) {
        g.a aVar;
        int i10 = bundle.getInt(a(0), -1);
        if (i10 == 0) {
            aVar = x.f8241a;
        } else if (i10 == 1) {
            aVar = aj.f4226a;
        } else if (i10 == 2) {
            aVar = ax.f4359a;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(android.support.v4.media.a.a("Encountered unknown rating type: ", i10));
            }
            aVar = az.f4371a;
        }
        return (aq) aVar.fromBundle(bundle);
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
