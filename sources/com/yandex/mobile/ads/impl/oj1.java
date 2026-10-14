package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class oj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ac1 f23834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mj1 f23835c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nj1 f23837e = new nj1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final pj1 f23838f = new pj1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jc1 f23836d = new jc1();

    public oj1(Context context, ac1 ac1Var) {
        this.f23833a = context.getApplicationContext();
        this.f23834b = ac1Var;
        this.f23835c = new mj1(ac1Var);
    }

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ac1 ac1Var = (ac1) it.next();
            ArrayList arrayListA = this.f23835c.a(ac1Var);
            nj1 nj1Var = this.f23837e;
            ac1 ac1Var2 = this.f23834b;
            Objects.requireNonNull(nj1Var);
            nc1 nc1VarA = nj1.a(ac1Var, ac1Var2);
            pj1 pj1Var = this.f23838f;
            ac1 ac1Var3 = this.f23834b;
            Objects.requireNonNull(pj1Var);
            hh1 hh1VarA = pj1.a(ac1Var, ac1Var3);
            Objects.requireNonNull(this.f23836d);
            Map<String, List<String>> mapH = ac1Var.h();
            jc1 jc1Var = this.f23836d;
            ac1 ac1Var4 = this.f23834b;
            Objects.requireNonNull(jc1Var);
            Map<String, List<String>> mapH2 = ac1Var4.h();
            ArrayList arrayListD = ac1Var.d();
            ArrayList arrayListD2 = this.f23834b.d();
            ArrayList arrayList2 = new ArrayList(arrayListD);
            arrayList2.addAll(arrayListD2);
            ac1.a aVarB = new ac1.a(this.f23833a, ac1Var.o()).b(arrayListA);
            for (Map.Entry<String, List<String>> entry : mapH.entrySet()) {
                Iterator<String> it2 = entry.getValue().iterator();
                while (it2.hasNext()) {
                    aVarB.a(entry.getKey(), it2.next());
                }
            }
            ac1.a aVarA = aVarB.a(ac1Var.b()).b(ac1Var.c()).c(ac1Var.f()).e(ac1Var.j()).f(ac1Var.k()).a(nc1VarA).a(hh1VarA).a(ac1Var.n());
            for (Map.Entry<String, List<String>> entry2 : mapH2.entrySet()) {
                Iterator<String> it3 = entry2.getValue().iterator();
                while (it3.hasNext()) {
                    aVarA.a(entry2.getKey(), it3.next());
                }
            }
            arrayList.add(aVarA.a(arrayList2).a());
        }
        return arrayList;
    }
}
