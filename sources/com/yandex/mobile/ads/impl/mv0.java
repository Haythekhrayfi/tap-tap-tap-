package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mv0 implements jv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lv0 f23148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jv0 f23149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m3 f23150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final tv0 f23151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ov0 f23152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23153f;

    public mv0(Context context, t4 t4Var, AdResponse adResponse, k2 k2Var, m3 m3Var, v20 v20Var, ov0 ov0Var, List list) {
        this.f23150c = m3Var;
        this.f23151d = v20Var;
        this.f23152e = ov0Var;
        this.f23148a = new lv0(context, adResponse, k2Var, list);
        this.f23149b = new jv0(t4Var, this);
    }

    public final void a() {
        ov0 ov0Var = this.f23152e;
        if (ov0Var != null) {
            ov0Var.b();
        }
        this.f23148a.a();
        this.f23150c.b();
        this.f23151d.e();
    }

    public final void a(qk0 qk0Var) {
        this.f23148a.a(qk0Var);
    }

    public final void b() {
        if (this.f23153f) {
            return;
        }
        this.f23153f = true;
        this.f23149b.a();
    }

    public final void c() {
        this.f23153f = false;
        this.f23149b.b();
    }
}
