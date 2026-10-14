package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class J9 extends H9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C2112ye f14292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C2112ye f14293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C2112ye f14294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C2112ye f14295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C2112ye f14296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    private C2112ye f14297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C2112ye f14298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    private C2112ye f14299j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C2112ye f14300k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C2112ye f14301l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C2112ye f14302m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C2112ye f14303n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C2112ye f14304o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C2112ye f14305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C2112ye f14306q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C2112ye f14307r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private C2112ye f14308s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private C2112ye f14309t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private C2112ye f14310u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private C2112ye f14311v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C2112ye f14288w = new C2112ye("PREF_KEY_UID_", null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final C2112ye f14289x = new C2112ye("PREF_KEY_HOST_URL_", null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final C2112ye f14290y = new C2112ye("PREF_KEY_HOST_URLS_FROM_STARTUP", null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final C2112ye f14291z = new C2112ye("PREF_KEY_HOST_URLS_FROM_CLIENT", null);

    @Deprecated
    private static final C2112ye A = new C2112ye("PREF_KEY_REPORT_URL_", null);
    private static final C2112ye B = new C2112ye("PREF_KEY_REPORT_URLS_", null);

    @Deprecated
    private static final C2112ye C = new C2112ye("PREF_L_URL", null);
    private static final C2112ye D = new C2112ye("PREF_L_URLS", null);
    private static final C2112ye E = new C2112ye("PREF_KEY_GET_AD_URL", null);
    private static final C2112ye F = new C2112ye("PREF_KEY_REPORT_AD_URL", null);
    private static final C2112ye G = new C2112ye("PREF_KEY_STARTUP_OBTAIN_TIME_", null);
    private static final C2112ye H = new C2112ye("PREF_KEY_STARTUP_ENCODED_CLIDS_", null);
    public static final C2112ye I = new C2112ye("PREF_KEY_DEVICE_ID_", null);
    private static final C2112ye J = new C2112ye("STARTUP_CLIDS_MATCH_WITH_APP_CLIDS_", null);

    @Deprecated
    private static final C2112ye K = new C2112ye("PREF_KEY_PINNING_UPDATE_URL", null);
    private static final C2112ye L = new C2112ye("PREF_KEY_EASY_COLLECTING_ENABLED_", null);
    private static final C2112ye M = new C2112ye("PREF_KEY_COLLECTING_PACKAGE_INFO_ENABLED_", null);
    private static final C2112ye N = new C2112ye("PREF_KEY_PERMISSIONS_COLLECTING_ENABLED_", null);
    private static final C2112ye O = new C2112ye("PREF_KEY_FEATURES_COLLECTING_ENABLED_", null);
    private static final C2112ye P = new C2112ye("SOCKET_CONFIG_", null);
    private static final C2112ye Q = new C2112ye("LAST_STARTUP_REQUEST_CLIDS", null);

    public J9(InterfaceC2131z8 interfaceC2131z8, String str) {
        super(interfaceC2131z8, str);
        this.f14292c = new C2112ye(I.b());
        this.f14293d = c(f14288w.b());
        this.f14294e = c(f14289x.b());
        this.f14295f = c(f14290y.b());
        this.f14296g = c(f14291z.b());
        this.f14297h = c(A.b());
        this.f14298i = c(B.b());
        this.f14299j = c(C.b());
        this.f14300k = c(D.b());
        this.f14301l = c(E.b());
        this.f14302m = c(F.b());
        this.f14303n = c(G.b());
        this.f14304o = c(H.b());
        this.f14305p = c(J.b());
        this.f14306q = c(L.b());
        this.f14307r = c(M.b());
        this.f14308s = c(N.b());
        this.f14309t = c(O.b());
        this.f14311v = c(Q.b());
        this.f14310u = c(P.b());
    }

    public J9 a(List<String> list) {
        return (J9) b(this.f14300k.a(), C2120ym.c(list));
    }

    public J9 a(boolean z10) {
        return (J9) b(this.f14305p.a(), z10);
    }

    public J9 b(long j10) {
        return (J9) b(this.f14303n.a(), j10);
    }

    public J9 b(List<String> list) {
        return (J9) b(this.f14298i.a(), C2120ym.c(list));
    }

    public void e() {
        e(K.a());
        e(this.f14292c.a());
        e(this.f14301l.a());
        e(this.f14307r.a());
        e(this.f14306q.a());
        e(this.f14304o.a());
        e(this.f14309t.a());
        e(this.f14294e.a());
        e(this.f14296g.a());
        e(this.f14295f.a());
        e(this.f14311v.a());
        e(this.f14299j.a());
        e(this.f14300k.a());
        e(this.f14303n.a());
        e(this.f14308s.a());
        e(this.f14302m.a());
        e(this.f14297h.a());
        e(this.f14298i.a());
        e(this.f14310u.a());
        e(this.f14305p.a());
        e(this.f14293d.a());
        e(c(new C2112ye("PREF_KEY_DISTRIBUTION_REFERRER_", null).b()).a());
        c();
    }

    @Deprecated
    public Ri f() {
        Ri.b bVar;
        Ri.b bVar2;
        Ei ei;
        Ri.b bVarJ = new Ri.b(new C1961si(new C1961si.a().d(a(this.f14306q.a(), C1961si.b.f17387b)).m(a(this.f14307r.a(), C1961si.b.f17388c)).n(a(this.f14308s.a(), C1961si.b.f17389d)).f(a(this.f14309t.a(), C1961si.b.f17390e)))).l(d(this.f14293d.a())).c(C2120ym.c(d(this.f14295f.a()))).b(C2120ym.c(d(this.f14296g.a()))).f(d(this.f14304o.a())).i(C2120ym.c(d(this.f14298i.a()))).e(C2120ym.c(d(this.f14300k.a()))).g(d(this.f14301l.a())).j(d(this.f14302m.a()));
        String strD = d(this.f14310u.a());
        try {
            if (TextUtils.isEmpty(strD)) {
                bVar2 = bVarJ;
                ei = null;
            } else {
                JSONObject jSONObject = new JSONObject(strD);
                C1760kg.p pVar = new C1760kg.p();
                long j10 = jSONObject.getLong("seconds_to_live");
                String string = jSONObject.getString("token");
                JSONArray jSONArray = jSONObject.getJSONArray("ports");
                ArrayList arrayList = new ArrayList(jSONArray.length());
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(Integer.valueOf(jSONArray.getInt(i10)));
                }
                bVar = bVarJ;
                try {
                    ei = new Ei(j10, string, arrayList, new ArrayList(), jSONObject.getLong("first_delay_seconds"), jSONObject.getInt("launch_delay_seconds"), jSONObject.optLong("open_event_interval_seconds", pVar.f16715h), pVar.f16716i, pVar.f16717j, pVar.f16718k);
                    bVar2 = bVar;
                } catch (Throwable unused) {
                    bVar2 = bVar;
                    ei = null;
                }
            }
        } catch (Throwable unused2) {
            bVar = bVarJ;
        }
        return bVar2.a(ei).i(d(this.f14311v.a())).c(a(this.f14305p.a(), true)).c(a(this.f14303n.a(), -1L)).a();
    }

    @Deprecated
    public String f(String str) {
        return a(this.f14299j.a(), (String) null);
    }

    @Deprecated
    public String g(String str) {
        return a(this.f14297h.a(), (String) null);
    }

    @Deprecated
    public J9 h(String str) {
        return (J9) b(this.f14292c.a(), str);
    }

    public J9 i(String str) {
        return (J9) b(this.f14304o.a(), str);
    }

    public J9 j(String str) {
        return (J9) b(this.f14301l.a(), str);
    }

    public J9 k(String str) {
        return (J9) b(this.f14294e.a(), str);
    }

    public J9 l(String str) {
        return (J9) b(this.f14302m.a(), str);
    }

    @Deprecated
    public J9 m(String str) {
        return (J9) b(this.f14297h.a(), str);
    }

    public J9 n(String str) {
        return (J9) b(this.f14293d.a(), str);
    }
}
