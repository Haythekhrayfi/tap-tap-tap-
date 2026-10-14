package i8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y9.l1;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f31491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<uc.l<f, jc.w>> f31492b;

    public x0() {
        o7.a aVar = o7.a.f33994b;
        fd.j0.h(aVar, "INVALID");
        this.f31491a = new f(aVar, null);
        this.f31492b = new ArrayList();
    }

    public final void a(o7.a aVar, l1 l1Var) {
        fd.j0.i(aVar, "tag");
        if (fd.j0.d(aVar, this.f31491a.f31332a) && fd.j0.d(this.f31491a.f31333b, l1Var)) {
            return;
        }
        this.f31491a = new f(aVar, l1Var);
        Iterator<T> it = this.f31492b.iterator();
        while (it.hasNext()) {
            ((uc.l) it.next()).invoke(this.f31491a);
        }
    }
}
