package com.applovin.impl.mediation.a;

import com.applovin.impl.sdk.o;
import com.applovin.mediation.MaxAdFormat;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends a {
    public e(int i10, Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.g gVar, o oVar) {
        super(i10, map, jSONObject, jSONObject2, gVar, oVar);
    }

    public int P() {
        com.applovin.impl.sdk.c.b<Integer> bVar;
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            bVar = com.applovin.impl.sdk.c.b.f10353cb;
        } else if (format == MaxAdFormat.MREC) {
            bVar = com.applovin.impl.sdk.c.b.f10355cd;
        } else if (format == MaxAdFormat.LEADER) {
            bVar = com.applovin.impl.sdk.c.b.cf;
        } else {
            bVar = format == MaxAdFormat.NATIVE ? com.applovin.impl.sdk.c.b.f10357ch : null;
        }
        if (bVar != null) {
            return b("viewability_min_width", ((Integer) this.f9049b.a(bVar)).intValue());
        }
        return 0;
    }

    public int Q() {
        com.applovin.impl.sdk.c.b<Integer> bVar;
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            bVar = com.applovin.impl.sdk.c.b.f10354cc;
        } else if (format == MaxAdFormat.MREC) {
            bVar = com.applovin.impl.sdk.c.b.f10356ce;
        } else if (format == MaxAdFormat.LEADER) {
            bVar = com.applovin.impl.sdk.c.b.cg;
        } else {
            bVar = format == MaxAdFormat.NATIVE ? com.applovin.impl.sdk.c.b.ci : null;
        }
        if (bVar != null) {
            return b("viewability_min_height", ((Integer) this.f9049b.a(bVar)).intValue());
        }
        return 0;
    }

    public float R() {
        return a("viewability_min_alpha", ((Float) this.f9049b.a(com.applovin.impl.sdk.c.b.cj)).floatValue() / 100.0f);
    }

    public int S() {
        return b("viewability_min_pixels", -1);
    }

    public float T() {
        return a("viewability_min_percentage_dp", -1.0f);
    }

    public float W() {
        return a("viewability_min_percentage_pixels", -1.0f);
    }

    public boolean X() {
        return S() >= 0 || T() >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || W() >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    public long Y() {
        return b("viewability_timer_min_visible_ms", ((Long) this.f9049b.a(com.applovin.impl.sdk.c.b.ck)).longValue());
    }
}
