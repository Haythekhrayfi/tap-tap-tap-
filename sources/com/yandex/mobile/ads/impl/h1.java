package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f21275a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakHashMap<g1, Object> f21276b = new WeakHashMap<>();

    public final void a() {
        HashSet hashSet;
        synchronized (this.f21275a) {
            hashSet = new HashSet(this.f21276b.keySet());
            this.f21276b.clear();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((g1) it.next()).a();
        }
    }

    public final void a(g1 g1Var) {
        fd.j0.i(g1Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.f21275a) {
            this.f21276b.put(g1Var, null);
        }
    }

    public final void b(g1 g1Var) {
        fd.j0.i(g1Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.f21275a) {
            this.f21276b.remove(g1Var);
        }
    }
}
