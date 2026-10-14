package ma;

import android.content.SharedPreferences;
import fd.g0;
import fd.j0;
import gb.x;
import jc.w;
import kotlin.reflect.KProperty;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.Analytics$checkHistoryPurchases$1", f = "Analytics.kt", l = {299}, m = "invokeSuspend")
public final class a extends oc.h implements uc.p<g0, mc.d<? super w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.a f33393d;

    /* JADX INFO: renamed from: ma.a$a, reason: collision with other inner class name */
    public static final class C0360a extends vc.l implements uc.l<Boolean, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.zipoapps.premiumhelper.a f33394c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0360a(com.zipoapps.premiumhelper.a aVar) {
            super(1);
            this.f33394c = aVar;
        }

        @Override // uc.l
        public w invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            SharedPreferences.Editor editorEdit = this.f33394c.f28255c.f33405a.edit();
            editorEdit.putBoolean("has_history_purchases", zBooleanValue);
            editorEdit.apply();
            return w.f31842a;
        }
    }

    public static final class b extends vc.l implements uc.l<x.b, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.zipoapps.premiumhelper.a f33395c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.zipoapps.premiumhelper.a aVar) {
            super(1);
            this.f33395c = aVar;
        }

        @Override // uc.l
        public w invoke(x.b bVar) {
            x.b bVar2 = bVar;
            j0.i(bVar2, "it");
            com.zipoapps.premiumhelper.a aVar = this.f33395c;
            KProperty<Object>[] kPropertyArr = com.zipoapps.premiumhelper.a.f28252m;
            aVar.d().k(6, bVar2.f30416b, "Failed to update history purchases", new Object[0]);
            return w.f31842a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.zipoapps.premiumhelper.a aVar, mc.d<? super a> dVar) {
        super(2, dVar);
        this.f33393d = aVar;
    }

    @Override // oc.a
    public final mc.d<w> create(Object obj, mc.d<?> dVar) {
        return new a(this.f33393d, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
        return new a(this.f33393d, dVar).invokeSuspend(w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f33392c;
        if (i10 == 0) {
            h9.d.t(obj);
            h hVarA = h.f33410y.a();
            this.f33392c = 1;
            obj = hVarA.f33427p.o(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(obj);
        }
        x xVar = (x) obj;
        c0.D(xVar, new C0360a(this.f33393d));
        c0.C(xVar, new b(this.f33393d));
        return w.f31842a;
    }
}
