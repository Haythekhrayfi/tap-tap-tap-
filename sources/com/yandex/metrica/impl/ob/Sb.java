package com.yandex.metrica.impl.ob;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class Sb implements Tb, Ub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<Integer> f14996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicLong f14997b;

    public Sb(C1976t8 c1976t8) {
        HashSet hashSet = new HashSet();
        this.f14996a = hashSet;
        hashSet.add(Integer.valueOf(EnumC1745k1.EVENT_TYPE_FIRST_ACTIVATION.b()));
        hashSet.add(Integer.valueOf(EnumC1745k1.EVENT_TYPE_APP_UPDATE.b()));
        hashSet.add(Integer.valueOf(EnumC1745k1.EVENT_TYPE_INIT.b()));
        hashSet.add(Integer.valueOf(EnumC1745k1.EVENT_TYPE_IDENTITY.b()));
        hashSet.add(Integer.valueOf(EnumC1745k1.EVENT_TYPE_SEND_REFERRER.b()));
        c1976t8.a(this);
        this.f14997b = new AtomicLong(c1976t8.a(hashSet));
    }

    @Override // com.yandex.metrica.impl.ob.Ub
    public void a(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f14996a.contains(Integer.valueOf(it.next().intValue()))) {
                i10++;
            }
        }
        this.f14997b.addAndGet(i10);
    }

    @Override // com.yandex.metrica.impl.ob.Tb
    public boolean a() {
        return this.f14997b.get() > 0;
    }

    @Override // com.yandex.metrica.impl.ob.Ub
    public void b(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f14996a.contains(Integer.valueOf(it.next().intValue()))) {
                i10++;
            }
        }
        this.f14997b.addAndGet(-i10);
    }
}
