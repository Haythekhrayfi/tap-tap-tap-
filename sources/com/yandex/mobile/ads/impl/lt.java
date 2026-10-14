package com.yandex.mobile.ads.impl;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public final class lt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RectF f22777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22778b;

    public lt(int i10, RectF rectF) {
        this.f22778b = i10;
        this.f22777a = rectF;
    }

    public final int a() {
        return this.f22778b;
    }

    public final RectF b() {
        return this.f22777a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lt.class != obj.getClass()) {
            return false;
        }
        lt ltVar = (lt) obj;
        if (this.f22778b != ltVar.f22778b) {
            return false;
        }
        RectF rectF = this.f22777a;
        RectF rectF2 = ltVar.f22777a;
        if (rectF != null) {
            return rectF.equals(rectF2);
        }
        return rectF2 == null;
    }

    public final int hashCode() {
        RectF rectF = this.f22777a;
        return ((rectF != null ? rectF.hashCode() : 0) * 31) + this.f22778b;
    }
}
