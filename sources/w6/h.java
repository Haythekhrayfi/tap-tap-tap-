package w6;

import android.content.SharedPreferences;
import fd.j0;
import fd.z;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends vc.l implements uc.l<ae.a, SharedPreferences> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe.a f37119c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(fe.a aVar) {
        super(1);
        this.f37119c = aVar;
    }

    @Override // uc.l
    public SharedPreferences invoke(ae.a aVar) {
        j0.i(aVar, "it");
        return z.c(this.f37119c).getSharedPreferences("Clickmate", 0);
    }
}
