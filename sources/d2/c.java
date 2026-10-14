package d2;

import g2.p;
import java.util.ArrayList;
import java.util.List;
import x1.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<T> implements c2.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f28627a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f28628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e2.d<T> f28629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f28630d;

    public interface a {
    }

    public c(e2.d<T> dVar) {
        this.f28629c = dVar;
    }

    @Override // c2.a
    public void a(T t10) {
        this.f28628b = t10;
        e(this.f28630d, t10);
    }

    public abstract boolean b(p pVar);

    public abstract boolean c(T t10);

    public void d(Iterable<p> iterable) {
        this.f28627a.clear();
        for (p pVar : iterable) {
            if (b(pVar)) {
                this.f28627a.add(pVar.f29740a);
            }
        }
        if (this.f28627a.isEmpty()) {
            this.f28629c.b(this);
        } else {
            e2.d<T> dVar = this.f28629c;
            synchronized (dVar.f28982c) {
                if (dVar.f28983d.add(this)) {
                    if (dVar.f28983d.size() == 1) {
                        dVar.f28984e = dVar.a();
                        m.c().a(e2.d.f28979f, String.format("%s: initial state = %s", dVar.getClass().getSimpleName(), dVar.f28984e), new Throwable[0]);
                        dVar.d();
                    }
                    a(dVar.f28984e);
                }
            }
        }
        e(this.f28630d, this.f28628b);
    }

    public final void e(a aVar, T t10) {
        if (this.f28627a.isEmpty() || aVar == null) {
            return;
        }
        if (t10 == null || c(t10)) {
            List<String> list = this.f28627a;
            c2.d dVar = (c2.d) aVar;
            synchronized (dVar.f3545c) {
                c2.c cVar = dVar.f3543a;
                if (cVar != null) {
                    cVar.b(list);
                }
            }
            return;
        }
        List<String> list2 = this.f28627a;
        c2.d dVar2 = (c2.d) aVar;
        synchronized (dVar2.f3545c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list2) {
                if (dVar2.a(str)) {
                    m.c().a(c2.d.f3542d, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            c2.c cVar2 = dVar2.f3543a;
            if (cVar2 != null) {
                cVar2.f(arrayList);
            }
        }
    }
}
