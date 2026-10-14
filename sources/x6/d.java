package x6;

import vc.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends vc.l implements uc.a<a7.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ le.a f37481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f37482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ de.a f37483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uc.a f37484f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
        super(0);
        this.f37481c = aVar;
        this.f37482d = str;
        this.f37483e = aVar2;
        this.f37484f = aVar3;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [a7.a, java.lang.Object] */
    @Override // uc.a
    public final a7.a invoke() {
        return this.f37481c.getKoin().f37311a.c(new yd.h(this.f37482d, b0.a(a7.a.class), this.f37483e, this.f37484f));
    }
}
