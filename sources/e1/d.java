package e1;

import ch.qos.logback.core.joran.action.Action;
import fd.j0;
import vc.g;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {
    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public d(a aVar) {
        j0.i(aVar, "initialExtras");
        this.f28968a.putAll(aVar.f28968a);
    }

    public /* synthetic */ d(a aVar, int i10, g gVar) {
        this((i10 & 1) != 0 ? a.C0248a.f28969b : aVar);
    }

    @Override // e1.a
    public <T> T a(a.b<T> bVar) {
        j0.i(bVar, Action.KEY_ATTRIBUTE);
        return (T) this.f28968a.get(bVar);
    }

    public final <T> void b(a.b<T> bVar, T t10) {
        j0.i(bVar, Action.KEY_ATTRIBUTE);
        this.f28968a.put(bVar, t10);
    }
}
