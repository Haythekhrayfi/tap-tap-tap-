package jd;

import fd.z;
import jc.w;
import kd.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class t<T> implements id.e<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mc.f f31880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f31881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uc.p<T, mc.d<? super w>, Object> f31882e;

    @oc.e(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
    public static final class a extends oc.h implements uc.p<T, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f31883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f31884d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ id.e<T> f31885e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(id.e<? super T> eVar, mc.d<? super a> dVar) {
            super(2, dVar);
            this.f31885e = eVar;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            a aVar = new a(this.f31885e, dVar);
            aVar.f31884d = obj;
            return aVar;
        }

        @Override // uc.p
        public Object invoke(Object obj, mc.d<? super w> dVar) {
            a aVar = new a(this.f31885e, dVar);
            aVar.f31884d = obj;
            return aVar.invokeSuspend(w.f31842a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type mc.d to jd.t$a for r3v1 'this'  mc.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // oc.a
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                nc.a r0 = nc.a.COROUTINE_SUSPENDED
                int r1 = r3.f31883c
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                h9.d.t(r4)
                goto L25
            Ld:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L15:
                h9.d.t(r4)
                java.lang.Object r4 = r3.f31884d
                id.e<T> r1 = r3.f31885e
                r3.f31883c = r2
                java.lang.Object r4 = r1.emit(r4, r3)
                if (r4 != r0) goto L25
                return r0
            L25:
                jc.w r4 = jc.w.f31842a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: jd.t.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public t(id.e<? super T> eVar, mc.f fVar) {
        this.f31880c = fVar;
        this.f31881d = b0.b(fVar);
        this.f31882e = new a(eVar, null);
    }

    @Override // id.e
    public Object emit(T t10, mc.d<? super w> dVar) {
        Object objS = z.S(this.f31880c, t10, this.f31881d, this.f31882e, dVar);
        return objS == nc.a.COROUTINE_SUSPENDED ? objS : w.f31842a;
    }
}
