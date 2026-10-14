package fd;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class z {
    public static final <T> Object A(Object obj, mc.d<? super T> dVar) {
        if (obj instanceof v) {
            jc.i.a aVar = jc.i.f31813c;
            return h9.d.f(((v) obj).f29629a);
        }
        jc.i.a aVar2 = jc.i.f31813c;
        return obj;
    }

    public static <T> T B(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(i.f.a(str, " must not be null"));
    }

    public static int C(int i10, int i11) {
        int i12 = i10 + i11;
        if ((i10 ^ i12) >= 0 || (i10 ^ i11) < 0) {
            return i12;
        }
        throw new ArithmeticException(n1.c.a("Addition overflows an int: ", i10, " + ", i11));
    }

    public static long D(long j10, long j11) {
        long j12 = j10 + j11;
        if ((j10 ^ j12) >= 0 || (j10 ^ j11) < 0) {
            return j12;
        }
        StringBuilder sbA = i2.a.a("Addition overflows a long: ", j10, " + ");
        sbA.append(j11);
        throw new ArithmeticException(sbA.toString());
    }

    public static int E(int i10, int i11) {
        long j10 = ((long) i10) * ((long) i11);
        if (j10 < -2147483648L || j10 > 2147483647L) {
            throw new ArithmeticException(n1.c.a("Multiplication overflows an int: ", i10, " * ", i11));
        }
        return (int) j10;
    }

    public static long F(long j10, int i10) {
        if (i10 == -1) {
            if (j10 != Long.MIN_VALUE) {
                return -j10;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j10 + " * " + i10);
        }
        if (i10 == 0) {
            return 0L;
        }
        if (i10 == 1) {
            return j10;
        }
        long j11 = i10;
        long j12 = j10 * j11;
        if (j12 / j11 == j10) {
            return j12;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j10 + " * " + i10);
    }

    public static long G(long j10, long j11) {
        if (j11 == 1) {
            return j10;
        }
        if (j10 == 1) {
            return j11;
        }
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        long j12 = j10 * j11;
        if (j12 / j11 == j10 && ((j10 != Long.MIN_VALUE || j11 != -1) && (j11 != Long.MIN_VALUE || j10 != -1))) {
            return j12;
        }
        StringBuilder sbA = i2.a.a("Multiplication overflows a long: ", j10, " * ");
        sbA.append(j11);
        throw new ArithmeticException(sbA.toString());
    }

    public static long H(long j10, long j11) {
        long j12 = j10 - j11;
        if ((j10 ^ j12) >= 0 || (j10 ^ j11) >= 0) {
            return j12;
        }
        StringBuilder sbA = i2.a.a("Subtraction overflows a long: ", j10, " - ");
        sbA.append(j11);
        throw new ArithmeticException(sbA.toString());
    }

    public static int I(long j10) {
        if (j10 > 2147483647L || j10 < -2147483648L) {
            throw new ArithmeticException(androidx.viewpager2.adapter.a.a("Calculation overflows an int: ", j10));
        }
        return (int) j10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public static final int J(qd.x xVar, int i10) {
        int i11;
        int[] iArr = xVar.f34943i;
        int i12 = i10 + 1;
        int i13 = 0;
        int length = xVar.f34942h.length;
        j0.i(iArr, "<this>");
        int i14 = length - 1;
        while (i13 <= i14) {
            i11 = (i13 + i14) >>> 1;
            int i15 = iArr[i11];
            if (i15 < i12) {
                i13 = i11 + 1;
            } else {
                if (i15 <= i12) {
                    if (i11 >= 0) {
                        return i11;
                    }
                    return ~i11;
                }
                i14 = i11 - 1;
            }
        }
        i11 = (-i13) - 1;
        if (i11 >= 0) {
            return i11;
        }
        return ~i11;
    }

    public static final void K(mc.d<? super jc.w> dVar, mc.d<?> dVar2) throws Throwable {
        try {
            mc.d dVarC = nc.b.c(dVar);
            jc.i.a aVar = jc.i.f31813c;
            kd.g.a(dVarC, jc.w.f31842a, null);
        } catch (Throwable th) {
            n(dVar2, th);
            throw null;
        }
    }

    public static void L(uc.p pVar, Object obj, mc.d dVar, uc.l lVar, int i10) throws Throwable {
        try {
            mc.d dVarC = nc.b.c(nc.b.b(pVar, obj, dVar));
            jc.i.a aVar = jc.i.f31813c;
            kd.g.a(dVarC, jc.w.f31842a, null);
        } catch (Throwable th) {
            n(dVar, th);
            throw null;
        }
    }

    public static final long M(String str, long j10, long j11, long j12) {
        String strN = N(str);
        if (strN == null) {
            return j10;
        }
        Long lG = ed.p.g(strN);
        if (lG == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strN + CoreConstants.SINGLE_QUOTE_CHAR).toString());
        }
        long jLongValue = lG.longValue();
        boolean z10 = false;
        if (j11 <= jLongValue && jLongValue <= j12) {
            z10 = true;
        }
        if (z10) {
            return jLongValue;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("System property '");
        sb2.append(str);
        sb2.append("' should be in range ");
        sb2.append(j11);
        r.e.a(sb2, CallerDataConverter.DEFAULT_RANGE_DELIMITER, j12, ", but is '");
        sb2.append(jLongValue);
        sb2.append(CoreConstants.SINGLE_QUOTE_CHAR);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final String N(String str) {
        int i10 = kd.a0.f32017a;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static final boolean O(String str, boolean z10) {
        String strN = N(str);
        return strN != null ? Boolean.parseBoolean(strN) : z10;
    }

    public static int P(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return (int) M(str, i10, i11, i12);
    }

    public static /* synthetic */ long Q(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = RecyclerView.FOREVER_NS;
        }
        return M(str, j10, j13, j12);
    }

    public static final <T> Object R(Object obj, uc.l<? super Throwable, jc.w> lVar) {
        Throwable thA = jc.i.a(obj);
        if (thA == null) {
            return lVar != null ? new w(obj, lVar) : obj;
        }
        return new v(thA, false, 2, null);
    }

    public static final <T, V> Object S(mc.f fVar, V v10, Object obj, uc.p<? super V, ? super mc.d<? super T>, ? extends Object> pVar, mc.d<? super T> dVar) {
        Object objC = kd.b0.c(fVar, obj);
        try {
            jd.s sVar = new jd.s(dVar, fVar);
            vc.f0.c(pVar, 2);
            Object objInvoke = pVar.invoke(v10, sVar);
            kd.b0.a(fVar, objC);
            if (objInvoke == nc.a.COROUTINE_SUSPENDED) {
                j0.i(dVar, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            kd.b0.a(fVar, objC);
            throw th;
        }
    }

    public static final g0 a(mc.f fVar) {
        int i10 = j1.f29579x1;
        if (fVar.b(j1.b.f29580c) == null) {
            fVar = fVar.i(b(null, 1, null));
        }
        return new kd.e(fVar);
    }

    public static t b(j1 j1Var, int i10, Object obj) {
        return new m1(null);
    }

    public static final Context c(fe.a aVar) {
        j0.j(aVar, "$receiver");
        return (Context) aVar.f29652f.f37311a.c(new yd.h("", vc.b0.a(Context.class), null, ae.b.f348c));
    }

    public static final <T> id.u<T> d(id.n<T> nVar) {
        return new id.p(nVar, null);
    }

    public static id.d e(id.d dVar, int i10, hd.e eVar, int i11, Object obj) {
        int i12;
        hd.e eVar2;
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        hd.e eVar3 = (i11 & 2) != 0 ? hd.e.SUSPEND : null;
        boolean z10 = true;
        if (!(i10 >= 0 || i10 == -2 || i10 == -1)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i10).toString());
        }
        if (i10 == -1 && eVar3 != hd.e.SUSPEND) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i10 == -1) {
            eVar2 = hd.e.DROP_OLDEST;
            i12 = 0;
        } else {
            i12 = i10;
            eVar2 = eVar3;
        }
        return dVar instanceof jd.l ? ((jd.l) dVar).b(mc.h.f33539c, i12, eVar2) : new jd.j(dVar, null, i12, eVar2, 2, null);
    }

    public static final <T> id.d<T> f(uc.p<? super hd.p<? super T>, ? super mc.d<? super jc.w>, ? extends Object> pVar) {
        return new id.a(pVar, null, 0, null, 14, null);
    }

    public static void g(g0 g0Var, CancellationException cancellationException, int i10) {
        mc.f fVarW = g0Var.w();
        int i11 = j1.f29579x1;
        j1 j1Var = (j1) fVarW.b(j1.b.f29580c);
        if (j1Var != null) {
            j1Var.c(null);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + g0Var).toString());
    }

    public static void h(mc.f fVar, CancellationException cancellationException, int i10, Object obj) {
        int i11 = j1.f29579x1;
        j1 j1Var = (j1) fVar.b(j1.b.f29580c);
        if (j1Var != null) {
            j1Var.c(null);
        }
    }

    public static final void i(hd.r<?> rVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationException == null) {
                cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                cancellationException.initCause(th);
            }
        }
        rVar.c(cancellationException);
    }

    public static int j(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int k(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 > j11 ? 1 : 0;
    }

    public static final <R> Object l(uc.p<? super g0, ? super mc.d<? super R>, ? extends Object> pVar, mc.d<? super R> dVar) {
        kd.x xVar = new kd.x(dVar.getContext(), dVar);
        Object objI = f.i(xVar, xVar, pVar);
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        return objI;
    }

    public static final Object m(long j10, mc.d<? super jc.w> dVar) {
        if (j10 <= 0) {
            return jc.w.f31842a;
        }
        k kVar = new k(nc.b.c(dVar), 1);
        kVar.u();
        if (j10 < RecyclerView.FOREVER_NS) {
            w(kVar.f29585g).l(j10, kVar);
        }
        Object objR = kVar.r();
        return objR == nc.a.COROUTINE_SUSPENDED ? objR : jc.w.f31842a;
    }

    public static final void n(mc.d<?> dVar, Throwable th) throws Throwable {
        jc.i.a aVar = jc.i.f31813c;
        dVar.resumeWith(h9.d.f(th));
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> id.d<T> o(id.d<? extends T> dVar) {
        uc.l<Object, Object> lVar = id.g.f31568a;
        if (dVar instanceof id.u) {
            return dVar;
        }
        uc.l<Object, Object> lVar2 = id.g.f31568a;
        uc.p<Object, Object, Boolean> pVar = id.g.f31569b;
        if (dVar instanceof id.c) {
            id.c cVar = (id.c) dVar;
            if (cVar.f31555d == lVar2 && cVar.f31556e == pVar) {
                return dVar;
            }
        }
        return new id.c(dVar, lVar2, pVar);
    }

    public static final void p(mc.f fVar) {
        int i10 = j1.f29579x1;
        j1 j1Var = (j1) fVar.b(j1.b.f29580c);
        if (j1Var != null && !j1Var.a()) {
            throw j1Var.q();
        }
    }

    public static boolean q(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object r(id.d<? extends T> dVar, mc.d<? super T> dVar2) {
        id.j jVar;
        vc.a0 a0Var;
        jd.a e10;
        id.h hVar;
        if (dVar2 instanceof id.j) {
            jVar = (id.j) dVar2;
            int i10 = jVar.f31583f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f31583f = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new id.j(dVar2);
            }
        } else {
            jVar = new id.j(dVar2);
        }
        Object obj = jVar.f31582e;
        Object obj2 = nc.a.COROUTINE_SUSPENDED;
        int i11 = jVar.f31583f;
        if (i11 == 0) {
            h9.d.t(obj);
            vc.a0 a0Var2 = new vc.a0();
            a0Var2.f36988c = (T) jd.n.f31867a;
            id.h hVar2 = new id.h(a0Var2);
            try {
                jVar.f31580c = a0Var2;
                jVar.f31581d = hVar2;
                jVar.f31583f = 1;
                if (((id.l) dVar).a(hVar2, jVar) != obj2) {
                    a0Var = a0Var2;
                    obj2 = a0Var.f36988c;
                    if (obj2 == jd.n.f31867a) {
                        throw new NoSuchElementException("Expected at least one element");
                    }
                }
            } catch (jd.a e11) {
                a0Var = a0Var2;
                e10 = e11;
                hVar = hVar2;
                if (e10.f31845c != hVar) {
                    throw e10;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (id.h) jVar.f31581d;
            a0Var = (vc.a0) jVar.f31580c;
            try {
                h9.d.t(obj);
            } catch (jd.a e12) {
                e10 = e12;
                if (e10.f31845c != hVar) {
                    throw e10;
                }
            }
            obj2 = a0Var.f36988c;
            if (obj2 == jd.n.f31867a) {
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r5.a(r2, r0) == r1) goto L29;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0071, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object s(id.d<? extends T> r5, uc.p<? super T, ? super mc.d<? super java.lang.Boolean>, ? extends java.lang.Object> r6, mc.d<? super T> r7) {
        /*
            boolean r0 = r7 instanceof id.k
            if (r0 == 0) goto L13
            r0 = r7
            id.k r0 = (id.k) r0
            int r1 = r0.f31588g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31588g = r1
            goto L18
        L13:
            id.k r0 = new id.k
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31587f
            nc.a r1 = nc.a.COROUTINE_SUSPENDED
            int r2 = r0.f31588g
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r5 = r0.f31586e
            id.i r5 = (id.i) r5
            java.lang.Object r6 = r0.f31585d
            vc.a0 r6 = (vc.a0) r6
            java.lang.Object r0 = r0.f31584c
            uc.p r0 = (uc.p) r0
            h9.d.t(r7)     // Catch: jd.a -> L33
            goto L6a
        L33:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r0
            r0 = r4
            goto L64
        L39:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L41:
            h9.d.t(r7)
            vc.a0 r7 = new vc.a0
            r7.<init>()
            kd.z r2 = jd.n.f31867a
            r7.f36988c = r2
            id.i r2 = new id.i
            r2.<init>(r6, r7)
            r0.f31584c = r6     // Catch: jd.a -> L61
            r0.f31585d = r7     // Catch: jd.a -> L61
            r0.f31586e = r2     // Catch: jd.a -> L61
            r0.f31588g = r3     // Catch: jd.a -> L61
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: jd.a -> L61
            if (r5 != r1) goto L68
            goto L70
        L61:
            r5 = move-exception
            r0 = r5
            r5 = r2
        L64:
            id.e<?> r1 = r0.f31845c
            if (r1 != r5) goto L88
        L68:
            r0 = r6
            r6 = r7
        L6a:
            T r1 = r6.f36988c
            kd.z r5 = jd.n.f31867a
            if (r1 == r5) goto L71
        L70:
            return r1
        L71:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.z.s(id.d, uc.p, mc.d):java.lang.Object");
    }

    public static long t(long j10, long j11) {
        return j10 >= 0 ? j10 / j11 : ((j10 + 1) / j11) - 1;
    }

    public static int u(long j10, int i10) {
        long j11 = i10;
        return (int) (((j10 % j11) + j11) % j11);
    }

    public static long v(long j10, long j11) {
        return ((j10 % j11) + j11) % j11;
    }

    public static final o0 w(mc.f fVar) {
        int i10 = mc.e.B1;
        mc.f.a aVarB = fVar.b(mc.e.a.f33537c);
        o0 o0Var = aVarB instanceof o0 ? (o0) aVarB : null;
        return o0Var == null ? l0.f29592b : o0Var;
    }

    public static final <T> T x(String str, uc.a<? extends T> aVar) {
        long jNanoTime = System.nanoTime();
        T tInvoke = aVar.invoke();
        double dNanoTime = (System.nanoTime() - jNanoTime) / 1000000.0d;
        if (str != null) {
            Objects.requireNonNull(wd.a.f37302g);
            wd.a.f37301f.debug(str + " in " + dNanoTime + " ms");
        }
        return tInvoke;
    }

    public static final double y(uc.a<jc.w> aVar) {
        long jNanoTime = System.nanoTime();
        aVar.invoke();
        return (System.nanoTime() - jNanoTime) / 1000000.0d;
    }

    public static final Object z(Object obj, E e10) {
        if (obj == null) {
            return e10;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e10);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e10);
        return arrayList;
    }
}
