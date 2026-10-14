package l8;

import java.util.List;
import y9.c8;

/* JADX INFO: loaded from: classes2.dex */
public final class g5 extends vc.l implements uc.l<y9.k, Boolean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g5 f32405c = new g5();

    public g5() {
        super(1);
    }

    @Override // uc.l
    public Boolean invoke(y9.k kVar) {
        boolean zContains;
        y9.k kVar2 = kVar;
        fd.j0.i(kVar2, "div");
        List<c8> listI = kVar2.a().i();
        if (listI == null) {
            zContains = true;
        } else {
            fd.j0.i(listI, "<this>");
            zContains = listI.contains(c8.STATE_CHANGE);
        }
        return Boolean.valueOf(zContains);
    }
}
