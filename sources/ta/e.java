package ta;

import cd.i;
import fd.j0;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile d f35875b;

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public e(String str) {
        this.f35874a = str;
    }

    public /* synthetic */ e(String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public d a(T t10, i<?> iVar) {
        j0.i(iVar, "property");
        d dVar = this.f35875b;
        if (dVar != null) {
            return dVar;
        }
        this.f35875b = new d(t10, this.f35874a);
        d dVar2 = this.f35875b;
        j0.f(dVar2);
        return dVar2;
    }
}
