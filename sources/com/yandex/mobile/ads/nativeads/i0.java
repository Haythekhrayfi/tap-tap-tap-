package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.a6;
import com.yandex.mobile.ads.impl.ti;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27755b;

    public i0(ti tiVar) {
        this.f27754a = tiVar.a();
        this.f27755b = tiVar.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i0.class != obj.getClass()) {
            return false;
        }
        i0 i0Var = (i0) obj;
        String str = this.f27754a;
        if (str == null ? i0Var.f27754a == null : str.equals(i0Var.f27754a)) {
            return this.f27755b == i0Var.f27755b;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f27754a;
        return a6.a(this.f27755b) + ((str != null ? str.hashCode() : 0) * 31);
    }
}
