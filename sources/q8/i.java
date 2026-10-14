package q8;

import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends vc.l implements uc.l<Throwable, CharSequence> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f34823c = new i();

    public i() {
        super(1);
    }

    @Override // uc.l
    public CharSequence invoke(Throwable th) {
        Throwable th2 = th;
        j0.i(th2, "it");
        return j0.p(" - ", u1.a.a(th2));
    }
}
