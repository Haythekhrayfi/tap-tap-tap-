package q8;

import fd.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jc.w;
import kc.t;
import uc.p;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f34815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<uc.l<m, w>> f34816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Throwable> f34817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Throwable> f34818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p7.d f34819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p<List<? extends Throwable>, List<? extends Throwable>, w> f34820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m f34821g;

    public static final class a extends vc.l implements p<List<? extends Throwable>, List<? extends Throwable>, w> {
        public a() {
            super(2);
        }

        @Override // uc.p
        public w invoke(List<? extends Throwable> list, List<? extends Throwable> list2) {
            List<? extends Throwable> list3 = list;
            List<? extends Throwable> list4 = list2;
            j0.i(list3, "errors");
            j0.i(list4, "warnings");
            List<Throwable> list5 = h.this.f34817c;
            list5.clear();
            list5.addAll(t.B(list3));
            List<Throwable> list6 = h.this.f34818d;
            list6.clear();
            list6.addAll(t.B(list4));
            h hVar = h.this;
            hVar.a(m.a(hVar.f34821g, false, hVar.f34817c.size(), h.this.f34818d.size(), j0.p("Last 25 errors:\n", t.w(t.D(h.this.f34817c, 25), "\n", null, null, 0, null, g.f34814c, 30)), j0.p("Last 25 warnings:\n", t.w(t.D(h.this.f34818d, 25), "\n", null, null, 0, null, i.f34823c, 30)), 1));
            return w.f31842a;
        }
    }

    public h(e eVar) {
        j0.i(eVar, "errorCollectors");
        this.f34815a = eVar;
        this.f34816b = new LinkedHashSet();
        this.f34817c = new ArrayList();
        this.f34818d = new ArrayList();
        this.f34820f = new a();
        this.f34821g = new m(false, 0, 0, null, null, 31, null);
    }

    public final void a(m mVar) {
        this.f34821g = mVar;
        Iterator<T> it = this.f34816b.iterator();
        while (it.hasNext()) {
            ((uc.l) it.next()).invoke(mVar);
        }
    }
}
