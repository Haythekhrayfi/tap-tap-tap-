package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class d3 extends vc.l implements uc.l<Exception, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uc.p<Exception, uc.a<jc.w>, jc.w> f32326c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d3(uc.p<? super Exception, ? super uc.a<jc.w>, jc.w> pVar) {
        super(1);
        this.f32326c = pVar;
    }

    @Override // uc.l
    public jc.w invoke(Exception exc) {
        Exception exc2 = exc;
        fd.j0.i(exc2, "it");
        this.f32326c.invoke(exc2, c3.f32300c);
        return jc.w.f31842a;
    }
}
