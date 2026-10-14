package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ge1 {

    public static class a implements Comparator<ac1> {
        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        @Override // java.util.Comparator
        public final int compare(ac1 ac1Var, ac1 ac1Var2) {
            return ac1Var.i().compareTo(ac1Var2.i());
        }
    }

    public static ArrayList a(List list) {
        int i10;
        boolean z10;
        Iterator it = list.iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            if (((ac1) it.next()).i() != null) {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            return new ArrayList(list);
        }
        ArrayList<ac1> arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ac1 ac1Var = (ac1) it2.next();
            if (ac1Var.i() != null) {
                arrayList.add(ac1Var);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (ac1 ac1Var2 : arrayList) {
            if (ac1Var2.i() != null) {
                arrayList2.add(ac1Var2);
            }
        }
        Collections.sort(arrayList2, new a(i10));
        return arrayList2;
    }
}
