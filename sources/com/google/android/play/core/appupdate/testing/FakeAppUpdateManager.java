package com.google.android.play.core.appupdate.testing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.appupdate.a;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;
import com.google.android.play.core.install.model.UpdateAvailability;
import com.google.android.play.core.listener.StateUpdatedListener;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;

/* JADX INFO: loaded from: classes2.dex */
public class FakeAppUpdateManager implements AppUpdateManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f11781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f11782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @InstallStatus
    private int f11783c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InstallErrorCode
    private int f11784d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11785e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11786f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f11787g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11788h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f11789i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f11790j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f11791k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f11792l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f11793m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @AppUpdateType
    private Integer f11794n;

    public FakeAppUpdateManager(Context context) {
        this.f11781a = new a(context);
        this.f11782b = context;
    }

    @UpdateAvailability
    private final int a() {
        if (!this.f11785e) {
            return 1;
        }
        int i10 = this.f11783c;
        return (i10 == 0 || i10 == 4 || i10 == 5 || i10 == 6) ? 2 : 3;
    }

    private final boolean a(AppUpdateInfo appUpdateInfo, AppUpdateOptions appUpdateOptions) {
        int i10;
        if (!appUpdateInfo.isUpdateTypeAllowed(appUpdateOptions) && (!AppUpdateOptions.defaultOptions(appUpdateOptions.appUpdateType()).equals(appUpdateOptions) || !appUpdateInfo.isUpdateTypeAllowed(appUpdateOptions.appUpdateType()))) {
            return false;
        }
        if (appUpdateOptions.appUpdateType() == 1) {
            this.f11792l = true;
            i10 = 1;
        } else {
            this.f11791k = true;
            i10 = 0;
        }
        this.f11794n = i10;
        return true;
    }

    private final void b() {
        this.f11781a.a(InstallState.a(this.f11783c, this.f11789i, this.f11790j, this.f11784d, this.f11782b.getPackageName()));
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public Task<Void> completeUpdate() {
        int i10 = this.f11784d;
        if (i10 != 0) {
            return Tasks.a((Exception) new InstallException(i10));
        }
        int i11 = this.f11783c;
        if (i11 != 11) {
            return i11 == 3 ? Tasks.a((Exception) new InstallException(-8)) : Tasks.a((Exception) new InstallException(-7));
        }
        this.f11783c = 3;
        this.f11793m = true;
        Integer num = 0;
        if (num.equals(this.f11794n)) {
            b();
        }
        return Tasks.a((Object) null);
    }

    public void downloadCompletes() {
        int i10 = this.f11783c;
        if (i10 == 2 || i10 == 1) {
            this.f11783c = 11;
            this.f11789i = 0L;
            this.f11790j = 0L;
            Integer num = 0;
            if (num.equals(this.f11794n)) {
                b();
                return;
            }
            Integer num2 = 1;
            if (num2.equals(this.f11794n)) {
                completeUpdate();
            }
        }
    }

    public void downloadFails() {
        int i10 = this.f11783c;
        if (i10 == 1 || i10 == 2) {
            this.f11783c = 5;
            Integer num = 0;
            if (num.equals(this.f11794n)) {
                b();
            }
            this.f11794n = null;
            this.f11792l = false;
            this.f11783c = 0;
        }
    }

    public void downloadStarts() {
        if (this.f11783c == 1) {
            this.f11783c = 2;
            Integer num = 0;
            if (num.equals(this.f11794n)) {
                b();
            }
        }
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public Task<AppUpdateInfo> getAppUpdateInfo() {
        PendingIntent broadcast;
        PendingIntent pendingIntent;
        int i10 = this.f11784d;
        if (i10 != 0) {
            return Tasks.a((Exception) new InstallException(i10));
        }
        PendingIntent broadcast2 = (a() == 2 && this.f11784d == 0) ? PendingIntent.getBroadcast(this.f11782b, 0, new Intent(), 0) : null;
        PendingIntent broadcast3 = (a() == 2 && this.f11784d == 0) ? PendingIntent.getBroadcast(this.f11782b, 0, new Intent(), 0) : null;
        if (a() == 2 && this.f11784d == 0) {
            PendingIntent broadcast4 = PendingIntent.getBroadcast(this.f11782b, 0, new Intent(), 0);
            broadcast = PendingIntent.getBroadcast(this.f11782b, 0, new Intent(), 0);
            pendingIntent = broadcast4;
        } else {
            broadcast = null;
            pendingIntent = null;
        }
        return Tasks.a(AppUpdateInfo.a(this.f11782b.getPackageName(), this.f11786f, a(), this.f11783c, this.f11787g, this.f11788h, this.f11789i, this.f11790j, 0L, 0L, broadcast3, broadcast2, broadcast, pendingIntent));
    }

    @AppUpdateType
    public Integer getTypeForUpdateInProgress() {
        return this.f11794n;
    }

    public void installCompletes() {
        if (this.f11783c == 3) {
            this.f11783c = 4;
            this.f11785e = false;
            this.f11786f = 0;
            this.f11787g = null;
            this.f11788h = 0;
            this.f11789i = 0L;
            this.f11790j = 0L;
            this.f11792l = false;
            this.f11793m = false;
            Integer num = 0;
            if (num.equals(this.f11794n)) {
                b();
            }
            this.f11794n = null;
            this.f11783c = 0;
        }
    }

    public void installFails() {
        if (this.f11783c == 3) {
            this.f11783c = 5;
            Integer num = 0;
            if (num.equals(this.f11794n)) {
                b();
            }
            this.f11794n = null;
            this.f11793m = false;
            this.f11792l = false;
            this.f11783c = 0;
        }
    }

    public boolean isConfirmationDialogVisible() {
        return this.f11791k;
    }

    public boolean isImmediateFlowVisible() {
        return this.f11792l;
    }

    public boolean isInstallSplashScreenVisible() {
        return this.f11793m;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public void registerListener(InstallStateUpdatedListener installStateUpdatedListener) {
        this.f11781a.a((StateUpdatedListener) installStateUpdatedListener);
    }

    public void setBytesDownloaded(long j10) {
        if (this.f11783c != 2 || j10 > this.f11790j) {
            return;
        }
        this.f11789i = j10;
        Integer num = 0;
        if (num.equals(this.f11794n)) {
            b();
        }
    }

    public void setClientVersionStalenessDays(Integer num) {
        if (this.f11785e) {
            this.f11787g = num;
        }
    }

    public void setInstallErrorCode(@InstallErrorCode int i10) {
        this.f11784d = i10;
    }

    public void setTotalBytesToDownload(long j10) {
        if (this.f11783c == 2) {
            this.f11790j = j10;
            Integer num = 0;
            if (num.equals(this.f11794n)) {
                b();
            }
        }
    }

    public void setUpdateAvailable(int i10) {
        this.f11785e = true;
        this.f11786f = i10;
    }

    public void setUpdateNotAvailable() {
        this.f11785e = false;
        this.f11787g = null;
    }

    public void setUpdatePriority(int i10) {
        if (this.f11785e) {
            this.f11788h = i10;
        }
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final Task<Integer> startUpdateFlow(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions) {
        return a(appUpdateInfo, appUpdateOptions) ? Tasks.a(-1) : Tasks.a((Exception) new InstallException(-6));
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, @AppUpdateType int i10, Activity activity, int i11) {
        return a(appUpdateInfo, AppUpdateOptions.newBuilder(i10).build());
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, @AppUpdateType int i10, IntentSenderForResultStarter intentSenderForResultStarter, int i11) {
        return a(appUpdateInfo, AppUpdateOptions.newBuilder(i10).build());
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions, int i10) {
        return a(appUpdateInfo, appUpdateOptions);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, IntentSenderForResultStarter intentSenderForResultStarter, AppUpdateOptions appUpdateOptions, int i10) {
        return a(appUpdateInfo, appUpdateOptions);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public void unregisterListener(InstallStateUpdatedListener installStateUpdatedListener) {
        this.f11781a.b(installStateUpdatedListener);
    }

    public void userAcceptsUpdate() {
        if (this.f11791k || this.f11792l) {
            this.f11791k = false;
            this.f11783c = 1;
            Integer num = 0;
            if (num.equals(this.f11794n)) {
                b();
            }
        }
    }

    public void userCancelsDownload() {
        int i10 = this.f11783c;
        if (i10 == 1 || i10 == 2) {
            this.f11783c = 6;
            Integer num = 0;
            if (num.equals(this.f11794n)) {
                b();
            }
            this.f11794n = null;
            this.f11792l = false;
            this.f11783c = 0;
        }
    }

    public void userRejectsUpdate() {
        if (this.f11791k || this.f11792l) {
            this.f11791k = false;
            this.f11792l = false;
            this.f11794n = null;
            this.f11783c = 0;
        }
    }
}
