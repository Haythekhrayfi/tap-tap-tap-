package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class i7 implements ut {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mp0 f21608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lp0 f21609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private wt f21610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f21611g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21614j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f21615k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f21616l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21605a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j7 f21606b = new j7();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mp0 f21607c = new mp0(2048);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21613i = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f21612h = -1;

    static {
        yn1 yn1Var = yn1.f26956p;
    }

    public i7() {
        mp0 mp0Var = new mp0(10);
        this.f21608d = mp0Var;
        this.f21609e = new lp0(mp0Var.c());
    }

    private int a(xn xnVar) throws IOException {
        int i10 = 0;
        while (true) {
            xnVar.b(this.f21608d.c(), 0, 10, false);
            this.f21608d.e(0);
            if (this.f21608d.w() != 4801587) {
                break;
            }
            this.f21608d.f(3);
            int iS = this.f21608d.s();
            i10 += iS + 10;
            xnVar.a(false, iS);
        }
        xnVar.c();
        xnVar.a(false, i10);
        if (this.f21612h == -1) {
            this.f21612h = i10;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ut[] a() {
        return new ut[]{new i7()};
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final int a(vt vtVar, cs0 cs0Var) throws IOException {
        int iB;
        pa.b(this.f21610f);
        xn xnVar = (xn) vtVar;
        long jA = xnVar.a();
        int i10 = this.f21605a;
        if ((((i10 & 2) == 0 && ((i10 & 1) == 0 || jA == -1)) ? false : true) && !this.f21614j) {
            this.f21613i = -1;
            xnVar.c();
            if (xnVar.getPosition() == 0) {
                a(xnVar);
            }
            long j10 = 0;
            int i11 = 0;
            do {
                try {
                    if (!xnVar.b(this.f21608d.c(), 0, 2, true)) {
                        break;
                    }
                    this.f21608d.e(0);
                    if (!((this.f21608d.z() & 65526) == 65520)) {
                        i11 = 0;
                        break;
                    }
                    if (!xnVar.b(this.f21608d.c(), 0, 4, true)) {
                        break;
                    }
                    this.f21609e.c(14);
                    iB = this.f21609e.b(13);
                    if (iB <= 6) {
                        this.f21614j = true;
                        throw qp0.a("Malformed ADTS stream", (Exception) null);
                    }
                    j10 += (long) iB;
                    i11++;
                    if (i11 == 1000) {
                        break;
                    }
                } catch (EOFException unused) {
                }
            } while (xnVar.a(true, iB - 6));
            xnVar.c();
            if (i11 > 0) {
                this.f21613i = (int) (j10 / ((long) i11));
            } else {
                this.f21613i = -1;
            }
            this.f21614j = true;
        }
        int i12 = xnVar.read(this.f21607c.c(), 0, 2048);
        boolean z10 = i12 == -1;
        if (!this.f21616l) {
            boolean z11 = (this.f21605a & 1) != 0 && this.f21613i > 0;
            if (!z11 || this.f21606b.c() != -9223372036854775807L || z10) {
                if (!z11 || this.f21606b.c() == -9223372036854775807L) {
                    this.f21610f.a(new p01.b(-9223372036854775807L, 0L));
                } else {
                    this.f21610f.a(new rk((int) (((((long) this.f21613i) * 8) * 1000000) / this.f21606b.c()), this.f21613i, jA, this.f21612h, (this.f21605a & 2) != 0));
                }
                this.f21616l = true;
            }
        }
        if (z10) {
            return -1;
        }
        this.f21607c.e(0);
        this.f21607c.d(i12);
        if (!this.f21615k) {
            this.f21606b.a(4, this.f21611g);
            this.f21615k = true;
        }
        this.f21606b.a(this.f21607c);
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(long j10, long j11) {
        this.f21615k = false;
        this.f21606b.a();
        this.f21611g = j11;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(wt wtVar) {
        this.f21610f = wtVar;
        this.f21606b.a(wtVar, new r81.d(Integer.MIN_VALUE, 0, 1));
        wtVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002e  */
    @Override // com.yandex.mobile.ads.impl.ut
    public final boolean a(vt vtVar) throws IOException {
        xn xnVar = (xn) vtVar;
        int iA = a(xnVar);
        int i10 = iA;
        int i11 = 0;
        int i12 = 0;
        do {
            xnVar.b(this.f21608d.c(), 0, 2, false);
            this.f21608d.e(0);
            if ((this.f21608d.z() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                xnVar.b(this.f21608d.c(), 0, 4, false);
                this.f21609e.c(14);
                int iB = this.f21609e.b(13);
                if (iB <= 6) {
                    i10++;
                    xnVar.c();
                    xnVar.a(false, i10);
                    i11 = 0;
                    i12 = 0;
                } else {
                    xnVar.a(false, iB - 6);
                    i12 += iB;
                }
            } else {
                i10++;
                xnVar.c();
                xnVar.a(false, i10);
                i11 = 0;
                i12 = 0;
            }
        } while (i10 - iA < 8192);
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void release() {
    }
}
