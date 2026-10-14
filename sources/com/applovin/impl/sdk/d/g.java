package com.applovin.impl.sdk.d;

import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.y;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f10486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Long> f10487b = new HashMap();

    public g(o oVar) {
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f10486a = oVar;
    }

    private void e() {
        this.f10486a.G().a(new Runnable() { // from class: com.applovin.impl.sdk.d.g.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    g.this.f10486a.a(com.applovin.impl.sdk.c.d.E, g.this.c().toString());
                } catch (Throwable th) {
                    g.this.f10486a.F();
                    if (y.a()) {
                        g.this.f10486a.F().b("GlobalStatsManager", "Unable to save stats", th);
                    }
                }
            }
        });
    }

    public long a(f fVar) {
        return a(fVar, 1L);
    }

    public long a(f fVar, long j10) {
        long jLongValue;
        synchronized (this.f10487b) {
            Long l10 = this.f10487b.get(fVar.a());
            if (l10 == null) {
                l10 = 0L;
            }
            jLongValue = l10.longValue() + j10;
            this.f10487b.put(fVar.a(), Long.valueOf(jLongValue));
        }
        e();
        return jLongValue;
    }

    public void a() {
        synchronized (this.f10487b) {
            this.f10487b.clear();
        }
        e();
    }

    public long b(f fVar) {
        long jLongValue;
        synchronized (this.f10487b) {
            Long l10 = this.f10487b.get(fVar.a());
            if (l10 == null) {
                l10 = 0L;
            }
            jLongValue = l10.longValue();
        }
        return jLongValue;
    }

    public void b() {
        synchronized (this.f10487b) {
            Iterator<f> it = f.b().iterator();
            while (it.hasNext()) {
                this.f10487b.remove(it.next().a());
            }
            e();
        }
    }

    public void b(f fVar, long j10) {
        synchronized (this.f10487b) {
            this.f10487b.put(fVar.a(), Long.valueOf(j10));
        }
        e();
    }

    public JSONObject c() {
        JSONObject jSONObject;
        synchronized (this.f10487b) {
            jSONObject = new JSONObject();
            for (Map.Entry<String, Long> entry : this.f10487b.entrySet()) {
                JsonUtils.putLong(jSONObject, entry.getKey(), entry.getValue().longValue());
            }
        }
        return jSONObject;
    }

    public void c(f fVar) {
        synchronized (this.f10487b) {
            this.f10487b.remove(fVar.a());
        }
        e();
    }

    public void d() {
        try {
            JSONObject jSONObject = new JSONObject((String) this.f10486a.b(com.applovin.impl.sdk.c.d.E, "{}"));
            synchronized (this.f10487b) {
                try {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        try {
                            String next = itKeys.next();
                            this.f10487b.put(next, Long.valueOf(jSONObject.getLong(next)));
                        } catch (JSONException unused) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            this.f10486a.F();
            if (y.a()) {
                this.f10486a.F().b("GlobalStatsManager", "Unable to load stats", th2);
            }
        }
    }
}
