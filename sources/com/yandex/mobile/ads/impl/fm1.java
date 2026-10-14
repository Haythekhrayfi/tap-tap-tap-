package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class fm1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static fm1 f20752c = new fm1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<em1> f20753a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<em1> f20754b = new ArrayList<>();

    private fm1() {
    }

    public static fm1 a() {
        return f20752c;
    }

    public final void a(em1 em1Var) {
        this.f20753a.add(em1Var);
    }

    public final Collection<em1> b() {
        return Collections.unmodifiableCollection(this.f20753a);
    }

    public final void b(em1 em1Var) {
        boolean z10 = this.f20754b.size() > 0;
        this.f20754b.add(em1Var);
        if (z10) {
            return;
        }
        nn1.a().b();
    }

    public final Collection<em1> c() {
        return Collections.unmodifiableCollection(this.f20754b);
    }

    public final void c(em1 em1Var) {
        boolean z10 = this.f20754b.size() > 0;
        this.f20753a.remove(em1Var);
        this.f20754b.remove(em1Var);
        if (z10) {
            if (this.f20754b.size() > 0) {
                return;
            }
            nn1.a().c();
        }
    }
}
