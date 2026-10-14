package hd;

import fd.j1;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    @oc.e(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {153}, m = "awaitClose")
    public static final class a extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f31107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f31108d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f31109e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f31110f;

        public a(mc.d<? super a> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f31109e = obj;
            this.f31110f |= Integer.MIN_VALUE;
            return n.a(null, null, this);
        }
    }

    public static final class b extends vc.l implements uc.l<Throwable, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fd.i<jc.w> f31111c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(fd.i<? super jc.w> iVar) {
            super(1);
            this.f31111c = iVar;
        }

        @Override // uc.l
        public jc.w invoke(Throwable th) {
            fd.i<jc.w> iVar = this.f31111c;
            jc.i.a aVar = jc.i.f31813c;
            jc.w wVar = jc.w.f31842a;
            iVar.resumeWith(wVar);
            return wVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(p<?> pVar, uc.a<jc.w> aVar, mc.d<? super jc.w> dVar) {
        a aVar2;
        if (dVar instanceof a) {
            aVar2 = (a) dVar;
            int i10 = aVar2.f31110f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.f31110f = i10 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(dVar);
            }
        } else {
            aVar2 = new a(dVar);
        }
        Object obj = aVar2.f31109e;
        nc.a aVar3 = nc.a.COROUTINE_SUSPENDED;
        int i11 = aVar2.f31110f;
        try {
            if (i11 == 0) {
                h9.d.t(obj);
                mc.f context = aVar2.getContext();
                int i12 = j1.f29579x1;
                if (!(context.b(j1.b.f29580c) == pVar)) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
                }
                aVar2.f31107c = pVar;
                aVar2.f31108d = aVar;
                aVar2.f31110f = 1;
                fd.k kVar = new fd.k(nc.b.c(aVar2), 1);
                kVar.u();
                pVar.k(new b(kVar));
                if (kVar.r() == aVar3) {
                    return aVar3;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (uc.a) aVar2.f31108d;
                h9.d.t(obj);
            }
            aVar.invoke();
            return jc.w.f31842a;
        } catch (Throwable th) {
            aVar.invoke();
            throw th;
        }
    }
}
