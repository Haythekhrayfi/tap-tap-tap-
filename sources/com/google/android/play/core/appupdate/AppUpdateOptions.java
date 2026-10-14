package com.google.android.play.core.appupdate;

import com.google.android.play.core.install.model.AppUpdateType;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AppUpdateOptions {

    public static abstract class Builder {
        public abstract AppUpdateOptions build();

        public abstract Builder setAllowAssetPackDeletion(boolean z10);

        public abstract Builder setAppUpdateType(@AppUpdateType int i10);
    }

    public static AppUpdateOptions defaultOptions(@AppUpdateType int i10) {
        return newBuilder(i10).build();
    }

    public static Builder newBuilder(@AppUpdateType int i10) {
        u uVar = new u();
        uVar.setAppUpdateType(i10);
        uVar.setAllowAssetPackDeletion(false);
        return uVar;
    }

    public abstract boolean allowAssetPackDeletion();

    @AppUpdateType
    public abstract int appUpdateType();
}
