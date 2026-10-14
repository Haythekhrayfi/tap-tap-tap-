package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class mj1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ac1 f23103b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj1 f23102a = new qj1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y71 f23104c = new y71();

    public mj1(ac1 ac1Var) {
        this.f23103b = ac1Var;
    }

    public final ArrayList a(ac1 ac1Var) {
        ArrayList<nl> arrayListE = this.f23103b.e();
        ArrayList arrayList = new ArrayList();
        for (nl nlVar : arrayListE) {
            Objects.requireNonNull(this.f23104c);
            arrayList.addAll(y71.a(nlVar));
        }
        ArrayList arrayList2 = new ArrayList();
        for (nl nlVar2 : ac1Var.e()) {
            Objects.requireNonNull(this.f23102a);
            ArrayList<j10> arrayList3 = new ArrayList();
            Iterator it = arrayListE.iterator();
            while (it.hasNext()) {
                arrayList3.addAll(((nl) it.next()).e());
            }
            HashSet hashSet = new HashSet();
            Iterator<j10> it2 = nlVar2.e().iterator();
            while (it2.hasNext()) {
                hashSet.add(it2.next().a());
            }
            ArrayList arrayList4 = new ArrayList();
            for (j10 j10Var : arrayList3) {
                String strA = j10Var.a();
                if (!hashSet.contains(strA)) {
                    arrayList4.add(j10Var);
                    hashSet.add(strA);
                }
            }
            Objects.requireNonNull(this.f23104c);
            arrayList2.add(new nl.a().b(nlVar2.f()).a(nlVar2.e()).a(arrayList).a(nlVar2.b()).a(nlVar2.g()).a(nlVar2.d()).a((List) arrayList4).a(y71.a(nlVar2)).a());
        }
        return arrayList2;
    }
}
