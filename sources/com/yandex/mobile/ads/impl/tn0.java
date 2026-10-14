package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes3.dex */
public final class tn0 implements ut {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private wt f25418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s41 f25419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25420c;

    static {
        yn1 yn1Var = yn1.C;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private boolean a(xn xnVar) throws IOException {
        boolean zA;
        s41 zo0Var;
        vn0 vn0Var = new vn0();
        if (vn0Var.a(xnVar, true) && (vn0Var.f26039a & 2) == 2) {
            int iMin = Math.min(vn0Var.f26043e, 8);
            mp0 mp0Var = new mp0(iMin);
            xnVar.b(mp0Var.c(), 0, iMin, false);
            mp0Var.e(0);
            if (mp0Var.a() >= 5 && mp0Var.t() == 127 && mp0Var.v() == 1179402563) {
                zo0Var = new nv();
            } else {
                mp0Var.e(0);
                try {
                    zA = mi1.a(1, mp0Var, true);
                } catch (qp0 unused) {
                    zA = false;
                }
                if (zA) {
                    zo0Var = new ki1();
                } else {
                    mp0Var.e(0);
                    if (zo0.b(mp0Var)) {
                        zo0Var = new zo0();
                    }
                }
            }
            this.f25419b = zo0Var;
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ut[] a() {
        return new ut[]{new tn0()};
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final int a(vt vtVar, cs0 cs0Var) throws IOException {
        pa.b(this.f25418a);
        if (this.f25419b == null) {
            xn xnVar = (xn) vtVar;
            if (!a(xnVar)) {
                throw qp0.a("Failed to determine bitstream type", (Exception) null);
            }
            xnVar.c();
        }
        if (!this.f25420c) {
            j71 j71VarA = this.f25418a.a(0, 1);
            this.f25418a.a();
            this.f25419b.a(this.f25418a, j71VarA);
            this.f25420c = true;
        }
        return this.f25419b.a((xn) vtVar, cs0Var);
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(long j10, long j11) {
        s41 s41Var = this.f25419b;
        if (s41Var != null) {
            s41Var.a(j10, j11);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(wt wtVar) {
        this.f25418a = wtVar;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final boolean a(vt vtVar) throws IOException {
        try {
            return a((xn) vtVar);
        } catch (qp0 unused) {
            return false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void release() {
    }
}
