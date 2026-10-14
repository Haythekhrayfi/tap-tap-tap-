package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.model.AssetPackErrorCode;
import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class bh extends AssetPackState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f11929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f11930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f11931f;

    public bh(String str, int i10, int i11, long j10, long j11, int i12) {
        Objects.requireNonNull(str, "Null name");
        this.f11926a = str;
        this.f11927b = i10;
        this.f11928c = i11;
        this.f11929d = j10;
        this.f11930e = j11;
        this.f11931f = i12;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long bytesDownloaded() {
        return this.f11929d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.f11926a.equals(assetPackState.name()) && this.f11927b == assetPackState.status() && this.f11928c == assetPackState.errorCode() && this.f11929d == assetPackState.bytesDownloaded() && this.f11930e == assetPackState.totalBytesToDownload() && this.f11931f == assetPackState.transferProgressPercentage()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    @AssetPackErrorCode
    public final int errorCode() {
        return this.f11928c;
    }

    public final int hashCode() {
        int iHashCode = this.f11926a.hashCode();
        int i10 = this.f11927b;
        int i11 = this.f11928c;
        long j10 = this.f11929d;
        long j11 = this.f11930e;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ i10) * 1000003) ^ i11) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f11931f;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String name() {
        return this.f11926a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    @AssetPackStatus
    public final int status() {
        return this.f11927b;
    }

    public final String toString() {
        String str = this.f11926a;
        int i10 = this.f11927b;
        int i11 = this.f11928c;
        long j10 = this.f11929d;
        long j11 = this.f11930e;
        int i12 = this.f11931f;
        StringBuilder sb2 = new StringBuilder(str.length() + 185);
        sb2.append("AssetPackState{name=");
        sb2.append(str);
        sb2.append(", status=");
        sb2.append(i10);
        sb2.append(", errorCode=");
        sb2.append(i11);
        sb2.append(", bytesDownloaded=");
        sb2.append(j10);
        r.e.a(sb2, ", totalBytesToDownload=", j11, ", transferProgressPercentage=");
        return android.support.v4.media.b.a(sb2, i12, "}");
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long totalBytesToDownload() {
        return this.f11930e;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int transferProgressPercentage() {
        return this.f11931f;
    }
}
