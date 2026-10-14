package com.yandex.metrica.impl.ob;

import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C1970t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f17420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17421b;

    public C1970t2(Map<String, String> map, boolean z10) {
        this.f17420a = map;
        this.f17421b = z10;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("SatelliteClidsInfo{clids=");
        sbA.append(this.f17420a);
        sbA.append(", checked=");
        return androidx.recyclerview.widget.s.a(sbA, this.f17421b, '}');
    }
}
