package gb;

import com.android.billingclient.api.Purchase;
import fd.j0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.util.Billing$handlePurchaseUpdate$2$activePurchases$1$1", f = "Billing.kt", l = {251}, m = "invokeSuspend")
public final class i extends oc.h implements uc.l<mc.d<? super com.android.billingclient.api.n>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f30342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.e f30343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Purchase f30344f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, com.android.billingclient.api.e eVar, Purchase purchase, mc.d<? super i> dVar) {
        super(1, dVar);
        this.f30342d = gVar;
        this.f30343e = eVar;
        this.f30344f = purchase;
    }

    @Override // oc.a
    public final mc.d<jc.w> create(mc.d<?> dVar) {
        return new i(this.f30342d, this.f30343e, this.f30344f, dVar);
    }

    @Override // uc.l
    public Object invoke(mc.d<? super com.android.billingclient.api.n> dVar) {
        return new i(this.f30342d, this.f30343e, this.f30344f, dVar).invokeSuspend(jc.w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f30341c;
        if (i10 == 0) {
            h9.d.t(obj);
            g gVar = this.f30342d;
            com.android.billingclient.api.e eVar = this.f30343e;
            String strA = this.f30344f.a();
            j0.h(strA, "it.purchaseToken");
            this.f30341c = 1;
            KProperty<Object>[] kPropertyArr = g.f30206l;
            obj = gVar.h(eVar, strA, this);
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
