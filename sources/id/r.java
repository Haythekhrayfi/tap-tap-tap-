package id;

import fd.j0;
import fd.j1;
import fd.t0;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public class r<T> extends jd.b<t> implements m<T>, jd.l<T>, jd.l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f31599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hd.e f31600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object[] f31601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f31602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f31603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f31604l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f31605m;

    public static final class a implements t0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r<?> f31606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f31607d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f31608e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final mc.d<jc.w> f31609f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(r<?> rVar, long j10, Object obj, mc.d<? super jc.w> dVar) {
            this.f31606c = rVar;
            this.f31607d = j10;
            this.f31608e = obj;
            this.f31609f = dVar;
        }

        @Override // fd.t0
        public void dispose() {
            r<?> rVar = this.f31606c;
            synchronized (rVar) {
                if (this.f31607d >= rVar.n()) {
                    Object[] objArr = rVar.f31601i;
                    j0.f(objArr);
                    long j10 = this.f31607d;
                    kd.z zVar = s.f31618a;
                    int i10 = (int) j10;
                    if (objArr[(objArr.length - 1) & i10] == this) {
                        objArr[i10 & (objArr.length - 1)] = s.f31618a;
                        rVar.h();
                    }
                }
            }
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31610a;

        static {
            int[] iArr = new int[hd.e.values().length];
            iArr[hd.e.SUSPEND.ordinal()] = 1;
            iArr[hd.e.DROP_LATEST.ordinal()] = 2;
            iArr[hd.e.DROP_OLDEST.ordinal()] = 3;
            f31610a = iArr;
        }
    }

    @oc.e(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {373, 380, 383}, m = "collect$suspendImpl")
    public static final class c extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f31611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f31612d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f31613e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f31614f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f31615g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ r<T> f31616h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f31617i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r<T> rVar, mc.d<? super c> dVar) {
            super(dVar);
            this.f31616h = rVar;
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f31615g = obj;
            this.f31617i |= Integer.MIN_VALUE;
            return r.i(this.f31616h, null, this);
        }
    }

    public r(int i10, int i11, hd.e eVar) {
        this.f31598f = i10;
        this.f31599g = i11;
        this.f31600h = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object i(r rVar, e eVar, mc.d dVar) throws Throwable {
        c cVar;
        r rVar2;
        Throwable th;
        t tVar;
        e eVar2;
        j1 j1Var;
        e eVar3;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f31617i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f31617i = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(rVar, dVar);
            }
        } else {
            cVar = new c(rVar, dVar);
        }
        Object obj = cVar.f31615g;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = cVar.f31617i;
        if (i11 != 0) {
            if (i11 == 1) {
                tVar = (t) cVar.f31613e;
                e eVar4 = (e) cVar.f31612d;
                r rVar3 = (r) cVar.f31611c;
                try {
                    h9.d.t(obj);
                    eVar2 = eVar4;
                    rVar = rVar3;
                    try {
                        mc.f context = cVar.getContext();
                        int i12 = j1.f29579x1;
                        j1Var = (j1) context.b(j1.b.f29580c);
                        eVar3 = eVar2;
                    } catch (Throwable th2) {
                        rVar2 = rVar;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    rVar2 = rVar3;
                }
            } else {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j1 j1Var2 = (j1) cVar.f31614f;
                tVar = (t) cVar.f31613e;
                e eVar5 = (e) cVar.f31612d;
                rVar2 = (r) cVar.f31611c;
                try {
                    h9.d.t(obj);
                    eVar3 = eVar5;
                    j1Var = j1Var2;
                    rVar = rVar2;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            rVar2.f(tVar);
            throw th;
        }
        h9.d.t(obj);
        t tVarC = rVar.c();
        try {
            if (eVar instanceof y) {
                cVar.f31611c = rVar;
                cVar.f31612d = eVar;
                cVar.f31613e = tVarC;
                cVar.f31617i = 1;
                if (((y) eVar).a(cVar) == aVar) {
                    return aVar;
                }
            }
            eVar2 = eVar;
            tVar = tVarC;
            mc.f context2 = cVar.getContext();
            int i13 = j1.f29579x1;
            j1Var = (j1) context2.b(j1.b.f29580c);
            eVar3 = eVar2;
        } catch (Throwable th5) {
            rVar2 = rVar;
            th = th5;
            tVar = tVarC;
        }
        while (true) {
            Object objT = rVar.t(tVar);
            if (objT == s.f31618a) {
                cVar.f31611c = rVar;
                cVar.f31612d = eVar3;
                cVar.f31613e = tVar;
                cVar.f31614f = j1Var;
                cVar.f31617i = 2;
                if (rVar.g(tVar, cVar) == aVar) {
                    return aVar;
                }
            } else {
                if (j1Var != null && !j1Var.a()) {
                    throw j1Var.q();
                }
                cVar.f31611c = rVar;
                cVar.f31612d = eVar3;
                cVar.f31613e = tVar;
                cVar.f31614f = j1Var;
                cVar.f31617i = 3;
                if (eVar3.emit(objT, cVar) == aVar) {
                    return aVar;
                }
            }
        }
    }

    @Override // id.q, id.d
    public Object a(e<? super T> eVar, mc.d<?> dVar) {
        return i(this, eVar, dVar);
    }

    @Override // jd.l
    public d<T> b(mc.f fVar, int i10, hd.e eVar) {
        return s.a(this, fVar, i10, eVar);
    }

    @Override // jd.b
    public jd.d d() {
        return new t();
    }

    @Override // jd.b
    public jd.d[] e(int i10) {
        return new t[i10];
    }

    @Override // id.m, id.e
    public Object emit(T t10, mc.d<? super jc.w> dVar) {
        Continuation<Unit>[] continuationArrL;
        a aVar;
        if (!q(t10)) {
            fd.k kVar = new fd.k(nc.b.c(dVar), 1);
            kVar.u();
            Continuation<Unit>[] continuationArrL2 = jd.c.f31849a;
            synchronized (this) {
                if (r(t10)) {
                    jc.i.a aVar2 = jc.i.f31813c;
                    kVar.resumeWith(jc.w.f31842a);
                    continuationArrL = l(continuationArrL2);
                    aVar = null;
                } else {
                    a aVar3 = new a(this, ((long) o()) + n(), t10, kVar);
                    k(aVar3);
                    this.f31605m++;
                    if (this.f31599g == 0) {
                        continuationArrL2 = l(continuationArrL2);
                    }
                    continuationArrL = continuationArrL2;
                    aVar = aVar3;
                }
            }
            if (aVar != null) {
                c0.i(kVar, aVar);
            }
            for (Continuation<Unit> continuation : continuationArrL) {
                if (continuation != null) {
                    jc.i.a aVar4 = jc.i.f31813c;
                    continuation.resumeWith(jc.w.f31842a);
                }
            }
            Object objR = kVar.r();
            nc.a aVar5 = nc.a.COROUTINE_SUSPENDED;
            if (objR == aVar5) {
                j0.i(dVar, "frame");
            }
            if (objR != aVar5) {
                objR = jc.w.f31842a;
            }
            if (objR == aVar5) {
                return objR;
            }
        }
        return jc.w.f31842a;
    }

    public final Object g(t tVar, mc.d<? super jc.w> dVar) {
        jc.w wVar;
        fd.k kVar = new fd.k(nc.b.c(dVar), 1);
        kVar.u();
        synchronized (this) {
            if (s(tVar) < 0) {
                tVar.f31620b = kVar;
                tVar.f31620b = kVar;
            } else {
                jc.i.a aVar = jc.i.f31813c;
                kVar.resumeWith(jc.w.f31842a);
            }
            wVar = jc.w.f31842a;
        }
        Object objR = kVar.r();
        return objR == nc.a.COROUTINE_SUSPENDED ? objR : wVar;
    }

    public final void h() {
        if (this.f31599g != 0 || this.f31605m > 1) {
            Object[] objArr = this.f31601i;
            j0.f(objArr);
            while (this.f31605m > 0) {
                long jN = (n() + ((long) o())) - 1;
                kd.z zVar = s.f31618a;
                if (objArr[((int) jN) & (objArr.length - 1)] != s.f31618a) {
                    return;
                }
                this.f31605m--;
                objArr[((int) (n() + ((long) o()))) & (objArr.length - 1)] = null;
            }
        }
    }

    public final void j() {
        Object[] objArr;
        Object[] objArr2 = this.f31601i;
        j0.f(objArr2);
        long jN = n();
        kd.z zVar = s.f31618a;
        objArr2[((int) jN) & (objArr2.length - 1)] = null;
        this.f31604l--;
        long jN2 = n() + 1;
        if (this.f31602j < jN2) {
            this.f31602j = jN2;
        }
        if (this.f31603k < jN2) {
            if (this.f31847d != 0 && (objArr = this.f31846c) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        t tVar = (t) obj;
                        long j10 = tVar.f31619a;
                        if (j10 >= 0 && j10 < jN2) {
                            tVar.f31619a = jN2;
                        }
                    }
                }
            }
            this.f31603k = jN2;
        }
    }

    public final void k(Object obj) {
        int iO = o();
        Object[] objArrP = this.f31601i;
        if (objArrP == null) {
            objArrP = p(null, 0, 2);
        } else if (iO >= objArrP.length) {
            objArrP = p(objArrP, iO, objArrP.length * 2);
        }
        long jN = n() + ((long) iO);
        kd.z zVar = s.f31618a;
        objArrP[((int) jN) & (objArrP.length - 1)] = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation<kotlin.Unit>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final Continuation<Unit>[] l(Continuation<Unit>[] continuationArr) {
        Object[] objArr;
        t tVar;
        mc.d<? super jc.w> dVar;
        int length = continuationArr.length;
        if (this.f31847d != 0 && (objArr = this.f31846c) != null) {
            int i10 = 0;
            int length2 = objArr.length;
            while (i10 < length2) {
                Object obj = objArr[i10];
                if (obj == null || (dVar = (tVar = (t) obj).f31620b) == null || s(tVar) < 0) {
                    continuationArr = continuationArr;
                } else {
                    if (length >= continuationArr.length) {
                        continuationArr = continuationArr;
                        continuationArr = continuationArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) continuationArr, Math.max(2, continuationArr.length * 2));
                        j0.h(objArrCopyOf, "copyOf(this, newSize)");
                        continuationArr = objArrCopyOf;
                    }
                    continuationArr = continuationArr;
                    continuationArr = continuationArr;
                    ((mc.d[]) continuationArr)[length] = dVar;
                    tVar.f31620b = null;
                    length++;
                }
                i10++;
                continuationArr = continuationArr;
            }
            continuationArr = continuationArr;
        }
        return (mc.d[]) continuationArr;
    }

    public final long m() {
        return n() + ((long) this.f31604l);
    }

    public final long n() {
        return Math.min(this.f31603k, this.f31602j);
    }

    public final int o() {
        return this.f31604l + this.f31605m;
    }

    public final Object[] p(Object[] objArr, int i10, int i11) {
        if (!(i11 > 0)) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i11];
        this.f31601i = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jN = n();
        for (int i12 = 0; i12 < i10; i12++) {
            kd.z zVar = s.f31618a;
            int i13 = (int) (((long) i12) + jN);
            objArr2[i13 & (i11 - 1)] = objArr[(objArr.length - 1) & i13];
        }
        return objArr2;
    }

    public boolean q(T t10) {
        int i10;
        boolean z10;
        Continuation<Unit>[] continuationArrL = jd.c.f31849a;
        synchronized (this) {
            if (r(t10)) {
                continuationArrL = l(continuationArrL);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (Continuation<Unit> continuation : continuationArrL) {
            if (continuation != null) {
                jc.i.a aVar = jc.i.f31813c;
                continuation.resumeWith(jc.w.f31842a);
            }
        }
        return z10;
    }

    public final boolean r(T t10) {
        if (this.f31847d == 0) {
            if (this.f31598f != 0) {
                k(t10);
                int i10 = this.f31604l + 1;
                this.f31604l = i10;
                if (i10 > this.f31598f) {
                    j();
                }
                this.f31603k = n() + ((long) this.f31604l);
            }
            return true;
        }
        if (this.f31604l >= this.f31599g && this.f31603k <= this.f31602j) {
            int i11 = b.f31610a[this.f31600h.ordinal()];
            if (i11 == 1) {
                return false;
            }
            if (i11 == 2) {
                return true;
            }
        }
        k(t10);
        int i12 = this.f31604l + 1;
        this.f31604l = i12;
        if (i12 > this.f31599g) {
            j();
        }
        long jN = n() + ((long) this.f31604l);
        long j10 = this.f31602j;
        if (((int) (jN - j10)) > this.f31598f) {
            u(j10 + 1, this.f31603k, m(), n() + ((long) this.f31604l) + ((long) this.f31605m));
        }
        return true;
    }

    public final long s(t tVar) {
        long j10 = tVar.f31619a;
        if (j10 < m()) {
            return j10;
        }
        if (this.f31599g <= 0 && j10 <= n() && this.f31605m != 0) {
            return j10;
        }
        return -1L;
    }

    public final Object t(t tVar) {
        Object obj;
        mc.d[] dVarArrV = jd.c.f31849a;
        synchronized (this) {
            long jS = s(tVar);
            if (jS < 0) {
                obj = s.f31618a;
            } else {
                long j10 = tVar.f31619a;
                Object[] objArr = this.f31601i;
                j0.f(objArr);
                kd.z zVar = s.f31618a;
                Object obj2 = objArr[((int) jS) & (objArr.length - 1)];
                if (obj2 instanceof a) {
                    obj2 = ((a) obj2).f31608e;
                }
                tVar.f31619a = jS + 1;
                Object obj3 = obj2;
                dVarArrV = v(j10);
                obj = obj3;
            }
        }
        for (mc.d dVar : dVarArrV) {
            if (dVar != null) {
                jc.i.a aVar = jc.i.f31813c;
                dVar.resumeWith(jc.w.f31842a);
            }
        }
        return obj;
    }

    public final void u(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jN = n(); jN < jMin; jN++) {
            Object[] objArr = this.f31601i;
            j0.f(objArr);
            kd.z zVar = s.f31618a;
            objArr[((int) jN) & (objArr.length - 1)] = null;
        }
        this.f31602j = j10;
        this.f31603k = j11;
        this.f31604l = (int) (j12 - jMin);
        this.f31605m = (int) (j13 - j12);
    }

    public final Continuation<Unit>[] v(long j10) {
        long j11;
        long j12;
        long j13;
        Object[] objArr;
        if (j10 > this.f31603k) {
            return jd.c.f31849a;
        }
        long jN = n();
        long j14 = ((long) this.f31604l) + jN;
        if (this.f31599g == 0 && this.f31605m > 0) {
            j14++;
        }
        if (this.f31847d != 0 && (objArr = this.f31846c) != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    long j15 = ((t) obj).f31619a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.f31603k) {
            return jd.c.f31849a;
        }
        long jM = m();
        int iMin = this.f31847d > 0 ? Math.min(this.f31605m, this.f31599g - ((int) (jM - j14))) : this.f31605m;
        mc.d[] dVarArr = jd.c.f31849a;
        long j16 = ((long) this.f31605m) + jM;
        if (iMin > 0) {
            dVarArr = new mc.d[iMin];
            Object[] objArr2 = this.f31601i;
            j0.f(objArr2);
            long j17 = jM;
            int i10 = 0;
            while (true) {
                if (jM >= j16) {
                    j11 = j14;
                    j12 = j16;
                    break;
                }
                kd.z zVar = s.f31618a;
                int i11 = (int) jM;
                j11 = j14;
                Object obj2 = objArr2[(objArr2.length - 1) & i11];
                kd.z zVar2 = s.f31618a;
                j12 = j16;
                if (obj2 != zVar2) {
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) obj2;
                    int i12 = i10 + 1;
                    dVarArr[i10] = aVar.f31609f;
                    objArr2[i11 & (objArr2.length - 1)] = zVar2;
                    objArr2[((int) j17) & (objArr2.length - 1)] = aVar.f31608e;
                    j13 = 1;
                    j17++;
                    if (i12 >= iMin) {
                        break;
                    }
                    i10 = i12;
                } else {
                    j13 = 1;
                }
                jM += j13;
                j14 = j11;
                j16 = j12;
            }
            jM = j17;
        } else {
            j11 = j14;
            j12 = j16;
        }
        int i13 = (int) (jM - jN);
        long j18 = this.f31847d == 0 ? jM : j11;
        long jMax = Math.max(this.f31602j, jM - ((long) Math.min(this.f31598f, i13)));
        if (this.f31599g == 0 && jMax < j12) {
            Object[] objArr3 = this.f31601i;
            j0.f(objArr3);
            kd.z zVar3 = s.f31618a;
            if (j0.d(objArr3[((int) jMax) & (objArr3.length - 1)], s.f31618a)) {
                jM++;
                jMax++;
            }
        }
        u(jMax, j18, jM, j12);
        h();
        return (dVarArr.length == 0) ^ true ? l(dVarArr) : dVarArr;
    }
}
