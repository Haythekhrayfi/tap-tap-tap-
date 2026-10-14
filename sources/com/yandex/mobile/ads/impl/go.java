package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class go implements eb0.b {
    @Override // com.yandex.mobile.ads.impl.eb0.b
    public final eb0 a(eb0.a aVar) throws IOException {
        int i10 = da1.f19803a;
        if (i10 < 23 || i10 < 31) {
            return new p51.a().a(aVar);
        }
        int iA = te0.a(aVar.f20140c.f27115l);
        StringBuilder sbA = v60.a("Creating an asynchronous MediaCodec adapter for track type ");
        sbA.append(da1.d(iA));
        p90.c("DMCodecAdapterFactory", sbA.toString());
        return new ob.a(iA).a(aVar);
    }
}
