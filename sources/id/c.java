package id;

import vc.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> implements d<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d<T> f31554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uc.l<T, Object> f31555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uc.p<Object, Object, Boolean> f31556e;

    public static final class a<T> implements e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c<T> f31557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a0<Object> f31558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e<T> f31559e;

        /* JADX INFO: renamed from: id.c$a$a, reason: collision with other inner class name */
        @oc.e(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {81}, m = "emit")
        public static final class C0315a extends oc.c {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f31560c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a<T> f31561d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f31562e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0315a(a<? super T> aVar, mc.d<? super C0315a> dVar) {
                super(dVar);
                this.f31561d = aVar;
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                this.f31560c = obj;
                this.f31562e |= Integer.MIN_VALUE;
                return this.f31561d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(c<T> cVar, a0<Object> a0Var, e<? super T> eVar) {
            this.f31557c = cVar;
            this.f31558d = a0Var;
            this.f31559e = eVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // id.e
        public final Object emit(T t10, mc.d<? super jc.w> dVar) {
            C0315a c0315a;
            if (dVar instanceof C0315a) {
                c0315a = (C0315a) dVar;
                int i10 = c0315a.f31562e;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0315a.f31562e = i10 - Integer.MIN_VALUE;
                } else {
                    c0315a = new C0315a(this, dVar);
                }
            } else {
                c0315a = new C0315a(this, dVar);
            }
            Object obj = c0315a.f31560c;
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i11 = c0315a.f31562e;
            if (i11 == 0) {
                h9.d.t(obj);
                T t11 = (T) this.f31557c.f31555d.invoke(t10);
                Object obj2 = this.f31558d.f36988c;
                if (obj2 != jd.n.f31867a && this.f31557c.f31556e.invoke(obj2, t11).booleanValue()) {
                    return jc.w.f31842a;
                }
                this.f31558d.f36988c = t11;
                e<T> eVar = this.f31559e;
                c0315a.f31562e = 1;
                if (eVar.emit(t10, c0315a) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return jc.w.f31842a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(d<? extends T> dVar, uc.l<? super T, ? extends Object> lVar, uc.p<Object, Object, Boolean> pVar) {
        this.f31554c = dVar;
        this.f31555d = lVar;
        this.f31556e = pVar;
    }

    @Override // id.d
    public Object a(e<? super T> eVar, mc.d<? super jc.w> dVar) {
        a0 a0Var = new a0();
        a0Var.f36988c = (T) jd.n.f31867a;
        Object objA = this.f31554c.a(new a(this, a0Var, eVar), dVar);
        return objA == nc.a.COROUTINE_SUSPENDED ? objA : jc.w.f31842a;
    }
}
