package id;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes3.dex */
public final class l<T> implements d<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f31589c;

    public static final class a<T> implements e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f31590c;

        /* JADX INFO: renamed from: id.l$a$a, reason: collision with other inner class name */
        @oc.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223}, m = "emit")
        public static final class C0316a extends oc.c {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f31591c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f31592d;

            public C0316a(mc.d dVar) {
                super(dVar);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                this.f31591c = obj;
                this.f31592d |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(e eVar) {
            this.f31590c = eVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // id.e
        public final Object emit(T t10, mc.d<? super jc.w> dVar) {
            C0316a c0316a;
            if (dVar instanceof C0316a) {
                c0316a = (C0316a) dVar;
                int i10 = c0316a.f31592d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0316a.f31592d = i10 - Integer.MIN_VALUE;
                } else {
                    c0316a = new C0316a(dVar);
                }
            } else {
                c0316a = new C0316a(dVar);
            }
            Object obj = c0316a.f31591c;
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i11 = c0316a.f31592d;
            if (i11 == 0) {
                h9.d.t(obj);
                e eVar = this.f31590c;
                if (t10 != null) {
                    c0316a.f31592d = 1;
                    if (eVar.emit(t10, c0316a) == aVar) {
                        return aVar;
                    }
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

    public l(d dVar) {
        this.f31589c = dVar;
    }

    @Override // id.d
    public Object a(e eVar, mc.d dVar) {
        Object objA = this.f31589c.a(new a(eVar), dVar);
        return objA == nc.a.COROUTINE_SUSPENDED ? objA : jc.w.f31842a;
    }
}
