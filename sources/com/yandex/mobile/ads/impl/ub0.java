package com.yandex.mobile.ads.impl;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ub0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final em1 f25592a;

    private ub0(em1 em1Var) {
        this.f25592a = em1Var;
    }

    public static ub0 a(em1 em1Var) {
        if (!em1Var.l()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
        if (em1Var.g()) {
            throw new IllegalStateException("AdSession is started");
        }
        if (em1Var.j()) {
            throw new IllegalStateException("AdSession is finished");
        }
        if (em1Var.i().d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
        ub0 ub0Var = new ub0(em1Var);
        em1Var.i().a(ub0Var);
        return ub0Var;
    }

    public final void a() {
        s60 s60Var = s60.f24988b;
        in1.a(this.f25592a);
        JSONObject jSONObject = new JSONObject();
        rm1.a(jSONObject, "interactionType", s60Var);
        hn1.a(this.f25592a.i().e(), "adUserInteraction", jSONObject);
    }

    public final void a(float f10) {
        if (f10 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
        in1.a(this.f25592a);
        JSONObject jSONObject = new JSONObject();
        rm1.a(jSONObject, "duration", Float.valueOf(f10));
        rm1.a(jSONObject, "mediaPlayerVolume", Float.valueOf(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD));
        rm1.a(jSONObject, "deviceVolume", Float.valueOf(nn1.a().d()));
        hn1.a(this.f25592a.i().e(), "start", jSONObject);
    }

    public final void b() {
        in1.a(this.f25592a);
        this.f25592a.i().a("bufferFinish");
    }

    public final void b(float f10) {
        if (f10 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || f10 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
        in1.a(this.f25592a);
        JSONObject jSONObject = new JSONObject();
        rm1.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f10));
        rm1.a(jSONObject, "deviceVolume", Float.valueOf(nn1.a().d()));
        hn1.a(this.f25592a.i().e(), "volumeChange", jSONObject);
    }

    public final void c() {
        in1.a(this.f25592a);
        this.f25592a.i().a("bufferStart");
    }

    public final void d() {
        in1.a(this.f25592a);
        this.f25592a.i().a("complete");
    }

    public final void e() {
        in1.a(this.f25592a);
        this.f25592a.i().a("firstQuartile");
    }

    public final void f() {
        in1.a(this.f25592a);
        this.f25592a.i().a("midpoint");
    }

    public final void g() {
        in1.a(this.f25592a);
        this.f25592a.i().a("pause");
    }

    public final void h() {
        in1.a(this.f25592a);
        this.f25592a.i().a("resume");
    }

    public final void i() {
        in1.a(this.f25592a);
        this.f25592a.i().a("skipped");
    }

    public final void j() {
        in1.a(this.f25592a);
        this.f25592a.i().a("thirdQuartile");
    }
}
