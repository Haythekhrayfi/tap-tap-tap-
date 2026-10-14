package x7;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<List<? extends c>> f37518a;

    public b(ic.a<List<? extends c>> aVar) {
        this.f37518a = aVar;
    }

    @Override // ic.a
    public Object get() {
        return new a(this.f37518a.get());
    }
}
