package i8;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends vc.l implements uc.a<b9.e> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f31395c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(k kVar) {
        super(0);
        this.f31395c = kVar;
    }

    @Override // uc.a
    public b9.e invoke() {
        return new b9.e(new n(this.f31395c), this.f31395c.I);
    }
}
