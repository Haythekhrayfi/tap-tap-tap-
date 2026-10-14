package jd;

import fd.j0;
import fd.z;
import jc.w;

/* JADX WARN: Unexpected interfaces in signature: [oc.d] */
/* JADX INFO: loaded from: classes3.dex */
public final class o<T> extends oc.c implements id.e<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final id.e<T> f31868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mc.f f31869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f31870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public mc.f f31871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public mc.d<? super w> f31872g;

    public static final class a extends vc.l implements uc.p<Integer, mc.f.a, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f31873c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public Integer invoke(Integer num, mc.f.a aVar) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(id.e<? super T> eVar, mc.f fVar) {
        super(m.f31866c, mc.h.f33539c);
        this.f31868c = eVar;
        this.f31869d = fVar;
        this.f31870e = ((Number) fVar.Y(0, a.f31873c)).intValue();
    }

    public final Object e(mc.d<? super w> dVar, T t10) {
        mc.f context = dVar.getContext();
        z.p(context);
        mc.f fVar = this.f31871f;
        if (fVar != context) {
            if (fVar instanceof k) {
                StringBuilder sbA = defpackage.a.a("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                sbA.append(((k) fVar).f31864c);
                sbA.append(", but then emission attempt of value '");
                sbA.append(t10);
                sbA.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                throw new IllegalStateException(ed.j.c(sbA.toString()).toString());
            }
            if (((Number) context.Y(0, new q(this))).intValue() != this.f31870e) {
                StringBuilder sbA2 = defpackage.a.a("Flow invariant is violated:\n\t\tFlow was collected in ");
                sbA2.append(this.f31869d);
                sbA2.append(",\n\t\tbut emission happened in ");
                sbA2.append(context);
                sbA2.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                throw new IllegalStateException(sbA2.toString().toString());
            }
            this.f31871f = context;
        }
        this.f31872g = dVar;
        Object objB = p.f31874a.b(this.f31868c, t10, this);
        if (!j0.d(objB, nc.a.COROUTINE_SUSPENDED)) {
            this.f31872g = null;
        }
        return objB;
    }

    @Override // id.e
    public Object emit(T t10, mc.d<? super w> dVar) {
        try {
            Object objE = e(dVar, t10);
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            if (objE == aVar) {
                j0.i(dVar, "frame");
            }
            return objE == aVar ? objE : w.f31842a;
        } catch (Throwable th) {
            this.f31871f = new k(th, dVar.getContext());
            throw th;
        }
    }

    @Override // oc.a, oc.d
    public oc.d getCallerFrame() {
        mc.d<? super w> dVar = this.f31872g;
        if (dVar instanceof oc.d) {
            return (oc.d) dVar;
        }
        return null;
    }

    @Override // oc.c, mc.d
    public mc.f getContext() {
        mc.f fVar = this.f31871f;
        return fVar == null ? mc.h.f33539c : fVar;
    }

    @Override // oc.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // oc.a
    public Object invokeSuspend(Object obj) {
        Throwable thA = jc.i.a(obj);
        if (thA != null) {
            this.f31871f = new k(thA, getContext());
        }
        mc.d<? super w> dVar = this.f31872g;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return nc.a.COROUTINE_SUSPENDED;
    }

    @Override // oc.c, oc.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
