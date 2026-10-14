package com.yandex.mobile.ads.impl;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bk<T> extends je {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap<T, b<T>> f19277h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f19278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g81 f19279j;

    public final class a implements oc0, com.yandex.mobile.ads.exo.drm.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f19280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private oc0.a f19281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.yandex.mobile.ads.exo.drm.f.a f19282c;

        public a(T t10) {
            this.f19281b = bk.this.b((nc0.b) null);
            this.f19282c = bk.this.a((nc0.b) null);
            this.f19280a = t10;
        }

        private dc0 a(dc0 dc0Var) {
            bk bkVar = bk.this;
            long j10 = dc0Var.f19835f;
            Objects.requireNonNull(bkVar);
            bk bkVar2 = bk.this;
            long j11 = dc0Var.f19836g;
            Objects.requireNonNull(bkVar2);
            return (j10 == dc0Var.f19835f && j11 == dc0Var.f19836g) ? dc0Var : new dc0(dc0Var.f19830a, dc0Var.f19831b, dc0Var.f19832c, dc0Var.f19833d, dc0Var.f19834e, j10, j11);
        }

        private boolean e(int i10, nc0.b bVar) {
            nc0.b bVarA;
            if (bVar != null) {
                bVarA = bk.this.a(this.f19280a, bVar);
                if (bVarA == null) {
                    return false;
                }
            } else {
                bVarA = null;
            }
            Objects.requireNonNull(bk.this);
            oc0.a aVar = this.f19281b;
            if (aVar.f23768a != i10 || !da1.a(aVar.f23769b, bVarA)) {
                this.f19281b = bk.this.b(i10, bVarA);
            }
            com.yandex.mobile.ads.exo.drm.f.a aVar2 = this.f19282c;
            if (aVar2.f18494a == i10 && da1.a(aVar2.f18495b, bVarA)) {
                return true;
            }
            this.f19282c = bk.this.a(i10, bVarA);
            return true;
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void a(int i10, nc0.b bVar) {
            if (e(i10, bVar)) {
                this.f19282c.c();
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void a(int i10, nc0.b bVar, int i11) {
            if (e(i10, bVar)) {
                this.f19282c.a(i11);
            }
        }

        @Override // com.yandex.mobile.ads.impl.oc0
        public final void a(int i10, nc0.b bVar, dc0 dc0Var) {
            if (e(i10, bVar)) {
                this.f19281b.a(a(dc0Var));
            }
        }

        @Override // com.yandex.mobile.ads.impl.oc0
        public final void a(int i10, nc0.b bVar, v80 v80Var, dc0 dc0Var) {
            if (e(i10, bVar)) {
                this.f19281b.a(v80Var, a(dc0Var));
            }
        }

        @Override // com.yandex.mobile.ads.impl.oc0
        public final void a(int i10, nc0.b bVar, v80 v80Var, dc0 dc0Var, IOException iOException, boolean z10) {
            if (e(i10, bVar)) {
                this.f19281b.a(v80Var, a(dc0Var), iOException, z10);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void a(int i10, nc0.b bVar, Exception exc) {
            if (e(i10, bVar)) {
                this.f19282c.a(exc);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void b(int i10, nc0.b bVar) {
            if (e(i10, bVar)) {
                this.f19282c.d();
            }
        }

        @Override // com.yandex.mobile.ads.impl.oc0
        public final void b(int i10, nc0.b bVar, v80 v80Var, dc0 dc0Var) {
            if (e(i10, bVar)) {
                this.f19281b.b(v80Var, a(dc0Var));
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void c(int i10, nc0.b bVar) {
            if (e(i10, bVar)) {
                this.f19282c.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.oc0
        public final void c(int i10, nc0.b bVar, v80 v80Var, dc0 dc0Var) {
            if (e(i10, bVar)) {
                this.f19281b.c(v80Var, a(dc0Var));
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void d(int i10, nc0.b bVar) {
            if (e(i10, bVar)) {
                this.f19282c.b();
            }
        }
    }

    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nc0 f19284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc0.c f19285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final bk<T>.a f19286c;

        public b(nc0 nc0Var, nc0.c cVar, bk<T>.a aVar) {
            this.f19284a = nc0Var;
            this.f19285b = cVar;
            this.f19286c = aVar;
        }
    }

    public abstract nc0.b a(T t10, nc0.b bVar);

    @Override // com.yandex.mobile.ads.impl.je
    public final void a() {
        for (b<T> bVar : this.f19277h.values()) {
            bVar.f19284a.b(bVar.f19285b);
        }
    }

    @Override // com.yandex.mobile.ads.impl.je
    public void a(g81 g81Var) {
        this.f19279j = g81Var;
        this.f19278i = da1.a((Handler.Callback) null);
    }

    public final void a(final T t10, nc0 nc0Var) {
        pa.a(!this.f19277h.containsKey(t10));
        nc0.c cVar = new nc0.c() { // from class: com.yandex.mobile.ads.impl.rn1
            @Override // com.yandex.mobile.ads.impl.nc0.c
            public final void a(nc0 nc0Var2, v61 v61Var) {
                this.f24806a.a(t10, nc0Var2, v61Var);
            }
        };
        a aVar = new a(t10);
        this.f19277h.put(t10, new b<>(nc0Var, cVar, aVar));
        Handler handler = this.f19278i;
        Objects.requireNonNull(handler);
        nc0Var.a(handler, (oc0) aVar);
        Handler handler2 = this.f19278i;
        Objects.requireNonNull(handler2);
        nc0Var.a(handler2, (com.yandex.mobile.ads.exo.drm.f) aVar);
        nc0Var.a(cVar, this.f19279j, c());
        if (d()) {
            return;
        }
        nc0Var.b(cVar);
    }

    @Override // com.yandex.mobile.ads.impl.je
    public final void b() {
        for (b<T> bVar : this.f19277h.values()) {
            bVar.f19284a.c(bVar.f19285b);
        }
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract void a(T t10, nc0 nc0Var, v61 v61Var);

    @Override // com.yandex.mobile.ads.impl.je
    public void e() {
        for (b<T> bVar : this.f19277h.values()) {
            bVar.f19284a.a(bVar.f19285b);
            bVar.f19284a.a((oc0) bVar.f19286c);
            bVar.f19284a.a((com.yandex.mobile.ads.exo.drm.f) bVar.f19286c);
        }
        this.f19277h.clear();
    }
}
