package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1981td {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1757kd f17447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1497a2 f17448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1907qd f17449c;

    public C1981td(C1757kd c1757kd) {
        this(c1757kd, new C1497a2());
    }

    public C1981td(C1757kd c1757kd, C1497a2 c1497a2) {
        this.f17447a = c1757kd;
        this.f17448b = c1497a2;
        this.f17449c = a();
    }

    private C1907qd a() {
        return new C1907qd();
    }

    public C1807md<Ec> a(C2086xd c2086xd, Ec ec2) {
        C2135zc c2135zc = this.f17447a.f16576a;
        Context context = c2135zc.f18015a;
        Looper looperB = c2135zc.f18016b.b();
        C1757kd c1757kd = this.f17447a;
        return new C1807md<>(new Bd(context, looperB, c1757kd.f16577b, this.f17448b.c(c1757kd.f16576a.f18017c), "passive", new C1683hd(c2086xd)), this.f17449c, new C1956sd(), new C1931rd(), ec2);
    }
}
