package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1910qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, C1885pg> f17175a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1984tg f17176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f17177c;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.qg$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f17178a;

        public a(Context context) {
            this.f17178a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1984tg c1984tg = C1910qg.this.f17176b;
            Context context = this.f17178a;
            Objects.requireNonNull(c1984tg);
            C1772l3.a(context);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.qg$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C1910qg f17180a = new C1910qg(Y.g().c(), new C1984tg());
    }

    public C1910qg(InterfaceExecutorC1966sn interfaceExecutorC1966sn, C1984tg c1984tg) {
        this.f17177c = interfaceExecutorC1966sn;
        this.f17176b = c1984tg;
    }

    public static C1910qg a() {
        return b.f17180a;
    }

    private C1885pg b(Context context, String str) {
        Objects.requireNonNull(this.f17176b);
        if (C1772l3.k() == null) {
            ((C1941rn) this.f17177c).execute(new a(context));
        }
        C1885pg c1885pg = new C1885pg(this.f17177c, context, str);
        this.f17175a.put(str, c1885pg);
        return c1885pg;
    }

    public C1885pg a(Context context, com.yandex.metrica.f fVar) {
        C1885pg c1885pg = this.f17175a.get(fVar.apiKey);
        if (c1885pg == null) {
            synchronized (this.f17175a) {
                c1885pg = this.f17175a.get(fVar.apiKey);
                if (c1885pg == null) {
                    C1885pg c1885pgB = b(context, fVar.apiKey);
                    c1885pgB.a(fVar);
                    c1885pg = c1885pgB;
                }
            }
        }
        return c1885pg;
    }

    public C1885pg a(Context context, String str) {
        C1885pg c1885pg = this.f17175a.get(str);
        if (c1885pg == null) {
            synchronized (this.f17175a) {
                c1885pg = this.f17175a.get(str);
                if (c1885pg == null) {
                    C1885pg c1885pgB = b(context, str);
                    c1885pgB.d(str);
                    c1885pg = c1885pgB;
                }
            }
        }
        return c1885pg;
    }
}
