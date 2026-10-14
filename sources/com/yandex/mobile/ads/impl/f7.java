package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class f7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InstreamAdRequestConfiguration f20565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g4 f20566c = new g4();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final if1 f20567d = new if1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ws f20568e = new ws();

    public f7(Context context, InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        this.f20564a = context.getApplicationContext();
        this.f20565b = instreamAdRequestConfiguration;
    }

    public final t40 a() {
        z80 z80Var = new z80(this.f20564a, this.f20565b);
        g6 g6Var = new g6();
        kr0 kr0Var = new kr0();
        ue1 ue1VarA = kr0Var.a();
        ys ysVarC = kr0Var.c();
        es0 es0Var = new es0();
        i4 i4Var = new i4(new f6(new au(es0Var, ue1VarA)));
        jf1 jf1Var = new jf1();
        cf cfVar = new cf();
        Objects.requireNonNull(this.f20568e);
        h6 h6VarB = g6Var.b();
        d4 d4VarC = g6Var.c();
        ys ysVarC2 = kr0Var.c();
        ue1 ue1VarA2 = kr0Var.a();
        j2 j2Var = new j2(cfVar, g6Var, kr0Var, i4Var);
        se1 se1Var = new se1(d4VarC, ue1VarA2, es0Var, jf1Var);
        jr0 jr0Var = new jr0(h6VarB, j2Var, se1Var, i4Var);
        cr0 cr0Var = new cr0(d4VarC, es0Var, ue1VarA2, jr0Var);
        fr0 fr0Var = new fr0(h6VarB, i4Var);
        rq0 rq0Var = new rq0(cfVar, kr0Var, g6Var, se1Var, new au(es0Var, ue1VarA2), j2Var);
        vs vsVar = new vs(cfVar, ysVarC2, cr0Var, jr0Var, fr0Var, new w61(d4VarC, kr0Var, new h7(cfVar, d4VarC, ue1VarA2, es0Var), rq0Var), rq0Var);
        e4 e4Var = new e4(ue1VarA);
        Objects.requireNonNull(this.f20566c);
        h6 h6VarB2 = g6Var.b();
        d4 d4VarC2 = g6Var.c();
        ue1 ue1VarA3 = kr0Var.a();
        ys ysVarC3 = kr0Var.c();
        xs0 xs0Var = new xs0(new q4(h6VarB2, kr0Var));
        ysVarC3.a(xs0Var);
        ls lsVar = new ls(h6VarB2, kr0Var, xs0Var, new k4(g6Var, new y2(ue1VarA3, d4VarC2)), new j4(g6Var, kr0Var, i4Var), i4Var);
        Objects.requireNonNull(this.f20567d);
        h6 h6VarB3 = g6Var.b();
        ys ysVarC4 = kr0Var.c();
        xs0 xs0Var2 = new xs0(new qf1(h6VarB3, kr0Var, es0Var));
        ysVarC4.a(xs0Var2);
        return new t40(g6Var, e4Var, new bf(this.f20564a, lsVar, new cm1(xs0Var2, kr0Var.e(), jf1Var)), cfVar, z80Var, kr0Var, new ps(cfVar, g6Var, i4Var, ysVarC), es0Var, vsVar);
    }
}
