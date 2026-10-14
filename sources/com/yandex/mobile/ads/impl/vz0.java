package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class vz0 extends ke<nz0> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ww0<nz0> f26105r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Context f26106s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map<String, String> f26107t;

    public vz0(Context context, String str, wz0 wz0Var, Map map, xz0 xz0Var) {
        super(0, str, xz0Var);
        this.f26106s = context;
        this.f26105r = wz0Var;
        this.f26107t = map;
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    public final gx0<nz0> a(wm0 wm0Var) {
        int i10;
        if (200 == wm0Var.f26319a) {
            nz0 nz0VarA = this.f26105r.a(wm0Var);
            if (nz0VarA != null) {
                return gx0.a(nz0VarA, u00.a(wm0Var));
            }
            i10 = 5;
        } else {
            i10 = 8;
        }
        return gx0.a(new p2(wm0Var, i10));
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    public final bi1 b(bi1 bi1Var) {
        x60.a(bi1Var, bi1Var.toString(), new Object[0]);
        wm0 wm0Var = bi1Var.f19272a;
        int i10 = p2.f23954c;
        return p2.a.b(wm0Var);
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    public final Map<String, String> f() throws fc {
        HashMap map = new HashMap();
        v00.a(this.f26106s, map);
        map.putAll(this.f26107t);
        return map;
    }
}
