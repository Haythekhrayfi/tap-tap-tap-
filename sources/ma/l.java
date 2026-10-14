package ma;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper", f = "PremiumHelper.kt", l = {929, 931}, m = "initAnalytics")
public final class l extends oc.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f33480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f33481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f33482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f33483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33484g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar, mc.d<? super l> dVar) {
        super(dVar);
        this.f33483f = hVar;
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        this.f33482e = obj;
        this.f33484g |= Integer.MIN_VALUE;
        return h.a(this.f33483f, this);
    }
}
