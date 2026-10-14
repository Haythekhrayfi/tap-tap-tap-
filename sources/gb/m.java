package gb;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import ch.qos.logback.core.CoreConstants;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.applovin.sdk.AppLovinEventParameters;
import com.zipoapps.premiumhelper.AcknowledgePurchaseWorker;
import fd.g0;
import fd.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.util.Billing$launchDebugBillingFlow$1$1", f = "Billing.kt", l = {473}, m = "invokeSuspend")
public final class m extends oc.h implements uc.p<g0, mc.d<? super jc.w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f30360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ma.e f30361e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g gVar, ma.e eVar, mc.d<? super m> dVar) {
        super(2, dVar);
        this.f30360d = gVar;
        this.f30361e = eVar;
    }

    @Override // oc.a
    public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
        return new m(this.f30360d, this.f30361e, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super jc.w> dVar) {
        return new m(this.f30360d, this.f30361e, dVar).invokeSuspend(jc.w.f31842a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0161  */
    @Override // oc.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z10;
        PackageInfo packageInfo;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f30359c;
        if (i10 == 0) {
            h9.d.t(obj);
            Application application = this.f30360d.f30207a;
            String str = this.f30361e.f33402a;
            j0.i(application, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
            List listF = kc.l.f(new Purchase("{\n\"orderId\":\"DEBUG.OFFER." + UUID.randomUUID() + "\",\n\"packageName\":\"" + application.getPackageName() + "\",\n\"productId\":\"" + str + "\",\n\"purchaseTime\":" + System.currentTimeMillis() + ",\n\"purchaseState\":0,\n\"purchaseToken\":\"debugtoken." + UUID.randomUUID() + "\",\n\"obfuscatedAccountId\":\"debugaccount." + UUID.randomUUID() + "\",\n\"acknowledged\":true,\n\"autoRenewing\":true\n}", UUID.randomUUID().toString()));
            g gVar = this.f30360d;
            ArrayList arrayList = new ArrayList(kc.m.j(listF, 10));
            Iterator it = listF.iterator();
            while (true) {
                SkuDetails skuDetails = null;
                if (!it.hasNext()) {
                    break;
                }
                Purchase purchase = (Purchase) it.next();
                try {
                    String str2 = purchase.b().get(0);
                    j0.h(str2, "it.skus[0]");
                    skuDetails = new SkuDetails("{\n\"title\":\"Debug offer\",\n\"price\":\"\",\n\"type\":\"subs\",\n\"subscriptionPeriod\":\"P1Y\",\n\"freeTrialPeriod\":\"P1W\",\n\"description\":\"debug-offer\",\n\"price_amount_micros\":890000,\n\"price_currency_code\":\"USD\",\n\"productId\":\"" + str2 + "\"\n}");
                } catch (Exception unused) {
                }
                arrayList.add(new a(purchase, skuDetails, gVar.n(purchase, skuDetails)));
            }
            g gVar2 = this.f30360d;
            Application application2 = gVar2.f30207a;
            String str3 = (String) gVar2.f30208b.h(oa.b.M);
            j0.i(application2, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(str3, "packageNames");
            if (!(str3.length() == 0)) {
                List listR = ed.u.R(str3, new String[]{","}, false, 0, 6);
                if (!listR.isEmpty()) {
                    Iterator it2 = listR.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z10 = false;
                            break;
                        }
                        String str4 = (String) it2.next();
                        j0.i(str4, "packageName");
                        try {
                            packageInfo = application2.getPackageManager().getPackageInfo(ed.u.Y(str4).toString(), 0);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            packageInfo = null;
                        }
                        if (packageInfo != null) {
                            z10 = true;
                            break;
                        }
                    }
                } else {
                    z10 = false;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
            this.f30360d.f30209c.p((arrayList.isEmpty() ^ true) || z10);
            g gVar3 = this.f30360d;
            gVar3.f30213g.setValue(Boolean.valueOf(gVar3.f30209c.j()));
            g.f(this.f30360d, arrayList);
            if (!arrayList.isEmpty()) {
                ma.h.f33410y.a().f33426o.scheduleRegister(true);
                AcknowledgePurchaseWorker.f28240a.a(this.f30360d.f30207a);
            }
            id.m<z> mVar = this.f30360d.f30215i;
            com.android.billingclient.api.n nVar = new com.android.billingclient.api.n();
            nVar.f3848a = 0;
            nVar.f3849b = "";
            z zVar = new z(nVar, arrayList);
            this.f30359c = 1;
            if (mVar.emit(zVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(obj);
        }
        return jc.w.f31842a;
    }
}
