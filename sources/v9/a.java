package v9;

import fd.j0;
import java.util.List;
import jc.w;
import uc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class a<T> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<T> f36746a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends T> list) {
        j0.i(list, "valuesList");
        this.f36746a = list;
    }

    @Override // v9.c
    public p7.d a(d dVar, l<? super List<? extends T>, w> lVar) {
        j0.i(dVar, "resolver");
        j0.i(lVar, "callback");
        int i10 = p7.d.C1;
        return p7.c.f34476c;
    }

    @Override // v9.c
    public List<T> b(d dVar) {
        j0.i(dVar, "resolver");
        return this.f36746a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && j0.d(this.f36746a, ((a) obj).f36746a);
    }
}
