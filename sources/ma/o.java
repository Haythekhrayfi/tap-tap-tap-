package ma;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper", f = "PremiumHelper.kt", l = {884}, m = "initTotoConfig")
public final class o extends oc.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f33493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f33494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f33495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f33496f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(h hVar, mc.d<? super o> dVar) {
        super(dVar);
        this.f33495e = hVar;
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        this.f33494d = obj;
        this.f33496f |= Integer.MIN_VALUE;
        return h.d(this.f33495e, this);
    }
}
