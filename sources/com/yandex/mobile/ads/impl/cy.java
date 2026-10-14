package com.yandex.mobile.ads.impl;

import android.util.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final class cy {
    public final String a() {
        byte[] bArrDecode = Base64.decode("c2Ftc3VuZw==", 0);
        fd.j0.h(bArrDecode, "decode(\"c2Ftc3VuZw==\", Base64.DEFAULT)");
        return new String(bArrDecode, ed.c.f29139b);
    }

    public final String b() {
        byte[] bArrDecode = Base64.decode("WFQxNjUw", 0);
        fd.j0.h(bArrDecode, "decode(\"WFQxNjUw\", Base64.DEFAULT)");
        return new String(bArrDecode, ed.c.f29139b);
    }
}
