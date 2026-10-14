package z6;

/* JADX INFO: loaded from: classes2.dex */
public final class m1 extends vc.l implements uc.l<r6.d, r6.d> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1 f45116c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(i1 i1Var) {
        super(1);
        this.f45116c = i1Var;
    }

    @Override // uc.l
    public r6.d invoke(r6.d dVar) {
        r6.d dVar2 = dVar;
        fd.j0.i(dVar2, "set");
        while (this.f45116c.f45068i) {
            try {
                Thread.sleep(300L);
            } catch (Exception unused) {
            }
        }
        return dVar2;
    }
}
