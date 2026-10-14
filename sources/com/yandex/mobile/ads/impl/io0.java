package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class io0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f21765a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakHashMap<ho0, Object> f21766b = new WeakHashMap<>();

    public final void a(ho0 ho0Var) {
        fd.j0.i(ho0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.f21765a) {
            this.f21766b.put(ho0Var, null);
        }
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f21765a) {
            z10 = !this.f21766b.isEmpty();
        }
        return z10;
    }

    public final void b() {
        List listH;
        synchronized (this.f21765a) {
            Set<ho0> setKeySet = this.f21766b.keySet();
            fd.j0.h(setKeySet, "listeners.keys");
            listH = kc.t.H(setKeySet);
            this.f21766b.clear();
        }
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            ((ho0) it.next()).a();
        }
    }

    public final void b(ho0 ho0Var) {
        fd.j0.i(ho0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.f21765a) {
            this.f21766b.remove(ho0Var);
        }
    }
}
