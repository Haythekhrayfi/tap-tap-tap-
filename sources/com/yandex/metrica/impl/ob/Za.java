package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class Za<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Ya<T> f15641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Vm<Xa, Wa> f15642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC1556cb f15643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1531bb f15644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final W0 f15645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Om f15646h;

    public Za(Context context, InterfaceC1496a1 interfaceC1496a1, String str, Ya<T> ya2, Vm<Xa, Wa> vm, InterfaceC1556cb interfaceC1556cb) {
        this(context, str, ya2, vm, interfaceC1556cb, new C1531bb(context, str, interfaceC1556cb, interfaceC1496a1), Oh.a(), new Nm());
    }

    public Za(Context context, String str, Ya<T> ya2, Vm<Xa, Wa> vm, InterfaceC1556cb interfaceC1556cb, C1531bb c1531bb, W0 w10, Om om) {
        this.f15639a = context;
        this.f15640b = str;
        this.f15641c = ya2;
        this.f15642d = vm;
        this.f15643e = interfaceC1556cb;
        this.f15644f = c1531bb;
        this.f15645g = w10;
        this.f15646h = om;
    }

    public synchronized void a(T t10, Xa xa2) {
        if (this.f15644f.a(this.f15642d.a(xa2))) {
            this.f15645g.a(this.f15640b, this.f15641c.a(t10));
            this.f15643e.a(new D9(Qa.a(this.f15639a).g()), this.f15646h.b());
        }
    }
}
