package gb;

import fd.g0;
import fd.m0;
import fd.n0;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.util.Billing$queryActivePurchases$2", f = "Billing.kt", l = {484, 484}, m = "invokeSuspend")
public final class n extends oc.h implements uc.p<g0, mc.d<? super List<? extends gb.a>>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f30363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f30364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.e f30365f;

    @oc.e(c = "com.zipoapps.premiumhelper.util.Billing$queryActivePurchases$2$inapp$1", f = "Billing.kt", l = {482}, m = "invokeSuspend")
    public static final class a extends oc.h implements uc.p<g0, mc.d<? super List<? extends gb.a>>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f30366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f30367d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.android.billingclient.api.e f30368e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, com.android.billingclient.api.e eVar, mc.d<? super a> dVar) {
            super(2, dVar);
            this.f30367d = gVar;
            this.f30368e = eVar;
        }

        @Override // oc.a
        public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
            return new a(this.f30367d, this.f30368e, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super List<? extends gb.a>> dVar) {
            return new a(this.f30367d, this.f30368e, dVar).invokeSuspend(jc.w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f30366c;
            if (i10 == 0) {
                h9.d.t(obj);
                g gVar = this.f30367d;
                com.android.billingclient.api.e eVar = this.f30368e;
                this.f30366c = 1;
                KProperty<Object>[] kPropertyArr = g.f30206l;
                obj = gVar.r(eVar, "inapp", this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return obj;
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.util.Billing$queryActivePurchases$2$subs$1", f = "Billing.kt", l = {483}, m = "invokeSuspend")
    public static final class b extends oc.h implements uc.p<g0, mc.d<? super List<? extends gb.a>>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f30369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f30370d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.android.billingclient.api.e f30371e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar, com.android.billingclient.api.e eVar, mc.d<? super b> dVar) {
            super(2, dVar);
            this.f30370d = gVar;
            this.f30371e = eVar;
        }

        @Override // oc.a
        public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
            return new b(this.f30370d, this.f30371e, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super List<? extends gb.a>> dVar) {
            return new b(this.f30370d, this.f30371e, dVar).invokeSuspend(jc.w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f30369c;
            if (i10 == 0) {
                h9.d.t(obj);
                g gVar = this.f30370d;
                com.android.billingclient.api.e eVar = this.f30371e;
                this.f30369c = 1;
                KProperty<Object>[] kPropertyArr = g.f30206l;
                obj = gVar.r(eVar, "subs", this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(g gVar, com.android.billingclient.api.e eVar, mc.d<? super n> dVar) {
        super(2, dVar);
        this.f30364e = gVar;
        this.f30365f = eVar;
    }

    @Override // oc.a
    public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
        n nVar = new n(this.f30364e, this.f30365f, dVar);
        nVar.f30363d = obj;
        return nVar;
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super List<? extends gb.a>> dVar) {
        n nVar = new n(this.f30364e, this.f30365f, dVar);
        nVar.f30363d = g0Var;
        return nVar.invokeSuspend(jc.w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        m0 m0VarE;
        Collection collection;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f30362c;
        if (i10 != 0) {
            if (i10 == 1) {
                m0VarE = (m0) this.f30363d;
                h9.d.t(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                collection = (Collection) this.f30363d;
                h9.d.t(obj);
            }
            return kc.t.z(collection, (Iterable) obj);
        }
        h9.d.t(obj);
        g0 g0Var = (g0) this.f30363d;
        m0 m0VarE2 = y8.c0.e(g0Var, null, null, new a(this.f30364e, this.f30365f, null), 3, null);
        m0VarE = y8.c0.e(g0Var, null, null, new b(this.f30364e, this.f30365f, null), 3, null);
        this.f30363d = m0VarE;
        this.f30362c = 1;
        obj = ((n0) m0VarE2).F(this);
        if (obj == aVar) {
            return aVar;
        }
        Collection collection2 = (Collection) obj;
        this.f30363d = collection2;
        this.f30362c = 2;
        Object objT = m0VarE.T(this);
        if (objT == aVar) {
            return aVar;
        }
        collection = collection2;
        obj = objT;
        return kc.t.z(collection, (Iterable) obj);
    }
}
