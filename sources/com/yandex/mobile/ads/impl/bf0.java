package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class bf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f19259a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f19260b = new ArrayList();

    public final void a() {
        ArrayList arrayList;
        synchronized (this.f19259a) {
            arrayList = new ArrayList(this.f19260b);
            this.f19260b.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((j30) it.next()).a();
        }
    }

    public final void a(j30 j30Var) {
        synchronized (this.f19259a) {
            this.f19260b.add(j30Var);
        }
    }
}
