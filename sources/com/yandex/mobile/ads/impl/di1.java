package com.yandex.mobile.ads.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class di1 {
    public static fx0 a(wm0 wm0Var) {
        fd.j0.i(wm0Var, "response");
        int i10 = wm0Var.f26319a;
        jx0 jx0Var = new jx0(wm0Var.f26320b);
        Map map = wm0Var.f26321c;
        if (map == null) {
            map = kc.x.f32010c;
        }
        return new fx0(i10, jx0Var, map);
    }

    public static wm0 a(fx0 fx0Var) {
        fd.j0.i(fx0Var, "response");
        return new wm0(fx0Var.c(), fx0Var.a().a(), fx0Var.b());
    }
}
