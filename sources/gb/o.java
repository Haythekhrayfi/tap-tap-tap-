package gb;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {157, 158}, m = "queryOffer")
public final class o extends oc.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f30372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f30373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f30375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30376g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(g gVar, mc.d<? super o> dVar) {
        super(dVar);
        this.f30375f = gVar;
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        this.f30374e = obj;
        this.f30376g |= Integer.MIN_VALUE;
        return g.e(this.f30375f, null, this);
    }
}
