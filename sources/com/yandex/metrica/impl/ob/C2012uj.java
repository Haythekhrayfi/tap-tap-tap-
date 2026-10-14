package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import android.util.Pair;
import ch.qos.logback.core.joran.action.Action;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.uj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2012uj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1738jj f17551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1713ij f17552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1888pj f17553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1962sj f17554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1937rj f17555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1863oj f17556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1987tj f17557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1763kj f17558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C2092xj f17559i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C1813mj f17560j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1838nj f17561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C1913qj f17562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Ga f17563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C2142zj f17564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C2117yj f17565o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C1589dj f17566p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C1614ej f17567q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C1639fj f17568r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final C1564cj f17569s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C1788lj f17570t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final C1664gj f17571u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C1689hj f17572v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final C2067wj f17573w;

    public C2012uj() {
        this(new C1788lj());
    }

    public C2012uj(C1788lj c1788lj) {
        this(c1788lj, new C1738jj(), new C1713ij(), new C1888pj(), new C1962sj(), new C1937rj(), new C1863oj(), new C1987tj(), new C1763kj(), new C2092xj(), new C1813mj(), new C1838nj(), new C1913qj(), new Ga(), new C2142zj(), new C2117yj(), new C1614ej(), new C1639fj(), new C1589dj(), new C1564cj(), new C1664gj(), new C1689hj(), new C2067wj());
    }

    public C2012uj(C1788lj c1788lj, C1738jj c1738jj, C1713ij c1713ij, C1888pj c1888pj, C1962sj c1962sj, C1937rj c1937rj, C1863oj c1863oj, C1987tj c1987tj, C1763kj c1763kj, C2092xj c2092xj, C1813mj c1813mj, C1838nj c1838nj, C1913qj c1913qj, Ga ga2, C2142zj c2142zj, C2117yj c2117yj, C1614ej c1614ej, C1639fj c1639fj, C1589dj c1589dj, C1564cj c1564cj, C1664gj c1664gj, C1689hj c1689hj, C2067wj c2067wj) {
        this.f17551a = c1738jj;
        this.f17552b = c1713ij;
        this.f17553c = c1888pj;
        this.f17554d = c1962sj;
        this.f17555e = c1937rj;
        this.f17556f = c1863oj;
        this.f17557g = c1987tj;
        this.f17558h = c1763kj;
        this.f17559i = c2092xj;
        this.f17560j = c1813mj;
        this.f17561k = c1838nj;
        this.f17562l = c1913qj;
        this.f17563m = ga2;
        this.f17564n = c2142zj;
        this.f17565o = c2117yj;
        this.f17567q = c1614ej;
        this.f17568r = c1639fj;
        this.f17566p = c1589dj;
        this.f17569s = c1564cj;
        this.f17570t = c1788lj;
        this.f17571u = c1664gj;
        this.f17572v = c1689hj;
        this.f17573w = c2067wj;
    }

    private void a(C2042vj c2042vj, C2120ym.a aVar) throws JSONException {
        long jOptLong;
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3 = aVar.optJSONObject("queries");
        if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject3.optJSONObject("list")) != null) {
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject("sdk_list");
            if (jSONObjectOptJSONObject4 != null) {
                c2042vj.h(jSONObjectOptJSONObject4.optString(ImagesContract.URL, null));
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject2.optJSONObject("host");
            if (jSONObjectOptJSONObject5 != null) {
                c2042vj.a(jSONObjectOptJSONObject5.optString(ImagesContract.URL, null));
            }
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = aVar.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject jSONObjectOptJSONObject6 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (jSONObjectOptJSONObject6 != null) {
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject6.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject6.optJSONObject(next);
                if (jSONObjectOptJSONObject7 != null && jSONObjectOptJSONObject7.has("value")) {
                    map.put(next, jSONObjectOptJSONObject7.getString("value"));
                }
            }
            c2042vj.e(C2120ym.c(map));
        }
        JSONObject jSONObjectOptJSONObject8 = aVar.optJSONObject("locale");
        c2042vj.b((jSONObjectOptJSONObject8 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject8.optJSONObject("country")) == null || !jSONObjectOptJSONObject.optBoolean("reliable", false)) ? "" : jSONObjectOptJSONObject.optString("value", ""));
        JSONObject jSONObjectOptJSONObject9 = aVar.optJSONObject("time");
        if (jSONObjectOptJSONObject9 != null) {
            try {
                c2042vj.a(Long.valueOf(jSONObjectOptJSONObject9.getLong("max_valid_difference_seconds")));
            } catch (Throwable unused2) {
            }
        }
        C1760kg.r rVar = new C1760kg.r();
        JSONObject jSONObjectOptJSONObject10 = aVar.optJSONObject("stat_sending");
        if (jSONObjectOptJSONObject10 != null) {
            rVar.f16720b = C2120ym.a(C2120ym.d(jSONObjectOptJSONObject10, "disabled_reporting_interval_seconds"), TimeUnit.SECONDS, rVar.f16720b);
        }
        c2042vj.a(this.f17563m.a(rVar));
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectOptJSONObject11 = aVar.optJSONObject("mediascope_api_keys");
        if (jSONObjectOptJSONObject11 != null && (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject11.optJSONArray("list")) != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                try {
                    arrayList.add(jSONArrayOptJSONArray2.getString(i10));
                } catch (Throwable unused3) {
                }
            }
        }
        c2042vj.d(arrayList);
        this.f17552b.a(c2042vj, aVar);
        this.f17551a.a(c2042vj, aVar);
        Objects.requireNonNull(this.f17553c);
        JSONObject jSONObjectOptJSONObject12 = aVar.optJSONObject("permissions");
        if (jSONObjectOptJSONObject12 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject12.optJSONArray("list")) != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                JSONObject jSONObjectOptJSONObject13 = jSONArrayOptJSONArray.optJSONObject(i11);
                if (jSONObjectOptJSONObject13 != null) {
                    String strOptString = jSONObjectOptJSONObject13.optString("name");
                    boolean zOptBoolean = jSONObjectOptJSONObject13.optBoolean("enabled");
                    if (TextUtils.isEmpty(strOptString)) {
                        c2042vj.a("", false);
                    } else {
                        c2042vj.a(strOptString, zOptBoolean);
                    }
                }
            }
        }
        this.f17554d.a(c2042vj, aVar);
        Objects.requireNonNull(this.f17555e);
        C1760kg c1760kg = new C1760kg();
        JSONObject jSONObjectOptJSONObject14 = aVar.optJSONObject("retry_policy");
        int iOptInt = c1760kg.K;
        int iOptInt2 = c1760kg.L;
        if (jSONObjectOptJSONObject14 != null) {
            iOptInt = jSONObjectOptJSONObject14.optInt("max_interval_seconds", iOptInt);
            iOptInt2 = jSONObjectOptJSONObject14.optInt("exponential_multiplier", c1760kg.L);
        }
        c2042vj.a(new Ci(iOptInt, iOptInt2));
        Objects.requireNonNull(this.f17556f);
        if (c2042vj.e().f17338c) {
            JSONObject jSONObjectOptJSONObject15 = aVar.optJSONObject("permissions_collecting");
            C1760kg.m mVar = new C1760kg.m();
            long jOptLong2 = mVar.f16693b;
            if (jSONObjectOptJSONObject15 != null) {
                jOptLong2 = jSONObjectOptJSONObject15.optLong("check_interval_seconds", jOptLong2);
                jOptLong = jSONObjectOptJSONObject15.optLong("force_send_interval_seconds", mVar.f16694c);
            } else {
                jOptLong = mVar.f16694c;
            }
            c2042vj.a(new Ai(jOptLong2, jOptLong));
        }
        this.f17557g.a(c2042vj, aVar);
        this.f17558h.a(c2042vj, aVar);
        this.f17560j.a(c2042vj, aVar);
        Objects.requireNonNull(this.f17561k);
        if (c2042vj.e().f17344i) {
            C2003ua c2003ua = new C2003ua();
            C1760kg.y yVar = new C1760kg.y();
            JSONObject jSONObjectOptJSONObject16 = aVar.optJSONObject("wakeup");
            if (jSONObjectOptJSONObject16 != null) {
                yVar.f16754b = C2120ym.a(C2120ym.d(jSONObjectOptJSONObject16, "collection_duration_seconds"), TimeUnit.SECONDS, yVar.f16754b);
                yVar.f16755c = C2120ym.a(jSONObjectOptJSONObject16, "aggressive_relaunch", yVar.f16755c);
                JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject16.optJSONArray("collection_interval_ranges_seconds");
                C1760kg.y.a[] aVarArr = yVar.f16756d;
                if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                    try {
                        aVarArr = new C1760kg.y.a[jSONArrayOptJSONArray3.length()];
                        for (int i12 = 0; i12 < jSONArrayOptJSONArray3.length(); i12++) {
                            aVarArr[i12] = new C1760kg.y.a();
                            JSONObject jSONObject2 = jSONArrayOptJSONArray3.getJSONObject(i12);
                            C1760kg.y.a aVar2 = aVarArr[i12];
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            aVar2.f16758b = timeUnit.toMillis(jSONObject2.getLong("min"));
                            aVarArr[i12].f16759c = timeUnit.toMillis(jSONObject2.getLong(AppLovinMediationProvider.MAX));
                        }
                    } catch (Throwable unused4) {
                    }
                }
                yVar.f16756d = aVarArr;
            }
            c2042vj.a(c2003ua.a(yVar));
        }
        this.f17562l.a(c2042vj, aVar);
        this.f17564n.a(c2042vj, aVar);
        c2042vj.b(this.f17565o.a(aVar, "ui_event_sending", C2048w0.b()));
        c2042vj.c(this.f17565o.a(aVar, "ui_raw_event_sending", C2048w0.b()));
        c2042vj.a(this.f17565o.a(aVar, "ui_collecting_for_bridge", C2048w0.a()));
        this.f17566p.a(c2042vj, aVar);
        c2042vj.a(this.f17559i.a(aVar, "throttling"));
        c2042vj.a(this.f17567q.a(aVar));
        this.f17568r.a(c2042vj, aVar);
        Objects.requireNonNull(this.f17569s);
        JSONObject jSONObjectOptJSONObject17 = aVar.optJSONObject("attribution");
        if (jSONObjectOptJSONObject17 != null) {
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject17.optJSONArray("deeplink_conditions");
            if (jSONArrayOptJSONArray4 != null) {
                for (int i13 = 0; i13 < jSONArrayOptJSONArray4.length(); i13++) {
                    JSONObject jSONObjectOptJSONObject18 = jSONArrayOptJSONArray4.optJSONObject(i13);
                    String strOptString2 = jSONObjectOptJSONObject18.optString(Action.KEY_ATTRIBUTE, null);
                    if (!TextUtils.isEmpty(strOptString2)) {
                        String strOptString3 = jSONObjectOptJSONObject18.optString("value", null);
                        arrayList2.add(new Pair(strOptString2, strOptString3 == null ? null : new C1862oi.a(strOptString3)));
                    }
                }
            }
            c2042vj.a(new C1862oi(arrayList2));
        }
        this.f17571u.a(c2042vj, aVar);
        if (c2042vj.e().f17359x) {
            this.f17572v.a(c2042vj, aVar);
        }
        this.f17573w.a(c2042vj, aVar);
    }

    public C2042vj a(byte[] bArr) {
        String strOptString;
        C2042vj c2042vj = new C2042vj();
        try {
            Objects.requireNonNull(this.f17570t);
            C2120ym.a aVar = new C2120ym.a(new String(bArr, "UTF-8"));
            JSONObject jSONObjectOptJSONObject = aVar.optJSONObject("device_id");
            String strOptString2 = "";
            if (jSONObjectOptJSONObject != null) {
                strOptString2 = jSONObjectOptJSONObject.optString("hash");
                strOptString = jSONObjectOptJSONObject.optString("value");
            } else {
                strOptString = "";
            }
            c2042vj.d(strOptString);
            c2042vj.c(strOptString2);
            a(c2042vj, aVar);
            c2042vj.a(C2042vj.a.OK);
            return c2042vj;
        } catch (Throwable unused) {
            C2042vj c2042vj2 = new C2042vj();
            c2042vj2.a(C2042vj.a.BAD);
            return c2042vj2;
        }
    }
}
