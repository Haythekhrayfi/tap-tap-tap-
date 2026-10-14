package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class jd {
    public static final id a(pd pdVar) {
        fd.j0.i(pdVar, "bannerSizeCalculationType");
        int iOrdinal = pdVar.ordinal();
        if (iOrdinal == 0) {
            return new qk();
        }
        if (iOrdinal == 1) {
            return new nu0();
        }
        if (iOrdinal == 2) {
            return new jz0();
        }
        if (iOrdinal == 3) {
            return new kz0();
        }
        throw new jc.g();
    }
}
