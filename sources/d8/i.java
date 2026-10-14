package d8;

import jc.w;
import vc.z;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends vc.l implements uc.a<w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f28885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f28886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f28887e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(z zVar, d dVar, long j10) {
        super(0);
        this.f28885c = zVar;
        this.f28886d = dVar;
        this.f28887e = j10;
    }

    @Override // uc.a
    public w invoke() {
        if (this.f28885c.f37007c > 0) {
            this.f28886d.f28862e.invoke(Long.valueOf(this.f28887e));
        }
        this.f28886d.f28861d.invoke(Long.valueOf(this.f28887e));
        this.f28886d.b();
        this.f28886d.f();
        this.f28886d.f28868k = d.b.STOPPED;
        return w.f31842a;
    }
}
