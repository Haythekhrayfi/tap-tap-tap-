package i8;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends vc.l implements uc.a<d9.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f31389c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar) {
        super(0);
        this.f31389c = kVar;
    }

    @Override // uc.a
    public d9.a invoke() {
        d9.a aVar = ((r7.a.b) this.f31389c.getDiv2Component$div_release()).B0.get();
        fd.j0.h(aVar, "div2Component.histogramReporter");
        return aVar;
    }
}
