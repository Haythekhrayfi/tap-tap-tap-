package gb;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {379}, m = "hasPurchased")
public final class k extends oc.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f30348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30349e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar, mc.d<? super k> dVar) {
        super(dVar);
        this.f30348d = gVar;
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        this.f30347c = obj;
        this.f30349e |= Integer.MIN_VALUE;
        return g.c(this.f30348d, null, null, this);
    }
}
