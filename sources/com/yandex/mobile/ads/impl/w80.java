package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class w80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2 f26204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ba f26205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ff0 f26206d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w80(Context context, k2 k2Var) {
        this(context, k2Var, 0);
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(k2Var, "adConfiguration");
    }

    public /* synthetic */ w80(Context context, k2 k2Var, int i10) {
        this(context, k2Var, new ba(), ff0.f20682e.a());
    }

    public w80(Context context, k2 k2Var, ba baVar, ff0 ff0Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(baVar, "appMetricaIntegrationValidator");
        fd.j0.i(ff0Var, "mobileAdsIntegrationValidator");
        this.f26203a = context;
        this.f26204b = k2Var;
        this.f26205c = baVar;
        this.f26206d = ff0Var;
    }

    private final List<t2> a() {
        t2 t2VarA;
        t2 t2VarA2;
        t2[] t2VarArr = new t2[4];
        try {
            Objects.requireNonNull(this.f26205c);
            ba.a();
            t2VarA = null;
        } catch (n60 e10) {
            t2VarA = v4.a(e10.getMessage());
        }
        t2VarArr[0] = t2VarA;
        try {
            this.f26206d.a(this.f26203a);
            t2VarA2 = null;
        } catch (n60 e11) {
            t2VarA2 = v4.a(e11.getMessage());
        }
        t2VarArr[1] = t2VarA2;
        t2VarArr[2] = this.f26204b.c() == null ? v4.f25833p : null;
        t2VarArr[3] = this.f26204b.a() == null ? v4.f25831n : null;
        return kc.l.e(t2VarArr);
    }

    public final t2 b() {
        List listZ = kc.t.z(a(), kc.l.d(this.f26204b.n() == null ? v4.f25834q : null));
        String strA = this.f26204b.b().a();
        fd.j0.h(strA, "adConfiguration.adType.typeName");
        ArrayList arrayList = new ArrayList(kc.m.j(listZ, 10));
        Iterator it = ((ArrayList) listZ).iterator();
        while (it.hasNext()) {
            arrayList.add(((t2) it.next()).b());
        }
        v2.a(strA, arrayList);
        return (t2) kc.t.s(listZ);
    }

    public final t2 c() {
        return (t2) kc.t.s(a());
    }
}
