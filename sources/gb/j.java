package gb;

import com.android.billingclient.api.Purchase;
import fd.j0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends vc.l implements uc.l<com.android.billingclient.api.n, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f30345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Purchase f30346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, Purchase purchase) {
        super(1);
        this.f30345c = gVar;
        this.f30346d = purchase;
    }

    @Override // uc.l
    public jc.w invoke(com.android.billingclient.api.n nVar) {
        com.android.billingclient.api.n nVar2 = nVar;
        j0.i(nVar2, "response");
        if (y8.c0.v(nVar2)) {
            g gVar = this.f30345c;
            KProperty<Object>[] kPropertyArr = g.f30206l;
            ta.d dVarL = gVar.l();
            StringBuilder sbA = defpackage.a.a("Auto Acknowledge ");
            sbA.append(this.f30346d);
            sbA.append(" result: ");
            sbA.append(nVar2.f3848a);
            dVarL.a(sbA.toString(), new Object[0]);
        } else {
            g gVar2 = this.f30345c;
            KProperty<Object>[] kPropertyArr2 = g.f30206l;
            ta.d dVarL2 = gVar2.l();
            StringBuilder sbA2 = defpackage.a.a("Auto Acknowledge ");
            sbA2.append(this.f30346d);
            sbA2.append(" failed ");
            sbA2.append(nVar2.f3848a);
            dVarL2.b(sbA2.toString(), new Object[0]);
        }
        return jc.w.f31842a;
    }
}
