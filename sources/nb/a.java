package nb;

import bc.e;
import bc.g;
import java.util.ArrayList;
import java.util.Objects;
import y8.c0;
import yb.j;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b, qb.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g<b> f33759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f33760d;

    public a() {
    }

    public a(Iterable<? extends b> iterable) {
        Objects.requireNonNull(iterable, "disposables is null");
        this.f33759c = new g<>();
        for (b bVar : iterable) {
            Objects.requireNonNull(bVar, "A Disposable item in the disposables sequence is null");
            this.f33759c.a(bVar);
        }
    }

    @Override // qb.a
    public boolean a(b bVar) {
        Objects.requireNonNull(bVar, "disposable is null");
        if (!this.f33760d) {
            synchronized (this) {
                if (!this.f33760d) {
                    g<b> gVar = this.f33759c;
                    if (gVar == null) {
                        gVar = new g<>();
                        this.f33759c = gVar;
                    }
                    gVar.a(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    @Override // qb.a
    public boolean b(b bVar) {
        if (!c(bVar)) {
            return false;
        }
        ((j) bVar).dispose();
        return true;
    }

    @Override // qb.a
    public boolean c(b bVar) {
        boolean z10;
        Objects.requireNonNull(bVar, "disposables is null");
        if (this.f33760d) {
            return false;
        }
        synchronized (this) {
            if (this.f33760d) {
                return false;
            }
            g<b> gVar = this.f33759c;
            if (gVar != null) {
                b[] bVarArr = gVar.f3513e;
                int i10 = gVar.f3510b;
                int iB = g.b(bVar.hashCode()) & i10;
                b bVar2 = bVarArr[iB];
                if (bVar2 != null) {
                    if (!bVar2.equals(bVar)) {
                        while (true) {
                            iB = (iB + 1) & i10;
                            b bVar3 = bVarArr[iB];
                            if (bVar3 == null) {
                                z10 = false;
                            } else if (bVar3.equals(bVar)) {
                            }
                        }
                    }
                    gVar.c(iB, bVarArr, i10);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
            }
            return false;
        }
    }

    public void d() {
        if (this.f33760d) {
            return;
        }
        synchronized (this) {
            if (this.f33760d) {
                return;
            }
            g<b> gVar = this.f33759c;
            this.f33759c = null;
            e(gVar);
        }
    }

    @Override // nb.b
    public void dispose() {
        if (this.f33760d) {
            return;
        }
        synchronized (this) {
            if (this.f33760d) {
                return;
            }
            this.f33760d = true;
            g<b> gVar = this.f33759c;
            this.f33759c = null;
            e(gVar);
        }
    }

    public void e(g<b> gVar) {
        if (gVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (b bVar : gVar.f3513e) {
            if (bVar instanceof b) {
                try {
                    bVar.dispose();
                } catch (Throwable th) {
                    c0.Q(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new ob.a(arrayList);
            }
            throw e.d((Throwable) arrayList.get(0));
        }
    }

    public a(b... bVarArr) {
        Objects.requireNonNull(bVarArr, "disposables is null");
        this.f33759c = new g<>(bVarArr.length + 1);
        for (b bVar : bVarArr) {
            Objects.requireNonNull(bVar, "A Disposable in the disposables array is null");
            this.f33759c.a(bVar);
        }
    }
}
