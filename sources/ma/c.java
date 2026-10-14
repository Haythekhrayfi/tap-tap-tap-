package ma;

import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends vc.l implements uc.a<w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.a f33398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f33399d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.zipoapps.premiumhelper.a aVar, String str) {
        super(0);
        this.f33398c = aVar;
        this.f33399d = str;
    }

    @Override // uc.a
    public w invoke() {
        this.f33398c.v("user_status", this.f33399d);
        return w.f31842a;
    }
}
