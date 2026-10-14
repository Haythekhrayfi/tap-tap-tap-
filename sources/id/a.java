package id;

/* JADX INFO: loaded from: classes3.dex */
public final class a<T> extends b<T> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uc.p<hd.p<? super T>, mc.d<? super jc.w>, Object> f31548g;

    /* JADX INFO: renamed from: id.a$a, reason: collision with other inner class name */
    @oc.e(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {336}, m = "collectTo")
    public static final class C0314a extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f31549c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f31550d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a<T> f31551e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f31552f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0314a(a<T> aVar, mc.d<? super C0314a> dVar) {
            super(dVar);
            this.f31551e = aVar;
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f31550d = obj;
            this.f31552f |= Integer.MIN_VALUE;
            return this.f31551e.c(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(uc.p<? super hd.p<? super T>, ? super mc.d<? super jc.w>, ? extends Object> pVar, mc.f fVar, int i10, hd.e eVar) {
        super(pVar, fVar, i10, eVar);
        this.f31548g = pVar;
    }

    public /* synthetic */ a(uc.p pVar, mc.f fVar, int i10, hd.e eVar, int i11, vc.g gVar) {
        this(pVar, (i11 & 2) != 0 ? mc.h.f33539c : fVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? hd.e.SUSPEND : eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // id.b, jd.g
    public Object c(hd.p<? super T> pVar, mc.d<? super jc.w> dVar) {
        C0314a c0314a;
        if (dVar instanceof C0314a) {
            c0314a = (C0314a) dVar;
            int i10 = c0314a.f31552f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0314a.f31552f = i10 - Integer.MIN_VALUE;
            } else {
                c0314a = new C0314a(this, dVar);
            }
        } else {
            c0314a = new C0314a(this, dVar);
        }
        Object obj = c0314a.f31550d;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = c0314a.f31552f;
        if (i11 == 0) {
            h9.d.t(obj);
            c0314a.f31549c = pVar;
            c0314a.f31552f = 1;
            Object objInvoke = this.f31553f.invoke(pVar, c0314a);
            if (objInvoke != aVar) {
                objInvoke = jc.w.f31842a;
            }
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = (hd.p) c0314a.f31549c;
            h9.d.t(obj);
        }
        if (pVar.z()) {
            return jc.w.f31842a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // id.b, jd.g
    public jd.g<T> d(mc.f fVar, int i10, hd.e eVar) {
        return new a(this.f31548g, fVar, i10, eVar);
    }
}
