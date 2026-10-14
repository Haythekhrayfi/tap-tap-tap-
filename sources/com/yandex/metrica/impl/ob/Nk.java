package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.app.Activity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UseSparseArrays"})
class Nk implements InterfaceC1567cm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W0 f14594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Al f14595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Om f14596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<Long, Long> f14597d;

    public Nk() {
        this(Oh.a(), new Al(), new Nm());
    }

    public Nk(W0 w10, Al al, Om om) {
        this.f14597d = new HashMap();
        this.f14594a = w10;
        this.f14595b = al;
        this.f14596c = om;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1517am
    public synchronized void a(long j10, Activity activity, Gl gl, List<Wl> list, Il il, C1566cl c1566cl) {
        long jA = this.f14596c.a();
        Long l10 = this.f14597d.get(Long.valueOf(j10));
        if (l10 != null) {
            this.f14597d.remove(Long.valueOf(j10));
            W0 w10 = this.f14594a;
            Al al = this.f14595b;
            long jLongValue = jA - l10.longValue();
            Objects.requireNonNull(al);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("time_millis", jLongValue);
            } catch (Throwable unused) {
            }
            w10.reportEvent("ui_parsing_time", jSONObject.toString());
        } else {
            this.f14594a.reportError("ui_parsing_diagnostics", new IllegalStateException("Unexpected situation: no start time"));
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1567cm
    public synchronized void a(Activity activity, long j10) {
        this.f14597d.put(Long.valueOf(j10), Long.valueOf(this.f14596c.a()));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1567cm
    public void a(Activity activity, boolean z10) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1517am
    public void a(Throwable th, C1542bm c1542bm) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1517am
    public boolean a(Il il) {
        return false;
    }
}
