package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class u2 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.h f32873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v9.b<Integer> f32874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32875e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(o8.h hVar, v9.b<Integer> bVar, v9.d dVar) {
        super(1);
        this.f32873c = hVar;
        this.f32874d = bVar;
        this.f32875e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        this.f32873c.setHighlightColor(this.f32874d.b(this.f32875e).intValue());
        return jc.w.f31842a;
    }
}
