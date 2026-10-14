package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Og {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jc.e f14638a = jc.f.b(new c());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jc.e f14639b = jc.f.b(new b());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jc.e f14640c = jc.f.b(new d());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Fg> f14641d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Ug f14642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Yg f14643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Ig f14644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Zg f14645h;

    public interface a {
        void a();
    }

    public static final class b extends vc.l implements uc.a<Pg> {
        public b() {
            super(0);
        }

        @Override // uc.a
        public Pg invoke() {
            return new Pg(this);
        }
    }

    public static final class c extends vc.l implements uc.a<Qg> {
        public c() {
            super(0);
        }

        @Override // uc.a
        public Qg invoke() {
            return new Qg(this);
        }
    }

    public static final class d extends vc.l implements uc.a<Rg> {
        public d() {
            super(0);
        }

        @Override // uc.a
        public Rg invoke() {
            return new Rg(this);
        }
    }

    public Og(Ug ug, Yg yg, Ig ig, Zg zg) {
        this.f14642e = ug;
        this.f14643f = yg;
        this.f14644g = ig;
        this.f14645h = zg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        List<Fg> list = this.f14641d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.f14645h.b((Fg) obj)) {
                arrayList.add(obj);
            }
        }
        this.f14642e.a(this.f14645h.a(kc.t.p(arrayList)));
    }

    public static final void a(Og og, Fg fg, a aVar) {
        og.f14641d.add(fg);
        if (og.f14645h.a(fg)) {
            og.f14642e.a(fg);
        } else {
            aVar.a();
        }
    }

    public static final a b(Og og) {
        return (a) og.f14639b.getValue();
    }

    public static final a c(Og og) {
        return (a) og.f14638a.getValue();
    }

    public final void b() {
        this.f14643f.a((Xg) this.f14640c.getValue());
    }
}
