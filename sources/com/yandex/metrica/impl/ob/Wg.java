package com.yandex.metrica.impl.ob;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class Wg implements Ug.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<Eg> f15396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f15397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Fg f15398c;

    public Wg() {
        this(P0.i().o());
    }

    public Wg(Ug ug) {
        this.f15396a = new HashSet();
        ug.a(new C1512ah(this));
        ug.b();
    }

    public synchronized void a(Eg eg) {
        this.f15396a.add(eg);
        if (this.f15397b) {
            eg.a(this.f15398c);
            this.f15396a.remove(eg);
        }
    }

    @Override // com.yandex.metrica.impl.ob.Ug.a
    public synchronized void a(Fg fg) {
        this.f15398c = fg;
        this.f15397b = true;
        Iterator<Eg> it = this.f15396a.iterator();
        while (it.hasNext()) {
            it.next().a(this.f15398c);
        }
        this.f15396a.clear();
    }
}
