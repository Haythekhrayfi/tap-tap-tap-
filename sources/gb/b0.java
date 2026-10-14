package gb;

import fd.j0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f30184d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f30186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30187c;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public b0(long j10, long j11, boolean z10) {
        this.f30185a = j10;
        this.f30186b = j11;
        this.f30187c = z10;
    }

    public /* synthetic */ b0(long j10, long j11, boolean z10, int i10, vc.g gVar) {
        this(j10, (i10 & 2) != 0 ? 0L : j11, (i10 & 4) != 0 ? true : z10);
    }

    public final void a(uc.a<jc.w> aVar, uc.a<jc.w> aVar2) {
        j0.i(aVar2, "onCapped");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f30185a;
        boolean z10 = true;
        if (j10 != 0) {
            if (jCurrentTimeMillis - this.f30186b <= j10) {
                z10 = false;
            } else if (this.f30187c) {
                b();
            }
        }
        if (z10) {
            aVar.invoke();
            return;
        }
        xe.a.c cVarB = xe.a.b("TimeCapping");
        StringBuilder sbA = defpackage.a.a("Skipped due to capping. Next in ");
        sbA.append(TimeUnit.MILLISECONDS.toSeconds((this.f30186b + this.f30185a) - System.currentTimeMillis()));
        sbA.append("sec.");
        cVarB.g(sbA.toString(), new Object[0]);
        aVar2.invoke();
    }

    public final void b() {
        this.f30186b = System.currentTimeMillis();
    }
}
