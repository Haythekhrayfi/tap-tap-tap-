package gb;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.util.ContactSupport", f = "ContactSupport.kt", l = {201, 206}, m = "prepareAttachment")
public final class r extends oc.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f30396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f30397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f30398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f30399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f30400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f30401h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, mc.d<? super r> dVar) {
        super(dVar);
        this.f30400g = qVar;
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        this.f30399f = obj;
        this.f30401h |= Integer.MIN_VALUE;
        return q.a(this.f30400g, null, this);
    }
}
