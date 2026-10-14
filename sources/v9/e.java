package v9;

import ch.qos.logback.core.joran.action.Action;
import fd.j0;
import h9.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jc.w;
import kc.m;
import kc.t;
import u9.f;
import vc.l;
import y8.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class e<T> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b<T>> f36765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g<T> f36766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u9.e f36767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<? extends T> f36768e;

    public static final class a extends l implements uc.l<T, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ uc.l<List<? extends T>, w> f36769c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e<T> f36770d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f36771e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(uc.l<? super List<? extends T>, w> lVar, e<T> eVar, d dVar) {
            super(1);
            this.f36769c = lVar;
            this.f36770d = eVar;
            this.f36771e = dVar;
        }

        @Override // uc.l
        public w invoke(Object obj) {
            j0.i(obj, "$noName_0");
            this.f36769c.invoke(this.f36770d.b(this.f36771e));
            return w.f31842a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(String str, List<? extends b<T>> list, g<T> gVar, u9.e eVar) {
        j0.i(str, Action.KEY_ATTRIBUTE);
        j0.i(list, "expressions");
        j0.i(gVar, "listValidator");
        j0.i(eVar, "logger");
        this.f36764a = str;
        this.f36765b = list;
        this.f36766c = gVar;
        this.f36767d = eVar;
    }

    @Override // v9.c
    public p7.d a(d dVar, uc.l<? super List<? extends T>, w> lVar) {
        j0.i(dVar, "resolver");
        j0.i(lVar, "callback");
        a aVar = new a(lVar, this, dVar);
        if (this.f36765b.size() == 1) {
            return ((b) t.r(this.f36765b)).e(dVar, aVar);
        }
        p7.a aVar2 = new p7.a();
        Iterator<T> it = this.f36765b.iterator();
        while (it.hasNext()) {
            p7.d dVarE = ((b) it.next()).e(dVar, aVar);
            j0.i(dVarE, "disposable");
            if (!(!aVar2.f34466d)) {
                throw new IllegalArgumentException("close() method was called".toString());
            }
            if (dVarE != p7.c.f34476c) {
                aVar2.f34465c.add(dVarE);
            }
        }
        return aVar2;
    }

    @Override // v9.c
    public List<T> b(d dVar) {
        j0.i(dVar, "resolver");
        try {
            List<T> listC = c(dVar);
            this.f36768e = listC;
            return listC;
        } catch (f e10) {
            this.f36767d.b(e10);
            List<? extends T> list = this.f36768e;
            if (list != null) {
                return list;
            }
            throw e10;
        }
    }

    public final List<T> c(d dVar) {
        List<b<T>> list = this.f36765b;
        ArrayList arrayList = new ArrayList(m.j(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((b) it.next()).b(dVar));
        }
        if (this.f36766c.isValid(arrayList)) {
            return arrayList;
        }
        throw c0.n(this.f36764a, arrayList);
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && j0.d(this.f36765b, ((e) obj).f36765b);
    }
}
