package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public abstract class Cd<T> implements InterfaceC1955sc<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R2 f13772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Oc f13773b;

    public Cd(Oc oc2, R2 r10) {
        this.f13773b = oc2;
        this.f13772a = r10;
    }

    public abstract String a();

    public boolean a(long j10) {
        R2 r10 = this.f13772a;
        long jA = this.f13773b.a();
        StringBuilder sbA = defpackage.a.a("last ");
        sbA.append(a());
        sbA.append(" scan attempt");
        return r10.b(jA, j10, sbA.toString());
    }
}
