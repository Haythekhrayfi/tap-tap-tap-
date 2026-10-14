package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class v8 implements ut {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f25882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f25883q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final byte[] f25884r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte[] f25885s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f25886t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f25890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f25893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f25894h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25896j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f25897k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private wt f25898l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private j71 f25899m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private p01 f25900n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f25901o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25888b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f25887a = new byte[1];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25895i = -1;

    static {
        yn1 yn1Var = yn1.F;
        f25882p = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f25883q = iArr;
        f25884r = da1.b("#!AMR\n");
        f25885s = da1.b("#!AMR-WB\n");
        f25886t = iArr[8];
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003c  */
    private int a(xn xnVar) throws IOException {
        xnVar.c();
        boolean z10 = false;
        xnVar.b(this.f25887a, 0, 1, false);
        byte b10 = this.f25887a[0];
        if ((b10 & 131) > 0) {
            throw qp0.a("Invalid padding bits for frame header " + ((int) b10), (Exception) null);
        }
        int i10 = (b10 >> 3) & 15;
        if (i10 >= 0 && i10 <= 15) {
            boolean z11 = this.f25889c;
            if (z11 && (i10 < 10 || i10 > 13)) {
                z10 = true;
            } else {
                if (!z11 && (i10 < 12 || i10 > 14)) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            return this.f25889c ? f25883q[i10] : f25882p[i10];
        }
        StringBuilder sbA = v60.a("Illegal AMR ");
        sbA.append(this.f25889c ? "WB" : "NB");
        sbA.append(" frame type ");
        sbA.append(i10);
        throw qp0.a(sbA.toString(), (Exception) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ut[] a() {
        return new ut[]{new v8()};
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    @Override // com.yandex.mobile.ads.impl.ut
    public final int a(vt vtVar, cs0 cs0Var) throws IOException {
        int i10;
        p01 bVar;
        int i11;
        int iB;
        int i12;
        boolean z10;
        int length;
        pa.b(this.f25899m);
        int i13 = da1.f19803a;
        xn xnVar = (xn) vtVar;
        if (xnVar.getPosition() == 0) {
            byte[] bArr = f25884r;
            xnVar.c();
            byte[] bArr2 = new byte[bArr.length];
            xnVar.b(bArr2, 0, bArr.length, false);
            if (Arrays.equals(bArr2, bArr)) {
                this.f25889c = false;
                length = bArr.length;
            } else {
                byte[] bArr3 = f25885s;
                xnVar.c();
                byte[] bArr4 = new byte[bArr3.length];
                xnVar.b(bArr4, 0, bArr3.length, false);
                if (Arrays.equals(bArr4, bArr3)) {
                    this.f25889c = true;
                    length = bArr3.length;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    throw qp0.a("Could not find AMR header.", (Exception) null);
                }
            }
            xnVar.a(length);
            z10 = true;
            if (!z10) {
                throw qp0.a("Could not find AMR header.", (Exception) null);
            }
        }
        if (!this.f25901o) {
            this.f25901o = true;
            boolean z11 = this.f25889c;
            this.f25899m.a(new yv.a().f(z11 ? "audio/amr-wb" : "audio/3gpp").i(f25886t).c(1).n(z11 ? 16000 : 8000).a());
        }
        if (this.f25892f == 0) {
            try {
                int iA = a((xn) vtVar);
                this.f25891e = iA;
                this.f25892f = iA;
                if (this.f25895i == -1) {
                    this.f25894h = xnVar.getPosition();
                    this.f25895i = this.f25891e;
                }
                if (this.f25895i == this.f25891e) {
                    this.f25896j++;
                }
                iB = this.f25899m.b(vtVar, this.f25892f, true);
                if (iB == -1) {
                    i10 = -1;
                } else {
                    i12 = this.f25892f - iB;
                    this.f25892f = i12;
                    if (i12 <= 0) {
                        this.f25899m.a(this.f25897k + this.f25890d, 1, this.f25891e, 0, null);
                        this.f25890d += 20000;
                    }
                    i10 = 0;
                }
            } catch (EOFException unused) {
            }
        } else {
            iB = this.f25899m.b(vtVar, this.f25892f, true);
            if (iB == -1) {
                i10 = -1;
            } else {
                i12 = this.f25892f - iB;
                this.f25892f = i12;
                if (i12 <= 0) {
                    this.f25899m.a(this.f25897k + this.f25890d, 1, this.f25891e, 0, null);
                    this.f25890d += 20000;
                }
                i10 = 0;
            }
        }
        long jA = xnVar.a();
        if (!this.f25893g) {
            int i14 = this.f25888b;
            if ((i14 & 1) == 0 || jA == -1 || !((i11 = this.f25895i) == -1 || i11 == this.f25891e)) {
                bVar = new p01.b(-9223372036854775807L, 0L);
            } else if (this.f25896j >= 20 || i10 == -1) {
                bVar = new rk((int) (((((long) i11) * 8) * 1000000) / 20000), i11, jA, this.f25894h, (i14 & 2) != 0);
            }
            this.f25900n = bVar;
            this.f25898l.a(bVar);
            this.f25893g = true;
        }
        return i10;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(long j10, long j11) {
        this.f25890d = 0L;
        this.f25891e = 0;
        this.f25892f = 0;
        if (j10 != 0) {
            p01 p01Var = this.f25900n;
            if (p01Var instanceof rk) {
                this.f25897k = ((rk) p01Var).c(j10);
                return;
            }
        }
        this.f25897k = 0L;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(wt wtVar) {
        this.f25898l = wtVar;
        this.f25899m = wtVar.a(0, 1);
        wtVar.a();
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final boolean a(vt vtVar) throws IOException {
        int length;
        xn xnVar = (xn) vtVar;
        byte[] bArr = f25884r;
        xnVar.c();
        byte[] bArr2 = new byte[bArr.length];
        xnVar.b(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f25889c = false;
            length = bArr.length;
        } else {
            byte[] bArr3 = f25885s;
            xnVar.c();
            byte[] bArr4 = new byte[bArr3.length];
            xnVar.b(bArr4, 0, bArr3.length, false);
            if (!Arrays.equals(bArr4, bArr3)) {
                return false;
            }
            this.f25889c = true;
            length = bArr3.length;
        }
        xnVar.a(length);
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void release() {
    }
}
