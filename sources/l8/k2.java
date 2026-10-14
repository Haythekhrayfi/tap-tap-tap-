package l8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k2 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g2 f32526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.g f32527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<y9.d2> f32528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i8.k f32529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v9.d f32530g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k2(g2 g2Var, o8.g gVar, List<? extends y9.d2> list, i8.k kVar, v9.d dVar) {
        super(1);
        this.f32526c = g2Var;
        this.f32527d = gVar;
        this.f32528e = list;
        this.f32529f = kVar;
        this.f32530g = dVar;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        g2.a(this.f32526c, this.f32527d, this.f32528e, this.f32529f, this.f32530g);
        return jc.w.f31842a;
    }
}
