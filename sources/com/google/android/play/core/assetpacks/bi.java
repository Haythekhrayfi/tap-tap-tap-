package com.google.android.play.core.assetpacks;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class bi extends AssetPackStates {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f11932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, AssetPackState> f11933b;

    public bi(long j10, Map<String, AssetPackState> map) {
        this.f11932a = j10;
        this.f11933b = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackStates) {
            AssetPackStates assetPackStates = (AssetPackStates) obj;
            if (this.f11932a == assetPackStates.totalBytes() && this.f11933b.equals(assetPackStates.packStates())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f11932a;
        return ((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f11933b.hashCode();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackStates
    public final Map<String, AssetPackState> packStates() {
        return this.f11933b;
    }

    public final String toString() {
        long j10 = this.f11932a;
        String strValueOf = String.valueOf(this.f11933b);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 61);
        r.e.a(sb2, "AssetPackStates{totalBytes=", j10, ", packStates=");
        return androidx.activity.k.a(sb2, strValueOf, "}");
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackStates
    public final long totalBytes() {
        return this.f11932a;
    }
}
