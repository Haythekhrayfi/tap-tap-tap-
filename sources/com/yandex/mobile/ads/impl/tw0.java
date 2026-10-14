package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ImagesContract;
import java.net.Proxy;

/* JADX INFO: loaded from: classes3.dex */
public final class tw0 {
    public static String a(d10 d10Var) {
        fd.j0.i(d10Var, ImagesContract.URL);
        String strC = d10Var.c();
        String strE = d10Var.e();
        if (strE == null) {
            return strC;
        }
        return strC + '?' + strE;
    }

    public static String a(nw0 nw0Var, Proxy.Type type) {
        fd.j0.i(nw0Var, "request");
        fd.j0.i(type, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(nw0Var.f());
        sb2.append(' ');
        boolean z10 = !nw0Var.e() && type == Proxy.Type.HTTP;
        d10 d10VarH = nw0Var.h();
        if (z10) {
            sb2.append(d10VarH);
        } else {
            sb2.append(a(d10VarH));
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        fd.j0.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
