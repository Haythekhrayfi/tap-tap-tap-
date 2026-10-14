package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes3.dex */
abstract class s41 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j71 f24958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private wt f24959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private wn0 f24960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f24961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f24962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f24963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f24964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f24965i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f24967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f24968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f24969m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final un0 f24957a = new un0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f24966j = new a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public yv f24970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public nv.a f24971b;
    }

    public static final class b implements wn0 {
        private b() {
        }

        public /* synthetic */ b(int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.wn0
        public final long a(xn xnVar) {
            return -1L;
        }

        @Override // com.yandex.mobile.ads.impl.wn0
        public final p01 a() {
            return new p01.b(-9223372036854775807L, 0L);
        }

        @Override // com.yandex.mobile.ads.impl.wn0
        public final void a(long j10) {
        }
    }

    public final int a(xn xnVar, cs0 cs0Var) throws IOException {
        boolean z10;
        pa.b(this.f24958b);
        int i10 = da1.f19803a;
        int i11 = this.f24964h;
        int i12 = 0;
        if (i11 == 0) {
            while (true) {
                if (!this.f24957a.a(xnVar)) {
                    this.f24964h = 3;
                    z10 = false;
                    break;
                }
                this.f24967k = xnVar.getPosition() - this.f24962f;
                if (!a(this.f24957a.b(), this.f24962f, this.f24966j)) {
                    z10 = true;
                    break;
                }
                this.f24962f = xnVar.getPosition();
            }
            if (!z10) {
                return -1;
            }
            yv yvVar = this.f24966j.f24970a;
            this.f24965i = yvVar.f27129z;
            if (!this.f24969m) {
                this.f24958b.a(yvVar);
                this.f24969m = true;
            }
            nv.a aVar = this.f24966j.f24971b;
            if (aVar != null) {
                this.f24960d = aVar;
            } else if (xnVar.a() == -1) {
                this.f24960d = new b(i12);
            } else {
                vn0 vn0VarA = this.f24957a.a();
                this.f24960d = new io(this, this.f24962f, xnVar.a(), vn0VarA.f26042d + vn0VarA.f26043e, vn0VarA.f26040b, (vn0VarA.f26039a & 4) != 0);
            }
            this.f24964h = 2;
            this.f24957a.d();
            return 0;
        }
        if (i11 == 1) {
            xnVar.a((int) this.f24962f);
            this.f24964h = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                return -1;
            }
            throw new IllegalStateException();
        }
        long jA = this.f24960d.a(xnVar);
        if (jA >= 0) {
            cs0Var.f19623a = jA;
            return 1;
        }
        if (jA < -1) {
            c(-(jA + 2));
        }
        if (!this.f24968l) {
            this.f24959c.a((p01) pa.b(this.f24960d.a()));
            this.f24968l = true;
        }
        if (this.f24967k <= 0 && !this.f24957a.a(xnVar)) {
            this.f24964h = 3;
            return -1;
        }
        this.f24967k = 0L;
        mp0 mp0VarB = this.f24957a.b();
        long jA2 = a(mp0VarB);
        if (jA2 >= 0) {
            long j10 = this.f24963g;
            if (j10 + jA2 >= this.f24961e) {
                long jA3 = a(j10);
                this.f24958b.a(mp0VarB.e(), mp0VarB);
                this.f24958b.a(jA3, 1, mp0VarB.e(), 0, null);
                this.f24961e = -1L;
            }
        }
        this.f24963g += jA2;
        return 0;
    }

    public final long a(long j10) {
        return (j10 * 1000000) / ((long) this.f24965i);
    }

    public abstract long a(mp0 mp0Var);

    public final void a(long j10, long j11) {
        this.f24957a.c();
        if (j10 == 0) {
            a(!this.f24968l);
            return;
        }
        if (this.f24964h != 0) {
            long jB = b(j11);
            this.f24961e = jB;
            wn0 wn0Var = this.f24960d;
            int i10 = da1.f19803a;
            wn0Var.a(jB);
            this.f24964h = 2;
        }
    }

    public final void a(wt wtVar, j71 j71Var) {
        this.f24959c = wtVar;
        this.f24958b = j71Var;
        a(true);
    }

    public void a(boolean z10) {
        int i10;
        if (z10) {
            this.f24966j = new a();
            this.f24962f = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f24964h = i10;
        this.f24961e = -1L;
        this.f24963g = 0L;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean a(mp0 mp0Var, long j10, a aVar) throws IOException;

    public final long b(long j10) {
        return (((long) this.f24965i) * j10) / 1000000;
    }

    public void c(long j10) {
        this.f24963g = j10;
    }
}
