package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class fq implements x7.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f20781b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile fq f20782c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f20783a = new ArrayList();

    private fq() {
    }

    public static fq a() {
        if (f20782c == null) {
            synchronized (f20781b) {
                if (f20782c == null) {
                    f20782c = new fq();
                }
            }
        }
        return f20782c;
    }

    public final void a(jj0 jj0Var) {
        synchronized (f20781b) {
            this.f20783a.add(jj0Var);
        }
    }

    public final void b(jj0 jj0Var) {
        synchronized (f20781b) {
            this.f20783a.remove(jj0Var);
        }
    }

    @Override // x7.c
    public /* bridge */ /* synthetic */ void beforeBindView(i8.k kVar, View view, y9.g0 g0Var) {
        super.beforeBindView(kVar, view, g0Var);
    }

    @Override // x7.c
    public final void bindView(i8.k kVar, View view, y9.g0 g0Var) {
        ArrayList arrayList = new ArrayList();
        synchronized (f20781b) {
            for (x7.c cVar : this.f20783a) {
                if (cVar.matches(g0Var)) {
                    arrayList.add(cVar);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((x7.c) it.next()).bindView(kVar, view, g0Var);
        }
    }

    @Override // x7.c
    public final boolean matches(y9.g0 g0Var) {
        ArrayList arrayList = new ArrayList();
        synchronized (f20781b) {
            arrayList.addAll(this.f20783a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((x7.c) it.next()).matches(g0Var)) {
                return true;
            }
        }
        return false;
    }

    @Override // x7.c
    public /* bridge */ /* synthetic */ void preprocess(y9.g0 g0Var, v9.d dVar) {
        super.preprocess(g0Var, dVar);
    }

    @Override // x7.c
    public final void unbindView(i8.k kVar, View view, y9.g0 g0Var) {
        ArrayList arrayList = new ArrayList();
        synchronized (f20781b) {
            for (x7.c cVar : this.f20783a) {
                if (cVar.matches(g0Var)) {
                    arrayList.add(cVar);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((x7.c) it.next()).unbindView(kVar, view, g0Var);
        }
    }
}
