package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Qa {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile Qa f14744x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, C2056w8> f14745a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, InterfaceC2131z8> f14746b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, InterfaceC2106y8> f14747c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2001u8 f14748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f14749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C2056w8 f14750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C2056w8 f14751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC2106y8 f14752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC2106y8 f14753i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterfaceC2106y8 f14754j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC2106y8 f14755k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC2131z8 f14756l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private InterfaceC2131z8 f14757m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private InterfaceC2131z8 f14758n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private InterfaceC2131z8 f14759o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private InterfaceC2131z8 f14760p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private InterfaceC2131z8 f14761q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private B8 f14762r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private A8 f14763s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private C8 f14764t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private InterfaceC2131z8 f14765u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private M8 f14766v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final L0 f14767w;

    public Qa(Context context, C2001u8 c2001u8, L0 l10) {
        this.f14749e = context;
        this.f14748d = c2001u8;
        this.f14767w = l10;
    }

    public static Qa a(Context context) {
        if (f14744x == null) {
            synchronized (Qa.class) {
                if (f14744x == null) {
                    f14744x = new Qa(context.getApplicationContext(), O8.a(), new L0());
                }
            }
        }
        return f14744x;
    }

    private String a(String str) {
        if (!U2.a(21)) {
            return str;
        }
        try {
            File noBackupFilesDir = this.f14749e.getNoBackupFilesDir();
            if (noBackupFilesDir == null) {
                return str;
            }
            Objects.requireNonNull(this.f14767w);
            File file = new File(noBackupFilesDir, str);
            if (!file.exists() && a(noBackupFilesDir, str)) {
                a(noBackupFilesDir, str + "-journal");
                a(noBackupFilesDir, str + "-shm");
                a(noBackupFilesDir, str + "-wal");
            }
            return file.getAbsolutePath();
        } catch (Throwable unused) {
            return str;
        }
    }

    private boolean a(File file, String str) {
        File databasePath = this.f14749e.getDatabasePath(str);
        if (databasePath == null || !databasePath.exists()) {
            return false;
        }
        Objects.requireNonNull(this.f14767w);
        return databasePath.renameTo(new File(file, str));
    }

    private InterfaceC2106y8 k() {
        C2056w8 c2056w8;
        if (this.f14754j == null) {
            synchronized (this) {
                if (this.f14751g == null) {
                    this.f14751g = a("metrica_aip.db", this.f14748d.a());
                }
                c2056w8 = this.f14751g;
            }
            this.f14754j = new Oa(new N8(c2056w8), "binary_data");
        }
        return this.f14754j;
    }

    private InterfaceC2131z8 l() {
        M8 m10;
        if (this.f14760p == null) {
            synchronized (this) {
                if (this.f14766v == null) {
                    String strA = a("metrica_client_data.db");
                    Context context = this.f14749e;
                    this.f14766v = new M8(context, strA, new C1543bn(context, "metrica_client_data.db"), this.f14748d.b());
                }
                m10 = this.f14766v;
            }
            this.f14760p = new Ra("preferences", m10);
        }
        return this.f14760p;
    }

    private InterfaceC2106y8 m() {
        if (this.f14752h == null) {
            this.f14752h = new Oa(new N8(r()), "binary_data");
        }
        return this.f14752h;
    }

    public C2056w8 a(String str, E8 e10) {
        return new C2056w8(this.f14749e, a(str), e10);
    }

    public synchronized InterfaceC2106y8 a() {
        if (this.f14755k == null) {
            this.f14755k = new Pa(this.f14749e, D8.AUTO_INAPP, k());
        }
        return this.f14755k;
    }

    public synchronized InterfaceC2106y8 a(C1549c4 c1549c4) {
        InterfaceC2106y8 oa2;
        String string = c1549c4.toString();
        oa2 = this.f14747c.get(string);
        if (oa2 == null) {
            oa2 = new Oa(new N8(c(c1549c4)), "binary_data");
            this.f14747c.put(string, oa2);
        }
        return oa2;
    }

    public synchronized InterfaceC2106y8 b() {
        return k();
    }

    public synchronized InterfaceC2131z8 b(C1549c4 c1549c4) {
        InterfaceC2131z8 ra2;
        String string = c1549c4.toString();
        ra2 = this.f14746b.get(string);
        if (ra2 == null) {
            ra2 = new Ra(c(c1549c4), "preferences");
            this.f14746b.put(string, ra2);
        }
        return ra2;
    }

    public synchronized C2056w8 c(C1549c4 c1549c4) {
        C2056w8 c2056w8A;
        String str = "db_metrica_" + c1549c4;
        c2056w8A = this.f14745a.get(str);
        if (c2056w8A == null) {
            c2056w8A = a(str, this.f14748d.c());
            this.f14745a.put(str, c2056w8A);
        }
        return c2056w8A;
    }

    public synchronized InterfaceC2131z8 c() {
        if (this.f14761q == null) {
            this.f14761q = new Sa(this.f14749e, D8.CLIENT, l());
        }
        return this.f14761q;
    }

    public synchronized InterfaceC2131z8 d() {
        return l();
    }

    public synchronized A8 e() {
        if (this.f14763s == null) {
            this.f14763s = new A8(r());
        }
        return this.f14763s;
    }

    public synchronized B8 f() {
        if (this.f14762r == null) {
            this.f14762r = new B8(r());
        }
        return this.f14762r;
    }

    public synchronized InterfaceC2131z8 g() {
        if (this.f14765u == null) {
            String strA = a("metrica_multiprocess_data.db");
            Context context = this.f14749e;
            this.f14765u = new Ra("preferences", new M8(context, strA, new C1543bn(context, "metrica_multiprocess_data.db"), this.f14748d.d()));
        }
        return this.f14765u;
    }

    public synchronized C8 h() {
        if (this.f14764t == null) {
            this.f14764t = new C8(r(), "permissions");
        }
        return this.f14764t;
    }

    public synchronized InterfaceC2131z8 i() {
        if (this.f14757m == null) {
            Context context = this.f14749e;
            D8 d10 = D8.SERVICE;
            if (this.f14756l == null) {
                this.f14756l = new Ra(r(), "preferences");
            }
            this.f14757m = new Sa(context, d10, this.f14756l);
        }
        return this.f14757m;
    }

    public synchronized InterfaceC2131z8 j() {
        if (this.f14756l == null) {
            this.f14756l = new Ra(r(), "preferences");
        }
        return this.f14756l;
    }

    public synchronized InterfaceC2106y8 n() {
        if (this.f14753i == null) {
            this.f14753i = new Pa(this.f14749e, D8.SERVICE, m());
        }
        return this.f14753i;
    }

    public synchronized InterfaceC2106y8 o() {
        return m();
    }

    public synchronized InterfaceC2131z8 p() {
        if (this.f14759o == null) {
            Context context = this.f14749e;
            D8 d10 = D8.SERVICE;
            if (this.f14758n == null) {
                this.f14758n = new Ra(r(), "startup");
            }
            this.f14759o = new Sa(context, d10, this.f14758n);
        }
        return this.f14759o;
    }

    public synchronized InterfaceC2131z8 q() {
        if (this.f14758n == null) {
            this.f14758n = new Ra(r(), "startup");
        }
        return this.f14758n;
    }

    public synchronized C2056w8 r() {
        if (this.f14750f == null) {
            this.f14750f = a("metrica_data.db", this.f14748d.e());
        }
        return this.f14750f;
    }
}
