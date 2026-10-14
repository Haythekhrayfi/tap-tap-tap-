package x8;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends vc.l implements uc.a<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f37558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a.C0462a f37559d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, a.C0462a c0462a) {
        super(0);
        this.f37558c = fVar;
        this.f37559d = c0462a;
    }

    @Override // uc.a
    public final Object invoke() {
        Object objA = this.f37558c.a(this.f37559d.f37524f);
        a.C0462a c0462a = this.f37559d;
        c0462a.d(c0462a.f37524f.f37521b);
        return objA;
    }
}
