package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.CoreConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Le implements F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f14406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E0 f14409e;

    public Le(String str, JSONObject jSONObject, boolean z10, boolean z11, E0 e10) {
        this.f14405a = str;
        this.f14406b = jSONObject;
        this.f14407c = z10;
        this.f14408d = z11;
        this.f14409e = e10;
    }

    @Override // com.yandex.metrica.impl.ob.F0
    public E0 a() {
        return this.f14409e;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("PreloadInfoState{trackingId='");
        l1.c.a(sbA, this.f14405a, CoreConstants.SINGLE_QUOTE_CHAR, ", additionalParameters=");
        sbA.append(this.f14406b);
        sbA.append(", wasSet=");
        sbA.append(this.f14407c);
        sbA.append(", autoTrackingEnabled=");
        sbA.append(this.f14408d);
        sbA.append(", source=");
        sbA.append(this.f14409e);
        sbA.append('}');
        return sbA.toString();
    }
}
