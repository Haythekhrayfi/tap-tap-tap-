package com.yandex.metrica.impl.ob;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Ul {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Om f15194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W0 f15195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Al f15196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f15197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f15199f;

    public Ul(boolean z10) {
        this(z10, new Nm(), Oh.a(), new Al());
    }

    public Ul(boolean z10, Om om, W0 w10, Al al) {
        this.f15198e = false;
        this.f15197d = z10;
        this.f15194a = om;
        this.f15195b = w10;
        this.f15196c = al;
    }

    public void a() {
        long jA = this.f15194a.a();
        W0 w10 = this.f15195b;
        Al al = this.f15196c;
        long j10 = jA - this.f15199f;
        boolean z10 = this.f15197d;
        boolean z11 = this.f15198e;
        Objects.requireNonNull(al);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time_millis", j10).put("force", z10).put("rescanned", z11);
        } catch (Throwable unused) {
        }
        w10.reportEvent("ui_parsing_bridge_time", jSONObject.toString());
    }

    public void a(boolean z10) {
        this.f15198e = z10;
    }

    public void b() {
        this.f15199f = this.f15194a.a();
    }
}
