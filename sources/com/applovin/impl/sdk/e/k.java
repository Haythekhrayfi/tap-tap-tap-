package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.sdk.ad.d f10582a;

    public k(com.applovin.impl.sdk.ad.d dVar, String str, com.applovin.impl.sdk.o oVar) {
        super(str, oVar);
        this.f10582a = dVar;
    }

    private void a(com.applovin.impl.sdk.d.g gVar) {
        com.applovin.impl.sdk.d.f fVar = com.applovin.impl.sdk.d.f.f10466d;
        long jB = gVar.b(fVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jB > TimeUnit.MINUTES.toMillis(((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.dV)).intValue())) {
            gVar.b(fVar, jCurrentTimeMillis);
            gVar.c(com.applovin.impl.sdk.d.f.f10467e);
            gVar.c(com.applovin.impl.sdk.d.f.f10468f);
        }
    }

    private Map<String, String> i() {
        HashMap map = new HashMap(3);
        map.put("AppLovin-Zone-Id", this.f10582a.a());
        if (this.f10582a.c() != null) {
            map.put("AppLovin-Ad-Size", this.f10582a.c().getLabel());
        }
        if (this.f10582a.d() != null) {
            map.put("AppLovin-Ad-Type", this.f10582a.d().getLabel());
        }
        return map;
    }

    public abstract d a(JSONObject jSONObject);

    public Map<String, String> a() {
        HashMap map = new HashMap(4);
        map.put(AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f10582a.a());
        if (this.f10582a.c() != null) {
            map.put("size", this.f10582a.c().getLabel());
        }
        if (this.f10582a.d() != null) {
            map.put("require", this.f10582a.d().getLabel());
        }
        return map;
    }

    public void a(int i10, String str) {
        if (com.applovin.impl.sdk.y.a()) {
            com.applovin.impl.sdk.y yVar = this.f10536h;
            String str2 = this.f10535g;
            StringBuilder sbA = defpackage.a.a("Unable to fetch ");
            sbA.append(this.f10582a);
            sbA.append(" ad: server returned ");
            sbA.append(i10);
            yVar.e(str2, sbA.toString());
        }
        if (i10 == -800) {
            this.f10534f.J().a(com.applovin.impl.sdk.d.f.f10472j);
        }
    }

    public abstract String b();

    public void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.utils.i.e(jSONObject, this.f10534f);
        com.applovin.impl.sdk.utils.i.d(jSONObject, this.f10534f);
        com.applovin.impl.sdk.utils.i.f(jSONObject, this.f10534f);
        com.applovin.impl.sdk.ad.d.a(jSONObject);
        this.f10534f.G().a(a(jSONObject));
    }

    public abstract String c();

    public com.applovin.impl.sdk.ad.b h() {
        return this.f10582a.e() ? com.applovin.impl.sdk.ad.b.APPLOVIN_PRIMARY_ZONE : com.applovin.impl.sdk.ad.b.APPLOVIN_CUSTOM_ZONE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.applovin.impl.sdk.network.c$a] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.lang.Runnable
    public void run() {
        ?? map;
        JSONObject jSONObject;
        com.applovin.impl.sdk.utils.r.a aVarA;
        if (com.applovin.impl.sdk.y.a()) {
            com.applovin.impl.sdk.y yVar = this.f10536h;
            String str = this.f10535g;
            StringBuilder sbA = defpackage.a.a("Fetching next ad of zone: ");
            sbA.append(this.f10582a);
            yVar.b(str, sbA.toString());
        }
        if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.eu)).booleanValue() && com.applovin.impl.sdk.utils.w.d() && com.applovin.impl.sdk.y.a()) {
            this.f10536h.b(this.f10535g, "User is connected to a VPN");
        }
        com.applovin.impl.sdk.d.g gVarJ = this.f10534f.J();
        gVarJ.a(com.applovin.impl.sdk.d.f.f10463a);
        com.applovin.impl.sdk.d.f fVar = com.applovin.impl.sdk.d.f.f10466d;
        if (gVarJ.b(fVar) == 0) {
            gVarJ.b(fVar, System.currentTimeMillis());
        }
        JSONObject jSONObject2 = null;
        try {
            JSONObject andResetCustomPostBody = this.f10534f.v().getAndResetCustomPostBody();
            String str2 = "POST";
            if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.dL)).booleanValue()) {
                aVarA = com.applovin.impl.sdk.utils.r.a.a(((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.fG)).intValue());
                jSONObject = new JSONObject(this.f10534f.M() != null ? this.f10534f.M().a(a(), false, true) : this.f10534f.K().a(a(), false, true));
                map = new HashMap();
                if (!((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.fP)).booleanValue() && !((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.fL)).booleanValue()) {
                    map.put("rid", UUID.randomUUID().toString());
                }
                if (!((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.fx)).booleanValue()) {
                    map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f10534f.ax());
                }
                if (andResetCustomPostBody != null) {
                    JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                }
            } else {
                com.applovin.impl.sdk.utils.r.a aVarA2 = com.applovin.impl.sdk.utils.r.a.a(((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.fH)).intValue());
                Map<String, String> mapA = com.applovin.impl.sdk.utils.w.a(this.f10534f.M() != null ? this.f10534f.M().a(a(), false, false) : this.f10534f.K().a(a(), false, false));
                if (andResetCustomPostBody != null) {
                    jSONObject2 = andResetCustomPostBody;
                } else {
                    str2 = "GET";
                }
                map = mapA;
                jSONObject = jSONObject2;
                aVarA = aVarA2;
            }
            if (com.applovin.impl.sdk.utils.w.g(f())) {
                map.putAll(this.f10534f.v().getAndResetCustomQueryParams());
            }
            a(gVarJ);
            com.applovin.impl.sdk.network.c.a aVarE = com.applovin.impl.sdk.network.c.a(this.f10534f).a(b()).c(c()).a(map).b(str2).b(i()).a(new JSONObject()).a(((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.dz)).intValue()).a(((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.dA)).booleanValue()).b(((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.dB)).booleanValue()).b(((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.dy)).intValue()).a(aVarA).e(true);
            if (jSONObject != null) {
                aVarE.a(jSONObject);
                aVarE.f(((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.fZ)).booleanValue());
            }
            x<JSONObject> xVar = new x<JSONObject>(aVarE.a(), this.f10534f) { // from class: com.applovin.impl.sdk.e.k.1
                @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
                public void a(int i10, String str3, JSONObject jSONObject3) {
                    k.this.a(i10, str3);
                }

                @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
                public void a(JSONObject jSONObject3, int i10) {
                    if (i10 != 200) {
                        k.this.a(i10, MaxAdapterError.NO_FILL.getErrorMessage());
                        return;
                    }
                    JsonUtils.putLong(jSONObject3, "ad_fetch_latency_millis", this.f10669e.a());
                    JsonUtils.putLong(jSONObject3, "ad_fetch_response_size", this.f10669e.b());
                    k.this.b(jSONObject3);
                }
            };
            xVar.a(com.applovin.impl.sdk.c.b.bh);
            xVar.b(com.applovin.impl.sdk.c.b.bi);
            this.f10534f.G().a((d) xVar);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.y.a()) {
                com.applovin.impl.sdk.y yVar2 = this.f10536h;
                String str3 = this.f10535g;
                StringBuilder sbA2 = defpackage.a.a("Unable to fetch ad ");
                sbA2.append(this.f10582a);
                yVar2.b(str3, sbA2.toString(), th);
            }
            a(0, th.getMessage());
        }
    }
}
