package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.lg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1785lg {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<Bi.a, C1522b2.d> f16825i = Collections.unmodifiableMap(new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q9<e> f16827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f16828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Kh f16829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final M2 f16830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC2070wm f16831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f16832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f16833h = false;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.lg$a */
    public class a extends HashMap<Bi.a, C1522b2.d> {
        public a() {
            put(Bi.a.CELL, C1522b2.d.CELL);
            put(Bi.a.WIFI, C1522b2.d.WIFI);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.lg$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1785lg.a(C1785lg.this);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.lg$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f16835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qi f16836b;

        public c(List list, Qi qi) {
            this.f16835a = list;
            this.f16836b = qi;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1785lg.a(C1785lg.this, this.f16835a, this.f16836b.C());
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.lg$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e.a f16838a;

        public d(e.a aVar) {
            this.f16838a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.b.a aVar;
            if (C1785lg.this.f16830e.e()) {
                return;
            }
            C1785lg.this.f16829d.b(this.f16838a);
            e.b bVar = new e.b(this.f16838a);
            InterfaceC2070wm interfaceC2070wm = C1785lg.this.f16831f;
            Context context = C1785lg.this.f16826a;
            Objects.requireNonNull((C1940rm) interfaceC2070wm);
            C1522b2.d dVarA = C1522b2.a(context);
            bVar.a(dVarA);
            if (dVarA != C1522b2.d.OFFLINE) {
                if (this.f16838a.f16847f.contains(dVarA)) {
                    bVar.a(e.b.a.ERROR);
                    try {
                        HttpsURLConnection httpsURLConnectionA = P0.i().x().a(this.f16838a.f16843b);
                        for (Map.Entry<String, ? extends Collection<String>> entry : this.f16838a.f16845d.a()) {
                            httpsURLConnectionA.setRequestProperty(entry.getKey(), TextUtils.join(",", entry.getValue()));
                        }
                        httpsURLConnectionA.setInstanceFollowRedirects(true);
                        httpsURLConnectionA.setRequestMethod(this.f16838a.f16844c);
                        int i10 = Vd.a.f15234a;
                        httpsURLConnectionA.setConnectTimeout(i10);
                        httpsURLConnectionA.setReadTimeout(i10);
                        httpsURLConnectionA.connect();
                        int responseCode = httpsURLConnectionA.getResponseCode();
                        bVar.a(e.b.a.COMPLETE);
                        bVar.a(Integer.valueOf(responseCode));
                        try {
                            bVar.f16852e = V0.a(httpsURLConnectionA.getInputStream(), 102400);
                        } catch (IOException unused) {
                        }
                        try {
                            bVar.f16853f = V0.a(httpsURLConnectionA.getErrorStream(), 102400);
                        } catch (IOException unused2) {
                        }
                        bVar.a((Map<String, List<String>>) httpsURLConnectionA.getHeaderFields());
                    } catch (Throwable th) {
                        bVar.a(th);
                    }
                } else {
                    aVar = e.b.a.INCOMPATIBLE_NETWORK_TYPE;
                }
                C1785lg.a(C1785lg.this, bVar);
            }
            aVar = e.b.a.OFFLINE;
            bVar.a(aVar);
            C1785lg.a(C1785lg.this, bVar);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.lg$e */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<a> f16840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LinkedHashMap<String, Object> f16841b = new LinkedHashMap<>();

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.lg$e$a */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f16842a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f16843b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f16844c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Zm<String, String> f16845d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final long f16846e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final List<C1522b2.d> f16847f;

            public a(String str, String str2, String str3, Zm<String, String> zm, long j10, List<C1522b2.d> list) {
                this.f16842a = str;
                this.f16843b = str2;
                this.f16844c = str3;
                this.f16846e = j10;
                this.f16847f = list;
                this.f16845d = zm;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || a.class != obj.getClass()) {
                    return false;
                }
                return this.f16842a.equals(((a) obj).f16842a);
            }

            public int hashCode() {
                return this.f16842a.hashCode();
            }
        }

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.lg$e$b */
        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final a f16848a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private a f16849b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private C1522b2.d f16850c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Integer f16851d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public byte[] f16852e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public byte[] f16853f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Map<String, List<String>> f16854g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private Throwable f16855h;

            /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.lg$e$b$a */
            public enum a {
                OFFLINE,
                INCOMPATIBLE_NETWORK_TYPE,
                COMPLETE,
                ERROR
            }

            public b(a aVar) {
                this.f16848a = aVar;
            }

            public C1522b2.d a() {
                return this.f16850c;
            }

            public void a(C1522b2.d dVar) {
                this.f16850c = dVar;
            }

            public void a(a aVar) {
                this.f16849b = aVar;
            }

            public void a(Integer num) {
                this.f16851d = num;
            }

            public void a(Throwable th) {
                this.f16855h = th;
            }

            public void a(Map<String, List<String>> map) {
                this.f16854g = map;
            }

            public byte[] b() {
                return this.f16853f;
            }

            public Throwable c() {
                return this.f16855h;
            }

            public a d() {
                return this.f16848a;
            }

            public byte[] e() {
                return this.f16852e;
            }

            public Integer f() {
                return this.f16851d;
            }

            public Map<String, List<String>> g() {
                return this.f16854g;
            }

            public a h() {
                return this.f16849b;
            }
        }

        public e(List<a> list, List<String> list2) {
            this.f16840a = list;
            if (U2.b(list2)) {
                return;
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                this.f16841b.put(it.next(), new Object());
            }
        }

        public Set<String> a() {
            HashSet hashSet = new HashSet();
            Iterator<String> it = this.f16841b.keySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                hashSet.add(it.next());
                i10++;
                if (i10 > 1000) {
                    break;
                }
            }
            return hashSet;
        }

        public boolean a(a aVar) {
            if (this.f16841b.get(aVar.f16842a) != null || this.f16840a.contains(aVar)) {
                return false;
            }
            this.f16840a.add(aVar);
            return true;
        }

        public List<a> b() {
            return this.f16840a;
        }

        public void b(a aVar) {
            this.f16841b.put(aVar.f16842a, new Object());
            this.f16840a.remove(aVar);
        }
    }

    public C1785lg(Context context, Q9<e> q10, M2 m10, Kh kh, InterfaceExecutorC1966sn interfaceExecutorC1966sn, InterfaceC2070wm interfaceC2070wm) {
        this.f16826a = context;
        this.f16827b = q10;
        this.f16830e = m10;
        this.f16829d = kh;
        this.f16832g = (e) q10.b();
        this.f16828c = interfaceExecutorC1966sn;
        this.f16831f = interfaceC2070wm;
    }

    public static void a(C1785lg c1785lg) {
        if (c1785lg.f16833h) {
            return;
        }
        e eVar = (e) c1785lg.f16827b.b();
        c1785lg.f16832g = eVar;
        Iterator<e.a> it = eVar.b().iterator();
        while (it.hasNext()) {
            c1785lg.b(it.next());
        }
        c1785lg.f16833h = true;
    }

    public static void a(C1785lg c1785lg, e.b bVar) {
        synchronized (c1785lg) {
            c1785lg.f16832g.b(bVar.f16848a);
            c1785lg.f16827b.a(c1785lg.f16832g);
            c1785lg.f16829d.a(bVar);
        }
    }

    public static void a(C1785lg c1785lg, List list, long j10) {
        Long l10;
        Objects.requireNonNull(c1785lg);
        if (U2.b(list)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bi bi = (Bi) it.next();
            if (bi.f13727a != null && bi.f13728b != null && bi.f13729c != null && (l10 = bi.f13731e) != null && l10.longValue() >= 0 && !U2.b(bi.f13732f)) {
                String str = bi.f13727a;
                String str2 = bi.f13728b;
                String str3 = bi.f13729c;
                List<Pair<String, String>> list2 = bi.f13730d;
                Zm zm = new Zm(false);
                for (Pair<String, String> pair : list2) {
                    zm.a(pair.first, pair.second);
                }
                long millis = TimeUnit.SECONDS.toMillis(bi.f13731e.longValue() + j10);
                List<Bi.a> list3 = bi.f13732f;
                ArrayList arrayList = new ArrayList(list3.size());
                Iterator<Bi.a> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(f16825i.get(it2.next()));
                }
                c1785lg.a(new e.a(str, str2, str3, zm, millis, arrayList));
            }
        }
    }

    private boolean a(e.a aVar) {
        boolean zA = this.f16832g.a(aVar);
        if (zA) {
            b(aVar);
            this.f16829d.a(aVar);
        }
        this.f16827b.a(this.f16832g);
        return zA;
    }

    private void b(e.a aVar) {
        long jMax = Math.max(aVar.f16846e - System.currentTimeMillis(), 0L);
        ((C1941rn) this.f16828c).a(new d(aVar), Math.max(C2047w.f17740c, jMax));
    }

    public synchronized void a() {
        ((C1941rn) this.f16828c).execute(new b());
    }

    public synchronized void a(Qi qi) {
        List<Bi> listI = qi.I();
        ((C1941rn) this.f16828c).execute(new c(listI, qi));
    }
}
