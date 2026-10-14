package com.yandex.mobile.ads.impl;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class d61 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c61 f19768b;

    public d61(c61 c61Var) {
        this.f19768b = c61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y51 y51VarB;
        while (true) {
            c61 c61Var = this.f19768b;
            synchronized (c61Var) {
                y51VarB = c61Var.b();
            }
            if (y51VarB == null) {
                return;
            }
            b61 b61VarD = y51VarB.d();
            fd.j0.f(b61VarD);
            c61 c61Var2 = this.f19768b;
            long jA = -1;
            c61 c61Var3 = c61.f19395h;
            boolean zIsLoggable = c61.b.a().isLoggable(Level.FINE);
            if (zIsLoggable) {
                jA = b61VarD.h().d().a();
                z51.a(y51VarB, b61VarD, "starting");
            }
            try {
                c61.a(c61Var2, y51VarB);
                if (zIsLoggable) {
                    long jA2 = b61VarD.h().d().a() - jA;
                    StringBuilder sbA = v60.a("finished run in ");
                    sbA.append(z51.a(jA2));
                    z51.a(y51VarB, b61VarD, sbA.toString());
                }
            } catch (Throwable th) {
                try {
                    c61Var2.d().execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        long jA3 = b61VarD.h().d().a() - jA;
                        StringBuilder sbA2 = v60.a("failed a run in ");
                        sbA2.append(z51.a(jA3));
                        z51.a(y51VarB, b61VarD, sbA2.toString());
                    }
                    throw th2;
                }
            }
        }
    }
}
