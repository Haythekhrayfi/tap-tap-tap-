package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class do0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q91 f19931a;

    public do0(q91 q91Var) {
        this.f19931a = q91Var;
    }

    public final nw0 a(mw0<?> mw0Var, Map<String, String> map) throws fc, IOException {
        fd.j0.i(mw0Var, "request");
        fd.j0.i(map, "additionalHeaders");
        URL urlA = fn0.a(mw0Var, this.f19931a);
        Map<String, String> mapF = mw0Var.f();
        fd.j0.h(mapF, "request.headers");
        Map mapL = kc.f0.l(kc.f0.g(map, mapF));
        if (!mapL.containsKey("Content-Type")) {
            mapL.put("Content-Type", mw0.c());
        }
        ry ryVarA = ry.b.a(mapL);
        int iA = ne0.a(mw0Var);
        byte[] bArrB = mw0Var.b();
        return new nw0.a().a(urlA).a(ryVarA).a(oe0.a(iA), bArrB != null ? qw0.a.b(bArrB) : null).a();
    }
}
