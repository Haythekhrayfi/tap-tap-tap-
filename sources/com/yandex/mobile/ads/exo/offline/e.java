package com.yandex.mobile.ads.exo.offline;

import com.yandex.mobile.ads.impl.bc0;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.hg;
import com.yandex.mobile.ads.impl.pa;
import com.yandex.mobile.ads.impl.pm;
import com.yandex.mobile.ads.impl.qs0;
import com.yandex.mobile.ads.impl.sg;
import com.yandex.mobile.ads.impl.ty0;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f18716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pm f18717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hg f18718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sg f18719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d.a f18720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile ty0<Void, IOException> f18721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f18722g;

    public class a extends ty0<Void, IOException> {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.ty0
        public final void b() {
            e.this.f18719d.b();
        }

        @Override // com.yandex.mobile.ads.impl.ty0
        public final void c() throws Exception {
            e.this.f18719d.a();
        }
    }

    public e(bc0 bc0Var, hg.b bVar, Executor executor) {
        this.f18716a = (Executor) pa.a(executor);
        pa.a(bc0Var.f19172b);
        pm pmVarA = new pm.a().a(bc0Var.f19172b.f19220a).a(bc0Var.f19172b.f19224e).a(4).a();
        this.f18717b = pmVarA;
        hg hgVarB = bVar.b();
        this.f18718c = hgVarB;
        this.f18719d = new sg(hgVarB, pmVarA, new d0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10, long j11, long j12) {
        d.a aVar = this.f18720e;
        if (aVar == null) {
            return;
        }
        ((c.d) aVar).a(j10, j11, (j10 == -1 || j10 == 0) ? -1.0f : (j11 * 100.0f) / j10);
    }

    @Override // com.yandex.mobile.ads.exo.offline.d
    public final void a(d.a aVar) throws InterruptedException, IOException {
        this.f18720e = aVar;
        this.f18721f = new a();
        boolean z10 = false;
        while (!z10) {
            try {
                if (this.f18722g) {
                    break;
                }
                this.f18716a.execute(this.f18721f);
                try {
                    this.f18721f.get();
                    z10 = true;
                } catch (ExecutionException e10) {
                    Throwable cause = e10.getCause();
                    Objects.requireNonNull(cause);
                    if (!(cause instanceof qs0)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        int i10 = da1.f19803a;
                        throw cause;
                    }
                }
            } catch (Throwable th) {
                this.f18721f.a();
                throw th;
            }
        }
        this.f18721f.a();
    }

    @Override // com.yandex.mobile.ads.exo.offline.d
    public final void cancel() {
        this.f18722g = true;
        ty0<Void, IOException> ty0Var = this.f18721f;
        if (ty0Var != null) {
            ty0Var.cancel(true);
        }
    }

    @Override // com.yandex.mobile.ads.exo.offline.d
    public final void remove() {
        this.f18718c.g().a(this.f18718c.h().a(this.f18717b));
    }
}
