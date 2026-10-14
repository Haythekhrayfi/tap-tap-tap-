package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class F9 extends H9 {
    public static final C2112ye A;
    public static final C2112ye B;
    public static final C2112ye C;
    public static final C2112ye D;
    public static final C2112ye E;
    public static final C2112ye F;
    public static final C2112ye G;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final C2112ye f13973c = new C2112ye("UUID", null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2112ye f13974d = new C2112ye("UUID_RESULT", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final C2112ye f13975e = new C2112ye("DEVICE_ID", null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2112ye f13976f = new C2112ye("DEVICE_ID_RESULT", null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final C2112ye f13977g = new C2112ye("DEVICE_ID_HASH", null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C2112ye f13978h = new C2112ye("DEVICE_ID_HASH_RESULT", null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final C2112ye f13979i = new C2112ye("AD_URL_GET", null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C2112ye f13980j = new C2112ye("AD_URL_GET_RESULT", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final C2112ye f13981k = new C2112ye("AD_URL_REPORT", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C2112ye f13982l = new C2112ye("AD_URL_REPORT_RESULT", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C2112ye f13983m = new C2112ye("CUSTOM_HOSTS", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C2112ye f13984n = new C2112ye("SERVER_TIME_OFFSET", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final C2112ye f13985o = new C2112ye("CLIDS", null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C2112ye f13986p = new C2112ye("RESPONSE_CLIDS_RESULT", null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C2112ye f13987q = new C2112ye("CUSTOM_SDK_HOSTS", null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C2112ye f13988r = new C2112ye("CLIENT_CLIDS", null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C2112ye f13989s = new C2112ye("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C2112ye f13990t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C2112ye f13991u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C2112ye f13992v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C2112ye f13993w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C2112ye f13994x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C2112ye f13995y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C2112ye f13996z;

    static {
        new C2112ye("DEPRECATED_NATIVE_CRASHES_CHECKED", null);
        f13990t = new C2112ye("API_LEVEL", null);
        f13991u = new C2112ye("ADS_REQUESTED_CONTEXT", null);
        f13992v = new C2112ye("CONTEXT_HISTORY", null);
        f13993w = new C2112ye("ACCESS_CONFIG", null);
        f13994x = new C2112ye("DIAGNOSTICS_CONFIGS_HOLDER", null);
        f13995y = new C2112ye("NEXT_STARTUP_TIME", null);
        f13996z = new C2112ye("LAST_UI_CONTEXT_ID", null);
        A = new C2112ye("GAID", null);
        B = new C2112ye("HOAID", null);
        C = new C2112ye("YANDEX_ADV_ID", null);
        D = new C2112ye("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);
        E = new C2112ye("SCREEN_INFO", null);
        F = new C2112ye("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);
        G = new C2112ye("FEATURES", null);
    }

    public F9(InterfaceC2131z8 interfaceC2131z8) {
        super(interfaceC2131z8);
    }

    private F9 a(String str, C1646g1 c1646g1) {
        String string;
        if (c1646g1 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ID", c1646g1.f16160a).put("STATUS", c1646g1.f16161b.a()).put("ERROR_EXPLANATION", c1646g1.f16162c);
                } catch (Throwable unused) {
                }
                string = jSONObject.toString();
            } catch (Throwable unused2) {
                string = null;
            }
        } else {
            string = null;
        }
        if (string != null) {
            b(str, string);
        }
        return this;
    }

    private C1646g1 h(String str) {
        C1646g1 c1646g1;
        try {
            String strA = a(str, (String) null);
            if (strA != null) {
                JSONObject jSONObject = new JSONObject(strA);
                c1646g1 = new C1646g1(C2120ym.e(jSONObject, "ID"), EnumC1596e1.a(C2120ym.e(jSONObject, "STATUS")), C2120ym.e(jSONObject, "ERROR_EXPLANATION"));
            } else {
                c1646g1 = null;
            }
        } catch (Throwable unused) {
        }
        return c1646g1 == null ? new C1646g1(null, EnumC1596e1.UNKNOWN, "no identifier in preferences") : c1646g1;
    }

    public F9 a(Il il) {
        String string;
        if (il != null) {
            try {
                string = C2120ym.a(il).toString();
            } catch (Throwable unused) {
                string = null;
            }
        } else {
            string = null;
        }
        if (string != null) {
            b(f13993w.a(), string);
        }
        return this;
    }

    public F9 a(Xa xa2) {
        return (F9) b(f13994x.a(), C2120ym.a(xa2).toString());
    }

    public F9 a(C1646g1 c1646g1) {
        return a(f13980j.a(), c1646g1);
    }

    public F9 a(C2091xi c2091xi) {
        String strA = G.a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", c2091xi.b()).put("STATUS", c2091xi.c().a()).putOpt("ERROR_EXPLANATION", c2091xi.a());
        } catch (Throwable unused) {
        }
        return (F9) b(strA, jSONObject.toString());
    }

    public F9 a(List<String> list) {
        return (F9) b(f13992v.a(), list);
    }

    public void a(C2050w2 c2050w2) {
        b(E.a(), C2120ym.a(c2050w2));
    }

    public boolean a(boolean z10) {
        return a(f13991u.a(), z10);
    }

    public long b(long j10) {
        return a(f13990t.a(), j10);
    }

    public F9 b(C1646g1 c1646g1) {
        return a(f13982l.a(), c1646g1);
    }

    public F9 b(List<String> list) {
        return (F9) b(f13983m.a(), C2120ym.c(list));
    }

    public boolean b(boolean z10) {
        return a(D.a(), z10);
    }

    public long c(long j10) {
        return a(f13996z.a(), j10);
    }

    public F9 c(C1646g1 c1646g1) {
        return a(f13987q.a(), c1646g1);
    }

    public F9 c(boolean z10) {
        return (F9) b(f13991u.a(), z10);
    }

    public long d(long j10) {
        return a(f13984n.b(), j10);
    }

    public F9 d(C1646g1 c1646g1) {
        return a(f13978h.a(), c1646g1);
    }

    public F9 d(boolean z10) {
        return (F9) b(D.a(), z10);
    }

    public F9 e(long j10) {
        return (F9) b(f13990t.a(), j10);
    }

    public F9 e(C1646g1 c1646g1) {
        return a(f13976f.a(), c1646g1);
    }

    public C1646g1 e() {
        return h(f13980j.a());
    }

    public F9 f(long j10) {
        return (F9) b(f13996z.a(), j10);
    }

    public F9 f(C1646g1 c1646g1) {
        return a(A.a(), c1646g1);
    }

    public C1646g1 f() {
        return h(f13982l.a());
    }

    @Deprecated
    public String f(String str) {
        return a(f13979i.a(), (String) null);
    }

    public F9 g(long j10) {
        return (F9) b(f13995y.a(), j10);
    }

    public F9 g(C1646g1 c1646g1) {
        return a(B.a(), c1646g1);
    }

    @Deprecated
    public String g(String str) {
        return a(f13981k.a(), (String) null);
    }

    public List<String> g() {
        LinkedList linkedList = new LinkedList();
        List<String> listA = a(f13992v.a(), linkedList);
        return listA == null ? linkedList : listA;
    }

    public F9 h(long j10) {
        return (F9) b(f13984n.a(), j10);
    }

    public F9 h(C1646g1 c1646g1) {
        return a(f13986p.a(), c1646g1);
    }

    public List<String> h() {
        String strA = a(f13983m.a(), (String) null);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return C2120ym.c(strA);
    }

    public F9 i(C1646g1 c1646g1) {
        return a(f13974d.a(), c1646g1);
    }

    public C1646g1 i() {
        return h(f13987q.a());
    }

    @Deprecated
    public String i(String str) {
        return a(f13985o.a(), (String) null);
    }

    public F9 j(C1646g1 c1646g1) {
        return a(C.a(), c1646g1);
    }

    public C1646g1 j() {
        return h(f13978h.a());
    }

    public String j(String str) {
        return a(f13988r.a(), (String) null);
    }

    public C1646g1 k() {
        return h(f13976f.a());
    }

    @Deprecated
    public String k(String str) {
        return a(f13975e.a(), (String) null);
    }

    public Xa l() {
        Xa xaA = null;
        try {
            String strA = a(f13994x.a(), (String) null);
            if (strA != null) {
                xaA = C2120ym.a(new JSONObject(strA));
            }
        } catch (Throwable unused) {
        }
        return xaA == null ? new Xa() : xaA;
    }

    @Deprecated
    public String l(String str) {
        return a(f13977g.a(), (String) null);
    }

    public C2091xi m() {
        String strA = a(G.a(), (String) null);
        try {
            if (!TextUtils.isEmpty(strA)) {
                JSONObject jSONObject = new JSONObject(strA);
                return new C2091xi(C2120ym.b(jSONObject, "libSslEnabled"), EnumC1596e1.a(C2120ym.e(jSONObject, "STATUS")), C2120ym.e(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C2091xi(null, EnumC1596e1.UNKNOWN, null);
    }

    @Deprecated
    public String m(String str) {
        return a(f13973c.a(), (String) null);
    }

    @Deprecated
    public F9 n(String str) {
        return (F9) b(f13979i.a(), str);
    }

    public C1646g1 n() {
        return h(A.a());
    }

    @Deprecated
    public F9 o(String str) {
        return (F9) b(f13981k.a(), str);
    }

    public C1646g1 o() {
        return h(B.a());
    }

    public long p() {
        return a(f13995y.a(), 0L);
    }

    @Deprecated
    public F9 p(String str) {
        return (F9) b(f13985o.a(), str);
    }

    public F9 q(String str) {
        return (F9) b(f13988r.a(), str);
    }

    public C1646g1 q() {
        return h(f13986p.a());
    }

    @Deprecated
    public F9 r(String str) {
        return (F9) b(f13975e.a(), str);
    }

    public C2050w2 r() {
        return C2120ym.f(d(E.a()));
    }

    @Deprecated
    public F9 s(String str) {
        return (F9) b(f13973c.a(), str);
    }

    public Il s() {
        try {
            String strA = a(f13993w.a(), (String) null);
            if (strA != null) {
                return C2120ym.c(new JSONObject(strA));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C1646g1 t() {
        return h(f13974d.a());
    }

    public C1646g1 u() {
        return h(C.a());
    }

    public boolean v() {
        return a(f13989s.a(), false);
    }

    public boolean w() {
        return a(F.a(), false);
    }

    public F9 x() {
        return (F9) b(f13989s.a(), true);
    }

    public void y() {
        b(F.a(), true);
    }
}
