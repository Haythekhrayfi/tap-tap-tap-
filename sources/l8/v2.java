package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class v2 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.h f32903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y9.s3 f32904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32905e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(o8.h hVar, y9.s3 s3Var, v9.d dVar) {
        super(1);
        this.f32903c = hVar;
        this.f32904d = s3Var;
        this.f32905e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        this.f32903c.setHintTextColor(this.f32904d.f42541q.b(this.f32905e).intValue());
        return jc.w.f31842a;
    }
}
