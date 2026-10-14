package com.google.android.play.core.appupdate;

import com.google.android.play.core.install.model.AppUpdateType;

/* JADX INFO: loaded from: classes2.dex */
final class v extends AppUpdateOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11798b;

    public /* synthetic */ v(int i10, boolean z10) {
        this.f11797a = i10;
        this.f11798b = z10;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions
    public final boolean allowAssetPackDeletion() {
        return this.f11798b;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions
    @AppUpdateType
    public final int appUpdateType() {
        return this.f11797a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AppUpdateOptions) {
            AppUpdateOptions appUpdateOptions = (AppUpdateOptions) obj;
            if (this.f11797a == appUpdateOptions.appUpdateType() && this.f11798b == appUpdateOptions.allowAssetPackDeletion()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f11797a ^ 1000003) * 1000003) ^ (true != this.f11798b ? 1237 : 1231);
    }

    public final String toString() {
        int i10 = this.f11797a;
        boolean z10 = this.f11798b;
        StringBuilder sb2 = new StringBuilder(73);
        sb2.append("AppUpdateOptions{appUpdateType=");
        sb2.append(i10);
        sb2.append(", allowAssetPackDeletion=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }
}
