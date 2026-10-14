package w6;

import com.inscode.autoclicker.database.AppDatabase;
import fd.j0;
import vc.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends vc.l implements uc.l<ae.a, v6.b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe.a f37112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fe.a aVar) {
        super(1);
        this.f37112c = aVar;
    }

    @Override // uc.l
    public v6.b invoke(ae.a aVar) {
        j0.i(aVar, "it");
        Object objC = this.f37112c.f29652f.f37311a.c(new yd.h("", b0.a(AppDatabase.class), null, ae.b.f348c));
        j0.g(objC, "null cannot be cast to non-null type com.inscode.autoclicker.database.AppDatabase");
        return ((AppDatabase) objC).u();
    }
}
