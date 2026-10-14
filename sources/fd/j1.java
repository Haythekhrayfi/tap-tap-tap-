package fd;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public interface j1 extends mc.f.a {

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final /* synthetic */ int f29579x1 = 0;

    public static final class a {
        public static /* synthetic */ t0 b(j1 j1Var, boolean z10, boolean z11, uc.l lVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return j1Var.m(z10, z11, lVar);
        }
    }

    public static final class b implements mc.f.b<j1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ b f29580c = new b();
    }

    boolean a();

    void c(CancellationException cancellationException);

    t0 g(uc.l<? super Throwable, jc.w> lVar);

    o j(q qVar);

    t0 m(boolean z10, boolean z11, uc.l<? super Throwable, jc.w> lVar);

    CancellationException q();

    boolean start();
}
