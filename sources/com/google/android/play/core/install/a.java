package com.google.android.play.core.install;

import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;
import java.util.Objects;
import r.e;

/* JADX INFO: loaded from: classes2.dex */
final class a extends InstallState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f12234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f12235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f12237e;

    public a(int i10, long j10, long j11, int i11, String str) {
        this.f12233a = i10;
        this.f12234b = j10;
        this.f12235c = j11;
        this.f12236d = i11;
        Objects.requireNonNull(str, "Null packageName");
        this.f12237e = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long bytesDownloaded() {
        return this.f12234b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.f12233a == installState.installStatus() && this.f12234b == installState.bytesDownloaded() && this.f12235c == installState.totalBytesToDownload() && this.f12236d == installState.installErrorCode() && this.f12237e.equals(installState.packageName())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f12233a;
        long j10 = this.f12234b;
        long j11 = this.f12235c;
        return ((((((((i10 ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f12236d) * 1000003) ^ this.f12237e.hashCode();
    }

    @Override // com.google.android.play.core.install.InstallState
    @InstallErrorCode
    public final int installErrorCode() {
        return this.f12236d;
    }

    @Override // com.google.android.play.core.install.InstallState
    @InstallStatus
    public final int installStatus() {
        return this.f12233a;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String packageName() {
        return this.f12237e;
    }

    public final String toString() {
        int i10 = this.f12233a;
        long j10 = this.f12234b;
        long j11 = this.f12235c;
        int i11 = this.f12236d;
        String str = this.f12237e;
        StringBuilder sb2 = new StringBuilder(str.length() + 164);
        sb2.append("InstallState{installStatus=");
        sb2.append(i10);
        sb2.append(", bytesDownloaded=");
        sb2.append(j10);
        e.a(sb2, ", totalBytesToDownload=", j11, ", installErrorCode=");
        sb2.append(i11);
        sb2.append(", packageName=");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long totalBytesToDownload() {
        return this.f12235c;
    }
}
