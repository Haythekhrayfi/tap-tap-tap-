package zd;

import ed.u;
import fd.j0;
import java.io.IOException;
import java.util.ArrayList;
import jc.l;
import kc.t;

/* JADX INFO: loaded from: classes3.dex */
public interface c<T> {

    public static final class a {
        public static <T_I1, T> T a(c<T_I1> cVar, uc.a<ae.a> aVar) throws IOException, je.a {
            try {
                T_I1 t_i1Invoke = cVar.a().f30454k.invoke(aVar.invoke());
                if (t_i1Invoke != null) {
                    return t_i1Invoke;
                }
                throw new l("null cannot be cast to non-null type kotlin.Any");
            } catch (Throwable th) {
                StackTraceElement[] stackTrace = th.getStackTrace();
                j0.e(stackTrace, "e.stackTrace");
                ArrayList arrayList = new ArrayList();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    j0.e(stackTraceElement, "it");
                    String className = stackTraceElement.getClassName();
                    j0.e(className, "it.className");
                    if (!(!u.x(className, "sun.reflect", false, 2))) {
                        break;
                    }
                    arrayList.add(stackTraceElement);
                }
                String strW = t.w(arrayList, "\n\t\t", null, null, 0, null, null, 62);
                StringBuilder sbA = defpackage.a.a("Can't create definition for '");
                sbA.append(cVar.a());
                sbA.append("' due to error :\n\t\t");
                sbA.append(th.getMessage());
                sbA.append("\n\t\t");
                sbA.append(strW);
                throw new je.a(sbA.toString());
            }
        }
    }

    ge.b<T> a();

    <T> b<T> b(uc.a<ae.a> aVar);

    void release();
}
