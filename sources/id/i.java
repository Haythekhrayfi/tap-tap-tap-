package id;

import vc.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements e<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uc.p f31573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f31574d;

    @oc.e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {142}, m = "emit")
    public static final class a extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f31575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f31576d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f31577e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f31579g;

        public a(mc.d dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f31576d = obj;
            this.f31577e |= Integer.MIN_VALUE;
            return i.this.emit(null, this);
        }
    }

    public i(uc.p pVar, a0 a0Var) {
        this.f31573c = pVar;
        this.f31574d = a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // id.e
    public Object emit(Object obj, mc.d<? super jc.w> dVar) {
        a aVar;
        i iVar;
        T t10;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f31577e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f31577e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objInvoke = aVar.f31576d;
        nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
        int i11 = aVar.f31577e;
        boolean z10 = true;
        if (i11 == 0) {
            h9.d.t(objInvoke);
            uc.p pVar = this.f31573c;
            aVar.f31575c = this;
            aVar.f31579g = obj;
            aVar.f31577e = 1;
            objInvoke = pVar.invoke(obj, aVar);
            if (objInvoke == aVar2) {
                return aVar2;
            }
            iVar = this;
            t10 = obj;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = aVar.f31579g;
            iVar = (i) aVar.f31575c;
            h9.d.t(objInvoke);
            t10 = obj2;
        }
        if (((Boolean) objInvoke).booleanValue()) {
            iVar.f31574d.f36988c = t10;
            z10 = false;
        }
        if (z10) {
            return jc.w.f31842a;
        }
        throw new jd.a(iVar);
    }
}
