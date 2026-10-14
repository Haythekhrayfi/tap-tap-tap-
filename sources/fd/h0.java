package fd;

/* JADX INFO: loaded from: classes3.dex */
public enum h0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29573a;

        static {
            int[] iArr = new int[h0.values().length];
            iArr[h0.DEFAULT.ordinal()] = 1;
            iArr[h0.ATOMIC.ordinal()] = 2;
            iArr[h0.UNDISPATCHED.ordinal()] = 3;
            iArr[h0.LAZY.ordinal()] = 4;
            f29573a = iArr;
        }
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    public final <T> void invoke(uc.l<? super mc.d<? super T>, ? extends Object> lVar, mc.d<? super T> dVar) throws Throwable {
        Object objF;
        int i10 = a.f29573a[ordinal()];
        if (i10 == 1) {
            try {
                mc.d dVarC = nc.b.c(nc.b.a(lVar, dVar));
                jc.i.a aVar = jc.i.f31813c;
                kd.g.a(dVarC, jc.w.f31842a, null);
                return;
            } catch (Throwable th) {
                z.n(dVar, th);
                throw null;
            }
        }
        if (i10 == 2) {
            j0.i(lVar, "<this>");
            j0.i(dVar, "completion");
            mc.d dVarC2 = nc.b.c(nc.b.a(lVar, dVar));
            jc.i.a aVar2 = jc.i.f31813c;
            dVarC2.resumeWith(jc.w.f31842a);
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new jc.g();
            }
            return;
        }
        j0.i(dVar, "completion");
        try {
            mc.f context = dVar.getContext();
            Object objC = kd.b0.c(context, null);
            try {
                vc.f0.c(lVar, 1);
                objF = lVar.invoke(dVar);
                kd.b0.a(context, objC);
                if (objF != nc.a.COROUTINE_SUSPENDED) {
                    jc.i.a aVar3 = jc.i.f31813c;
                    dVar.resumeWith(objF);
                }
            } catch (Throwable th2) {
                kd.b0.a(context, objC);
                throw th2;
            }
        } catch (Throwable th3) {
            jc.i.a aVar4 = jc.i.f31813c;
            objF = h9.d.f(th3);
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R, T> void invoke(uc.p<? super R, ? super mc.d<? super T>, ? extends Object> pVar, R r10, mc.d<? super T> dVar) {
        Object objF;
        int i10 = a.f29573a[ordinal()];
        if (i10 == 1) {
            z.L(pVar, r10, dVar, null, 4);
            return;
        }
        if (i10 == 2) {
            j0.i(pVar, "<this>");
            j0.i(dVar, "completion");
            mc.d dVarC = nc.b.c(nc.b.b(pVar, r10, dVar));
            jc.i.a aVar = jc.i.f31813c;
            dVarC.resumeWith(jc.w.f31842a);
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new jc.g();
            }
            return;
        }
        j0.i(dVar, "completion");
        try {
            mc.f context = dVar.getContext();
            Object objC = kd.b0.c(context, null);
            try {
                vc.f0.c(pVar, 2);
                objF = pVar.invoke(r10, dVar);
                kd.b0.a(context, objC);
                if (objF != nc.a.COROUTINE_SUSPENDED) {
                    jc.i.a aVar2 = jc.i.f31813c;
                    dVar.resumeWith(objF);
                }
            } catch (Throwable th) {
                kd.b0.a(context, objC);
                throw th;
            }
        } catch (Throwable th2) {
            jc.i.a aVar3 = jc.i.f31813c;
            objF = h9.d.f(th2);
        }
    }
}
