package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class wg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vg1 f26275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g80 f26276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ta0 f26277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, String> f26278d;

    public /* synthetic */ wg1(vg1 vg1Var, g80 g80Var, ta0 ta0Var) {
        this(vg1Var, g80Var, ta0Var, kc.x.f32010c);
    }

    public wg1(vg1 vg1Var, g80 g80Var, ta0 ta0Var, Map<String, String> map) {
        fd.j0.i(vg1Var, "view");
        fd.j0.i(g80Var, "layoutParams");
        fd.j0.i(ta0Var, "measured");
        fd.j0.i(map, "additionalInfo");
        this.f26275a = vg1Var;
        this.f26276b = g80Var;
        this.f26277c = ta0Var;
        this.f26278d = map;
    }

    public final Map<String, String> a() {
        return this.f26278d;
    }

    public final g80 b() {
        return this.f26276b;
    }

    public final ta0 c() {
        return this.f26277c;
    }

    public final vg1 d() {
        return this.f26275a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg1)) {
            return false;
        }
        wg1 wg1Var = (wg1) obj;
        return fd.j0.d(this.f26275a, wg1Var.f26275a) && fd.j0.d(this.f26276b, wg1Var.f26276b) && fd.j0.d(this.f26277c, wg1Var.f26277c) && fd.j0.d(this.f26278d, wg1Var.f26278d);
    }

    public final int hashCode() {
        return this.f26278d.hashCode() + ((this.f26277c.hashCode() + ((this.f26276b.hashCode() + (this.f26275a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("ViewSizeInfo(view=");
        sbA.append(this.f26275a);
        sbA.append(", layoutParams=");
        sbA.append(this.f26276b);
        sbA.append(", measured=");
        sbA.append(this.f26277c);
        sbA.append(", additionalInfo=");
        sbA.append(this.f26278d);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
