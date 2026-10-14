package x1;

/* JADX INFO: loaded from: classes.dex */
public final class l extends vc.l implements uc.l<Throwable, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t4.a<Object> f37408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(t4.a<Object> aVar) {
        super(1);
        this.f37408c = aVar;
    }

    @Override // uc.l
    public jc.w invoke(Throwable th) {
        this.f37408c.cancel(false);
        return jc.w.f31842a;
    }
}
