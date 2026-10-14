package d2;

import android.content.Context;
import g2.p;
import x1.m;

/* JADX INFO: loaded from: classes.dex */
public class f extends c<c2.b> {
    static {
        m.e("NetworkNotRoamingCtrlr");
    }

    public f(Context context, j2.a aVar) {
        super((e2.e) e2.g.a(context, aVar).f28995c);
    }

    @Override // d2.c
    public boolean b(p pVar) {
        return pVar.f29749j.f37380a == androidx.work.f.NOT_ROAMING;
    }

    @Override // d2.c
    public boolean c(c2.b bVar) {
        c2.b bVar2 = bVar;
        return (bVar2.f3538a && bVar2.f3541d) ? false : true;
    }
}
