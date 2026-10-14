package he;

import fd.j0;
import vc.l;
import wd.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends l implements uc.l<b, fe.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f31115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f31116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f31117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uc.l f31118f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, boolean z10, boolean z11, uc.l lVar) {
        super(1);
        this.f31115c = str;
        this.f31116d = z10;
        this.f31117e = z11;
        this.f31118f = lVar;
    }

    @Override // uc.l
    public fe.a invoke(b bVar) {
        b bVar2 = bVar;
        j0.j(bVar2, "koinContext");
        fe.a aVar = new fe.a(this.f31115c, this.f31116d, this.f31117e, bVar2);
        this.f31118f.invoke(aVar);
        return aVar;
    }
}
