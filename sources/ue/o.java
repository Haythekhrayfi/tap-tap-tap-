package ue;

import fd.j0;
import fd.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ mc.d f36424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Exception f36425d;

        public a(mc.d dVar, Exception exc) {
            this.f36424c = dVar;
            this.f36425d = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            mc.d dVarC = nc.b.c(this.f36424c);
            Exception exc = this.f36425d;
            jc.i.a aVar = jc.i.f31813c;
            dVarC.resumeWith(h9.d.f(exc));
        }
    }

    @oc.e(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
    public static final class b extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f36426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f36427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f36428e;

        public b(mc.d dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f36426c = obj;
            this.f36427d |= Integer.MIN_VALUE;
            return o.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(Exception exc, mc.d<?> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f36427d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f36427d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f36426c;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = bVar.f36427d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(obj);
            return jc.w.f31842a;
        }
        h9.d.t(obj);
        bVar.f36428e = exc;
        bVar.f36427d = 1;
        s0.f29619a.c0(bVar.getContext(), new a(bVar, exc));
        j0.i(bVar, "frame");
        return aVar;
    }
}
