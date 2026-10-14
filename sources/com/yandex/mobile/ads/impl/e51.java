package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class e51 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile e51 f20074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f20075c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f20076a = new HashMap();

    private e51() {
    }

    public static e51 a() {
        if (f20074b == null) {
            synchronized (f20075c) {
                if (f20074b == null) {
                    f20074b = new e51();
                }
            }
        }
        return f20074b;
    }

    public final void a(s70 s70Var, Object obj) {
        synchronized (f20075c) {
            Set set = (Set) this.f20076a.get(s70Var);
            if (set != null) {
                set.remove(obj);
            }
        }
    }

    public final void b(s70 s70Var, Object obj) {
        synchronized (f20075c) {
            Set hashSet = (Set) this.f20076a.get(s70Var);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f20076a.put(s70Var, hashSet);
            }
            hashSet.add(obj);
        }
    }
}
