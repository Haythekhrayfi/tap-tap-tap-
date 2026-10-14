package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class j7 implements lr {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte[] f21956v = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lp0 f21958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mp0 f21959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f21961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j71 f21962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j71 f21963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f21967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f21968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f21969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f21970n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f21971o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f21972p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f21973q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f21974r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f21975s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private j71 f21976t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f21977u;

    public j7() {
        this(null, true);
    }

    public j7(String str, boolean z10) {
        this.f21958b = new lp0(new byte[7]);
        this.f21959c = new mp0(Arrays.copyOf(f21956v, 10));
        d();
        this.f21969m = -1;
        this.f21970n = -1;
        this.f21973q = -9223372036854775807L;
        this.f21975s = -9223372036854775807L;
        this.f21957a = z10;
        this.f21960d = str;
    }

    private static boolean a(byte b10) {
        return (((b10 & 255) | 65280) & 65526) == 65520;
    }

    private void d() {
        this.f21964h = 0;
        this.f21965i = 0;
        this.f21966j = 256;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a() {
        this.f21975s = -9223372036854775807L;
        this.f21968l = false;
        d();
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f21975s = j10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x021c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0267  */
    /* JADX WARN: Code duplicated, block: B:89:0x0269  */
    /* JADX WARN: Code duplicated, block: B:91:0x026f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0271  */
    /* JADX WARN: Code duplicated, block: B:94:0x0280  */
    /* JADX WARN: Code duplicated, block: B:95:0x0282  */
    /* JADX WARN: Code duplicated, block: B:98:0x028e  */
    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(mp0 mp0Var) throws qp0 {
        char c10;
        int i10;
        boolean z10;
        byte[] bArr;
        boolean z11;
        int iB;
        byte[] bArrC;
        int iE;
        int i11;
        byte b10;
        int i12;
        int i13;
        int i14;
        boolean z12;
        boolean z13;
        Objects.requireNonNull(this.f21962f);
        int i15 = da1.f19803a;
        while (mp0Var.a() > 0) {
            int i16 = this.f21964h;
            int i17 = 13;
            int i18 = 7;
            int i19 = -1;
            if (i16 == 0) {
                byte[] bArrC2 = mp0Var.c();
                int iD = mp0Var.d();
                int iE2 = mp0Var.e();
                while (true) {
                    if (iD < iE2) {
                        int i20 = iD + 1;
                        int i21 = bArrC2[iD] & 255;
                        if (this.f21966j == 512 && a((byte) i21)) {
                            if (!this.f21968l) {
                                int i22 = i20 - 2;
                                mp0Var.e(i22 + 1);
                                byte[] bArr2 = this.f21958b.f22755a;
                                if (mp0Var.a() < 1) {
                                    z10 = false;
                                } else {
                                    mp0Var.a(bArr2, 0, 1);
                                    z10 = true;
                                }
                                if (z10) {
                                    this.f21958b.c(4);
                                    int iB2 = this.f21958b.b(1);
                                    int i23 = this.f21969m;
                                    if (i23 != i19 && iB2 != i23) {
                                        i19 = i19;
                                    } else if (this.f21970n != i19) {
                                        byte[] bArr3 = this.f21958b.f22755a;
                                        if (mp0Var.a() < 1) {
                                            z13 = false;
                                        } else {
                                            mp0Var.a(bArr3, 0, 1);
                                            z13 = true;
                                        }
                                        if (z13) {
                                            this.f21958b.c(2);
                                            if (this.f21958b.b(4) != this.f21970n) {
                                                i19 = -1;
                                            } else {
                                                mp0Var.e(i22 + 2);
                                                bArr = this.f21958b.f22755a;
                                                if (mp0Var.a() < 4) {
                                                    z11 = false;
                                                } else {
                                                    mp0Var.a(bArr, 0, 4);
                                                    z11 = true;
                                                }
                                                if (z11) {
                                                    this.f21958b.c(14);
                                                    iB = this.f21958b.b(i17);
                                                    if (iB < i18) {
                                                        i19 = -1;
                                                    } else {
                                                        bArrC = mp0Var.c();
                                                        iE = mp0Var.e();
                                                        i11 = i22 + iB;
                                                        if (i11 >= iE) {
                                                            i19 = -1;
                                                        } else {
                                                            b10 = bArrC[i11];
                                                            i19 = -1;
                                                            if (b10 == -1 ? b10 == 73 && ((i12 = i11 + 1) == iE || (bArrC[i12] == 68 && ((i13 = i11 + 2) == iE || bArrC[i13] == 51))) : (i14 = i11 + 1) == iE || (a(bArrC[i14]) && ((bArrC[i14] & 8) >> 3) == iB2)) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i19 = -1;
                                                }
                                            }
                                        } else {
                                            i19 = -1;
                                        }
                                        z12 = true;
                                    } else {
                                        bArr = this.f21958b.f22755a;
                                        if (mp0Var.a() < 4) {
                                            z11 = false;
                                        } else {
                                            mp0Var.a(bArr, 0, 4);
                                            z11 = true;
                                        }
                                        if (z11) {
                                            i19 = -1;
                                        } else {
                                            this.f21958b.c(14);
                                            iB = this.f21958b.b(i17);
                                            if (iB < i18) {
                                                i19 = -1;
                                            } else {
                                                bArrC = mp0Var.c();
                                                iE = mp0Var.e();
                                                i11 = i22 + iB;
                                                if (i11 >= iE) {
                                                    i19 = -1;
                                                } else {
                                                    b10 = bArrC[i11];
                                                    i19 = -1;
                                                    if (b10 == -1) {
                                                    }
                                                }
                                            }
                                        }
                                        z12 = true;
                                    }
                                    z12 = false;
                                } else {
                                    i19 = i19;
                                    z12 = false;
                                }
                                if (z12) {
                                }
                                mp0Var.e(i20);
                            }
                            this.f21971o = (i21 & 8) >> 3;
                            this.f21967k = (i21 & 1) == 0;
                            if (this.f21968l) {
                                this.f21964h = 3;
                            } else {
                                this.f21964h = 1;
                            }
                            this.f21965i = 0;
                            mp0Var.e(i20);
                        } else {
                            i19 = i19;
                        }
                        int i24 = this.f21966j;
                        int i25 = i24 | i21;
                        if (i25 == 329) {
                            c10 = 3;
                            i10 = 768;
                        } else if (i25 == 511) {
                            c10 = 3;
                            i10 = 512;
                        } else if (i25 == 836) {
                            c10 = 3;
                            i10 = 1024;
                        } else if (i25 == 1075) {
                            this.f21964h = 2;
                            this.f21965i = 3;
                            this.f21974r = 0;
                            this.f21959c.e(0);
                            mp0Var.e(i20);
                        } else if (i24 != 256) {
                            this.f21966j = 256;
                            iD = i20 - 1;
                            i17 = 13;
                            i18 = 7;
                        } else {
                            c10 = 3;
                            iD = i20;
                            i17 = 13;
                            i18 = 7;
                        }
                        this.f21966j = i10;
                        iD = i20;
                        i17 = 13;
                        i18 = 7;
                    } else {
                        mp0Var.e(iD);
                    }
                }
            } else if (i16 != 1) {
                if (i16 == 2) {
                    byte[] bArrC3 = this.f21959c.c();
                    int iMin = Math.min(mp0Var.a(), 10 - this.f21965i);
                    mp0Var.a(bArrC3, this.f21965i, iMin);
                    int i26 = this.f21965i + iMin;
                    this.f21965i = i26;
                    if (i26 == 10) {
                        this.f21963g.a(10, this.f21959c);
                        this.f21959c.e(6);
                        j71 j71Var = this.f21963g;
                        int iS = this.f21959c.s() + 10;
                        this.f21964h = 4;
                        this.f21965i = 10;
                        this.f21976t = j71Var;
                        this.f21977u = 0L;
                        this.f21974r = iS;
                    }
                } else if (i16 == 3) {
                    int i27 = this.f21967k ? 7 : 5;
                    byte[] bArr4 = this.f21958b.f22755a;
                    int iMin2 = Math.min(mp0Var.a(), i27 - this.f21965i);
                    mp0Var.a(bArr4, this.f21965i, iMin2);
                    int i28 = this.f21965i + iMin2;
                    this.f21965i = i28;
                    if (i28 == i27) {
                        this.f21958b.c(0);
                        if (this.f21972p) {
                            this.f21958b.d(10);
                        } else {
                            int iB3 = this.f21958b.b(2) + 1;
                            if (iB3 != 2) {
                                p90.d("AdtsReader", "Detected audio object type: " + iB3 + ", but assuming AAC LC.");
                                iB3 = 2;
                            }
                            this.f21958b.d(5);
                            int iB4 = this.f21958b.b(3);
                            int i29 = this.f21970n;
                            byte[] bArr5 = {(byte) (((iB3 << 3) & 248) | ((i29 >> 1) & 7)), (byte) (((i29 << 7) & 128) | ((iB4 << 3) & 120))};
                            d.a aVarA = d.a(new lp0(2, bArr5), false);
                            yv yvVarA = new yv.a().c(this.f21961e).f("audio/mp4a-latm").a(aVarA.f19687c).c(aVarA.f19686b).n(aVarA.f19685a).a(Collections.singletonList(bArr5)).e(this.f21960d).a();
                            this.f21973q = 1024000000 / ((long) yvVarA.f27129z);
                            this.f21962f.a(yvVarA);
                            this.f21972p = true;
                        }
                        this.f21958b.d(4);
                        int iB5 = (this.f21958b.b(13) - 2) - 5;
                        if (this.f21967k) {
                            iB5 -= 2;
                        }
                        j71 j71Var2 = this.f21962f;
                        long j10 = this.f21973q;
                        this.f21964h = 4;
                        this.f21965i = 0;
                        this.f21976t = j71Var2;
                        this.f21977u = j10;
                        this.f21974r = iB5;
                    }
                } else {
                    if (i16 != 4) {
                        throw new IllegalStateException();
                    }
                    int iMin3 = Math.min(mp0Var.a(), this.f21974r - this.f21965i);
                    this.f21976t.a(iMin3, mp0Var);
                    int i30 = this.f21965i + iMin3;
                    this.f21965i = i30;
                    int i31 = this.f21974r;
                    if (i30 == i31) {
                        long j11 = this.f21975s;
                        if (j11 != -9223372036854775807L) {
                            this.f21976t.a(j11, 1, i31, 0, null);
                            this.f21975s += this.f21977u;
                        }
                        d();
                    }
                }
            } else if (mp0Var.a() != 0) {
                this.f21958b.f22755a[0] = mp0Var.c()[mp0Var.d()];
                this.f21958b.c(2);
                int iB6 = this.f21958b.b(4);
                int i32 = this.f21970n;
                if (i32 == -1 || iB6 == i32) {
                    if (!this.f21968l) {
                        this.f21968l = true;
                        this.f21969m = this.f21971o;
                        this.f21970n = iB6;
                    }
                    this.f21964h = 3;
                    this.f21965i = 0;
                } else {
                    this.f21968l = false;
                    d();
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(wt wtVar, r81.d dVar) {
        dVar.a();
        this.f21961e = dVar.b();
        j71 j71VarA = wtVar.a(dVar.c(), 1);
        this.f21962f = j71VarA;
        this.f21976t = j71VarA;
        if (!this.f21957a) {
            this.f21963g = new br();
            return;
        }
        dVar.a();
        j71 j71VarA2 = wtVar.a(dVar.c(), 5);
        this.f21963g = j71VarA2;
        j71VarA2.a(new yv.a().c(dVar.b()).f("application/id3").a());
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void b() {
    }

    public final long c() {
        return this.f21973q;
    }
}
