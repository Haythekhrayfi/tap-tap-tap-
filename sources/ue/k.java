package ue;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends vc.l implements uc.l<Throwable, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f36420c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b bVar) {
        super(1);
        this.f36420c = bVar;
    }

    @Override // uc.l
    public jc.w invoke(Throwable th) {
        this.f36420c.cancel();
        return jc.w.f31842a;
    }
}
