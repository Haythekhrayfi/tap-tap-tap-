package com.yandex.mobile.ads.impl;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class nq implements oq {
    @Override // com.yandex.mobile.ads.impl.oq
    public final List<InetAddress> a(String str) throws UnknownHostException {
        fd.j0.i(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            fd.j0.h(allByName, "getAllByName(hostname)");
            return kc.j.B(allByName);
        } catch (NullPointerException e10) {
            UnknownHostException unknownHostException = new UnknownHostException(fn1.a("Broken system behaviour for dns lookup of ", str));
            unknownHostException.initCause(e10);
            throw unknownHostException;
        }
    }
}
