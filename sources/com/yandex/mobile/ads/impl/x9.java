package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class x9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f26473a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f26474b = new ArrayList();

    public final void a() {
        synchronized (this.f26473a) {
            this.f26474b.clear();
        }
    }

    public final void a(u10 u10Var) {
        fd.j0.i(u10Var, "observer");
        synchronized (this.f26473a) {
            this.f26474b.add(u10Var);
        }
    }

    public final void a(w9 w9Var) {
        ArrayList arrayList;
        fd.j0.i(w9Var, "appMetricaIdentifiers");
        synchronized (this.f26473a) {
            arrayList = new ArrayList(this.f26474b);
            this.f26474b.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((u10) it.next()).a(w9Var);
        }
    }
}
