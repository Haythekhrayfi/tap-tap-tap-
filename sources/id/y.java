package id;

/* JADX INFO: loaded from: classes3.dex */
public final class y<T> implements e<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e<T> f31633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uc.p<e<? super T>, mc.d<? super jc.w>, Object> f31634d;

    @oc.e(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
    public static final class a extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f31635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f31636d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f31637e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ y<T> f31638f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f31639g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y<T> yVar, mc.d<? super a> dVar) {
            super(dVar);
            this.f31638f = yVar;
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f31637e = obj;
            this.f31639g |= Integer.MIN_VALUE;
            return this.f31638f.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(e<? super T> eVar, uc.p<? super e<? super T>, ? super mc.d<? super jc.w>, ? extends Object> pVar) {
        this.f31633c = eVar;
        this.f31634d = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [jd.o] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public final Object a(mc.d<? super jc.w> dVar) {
        a aVar;
        jd.o oVar;
        y<T> yVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f31639g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f31639g = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f31637e;
        nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
        ?? r10 = aVar.f31639g;
        try {
            if (r10 != 0) {
                if (r10 == 1) {
                    oVar = (jd.o) aVar.f31636d;
                    yVar = (y) aVar.f31635c;
                    h9.d.t(obj);
                } else {
                    if (r10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h9.d.t(obj);
                }
                return jc.w.f31842a;
            }
            h9.d.t(obj);
            oVar = new jd.o(this.f31633c, aVar.getContext());
            uc.p<e<? super T>, mc.d<? super jc.w>, Object> pVar = this.f31634d;
            aVar.f31635c = this;
            aVar.f31636d = oVar;
            aVar.f31639g = 1;
            if (pVar.invoke(oVar, aVar) == aVar2) {
                return aVar2;
            }
            yVar = this;
            oVar.releaseIntercepted();
            e<T> eVar = yVar.f31633c;
            r10 = eVar instanceof y;
            if (r10 == 0) {
                return jc.w.f31842a;
            }
            aVar.f31635c = null;
            aVar.f31636d = null;
            aVar.f31639g = 2;
            if (((y) eVar).a(aVar) == aVar2) {
                return aVar2;
            }
            return jc.w.f31842a;
        } catch (Throwable th) {
            r10.releaseIntercepted();
            throw th;
        }
    }

    @Override // id.e
    public Object emit(T t10, mc.d<? super jc.w> dVar) {
        return this.f31633c.emit(t10, dVar);
    }
}
