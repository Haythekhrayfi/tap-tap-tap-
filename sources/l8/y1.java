package l8;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class y1 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.a f32975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.e f32976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.b<y9.t> f32978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v9.b<y9.u> f32979g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.yandex.div.core.view2.divs.a aVar, o8.e eVar, v9.d dVar, v9.b<y9.t> bVar, v9.b<y9.u> bVar2) {
        super(1);
        this.f32975c = aVar;
        this.f32976d = eVar;
        this.f32977e = dVar;
        this.f32978f = bVar;
        this.f32979g = bVar2;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        com.yandex.div.core.view2.divs.a aVar = this.f32975c;
        o8.e eVar = this.f32976d;
        v9.d dVar = this.f32977e;
        v9.b<y9.t> bVar = this.f32978f;
        v9.b<y9.u> bVar2 = this.f32979g;
        int i10 = com.yandex.div.core.view2.divs.a.f13421e;
        Objects.requireNonNull(aVar);
        eVar.setGravity(b.x(bVar.b(dVar), bVar2.b(dVar)));
        return jc.w.f31842a;
    }
}
