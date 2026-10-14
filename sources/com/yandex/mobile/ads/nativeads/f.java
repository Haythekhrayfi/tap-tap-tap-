package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.ti;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends NativeAdAssets {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private i0 f27736p;

    public final void a(ti tiVar) {
        this.f27736p = tiVar != null ? new i0(tiVar) : null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        i0 i0Var = this.f27736p;
        i0 i0Var2 = ((f) obj).f27736p;
        if (i0Var != null) {
            return i0Var.equals(i0Var2);
        }
        return i0Var2 == null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        i0 i0Var = this.f27736p;
        return iHashCode + (i0Var != null ? i0Var.hashCode() : 0);
    }
}
