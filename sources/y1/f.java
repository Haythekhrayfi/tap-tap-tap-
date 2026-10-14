package y1;

import androidx.work.impl.WorkDatabase;
import g2.p;
import g2.q;
import g2.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f37991a = x1.m.e("Schedulers");

    public static void a(androidx.work.b bVar, WorkDatabase workDatabase, List<e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        q qVarV = workDatabase.v();
        workDatabase.c();
        try {
            r rVar = (r) qVarV;
            List<p> listC = rVar.c(bVar.f3105k);
            List<p> listB = rVar.b(200);
            if (((ArrayList) listC).size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = ((ArrayList) listC).iterator();
                while (it.hasNext()) {
                    rVar.l(((p) it.next()).f29740a, jCurrentTimeMillis);
                }
            }
            workDatabase.p();
            workDatabase.g();
            ArrayList arrayList = (ArrayList) listC;
            if (arrayList.size() > 0) {
                p[] pVarArr = (p[]) arrayList.toArray(new p[arrayList.size()]);
                for (e eVar : list) {
                    if (eVar.c()) {
                        eVar.a(pVarArr);
                    }
                }
            }
            ArrayList arrayList2 = (ArrayList) listB;
            if (arrayList2.size() > 0) {
                p[] pVarArr2 = (p[]) arrayList2.toArray(new p[arrayList2.size()]);
                for (e eVar2 : list) {
                    if (!eVar2.c()) {
                        eVar2.a(pVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
