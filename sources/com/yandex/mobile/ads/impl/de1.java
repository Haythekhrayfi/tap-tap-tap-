package com.yandex.mobile.ads.impl;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class de1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f19848c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<ce1> f19849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f19850b;

    public static final class a extends yc.a<ce1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ de1 f19851a;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(de1 de1Var) {
            ce1 ce1Var = ce1.f19476a;
            this.f19851a = de1Var;
            super(ce1Var);
        }

        @Override // yc.a
        public final void afterChange(cd.i<?> iVar, ce1 ce1Var, ce1 ce1Var2) {
            fd.j0.i(iVar, "property");
            this.f19851a.f19849a.add(ce1Var2);
        }
    }

    static {
        vc.n nVar = new vc.n(de1.class, "status", "getStatus()Lcom/yandex/mobile/ads/instream/status/VideoAdStatus;", 0);
        Objects.requireNonNull(vc.b0.f36991a);
        f19848c = new cd.i[]{nVar};
    }

    public de1() {
        ce1[] ce1VarArr = {ce1.f19476a};
        fd.j0.i(ce1VarArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(kc.e0.a(1));
        kc.j.A(ce1VarArr, linkedHashSet);
        this.f19849a = linkedHashSet;
        this.f19850b = new a(this);
    }

    public final ce1 a() {
        return this.f19850b.getValue(this, f19848c[0]);
    }

    public final boolean a(ce1 ce1Var) {
        fd.j0.i(ce1Var, "videoAdStatus");
        return this.f19849a.contains(ce1Var);
    }

    public final void b() {
        this.f19849a.clear();
        b(ce1.f19476a);
    }

    public final void b(ce1 ce1Var) {
        fd.j0.i(ce1Var, "<set-?>");
        this.f19850b.setValue(this, f19848c[0], ce1Var);
    }
}
