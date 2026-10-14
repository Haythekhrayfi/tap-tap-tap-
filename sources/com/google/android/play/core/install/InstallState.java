package com.google.android.play.core.install;

import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;

/* JADX INFO: loaded from: classes2.dex */
public abstract class InstallState {
    public static InstallState a(@InstallStatus int i10, long j10, long j11, @InstallErrorCode int i11, String str) {
        return new a(i10, j10, j11, i11, str);
    }

    public abstract long bytesDownloaded();

    @InstallErrorCode
    public abstract int installErrorCode();

    @InstallStatus
    public abstract int installStatus();

    public abstract String packageName();

    public abstract long totalBytesToDownload();
}
