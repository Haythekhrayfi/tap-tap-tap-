package u7;

import fd.j0;
import java.util.Iterator;
import java.util.Objects;
import p7.f1;
import w7.h;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.d f36045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f36046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v7.c f36047c;

    public d(v9.d dVar, h hVar, v7.c cVar) {
        j0.i(dVar, "expressionResolver");
        j0.i(hVar, "variableController");
        j0.i(cVar, "triggersController");
        this.f36045a = dVar;
        this.f36046b = hVar;
        this.f36047c = cVar;
    }

    public final void a(f1 f1Var) {
        j0.i(f1Var, "view");
        v7.c cVar = this.f36047c;
        Objects.requireNonNull(cVar);
        Iterator<T> it = cVar.f36717g.iterator();
        while (it.hasNext()) {
            ((v7.a) it.next()).a(f1Var);
        }
    }
}
