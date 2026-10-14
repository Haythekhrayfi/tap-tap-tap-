package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1747k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pm f16562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f16563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1546c1 f16564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC1571d1 f16565d;

    public C1747k3() {
        this(new Pm());
    }

    public C1747k3(Pm pm) {
        this.f16562a = pm;
    }

    private synchronized boolean a(Context context) {
        if (this.f16563b == null) {
            this.f16563b = Boolean.valueOf(!this.f16562a.a(context));
        }
        return this.f16563b.booleanValue();
    }

    public synchronized InterfaceC1546c1 a(Context context, C1917qn c1917qn) {
        if (this.f16564c == null) {
            if (a(context)) {
                this.f16564c = new Oj(c1917qn.b(), c1917qn.b().a(), c1917qn.a(), new Z());
            } else {
                this.f16564c = new C1722j3(context, c1917qn);
            }
        }
        return this.f16564c;
    }

    public synchronized InterfaceC1571d1 a(Context context, InterfaceC1546c1 interfaceC1546c1) {
        if (this.f16565d == null) {
            if (a(context)) {
                this.f16565d = new Pj();
            } else {
                this.f16565d = new C1822n3(context, interfaceC1546c1);
            }
        }
        return this.f16565d;
    }
}
