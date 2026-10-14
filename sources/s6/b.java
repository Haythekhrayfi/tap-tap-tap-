package s6;

import com.google.gson.Gson;
import fd.j0;
import java.util.ArrayList;
import java.util.List;
import r6.d;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    public static final class a extends n6.a<ArrayList<d>> {
    }

    /* JADX INFO: renamed from: s6.b$b, reason: collision with other inner class name */
    public static final class C0412b extends n6.a<ArrayList<v6.a>> {
    }

    public final String a(List<d> list) {
        j0.i(list, "list");
        try {
            String strG = new Gson().g(list);
            j0.h(strG, "gson.toJson(list)");
            return strG;
        } catch (Exception unused) {
            return "";
        }
    }

    public final List<d> b(String str) {
        j0.i(str, "value");
        try {
            return (List) new Gson().c(str, new a().type);
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public final List<v6.a> c(String str) {
        j0.i(str, "value");
        try {
            return (List) new Gson().c(str, new C0412b().type);
        } catch (Exception unused) {
            return new ArrayList();
        }
    }
}
