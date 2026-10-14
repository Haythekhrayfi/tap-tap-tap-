package fd;

/* JADX INFO: loaded from: classes3.dex */
public final class f2 {

    @oc.e(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {100}, m = "withTimeoutOrNull")
    public static final class a<T> extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f29567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f29568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f29569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f29570f;

        public a(mc.d<? super a> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f29569e = obj;
            this.f29570f |= Integer.MIN_VALUE;
            return f2.c(0L, null, this);
        }
    }

    public static final <U, T extends U> Object a(e2<U, ? super T> e2Var, uc.p<? super g0, ? super mc.d<? super T>, ? extends Object> pVar) throws Throwable {
        Object vVar;
        Object objJ0;
        e2Var.m(false, true, new v0(z.w(e2Var.f32071e.getContext()).k(e2Var.f29564f, e2Var, e2Var.f29539d)));
        try {
            vc.f0.c(pVar, 2);
            vVar = pVar.invoke(e2Var, e2Var);
        } catch (Throwable th) {
            vVar = new v(th, false, 2, null);
        }
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        if (vVar == aVar || (objJ0 = e2Var.j0(vVar)) == p1.f29609b) {
            return aVar;
        }
        if (objJ0 instanceof v) {
            Throwable th2 = ((v) objJ0).f29629a;
            if (((th2 instanceof d2) && ((d2) th2).f29562c == e2Var) ? false : true) {
                throw th2;
            }
            if (vVar instanceof v) {
                throw ((v) vVar).f29629a;
            }
        } else {
            vVar = p1.a(objJ0);
        }
        return vVar;
    }

    public static final <T> Object b(long j10, uc.p<? super g0, ? super mc.d<? super T>, ? extends Object> pVar, mc.d<? super T> dVar) {
        if (j10 <= 0) {
            throw new d2("Timed out immediately");
        }
        Object objA = a(new e2(j10, dVar), pVar);
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, fd.e2] */
    public static final <T> Object c(long j10, uc.p<? super g0, ? super mc.d<? super T>, ? extends Object> pVar, mc.d<? super T> dVar) {
        a aVar;
        d2 e10;
        vc.a0 a0Var;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f29570f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f29570f = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objA = aVar.f29569e;
        nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
        int i11 = aVar.f29570f;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var = (vc.a0) aVar.f29568d;
            try {
                h9.d.t(objA);
            } catch (d2 e11) {
                e10 = e11;
                if (e10.f29562c == a0Var.f36988c) {
                    return null;
                }
                throw e10;
            }
        }
        h9.d.t(objA);
        if (j10 <= 0) {
            return null;
        }
        vc.a0 a0Var2 = new vc.a0();
        try {
            aVar.f29567c = pVar;
            aVar.f29568d = a0Var2;
            aVar.f29570f = 1;
            ?? r10 = (T) new e2(j10, aVar);
            a0Var2.f36988c = r10;
            objA = a(r10, pVar);
            return objA == aVar2 ? aVar2 : objA;
        } catch (d2 e12) {
            e10 = e12;
            a0Var = a0Var2;
            if (e10.f29562c == a0Var.f36988c) {
                return null;
            }
            throw e10;
        }
    }
}
