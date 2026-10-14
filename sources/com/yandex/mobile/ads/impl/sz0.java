package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class sz0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f25211b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile sz0 f25212c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f25213a = new HashMap();

    private sz0() {
    }

    public static sz0 a() {
        if (f25212c == null) {
            synchronized (f25211b) {
                if (f25212c == null) {
                    f25212c = new sz0();
                }
            }
        }
        return f25212c;
    }

    public final void a(Context context, nz0 nz0Var) {
        HashSet hashSet;
        synchronized (f25211b) {
            hashSet = new HashSet(this.f25213a.keySet());
            i01.b().a(context, nz0Var);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a01) it.next()).a(context, nz0Var);
        }
    }

    public final void a(pz0 pz0Var) {
        synchronized (f25211b) {
            if (!this.f25213a.containsKey(pz0Var)) {
                this.f25213a.put(pz0Var, null);
            }
        }
    }
}
