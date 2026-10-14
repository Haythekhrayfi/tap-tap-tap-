package ed;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends vc.l implements uc.l<bd.c, String> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CharSequence f29161c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(CharSequence charSequence) {
        super(1);
        this.f29161c = charSequence;
    }

    @Override // uc.l
    public String invoke(bd.c cVar) {
        bd.c cVar2 = cVar;
        j0.i(cVar2, "it");
        return u.T(this.f29161c, cVar2);
    }
}
