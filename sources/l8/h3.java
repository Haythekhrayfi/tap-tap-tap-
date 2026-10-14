package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class h3 extends vc.l implements uc.l<g8.a, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vc.a0<g8.a> f32419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.h f32420d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(vc.a0<g8.a> a0Var, o8.h hVar) {
        super(1);
        this.f32419c = a0Var;
        this.f32420d = hVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, g8.a] */
    @Override // uc.l
    public jc.w invoke(g8.a aVar) {
        g8.a aVar2 = aVar;
        this.f32419c.f36988c = aVar2;
        if (aVar2 != 0) {
            o8.h hVar = this.f32420d;
            hVar.setText(aVar2.i());
            hVar.setSelection(aVar2.f30031d);
        }
        return jc.w.f31842a;
    }
}
