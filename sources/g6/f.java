package g6;

import a5.l;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    public interface a<T> {
        String d(T t10);
    }

    public static a5.c<?> a(String str, a<Context> aVar) {
        a5.c.b bVarA = a5.c.a(d.class);
        bVarA.f90e = 1;
        bVarA.a(new l(Context.class, 1, 0));
        bVarA.f91f = new e(str, aVar);
        return bVarA.b();
    }
}
