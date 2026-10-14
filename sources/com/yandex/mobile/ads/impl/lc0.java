package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class lc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v61.b f22677a = new v61.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v61.d f22678b = new v61.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w8 f22679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f22680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f22681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ic0 f22684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ic0 f22685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ic0 f22686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f22687k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Object f22688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f22689m;

    public lc0(w8 w8Var, Handler handler) {
        this.f22679c = w8Var;
        this.f22680d = handler;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
    private kc0 a(v61 v61Var, ic0 ic0Var, long j10) {
        long j11;
        long j12;
        long j13;
        boolean z10;
        long j14;
        kc0 kc0Var = ic0Var.f21683f;
        long jC = (ic0Var.c() + kc0Var.f22379e) - j10;
        if (!kc0Var.f22381g) {
            nc0.b bVar = kc0Var.f22375a;
            v61Var.a(bVar.f22012a, this.f22677a);
            if (!bVar.a()) {
                int iD = this.f22677a.d(bVar.f22016e);
                boolean z11 = this.f22677a.f(bVar.f22016e) && this.f22677a.b(bVar.f22016e, iD) == 3;
                if (iD != this.f22677a.a(bVar.f22016e) && !z11) {
                    return a(v61Var, bVar.f22012a, bVar.f22016e, iD, kc0Var.f22379e, bVar.f22015d);
                }
                Object obj = bVar.f22012a;
                int i10 = bVar.f22016e;
                v61Var.a(obj, this.f22677a);
                long jB = this.f22677a.b(i10);
                return a(v61Var, bVar.f22012a, jB == Long.MIN_VALUE ? this.f22677a.f25849d : this.f22677a.c(i10) + jB, kc0Var.f22379e, bVar.f22015d);
            }
            int i11 = bVar.f22013b;
            int iA = this.f22677a.a(i11);
            if (iA == -1) {
                return null;
            }
            int iC = this.f22677a.c(i11, bVar.f22014c);
            if (iC < iA) {
                return a(v61Var, bVar.f22012a, i11, iC, kc0Var.f22377c, bVar.f22015d);
            }
            long jLongValue = kc0Var.f22377c;
            if (jLongValue == -9223372036854775807L) {
                v61.d dVar = this.f22678b;
                v61.b bVar2 = this.f22677a;
                Pair<Object, Long> pairA = v61Var.a(dVar, bVar2, bVar2.f25848c, -9223372036854775807L, Math.max(0L, jC));
                if (pairA == null) {
                    return null;
                }
                jLongValue = ((Long) pairA.second).longValue();
            }
            Object obj2 = bVar.f22012a;
            int i12 = bVar.f22013b;
            v61Var.a(obj2, this.f22677a);
            long jB2 = this.f22677a.b(i12);
            return a(v61Var, bVar.f22012a, Math.max(jB2 == Long.MIN_VALUE ? this.f22677a.f25849d : this.f22677a.c(i12) + jB2, jLongValue), kc0Var.f22377c, bVar.f22015d);
        }
        int iA2 = v61Var.a(v61Var.a(kc0Var.f22375a.f22012a), this.f22677a, this.f22678b, this.f22682f, this.f22683g);
        if (iA2 == -1) {
            return null;
        }
        int i13 = v61Var.a(iA2, this.f22677a, true).f25848c;
        Object obj3 = this.f22677a.f25847b;
        Objects.requireNonNull(obj3);
        long j15 = kc0Var.f22375a.f22015d;
        long j16 = 0;
        if (v61Var.a(i13, this.f22678b, 0L).f25875o == iA2) {
            Pair<Object, Long> pairA2 = v61Var.a(this.f22678b, this.f22677a, i13, -9223372036854775807L, Math.max(0L, jC));
            if (pairA2 == null) {
                return null;
            }
            obj3 = pairA2.first;
            long jLongValue2 = ((Long) pairA2.second).longValue();
            ic0 ic0VarB = ic0Var.b();
            if (ic0VarB == null || !ic0VarB.f21679b.equals(obj3)) {
                j14 = this.f22681e;
                this.f22681e = 1 + j14;
            } else {
                j14 = ic0VarB.f21683f.f22375a.f22015d;
            }
            j11 = jLongValue2;
            j16 = -9223372036854775807L;
            j15 = j14;
        } else {
            j11 = 0;
        }
        nc0.b bVarA = a(v61Var, obj3, j11, j15, this.f22678b, this.f22677a);
        if (j16 == -9223372036854775807L || kc0Var.f22377c == -9223372036854775807L) {
            j12 = j16;
            j13 = j11;
        } else {
            if (v61Var.a(kc0Var.f22375a.f22012a, this.f22677a).a() > 0) {
                v61.b bVar3 = this.f22677a;
                z10 = bVar3.f(bVar3.c());
            }
            if (bVarA.a() && z10) {
                j12 = kc0Var.f22377c;
                j13 = j11;
            } else if (z10) {
                j13 = kc0Var.f22377c;
                j12 = j16;
            } else {
                j12 = j16;
                j13 = j11;
            }
        }
        v61Var.a(bVarA.f22012a, this.f22677a);
        boolean zA = bVarA.a();
        Object obj4 = bVarA.f22012a;
        return zA ? a(v61Var, obj4, bVarA.f22013b, bVarA.f22014c, j12, bVarA.f22015d) : a(v61Var, obj4, j13, j12, bVarA.f22015d);
    }

    private kc0 a(v61 v61Var, Object obj, int i10, int i11, long j10, long j11) {
        nc0.b bVar = new nc0.b(obj, i10, i11, j11);
        long jA = v61Var.a(obj, this.f22677a).a(i10, i11);
        long jB = i11 == this.f22677a.d(i10) ? this.f22677a.b() : 0L;
        return new kc0(bVar, (jA == -9223372036854775807L || jB < jA) ? jB : Math.max(0L, jA - 1), j10, -9223372036854775807L, jA, this.f22677a.f(i10), false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:67:0x0101  */
    /* JADX WARN: Code duplicated, block: B:75:0x0117  */
    private kc0 a(v61 v61Var, Object obj, long j10, long j11, long j12) {
        int i10;
        boolean z10;
        boolean z11;
        long j13;
        boolean z12;
        boolean z13;
        long j14;
        long jB;
        long j15;
        long jMax;
        v61Var.a(obj, this.f22677a);
        int iA = this.f22677a.a(j10);
        v61.b bVar = this.f22677a;
        if (iA == -1) {
            if (bVar.a() > 0) {
                v61.b bVar2 = this.f22677a;
                if (bVar2.f(bVar2.c())) {
                    i10 = iA;
                    z10 = true;
                }
            }
            i10 = iA;
            z10 = false;
        } else {
            if (bVar.f(iA)) {
                long jB2 = this.f22677a.b(iA);
                v61.b bVar3 = this.f22677a;
                if (jB2 == bVar3.f25849d && bVar3.e(iA)) {
                    i10 = -1;
                    z10 = true;
                }
            }
            i10 = iA;
            z10 = false;
        }
        nc0.b bVar4 = new nc0.b(i10, j12, obj);
        boolean z14 = !bVar4.a() && i10 == -1;
        if (!bVar4.a() && i10 == -1) {
            if (v61Var.a(v61Var.a(obj, this.f22677a).f25848c, this.f22678b, 0L).f25876p == v61Var.a(obj)) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        int iA2 = v61Var.a(obj);
        if (!v61Var.a(v61Var.a(iA2, this.f22677a, false).f25848c, this.f22678b, 0L).f25869i) {
            j13 = 0;
            if ((v61Var.a(iA2, this.f22677a, this.f22678b, this.f22682f, this.f22683g) == -1) && z14) {
                z12 = true;
            }
            if (i10 == -1 && this.f22677a.f(i10)) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i10 != -1) {
                if (z10) {
                    jB = this.f22677a.f25849d;
                } else {
                    j14 = -9223372036854775807L;
                }
                if (j14 != -9223372036854775807L || j14 == Long.MIN_VALUE) {
                    j15 = this.f22677a.f25849d;
                } else {
                    j15 = j14;
                }
                if (j15 != -9223372036854775807L || j10 < j15) {
                    jMax = j10;
                } else {
                    jMax = Math.max(j13, j15 - ((long) ((z12 || !z10) ? 1 : 0)));
                }
                return new kc0(bVar4, jMax, j11, j14, j15, z13, z14, z11, z12);
            }
            jB = this.f22677a.b(i10);
            j14 = jB;
            if (j14 != -9223372036854775807L) {
                j15 = this.f22677a.f25849d;
            } else {
                j15 = this.f22677a.f25849d;
            }
            if (j15 != -9223372036854775807L) {
                jMax = j10;
            } else {
                jMax = j10;
            }
            return new kc0(bVar4, jMax, j11, j14, j15, z13, z14, z11, z12);
        }
        j13 = 0;
        z12 = false;
        if (i10 == -1) {
            z13 = false;
        } else {
            z13 = false;
        }
        if (i10 != -1) {
            if (z10) {
                jB = this.f22677a.f25849d;
            } else {
                j14 = -9223372036854775807L;
            }
            if (j14 != -9223372036854775807L) {
                j15 = this.f22677a.f25849d;
            } else {
                j15 = this.f22677a.f25849d;
            }
            if (j15 != -9223372036854775807L) {
                jMax = j10;
            } else {
                jMax = j10;
            }
            return new kc0(bVar4, jMax, j11, j14, j15, z13, z14, z11, z12);
        }
        jB = this.f22677a.b(i10);
        j14 = jB;
        if (j14 != -9223372036854775807L) {
            j15 = this.f22677a.f25849d;
        } else {
            j15 = this.f22677a.f25849d;
        }
        if (j15 != -9223372036854775807L) {
            jMax = j10;
        } else {
            jMax = j10;
        }
        return new kc0(bVar4, jMax, j11, j14, j15, z13, z14, z11, z12);
    }

    private static nc0.b a(v61 v61Var, Object obj, long j10, long j11, v61.d dVar, v61.b bVar) {
        Object obj2 = obj;
        v61Var.a(obj, bVar);
        v61Var.a(bVar.f25848c, dVar, 0L);
        int iA = v61Var.a(obj);
        while (bVar.f25849d == 0 && bVar.a() > 0 && bVar.f(bVar.c()) && bVar.b(0L) == -1) {
            int i10 = iA + 1;
            if (iA >= dVar.f25876p) {
                break;
            }
            v61Var.a(i10, bVar, true);
            obj2 = bVar.f25847b;
            Objects.requireNonNull(obj2);
            iA = i10;
        }
        v61Var.a(obj2, bVar);
        int iB = bVar.b(j10);
        if (iB == -1) {
            return new nc0.b(bVar.a(j10), j11, obj2);
        }
        return new nc0.b(obj2, iB, bVar.d(iB), j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.yandex.mobile.ads.embedded.guava.collect.p.a aVar, nc0.b bVar) {
        this.f22679c.a(aVar.a(), bVar);
    }

    private boolean a(v61 v61Var) {
        ic0 ic0VarB = this.f22684h;
        if (ic0VarB == null) {
            return true;
        }
        int iA = v61Var.a(ic0VarB.f21679b);
        while (true) {
            iA = v61Var.a(iA, this.f22677a, this.f22678b, this.f22682f, this.f22683g);
            while (ic0VarB.b() != null && !ic0VarB.f21683f.f22381g) {
                ic0VarB = ic0VarB.b();
            }
            ic0 ic0VarB2 = ic0VarB.b();
            if (iA == -1 || ic0VarB2 == null || v61Var.a(ic0VarB2.f21679b) != iA) {
                break;
            }
            ic0VarB = ic0VarB2;
        }
        boolean zA = a(ic0VarB);
        ic0VarB.f21683f = a(v61Var, ic0VarB.f21683f);
        return !zA;
    }

    private void g() {
        int i10 = com.yandex.mobile.ads.embedded.guava.collect.p.f18374c;
        com.yandex.mobile.ads.embedded.guava.collect.p.a aVar = new com.yandex.mobile.ads.embedded.guava.collect.p.a();
        for (ic0 ic0VarB = this.f22684h; ic0VarB != null; ic0VarB = ic0VarB.b()) {
            aVar.b(ic0VarB.f21683f.f22375a);
        }
        ic0 ic0Var = this.f22685i;
        this.f22680d.post(new ap1(this, aVar, ic0Var == null ? null : ic0Var.f21683f.f22375a));
    }

    public final ic0 a() {
        ic0 ic0Var = this.f22684h;
        if (ic0Var == null) {
            return null;
        }
        if (ic0Var == this.f22685i) {
            this.f22685i = ic0Var.b();
        }
        this.f22684h.g();
        int i10 = this.f22687k - 1;
        this.f22687k = i10;
        if (i10 == 0) {
            this.f22686j = null;
            ic0 ic0Var2 = this.f22684h;
            this.f22688l = ic0Var2.f21679b;
            this.f22689m = ic0Var2.f21683f.f22375a.f22015d;
        }
        this.f22684h = this.f22684h.b();
        g();
        return this.f22684h;
    }

    public final ic0 a(qv0[] qv0VarArr, o71 o71Var, u8 u8Var, qc0 qc0Var, kc0 kc0Var, p71 p71Var) {
        ic0 ic0Var = this.f22686j;
        ic0 ic0Var2 = new ic0(qv0VarArr, ic0Var == null ? 1000000000000L : (ic0Var.c() + this.f22686j.f21683f.f22379e) - kc0Var.f22376b, o71Var, u8Var, qc0Var, kc0Var, p71Var);
        ic0 ic0Var3 = this.f22686j;
        if (ic0Var3 != null) {
            ic0Var3.a(ic0Var2);
        } else {
            this.f22684h = ic0Var2;
            this.f22685i = ic0Var2;
        }
        this.f22688l = null;
        this.f22686j = ic0Var2;
        this.f22687k++;
        g();
        return ic0Var2;
    }

    public final kc0 a(long j10, xq0 xq0Var) {
        ic0 ic0Var = this.f22686j;
        if (ic0Var != null) {
            return a(xq0Var.f26589a, ic0Var, j10);
        }
        v61 v61Var = xq0Var.f26589a;
        nc0.b bVar = xq0Var.f26590b;
        long j11 = xq0Var.f26591c;
        long j12 = xq0Var.f26606r;
        v61Var.a(bVar.f22012a, this.f22677a);
        boolean zA = bVar.a();
        Object obj = bVar.f22012a;
        return zA ? a(v61Var, obj, bVar.f22013b, bVar.f22014c, j11, bVar.f22015d) : a(v61Var, obj, j12, j11, bVar.f22015d);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    public final kc0 a(v61 v61Var, kc0 kc0Var) {
        boolean z10;
        boolean z11;
        long jA;
        long j10;
        int i10;
        int i11;
        nc0.b bVar = kc0Var.f22375a;
        boolean zF = true;
        boolean z12 = !bVar.a() && bVar.f22016e == -1;
        if (!bVar.a() && bVar.f22016e == -1) {
            if (v61Var.a(v61Var.a(bVar.f22012a, this.f22677a).f25848c, this.f22678b, 0L).f25876p == v61Var.a(bVar.f22012a)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        int iA = v61Var.a(bVar.f22012a);
        if (v61Var.a(v61Var.a(iA, this.f22677a, false).f25848c, this.f22678b, 0L).f25869i) {
            z11 = false;
        } else {
            if ((v61Var.a(iA, this.f22677a, this.f22678b, this.f22682f, this.f22683g) == -1) && z12) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        v61Var.a(kc0Var.f22375a.f22012a, this.f22677a);
        long jB = (bVar.a() || (i11 = bVar.f22016e) == -1) ? -9223372036854775807L : this.f22677a.b(i11);
        if (!bVar.a()) {
            if (jB == -9223372036854775807L || jB == Long.MIN_VALUE) {
                jA = this.f22677a.f25849d;
            } else {
                j10 = jB;
            }
            if (bVar.a()) {
                zF = this.f22677a.f(bVar.f22013b);
            } else {
                i10 = bVar.f22016e;
                if (i10 != -1 || !this.f22677a.f(i10)) {
                    zF = false;
                }
            }
            return new kc0(bVar, kc0Var.f22376b, kc0Var.f22377c, jB, j10, zF, z12, z10, z11);
        }
        jA = this.f22677a.a(bVar.f22013b, bVar.f22014c);
        j10 = jA;
        if (bVar.a()) {
            zF = this.f22677a.f(bVar.f22013b);
        } else {
            i10 = bVar.f22016e;
            if (i10 != -1) {
                zF = false;
            } else {
                zF = false;
            }
        }
        return new kc0(bVar, kc0Var.f22376b, kc0Var.f22377c, jB, j10, zF, z12, z10, z11);
    }

    public final nc0.b a(v61 v61Var, Object obj, long j10) {
        long j11;
        int iA;
        Object obj2 = obj;
        int i10 = v61Var.a(obj2, this.f22677a).f25848c;
        Object obj3 = this.f22688l;
        if (obj3 == null || (iA = v61Var.a(obj3)) == -1 || v61Var.a(iA, this.f22677a, false).f25848c != i10) {
            ic0 ic0VarB = this.f22684h;
            while (true) {
                if (ic0VarB == null) {
                    ic0VarB = this.f22684h;
                    while (true) {
                        if (ic0VarB == null) {
                            j11 = this.f22681e;
                            this.f22681e = 1 + j11;
                            if (this.f22684h != null) {
                                break;
                            }
                            this.f22688l = obj2;
                            this.f22689m = j11;
                            break;
                        }
                        int iA2 = v61Var.a(ic0VarB.f21679b);
                        if (iA2 == -1 || v61Var.a(iA2, this.f22677a, false).f25848c != i10) {
                            ic0VarB = ic0VarB.b();
                        }
                    }
                } else if (!ic0VarB.f21679b.equals(obj2)) {
                    ic0VarB = ic0VarB.b();
                }
                j11 = ic0VarB.f21683f.f22375a.f22015d;
                break;
            }
        } else {
            j11 = this.f22689m;
        }
        long j12 = j11;
        v61Var.a(obj2, this.f22677a);
        v61Var.a(this.f22677a.f25848c, this.f22678b, 0L);
        boolean z10 = false;
        for (int iA3 = v61Var.a(obj); iA3 >= this.f22678b.f25875o; iA3--) {
            v61Var.a(iA3, this.f22677a, true);
            boolean z11 = this.f22677a.a() > 0;
            z10 |= z11;
            v61.b bVar = this.f22677a;
            if (bVar.b(bVar.f25849d) != -1) {
                obj2 = this.f22677a.f25847b;
                Objects.requireNonNull(obj2);
            }
            if (z10 && (!z11 || this.f22677a.f25849d != 0)) {
                break;
            }
        }
        return a(v61Var, obj2, j10, j12, this.f22678b, this.f22677a);
    }

    public final void a(long j10) {
        ic0 ic0Var = this.f22686j;
        if (ic0Var != null) {
            ic0Var.b(j10);
        }
    }

    public final boolean a(hc0 hc0Var) {
        ic0 ic0Var = this.f22686j;
        return ic0Var != null && ic0Var.f21678a == hc0Var;
    }

    public final boolean a(ic0 ic0Var) {
        boolean z10 = false;
        pa.b(ic0Var != null);
        if (ic0Var.equals(this.f22686j)) {
            return false;
        }
        this.f22686j = ic0Var;
        while (ic0Var.b() != null) {
            ic0Var = ic0Var.b();
            if (ic0Var == this.f22685i) {
                this.f22685i = this.f22684h;
                z10 = true;
            }
            ic0Var.g();
            this.f22687k--;
        }
        this.f22686j.a((ic0) null);
        g();
        return z10;
    }

    public final boolean a(v61 v61Var, int i10) {
        this.f22682f = i10;
        return a(v61Var);
    }

    public final boolean a(v61 v61Var, long j10, long j11) {
        kc0 kc0VarA;
        ic0 ic0VarB = this.f22684h;
        ic0 ic0Var = null;
        while (ic0VarB != null) {
            kc0 kc0Var = ic0VarB.f21683f;
            if (ic0Var != null) {
                kc0 kc0VarA2 = a(v61Var, ic0Var, j10);
                if (kc0VarA2 != null) {
                    if (kc0Var.f22376b == kc0VarA2.f22376b && kc0Var.f22375a.equals(kc0VarA2.f22375a)) {
                        kc0VarA = kc0VarA2;
                    }
                }
                return !a(ic0Var);
            }
            kc0VarA = a(v61Var, kc0Var);
            long j12 = kc0Var.f22377c;
            kc0 kc0Var2 = j12 == kc0VarA.f22377c ? kc0VarA : new kc0(kc0VarA.f22375a, kc0VarA.f22376b, j12, kc0VarA.f22378d, kc0VarA.f22379e, kc0VarA.f22380f, kc0VarA.f22381g, kc0VarA.f22382h, kc0VarA.f22383i);
            ic0VarB.f21683f = kc0Var2;
            long j13 = kc0Var.f22379e;
            if (!(j13 == -9223372036854775807L || j13 == kc0VarA.f22379e)) {
                hc0 hc0Var = ic0VarB.f21678a;
                if (hc0Var instanceof ji) {
                    long j14 = kc0Var2.f22378d;
                    if (j14 == -9223372036854775807L) {
                        j14 = Long.MIN_VALUE;
                    }
                    ((ji) hc0Var).a(j14);
                }
                long j15 = kc0VarA.f22379e;
                return (a(ic0VarB) || (ic0VarB == this.f22685i && !ic0VarB.f21683f.f22380f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j15 > (-9223372036854775807L) ? 1 : (j15 == (-9223372036854775807L) ? 0 : -1)) == 0 ? RecyclerView.FOREVER_NS : ic0VarB.d(j15)) ? 1 : (j11 == ((j15 > (-9223372036854775807L) ? 1 : (j15 == (-9223372036854775807L) ? 0 : -1)) == 0 ? RecyclerView.FOREVER_NS : ic0VarB.d(j15)) ? 0 : -1)) >= 0))) ? false : true;
            }
            ic0Var = ic0VarB;
            ic0VarB = ic0VarB.b();
        }
        return true;
    }

    public final boolean a(v61 v61Var, boolean z10) {
        this.f22683g = z10;
        return a(v61Var);
    }

    public final ic0 b() {
        ic0 ic0Var = this.f22685i;
        pa.b((ic0Var == null || ic0Var.b() == null) ? false : true);
        this.f22685i = this.f22685i.b();
        g();
        return this.f22685i;
    }

    public final void c() {
        if (this.f22687k == 0) {
            return;
        }
        ic0 ic0VarB = (ic0) pa.b(this.f22684h);
        this.f22688l = ic0VarB.f21679b;
        this.f22689m = ic0VarB.f21683f.f22375a.f22015d;
        while (ic0VarB != null) {
            ic0VarB.g();
            ic0VarB = ic0VarB.b();
        }
        this.f22684h = null;
        this.f22686j = null;
        this.f22685i = null;
        this.f22687k = 0;
        g();
    }

    public final ic0 d() {
        return this.f22686j;
    }

    public final ic0 e() {
        return this.f22684h;
    }

    public final ic0 f() {
        return this.f22685i;
    }

    public final boolean h() {
        ic0 ic0Var = this.f22686j;
        if (ic0Var != null) {
            if (ic0Var.f21683f.f22383i) {
                return false;
            }
            if (!(ic0Var.f21681d && (!ic0Var.f21682e || ic0Var.f21678a.getBufferedPositionUs() == Long.MIN_VALUE)) || this.f22686j.f21683f.f22379e == -9223372036854775807L || this.f22687k >= 100) {
                return false;
            }
        }
        return true;
    }
}
