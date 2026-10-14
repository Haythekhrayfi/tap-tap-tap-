package com.google.android.play.core.appupdate;

/* JADX INFO: loaded from: classes2.dex */
final class u extends AppUpdateOptions.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f11795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f11796b;

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final AppUpdateOptions build() {
        String strConcat = this.f11795a == null ? "".concat(" appUpdateType") : "";
        if (this.f11796b == null) {
            strConcat = String.valueOf(strConcat).concat(" allowAssetPackDeletion");
        }
        if (strConcat.isEmpty()) {
            return new v(this.f11795a.intValue(), this.f11796b.booleanValue());
        }
        throw new IllegalStateException(strConcat.length() != 0 ? "Missing required properties:".concat(strConcat) : new String("Missing required properties:"));
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final AppUpdateOptions.Builder setAllowAssetPackDeletion(boolean z10) {
        this.f11796b = Boolean.valueOf(z10);
        return this;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final AppUpdateOptions.Builder setAppUpdateType(int i10) {
        this.f11795a = Integer.valueOf(i10);
        return this;
    }
}
