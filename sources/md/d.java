package md;

import jc.w;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends l implements uc.l<Throwable, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f33551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f33552d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, Object obj) {
        super(1);
        this.f33551c = cVar;
        this.f33552d = obj;
    }

    @Override // uc.l
    public w invoke(Throwable th) {
        this.f33551c.a(this.f33552d);
        return w.f31842a;
    }
}
