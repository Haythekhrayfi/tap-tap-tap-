package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class w2 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.h f32927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v9.b<String> f32928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32929e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(o8.h hVar, v9.b<String> bVar, v9.d dVar) {
        super(1);
        this.f32927c = hVar;
        this.f32928d = bVar;
        this.f32929e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        this.f32927c.setHint(this.f32928d.b(this.f32929e));
        return jc.w.f31842a;
    }
}
