package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Fi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zm<String, Li> f14009a = new Zm<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, Si> f14010b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Qi f14011c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Pi f14012d = new a();

    public class a implements Pi {
        public a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Fi f14014a = new Fi();
    }

    public static final Fi a() {
        return b.f14014a;
    }

    public Si a(Context context, C1549c4 c1549c4, C1761kh.b bVar) {
        Si si = this.f14010b.get(c1549c4.b());
        boolean z10 = true;
        if (si == null) {
            synchronized (this.f14010b) {
                si = this.f14010b.get(c1549c4.b());
                if (si == null) {
                    Si si2 = new Si(context, c1549c4.b(), bVar, this.f14012d);
                    this.f14010b.put(c1549c4.b(), si2);
                    z10 = false;
                    si = si2;
                }
            }
        }
        if (z10) {
            si.a(bVar);
        }
        return si;
    }

    public void a(C1549c4 c1549c4, Li li) {
        synchronized (this.f14010b) {
            this.f14009a.a(c1549c4.b(), li);
            Qi qi = this.f14011c;
            if (qi != null) {
                li.a(qi);
            }
        }
    }
}
