package p6;

import fd.j0;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends l implements uc.l<Boolean, Boolean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r6.e f34462c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r6.e eVar) {
        super(1);
        this.f34462c = eVar;
    }

    @Override // uc.l
    public Boolean invoke(Boolean bool) {
        j0.i(bool, "it");
        return Boolean.valueOf(this.f34462c.e());
    }
}
