package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.mediation.base.a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class md0<T extends com.yandex.mobile.ads.mediation.base.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ce0> f23025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sd0 f23026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final od0<T> f23027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23028d;

    public md0(List<ce0> list, sd0 sd0Var, qd0 qd0Var) {
        this.f23025a = list;
        this.f23026b = sd0Var;
        this.f23027c = new od0<>(qd0Var);
    }

    public final hd0<T> a(Context context, Class<T> cls) {
        hd0<T> hd0Var = null;
        while (hd0Var == null && this.f23028d < this.f23025a.size()) {
            List<ce0> list = this.f23025a;
            int i10 = this.f23028d;
            this.f23028d = i10 + 1;
            ce0 ce0Var = list.get(i10);
            com.yandex.mobile.ads.mediation.base.a aVarA = this.f23027c.a(context, ce0Var, cls);
            if (aVarA != null) {
                hd0Var = new hd0<>(aVarA, ce0Var, this.f23026b);
            }
        }
        return hd0Var;
    }
}
