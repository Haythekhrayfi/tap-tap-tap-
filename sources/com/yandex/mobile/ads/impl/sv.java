package com.yandex.mobile.ads.impl;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.io.IOException;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class sv implements ut {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private wt f25192f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f25194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f25195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f25197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f25198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f25199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f25200n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private cc f25201o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ag1 f25202p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mp0 f25187a = new mp0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mp0 f25188b = new mp0(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mp0 f25189c = new mp0(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mp0 f25190d = new mp0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final mz0 f25191e = new mz0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25193g = 1;

    static {
        dp1 dp1Var = dp1.B;
    }

    private mp0 a(xn xnVar) throws IOException {
        if (this.f25198l > this.f25190d.b()) {
            mp0 mp0Var = this.f25190d;
            mp0Var.a(0, new byte[Math.max(mp0Var.b() * 2, this.f25198l)]);
        } else {
            this.f25190d.e(0);
        }
        this.f25190d.d(this.f25198l);
        xnVar.a(this.f25190d.c(), 0, this.f25198l, false);
        return this.f25190d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ut[] a() {
        return new ut[]{new sv()};
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    @RequiresNonNull({"extractorOutput"})
    private boolean b(xn xnVar) throws IOException {
        long j10;
        boolean z10;
        if (this.f25194h) {
            j10 = this.f25195i + this.f25199m;
        } else {
            j10 = this.f25191e.a() == -9223372036854775807L ? 0L : this.f25199m;
        }
        int i10 = this.f25197k;
        boolean zA = false;
        if (i10 != 8 || this.f25201o == null) {
            if (i10 == 9 && this.f25202p != null) {
                if (!this.f25200n) {
                    this.f25192f.a(new p01.b(-9223372036854775807L, 0L));
                    this.f25200n = true;
                }
                ag1 ag1Var = this.f25202p;
                mp0 mp0VarA = a(xnVar);
                if (ag1Var.a(mp0VarA) && ag1Var.a(j10, mp0VarA)) {
                    z10 = true;
                    zA = true;
                }
            } else if (i10 != 18 || this.f25200n) {
                xnVar.a(this.f25198l);
                z10 = false;
            } else {
                mz0 mz0Var = this.f25191e;
                mp0 mp0VarA2 = a(xnVar);
                Objects.requireNonNull(mz0Var);
                zA = mz0Var.a(j10, mp0VarA2);
                long jA = this.f25191e.a();
                if (jA != -9223372036854775807L) {
                    this.f25192f.a(new d30(jA, this.f25191e.b(), this.f25191e.c()));
                    this.f25200n = true;
                }
            }
            z10 = true;
        } else {
            if (!this.f25200n) {
                this.f25192f.a(new p01.b(-9223372036854775807L, 0L));
                this.f25200n = true;
            }
            cc ccVar = this.f25201o;
            mp0 mp0VarA3 = a(xnVar);
            ccVar.a(mp0VarA3);
            if (ccVar.a(j10, mp0VarA3)) {
                z10 = true;
                zA = true;
            } else {
                z10 = true;
            }
        }
        if (!this.f25194h && zA) {
            this.f25194h = true;
            this.f25195i = this.f25191e.a() == -9223372036854775807L ? -this.f25199m : 0L;
        }
        this.f25196j = 4;
        this.f25193g = 2;
        return z10;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final int a(vt vtVar, cs0 cs0Var) throws IOException {
        pa.b(this.f25192f);
        while (true) {
            int i10 = this.f25193g;
            boolean z10 = true;
            if (i10 == 1) {
                if (((xn) vtVar).a(this.f25188b.c(), 0, 9, true)) {
                    this.f25188b.e(0);
                    this.f25188b.f(4);
                    int iT = this.f25188b.t();
                    boolean z11 = (iT & 4) != 0;
                    boolean z12 = (iT & 1) != 0;
                    if (z11 && this.f25201o == null) {
                        this.f25201o = new cc(this.f25192f.a(8, 1));
                    }
                    if (z12 && this.f25202p == null) {
                        this.f25202p = new ag1(this.f25192f.a(9, 2));
                    }
                    this.f25192f.a();
                    this.f25196j = (this.f25188b.h() - 9) + 4;
                    this.f25193g = 2;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    return -1;
                }
            } else if (i10 == 2) {
                ((xn) vtVar).a(this.f25196j);
                this.f25196j = 0;
                this.f25193g = 3;
            } else if (i10 == 3) {
                if (((xn) vtVar).a(this.f25189c.c(), 0, 11, true)) {
                    this.f25189c.e(0);
                    this.f25197k = this.f25189c.t();
                    this.f25198l = this.f25189c.w();
                    this.f25199m = this.f25189c.w();
                    this.f25199m = (((long) (this.f25189c.t() << 24)) | this.f25199m) * 1000;
                    this.f25189c.f(3);
                    this.f25193g = 4;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    return -1;
                }
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
                if (b((xn) vtVar)) {
                    return 0;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(long j10, long j11) {
        if (j10 == 0) {
            this.f25193g = 1;
            this.f25194h = false;
        } else {
            this.f25193g = 3;
        }
        this.f25196j = 0;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(wt wtVar) {
        this.f25192f = wtVar;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final boolean a(vt vtVar) throws IOException {
        xn xnVar = (xn) vtVar;
        xnVar.b(this.f25187a.c(), 0, 3, false);
        this.f25187a.e(0);
        if (this.f25187a.w() != 4607062) {
            return false;
        }
        xnVar.b(this.f25187a.c(), 0, 2, false);
        this.f25187a.e(0);
        if ((this.f25187a.z() & BaseTransientBottomBar.ANIMATION_DURATION) != 0) {
            return false;
        }
        xnVar.b(this.f25187a.c(), 0, 4, false);
        this.f25187a.e(0);
        int iH = this.f25187a.h();
        xnVar.c();
        xnVar.a(false, iH);
        xnVar.b(this.f25187a.c(), 0, 4, false);
        this.f25187a.e(0);
        return this.f25187a.h() == 0;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void release() {
    }
}
