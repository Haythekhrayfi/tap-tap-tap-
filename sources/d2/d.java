package d2;

import android.content.Context;
import android.os.Build;
import g2.p;

/* JADX INFO: loaded from: classes.dex */
public class d extends c<c2.b> {
    public d(Context context, j2.a aVar) {
        super((e2.e) e2.g.a(context, aVar).f28995c);
    }

    @Override // d2.c
    public boolean b(p pVar) {
        return pVar.f29749j.f37380a == androidx.work.f.CONNECTED;
    }

    @Override // d2.c
    public boolean c(c2.b bVar) {
        c2.b bVar2 = bVar;
        if (Build.VERSION.SDK_INT >= 26) {
            return (bVar2.f3538a && bVar2.f3539b) ? false : true;
        }
        return true ^ bVar2.f3538a;
    }
}
