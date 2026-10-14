package d2;

import android.content.Context;
import android.os.Build;
import g2.p;

/* JADX INFO: loaded from: classes.dex */
public class g extends c<c2.b> {
    public g(Context context, j2.a aVar) {
        super((e2.e) e2.g.a(context, aVar).f28995c);
    }

    @Override // d2.c
    public boolean b(p pVar) {
        androidx.work.f fVar = pVar.f29749j.f37380a;
        return fVar == androidx.work.f.UNMETERED || (Build.VERSION.SDK_INT >= 30 && fVar == androidx.work.f.TEMPORARILY_UNMETERED);
    }

    @Override // d2.c
    public boolean c(c2.b bVar) {
        c2.b bVar2 = bVar;
        return !bVar2.f3538a || bVar2.f3540c;
    }
}
