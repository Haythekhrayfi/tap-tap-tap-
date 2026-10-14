package com.google.android.play.core.assetpacks;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class bf extends AssetLocation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f11922c;

    public bf(String str, long j10, long j11) {
        Objects.requireNonNull(str, "Null path");
        this.f11920a = str;
        this.f11921b = j10;
        this.f11922c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetLocation) {
            AssetLocation assetLocation = (AssetLocation) obj;
            if (this.f11920a.equals(assetLocation.path()) && this.f11921b == assetLocation.offset() && this.f11922c == assetLocation.size()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f11920a.hashCode();
        long j10 = this.f11921b;
        long j11 = this.f11922c;
        return ((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11));
    }

    @Override // com.google.android.play.core.assetpacks.AssetLocation
    public final long offset() {
        return this.f11921b;
    }

    @Override // com.google.android.play.core.assetpacks.AssetLocation
    public final String path() {
        return this.f11920a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetLocation
    public final long size() {
        return this.f11922c;
    }

    public final String toString() {
        String str = this.f11920a;
        long j10 = this.f11921b;
        long j11 = this.f11922c;
        StringBuilder sb2 = new StringBuilder(str.length() + 76);
        v.e.a(sb2, "AssetLocation{path=", str, ", offset=");
        sb2.append(j10);
        sb2.append(", size=");
        sb2.append(j11);
        sb2.append("}");
        return sb2.toString();
    }
}
