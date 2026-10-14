package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.InstallStatus;
import com.google.android.play.core.install.model.UpdateAvailability;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AppUpdateInfo {
    public static AppUpdateInfo a(String str, int i10, @UpdateAvailability int i11, @InstallStatus int i12, Integer num, int i13, long j10, long j11, long j12, long j13, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        return new t(str, i10, i11, i12, num, i13, j10, j11, j12, j13, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4);
    }

    private final boolean b(AppUpdateOptions appUpdateOptions) {
        return appUpdateOptions.allowAssetPackDeletion() && a() <= b();
    }

    public abstract long a();

    public final PendingIntent a(AppUpdateOptions appUpdateOptions) {
        if (appUpdateOptions.appUpdateType() == 0) {
            if (d() != null) {
                return d();
            }
            if (b(appUpdateOptions)) {
                return f();
            }
            return null;
        }
        if (appUpdateOptions.appUpdateType() == 1) {
            if (c() != null) {
                return c();
            }
            if (b(appUpdateOptions)) {
                return e();
            }
        }
        return null;
    }

    public abstract int availableVersionCode();

    public abstract long b();

    public abstract long bytesDownloaded();

    public abstract PendingIntent c();

    public abstract Integer clientVersionStalenessDays();

    public abstract PendingIntent d();

    public abstract PendingIntent e();

    public abstract PendingIntent f();

    @InstallStatus
    public abstract int installStatus();

    public boolean isUpdateTypeAllowed(@AppUpdateType int i10) {
        return a(AppUpdateOptions.defaultOptions(i10)) != null;
    }

    public boolean isUpdateTypeAllowed(AppUpdateOptions appUpdateOptions) {
        return a(appUpdateOptions) != null;
    }

    public abstract String packageName();

    public abstract long totalBytesToDownload();

    @UpdateAvailability
    public abstract int updateAvailability();

    public abstract int updatePriority();
}
