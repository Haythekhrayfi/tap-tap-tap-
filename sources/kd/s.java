package kd;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends vc.l implements uc.l<Throwable, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uc.l<Object, jc.w> f32067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mc.f f32069e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(uc.l<Object, jc.w> lVar, Object obj, mc.f fVar) {
        super(1);
        this.f32067c = lVar;
        this.f32068d = obj;
        this.f32069e = fVar;
    }

    @Override // uc.l
    public jc.w invoke(Throwable th) {
        uc.l<Object, jc.w> lVar = this.f32067c;
        Object obj = this.f32068d;
        mc.f fVar = this.f32069e;
        f0 f0VarA = t.a(lVar, obj, null);
        if (f0VarA != null) {
            fd.f.f(fVar, f0VarA);
        }
        return jc.w.f31842a;
    }
}
