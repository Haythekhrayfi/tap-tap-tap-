package d2;

import android.content.Context;
import android.os.Build;
import g2.p;
import x1.m;

/* JADX INFO: loaded from: classes.dex */
public class e extends c<c2.b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f28631e = m.e("NetworkMeteredCtrlr");

    public e(Context context, j2.a aVar) {
        super((e2.e) e2.g.a(context, aVar).f28995c);
    }

    @Override // d2.c
    public boolean b(p pVar) {
        return pVar.f29749j.f37380a == androidx.work.f.METERED;
    }

    @Override // d2.c
    public boolean c(c2.b bVar) {
        c2.b bVar2 = bVar;
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 26) {
            m.c().a(f28631e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !bVar2.f3538a;
        }
        if (bVar2.f3538a && bVar2.f3540c) {
            z10 = false;
        }
        return z10;
    }
}
