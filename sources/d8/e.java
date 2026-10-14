package d8;

import jc.w;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends vc.l implements uc.a<w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f28876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f28877d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, long j10) {
        super(0);
        this.f28876c = dVar;
        this.f28877d = j10;
    }

    @Override // uc.a
    public w invoke() {
        this.f28876c.b();
        this.f28876c.f28861d.invoke(Long.valueOf(this.f28877d));
        d dVar = this.f28876c;
        dVar.f28868k = d.b.STOPPED;
        dVar.f();
        return w.f31842a;
    }
}
