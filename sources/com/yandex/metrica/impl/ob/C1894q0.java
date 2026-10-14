package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;
import android.location.Location;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1894q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M f17151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E f17152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1583dd f17153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1548c3 f17154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ContentValues f17155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C1736jh f17156g;

    public C1894q0(Context context) {
        this(context, P0.i().d(), P0.i().c(), C1583dd.a(context), C1523b3.a(context));
    }

    public C1894q0(Context context, M m10, E e10, C1583dd c1583dd, C1523b3 c1523b3) {
        this.f17150a = context;
        this.f17151b = m10;
        this.f17152c = e10;
        this.f17153d = c1583dd;
        this.f17154e = c1523b3.a();
    }

    private void a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectPutOpt = jSONObject.putOpt("dId", this.f17156g.g()).putOpt("uId", this.f17156g.x()).putOpt("appVer", this.f17156g.f()).putOpt("appBuild", this.f17156g.b());
        Objects.requireNonNull(this.f17156g);
        JSONObject jSONObjectPutOpt2 = jSONObjectPutOpt.putOpt("analyticsSdkVersionName", "5.0.0");
        Objects.requireNonNull(this.f17156g);
        JSONObject jSONObjectPutOpt3 = jSONObjectPutOpt2.putOpt("kitBuildNumber", "45001354").putOpt("kitBuildType", this.f17156g.k()).putOpt("osVer", this.f17156g.p()).putOpt("osApiLev", Integer.valueOf(this.f17156g.o())).putOpt("lang", this.f17156g.l()).putOpt("root", this.f17156g.i()).putOpt("app_debuggable", this.f17156g.A()).putOpt("app_framework", this.f17156g.c()).putOpt("attribution_id", Integer.valueOf(this.f17156g.D()));
        Objects.requireNonNull(this.f17156g);
        jSONObjectPutOpt3.putOpt("commit_hash", "f6c3700f69aeb2f115563bfb01aee99b5faed63c");
    }

    private void a(JSONObject jSONObject, C1598e3 c1598e3) throws JSONException {
        jSONObject.put("lat", c1598e3.getLatitude());
        jSONObject.put("lon", c1598e3.getLongitude());
        jSONObject.putOpt("timestamp", Long.valueOf(c1598e3.getTime()));
        jSONObject.putOpt("precision", c1598e3.hasAccuracy() ? Float.valueOf(c1598e3.getAccuracy()) : null);
        jSONObject.putOpt("direction", c1598e3.hasBearing() ? Float.valueOf(c1598e3.getBearing()) : null);
        jSONObject.putOpt("speed", c1598e3.hasSpeed() ? Float.valueOf(c1598e3.getSpeed()) : null);
        jSONObject.putOpt("altitude", c1598e3.hasAltitude() ? Double.valueOf(c1598e3.getAltitude()) : null);
        jSONObject.putOpt("provider", O2.a(c1598e3.getProvider(), null));
        jSONObject.putOpt("original_provider", c1598e3.a());
    }

    public C1894q0 a(ContentValues contentValues) {
        this.f17155f = contentValues;
        return this;
    }

    public C1894q0 a(C1736jh c1736jh) {
        this.f17156g = c1736jh;
        return this;
    }

    public void a() {
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject);
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        this.f17155f.put("report_request_parameters", jSONObject.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(C1742jn c1742jn, A.a aVar, fo<Vi.b, Object> foVar) {
        Location locationI;
        C1598e3 c1598e3B;
        C1744k0 c1744k0 = c1742jn.f16502a;
        this.f17155f.put("name", c1744k0.f16511a);
        this.f17155f.put("value", c1744k0.f16512b);
        this.f17155f.put("type", Integer.valueOf(c1744k0.f16515e));
        this.f17155f.put("custom_type", Integer.valueOf(c1744k0.f16516f));
        this.f17155f.put("error_environment", c1744k0.h());
        this.f17155f.put("user_info", c1744k0.o());
        this.f17155f.put("truncated", Integer.valueOf(c1744k0.f16518h));
        this.f17155f.put("connection_type", Integer.valueOf(C1522b2.b(this.f17150a)));
        this.f17155f.put("profile_id", c1744k0.l());
        this.f17155f.put("encrypting_mode", Integer.valueOf(c1742jn.f16503b.a()));
        this.f17155f.put("first_occurrence_status", Integer.valueOf(c1744k0.i().f14527a));
        I0 i0M = c1744k0.m();
        if (i0M != null) {
            this.f17155f.put("source", Integer.valueOf(i0M.f14171a));
        }
        Boolean boolC = c1744k0.c();
        if (boolC != null) {
            this.f17155f.put("attribution_id_changed", boolC);
        }
        this.f17155f.put("open_id", c1744k0.j());
        this.f17155f.put("app_environment", aVar.f13617a);
        this.f17155f.put("app_environment_revision", Long.valueOf(aVar.f13618b));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enabled", this.f17156g.R());
            if (this.f17156g.R()) {
                locationI = this.f17156g.I();
                if (locationI == null) {
                    locationI = this.f17153d.a();
                    c1598e3B = null;
                } else {
                    c1598e3B = C1598e3.a(locationI);
                }
            } else {
                locationI = null;
                c1598e3B = null;
            }
            if (c1598e3B == null && locationI != null) {
                c1598e3B = C1598e3.b(locationI);
            }
            if (c1598e3B != null) {
                a(jSONObject, c1598e3B);
            }
            this.f17155f.put("location_info", jSONObject.toString());
        } catch (Throwable unused) {
        }
        EnumMap enumMap = new EnumMap(Vi.b.class);
        C2118yk c2118ykW = P0.i().w();
        LinkedList linkedList = new LinkedList();
        c2118ykW.a(new C1869p0(this, linkedList));
        Vi.b bVar = Vi.b.WIFI;
        enumMap.put(bVar, this.f17154e.a());
        Vi.b bVar2 = Vi.b.CELL;
        enumMap.put(bVar2, linkedList.isEmpty() ? null : (Collection) linkedList.getFirst());
        jo<Map<Vi.b, Object>> joVar = foVar.get(enumMap);
        this.f17155f.put("has_omitted_data", Integer.valueOf(joVar.f16504a == jo.a.NOT_CHANGED ? 1 : 0));
        jo.a aVar2 = joVar.f16504a;
        D d10 = joVar.f16505b;
        Collection collection = d10 == 0 ? null : (Collection) ((Map) d10).get(bVar2);
        c2118ykW.a(new C1844o0(this));
        jo.a aVar3 = jo.a.NEW;
        if ((aVar2 == aVar3 || aVar2 == jo.a.REFRESH) && collection != null) {
            this.f17155f.put("cell_info", C2120ym.a((Collection<Vj>) collection).toString());
        }
        jo.a aVar4 = joVar.f16504a;
        D d11 = joVar.f16505b;
        Collection collection2 = d11 != 0 ? (Collection) ((Map) d11).get(bVar) : null;
        if ((aVar4 == jo.a.REFRESH || aVar4 == aVar3) && collection2 != null) {
            this.f17155f.put("wifi_network_info", Z2.a(collection2).toString());
        }
        this.f17155f.put("battery_charge_type", Integer.valueOf(this.f17151b.b().a()));
        this.f17155f.put("collection_mode", Wc.a.a(this.f17152c.c()).a());
    }
}
