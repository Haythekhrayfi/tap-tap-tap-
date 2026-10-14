package x6;

import vc.b0;
import z6.r;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends vc.l implements uc.a<r> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ le.a f37489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f37490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ de.a f37491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uc.a f37492f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
        super(0);
        this.f37489c = aVar;
        this.f37490d = str;
        this.f37491e = aVar2;
        this.f37492f = aVar3;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, z6.r] */
    @Override // uc.a
    public final r invoke() {
        return this.f37489c.getKoin().f37311a.c(new yd.h(this.f37490d, b0.a(r.class), this.f37491e, this.f37492f));
    }
}
