package com.yandex.metrica.impl.ob;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class Vb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Tb> f15230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Wb f15231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f15232c = new AtomicBoolean(true);

    public Vb(List<Tb> list, Wb wb2) {
        this.f15230a = list;
        this.f15231b = wb2;
    }

    public void a() {
        this.f15232c.set(false);
    }

    public void b() {
        this.f15232c.set(true);
    }

    public void c() {
        if (this.f15232c.get()) {
            if (!this.f15230a.isEmpty()) {
                boolean zA = false;
                Iterator<Tb> it = this.f15230a.iterator();
                while (it.hasNext()) {
                    zA |= it.next().a();
                }
                if (!zA) {
                    return;
                }
            }
            ((C1624f4) this.f15231b).c();
        }
    }
}
