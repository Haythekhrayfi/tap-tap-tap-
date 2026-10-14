package ld;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f33103e;

    public k(Runnable runnable, long j10, i iVar) {
        super(j10, iVar);
        this.f33103e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f33103e.run();
        } finally {
            this.f33101d.a();
        }
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Task[");
        sbA.append(j0.m(this.f33103e));
        sbA.append('@');
        sbA.append(j0.n(this.f33103e));
        sbA.append(", ");
        sbA.append(this.f33100c);
        sbA.append(", ");
        sbA.append(this.f33101d);
        sbA.append(']');
        return sbA.toString();
    }
}
