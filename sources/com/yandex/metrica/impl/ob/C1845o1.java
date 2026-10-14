package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1845o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W6 f16966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1573d3 f16967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final K f16968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E f16969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<F2> f16970e;

    public C1845o1(Context context, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this(U2.a(21) ? new X6(context) : new Y6(), new C1573d3(context, interfaceExecutorC1966sn), new K(context, interfaceExecutorC1966sn), new E());
    }

    public C1845o1(W6 w10, C1573d3 c1573d3, K k10, E e10) {
        ArrayList arrayList = new ArrayList();
        this.f16970e = arrayList;
        this.f16966a = w10;
        arrayList.add(w10);
        this.f16967b = c1573d3;
        arrayList.add(c1573d3);
        this.f16968c = k10;
        arrayList.add(k10);
        this.f16969d = e10;
        arrayList.add(e10);
    }

    public E a() {
        return this.f16969d;
    }

    public synchronized void a(F2 f10) {
        this.f16970e.add(f10);
    }

    public K b() {
        return this.f16968c;
    }

    public W6 c() {
        return this.f16966a;
    }

    public C1573d3 d() {
        return this.f16967b;
    }

    public synchronized void e() {
        Iterator<F2> it = this.f16970e.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public synchronized void f() {
        Iterator<F2> it = this.f16970e.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }
}
