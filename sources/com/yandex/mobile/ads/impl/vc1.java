package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class vc1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ge1 f25962a = new ge1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hb1 f25963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final tc1<T> f25964c;

    public vc1(Context context, gd1<T> gd1Var) {
        this.f25963b = new hb1(context);
        this.f25964c = new tc1<>(gd1Var);
    }

    public final ArrayList a(List list) {
        Objects.requireNonNull(this.f25962a);
        ArrayList arrayListA = this.f25963b.a(ge1.a(list));
        int size = arrayListA.size();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < arrayListA.size(); i10++) {
            arrayList.add(this.f25964c.a((gb1) arrayListA.get(i10), size, i10));
        }
        return arrayList;
    }
}
