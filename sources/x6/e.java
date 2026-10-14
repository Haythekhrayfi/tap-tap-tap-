package x6;

import vc.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends vc.l implements uc.a<d7.g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ le.a f37485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f37486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ de.a f37487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uc.a f37488f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
        super(0);
        this.f37485c = aVar;
        this.f37486d = str;
        this.f37487e = aVar2;
        this.f37488f = aVar3;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [d7.g, java.lang.Object] */
    @Override // uc.a
    public final d7.g invoke() {
        return this.f37485c.getKoin().f37311a.c(new yd.h(this.f37486d, b0.a(d7.g.class), this.f37487e, this.f37488f));
    }
}
