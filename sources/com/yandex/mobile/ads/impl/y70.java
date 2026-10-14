package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class y70 implements lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mp0 f26712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lp0 f26713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j71 f26714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f26715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private yv f26716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f26717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f26718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f26719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f26720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f26721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f26722l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f26723m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f26724n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f26725o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f26726p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f26727q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f26728r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f26729s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f26730t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f26731u;

    public y70(String str) {
        this.f26711a = str;
        mp0 mp0Var = new mp0(1024);
        this.f26712b = mp0Var;
        this.f26713c = new lp0(mp0Var.c());
        this.f26721k = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a() {
        this.f26717g = 0;
        this.f26721k = -9223372036854775807L;
        this.f26722l = false;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f26721k = j10;
        }
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(mp0 mp0Var) throws qp0 {
        int i10;
        boolean zF;
        pa.b(this.f26714d);
        while (mp0Var.a() > 0) {
            int i11 = this.f26717g;
            if (i11 != 0) {
                if (i11 == 1) {
                    int iT = mp0Var.t();
                    if ((iT & 224) == 224) {
                        this.f26720j = iT;
                        this.f26717g = 2;
                    } else if (iT != 86) {
                        this.f26717g = 0;
                    }
                } else if (i11 == 2) {
                    int iT2 = ((this.f26720j & (-225)) << 8) | mp0Var.t();
                    this.f26719i = iT2;
                    if (iT2 > this.f26712b.c().length) {
                        this.f26712b.c(this.f26719i);
                        lp0 lp0Var = this.f26713c;
                        byte[] bArrC = this.f26712b.c();
                        Objects.requireNonNull(lp0Var);
                        lp0Var.a(bArrC.length, bArrC);
                    }
                    this.f26718h = 0;
                    this.f26717g = 3;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(mp0Var.a(), this.f26719i - this.f26718h);
                    mp0Var.a(this.f26713c.f22755a, this.f26718h, iMin);
                    int i12 = this.f26718h + iMin;
                    this.f26718h = i12;
                    if (i12 == this.f26719i) {
                        this.f26713c.c(0);
                        lp0 lp0Var2 = this.f26713c;
                        if (lp0Var2.f()) {
                            if (this.f26722l) {
                            }
                            this.f26717g = 0;
                        } else {
                            this.f26722l = true;
                            int iB = lp0Var2.b(1);
                            int iB2 = iB == 1 ? lp0Var2.b(1) : 0;
                            this.f26723m = iB2;
                            if (iB2 != 0) {
                                throw qp0.a((String) null, (Exception) null);
                            }
                            if (iB == 1) {
                                lp0Var2.b((lp0Var2.b(2) + 1) * 8);
                            }
                            if (!lp0Var2.f()) {
                                throw qp0.a((String) null, (Exception) null);
                            }
                            this.f26724n = lp0Var2.b(6);
                            int iB3 = lp0Var2.b(4);
                            int iB4 = lp0Var2.b(3);
                            if (iB3 != 0 || iB4 != 0) {
                                throw qp0.a((String) null, (Exception) null);
                            }
                            if (iB == 0) {
                                int iE = lp0Var2.e();
                                int iB5 = lp0Var2.b();
                                d.a aVarA = d.a(lp0Var2, true);
                                this.f26731u = aVarA.f19687c;
                                this.f26728r = aVarA.f19685a;
                                this.f26730t = aVarA.f19686b;
                                int iB6 = iB5 - lp0Var2.b();
                                lp0Var2.c(iE);
                                byte[] bArr = new byte[(iB6 + 7) / 8];
                                lp0Var2.a(bArr, iB6);
                                yv yvVarA = new yv.a().c(this.f26715e).f("audio/mp4a-latm").a(this.f26731u).c(this.f26730t).n(this.f26728r).a(Collections.singletonList(bArr)).e(this.f26711a).a();
                                if (!yvVarA.equals(this.f26716f)) {
                                    this.f26716f = yvVarA;
                                    this.f26729s = 1024000000 / ((long) yvVarA.f27129z);
                                    this.f26714d.a(yvVarA);
                                }
                            } else {
                                int iB7 = lp0Var2.b((lp0Var2.b(2) + 1) * 8);
                                int iB8 = lp0Var2.b();
                                d.a aVarA2 = d.a(lp0Var2, true);
                                this.f26731u = aVarA2.f19687c;
                                this.f26728r = aVarA2.f19685a;
                                this.f26730t = aVarA2.f19686b;
                                lp0Var2.d(iB7 - (iB8 - lp0Var2.b()));
                            }
                            int iB9 = lp0Var2.b(3);
                            this.f26725o = iB9;
                            if (iB9 == 0) {
                                lp0Var2.d(8);
                            } else if (iB9 == 1) {
                                lp0Var2.d(9);
                            } else if (iB9 == 3 || iB9 == 4 || iB9 == 5) {
                                lp0Var2.d(6);
                            } else {
                                if (iB9 != 6 && iB9 != 7) {
                                    throw new IllegalStateException();
                                }
                                lp0Var2.d(1);
                            }
                            boolean zF2 = lp0Var2.f();
                            this.f26726p = zF2;
                            this.f26727q = 0L;
                            if (zF2) {
                                if (iB == 1) {
                                    this.f26727q = lp0Var2.b((lp0Var2.b(2) + 1) * 8);
                                } else {
                                    do {
                                        zF = lp0Var2.f();
                                        this.f26727q = (this.f26727q << 8) + ((long) lp0Var2.b(8));
                                    } while (zF);
                                }
                            }
                            if (lp0Var2.f()) {
                                lp0Var2.d(8);
                            }
                        }
                        if (this.f26723m != 0) {
                            throw qp0.a((String) null, (Exception) null);
                        }
                        if (this.f26724n != 0) {
                            throw qp0.a((String) null, (Exception) null);
                        }
                        if (this.f26725o != 0) {
                            throw qp0.a((String) null, (Exception) null);
                        }
                        int i13 = 0;
                        while (true) {
                            int iB10 = lp0Var2.b(8);
                            i10 = i13 + iB10;
                            if (iB10 != 255) {
                                break;
                            } else {
                                i13 = i10;
                            }
                        }
                        int iE2 = lp0Var2.e();
                        if ((iE2 & 7) == 0) {
                            this.f26712b.e(iE2 >> 3);
                        } else {
                            lp0Var2.a(this.f26712b.c(), i10 * 8);
                            this.f26712b.e(0);
                        }
                        this.f26714d.a(i10, this.f26712b);
                        long j10 = this.f26721k;
                        if (j10 != -9223372036854775807L) {
                            this.f26714d.a(j10, 1, i10, 0, null);
                            this.f26721k += this.f26729s;
                        }
                        if (this.f26726p) {
                            lp0Var2.d((int) this.f26727q);
                        }
                        this.f26717g = 0;
                    } else {
                        continue;
                    }
                }
            } else if (mp0Var.t() == 86) {
                this.f26717g = 1;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(wt wtVar, r81.d dVar) {
        dVar.a();
        this.f26714d = wtVar.a(dVar.c(), 1);
        this.f26715e = dVar.b();
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void b() {
    }
}
