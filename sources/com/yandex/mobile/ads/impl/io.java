package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class io implements wn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vn0 f21752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f21753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f21754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s41 f21755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f21757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f21758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f21759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f21760i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f21761j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f21762k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f21763l;

    public final class a implements p01 {
        private a() {
        }

        public /* synthetic */ a(io ioVar, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.p01
        public final p01.a b(long j10) {
            long jB = io.this.f21755d.b(j10);
            long j11 = ((((io.this.f21754c - io.this.f21753b) * jB) / io.this.f21757f) + io.this.f21753b) - 30000;
            long j12 = io.this.f21753b;
            long j13 = io.this.f21754c - 1;
            int i10 = da1.f19803a;
            r01 r01Var = new r01(j10, Math.max(j12, Math.min(j11, j13)));
            return new p01.a(r01Var, r01Var);
        }

        @Override // com.yandex.mobile.ads.impl.p01
        public final boolean b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.p01
        public final long c() {
            return io.this.f21755d.a(io.this.f21757f);
        }
    }

    public io(s41 s41Var, long j10, long j11, long j12, long j13, boolean z10) {
        pa.a(j10 >= 0 && j11 > j10);
        this.f21755d = s41Var;
        this.f21753b = j10;
        this.f21754c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f21757f = j13;
            this.f21756e = 4;
        } else {
            this.f21756e = 0;
        }
        this.f21752a = new vn0();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    @Override // com.yandex.mobile.ads.impl.wn0
    public final long a(xn xnVar) throws IOException {
        long j10;
        boolean z10;
        long jMax;
        long j11;
        int i10 = this.f21756e;
        if (i10 == 0) {
            long position = xnVar.getPosition();
            this.f21758g = position;
            this.f21756e = 1;
            long j12 = this.f21754c - 65307;
            if (j12 > position) {
                return j12;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                if (this.f21760i == this.f21761j) {
                    jMax = -1;
                    j11 = -1;
                } else {
                    long position2 = xnVar.getPosition();
                    if (this.f21752a.a(xnVar, this.f21761j)) {
                        this.f21752a.a(xnVar, false);
                        xnVar.c();
                        long j13 = this.f21759h;
                        vn0 vn0Var = this.f21752a;
                        long j14 = vn0Var.f26040b;
                        long j15 = j13 - j14;
                        int i11 = vn0Var.f26042d + vn0Var.f26043e;
                        if (0 > j15 || j15 >= 72000) {
                            if (j15 < 0) {
                                this.f21761j = position2;
                                this.f21763l = j14;
                            } else {
                                this.f21760i = xnVar.getPosition() + ((long) i11);
                                this.f21762k = this.f21752a.f26040b;
                            }
                            long j16 = this.f21761j;
                            long j17 = this.f21760i;
                            if (j16 - j17 < 100000) {
                                this.f21761j = j17;
                                jMax = j17;
                            } else {
                                long position3 = xnVar.getPosition() - (((long) i11) * (j15 <= 0 ? 2L : 1L));
                                long j18 = this.f21761j;
                                long j19 = this.f21760i;
                                int i12 = da1.f19803a;
                                jMax = Math.max(j19, Math.min(position3 + (((j18 - j19) * j15) / (this.f21763l - this.f21762k)), j18 - 1));
                            }
                        } else {
                            jMax = -1;
                        }
                        j11 = -1;
                    } else {
                        jMax = this.f21760i;
                        if (jMax == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j11 = -1;
                    }
                }
                if (jMax != j11) {
                    return jMax;
                }
                this.f21756e = 3;
            } else {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j11 = -1;
            }
            while (true) {
                this.f21752a.a(xnVar, j11);
                this.f21752a.a(xnVar, false);
                vn0 vn0Var2 = this.f21752a;
                if (vn0Var2.f26040b > this.f21759h) {
                    xnVar.c();
                    this.f21756e = 4;
                    return -(this.f21762k + 2);
                }
                xnVar.a(vn0Var2.f26042d + vn0Var2.f26043e);
                this.f21760i = xnVar.getPosition();
                this.f21762k = this.f21752a.f26040b;
                j11 = -1;
            }
        }
        vn0 vn0Var3 = this.f21752a;
        vn0Var3.f26039a = 0;
        vn0Var3.f26040b = 0L;
        vn0Var3.f26041c = 0;
        vn0Var3.f26042d = 0;
        vn0Var3.f26043e = 0;
        if (!vn0Var3.a(xnVar, -1L)) {
            throw new EOFException();
        }
        this.f21752a.a(xnVar, false);
        vn0 vn0Var4 = this.f21752a;
        xnVar.a(vn0Var4.f26042d + vn0Var4.f26043e);
        do {
            j10 = this.f21752a.f26040b;
            vn0 vn0Var5 = this.f21752a;
            if ((vn0Var5.f26039a & 4) == 4 || !vn0Var5.a(xnVar, -1L) || xnVar.getPosition() >= this.f21754c || !this.f21752a.a(xnVar, true)) {
                break;
            }
            vn0 vn0Var6 = this.f21752a;
            try {
                xnVar.a(vn0Var6.f26042d + vn0Var6.f26043e);
                z10 = true;
            } catch (EOFException unused) {
                z10 = false;
            }
        } while (z10);
        this.f21757f = j10;
        this.f21756e = 4;
        return this.f21758g;
    }

    @Override // com.yandex.mobile.ads.impl.wn0
    public final p01 a() {
        if (this.f21757f != 0) {
            return new a(this, 0);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.wn0
    public final void a(long j10) {
        long j11 = this.f21757f - 1;
        int i10 = da1.f19803a;
        this.f21759h = Math.max(0L, Math.min(j10, j11));
        this.f21756e = 2;
        this.f21760i = this.f21753b;
        this.f21761j = this.f21754c;
        this.f21762k = 0L;
        this.f21763l = this.f21757f;
    }
}
