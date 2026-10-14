package gd;

import android.os.Handler;
import android.os.Looper;
import fd.i;
import fd.j0;
import fd.j1;
import fd.s0;
import fd.s1;
import fd.t0;
import fd.u1;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import jc.w;
import vc.g;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends e {
    private volatile d _immediate;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f30435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f30436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f30437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f30438h;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f30439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f30440d;

        public a(i iVar, d dVar) {
            this.f30439c = iVar;
            this.f30440d = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f30439c.A(this.f30440d, w.f31842a);
        }
    }

    public static final class b extends l implements uc.l<Throwable, w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Runnable f30442d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Runnable runnable) {
            super(1);
            this.f30442d = runnable;
        }

        @Override // uc.l
        public w invoke(Throwable th) {
            d.this.f30435e.removeCallbacks(this.f30442d);
            return w.f31842a;
        }
    }

    public d(Handler handler, String str) {
        this(handler, str, false);
    }

    public /* synthetic */ d(Handler handler, String str, int i10, g gVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public d(Handler handler, String str, boolean z10) {
        super(null);
        this.f30435e = handler;
        this.f30436f = str;
        this.f30437g = z10;
        this._immediate = z10 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, str, true);
            this._immediate = dVar;
        }
        this.f30438h = dVar;
    }

    @Override // fd.c0
    public void c0(mc.f fVar, Runnable runnable) {
        if (this.f30435e.post(runnable)) {
            return;
        }
        g0(fVar, runnable);
    }

    @Override // fd.c0
    public boolean d0(mc.f fVar) {
        return (this.f30437g && j0.d(Looper.myLooper(), this.f30435e.getLooper())) ? false : true;
    }

    @Override // fd.s1
    public s1 e0() {
        return this.f30438h;
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f30435e == this.f30435e;
    }

    public final void g0(mc.f fVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        int i10 = j1.f29579x1;
        j1 j1Var = (j1) fVar.b(j1.b.f29580c);
        if (j1Var != null) {
            j1Var.c(cancellationException);
        }
        Objects.requireNonNull((ld.b) s0.f29620b);
        ld.b.f33092f.c0(fVar, runnable);
    }

    public int hashCode() {
        return System.identityHashCode(this.f30435e);
    }

    @Override // gd.e, fd.o0
    public t0 k(long j10, final Runnable runnable, mc.f fVar) {
        if (this.f30435e.postDelayed(runnable, bd.e.c(j10, 4611686018427387903L))) {
            return new t0() { // from class: gd.c
                @Override // fd.t0
                public final void dispose() {
                    d dVar = this.f30433c;
                    dVar.f30435e.removeCallbacks(runnable);
                }
            };
        }
        g0(fVar, runnable);
        return u1.f29627c;
    }

    @Override // fd.o0
    public void l(long j10, i<? super w> iVar) {
        a aVar = new a(iVar, this);
        if (this.f30435e.postDelayed(aVar, bd.e.c(j10, 4611686018427387903L))) {
            iVar.s(new b(aVar));
        } else {
            g0(iVar.getContext(), aVar);
        }
    }

    @Override // fd.s1, fd.c0
    public String toString() {
        String strF0 = f0();
        if (strF0 != null) {
            return strF0;
        }
        String string = this.f30436f;
        if (string == null) {
            string = this.f30435e.toString();
        }
        return this.f30437g ? i.f.a(string, ".immediate") : string;
    }
}
