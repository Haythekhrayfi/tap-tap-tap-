package gb;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f30193d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f30195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30196c;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public d0(long j10, long j11, boolean z10) {
        this.f30194a = j10;
        this.f30195b = j11;
        this.f30196c = z10;
    }

    public /* synthetic */ d0(long j10, long j11, boolean z10, int i10, vc.g gVar) {
        this(j10, (i10 & 2) != 0 ? 0L : j11, (i10 & 4) != 0 ? true : z10);
    }

    public final Object a(uc.l<? super mc.d<? super jc.w>, ? extends Object> lVar, uc.l<? super mc.d<? super jc.w>, ? extends Object> lVar2, mc.d<? super jc.w> dVar) {
        boolean z10;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f30194a;
        if (j10 == 0) {
            z10 = true;
        } else if (jCurrentTimeMillis - this.f30195b > j10) {
            if (this.f30196c) {
                b();
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Object objInvoke = lVar.invoke(dVar);
            return objInvoke == nc.a.COROUTINE_SUSPENDED ? objInvoke : jc.w.f31842a;
        }
        xe.a.c cVarB = xe.a.b("TimeCapping");
        StringBuilder sbA = defpackage.a.a("Skipped due to capping. Next in ");
        sbA.append(TimeUnit.MILLISECONDS.toSeconds((this.f30195b + this.f30194a) - System.currentTimeMillis()));
        sbA.append("sec.");
        cVarB.g(sbA.toString(), new Object[0]);
        Object objInvoke2 = lVar2.invoke(dVar);
        return objInvoke2 == nc.a.COROUTINE_SUSPENDED ? objInvoke2 : jc.w.f31842a;
    }

    public final void b() {
        this.f30195b = System.currentTimeMillis();
    }
}
