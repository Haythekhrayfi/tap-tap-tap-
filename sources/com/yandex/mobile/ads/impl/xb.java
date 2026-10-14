package com.yandex.mobile.ads.impl;

import android.util.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final class xb {
    public final String a() {
        byte[] bArrDecode = Base64.decode("QW1hem9u", 0);
        fd.j0.h(bArrDecode, "decode(\"QW1hem9u\", Base64.DEFAULT)");
        return new String(bArrDecode, ed.c.f29139b);
    }

    public final String b() {
        byte[] bArrDecode = Base64.decode("ZnVndQ==", 0);
        fd.j0.h(bArrDecode, "decode(\"ZnVndQ==\", Base64.DEFAULT)");
        return new String(bArrDecode, ed.c.f29139b);
    }

    public final String c() {
        byte[] bArrDecode = Base64.decode("WGlhb21p", 0);
        fd.j0.h(bArrDecode, "decode(\"WGlhb21p\", Base64.DEFAULT)");
        return new String(bArrDecode, ed.c.f29139b);
    }
}
