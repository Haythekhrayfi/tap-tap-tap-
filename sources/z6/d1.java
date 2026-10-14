package z6;

/* JADX INFO: loaded from: classes2.dex */
public final class d1 extends vc.l implements uc.l<r6.d, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f45044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v6.a f45045d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(x0 x0Var, v6.a aVar) {
        super(1);
        this.f45044c = x0Var;
        this.f45045d = aVar;
    }

    @Override // uc.l
    public jc.w invoke(r6.d dVar) {
        r6.d dVar2 = dVar;
        q6.b bVar = this.f45044c.f45142a;
        dVar2.i(this.f45045d.e());
        bVar.c(dVar2);
        return jc.w.f31842a;
    }
}
