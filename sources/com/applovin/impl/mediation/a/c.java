package com.applovin.impl.mediation.a;

import android.os.SystemClock;
import com.applovin.impl.sdk.o;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c extends a implements com.applovin.impl.sdk.ad.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference<com.applovin.impl.sdk.b.c> f9041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f9042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f9043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f9045g;

    public c(int i10, Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, o oVar) {
        super(i10, map, jSONObject, jSONObject2, null, oVar);
        this.f9043e = new AtomicBoolean();
        this.f9041c = new AtomicReference<>();
        this.f9042d = new AtomicBoolean();
    }

    private c(c cVar, com.applovin.impl.mediation.g gVar) {
        super(cVar.H(), cVar.ak(), cVar.aa(), cVar.Z(), gVar, cVar.f9049b);
        this.f9043e = new AtomicBoolean();
        this.f9041c = cVar.f9041c;
        this.f9042d = cVar.f9042d;
    }

    private long X() {
        long jB = b("ad_expiration_ms", -1L);
        return jB < 0 ? a("ad_expiration_ms", ((Long) this.f9049b.a(com.applovin.impl.sdk.c.a.C)).longValue()) : jB;
    }

    public long I() {
        long jB = b("ad_hidden_timeout_ms", -1L);
        return jB >= 0 ? jB : a("ad_hidden_timeout_ms", ((Long) this.f9049b.a(com.applovin.impl.sdk.c.a.G)).longValue());
    }

    public boolean J() {
        if (b("schedule_ad_hidden_on_ad_dismiss", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return a("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f9049b.a(com.applovin.impl.sdk.c.a.H)).booleanValue();
    }

    public long K() {
        long jB = b("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        return jB >= 0 ? jB : a("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f9049b.a(com.applovin.impl.sdk.c.a.I)).longValue());
    }

    public long L() {
        if (C() > 0) {
            return SystemClock.elapsedRealtime() - C();
        }
        return -1L;
    }

    public long M() {
        long jB = b("fullscreen_display_delay_ms", -1L);
        return jB >= 0 ? jB : ((Long) this.f9049b.a(com.applovin.impl.sdk.c.a.f10336u)).longValue();
    }

    public long N() {
        return b("ahdm", ((Long) this.f9049b.a(com.applovin.impl.sdk.c.a.f10338w)).longValue());
    }

    public boolean O() {
        return b("susaode", (Boolean) this.f9049b.a(com.applovin.impl.sdk.c.a.f10337v)).booleanValue();
    }

    public String P() {
        return a("mcode", "");
    }

    public boolean Q() {
        return this.f9042d.get();
    }

    public void R() {
        this.f9042d.set(true);
    }

    public com.applovin.impl.sdk.b.c S() {
        return this.f9041c.getAndSet(null);
    }

    public AtomicBoolean T() {
        return this.f9043e;
    }

    @Override // com.applovin.impl.sdk.ad.g
    public long U() {
        return X() - (SystemClock.elapsedRealtime() - C());
    }

    @Override // com.applovin.impl.sdk.ad.g
    public void V() {
        this.f9045g = true;
    }

    public boolean W() {
        return this.f9044f;
    }

    @Override // com.applovin.impl.mediation.a.a
    public a a(com.applovin.impl.mediation.g gVar) {
        return new c(this, gVar);
    }

    public void a(com.applovin.impl.sdk.b.c cVar) {
        this.f9041c.set(cVar);
    }

    public void a(boolean z10) {
        this.f9044f = z10;
    }
}
