package ge;

import fd.j0;
import h9.d;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends l implements uc.l<cd.c<?>, String> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f30443c = new a();

    public a() {
        super(1);
    }

    @Override // uc.l
    public String invoke(cd.c<?> cVar) {
        cd.c<?> cVar2 = cVar;
        j0.j(cVar2, "it");
        String canonicalName = d.i(cVar2).getCanonicalName();
        j0.e(canonicalName, "it.java.canonicalName");
        return canonicalName;
    }
}
