package p0;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f34388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<n> f34389b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<n, a> f34390c = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.lifecycle.i f34391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.lifecycle.n f34392b;

        public a(androidx.lifecycle.i iVar, androidx.lifecycle.n nVar) {
            this.f34391a = iVar;
            this.f34392b = nVar;
            iVar.a(nVar);
        }

        public void a() {
            this.f34391a.c(this.f34392b);
            this.f34392b = null;
        }
    }

    public l(Runnable runnable) {
        this.f34388a = runnable;
    }

    public void a(n nVar, androidx.lifecycle.p pVar) {
        this.f34389b.add(nVar);
        this.f34388a.run();
        androidx.lifecycle.i lifecycle = pVar.getLifecycle();
        a aVarRemove = this.f34390c.remove(nVar);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f34390c.put(nVar, new a(lifecycle, new j(this, nVar)));
    }

    @SuppressLint({"LambdaLast"})
    public void b(final n nVar, androidx.lifecycle.p pVar, final androidx.lifecycle.i.c cVar) {
        androidx.lifecycle.i lifecycle = pVar.getLifecycle();
        a aVarRemove = this.f34390c.remove(nVar);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f34390c.put(nVar, new a(lifecycle, new androidx.lifecycle.n() { // from class: p0.k
            @Override // androidx.lifecycle.n
            public final void g(androidx.lifecycle.p pVar2, androidx.lifecycle.i.b bVar) {
                l lVar = this.f34385c;
                androidx.lifecycle.i.c cVar2 = cVar;
                n nVar2 = nVar;
                Objects.requireNonNull(lVar);
                if (bVar == androidx.lifecycle.i.b.upTo(cVar2)) {
                    lVar.f34389b.add(nVar2);
                    lVar.f34388a.run();
                } else if (bVar == androidx.lifecycle.i.b.ON_DESTROY) {
                    lVar.f(nVar2);
                } else if (bVar == androidx.lifecycle.i.b.downFrom(cVar2)) {
                    lVar.f34389b.remove(nVar2);
                    lVar.f34388a.run();
                }
            }
        }));
    }

    public void c(Menu menu, MenuInflater menuInflater) {
        Iterator<n> it = this.f34389b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
    }

    public boolean d(MenuItem menuItem) {
        Iterator<n> it = this.f34389b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void e(Menu menu) {
        Iterator<n> it = this.f34389b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
    }

    public void f(n nVar) {
        this.f34389b.remove(nVar);
        a aVarRemove = this.f34390c.remove(nVar);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f34388a.run();
    }
}
