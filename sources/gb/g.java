package gb;

import android.app.Activity;
import android.app.Application;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.SkuDetails;
import com.google.gson.Gson;
import com.zipoapps.premiumhelper.AcknowledgePurchaseWorker;
import com.zipoapps.premiumhelper.toto.TotoFeature;
import com.zipoapps.premiumhelper.util.ActivePurchaseInfo;
import fd.c1;
import fd.g0;
import fd.j0;
import fd.m0;
import fd.n0;
import fd.s0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.KProperty;
import okhttp3.internal.http.StatusLine;
import y6.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements com.android.billingclient.api.w {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f30206l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f30207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oa.b f30208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ma.f f30209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gb.e f30210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ta.e f30211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final na.a f30212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final id.n<Boolean> f30213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final id.u<Boolean> f30214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final id.m<z> f30215i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final id.q<z> f30216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Hashtable<String, ma.e> f30217k;

    @oc.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {115, 117, 123}, m = "acknowledgeAll$premium_helper_4_4_2_alpha5_regularRelease")
    public static final class a extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f30218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f30219d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f30220e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f30221f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f30222g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f30224i;

        public a(mc.d<? super a> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f30222g = obj;
            this.f30224i |= Integer.MIN_VALUE;
            return g.this.g(null, this);
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {137}, m = "acknowledgePurchase")
    public static final class b extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f30225c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f30226d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f30228f;

        public b(mc.d<? super b> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f30226d = obj;
            this.f30228f |= Integer.MIN_VALUE;
            g gVar = g.this;
            KProperty<Object>[] kPropertyArr = g.f30206l;
            return gVar.h(null, null, this);
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {352, 354, 357}, m = "consumeAll")
    public static final class c extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f30229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f30230d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f30231e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f30232f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f30234h;

        public c(mc.d<? super c> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f30232f = obj;
            this.f30234h |= Integer.MIN_VALUE;
            return g.this.i(this);
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {367, 369}, m = "consumePurchasesWithType")
    public static final class d extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f30235c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f30236d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f30237e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f30238f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f30239g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f30240h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f30241i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f30243k;

        public d(mc.d<? super d> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f30241i = obj;
            this.f30243k |= Integer.MIN_VALUE;
            g gVar = g.this;
            KProperty<Object>[] kPropertyArr = g.f30206l;
            return gVar.j(null, null, this);
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {78, 80}, m = "getActivePurchases")
    public static final class e extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f30244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f30245d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f30247f;

        public e(mc.d<? super e> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f30245d = obj;
            this.f30247f |= Integer.MIN_VALUE;
            return g.this.k(this);
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.util.Billing$getActivePurchases$2$1", f = "Billing.kt", l = {85, 85}, m = "invokeSuspend")
    public static final class f extends oc.h implements uc.p<g0, mc.d<? super x.c<List<? extends gb.a>>>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f30248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f30249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f30250e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ com.android.billingclient.api.e f30252g;

        @oc.e(c = "com.zipoapps.premiumhelper.util.Billing$getActivePurchases$2$1$1", f = "Billing.kt", l = {}, m = "invokeSuspend")
        public static final class a extends oc.h implements uc.p<g0, mc.d<? super jc.w>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f30253c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ List<gb.a> f30254d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, List<gb.a> list, mc.d<? super a> dVar) {
                super(2, dVar);
                this.f30253c = gVar;
                this.f30254d = list;
            }

            @Override // oc.a
            public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
                return new a(this.f30253c, this.f30254d, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super jc.w> dVar) throws Throwable {
                a aVar = new a(this.f30253c, this.f30254d, dVar);
                jc.w wVar = jc.w.f31842a;
                aVar.invokeSuspend(wVar);
                return wVar;
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                h9.d.t(obj);
                g.f(this.f30253c, this.f30254d);
                if (!this.f30254d.isEmpty()) {
                    AcknowledgePurchaseWorker.f28240a.a(this.f30253c.f30207a);
                    TotoFeature.scheduleRegister$default(ma.h.f33410y.a().f33426o, false, 1, null);
                }
                return jc.w.f31842a;
            }
        }

        @oc.e(c = "com.zipoapps.premiumhelper.util.Billing$getActivePurchases$2$1$inapp$1", f = "Billing.kt", l = {82}, m = "invokeSuspend")
        public static final class b extends oc.h implements uc.p<g0, mc.d<? super List<? extends gb.a>>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f30255c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ g f30256d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.android.billingclient.api.e f30257e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(g gVar, com.android.billingclient.api.e eVar, mc.d<? super b> dVar) {
                super(2, dVar);
                this.f30256d = gVar;
                this.f30257e = eVar;
            }

            @Override // oc.a
            public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
                return new b(this.f30256d, this.f30257e, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super List<? extends gb.a>> dVar) {
                return new b(this.f30256d, this.f30257e, dVar).invokeSuspend(jc.w.f31842a);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                int i10 = this.f30255c;
                if (i10 == 0) {
                    h9.d.t(obj);
                    g gVar = this.f30256d;
                    com.android.billingclient.api.e eVar = this.f30257e;
                    this.f30255c = 1;
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

        @oc.e(c = "com.zipoapps.premiumhelper.util.Billing$getActivePurchases$2$1$subs$1", f = "Billing.kt", l = {83}, m = "invokeSuspend")
        public static final class c extends oc.h implements uc.p<g0, mc.d<? super List<? extends gb.a>>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f30258c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ g f30259d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.android.billingclient.api.e f30260e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(g gVar, com.android.billingclient.api.e eVar, mc.d<? super c> dVar) {
                super(2, dVar);
                this.f30259d = gVar;
                this.f30260e = eVar;
            }

            @Override // oc.a
            public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
                return new c(this.f30259d, this.f30260e, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super List<? extends gb.a>> dVar) {
                return new c(this.f30259d, this.f30260e, dVar).invokeSuspend(jc.w.f31842a);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                int i10 = this.f30258c;
                if (i10 == 0) {
                    h9.d.t(obj);
                    g gVar = this.f30259d;
                    com.android.billingclient.api.e eVar = this.f30260e;
                    this.f30258c = 1;
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
        public f(com.android.billingclient.api.e eVar, mc.d<? super f> dVar) {
            super(2, dVar);
            this.f30252g = eVar;
        }

        @Override // oc.a
        public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
            f fVar = g.this.new f(this.f30252g, dVar);
            fVar.f30250e = obj;
            return fVar;
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super x.c<List<? extends gb.a>>> dVar) {
            f fVar = g.this.new f(this.f30252g, dVar);
            fVar.f30250e = g0Var;
            return fVar.invokeSuspend(jc.w.f31842a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:20:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:23:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:26:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:29:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:35:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:38:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:48:0x00f2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:49:0x00f4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:52:? A[LOOP:0: B:27:0x00c8->B:52:?, LOOP_END, SYNTHETIC] */
        @Override // oc.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            g0 g0Var;
            m0 m0VarE;
            Object objF;
            Object objT;
            g0 g0Var2;
            Collection collection;
            List listZ;
            Application application;
            String str;
            boolean z10;
            boolean z11;
            List listR;
            Iterator it;
            PackageInfo packageInfo;
            boolean z12;
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f30249d;
            boolean z13 = true;
            if (i10 != 0) {
                if (i10 == 1) {
                    m0 m0Var = (m0) this.f30248c;
                    g0 g0Var3 = (g0) this.f30250e;
                    h9.d.t(obj);
                    objF = obj;
                    m0VarE = m0Var;
                    g0Var = g0Var3;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    collection = (Collection) this.f30248c;
                    g0 g0Var4 = (g0) this.f30250e;
                    h9.d.t(obj);
                    objT = obj;
                    g0Var2 = g0Var4;
                }
                listZ = kc.t.z(collection, (Iterable) objT);
                g gVar = g.this;
                application = gVar.f30207a;
                str = (String) gVar.f30208b.h(oa.b.M);
                j0.i(application, CoreConstants.CONTEXT_SCOPE_VALUE);
                j0.i(str, "packageNames");
                if (str.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    listR = ed.u.R(str, new String[]{","}, false, 0, 6);
                    if (listR.isEmpty()) {
                        it = listR.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z11 = false;
                                break;
                            }
                            String str2 = (String) it.next();
                            j0.i(str2, "packageName");
                            try {
                                packageInfo = application.getPackageManager().getPackageInfo(ed.u.Y(str2).toString(), 0);
                            } catch (PackageManager.NameNotFoundException unused) {
                                packageInfo = null;
                            }
                            if (packageInfo != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                z11 = true;
                                break;
                            }
                        }
                    } else {
                        z11 = false;
                        break;
                    }
                } else {
                    z11 = false;
                    break;
                }
                ma.f fVar = g.this.f30209c;
                if (((ArrayList) listZ).isEmpty() && !z11) {
                    z13 = false;
                }
                fVar.p(z13);
                g gVar2 = g.this;
                gVar2.f30213g.setValue(Boolean.valueOf(gVar2.f30209c.j()));
                y8.c0.z(g0Var2, s0.f29620b, null, new a(g.this, listZ, null), 2, null);
                g.this.l().g("Purchases: " + listZ, new Object[0]);
                return new x.c(listZ);
            }
            h9.d.t(obj);
            g0Var = (g0) this.f30250e;
            m0 m0VarE2 = y8.c0.e(g0Var, null, null, new b(g.this, this.f30252g, null), 3, null);
            m0VarE = y8.c0.e(g0Var, null, null, new c(g.this, this.f30252g, null), 3, null);
            this.f30250e = g0Var;
            this.f30248c = m0VarE;
            this.f30249d = 1;
            objF = ((n0) m0VarE2).F(this);
            if (objF == aVar) {
                return aVar;
            }
            Collection collection2 = (Collection) objF;
            this.f30250e = g0Var;
            this.f30248c = collection2;
            this.f30249d = 2;
            objT = m0VarE.T(this);
            if (objT == aVar) {
                return aVar;
            }
            g0Var2 = g0Var;
            collection = collection2;
            listZ = kc.t.z(collection, (Iterable) objT);
            g gVar3 = g.this;
            application = gVar3.f30207a;
            str = (String) gVar3.f30208b.h(oa.b.M);
            j0.i(application, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(str, "packageNames");
            if (str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                listR = ed.u.R(str, new String[]{","}, false, 0, 6);
                if (listR.isEmpty()) {
                    it = listR.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z11 = false;
                            break;
                        }
                        String str3 = (String) it.next();
                        j0.i(str3, "packageName");
                        packageInfo = application.getPackageManager().getPackageInfo(ed.u.Y(str3).toString(), 0);
                        if (packageInfo != null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            z11 = true;
                            break;
                        }
                    }
                } else {
                    z11 = false;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
            ma.f fVar2 = g.this.f30209c;
            if (((ArrayList) listZ).isEmpty()) {
                z13 = false;
            }
            fVar2.p(z13);
            g gVar4 = g.this;
            gVar4.f30213g.setValue(Boolean.valueOf(gVar4.f30209c.j()));
            y8.c0.z(g0Var2, s0.f29620b, null, new a(g.this, listZ, null), 2, null);
            g.this.l().g("Purchases: " + listZ, new Object[0]);
            return new x.c(listZ);
        }
    }

    /* JADX INFO: renamed from: gb.g$g, reason: collision with other inner class name */
    @oc.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {48, 54}, m = "getOffer")
    public static final class C0277g extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f30261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f30262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f30263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f30264f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f30265g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f30267i;

        public C0277g(mc.d<? super C0277g> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f30265g = obj;
            this.f30267i |= Integer.MIN_VALUE;
            return g.this.m(null, this);
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.util.Billing$getOffer$2", f = "Billing.kt", l = {48}, m = "invokeSuspend")
    public static final class h extends oc.h implements uc.l<mc.d<? super ma.e>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f30268c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f30270e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, mc.d<? super h> dVar) {
            super(1, dVar);
            this.f30270e = str;
        }

        @Override // oc.a
        public final mc.d<jc.w> create(mc.d<?> dVar) {
            return g.this.new h(this.f30270e, dVar);
        }

        @Override // uc.l
        public Object invoke(mc.d<? super ma.e> dVar) {
            return g.this.new h(this.f30270e, dVar).invokeSuspend(jc.w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f30268c;
            if (i10 == 0) {
                h9.d.t(obj);
                g gVar = g.this;
                String str = this.f30270e;
                this.f30268c = 1;
                obj = g.e(gVar, str, this);
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

    @oc.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {337, 338}, m = "hasHistoryPurchases")
    public static final class i extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f30271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f30272d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f30274f;

        public i(mc.d<? super i> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f30272d = obj;
            this.f30274f |= Integer.MIN_VALUE;
            return g.this.o(this);
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.util.Billing$hasHistoryPurchases$2$1", f = "Billing.kt", l = {342, 342}, m = "invokeSuspend")
    public static final class j extends oc.h implements uc.p<g0, mc.d<? super x.c<Boolean>>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f30275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f30276d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.android.billingclient.api.e f30278f;

        @oc.e(c = "com.zipoapps.premiumhelper.util.Billing$hasHistoryPurchases$2$1$inapp$1", f = "Billing.kt", l = {339}, m = "invokeSuspend")
        public static final class a extends oc.h implements uc.p<g0, mc.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f30279c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ g f30280d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.android.billingclient.api.e f30281e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, com.android.billingclient.api.e eVar, mc.d<? super a> dVar) {
                super(2, dVar);
                this.f30280d = gVar;
                this.f30281e = eVar;
            }

            @Override // oc.a
            public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
                return new a(this.f30280d, this.f30281e, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super Boolean> dVar) {
                return new a(this.f30280d, this.f30281e, dVar).invokeSuspend(jc.w.f31842a);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                int i10 = this.f30279c;
                if (i10 == 0) {
                    h9.d.t(obj);
                    g gVar = this.f30280d;
                    com.android.billingclient.api.e eVar = this.f30281e;
                    this.f30279c = 1;
                    obj = g.c(gVar, eVar, "inapp", this);
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

        @oc.e(c = "com.zipoapps.premiumhelper.util.Billing$hasHistoryPurchases$2$1$subs$1", f = "Billing.kt", l = {340}, m = "invokeSuspend")
        public static final class b extends oc.h implements uc.p<g0, mc.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f30282c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ g f30283d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.android.billingclient.api.e f30284e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(g gVar, com.android.billingclient.api.e eVar, mc.d<? super b> dVar) {
                super(2, dVar);
                this.f30283d = gVar;
                this.f30284e = eVar;
            }

            @Override // oc.a
            public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
                return new b(this.f30283d, this.f30284e, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super Boolean> dVar) {
                return new b(this.f30283d, this.f30284e, dVar).invokeSuspend(jc.w.f31842a);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                int i10 = this.f30282c;
                if (i10 == 0) {
                    h9.d.t(obj);
                    g gVar = this.f30283d;
                    com.android.billingclient.api.e eVar = this.f30284e;
                    this.f30282c = 1;
                    obj = g.c(gVar, eVar, "subs", this);
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
        public j(com.android.billingclient.api.e eVar, mc.d<? super j> dVar) {
            super(2, dVar);
            this.f30278f = eVar;
        }

        @Override // oc.a
        public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
            j jVar = g.this.new j(this.f30278f, dVar);
            jVar.f30276d = obj;
            return jVar;
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super x.c<Boolean>> dVar) {
            j jVar = g.this.new j(this.f30278f, dVar);
            jVar.f30276d = g0Var;
            return jVar.invokeSuspend(jc.w.f31842a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0077  */
        @Override // oc.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            m0 m0VarE;
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f30275c;
            boolean z10 = true;
            if (i10 != 0) {
                if (i10 == 1) {
                    m0VarE = (m0) this.f30276d;
                    h9.d.t(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h9.d.t(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    z10 = false;
                }
                return new x.c(Boolean.valueOf(z10));
            }
            h9.d.t(obj);
            g0 g0Var = (g0) this.f30276d;
            m0 m0VarE2 = y8.c0.e(g0Var, null, null, new a(g.this, this.f30278f, null), 3, null);
            m0VarE = y8.c0.e(g0Var, null, null, new b(g.this, this.f30278f, null), 3, null);
            this.f30276d = m0VarE;
            this.f30275c = 1;
            obj = ((n0) m0VarE2).F(this);
            if (obj == aVar) {
                return aVar;
            }
            if (!((Boolean) obj).booleanValue()) {
                this.f30276d = null;
                this.f30275c = 2;
                obj = m0VarE.T(this);
                if (obj == aVar) {
                    return aVar;
                }
                if (!((Boolean) obj).booleanValue()) {
                    z10 = false;
                }
            }
            return new x.c(Boolean.valueOf(z10));
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.util.Billing$onPurchasesUpdated$1", f = "Billing.kt", l = {497, 506, 509}, m = "invokeSuspend")
    public static final class k extends oc.h implements uc.p<g0, mc.d<? super jc.w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f30285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.android.billingclient.api.n f30286d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<Purchase> f30287e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ g f30288f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(com.android.billingclient.api.n nVar, List<Purchase> list, g gVar, mc.d<? super k> dVar) {
            super(2, dVar);
            this.f30286d = nVar;
            this.f30287e = list;
            this.f30288f = gVar;
        }

        @Override // oc.a
        public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
            return new k(this.f30286d, this.f30287e, this.f30288f, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super jc.w> dVar) {
            return new k(this.f30286d, this.f30287e, this.f30288f, dVar).invokeSuspend(jc.w.f31842a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0055  */
        /* JADX WARN: Code duplicated, block: B:30:0x007c A[RETURN] */
        @Override // oc.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list;
            id.m<z> mVar;
            z zVar;
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f30285c;
            if (i10 == 0) {
                h9.d.t(obj);
                if (this.f30286d.f3848a == 0) {
                    List<Purchase> list2 = this.f30287e;
                    if (!(list2 == null || list2.isEmpty())) {
                        g gVar = this.f30288f;
                        List<Purchase> list3 = this.f30287e;
                        this.f30285c = 1;
                        obj = g.b(gVar, list3, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        list = (List) obj;
                        g.f(this.f30288f, list);
                        if (!list.isEmpty()) {
                            ma.h.f33410y.a().f33426o.scheduleRegister(true);
                            AcknowledgePurchaseWorker.f28240a.a(this.f30288f.f30207a);
                        }
                        mVar = this.f30288f.f30215i;
                        zVar = new z(this.f30286d, list);
                        this.f30285c = 2;
                        if (mVar.emit(zVar, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                id.m<z> mVar2 = this.f30288f.f30215i;
                z zVar2 = new z(this.f30286d, null, 2, null);
                this.f30285c = 3;
                if (mVar2.emit(zVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i10 == 1) {
                h9.d.t(obj);
                list = (List) obj;
                g.f(this.f30288f, list);
                if (!list.isEmpty()) {
                    ma.h.f33410y.a().f33426o.scheduleRegister(true);
                    AcknowledgePurchaseWorker.f28240a.a(this.f30288f.f30207a);
                }
                mVar = this.f30288f.f30215i;
                zVar = new z(this.f30286d, list);
                this.f30285c = 2;
                if (mVar.emit(zVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 2 && i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return jc.w.f31842a;
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {384}, m = "queryPurchaseHistory")
    public static final class l extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f30289c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f30290d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f30292f;

        public l(mc.d<? super l> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f30290d = obj;
            this.f30292f |= Integer.MIN_VALUE;
            g gVar = g.this;
            KProperty<Object>[] kPropertyArr = g.f30206l;
            return gVar.q(null, null, this);
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {SyslogConstants.LOG_LOCAL2, 148}, m = "queryPurchases")
    public static final class m extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f30293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f30294d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f30295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f30296f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f30297g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f30298h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Object f30299i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f30300j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f30302l;

        public m(mc.d<? super m> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f30300j = obj;
            this.f30302l |= Integer.MIN_VALUE;
            g gVar = g.this;
            KProperty<Object>[] kPropertyArr = g.f30206l;
            return gVar.r(null, null, this);
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {166, 168}, m = "querySkuDetails")
    public static final class n extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f30303c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f30304d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f30305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f30306f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f30308h;

        public n(mc.d<? super n> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f30306f = obj;
            this.f30308h |= Integer.MIN_VALUE;
            g gVar = g.this;
            KProperty<Object>[] kPropertyArr = g.f30206l;
            return gVar.t(null, null, this);
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {174, 181}, m = "querySkuDetails")
    public static final class o extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f30309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f30310d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f30311e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f30313g;

        public o(mc.d<? super o> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f30311e = obj;
            this.f30313g |= Integer.MIN_VALUE;
            g gVar = g.this;
            KProperty<Object>[] kPropertyArr = g.f30206l;
            return gVar.s(null, null, null, this);
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {194, 198, 199}, m = "querySkuWithRetries")
    public static final class p extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f30314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f30315d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f30316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f30317f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f30319h;

        public p(mc.d<? super p> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f30317f = obj;
            this.f30319h |= Integer.MIN_VALUE;
            g gVar = g.this;
            KProperty<Object>[] kPropertyArr = g.f30206l;
            return gVar.u(null, null, this);
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.util.Billing$updateOfferCache$1", f = "Billing.kt", l = {304}, m = "invokeSuspend")
    public static final class q extends oc.h implements uc.p<g0, mc.d<? super jc.w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f30320c;

        @oc.e(c = "com.zipoapps.premiumhelper.util.Billing$updateOfferCache$1$1", f = "Billing.kt", l = {}, m = "invokeSuspend")
        public static final class a extends oc.h implements uc.p<g0, mc.d<? super jc.w>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f30322c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ g f30323d;

            /* JADX INFO: renamed from: gb.g$q$a$a, reason: collision with other inner class name */
            @oc.e(c = "com.zipoapps.premiumhelper.util.Billing$updateOfferCache$1$1$1", f = "Billing.kt", l = {StatusLine.HTTP_PERM_REDIRECT, 314}, m = "invokeSuspend")
            public static final class C0278a extends oc.h implements uc.p<g0, mc.d<? super jc.w>, Object> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Object f30324c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Object f30325d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Object f30326e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public Object f30327f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public Object f30328g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public Object f30329h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public int f30330i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ g f30331j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0278a(g gVar, mc.d<? super C0278a> dVar) {
                    super(2, dVar);
                    this.f30331j = gVar;
                }

                @Override // oc.a
                public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
                    return new C0278a(this.f30331j, dVar);
                }

                @Override // uc.p
                public Object invoke(g0 g0Var, mc.d<? super jc.w> dVar) {
                    return new C0278a(this.f30331j, dVar).invokeSuspend(jc.w.f31842a);
                }

                /* JADX WARN: Code duplicated, block: B:29:0x00b3 A[Catch: Exception -> 0x016a, TRY_LEAVE, TryCatch #1 {Exception -> 0x016a, blocks: (B:27:0x00ad, B:29:0x00b3, B:51:0x0158, B:54:0x0163), top: B:65:0x00ad }] */
                /* JADX WARN: Code duplicated, block: B:32:0x00c8  */
                /* JADX WARN: Code duplicated, block: B:33:0x00ca  */
                /* JADX WARN: Code duplicated, block: B:35:0x00cd A[Catch: Exception -> 0x011a, TryCatch #2 {Exception -> 0x011a, blocks: (B:38:0x00e4, B:30:0x00ba, B:35:0x00cd), top: B:67:0x00e4 }] */
                /* JADX WARN: Code duplicated, block: B:37:0x00e3 A[RETURN] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e1 -> B:67:0x00e4). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // oc.a
                public final java.lang.Object invokeSuspend(java.lang.Object r26) {
                    /*
                        Method dump skipped, instruction units count: 384
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: gb.g.q.a.C0278a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, mc.d<? super a> dVar) {
                super(2, dVar);
                this.f30323d = gVar;
            }

            @Override // oc.a
            public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
                a aVar = new a(this.f30323d, dVar);
                aVar.f30322c = obj;
                return aVar;
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super jc.w> dVar) {
                a aVar = new a(this.f30323d, dVar);
                aVar.f30322c = g0Var;
                jc.w wVar = jc.w.f31842a;
                aVar.invokeSuspend(wVar);
                return wVar;
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                h9.d.t(obj);
                y8.c0.z((g0) this.f30322c, s0.f29619a, null, new C0278a(this.f30323d, null), 2, null);
                return jc.w.f31842a;
            }
        }

        public q(mc.d<? super q> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
            return g.this.new q(dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super jc.w> dVar) {
            return g.this.new q(dVar).invokeSuspend(jc.w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f30320c;
            if (i10 == 0) {
                h9.d.t(obj);
                a aVar2 = new a(g.this, null);
                this.f30320c = 1;
                if (fd.z.l(aVar2, this) == aVar) {
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

    static {
        vc.t tVar = new vc.t(g.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(vc.b0.f36991a);
        f30206l = new cd.i[]{tVar};
    }

    public g(Application application, oa.b bVar, ma.f fVar, gb.e eVar) {
        j0.i(application, "application");
        j0.i(bVar, "configuration");
        j0.i(fVar, "preferences");
        j0.i(eVar, "appInstanceId");
        this.f30207a = application;
        this.f30208b = bVar;
        this.f30209c = fVar;
        this.f30210d = eVar;
        this.f30211e = new ta.e("PremiumHelper");
        this.f30212f = new na.a(application, this);
        id.n<Boolean> nVarA = id.w.a(Boolean.valueOf(fVar.j()));
        this.f30213g = nVarA;
        this.f30214h = fd.z.d(nVarA);
        kd.z zVar = id.s.f31618a;
        id.r rVar = new id.r(0, 0, hd.e.SUSPEND);
        this.f30215i = rVar;
        this.f30216j = new id.o(rVar, null);
        this.f30217k = new Hashtable<>();
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[LOOP:1: B:24:0x00a1->B:101:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:99:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ce -> B:31:0x00d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x011c -> B:55:0x0190). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x017e -> B:51:0x0184). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(gb.g r17, java.util.List r18, mc.d r19) {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.g.b(gb.g, java.util.List, mc.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(g gVar, com.android.billingclient.api.e eVar, String str, mc.d dVar) throws Throwable {
        gb.k kVar;
        Objects.requireNonNull(gVar);
        if (dVar instanceof gb.k) {
            kVar = (gb.k) dVar;
            int i10 = kVar.f30349e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f30349e = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new gb.k(gVar, dVar);
            }
        } else {
            kVar = new gb.k(gVar, dVar);
        }
        Object objQ = kVar.f30347c;
        Object obj = nc.a.COROUTINE_SUSPENDED;
        int i11 = kVar.f30349e;
        if (i11 == 0) {
            h9.d.t(objQ);
            kVar.f30349e = 1;
            objQ = gVar.q(eVar, str, kVar);
            if (objQ == obj) {
                return obj;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(objQ);
        }
        Collection collection = (Collection) objQ;
        return Boolean.valueOf(!(collection == null || collection.isEmpty()));
    }

    public static final void d(g gVar, Activity activity, ma.e eVar) {
        Objects.requireNonNull(gVar);
        new androidx.appcompat.app.g.a(activity).setTitle("Purchase debug offer?").setMessage("You are trying to purchase a DEBUG offer. This purchase is for testing only, Google Play is not updated.").setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).setPositiveButton("Test Purchase", new h0(gVar, eVar)).show();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object e(g gVar, String str, mc.d dVar) {
        gb.o oVar;
        Objects.requireNonNull(gVar);
        if (dVar instanceof gb.o) {
            oVar = (gb.o) dVar;
            int i10 = oVar.f30376g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f30376g = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new gb.o(gVar, dVar);
            }
        } else {
            oVar = new gb.o(gVar, dVar);
        }
        Object objA = oVar.f30374e;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = oVar.f30376g;
        if (i11 != 0) {
            if (i11 == 1) {
                str = (String) oVar.f30373d;
                gVar = (g) oVar.f30372c;
                h9.d.t(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(objA);
            }
            SkuDetails skuDetails = (SkuDetails) objA;
            String strE = skuDetails.e();
            j0.h(strE, "skuDetails.sku");
            return new ma.e(strE, skuDetails.f(), skuDetails);
        }
        h9.d.t(objA);
        na.a aVar2 = gVar.f30212f;
        oVar.f30372c = gVar;
        oVar.f30373d = str;
        oVar.f30376g = 1;
        objA = aVar2.a(oVar);
        if (objA == aVar) {
            return aVar;
        }
        oVar.f30372c = null;
        oVar.f30373d = null;
        oVar.f30376g = 2;
        objA = gVar.t((com.android.billingclient.api.e) objA, str, oVar);
        if (objA == aVar) {
            return aVar;
        }
        SkuDetails skuDetails2 = (SkuDetails) objA;
        String strE2 = skuDetails2.e();
        j0.h(strE2, "skuDetails.sku");
        return new ma.e(strE2, skuDetails2.f(), skuDetails2);
    }

    public static final void f(g gVar, List list) {
        Objects.requireNonNull(gVar);
        if (!(!list.isEmpty())) {
            SharedPreferences.Editor editorEdit = gVar.f30209c.f33405a.edit();
            editorEdit.putString("active_purchase_info", "");
            editorEdit.apply();
            return;
        }
        gb.a aVar = (gb.a) list.get(0);
        ma.f fVar = gVar.f30209c;
        String str = aVar.f30176a.b().get(0);
        j0.h(str, "ap.purchase.skus[0]");
        String strA = aVar.f30176a.a();
        j0.h(strA, "ap.purchase.purchaseToken");
        ActivePurchaseInfo activePurchaseInfo = new ActivePurchaseInfo(str, strA, aVar.f30176a.f3750c.optLong("purchaseTime"), aVar.f30178c);
        Objects.requireNonNull(fVar);
        j0.i(activePurchaseInfo, "value");
        SharedPreferences.Editor editorEdit2 = fVar.f33405a.edit();
        editorEdit2.putString("active_purchase_info", new Gson().g(activePurchaseInfo));
        editorEdit2.apply();
    }

    @Override // com.android.billingclient.api.w
    public void a(com.android.billingclient.api.n nVar, List<Purchase> list) {
        j0.i(nVar, "result");
        l().g("onPurchaseUpdated: " + list + " Result: " + nVar.f3848a, new Object[0]);
        try {
            y8.c0.z(c1.f29556c, null, null, new k(nVar, list, this, null), 3, null);
        } catch (Exception e10) {
            l().k(6, e10, null, new Object[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00b6 A[Catch: Exception -> 0x0062, TryCatch #2 {Exception -> 0x0062, blocks: (B:21:0x0052, B:45:0x00a1, B:47:0x00a7, B:48:0x00b0, B:50:0x00b6, B:52:0x00ca, B:53:0x00ce, B:24:0x005e, B:33:0x0078, B:35:0x007c, B:41:0x0088), top: B:72:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f4 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:14:0x003a, B:55:0x00ee, B:57:0x00f4, B:60:0x0116), top: B:68:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[LOOP:0: B:55:0x00ee->B:77:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [gb.g] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [gb.g] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2, types: [gb.g] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [gb.g, java.lang.Object] */
    public final Object g(List<gb.a> list, mc.d<? super jc.w> dVar) {
        a aVar;
        ?? r10;
        g gVar;
        com.android.billingclient.api.e eVar;
        com.android.billingclient.api.e eVar2;
        ArrayList arrayList;
        Iterator it;
        Iterable iterable;
        g gVar2;
        String strA;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f30224i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f30224i = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objA = aVar.f30222g;
        nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
        ?? r11 = aVar.f30224i;
        try {
            if (r11 == 0) {
                h9.d.t(objA);
                try {
                    na.a aVar3 = this.f30212f;
                    aVar.f30218c = this;
                    aVar.f30219d = list;
                    aVar.f30224i = 1;
                    objA = aVar3.a(aVar);
                    if (objA == aVar2) {
                        return aVar2;
                    }
                    gVar = this;
                } catch (Exception e10) {
                    e = e10;
                    r10 = this;
                    r10.l().k(6, e, "Acknowledge all failed", new Object[0]);
                }
            } else {
                if (r11 != 1) {
                    if (r11 != 2) {
                        if (r11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) aVar.f30221f;
                        iterable = (Iterable) aVar.f30220e;
                        eVar = (com.android.billingclient.api.e) aVar.f30219d;
                        r10 = (g) aVar.f30218c;
                        try {
                            h9.d.t(objA);
                            r10 = r10;
                            while (it.hasNext()) {
                                strA = ((gb.a) it.next()).f30176a.a();
                                j0.h(strA, "it.purchase.purchaseToken");
                                aVar.f30218c = r10;
                                aVar.f30219d = eVar;
                                aVar.f30220e = iterable;
                                aVar.f30221f = it;
                                aVar.f30224i = 3;
                                if (r10.h(eVar, strA, aVar) == aVar2) {
                                    return aVar2;
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            r10.l().k(6, e, "Acknowledge all failed", new Object[0]);
                        }
                        return jc.w.f31842a;
                    }
                    eVar2 = (com.android.billingclient.api.e) aVar.f30219d;
                    g gVar3 = (g) aVar.f30218c;
                    h9.d.t(objA);
                    gVar2 = gVar3;
                    eVar = eVar2;
                    list = (List) objA;
                    r11 = gVar2;
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (!((gb.a) obj).f30176a.f3750c.optBoolean("acknowledged", true)) {
                            arrayList.add(obj);
                        }
                    }
                    r11.l().g("Acknowledge purchases " + arrayList, new Object[0]);
                    it = arrayList.iterator();
                    r10 = r11;
                    iterable = arrayList;
                    while (it.hasNext()) {
                        strA = ((gb.a) it.next()).f30176a.a();
                        j0.h(strA, "it.purchase.purchaseToken");
                        aVar.f30218c = r10;
                        aVar.f30219d = eVar;
                        aVar.f30220e = iterable;
                        aVar.f30221f = it;
                        aVar.f30224i = 3;
                        if (r10.h(eVar, strA, aVar) == aVar2) {
                            return aVar2;
                        }
                    }
                    return jc.w.f31842a;
                }
                list = (List) aVar.f30219d;
                g gVar4 = (g) aVar.f30218c;
                h9.d.t(objA);
                gVar = gVar4;
            }
            com.android.billingclient.api.e eVar3 = (com.android.billingclient.api.e) objA;
            if (list == null || list.isEmpty()) {
                aVar.f30218c = gVar;
                aVar.f30219d = eVar3;
                aVar.f30224i = 2;
                Objects.requireNonNull(gVar);
                Object objL = fd.z.l(new gb.n(gVar, eVar3, null), aVar);
                if (objL == aVar2) {
                    return aVar2;
                }
                objA = objL;
                eVar2 = eVar3;
                gVar2 = gVar;
                eVar = eVar2;
                list = (List) objA;
                r11 = gVar2;
            } else {
                eVar = eVar3;
                r11 = gVar;
            }
            arrayList = new ArrayList();
            while (r12.hasNext()) {
                if (!((gb.a) obj).f30176a.f3750c.optBoolean("acknowledged", true)) {
                    arrayList.add(obj);
                }
            }
            r11.l().g("Acknowledge purchases " + arrayList, new Object[0]);
            it = arrayList.iterator();
            r10 = r11;
            iterable = arrayList;
            while (it.hasNext()) {
                strA = ((gb.a) it.next()).f30176a.a();
                j0.h(strA, "it.purchase.purchaseToken");
                aVar.f30218c = r10;
                aVar.f30219d = eVar;
                aVar.f30220e = iterable;
                aVar.f30221f = it;
                aVar.f30224i = 3;
                if (r10.h(eVar, strA, aVar) == aVar2) {
                    return aVar2;
                }
            }
        } catch (Exception e12) {
            e = e12;
            r10 = r11;
        }
        return jc.w.f31842a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(com.android.billingclient.api.e eVar, String str, mc.d<? super com.android.billingclient.api.n> dVar) throws Throwable {
        b bVar;
        g gVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f30228f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f30228f = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objF = bVar.f30226d;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = bVar.f30228f;
        if (i11 == 0) {
            h9.d.t(objF);
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            com.android.billingclient.api.a aVar2 = new com.android.billingclient.api.a();
            aVar2.f3756a = str;
            bVar.f30225c = this;
            bVar.f30228f = 1;
            fd.r rVarB = fd.f.b(null, 1);
            eVar.a(aVar2, new com.android.billingclient.api.g(rVarB));
            objF = ((fd.s) rVarB).F(bVar);
            if (objF == aVar) {
                return aVar;
            }
            gVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = (g) bVar.f30225c;
            h9.d.t(objF);
        }
        ta.d dVarL = gVar.l();
        StringBuilder sbA = defpackage.a.a("Purchase acknowledged: ");
        sbA.append(y8.c0.v((com.android.billingclient.api.n) objF));
        dVarL.g(sbA.toString(), new Object[0]);
        return objF;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(mc.d<? super x<Integer>> dVar) throws Throwable {
        c cVar;
        g gVar;
        com.android.billingclient.api.e eVar;
        g gVar2;
        int iIntValue;
        Object objJ;
        int i10;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i11 = cVar.f30234h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f30234h = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objA = cVar.f30232f;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i12 = cVar.f30234h;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    gVar = (g) cVar.f30229c;
                    h9.d.t(objA);
                } else if (i12 == 2) {
                    eVar = (com.android.billingclient.api.e) cVar.f30230d;
                    gVar2 = (g) cVar.f30229c;
                    h9.d.t(objA);
                    iIntValue = ((Number) objA).intValue();
                    cVar.f30229c = null;
                    cVar.f30230d = null;
                    cVar.f30231e = iIntValue;
                    cVar.f30234h = 3;
                    objJ = gVar2.j(eVar, "subs", cVar);
                    if (objJ == aVar) {
                        return aVar;
                    }
                    i10 = iIntValue;
                    objA = objJ;
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = cVar.f30231e;
                    h9.d.t(objA);
                }
                return new x.c(new Integer(i10 + ((Number) objA).intValue()));
            }
            h9.d.t(objA);
            na.a aVar2 = this.f30212f;
            cVar.f30229c = this;
            cVar.f30234h = 1;
            objA = aVar2.a(cVar);
            if (objA == aVar) {
                return aVar;
            }
            gVar = this;
            com.android.billingclient.api.e eVar2 = (com.android.billingclient.api.e) objA;
            cVar.f30229c = gVar;
            cVar.f30230d = eVar2;
            cVar.f30234h = 2;
            Object objJ2 = gVar.j(eVar2, "inapp", cVar);
            if (objJ2 == aVar) {
                return aVar;
            }
            g gVar3 = gVar;
            eVar = eVar2;
            objA = objJ2;
            gVar2 = gVar3;
            iIntValue = ((Number) objA).intValue();
            cVar.f30229c = null;
            cVar.f30230d = null;
            cVar.f30231e = iIntValue;
            cVar.f30234h = 3;
            objJ = gVar2.j(eVar, "subs", cVar);
            if (objJ == aVar) {
                return aVar;
            }
            i10 = iIntValue;
            objA = objJ;
            return new x.c(new Integer(i10 + ((Number) objA).intValue()));
        } catch (Exception e10) {
            return new x.b(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b1 -> B:28:0x00b4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object j(com.android.billingclient.api.e r11, java.lang.String r12, mc.d<? super java.lang.Integer> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.g.j(com.android.billingclient.api.e, java.lang.String, mc.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(mc.d<? super x<? extends List<gb.a>>> dVar) {
        e eVar;
        g gVar;
        ActivePurchaseInfo activePurchaseInfoG;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f30247f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f30247f = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objA = eVar.f30245d;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = eVar.f30247f;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    gVar = (g) eVar.f30244c;
                    h9.d.t(objA);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h9.d.t(objA);
                }
                return (x.c) objA;
            }
            h9.d.t(objA);
            if (this.f30208b.l() && (activePurchaseInfoG = this.f30209c.g()) != null && ed.q.u(activePurchaseInfoG.getPurchaseToken(), "debugtoken", false, 2)) {
                com.zipoapps.premiumhelper.util.c cVar = com.zipoapps.premiumhelper.util.c.f28448a;
                List listA = kc.k.a(new gb.a(cVar.a(this.f30207a, activePurchaseInfoG.getSku()), cVar.b(activePurchaseInfoG.getSku(), "subs", ""), com.zipoapps.premiumhelper.util.d.PAID));
                l().g("Purchases: " + listA, new Object[0]);
                return new x.c(listA);
            }
            na.a aVar2 = this.f30212f;
            eVar.f30244c = this;
            eVar.f30247f = 1;
            objA = aVar2.a(eVar);
            if (objA == aVar) {
                return aVar;
            }
            gVar = this;
            f fVar = gVar.new f((com.android.billingclient.api.e) objA, null);
            eVar.f30244c = null;
            eVar.f30247f = 2;
            objA = fd.z.l(fVar, eVar);
            if (objA == aVar) {
                return aVar;
            }
            return (x.c) objA;
        } catch (Exception e10) {
            return new x.b(e10);
        }
    }

    public final ta.d l() {
        return this.f30211e.a(this, f30206l[0]);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00da  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ea -> B:13:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object m(oa.b.c.d r11, mc.d<? super gb.x<ma.e>> r12) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.g.m(oa.b$c$d, mc.d):java.lang.Object");
    }

    public final com.zipoapps.premiumhelper.util.d n(Purchase purchase, SkuDetails skuDetails) {
        if (skuDetails == null) {
            return com.zipoapps.premiumhelper.util.d.UNKNOWN;
        }
        if (!j0.d(skuDetails.f(), "inapp")) {
            boolean z10 = !purchase.c();
            boolean zP = p(purchase, skuDetails);
            if (z10) {
                return zP ? com.zipoapps.premiumhelper.util.d.SUBSCRIPTION_CANCELLED : com.zipoapps.premiumhelper.util.d.TRIAL_CANCELLED;
            }
            if (!zP) {
                return com.zipoapps.premiumhelper.util.d.TRIAL;
            }
        }
        return com.zipoapps.premiumhelper.util.d.PAID;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(mc.d<? super x<Boolean>> dVar) {
        i iVar;
        g gVar;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i10 = iVar.f30274f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f30274f = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object objA = iVar.f30272d;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = iVar.f30274f;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    gVar = (g) iVar.f30271c;
                    h9.d.t(objA);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h9.d.t(objA);
                }
                return (x.c) objA;
            }
            h9.d.t(objA);
            na.a aVar2 = this.f30212f;
            iVar.f30271c = this;
            iVar.f30274f = 1;
            objA = aVar2.a(iVar);
            if (objA == aVar) {
                return aVar;
            }
            gVar = this;
            j jVar = gVar.new j((com.android.billingclient.api.e) objA, null);
            iVar.f30271c = null;
            iVar.f30274f = 2;
            objA = fd.z.l(jVar, iVar);
            if (objA == aVar) {
                return aVar;
            }
            return (x.c) objA;
        } catch (Exception e10) {
            return new x.b(e10);
        }
    }

    public final boolean p(Purchase purchase, SkuDetails skuDetails) {
        try {
            String strA = skuDetails.a();
            j0.h(strA, "skuDetails.freeTrialPeriod");
            if (!(strA.length() == 0)) {
                ne.e eVarJ = ne.e.j(purchase.f3750c.optLong("purchaseTime"));
                ne.m mVarB = ne.m.b(skuDetails.a());
                Objects.requireNonNull(eVarJ);
                ne.e eVar = (ne.e) mVarB.a(eVarJ);
                ne.r rVar = ne.r.f33832h;
                if (eVar.compareTo(ne.e.j(System.currentTimeMillis())) >= 0) {
                    return false;
                }
            }
            return true;
        } catch (Exception e10) {
            ta.d dVarL = l();
            StringBuilder sbA = defpackage.a.a("Trial check failed for ");
            sbA.append(skuDetails.e());
            sbA.append(" trial period is: ");
            sbA.append(skuDetails.a());
            dVarL.k(6, e10, sbA.toString(), new Object[0]);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(com.android.billingclient.api.e eVar, String str, mc.d<? super List<? extends PurchaseHistoryRecord>> dVar) throws Throwable {
        l lVar;
        g gVar;
        Iterable<PurchaseHistoryRecord> iterable;
        if (dVar instanceof l) {
            lVar = (l) dVar;
            int i10 = lVar.f30292f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f30292f = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(dVar);
            }
        } else {
            lVar = new l(dVar);
        }
        Object objF = lVar.f30290d;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = lVar.f30292f;
        boolean z10 = true;
        if (i11 == 0) {
            h9.d.t(objF);
            lVar.f30289c = this;
            lVar.f30292f = 1;
            fd.r rVarB = fd.f.b(null, 1);
            eVar.f(str, new com.android.billingclient.api.i(rVarB));
            objF = ((fd.s) rVarB).F(lVar);
            if (objF == aVar) {
                return aVar;
            }
            gVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = (g) lVar.f30289c;
            h9.d.t(objF);
        }
        com.android.billingclient.api.t tVar = (com.android.billingclient.api.t) objF;
        if (y8.c0.v(tVar.f3870a)) {
            List list = tVar.f3871b;
            if (list != null && !list.isEmpty()) {
                z10 = false;
            }
            if (z10) {
                iterable = kc.w.f32009c;
            } else {
                iterable = tVar.f3871b;
                j0.f(iterable);
            }
        } else {
            iterable = kc.w.f32009c;
        }
        if (gVar.f30208b.l()) {
            for (PurchaseHistoryRecord purchaseHistoryRecord : iterable) {
                gVar.l().g("History purchase: " + purchaseHistoryRecord, new Object[0]);
            }
        }
        return iterable;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d3 -> B:29:0x00d4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object r(com.android.billingclient.api.e r11, java.lang.String r12, mc.d<? super java.util.List<gb.a>> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.g.r(com.android.billingclient.api.e, java.lang.String, mc.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x0093, please report this as an issue */
    public final Object s(com.android.billingclient.api.e eVar, String str, String str2, mc.d<? super SkuDetails> dVar) {
        o oVar;
        com.android.billingclient.api.z zVar;
        if (dVar instanceof o) {
            oVar = (o) dVar;
            int i10 = oVar.f30313g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f30313g = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(dVar);
            }
        } else {
            oVar = new o(dVar);
        }
        Object objU = oVar.f30311e;
        Object obj = nc.a.COROUTINE_SUSPENDED;
        int i11 = oVar.f30313g;
        if (i11 != 0) {
            if (i11 == 1) {
                h9.d.t(objU);
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) oVar.f30310d;
            str = (String) oVar.f30309c;
            h9.d.t(objU);
            zVar = (com.android.billingclient.api.z) objU;
            if (y8.c0.w(zVar)) {
                List list = zVar.f3887b;
                j0.f(list);
                return list.get(0);
            }
            throw new IllegalStateException("Failed to get sku " + str + ' ' + zVar.f3886a.f3848a + ' ' + str2);
        }
        h9.d.t(objU);
        if (str2 == null || str2.length() == 0) {
            oVar.f30313g = 1;
            objU = t(eVar, str, oVar);
            return objU == obj ? obj : objU;
        }
        ArrayList arrayList = new ArrayList(kc.l.f(str));
        if (str2 == null) {
            throw new IllegalArgumentException("SKU type must be set");
        }
        com.android.billingclient.api.x xVar = new com.android.billingclient.api.x();
        xVar.f3884a = str2;
        xVar.f3885b = arrayList;
        oVar.f30309c = str;
        oVar.f30310d = str2;
        oVar.f30313g = 2;
        objU = u(eVar, xVar, oVar);
        if (objU == obj) {
            return obj;
        }
        zVar = (com.android.billingclient.api.z) objU;
        if (y8.c0.w(zVar)) {
            List list2 = zVar.f3887b;
            j0.f(list2);
            return list2.get(0);
        }
        throw new IllegalStateException("Failed to get sku " + str + ' ' + zVar.f3886a.f3848a + ' ' + str2);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(com.android.billingclient.api.e eVar, String str, mc.d<? super SkuDetails> dVar) {
        n nVar;
        g gVar;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i10 = nVar.f30308h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f30308h = i10 - Integer.MIN_VALUE;
            } else {
                nVar = new n(dVar);
            }
        } else {
            nVar = new n(dVar);
        }
        Object objS = nVar.f30306f;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = nVar.f30308h;
        if (i11 == 0) {
            h9.d.t(objS);
            try {
                nVar.f30303c = this;
                nVar.f30304d = eVar;
                nVar.f30305e = str;
                nVar.f30308h = 1;
                objS = s(eVar, str, "subs", nVar);
                if (objS == aVar) {
                    return aVar;
                }
                gVar = this;
            } catch (Exception unused) {
                gVar = this;
                nVar.f30303c = null;
                nVar.f30304d = null;
                nVar.f30305e = null;
                nVar.f30308h = 2;
                objS = gVar.s(eVar, str, "inapp", nVar);
                if (objS == aVar) {
                    return aVar;
                }
                return (SkuDetails) objS;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(objS);
                return (SkuDetails) objS;
            }
            str = (String) nVar.f30305e;
            eVar = (com.android.billingclient.api.e) nVar.f30304d;
            gVar = (g) nVar.f30303c;
            try {
                h9.d.t(objS);
            } catch (Exception unused2) {
                nVar.f30303c = null;
                nVar.f30304d = null;
                nVar.f30305e = null;
                nVar.f30308h = 2;
                objS = gVar.s(eVar, str, "inapp", nVar);
                if (objS == aVar) {
                    return aVar;
                }
                return (SkuDetails) objS;
            }
        }
        return (SkuDetails) objS;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x009f -> B:22:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object u(com.android.billingclient.api.e r10, com.android.billingclient.api.x r11, mc.d<? super com.android.billingclient.api.z> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof gb.g.p
            if (r0 == 0) goto L13
            r0 = r12
            gb.g$p r0 = (gb.g.p) r0
            int r1 = r0.f30319h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30319h = r1
            goto L18
        L13:
            gb.g$p r0 = new gb.g$p
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f30317f
            nc.a r1 = nc.a.COROUTINE_SUSPENDED
            int r2 = r0.f30319h
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4f
            if (r2 == r6) goto L41
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            goto L41
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            int r10 = r0.f30316e
            java.lang.Object r11 = r0.f30315d
            com.android.billingclient.api.x r11 = (com.android.billingclient.api.x) r11
            java.lang.Object r2 = r0.f30314c
            com.android.billingclient.api.e r2 = (com.android.billingclient.api.e) r2
            h9.d.t(r12)
            goto L93
        L41:
            int r10 = r0.f30316e
            java.lang.Object r11 = r0.f30315d
            com.android.billingclient.api.x r11 = (com.android.billingclient.api.x) r11
            java.lang.Object r2 = r0.f30314c
            com.android.billingclient.api.e r2 = (com.android.billingclient.api.e) r2
            h9.d.t(r12)
            goto L63
        L4f:
            h9.d.t(r12)
            r0.f30314c = r10
            r0.f30315d = r11
            r0.f30316e = r3
            r0.f30319h = r6
            java.lang.Object r12 = com.android.billingclient.api.k.a(r10, r11, r0)
            if (r12 != r1) goto L61
            return r1
        L61:
            r2 = r10
            r10 = r3
        L63:
            com.android.billingclient.api.z r12 = (com.android.billingclient.api.z) r12
            r7 = 5
            if (r10 >= r7) goto La2
            java.lang.String r7 = "<this>"
            fd.j0.i(r12, r7)
            boolean r7 = y8.c0.w(r12)
            if (r7 != 0) goto L7d
            com.android.billingclient.api.n r7 = r12.f3886a
            int r7 = r7.f3848a
            if (r7 == 0) goto L7b
            if (r7 != r5) goto L7d
        L7b:
            r7 = r6
            goto L7e
        L7d:
            r7 = r3
        L7e:
            if (r7 == 0) goto La2
            int r10 = r10 + 1
            r7 = 500(0x1f4, double:2.47E-321)
            r0.f30314c = r2
            r0.f30315d = r11
            r0.f30316e = r10
            r0.f30319h = r5
            java.lang.Object r12 = fd.z.m(r7, r0)
            if (r12 != r1) goto L93
            return r1
        L93:
            r0.f30314c = r2
            r0.f30315d = r11
            r0.f30316e = r10
            r0.f30319h = r4
            java.lang.Object r12 = com.android.billingclient.api.k.a(r2, r11, r0)
            if (r12 != r1) goto L63
            return r1
        La2:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.g.u(com.android.billingclient.api.e, com.android.billingclient.api.x, mc.d):java.lang.Object");
    }

    public final void v() {
        if (ma.h.f33410y.a().i()) {
            return;
        }
        y8.c0.z(c1.f29556c, null, null, new q(null), 3, null);
    }
}
