package com.zipoapps.premiumhelper;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.ads.AdValue;
import com.zipoapps.blytics.BLyticsEngine;
import com.zipoapps.premiumhelper.util.ActivePurchaseInfo;
import fd.c1;
import fd.g0;
import fd.j0;
import fd.s0;
import fd.s1;
import gb.t;
import gb.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Queue;
import jc.w;
import kd.q;
import kd.z;
import kotlin.reflect.KProperty;
import org.slf4j.Logger;
import uc.p;
import vc.b0;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f28252m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f28253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oa.b f28254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ma.f f28255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ta.e f28256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f28259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f28260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Queue<ka.b> f28261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final md.b f28262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f28263k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<uc.a<w>> f28264l;

    /* JADX INFO: renamed from: com.zipoapps.premiumhelper.a$a, reason: collision with other inner class name */
    public enum EnumC0235a {
        ONBOARDING("onboarding"),
        MAIN_ACTIVITY("main_activity"),
        SETTINGS("settings"),
        PREFERENCE("preference"),
        MENU("menu");

        private final String value;

        EnumC0235a(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public enum b {
        DIALOG("dialog"),
        IN_APP_REVIEW("in_app_review");

        private final String value;

        b(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public enum c {
        UNKNOWN(AppLovinMediationProvider.UNKNOWN),
        HOLD("hold"),
        RECOVERED("recovered"),
        CANCELLED("cancelled");

        private final String value;

        c(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.Analytics", f = "Analytics.kt", l = {77, 670}, m = "init$premium_helper_4_4_2_alpha5_regularRelease")
    public static final class d extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f28265c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f28266d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f28267e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f28269g;

        public d(mc.d<? super d> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f28267e = obj;
            this.f28269g |= Integer.MIN_VALUE;
            return a.this.e(this);
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.Analytics$init$2", f = "Analytics.kt", l = {}, m = "invokeSuspend")
    public static final class e extends oc.h implements p<g0, mc.d<? super w>, Object> {
        public e(mc.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return a.this.new e(dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            e eVar = a.this.new e(dVar);
            w wVar = w.f31842a;
            eVar.invokeSuspend(wVar);
            return wVar;
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            h9.d.t(obj);
            w wVar = null;
            ((BLyticsEngine) g6.c.f30013d.f30015b).d(null);
            a aVar2 = a.this;
            ta.a aVar3 = new ta.a(a.this.f28253a);
            if (aVar3.f35869b != null) {
                xe.a.b(ta.a.f35867c).b("Trying to register second ActivityLifeCycleLogger", new Object[0]);
                wVar = w.f31842a;
            }
            if (wVar == null) {
                ta.a.C0420a c0420a = new ta.a.C0420a(aVar3);
                aVar3.f35869b = c0420a;
                aVar3.f35868a.registerActivityLifecycleCallbacks(c0420a);
            }
            Objects.requireNonNull(aVar2);
            return w.f31842a;
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.Analytics$onAppOpened$1", f = "Analytics.kt", l = {510}, m = "invokeSuspend")
    public static final class f extends oc.h implements p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f28271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f28272d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ v f28274f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(v vVar, mc.d<? super f> dVar) {
            super(2, dVar);
            this.f28274f = vVar;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return a.this.new f(this.f28274f, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return a.this.new f(this.f28274f, dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28272d;
            if (i10 == 0) {
                h9.d.t(obj);
                a aVar3 = a.this;
                v vVar = this.f28274f;
                this.f28271c = aVar3;
                this.f28272d = 1;
                Objects.requireNonNull(vVar);
                Object objV = c0.V(s0.f29620b, new t(vVar, null), this);
                if (objV == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
                obj = objV;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (a) this.f28271c;
                h9.d.t(obj);
            }
            String str = (String) obj;
            Objects.requireNonNull(aVar);
            j0.i(str, "installReferrer");
            if (str.length() == 0) {
                str = "not_set";
            }
            aVar.t("Install", androidx.activity.i.a(new jc.h("source", str)));
            return w.f31842a;
        }
    }

    public static final class g extends gb.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ v f28276d;

        /* JADX INFO: renamed from: com.zipoapps.premiumhelper.a$g$a, reason: collision with other inner class name */
        @oc.e(c = "com.zipoapps.premiumhelper.Analytics$onAppOpened$2$onActivityResumed$1", f = "Analytics.kt", l = {527}, m = "invokeSuspend")
        public static final class C0236a extends oc.h implements p<g0, mc.d<? super w>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Object f28277c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Object f28278d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f28279e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ a f28280f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ String f28281g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ v f28282h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0236a(a aVar, String str, v vVar, mc.d<? super C0236a> dVar) {
                super(2, dVar);
                this.f28280f = aVar;
                this.f28281g = str;
                this.f28282h = vVar;
            }

            @Override // oc.a
            public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                return new C0236a(this.f28280f, this.f28281g, this.f28282h, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
                return new C0236a(this.f28280f, this.f28281g, this.f28282h, dVar).invokeSuspend(w.f31842a);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                a aVar;
                String str;
                String value;
                nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
                int i10 = this.f28279e;
                boolean z10 = true;
                if (i10 == 0) {
                    h9.d.t(obj);
                    aVar = this.f28280f;
                    String str2 = this.f28281g;
                    v vVar = this.f28282h;
                    this.f28277c = aVar;
                    this.f28278d = str2;
                    this.f28279e = 1;
                    Objects.requireNonNull(vVar);
                    Object objV = c0.V(s0.f29620b, new t(vVar, null), this);
                    if (objV == aVar2) {
                        return aVar2;
                    }
                    str = str2;
                    obj = objV;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.f28278d;
                    aVar = (a) this.f28277c;
                    h9.d.t(obj);
                }
                String str3 = (String) obj;
                ActivePurchaseInfo activePurchaseInfoG = this.f28280f.f28255c.g();
                Objects.requireNonNull(aVar);
                j0.i(str, "launchFrom");
                j0.i(str3, "installReferrer");
                if (aVar.f28258f) {
                    try {
                        ka.b bVarC = aVar.c("App_open", new Bundle[0]);
                        bVarC.f31964c.putString("source", str);
                        if (str3.length() <= 0) {
                            z10 = false;
                        }
                        if (z10) {
                            bVarC.f31964c.putString("referrer", str3);
                        }
                        if (activePurchaseInfoG != null) {
                            com.zipoapps.premiumhelper.util.d status = activePurchaseInfoG.getStatus();
                            if (status == null || (value = status.getValue()) == null) {
                                value = "";
                            }
                            bVarC.b("days_since_purchase", Integer.valueOf(com.zipoapps.premiumhelper.util.c.h(activePurchaseInfoG.getPurchaseTime())));
                            bVarC.f31964c.putString("status", value);
                            aVar.f28264l.add(new ma.b(aVar, value));
                        } else {
                            String str4 = aVar.f28255c.f33405a.getBoolean("has_history_purchases", false) ? "back_to_free" : "free";
                            bVarC.f31964c.putString("status", str4);
                            aVar.f28264l.add(new ma.c(aVar, str4));
                            c0.z(c1.f29556c, null, null, new ma.a(aVar, null), 3, null);
                        }
                        aVar.s();
                        aVar.u(bVarC);
                    } catch (Throwable th) {
                        aVar.d().k(6, th, null, new Object[0]);
                    }
                }
                return w.f31842a;
            }
        }

        public g(v vVar) {
            this.f28276d = vVar;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002e  */
        @Override // gb.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            String str;
            j0.i(activity, "activity");
            Intent intent = activity.getIntent();
            if (intent == null) {
                str = "launcher";
            } else {
                if (intent.getBooleanExtra("notification", false)) {
                    str = "notification";
                } else if (intent.getBooleanExtra("widget", false)) {
                    str = "widget";
                } else {
                    str = intent.getBooleanExtra("shortcut", false) ? "shortcut" : null;
                }
                if (str == null) {
                    str = "launcher";
                }
            }
            c0.z(c1.f29556c, null, null, new C0236a(a.this, str, this.f28276d, null), 3, null);
            Intent intent2 = activity.getIntent();
            if (intent2 != null) {
                intent2.putExtra("notification", false);
                intent2.putExtra("widget", false);
                intent2.putExtra("shortcut", false);
            }
            a.this.f28253a.unregisterActivityLifecycleCallbacks(this);
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.Analytics$onPaidImpression$1", f = "Analytics.kt", l = {}, m = "invokeSuspend")
    public static final class h extends oc.h implements p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Bundle f28284d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Bundle bundle, mc.d<? super h> dVar) {
            super(2, dVar);
            this.f28284d = bundle;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return a.this.new h(this.f28284d, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            a aVar = a.this;
            aVar.new h(this.f28284d, dVar);
            w wVar = w.f31842a;
            nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
            h9.d.t(wVar);
            KProperty<Object>[] kPropertyArr = a.f28252m;
            Objects.requireNonNull(aVar);
            return wVar;
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            h9.d.t(obj);
            a aVar2 = a.this;
            KProperty<Object>[] kPropertyArr = a.f28252m;
            Objects.requireNonNull(aVar2);
            return w.f31842a;
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.Analytics$sendEvent$1", f = "Analytics.kt", l = {670}, m = "invokeSuspend")
    public static final class i extends oc.h implements p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f28285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f28286d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f28287e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f28288f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ka.b f28290h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ka.b bVar, mc.d<? super i> dVar) {
            super(2, dVar);
            this.f28290h = bVar;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return a.this.new i(this.f28290h, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return a.this.new i(this.f28290h, dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            md.b bVar;
            ka.b bVar2;
            nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28288f;
            if (i10 == 0) {
                h9.d.t(obj);
                aVar = a.this;
                md.b bVar3 = aVar.f28262j;
                ka.b bVar4 = this.f28290h;
                this.f28285c = bVar3;
                this.f28286d = aVar;
                this.f28287e = bVar4;
                this.f28288f = 1;
                if (bVar3.b(null, this) == aVar2) {
                    return aVar2;
                }
                bVar = bVar3;
                bVar2 = bVar4;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar2 = (ka.b) this.f28287e;
                aVar = (a) this.f28286d;
                bVar = (md.b) this.f28285c;
                h9.d.t(obj);
            }
            try {
                aVar.f28261i.add(bVar2);
                if (aVar.f28263k) {
                    aVar.a();
                }
                return w.f31842a;
            } finally {
                bVar.a(null);
            }
        }
    }

    static {
        vc.t tVar = new vc.t(a.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(b0.f36991a);
        f28252m = new cd.i[]{tVar};
    }

    public a(Application application, oa.b bVar, ma.f fVar) {
        j0.i(application, "application");
        j0.i(bVar, "configuration");
        j0.i(fVar, "preferences");
        this.f28253a = application;
        this.f28254b = bVar;
        this.f28255c = fVar;
        this.f28256d = new ta.e(null);
        this.f28258f = true;
        this.f28259g = "";
        this.f28260h = "";
        new HashMap();
        this.f28261i = new LinkedList();
        z zVar = md.e.f33553a;
        this.f28262j = new md.c(false);
        this.f28264l = new ArrayList();
    }

    public final void a() {
        w wVar;
        g6.c cVar;
        do {
            wVar = null;
            try {
                ka.b bVarPoll = this.f28261i.poll();
                if (bVarPoll != null && (cVar = g6.c.f30013d) != null) {
                    cVar.i(bVarPoll);
                    wVar = w.f31842a;
                }
            } catch (Throwable th) {
                d().k(6, th, null, new Object[0]);
                return;
            }
        } while (wVar != null);
    }

    public final ka.b b(String str, boolean z10, Bundle... bundleArr) {
        ka.b bVar = new ka.b(str, z10);
        bVar.b("days_since_install", Integer.valueOf(com.zipoapps.premiumhelper.util.c.g(this.f28253a)));
        bVar.f31965d.add(new ka.a(bVar.f31962a, "occurrence", 2));
        for (Bundle bundle : bundleArr) {
            Bundle bundle2 = bVar.f31964c;
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
            bundle2.putAll(bundle);
        }
        return bVar;
    }

    public final ka.b c(String str, Bundle... bundleArr) {
        return b(str, true, (Bundle[]) Arrays.copyOf(bundleArr, bundleArr.length));
    }

    public final ta.d d() {
        return this.f28256d.a(this, f28252m[0]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(mc.d<? super w> dVar) {
        d dVar2;
        a aVar;
        md.b bVar;
        a aVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f28269g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f28269g = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f28267e;
        nc.a aVar3 = nc.a.COROUTINE_SUSPENDED;
        int i11 = dVar2.f28269g;
        if (i11 != 0) {
            if (i11 == 1) {
                aVar = (a) dVar2.f28265c;
                h9.d.t(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (md.b) dVar2.f28266d;
                aVar2 = (a) dVar2.f28265c;
                h9.d.t(obj);
            }
            try {
                aVar2.a();
                return w.f31842a;
            } finally {
                bVar.a(null);
            }
        }
        h9.d.t(obj);
        if (g6.c.f30013d != null) {
            return w.f31842a;
        }
        Application application = this.f28253a;
        String str = (String) this.f28254b.h(oa.b.f34197t);
        boolean zL = this.f28254b.l();
        g6.c cVar = new g6.c(application, null);
        g6.c.f30013d = cVar;
        BLyticsEngine bLyticsEngine = (BLyticsEngine) cVar.f30015b;
        Objects.requireNonNull(bLyticsEngine);
        xe.a.b("BLytics").g("Initializing...", new Object[0]);
        bLyticsEngine.f28214g = str;
        ArrayList arrayList = new ArrayList();
        ArrayList<com.zipoapps.blytics.a> arrayList2 = new ArrayList();
        arrayList2.add(new la.a());
        arrayList2.add(new la.b());
        if (zL) {
            arrayList2.add(new la.c());
        }
        for (com.zipoapps.blytics.a aVar4 : arrayList2) {
            if (aVar4.c(bLyticsEngine.f28208a)) {
                arrayList.add(aVar4);
            }
        }
        bLyticsEngine.f28213f = arrayList;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((com.zipoapps.blytics.a) it.next()).b(bLyticsEngine.f28208a, zL);
            } catch (Throwable unused) {
                xe.a.b("BLytics").b("Failed to initialize platform", new Object[0]);
            }
        }
        if (this.f28260h.length() > 0) {
            g6.c.f30013d.e(this.f28260h);
        }
        s();
        this.f28263k = true;
        fd.c0 c0Var = s0.f29619a;
        s1 s1Var = q.f32064a;
        e eVar = new e(null);
        dVar2.f28265c = this;
        dVar2.f28269g = 1;
        if (c0.V(s1Var, eVar, dVar2) == aVar3) {
            return aVar3;
        }
        aVar = this;
        md.b bVar2 = aVar.f28262j;
        dVar2.f28265c = aVar;
        dVar2.f28266d = bVar2;
        dVar2.f28269g = 2;
        if (bVar2.b(null, dVar2) == aVar3) {
            return aVar3;
        }
        bVar = bVar2;
        aVar2 = aVar;
        aVar2.a();
        return w.f31842a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final void f(com.zipoapps.ads.a.EnumC0215a enumC0215a, String str) {
        j0.i(enumC0215a, "type");
        try {
            try {
                ka.b bVarC = c("Ad_clicked", new Bundle[0]);
                try {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        try {
                            sb2.append("occurrence_");
                            try {
                                String strName = enumC0215a.name();
                                try {
                                    Locale locale = Locale.ROOT;
                                    try {
                                        j0.h(locale, Logger.ROOT_LOGGER_NAME);
                                        try {
                                            String lowerCase = strName.toLowerCase(locale);
                                            try {
                                                j0.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                                                try {
                                                    sb2.append(lowerCase);
                                                    try {
                                                        sb2.append("_clicked");
                                                        try {
                                                            try {
                                                                bVarC.a(sb2.toString(), 2);
                                                                try {
                                                                    String strName2 = enumC0215a.name();
                                                                    try {
                                                                        j0.h(locale, Logger.ROOT_LOGGER_NAME);
                                                                        try {
                                                                            String lowerCase2 = strName2.toLowerCase(locale);
                                                                            try {
                                                                                j0.h(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                                                                                try {
                                                                                    try {
                                                                                        bVarC.f31964c.putString("type", lowerCase2);
                                                                                        if (str == null) {
                                                                                            g6.c.f30013d.i(bVarC);
                                                                                            return;
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                bVarC.f31964c.putString("source", str);
                                                                                                try {
                                                                                                    try {
                                                                                                        g6.c.f30013d.i(bVarC);
                                                                                                        return;
                                                                                                    } catch (Throwable th) {
                                                                                                        th = th;
                                                                                                    }
                                                                                                } catch (Throwable th2) {
                                                                                                    th = th2;
                                                                                                }
                                                                                            } catch (Throwable th3) {
                                                                                                th = th3;
                                                                                            }
                                                                                        } catch (Throwable th4) {
                                                                                            th = th4;
                                                                                        }
                                                                                    } catch (Throwable th5) {
                                                                                        th = th5;
                                                                                    }
                                                                                } catch (Throwable th6) {
                                                                                    th = th6;
                                                                                }
                                                                            } catch (Throwable th7) {
                                                                                th = th7;
                                                                            }
                                                                        } catch (Throwable th8) {
                                                                            th = th8;
                                                                        }
                                                                    } catch (Throwable th9) {
                                                                        th = th9;
                                                                    }
                                                                } catch (Throwable th10) {
                                                                    th = th10;
                                                                }
                                                            } catch (Throwable th11) {
                                                                th = th11;
                                                            }
                                                        } catch (Throwable th12) {
                                                            th = th12;
                                                        }
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                    }
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                }
                                            } catch (Throwable th15) {
                                                th = th15;
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                        }
                                    } catch (Throwable th17) {
                                        th = th17;
                                    }
                                } catch (Throwable th18) {
                                    th = th18;
                                }
                            } catch (Throwable th19) {
                                th = th19;
                            }
                        } catch (Throwable th20) {
                            th = th20;
                        }
                    } catch (Throwable th21) {
                        th = th21;
                    }
                } catch (Throwable th22) {
                    th = th22;
                }
            } catch (Throwable th23) {
                th = th23;
            }
        } catch (Throwable th24) {
            th = th24;
        }
        d().k(6, th, null, new Object[0]);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final void h(com.zipoapps.ads.a.EnumC0215a enumC0215a, String str) {
        j0.i(enumC0215a, "type");
        try {
            try {
                ka.b bVarC = c("Ad_shown", new Bundle[0]);
                try {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        try {
                            sb2.append("occurrence_");
                            try {
                                String strName = enumC0215a.name();
                                try {
                                    Locale locale = Locale.ROOT;
                                    try {
                                        j0.h(locale, Logger.ROOT_LOGGER_NAME);
                                        try {
                                            String lowerCase = strName.toLowerCase(locale);
                                            try {
                                                j0.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                                                try {
                                                    sb2.append(lowerCase);
                                                    try {
                                                        sb2.append("_shown");
                                                        try {
                                                            try {
                                                                bVarC.a(sb2.toString(), 2);
                                                                try {
                                                                    String strName2 = enumC0215a.name();
                                                                    try {
                                                                        j0.h(locale, Logger.ROOT_LOGGER_NAME);
                                                                        try {
                                                                            String lowerCase2 = strName2.toLowerCase(locale);
                                                                            try {
                                                                                j0.h(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                                                                                try {
                                                                                    try {
                                                                                        bVarC.f31964c.putString("type", lowerCase2);
                                                                                        if (str == null) {
                                                                                            g6.c.f30013d.i(bVarC);
                                                                                            return;
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                bVarC.f31964c.putString("source", str);
                                                                                                try {
                                                                                                    try {
                                                                                                        g6.c.f30013d.i(bVarC);
                                                                                                        return;
                                                                                                    } catch (Throwable th) {
                                                                                                        th = th;
                                                                                                    }
                                                                                                } catch (Throwable th2) {
                                                                                                    th = th2;
                                                                                                }
                                                                                            } catch (Throwable th3) {
                                                                                                th = th3;
                                                                                            }
                                                                                        } catch (Throwable th4) {
                                                                                            th = th4;
                                                                                        }
                                                                                    } catch (Throwable th5) {
                                                                                        th = th5;
                                                                                    }
                                                                                } catch (Throwable th6) {
                                                                                    th = th6;
                                                                                }
                                                                            } catch (Throwable th7) {
                                                                                th = th7;
                                                                            }
                                                                        } catch (Throwable th8) {
                                                                            th = th8;
                                                                        }
                                                                    } catch (Throwable th9) {
                                                                        th = th9;
                                                                    }
                                                                } catch (Throwable th10) {
                                                                    th = th10;
                                                                }
                                                            } catch (Throwable th11) {
                                                                th = th11;
                                                            }
                                                        } catch (Throwable th12) {
                                                            th = th12;
                                                        }
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                    }
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                }
                                            } catch (Throwable th15) {
                                                th = th15;
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                        }
                                    } catch (Throwable th17) {
                                        th = th17;
                                    }
                                } catch (Throwable th18) {
                                    th = th18;
                                }
                            } catch (Throwable th19) {
                                th = th19;
                            }
                        } catch (Throwable th20) {
                            th = th20;
                        }
                    } catch (Throwable th21) {
                        th = th21;
                    }
                } catch (Throwable th22) {
                    th = th22;
                }
            } catch (Throwable th23) {
                th = th23;
            }
        } catch (Throwable th24) {
            th = th24;
        }
        d().k(6, th, null, new Object[0]);
    }

    public final void j(v vVar) {
        j0.i(vVar, "installReferrer");
        boolean z10 = false;
        if (this.f28255c.f33405a.getInt("app_start_counter", 0) == 0) {
            Application application = this.f28253a;
            j0.i(application, CoreConstants.CONTEXT_SCOPE_VALUE);
            try {
                PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
                if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                    z10 = true;
                }
            } catch (Throwable unused) {
            }
            if (!z10) {
                c0.z(c1.f29556c, null, null, new f(vVar, null), 3, null);
            }
        }
        this.f28253a.registerActivityLifecycleCallbacks(new g(vVar));
    }

    public final void k(wa.a.EnumC0448a enumC0448a) {
        j0.i(enumC0448a, "happyMomentRateMode");
        t("Happy_Moment", androidx.activity.i.a(new jc.h("happy_moment", enumC0448a.name())));
    }

    public final void l(Bundle bundle) {
        u(b("paid_ad_impression", false, bundle));
        c0.z(fd.z.a(s0.f29619a), null, null, new h(bundle, null), 3, null);
    }

    public final void m(String str, AdValue adValue, String str2) {
        j0.i(str, "adUnitId");
        jc.h[] hVarArr = new jc.h[7];
        hVarArr[0] = new jc.h("valuemicros", Long.valueOf(adValue.getValueMicros()));
        hVarArr[1] = new jc.h("value", Float.valueOf(adValue.getValueMicros() / 1000000.0f));
        hVarArr[2] = new jc.h(AppLovinEventParameters.REVENUE_CURRENCY, adValue.getCurrencyCode());
        hVarArr[3] = new jc.h("precision", Integer.valueOf(adValue.getPrecisionType()));
        hVarArr[4] = new jc.h("adunitid", str);
        hVarArr[5] = new jc.h("mediation", AppLovinMediationProvider.ADMOB);
        if (str2 == null) {
            str2 = AppLovinMediationProvider.UNKNOWN;
        }
        hVarArr[6] = new jc.h("network", str2);
        l(androidx.activity.i.a(hVarArr));
    }

    public final void n(String str, String str2) {
        j0.i(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        t("Purchase_impression", androidx.activity.i.a(new jc.h(AppLovinEventParameters.PRODUCT_IDENTIFIER, str), new jc.h("offer", str2)));
    }

    public final void o(String str, String str2) {
        j0.i(str2, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        this.f28259g = str;
        t("Purchase_started", androidx.activity.i.a(new jc.h("offer", str), new jc.h(AppLovinEventParameters.PRODUCT_IDENTIFIER, str2)));
    }

    public final void p(String str) {
        j0.i(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        t("Purchase_success", androidx.activity.i.a(new jc.h("offer", this.f28259g), new jc.h(AppLovinEventParameters.PRODUCT_IDENTIFIER, str)));
    }

    public final void q() {
        t("Rate_us_positive", new Bundle[0]);
    }

    public final void r(b bVar) {
        j0.i(bVar, "type");
        t("Rate_us_shown", androidx.activity.i.a(new jc.h("type", bVar.getValue())));
    }

    public final void s() {
        if (g6.c.f30013d != null) {
            Iterator<T> it = this.f28264l.iterator();
            while (it.hasNext()) {
                ((uc.a) it.next()).invoke();
            }
            this.f28264l.clear();
        }
    }

    public final void t(String str, Bundle... bundleArr) {
        u(c(str, (Bundle[]) Arrays.copyOf(bundleArr, bundleArr.length)));
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public final void u(ka.b bVar) {
        j0.i(bVar, "event");
        c0.z(fd.z.a(s0.f29619a), null, null, new i(bVar, null), 3, null);
    }

    public final <T> void v(String str, T t10) {
        w wVar;
        try {
            g6.c cVar = g6.c.f30013d;
            if (cVar != null) {
                cVar.f(str, t10);
                wVar = w.f31842a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                d().b("Error. Trying to set user property before analytics initialization: " + str, new Object[0]);
            }
        } catch (Throwable th) {
            d().k(6, th, null, new Object[0]);
        }
    }
}
