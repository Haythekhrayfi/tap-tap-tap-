package d8;

import jc.w;
import vc.z;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends vc.l implements uc.a<w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f28880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f28881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f28882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f28883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uc.a<w> f28884g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j10, d dVar, z zVar, long j11, uc.a<w> aVar) {
        super(0);
        this.f28880c = j10;
        this.f28881d = dVar;
        this.f28882e = zVar;
        this.f28883f = j11;
        this.f28884g = aVar;
    }

    @Override // uc.a
    public w invoke() {
        long j10 = this.f28880c;
        d dVar = this.f28881d;
        int i10 = d.f28857q;
        long jD = j10 - dVar.d();
        this.f28881d.c();
        this.f28882e.f37007c--;
        boolean z10 = false;
        if (1 <= jD && jD < this.f28883f) {
            z10 = true;
        }
        if (z10) {
            this.f28881d.b();
            d.j(this.f28881d, jD, 0L, new g(this.f28884g), 2, null);
        } else if (jD <= 0) {
            this.f28884g.invoke();
        }
        return w.f31842a;
    }
}
