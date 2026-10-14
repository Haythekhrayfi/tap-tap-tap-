package z6;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f1 extends vc.l implements uc.l<List<r6.d>, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v6.a f45051c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(v6.a aVar) {
        super(1);
        this.f45051c = aVar;
    }

    @Override // uc.l
    public jc.w invoke(List<r6.d> list) {
        StringBuilder sbA = defpackage.a.a("Currently playing: ");
        sbA.append(this.f45051c.getName());
        sbA.append(" repeat: ");
        sbA.append(this.f45051c.f());
        xe.a.f37601c.a(sbA.toString(), new Object[0]);
        return jc.w.f31842a;
    }
}
