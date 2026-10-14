package com.applovin.impl.mediation.a;

import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.w;
import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b extends e {
    public b(int i10, Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, o oVar) {
        super(i10, map, jSONObject, jSONObject2, null, oVar);
    }

    private b(b bVar, com.applovin.impl.mediation.g gVar) {
        super(bVar.H(), bVar.ak(), bVar.aa(), bVar.Z(), gVar, bVar.f9049b);
    }

    public int I() {
        int iB = b("ad_view_width", -2);
        if (iB != -2) {
            return iB;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getWidth();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public int J() {
        int iB = b("ad_view_height", -2);
        if (iB != -2) {
            return iB;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getHeight();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public long K() {
        return b("viewability_imp_delay_ms", ((Long) this.f9049b.a(com.applovin.impl.sdk.c.b.f10352ca)).longValue());
    }

    public boolean L() {
        return M() >= 0;
    }

    public long M() {
        long jB = b("ad_refresh_ms", -1L);
        return jB >= 0 ? jB : a("ad_refresh_ms", ((Long) this.f9049b.a(com.applovin.impl.sdk.c.a.f10327l)).longValue());
    }

    public boolean N() {
        return b("proe", (Boolean) this.f9049b.a(com.applovin.impl.sdk.c.a.J)).booleanValue();
    }

    public long O() {
        return w.c(b("bg_color", (String) null));
    }

    @Override // com.applovin.impl.mediation.a.a
    public a a(com.applovin.impl.mediation.g gVar) {
        return new b(this, gVar);
    }
}
