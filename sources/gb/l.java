package gb;

import android.app.Activity;
import com.android.billingclient.api.SkuDetails;
import fd.g0;
import fd.j0;
import java.util.ArrayList;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.util.Billing$launchBillingFlow$1", f = "Billing.kt", l = {407, 410, 414, 426}, m = "invokeSuspend")
public final class l extends oc.h implements uc.p<g0, mc.d<? super jc.w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f30350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f30351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f30352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f30353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f30354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f30355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ma.e f30356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f30357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Activity f30358k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ma.e eVar, g gVar, Activity activity, mc.d<? super l> dVar) {
        super(2, dVar);
        this.f30356i = eVar;
        this.f30357j = gVar;
        this.f30358k = activity;
    }

    @Override // oc.a
    public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
        return new l(this.f30356i, this.f30357j, this.f30358k, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super jc.w> dVar) {
        return new l(this.f30356i, this.f30357j, this.f30358k, dVar).invokeSuspend(jc.w.f31842a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0097 A[Catch: Exception -> 0x0100, TryCatch #0 {Exception -> 0x0100, blocks: (B:12:0x0035, B:39:0x00d6, B:15:0x004a, B:34:0x00ae, B:35:0x00b0, B:16:0x004e, B:29:0x008a, B:31:0x0097, B:19:0x0055, B:21:0x0060, B:23:0x006a, B:25:0x0072, B:26:0x007d), top: B:50:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        ma.e eVar;
        g gVar;
        Activity activity;
        com.android.billingclient.api.e eVar2;
        SkuDetails skuDetails;
        com.android.billingclient.api.m.a aVar;
        com.android.billingclient.api.e eVar3;
        com.android.billingclient.api.m.a aVar2;
        nc.a aVar3 = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f30355h;
        try {
            if (i10 == 0) {
                h9.d.t(obj);
                ma.e eVar4 = this.f30356i;
                j0.i(eVar4, "<this>");
                SkuDetails skuDetails2 = eVar4.f33404c;
                if (j0.d(skuDetails2 != null ? skuDetails2.f3755b.optString("description") : null, "debug-offer")) {
                    g.d(this.f30357j, this.f30358k, this.f30356i);
                } else {
                    na.a aVar4 = this.f30357j.f30212f;
                    this.f30355h = 1;
                    obj = aVar4.a(this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    eVar = this.f30356i;
                    gVar = this.f30357j;
                    activity = this.f30358k;
                    eVar2 = (com.android.billingclient.api.e) obj;
                    skuDetails = eVar.f33404c;
                    if (skuDetails == null) {
                        String str = eVar.f33402a;
                        String str2 = eVar.f33403b;
                        this.f30350c = eVar;
                        this.f30351d = gVar;
                        this.f30352e = activity;
                        this.f30353f = eVar2;
                        this.f30355h = 2;
                        KProperty<Object>[] kPropertyArr = g.f30206l;
                        obj = gVar.s(eVar2, str, str2, this);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                        skuDetails = (SkuDetails) obj;
                    }
                    aVar = new com.android.billingclient.api.m.a(null);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(skuDetails);
                    aVar.f3837b = arrayList;
                    e eVar5 = gVar.f30210d;
                    this.f30350c = eVar;
                    this.f30351d = gVar;
                    this.f30352e = activity;
                    this.f30353f = eVar2;
                    this.f30354g = aVar;
                    this.f30355h = 3;
                    obj = eVar5.a(this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    eVar3 = eVar2;
                    aVar2 = aVar;
                    aVar2.f3836a = (String) obj;
                    aVar2.f3838c = true;
                    com.android.billingclient.api.m mVarA = aVar2.a();
                    KProperty<Object>[] kPropertyArr2 = g.f30206l;
                    gVar.l().g("Launching billing flow for offer: " + eVar, new Object[0]);
                    eVar3.e(activity, mVarA);
                }
            } else if (i10 == 1) {
                h9.d.t(obj);
                eVar = this.f30356i;
                gVar = this.f30357j;
                activity = this.f30358k;
                eVar2 = (com.android.billingclient.api.e) obj;
                skuDetails = eVar.f33404c;
                if (skuDetails == null) {
                    String str3 = eVar.f33402a;
                    String str4 = eVar.f33403b;
                    this.f30350c = eVar;
                    this.f30351d = gVar;
                    this.f30352e = activity;
                    this.f30353f = eVar2;
                    this.f30355h = 2;
                    KProperty<Object>[] kPropertyArr3 = g.f30206l;
                    obj = gVar.s(eVar2, str3, str4, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    skuDetails = (SkuDetails) obj;
                }
                aVar = new com.android.billingclient.api.m.a(null);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(skuDetails);
                aVar.f3837b = arrayList2;
                e eVar6 = gVar.f30210d;
                this.f30350c = eVar;
                this.f30351d = gVar;
                this.f30352e = activity;
                this.f30353f = eVar2;
                this.f30354g = aVar;
                this.f30355h = 3;
                obj = eVar6.a(this);
                if (obj == aVar3) {
                    return aVar3;
                }
                eVar3 = eVar2;
                aVar2 = aVar;
                aVar2.f3836a = (String) obj;
                aVar2.f3838c = true;
                com.android.billingclient.api.m mVarA2 = aVar2.a();
                KProperty<Object>[] kPropertyArr4 = g.f30206l;
                gVar.l().g("Launching billing flow for offer: " + eVar, new Object[0]);
                eVar3.e(activity, mVarA2);
            } else if (i10 == 2) {
                eVar2 = (com.android.billingclient.api.e) this.f30353f;
                activity = (Activity) this.f30352e;
                gVar = (g) this.f30351d;
                eVar = (ma.e) this.f30350c;
                h9.d.t(obj);
                skuDetails = (SkuDetails) obj;
                aVar = new com.android.billingclient.api.m.a(null);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(skuDetails);
                aVar.f3837b = arrayList3;
                e eVar7 = gVar.f30210d;
                this.f30350c = eVar;
                this.f30351d = gVar;
                this.f30352e = activity;
                this.f30353f = eVar2;
                this.f30354g = aVar;
                this.f30355h = 3;
                obj = eVar7.a(this);
                if (obj == aVar3) {
                    return aVar3;
                }
                eVar3 = eVar2;
                aVar2 = aVar;
                aVar2.f3836a = (String) obj;
                aVar2.f3838c = true;
                com.android.billingclient.api.m mVarA3 = aVar2.a();
                KProperty<Object>[] kPropertyArr5 = g.f30206l;
                gVar.l().g("Launching billing flow for offer: " + eVar, new Object[0]);
                eVar3.e(activity, mVarA3);
            } else if (i10 == 3) {
                aVar2 = (com.android.billingclient.api.m.a) this.f30354g;
                eVar3 = (com.android.billingclient.api.e) this.f30353f;
                activity = (Activity) this.f30352e;
                gVar = (g) this.f30351d;
                eVar = (ma.e) this.f30350c;
                h9.d.t(obj);
                aVar2.f3836a = (String) obj;
                aVar2.f3838c = true;
                com.android.billingclient.api.m mVarA4 = aVar2.a();
                KProperty<Object>[] kPropertyArr6 = g.f30206l;
                gVar.l().g("Launching billing flow for offer: " + eVar, new Object[0]);
                eVar3.e(activity, mVarA4);
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
        } catch (Exception e10) {
            g gVar2 = this.f30357j;
            KProperty<Object>[] kPropertyArr7 = g.f30206l;
            gVar2.l().k(6, e10, null, new Object[0]);
            id.m<z> mVar = this.f30357j.f30215i;
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            com.android.billingclient.api.n nVar = new com.android.billingclient.api.n();
            nVar.f3848a = 5;
            nVar.f3849b = message;
            z zVar = new z(nVar, null, 2, null);
            this.f30350c = null;
            this.f30351d = null;
            this.f30352e = null;
            this.f30353f = null;
            this.f30354g = null;
            this.f30355h = 4;
            if (mVar.emit(zVar, this) == aVar3) {
                return aVar3;
            }
        }
        return jc.w.f31842a;
    }
}
