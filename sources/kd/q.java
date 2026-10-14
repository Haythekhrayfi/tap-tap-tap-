package kd;

import fd.s1;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s1 f32064a;

    static {
        Object obj;
        fd.z.O("kotlinx.coroutines.fast.service.loader", true);
        List<? extends o> listH = dd.q.h(dd.j.a(p.a()));
        Iterator it = listH.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iC = ((o) next).c();
                do {
                    Object next2 = it.next();
                    int iC2 = ((o) next2).c();
                    if (iC < iC2) {
                        next = next2;
                        iC = iC2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        o oVar = (o) obj;
        if (oVar != null) {
            try {
                s1 s1VarB = oVar.b(listH);
                if (s1VarB != null) {
                    f32064a = s1VarB;
                    return;
                }
            } catch (Throwable th) {
                oVar.a();
                throw th;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
