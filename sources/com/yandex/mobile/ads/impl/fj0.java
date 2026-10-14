package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ji0 f20721a = new ji0();

    public static ArrayList b(AdResponse adResponse) {
        cj0 cj0Var = (cj0) adResponse.C();
        List<qh0> listD = cj0Var != null ? cj0Var.d() : null;
        if (listD == null) {
            listD = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<qh0> it = listD.iterator();
        while (it.hasNext()) {
            String strA = it.next().a();
            if (strA != null) {
                arrayList.add(strA);
            }
        }
        return arrayList;
    }

    public static ArrayList c(AdResponse adResponse) {
        cj0 cj0Var = (cj0) adResponse.C();
        List<qh0> listD = cj0Var != null ? cj0Var.d() : null;
        if (listD == null) {
            listD = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<qh0> it = listD.iterator();
        while (it.hasNext()) {
            int iG = it.next().g();
            if (iG != 0) {
                arrayList.add(px0.a(iG));
            }
        }
        return arrayList;
    }

    public final ArrayList a(AdResponse adResponse) {
        cj0 cj0Var = (cj0) adResponse.C();
        List<qh0> listD = cj0Var != null ? cj0Var.d() : null;
        if (listD == null) {
            listD = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<qh0> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.addAll(this.f20721a.a(it.next()));
        }
        return arrayList;
    }
}
