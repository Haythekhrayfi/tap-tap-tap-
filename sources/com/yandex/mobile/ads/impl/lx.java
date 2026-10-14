package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.impl.qx;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class lx<T extends qx> implements gx<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hx<T> f22800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lw0<fx, gx<T>> f22801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private gx<T> f22802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dx0 f22803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private fx f22804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private T f22805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f22806h;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22807a;

        static {
            int[] iArr = new int[z3.values().length];
            iArr[2] = 1;
            iArr[3] = 2;
            f22807a = iArr;
        }
    }

    public /* synthetic */ lx(Context context, hx hxVar, ix ixVar) {
        this(context, hxVar, ixVar, hxVar.a(context), new dx0());
    }

    public lx(Context context, hx hxVar, ix ixVar, gx gxVar, dx0 dx0Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(hxVar, "factory");
        fd.j0.i(ixVar, "repository");
        fd.j0.i(gxVar, "currentController");
        fd.j0.i(dx0Var, "resourceUtils");
        this.f22799a = context;
        this.f22800b = hxVar;
        this.f22801c = ixVar;
        this.f22802d = gxVar;
        this.f22803e = dx0Var;
        AdRequest adRequestBuild = new AdRequest.Builder().build();
        fd.j0.h(adRequestBuild, "Builder().build()");
        this.f22804f = new fx(null, adRequestBuild, dx0.a(context));
    }

    private final void a(gx<T> gxVar, AdRequest adRequest) {
        gxVar.c();
        this.f22802d.a(adRequest);
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final void a(AdRequest adRequest) {
        fd.j0.i(adRequest, "adRequest");
        fx fxVarA = fx.a(this.f22804f, null, adRequest, 0, 5);
        this.f22804f = fxVarA;
        gx<T> gxVarA = this.f22801c.a(fxVarA);
        z3 z3VarD = gxVarA != null ? gxVarA.d() : null;
        StringBuilder sbA = v60.a("Checking cache with: ");
        sbA.append(this.f22804f);
        sbA.append(". State: ");
        sbA.append(z3VarD);
        x60.b(sbA.toString(), new Object[0]);
        int i10 = z3VarD == null ? -1 : a.f22807a[z3VarD.ordinal()];
        if (i10 == -1) {
            this.f22802d.a(adRequest);
            return;
        }
        if (i10 == 1) {
            gxVarA.a(this.f22805g);
            Boolean bool = this.f22806h;
            if (bool != null) {
                gxVarA.setShouldOpenLinksInApp(bool.booleanValue());
            }
            this.f22802d.a((T) null);
            this.f22802d.c();
            this.f22802d = gxVarA;
            return;
        }
        if (i10 != 2) {
            a(gxVarA, adRequest);
            return;
        }
        gxVarA.a(this.f22805g);
        Boolean bool2 = this.f22806h;
        if (bool2 != null) {
            gxVarA.setShouldOpenLinksInApp(bool2.booleanValue());
        }
        this.f22802d.a((T) null);
        this.f22802d.c();
        this.f22802d = gxVarA;
        T t10 = this.f22805g;
        if (t10 != null) {
            t10.onAdLoaded();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.yandex.mobile.ads.impl.gx
    public final void a(Object obj) {
        T t10 = (T) obj;
        this.f22802d.a(t10);
        this.f22805g = t10;
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final void a(String str) {
        this.f22802d.a(str);
        this.f22804f = fx.a(this.f22804f, str, null, 0, 6);
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final boolean a() {
        return this.f22802d.a();
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final void b() {
        this.f22802d.b();
        fx fxVar = this.f22804f;
        dx0 dx0Var = this.f22803e;
        Context context = this.f22799a;
        Objects.requireNonNull(dx0Var);
        fx fxVarA = fx.a(fxVar, null, null, dx0.a(context), 3);
        this.f22804f = fxVarA;
        if (this.f22801c.b(fxVarA)) {
            return;
        }
        gx<T> gxVarA = this.f22800b.a(this.f22799a);
        fx fxVar2 = this.f22804f;
        String strB = fxVar2.b();
        if (strB != null) {
            gxVarA.a(strB);
        }
        gxVarA.a(fxVar2.a());
        x60.b("Loading new. Save with: " + this.f22804f, new Object[0]);
        this.f22801c.a(this.f22804f, gxVarA);
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final void c() {
        x60.b("Destroy cacheable controller", new Object[0]);
        this.f22802d.c();
        this.f22801c.clear();
        this.f22805g = null;
        this.f22806h = null;
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final z3 d() {
        return this.f22802d.d();
    }

    @Override // com.yandex.mobile.ads.impl.gx
    public final void setShouldOpenLinksInApp(boolean z10) {
        this.f22802d.setShouldOpenLinksInApp(z10);
        this.f22806h = Boolean.valueOf(z10);
    }
}
