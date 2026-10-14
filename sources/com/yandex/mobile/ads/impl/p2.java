package com.yandex.mobile.ads.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class p2 extends bi1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f23954c = 0;
    private static final long serialVersionUID = 9076708591501334094L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23955b;

    public static final class a {
        public static p2 a(wm0 wm0Var) {
            p2 p2Var;
            int i10 = wm0Var != null ? wm0Var.f26319a : -1;
            if (204 == i10) {
                p2Var = new p2(wm0Var, 6);
            } else {
                Map<String, String> map = wm0Var != null ? wm0Var.f26321c : null;
                Integer numValueOf = wm0Var != null ? Integer.valueOf(wm0Var.f26319a) : null;
                if ((numValueOf == null || 400 != numValueOf.intValue() || map == null) ? false : qy.a(map, 48)) {
                    p2Var = new p2(wm0Var, 12);
                } else if (403 == i10) {
                    p2Var = new p2(wm0Var, 10);
                } else if (404 == i10) {
                    p2Var = new p2(wm0Var, 4);
                } else {
                    if (500 <= i10 && i10 < 600) {
                        p2Var = new p2(wm0Var, 9);
                    } else {
                        p2Var = -1 == i10 ? new p2(wm0Var, 7) : new p2(wm0Var, 8);
                    }
                }
            }
            x60.c("Returned server HTTP status code: %d", Integer.valueOf(i10));
            return p2Var;
        }

        public static p2 b(wm0 wm0Var) {
            int i10;
            int i11 = wm0Var != null ? wm0Var.f26319a : -1;
            if (500 <= i11 && i11 < 600) {
                i10 = 9;
            } else {
                i10 = -1 == i11 ? 7 : 8;
            }
            x60.c("Returned server HTTP status code: %d", Integer.valueOf(i11));
            return new p2(wm0Var, i10);
        }
    }

    public p2(wm0 wm0Var, int i10) {
        super(wm0Var);
        this.f23955b = i10;
    }

    public final int a() {
        return this.f23955b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && fd.j0.d(p2.class, obj.getClass()) && this.f23955b == ((p2) obj).f23955b;
    }

    public final int hashCode() {
        return this.f23955b;
    }
}
