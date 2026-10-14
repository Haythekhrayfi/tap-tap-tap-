package ma;

import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends vc.l implements uc.a<w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.a f33396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f33397d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.zipoapps.premiumhelper.a aVar, String str) {
        super(0);
        this.f33396c = aVar;
        this.f33397d = str;
    }

    @Override // uc.a
    public w invoke() {
        this.f33396c.v("user_status", this.f33397d);
        return w.f31842a;
    }
}
