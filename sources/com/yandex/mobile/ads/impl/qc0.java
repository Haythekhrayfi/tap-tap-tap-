package com.yandex.mobile.ads.impl;

import android.os.Handler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class qc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gr0 f24426a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f24430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final oc0.a f24431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.yandex.mobile.ads.exo.drm.f.a f24432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap<c, b> f24433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HashSet f24434i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f24436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private g81 f24437l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i11 f24435j = new i11.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<hc0, c> f24428c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f24429d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f24427b = new ArrayList();

    public final class a implements oc0, com.yandex.mobile.ads.exo.drm.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f24438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private oc0.a f24439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.yandex.mobile.ads.exo.drm.f.a f24440c;

        public a(c cVar) {
            this.f24439b = qc0.this.f24431f;
            this.f24440c = qc0.this.f24432g;
            this.f24438a = cVar;
        }

        private boolean e(int i10, nc0.b bVar) {
            nc0.b bVarB = null;
            if (bVar != null) {
                c cVar = this.f24438a;
                for (int i11 = 0; i11 < cVar.f24447c.size(); i11++) {
                    if (((nc0.b) cVar.f24447c.get(i11)).f22015d == bVar.f22015d) {
                        bVarB = bVar.b(e.a(cVar.f24446b, bVar.f22012a));
                        break;
                    }
                }
                if (bVarB == null) {
                    return false;
                }
            }
            int i12 = i10 + this.f24438a.f24448d;
            oc0.a aVar = this.f24439b;
            if (aVar.f23768a != i12 || !da1.a(aVar.f23769b, bVarB)) {
                this.f24439b = qc0.this.f24431f.a(i12, bVarB);
            }
            com.yandex.mobile.ads.exo.drm.f.a aVar2 = this.f24440c;
            if (aVar2.f18494a == i12 && da1.a(aVar2.f18495b, bVarB)) {
                return true;
            }
            this.f24440c = qc0.this.f24432g.a(i12, bVarB);
            return true;
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void a(int i10, nc0.b bVar) {
            if (e(i10, bVar)) {
                this.f24440c.c();
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void a(int i10, nc0.b bVar, int i11) {
            if (e(i10, bVar)) {
                this.f24440c.a(i11);
            }
        }

        @Override // com.yandex.mobile.ads.impl.oc0
        public final void a(int i10, nc0.b bVar, dc0 dc0Var) {
            if (e(i10, bVar)) {
                this.f24439b.a(dc0Var);
            }
        }

        @Override // com.yandex.mobile.ads.impl.oc0
        public final void a(int i10, nc0.b bVar, v80 v80Var, dc0 dc0Var) {
            if (e(i10, bVar)) {
                this.f24439b.a(v80Var, dc0Var);
            }
        }

        @Override // com.yandex.mobile.ads.impl.oc0
        public final void a(int i10, nc0.b bVar, v80 v80Var, dc0 dc0Var, IOException iOException, boolean z10) {
            if (e(i10, bVar)) {
                this.f24439b.a(v80Var, dc0Var, iOException, z10);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void a(int i10, nc0.b bVar, Exception exc) {
            if (e(i10, bVar)) {
                this.f24440c.a(exc);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void b(int i10, nc0.b bVar) {
            if (e(i10, bVar)) {
                this.f24440c.d();
            }
        }

        @Override // com.yandex.mobile.ads.impl.oc0
        public final void b(int i10, nc0.b bVar, v80 v80Var, dc0 dc0Var) {
            if (e(i10, bVar)) {
                this.f24439b.b(v80Var, dc0Var);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void c(int i10, nc0.b bVar) {
            if (e(i10, bVar)) {
                this.f24440c.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.oc0
        public final void c(int i10, nc0.b bVar, v80 v80Var, dc0 dc0Var) {
            if (e(i10, bVar)) {
                this.f24439b.c(v80Var, dc0Var);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.f
        public final void d(int i10, nc0.b bVar) {
            if (e(i10, bVar)) {
                this.f24440c.b();
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nc0 f24442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc0.c f24443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f24444c;

        public b(ka0 ka0Var, nc0.c cVar, a aVar) {
            this.f24442a = ka0Var;
            this.f24443b = cVar;
            this.f24444c = aVar;
        }
    }

    public static final class c implements pc0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ka0 f24445a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f24449e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f24447c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f24446b = new Object();

        public c(nc0 nc0Var, boolean z10) {
            this.f24445a = new ka0(nc0Var, z10);
        }

        @Override // com.yandex.mobile.ads.impl.pc0
        public final Object a() {
            return this.f24446b;
        }

        @Override // com.yandex.mobile.ads.impl.pc0
        public final v61 b() {
            return this.f24445a.f();
        }
    }

    public interface d {
    }

    public qc0(d dVar, w8 w8Var, Handler handler, gr0 gr0Var) {
        this.f24426a = gr0Var;
        this.f24430e = dVar;
        oc0.a aVar = new oc0.a();
        this.f24431f = aVar;
        com.yandex.mobile.ads.exo.drm.f.a aVar2 = new com.yandex.mobile.ads.exo.drm.f.a();
        this.f24432g = aVar2;
        this.f24433h = new HashMap<>();
        this.f24434i = new HashSet();
        aVar.a(handler, w8Var);
        aVar2.a(handler, w8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(nc0 nc0Var, v61 v61Var) {
        ((ts) this.f24430e).h();
    }

    private void a(c cVar) {
        ka0 ka0Var = cVar.f24445a;
        nc0.c cVar2 = new nc0.c() { // from class: com.yandex.mobile.ads.impl.qp1
            @Override // com.yandex.mobile.ads.impl.nc0.c
            public final void a(nc0 nc0Var, v61 v61Var) {
                this.f24556a.a(nc0Var, v61Var);
            }
        };
        a aVar = new a(cVar);
        this.f24433h.put(cVar, new b(ka0Var, cVar2, aVar));
        ka0Var.a(da1.b((Handler.Callback) null), (oc0) aVar);
        ka0Var.a(da1.b((Handler.Callback) null), (com.yandex.mobile.ads.exo.drm.f) aVar);
        ka0Var.a(cVar2, this.f24437l, this.f24426a);
    }

    public final ja0 a(nc0.b bVar, u8 u8Var, long j10) {
        Object objD = e.d(bVar.f22012a);
        nc0.b bVarB = bVar.b(e.c(bVar.f22012a));
        c cVar = (c) this.f24429d.get(objD);
        Objects.requireNonNull(cVar);
        this.f24434i.add(cVar);
        b bVar2 = this.f24433h.get(cVar);
        if (bVar2 != null) {
            bVar2.f24442a.c(bVar2.f24443b);
        }
        cVar.f24447c.add(bVarB);
        ja0 ja0VarB = cVar.f24445a.a(bVarB, u8Var, j10);
        this.f24428c.put(ja0VarB, cVar);
        Iterator it = this.f24434i.iterator();
        while (it.hasNext()) {
            c cVar2 = (c) it.next();
            if (cVar2.f24447c.isEmpty()) {
                b bVar3 = this.f24433h.get(cVar2);
                if (bVar3 != null) {
                    bVar3.f24442a.b(bVar3.f24443b);
                }
                it.remove();
            }
        }
        return ja0VarB;
    }

    public final v61 a() {
        if (this.f24427b.isEmpty()) {
            return v61.f25844a;
        }
        int iB = 0;
        for (int i10 = 0; i10 < this.f24427b.size(); i10++) {
            c cVar = (c) this.f24427b.get(i10);
            cVar.f24448d = iB;
            iB += cVar.f24445a.f().b();
        }
        return new vr0(this.f24427b, this.f24435j);
    }

    public final v61 a(int i10, int i11, i11 i11Var) {
        pa.a(i10 >= 0 && i10 <= i11 && i11 <= this.f24427b.size());
        this.f24435j = i11Var;
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVar = (c) this.f24427b.remove(i12);
            this.f24429d.remove(cVar.f24446b);
            int i13 = -cVar.f24445a.f().b();
            for (int i14 = i12; i14 < this.f24427b.size(); i14++) {
                ((c) this.f24427b.get(i14)).f24448d += i13;
            }
            cVar.f24449e = true;
            if (this.f24436k && cVar.f24447c.isEmpty()) {
                b bVarRemove = this.f24433h.remove(cVar);
                Objects.requireNonNull(bVarRemove);
                bVarRemove.f24442a.a(bVarRemove.f24443b);
                bVarRemove.f24442a.a((oc0) bVarRemove.f24444c);
                bVarRemove.f24442a.a((com.yandex.mobile.ads.exo.drm.f) bVarRemove.f24444c);
                this.f24434i.remove(cVar);
            }
        }
        return a();
    }

    public final v61 a(int i10, List<c> list, i11 i11Var) {
        if (!list.isEmpty()) {
            this.f24435j = i11Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = (c) this.f24427b.get(i11 - 1);
                    cVar.f24448d = cVar2.f24445a.f().b() + cVar2.f24448d;
                } else {
                    cVar.f24448d = 0;
                }
                cVar.f24449e = false;
                cVar.f24447c.clear();
                int iB = cVar.f24445a.f().b();
                for (int i12 = i11; i12 < this.f24427b.size(); i12++) {
                    ((c) this.f24427b.get(i12)).f24448d += iB;
                }
                this.f24427b.add(i11, cVar);
                this.f24429d.put(cVar.f24446b, cVar);
                if (this.f24436k) {
                    a(cVar);
                    if (this.f24428c.isEmpty()) {
                        this.f24434i.add(cVar);
                    } else {
                        b bVar = this.f24433h.get(cVar);
                        if (bVar != null) {
                            bVar.f24442a.b(bVar.f24443b);
                        }
                    }
                }
            }
        }
        return a();
    }

    public final v61 a(i11 i11Var) {
        int size = this.f24427b.size();
        if (i11Var.a() != size) {
            i11Var = i11Var.d().b(size);
        }
        this.f24435j = i11Var;
        return a();
    }

    public final v61 a(List<c> list, i11 i11Var) {
        for (int size = this.f24427b.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f24427b.remove(size);
            this.f24429d.remove(cVar.f24446b);
            int i10 = -cVar.f24445a.f().b();
            for (int i11 = size; i11 < this.f24427b.size(); i11++) {
                ((c) this.f24427b.get(i11)).f24448d += i10;
            }
            cVar.f24449e = true;
            if (this.f24436k && cVar.f24447c.isEmpty()) {
                b bVarRemove = this.f24433h.remove(cVar);
                Objects.requireNonNull(bVarRemove);
                bVarRemove.f24442a.a(bVarRemove.f24443b);
                bVarRemove.f24442a.a((oc0) bVarRemove.f24444c);
                bVarRemove.f24442a.a((com.yandex.mobile.ads.exo.drm.f) bVarRemove.f24444c);
                this.f24434i.remove(cVar);
            }
        }
        return a(this.f24427b.size(), list, i11Var);
    }

    public final void a(g81 g81Var) {
        pa.b(!this.f24436k);
        this.f24437l = g81Var;
        for (int i10 = 0; i10 < this.f24427b.size(); i10++) {
            c cVar = (c) this.f24427b.get(i10);
            a(cVar);
            this.f24434i.add(cVar);
        }
        this.f24436k = true;
    }

    public final void a(hc0 hc0Var) {
        c cVarRemove = this.f24428c.remove(hc0Var);
        Objects.requireNonNull(cVarRemove);
        cVarRemove.f24445a.a(hc0Var);
        cVarRemove.f24447c.remove(((ja0) hc0Var).f22000b);
        if (!this.f24428c.isEmpty()) {
            Iterator it = this.f24434i.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (cVar.f24447c.isEmpty()) {
                    b bVar = this.f24433h.get(cVar);
                    if (bVar != null) {
                        bVar.f24442a.b(bVar.f24443b);
                    }
                    it.remove();
                }
            }
        }
        if (cVarRemove.f24449e && cVarRemove.f24447c.isEmpty()) {
            b bVarRemove = this.f24433h.remove(cVarRemove);
            Objects.requireNonNull(bVarRemove);
            bVarRemove.f24442a.a(bVarRemove.f24443b);
            bVarRemove.f24442a.a((oc0) bVarRemove.f24444c);
            bVarRemove.f24442a.a((com.yandex.mobile.ads.exo.drm.f) bVarRemove.f24444c);
            this.f24434i.remove(cVarRemove);
        }
    }

    public final int b() {
        return this.f24427b.size();
    }

    public final boolean c() {
        return this.f24436k;
    }

    public final v61 d() {
        pa.a(this.f24427b.size() >= 0);
        this.f24435j = null;
        return a();
    }

    public final void e() {
        for (b bVar : this.f24433h.values()) {
            try {
                bVar.f24442a.a(bVar.f24443b);
            } catch (RuntimeException e10) {
                p90.a("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f24442a.a((oc0) bVar.f24444c);
            bVar.f24442a.a((com.yandex.mobile.ads.exo.drm.f) bVar.f24444c);
        }
        this.f24433h.clear();
        this.f24434i.clear();
        this.f24436k = false;
    }
}
