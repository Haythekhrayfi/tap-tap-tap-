package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class qf1 implements et0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h6 f24479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ue1 f24480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lr0 f24481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final es0 f24482d;

    public qf1(h6 h6Var, kr0 kr0Var, es0 es0Var) {
        this.f24479a = h6Var;
        this.f24481c = kr0Var.d();
        this.f24480b = kr0Var.a();
        this.f24482d = es0Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    @Override // com.yandex.mobile.ads.impl.et0
    public final ar0 a() {
        Long lValueOf;
        long jA;
        long jLongValue;
        bu buVarA = this.f24482d.a();
        ir0 ir0VarB = this.f24482d.b();
        if (buVarA == null) {
            if (ir0VarB == null || this.f24479a.c() || this.f24481c.c()) {
                lValueOf = null;
            } else {
                jA = ir0VarB.a();
            }
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = -1;
            }
            long jA2 = this.f24480b.a();
            return new ar0(jLongValue, jA2 != -9223372036854775807L ? jA2 : -1L);
        }
        jA = buVarA.a();
        lValueOf = Long.valueOf(jA);
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        } else {
            jLongValue = -1;
        }
        long jA3 = this.f24480b.a();
        return new ar0(jLongValue, jA3 != -9223372036854775807L ? jA3 : -1L);
    }
}
