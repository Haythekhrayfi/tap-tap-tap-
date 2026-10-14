package qb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import y8.c0;
import yb.j;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements nb.b, a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<nb.b> f34871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f34872d;

    public d() {
    }

    public d(Iterable<? extends nb.b> iterable) {
        Objects.requireNonNull(iterable, "resources is null");
        this.f34871c = new LinkedList();
        for (nb.b bVar : iterable) {
            Objects.requireNonNull(bVar, "Disposable item is null");
            this.f34871c.add(bVar);
        }
    }

    @Override // qb.a
    public boolean a(nb.b bVar) {
        if (!this.f34872d) {
            synchronized (this) {
                if (!this.f34872d) {
                    List linkedList = this.f34871c;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.f34871c = linkedList;
                    }
                    linkedList.add(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    @Override // qb.a
    public boolean b(nb.b bVar) {
        if (!c(bVar)) {
            return false;
        }
        ((j) bVar).dispose();
        return true;
    }

    @Override // qb.a
    public boolean c(nb.b bVar) {
        Objects.requireNonNull(bVar, "Disposable item is null");
        if (this.f34872d) {
            return false;
        }
        synchronized (this) {
            if (this.f34872d) {
                return false;
            }
            List<nb.b> list = this.f34871c;
            if (list != null && list.remove(bVar)) {
                return true;
            }
            return false;
        }
    }

    @Override // nb.b
    public void dispose() {
        if (this.f34872d) {
            return;
        }
        synchronized (this) {
            if (this.f34872d) {
                return;
            }
            this.f34872d = true;
            List<nb.b> list = this.f34871c;
            ArrayList arrayList = null;
            this.f34871c = null;
            if (list == null) {
                return;
            }
            Iterator<nb.b> it = list.iterator();
            while (it.hasNext()) {
                try {
                    it.next().dispose();
                } catch (Throwable th) {
                    c0.Q(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList != null) {
                if (arrayList.size() != 1) {
                    throw new ob.a(arrayList);
                }
                throw bc.e.d((Throwable) arrayList.get(0));
            }
        }
    }

    public d(nb.b... bVarArr) {
        Objects.requireNonNull(bVarArr, "resources is null");
        this.f34871c = new LinkedList();
        for (nb.b bVar : bVarArr) {
            Objects.requireNonNull(bVar, "Disposable item is null");
            this.f34871c.add(bVar);
        }
    }
}
