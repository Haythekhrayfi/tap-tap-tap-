package q8;

import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends vc.l implements uc.l<Throwable, CharSequence> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f34814c = new g();

    public g() {
        super(1);
    }

    @Override // uc.l
    public CharSequence invoke(Throwable th) {
        Throwable th2 = th;
        j0.i(th2, "it");
        if (!(th2 instanceof u9.f)) {
            return j0.p(" - ", u1.a.a(th2));
        }
        StringBuilder sbA = defpackage.a.a(" - ");
        sbA.append(((u9.f) th2).f36171c);
        sbA.append(": ");
        sbA.append(u1.a.a(th2));
        return sbA.toString();
    }
}
