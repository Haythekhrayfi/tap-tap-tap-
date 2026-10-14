package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class Yc implements M.c, E.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Wc> f15568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M f15569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1583dd f15570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E f15571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Uc f15572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<Vc> f15573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f15574g;

    public Yc(Context context) {
        this(P0.i().d(), C1583dd.a(context), new Qi.b(context), P0.i().c());
    }

    public Yc(M m10, C1583dd c1583dd, Qi.b bVar, E e10) {
        this.f15573f = new HashSet();
        this.f15574g = new Object();
        this.f15569b = m10;
        this.f15570c = c1583dd;
        this.f15571d = e10;
        this.f15568a = bVar.a().x();
    }

    private Uc a() {
        E.a aVarC = this.f15571d.c();
        M.b.a aVarB = this.f15569b.b();
        for (Wc wc2 : this.f15568a) {
            if (wc2.f15382b.f16343a.contains(aVarB) && wc2.f15382b.f16344b.contains(aVarC)) {
                return wc2.f15381a;
            }
        }
        return null;
    }

    private void d() {
        Uc ucA = a();
        if (U2.a(this.f15572e, ucA)) {
            return;
        }
        this.f15570c.a(ucA);
        this.f15572e = ucA;
        Uc uc2 = this.f15572e;
        Iterator<Vc> it = this.f15573f.iterator();
        while (it.hasNext()) {
            it.next().a(uc2);
        }
    }

    @Override // com.yandex.metrica.impl.ob.E.b
    public synchronized void a(E.a aVar) {
        d();
    }

    @Override // com.yandex.metrica.impl.ob.M.c
    public synchronized void a(M.b.a aVar) {
        d();
    }

    public synchronized void a(Qi qi) {
        this.f15568a = qi.x();
        this.f15572e = a();
        this.f15570c.a(qi, this.f15572e);
        Uc uc2 = this.f15572e;
        Iterator<Vc> it = this.f15573f.iterator();
        while (it.hasNext()) {
            it.next().a(uc2);
        }
    }

    public synchronized void a(Vc vc2) {
        this.f15573f.add(vc2);
    }

    public void b() {
        synchronized (this.f15574g) {
            this.f15569b.a(this);
            this.f15571d.a(this);
        }
    }

    public synchronized void c() {
        d();
    }
}
