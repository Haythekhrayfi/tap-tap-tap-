package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class m8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22938a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakHashMap<o8, Object> f22939b = new WeakHashMap<>();

    public final void a() {
        ArrayList arrayList;
        synchronized (this.f22938a) {
            arrayList = new ArrayList(this.f22939b.keySet());
            this.f22939b.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o8) it.next()).a(null);
        }
    }

    public final void a(h8 h8Var) {
        ArrayList arrayList;
        synchronized (this.f22938a) {
            arrayList = new ArrayList(this.f22939b.keySet());
            this.f22939b.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o8) it.next()).a(h8Var);
        }
    }

    public final void a(o8 o8Var) {
        synchronized (this.f22938a) {
            this.f22939b.put(o8Var, null);
        }
    }

    public final void b(o8 o8Var) {
        synchronized (this.f22938a) {
            this.f22939b.remove(o8Var);
        }
    }
}
