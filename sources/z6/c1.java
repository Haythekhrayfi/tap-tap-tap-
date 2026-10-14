package z6;

/* JADX INFO: loaded from: classes2.dex */
public final class c1 extends vc.l implements uc.l<r6.d, r6.d> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f45040c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(x0 x0Var) {
        super(1);
        this.f45040c = x0Var;
    }

    @Override // uc.l
    public r6.d invoke(r6.d dVar) {
        r6.d dVar2 = dVar;
        fd.j0.i(dVar2, "set");
        try {
            xe.a.f37601c.a("[ClickService] is stopped: " + this.f45040c.f45148g, new Object[0]);
            while (this.f45040c.f45148g) {
                Thread.sleep(300L);
            }
        } catch (Exception unused) {
        }
        return dVar2;
    }
}
