package gb;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {248, 251, 265}, m = "handlePurchaseUpdate")
public final class h extends oc.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f30332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f30333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f30334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f30335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f30336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f30337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f30338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f30339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30340k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, mc.d<? super h> dVar) {
        super(dVar);
        this.f30339j = gVar;
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        this.f30338i = obj;
        this.f30340k |= Integer.MIN_VALUE;
        return g.b(this.f30339j, null, this);
    }
}
