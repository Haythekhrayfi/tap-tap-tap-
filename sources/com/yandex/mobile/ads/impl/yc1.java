package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class yc1 implements h01.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uw0 f26768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wh1 f26769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zc1 f26771d;

    public yc1(zc1 zc1Var, k40 k40Var, wh1 wh1Var, Object obj) {
        this.f26771d = zc1Var;
        this.f26768a = k40Var;
        this.f26769b = wh1Var;
        this.f26770c = obj;
    }

    @Override // com.yandex.mobile.ads.impl.h01.a
    public final void a(d8 d8Var, wr wrVar) {
        zh1 zh1Var = new zh1(this.f26771d.f27280b, this.f26768a);
        zc1.a(this.f26771d, d8Var, wrVar);
        this.f26771d.f27280b.b(v3.f25811n);
        this.f26771d.f27282d.a(this.f26771d.f27279a, this.f26771d.f27281c, this.f26769b, this.f26770c, zh1Var);
    }

    @Override // com.yandex.mobile.ads.impl.h01.a
    public final void a(t2 t2Var) {
        Objects.requireNonNull(this.f26771d.f27285g);
        this.f26768a.a(mc1.a(t2Var));
    }
}
