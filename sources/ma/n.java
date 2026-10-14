package ma;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper", f = "PremiumHelper.kt", l = {910}, m = "initTesty")
public final class n extends oc.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f33490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f33491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33492e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(h hVar, mc.d<? super n> dVar) {
        super(dVar);
        this.f33491d = hVar;
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        this.f33490c = obj;
        this.f33492e |= Integer.MIN_VALUE;
        return h.c(this.f33491d, this);
    }
}
