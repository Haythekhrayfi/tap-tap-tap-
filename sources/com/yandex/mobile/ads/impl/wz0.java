package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class wz0 implements ww0<nz0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26399a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zz0 f26403e = new zz0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qz0 f26400b = new qz0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l01 f26401c = new l01();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final pk f26402d = new pk();

    public wz0(Context context) {
        this.f26399a = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.ww0
    public final nz0 a(wm0 wm0Var) {
        return (nz0) this.f26403e.a(wm0Var);
    }

    @Override // com.yandex.mobile.ads.impl.ww0
    public final boolean a() {
        nz0 nz0VarA = i01.b().a(this.f26399a);
        if (nz0VarA != null && !this.f26400b.a(nz0VarA)) {
            Objects.requireNonNull(this.f26401c);
            if (!l01.a(nz0VarA)) {
                Objects.requireNonNull(this.f26402d);
                if (!(i01.b().g() != nz0VarA.a0())) {
                    Objects.requireNonNull(this.f26402d);
                    if (!(Boolean.valueOf(i01.b().f()).booleanValue() != nz0VarA.N())) {
                        Objects.requireNonNull(this.f26402d);
                        if (!(i01.b().d() != nz0VarA.t())) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
