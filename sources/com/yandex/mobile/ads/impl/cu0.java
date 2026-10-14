package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class cu0 implements du0 {
    public final void a(int i10, qd.c cVar) throws IOException {
        fd.j0.i(cVar, "source");
        cVar.skip(i10);
    }

    public final void a(as asVar) {
        fd.j0.i(asVar, "errorCode");
    }

    public final void a(List list) {
        fd.j0.i(list, "responseHeaders");
    }

    public final void b(List list) {
        fd.j0.i(list, "requestHeaders");
    }
}
