package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ld<T extends ViewGroup> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewGroup f22692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c80<T> f22693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b80<T> f22694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kd<T> f22695e;

    public /* synthetic */ ld(Context context, com.yandex.mobile.ads.banner.g gVar, List list, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this(context, gVar, list, onPreDrawListener, new c80(list), new b80(), new kd(onPreDrawListener));
    }

    public ld(Context context, com.yandex.mobile.ads.banner.g gVar, List list, ViewTreeObserver.OnPreDrawListener onPreDrawListener, c80 c80Var, b80 b80Var, kd kdVar) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(gVar, "container");
        fd.j0.i(list, "designs");
        fd.j0.i(onPreDrawListener, "preDrawListener");
        fd.j0.i(c80Var, "layoutDesignProvider");
        fd.j0.i(b80Var, "layoutDesignCreator");
        fd.j0.i(kdVar, "layoutDesignBinder");
        this.f22691a = context;
        this.f22692b = gVar;
        this.f22693c = c80Var;
        this.f22694d = b80Var;
        this.f22695e = kdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final void a() {
        ViewGroup viewGroupA;
        z70<V> z70VarA = this.f22693c.a(this.f22691a);
        if (z70VarA == 0 || (viewGroupA = this.f22694d.a(this.f22692b, z70VarA)) == null) {
            return;
        }
        this.f22695e.a(this.f22692b, viewGroupA, z70VarA);
    }

    public final void b() {
        this.f22695e.a(this.f22692b);
    }
}
