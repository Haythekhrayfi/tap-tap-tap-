package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b5 f19688a = new b5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<b0> f19689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final iw0 f19690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k2 f19691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final eu f19692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private fw0.a f19694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f19695h;

    public d0(Context context, k2 k2Var, b0 b0Var, FalseClick falseClick) {
        this.f19691d = k2Var;
        this.f19689b = new WeakReference<>(b0Var);
        this.f19690c = z8.a(context);
        this.f19692e = falseClick != null ? new eu(context, k2Var, falseClick) : null;
    }

    public final void a(int i10) {
        String str;
        StringBuilder sbA = v60.a("finishActivityInteraction, type = ");
        sbA.append(c0.b(i10));
        x60.b(sbA.toString(), new Object[0]);
        if (this.f19695h == 0 || this.f19693f != i10) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f19695h;
        if (jCurrentTimeMillis < 1000) {
            str = "<1";
        } else if (jCurrentTimeMillis > 1000 && jCurrentTimeMillis <= 2000) {
            str = "1-2";
        } else if (jCurrentTimeMillis > 2000 && jCurrentTimeMillis <= 3000) {
            str = "2-3";
        } else if (jCurrentTimeMillis > 3000 && jCurrentTimeMillis <= 5000) {
            str = "3-5";
        } else if (jCurrentTimeMillis > 5000 && jCurrentTimeMillis <= AbstractComponentTracker.LINGERING_TIMEOUT) {
            str = "5-10";
        } else if (jCurrentTimeMillis <= AbstractComponentTracker.LINGERING_TIMEOUT || jCurrentTimeMillis > 15000) {
            str = (jCurrentTimeMillis <= 15000 || jCurrentTimeMillis > 20000) ? ">20" : "15-20";
        } else {
            str = "10-15";
        }
        HashMap map = new HashMap();
        map.put("type", c0.a(i10));
        map.put("ad_type", this.f19691d.b().a());
        map.put("block_id", this.f19691d.c());
        map.put("ad_unit_id", this.f19691d.c());
        map.put("interval", str);
        map.putAll(this.f19688a.a(this.f19691d.a()));
        fw0.a aVar = this.f19694g;
        if (aVar != null) {
            map.putAll(aVar.a());
        }
        this.f19690c.a(new fw0(fw0.b.K.a(), map));
        x60.d("trackActivityInteractionInterval, type = %s, interval = %s", c0.a(i10), str);
        b0 b0Var = this.f19689b.get();
        if (b0Var != null) {
            b0Var.onReturnedToApplication();
        }
        eu euVar = this.f19692e;
        if (euVar != null) {
            euVar.a(jCurrentTimeMillis);
        }
        this.f19695h = 0L;
        this.f19693f = 0;
    }

    public final void a(fw0.a aVar) {
        this.f19694g = aVar;
    }

    public final void b(int i10) {
        StringBuilder sbA = v60.a("startActivityInteraction, type = ");
        sbA.append(c0.b(i10));
        x60.b(sbA.toString(), new Object[0]);
        this.f19695h = System.currentTimeMillis();
        this.f19693f = i10;
    }
}
