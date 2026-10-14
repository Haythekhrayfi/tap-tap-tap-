package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface pv0 extends hr0.b {

    public interface a {
        void a();

        void b();
    }

    default void a(float f10, float f11) throws ns {
    }

    void a(int i10, gr0 gr0Var);

    void a(long j10) throws ns;

    void a(long j10, long j11) throws ns;

    void a(rv0 rv0Var, yv[] yvVarArr, fz0 fz0Var, long j10, boolean z10, boolean z11, long j11, long j12) throws ns;

    void a(yv[] yvVarArr, fz0 fz0Var, long j10, long j11) throws ns;

    boolean a();

    void b();

    int c();

    boolean d();

    boolean e();

    fz0 g();

    String getName();

    void h();

    void i() throws IOException;

    long j();

    boolean k();

    db0 l();

    int m();

    me n();

    void reset();

    void start() throws ns;

    void stop();
}
