package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class yq implements lr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f26979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j71 f26980d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f26983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f26984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private yv f26985i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f26986j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mp0 f26977a = new mp0(new byte[18]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26981e = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f26987k = -9223372036854775807L;

    public yq(String str) {
        this.f26978b = str;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a() {
        this.f26981e = 0;
        this.f26982f = 0;
        this.f26983g = 0;
        this.f26987k = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f26987k = j10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:39:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0105  */
    /* JADX WARN: Code duplicated, block: B:42:0x010e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0117  */
    /* JADX WARN: Code duplicated, block: B:46:0x0124  */
    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(mp0 mp0Var) {
        int i10;
        byte b10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        byte b11;
        int i14;
        int i15;
        pa.b(this.f26980d);
        while (mp0Var.a() > 0) {
            int i16 = this.f26981e;
            boolean z11 = false;
            if (i16 == 0) {
                while (mp0Var.a() > 0) {
                    int i17 = this.f26983g << 8;
                    this.f26983g = i17;
                    int iT = i17 | mp0Var.t();
                    this.f26983g = iT;
                    if (iT == 2147385345 || iT == -25230976 || iT == 536864768 || iT == -14745368) {
                        byte[] bArrC = this.f26977a.c();
                        int i18 = this.f26983g;
                        bArrC[0] = (byte) ((i18 >> 24) & 255);
                        bArrC[1] = (byte) ((i18 >> 16) & 255);
                        bArrC[2] = (byte) ((i18 >> 8) & 255);
                        bArrC[3] = (byte) (i18 & 255);
                        this.f26982f = 4;
                        this.f26983g = 0;
                        z11 = true;
                        break;
                    }
                }
                if (z11) {
                    this.f26981e = 1;
                }
            } else if (i16 == 1) {
                byte[] bArrC2 = this.f26977a.c();
                int iMin = Math.min(mp0Var.a(), 18 - this.f26982f);
                mp0Var.a(bArrC2, this.f26982f, iMin);
                int i19 = this.f26982f + iMin;
                this.f26982f = i19;
                if (i19 == 18) {
                    byte[] bArrC3 = this.f26977a.c();
                    if (this.f26985i == null) {
                        yv yvVarA = zq.a(bArrC3, this.f26979c, this.f26978b);
                        this.f26985i = yvVarA;
                        this.f26980d.a(yvVarA);
                    }
                    byte b12 = bArrC3[0];
                    if (b12 != -2) {
                        if (b12 == -1) {
                            i15 = ((bArrC3[7] & 3) << 12) | ((bArrC3[6] & 255) << 4) | ((bArrC3[9] & 60) >> 2);
                        } else if (b12 != 31) {
                            i10 = ((bArrC3[5] & 3) << 12) | ((bArrC3[6] & 255) << 4);
                            b10 = bArrC3[7];
                        } else {
                            i15 = ((bArrC3[8] & 60) >> 2) | ((bArrC3[6] & 3) << 12) | ((bArrC3[7] & 255) << 4);
                        }
                        i11 = i15 + 1;
                        z10 = true;
                        if (z10) {
                            i11 = (i11 * 16) / 14;
                        }
                        this.f26986j = i11;
                        if (b12 != -2) {
                            if (b12 != -1) {
                                if (b12 != 31) {
                                    i13 = (bArrC3[4] & 1) << 6;
                                    i14 = bArrC3[5] & 252;
                                } else {
                                    i13 = (bArrC3[5] & 7) << 4;
                                    b11 = bArrC3[6];
                                }
                                i12 = (i14 >> 2) | i13;
                            } else {
                                i13 = (bArrC3[4] & 7) << 4;
                                b11 = bArrC3[7];
                            }
                            i14 = b11 & 60;
                            i12 = (i14 >> 2) | i13;
                        } else {
                            i12 = ((bArrC3[4] & 252) >> 2) | ((bArrC3[5] & 1) << 6);
                        }
                        this.f26984h = (int) ((((long) ((i12 + 1) * 32)) * 1000000) / ((long) this.f26985i.f27129z));
                        this.f26977a.e(0);
                        this.f26980d.a(18, this.f26977a);
                        this.f26981e = 2;
                    } else {
                        i10 = ((bArrC3[4] & 3) << 12) | ((bArrC3[7] & 255) << 4);
                        b10 = bArrC3[6];
                    }
                    i11 = (i10 | ((b10 & 240) >> 4)) + 1;
                    z10 = false;
                    if (z10) {
                        i11 = (i11 * 16) / 14;
                    }
                    this.f26986j = i11;
                    if (b12 != -2) {
                        if (b12 != -1) {
                            if (b12 != 31) {
                                i13 = (bArrC3[4] & 1) << 6;
                                i14 = bArrC3[5] & 252;
                            } else {
                                i13 = (bArrC3[5] & 7) << 4;
                                b11 = bArrC3[6];
                            }
                            i12 = (i14 >> 2) | i13;
                        } else {
                            i13 = (bArrC3[4] & 7) << 4;
                            b11 = bArrC3[7];
                        }
                        i14 = b11 & 60;
                        i12 = (i14 >> 2) | i13;
                    } else {
                        i12 = ((bArrC3[4] & 252) >> 2) | ((bArrC3[5] & 1) << 6);
                    }
                    this.f26984h = (int) ((((long) ((i12 + 1) * 32)) * 1000000) / ((long) this.f26985i.f27129z));
                    this.f26977a.e(0);
                    this.f26980d.a(18, this.f26977a);
                    this.f26981e = 2;
                }
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(mp0Var.a(), this.f26986j - this.f26982f);
                this.f26980d.a(iMin2, mp0Var);
                int i20 = this.f26982f + iMin2;
                this.f26982f = i20;
                int i21 = this.f26986j;
                if (i20 == i21) {
                    long j10 = this.f26987k;
                    if (j10 != -9223372036854775807L) {
                        this.f26980d.a(j10, 1, i21, 0, null);
                        this.f26987k += this.f26984h;
                    }
                    this.f26981e = 0;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(wt wtVar, r81.d dVar) {
        dVar.a();
        this.f26979c = dVar.b();
        this.f26980d = wtVar.a(dVar.c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void b() {
    }
}
