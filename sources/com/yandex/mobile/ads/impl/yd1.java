package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class yd1 implements be1.a, sd1.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f26775k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    private static final long f26776l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w3 f26777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final eg1 f26778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final be1 f26779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sd1 f26780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ae1 f26781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final hf1 f26782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final xp0 f26783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f26784h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a f26785i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f26786j;

    public static final class a extends yc.a<fw0.a> {
        public a() {
            super(null);
        }

        @Override // yc.a
        public final void afterChange(cd.i<?> iVar, fw0.a aVar, fw0.a aVar2) {
            fd.j0.i(iVar, "property");
            yd1.this.f26781e.a(aVar2);
        }
    }

    public static final class b extends yc.a<fw0.a> {
        public b() {
            super(null);
        }

        @Override // yc.a
        public final void afterChange(cd.i<?> iVar, fw0.a aVar, fw0.a aVar2) {
            fd.j0.i(iVar, "property");
            yd1.this.f26781e.b(aVar2);
        }
    }

    static {
        vc.n nVar = new vc.n(yd1.class, "adParameterManager", "getAdParameterManager()Lcom/yandex/mobile/ads/core/report/Report$ReportParameterManager;", 0);
        vc.c0 c0Var = vc.b0.f36991a;
        Objects.requireNonNull(c0Var);
        vc.n nVar2 = new vc.n(yd1.class, "requestParameterManager", "getRequestParameterManager()Lcom/yandex/mobile/ads/core/report/Report$ReportParameterManager;", 0);
        Objects.requireNonNull(c0Var);
        f26775k = new cd.i[]{nVar, nVar2};
        f26776l = TimeUnit.SECONDS.toMillis(10L);
    }

    public yd1(Context context, sc1<?> sc1Var, w3 w3Var, de1 de1Var, lg1 lg1Var, rf1 rf1Var, eg1 eg1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(sc1Var, "videoAdInfo");
        fd.j0.i(w3Var, "adLoadingPhasesManager");
        fd.j0.i(de1Var, "videoAdStatusController");
        fd.j0.i(lg1Var, "videoViewProvider");
        fd.j0.i(rf1Var, "renderValidator");
        fd.j0.i(eg1Var, "videoTracker");
        this.f26777a = w3Var;
        this.f26778b = eg1Var;
        this.f26779c = new be1(rf1Var, this);
        this.f26780d = new sd1(de1Var, this);
        this.f26781e = new ae1(context, w3Var);
        this.f26782f = new hf1(sc1Var, lg1Var);
        this.f26783g = new xp0(false);
        this.f26785i = new a();
        this.f26786j = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(yd1 yd1Var) {
        fd.j0.i(yd1Var, "this$0");
        yd1Var.a(new pd1(8, new so()));
    }

    @Override // com.yandex.mobile.ads.impl.be1.a
    public final void a() {
        this.f26779c.b();
        this.f26777a.b(v3.f25809l);
        this.f26778b.i();
        this.f26780d.a();
        this.f26783g.a(f26776l, new ho1(this));
    }

    public final void a(fw0.a aVar) {
        this.f26785i.setValue(this, f26775k[0], aVar);
    }

    public final void a(pd1 pd1Var) {
        fd.j0.i(pd1Var, "error");
        this.f26779c.b();
        this.f26780d.b();
        this.f26783g.a();
        if (this.f26784h) {
            return;
        }
        this.f26784h = true;
        String lowerCase = od1.a(pd1Var.a()).toLowerCase(Locale.ROOT);
        fd.j0.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String message = pd1Var.b().getMessage();
        if (message == null) {
            message = "";
        }
        this.f26781e.a(lowerCase, message);
    }

    @Override // com.yandex.mobile.ads.impl.sd1.a
    public final void b() {
        this.f26781e.a((Map<String, ? extends Object>) this.f26782f.a());
        this.f26777a.a(v3.f25809l);
        if (this.f26784h) {
            return;
        }
        this.f26784h = true;
        this.f26781e.a();
    }

    public final void b(fw0.a aVar) {
        this.f26786j.setValue(this, f26775k[1], aVar);
    }

    public final void c() {
        this.f26779c.b();
        this.f26780d.b();
        this.f26783g.a();
    }

    public final void d() {
        this.f26779c.b();
        this.f26780d.b();
        this.f26783g.a();
    }

    public final void e() {
        this.f26784h = false;
        this.f26781e.a((Map<String, ? extends Object>) null);
        this.f26779c.b();
        this.f26780d.b();
        this.f26783g.a();
    }

    public final void f() {
        this.f26779c.a();
    }
}
