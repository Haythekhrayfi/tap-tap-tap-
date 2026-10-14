package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2060wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I9 f17772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1757kd f17773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1497a2 f17774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Oc f17775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1980tc f17776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2005uc f17777f;

    public AbstractC2060wc(C1757kd c1757kd, I9 i10, C1497a2 c1497a2) {
        this.f17773b = c1757kd;
        this.f17772a = i10;
        this.f17774c = c1497a2;
        Oc ocA = a();
        this.f17775d = ocA;
        this.f17776e = new C1980tc(ocA, c());
        this.f17777f = new C2005uc(c1757kd.f16576a.f18016b);
    }

    public abstract Oc a();

    public abstract InterfaceC1659ge a(C1634fe c1634fe);

    public C1807md<Ec> a(C2086xd c2086xd, Ec ec2) {
        C2135zc c2135zc = this.f17773b.f16576a;
        Context context = c2135zc.f18015a;
        Looper looperB = c2135zc.f18016b.b();
        C1757kd c1757kd = this.f17773b;
        return new C1807md<>(new Bd(context, looperB, c1757kd.f16577b, a(c1757kd.f16576a.f18017c), b(), new C1683hd(c2086xd)), this.f17776e, new C2030vc(this.f17775d, new Nm()), this.f17777f, ec2);
    }

    public abstract String b();

    public abstract String c();
}
