package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class t5 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m5 f32865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.i f32866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.b<Long> f32868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v9.b<Long> f32869g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(m5 m5Var, o8.i iVar, v9.d dVar, v9.b<Long> bVar, v9.b<Long> bVar2) {
        super(1);
        this.f32865c = m5Var;
        this.f32866d = iVar;
        this.f32867e = dVar;
        this.f32868f = bVar;
        this.f32869g = bVar2;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        this.f32865c.f(this.f32866d, this.f32867e, this.f32868f, this.f32869g);
        return jc.w.f31842a;
    }
}
