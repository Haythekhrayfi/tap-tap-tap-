package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class og0 implements b00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kg0 f23786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zf0 f23787b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final yi1 f23789d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private di f23791f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ve1 f23788c = new ve1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final xf0 f23790e = new xf0();

    public og0(kg0 kg0Var, zf0 zf0Var) {
        this.f23786a = kg0Var;
        this.f23787b = zf0Var;
        this.f23789d = new yi1(kg0Var);
    }

    public final void a() {
        this.f23789d.a(Collections.emptyMap());
    }

    public final void a(di diVar) {
        this.f23791f = diVar;
    }

    @Override // com.yandex.mobile.ads.impl.b00
    public final void a(kp0 kp0Var, Map map) {
    }

    @Override // com.yandex.mobile.ads.impl.b00
    public final void a(t2 t2Var) {
    }

    @Override // com.yandex.mobile.ads.impl.b00
    public final void a(String str) {
        di diVar = this.f23791f;
        if (diVar != null) {
            ((tf0) diVar).a(this.f23786a, str);
        }
    }

    @Override // com.yandex.mobile.ads.impl.b00
    public final void a(boolean z10) {
    }

    public final void b(String str) {
        Objects.requireNonNull(this.f23790e);
        boolean zA = xf0.a(str);
        Objects.requireNonNull(xz.a());
        wz wzVarA = xz.a(zA);
        kg0 kg0Var = this.f23786a;
        ve1 ve1Var = this.f23788c;
        zf0 zf0Var = this.f23787b;
        wzVarA.a(kg0Var, this, ve1Var, zf0Var, zf0Var, zf0Var).a(str);
    }
}
