package n8;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends vc.l implements uc.a<jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f33678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f33679d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(v vVar, int i10) {
        super(0);
        this.f33678c = vVar;
        this.f33679d = i10;
    }

    @Override // uc.a
    public jc.w invoke() {
        this.f33678c.c(this.f33679d);
        return jc.w.f31842a;
    }
}
