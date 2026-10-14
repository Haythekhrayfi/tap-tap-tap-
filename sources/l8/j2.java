package l8;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class j2 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g2 f32498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.g f32499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.b<y9.t> f32501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v9.b<y9.u> f32502g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(g2 g2Var, o8.g gVar, v9.d dVar, v9.b<y9.t> bVar, v9.b<y9.u> bVar2) {
        super(1);
        this.f32498c = g2Var;
        this.f32499d = gVar;
        this.f32500e = dVar;
        this.f32501f = bVar;
        this.f32502g = bVar2;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        g2 g2Var = this.f32498c;
        o8.g gVar = this.f32499d;
        v9.d dVar = this.f32500e;
        v9.b<y9.t> bVar = this.f32501f;
        v9.b<y9.u> bVar2 = this.f32502g;
        Objects.requireNonNull(g2Var);
        gVar.setGravity(b.x(bVar.b(dVar), bVar2.b(dVar)));
        return jc.w.f31842a;
    }
}
