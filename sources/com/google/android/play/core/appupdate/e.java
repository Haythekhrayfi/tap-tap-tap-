package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.listener.StateUpdatedListener;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;

/* JADX INFO: loaded from: classes2.dex */
final class e implements AppUpdateManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f11735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f11736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f11737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f11738d = new Handler(Looper.getMainLooper());

    public e(p pVar, a aVar, Context context) {
        this.f11735a = pVar;
        this.f11736b = aVar;
        this.f11737c = context;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final Task<Void> completeUpdate() {
        return this.f11735a.b(this.f11737c.getPackageName());
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final Task<AppUpdateInfo> getAppUpdateInfo() {
        return this.f11735a.a(this.f11737c.getPackageName());
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final synchronized void registerListener(InstallStateUpdatedListener installStateUpdatedListener) {
        this.f11736b.a((StateUpdatedListener) installStateUpdatedListener);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final Task<Integer> startUpdateFlow(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions) {
        PlayCoreDialogWrapperActivity.a(this.f11737c);
        if (!appUpdateInfo.isUpdateTypeAllowed(appUpdateOptions)) {
            return Tasks.a((Exception) new InstallException(-6));
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", appUpdateInfo.a(appUpdateOptions));
        com.google.android.play.core.tasks.i iVar = new com.google.android.play.core.tasks.i();
        intent.putExtra("result_receiver", new c(this.f11738d, iVar));
        activity.startActivity(intent);
        return iVar.a();
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, @AppUpdateType int i10, Activity activity, int i11) throws IntentSender.SendIntentException {
        return startUpdateFlowForResult(appUpdateInfo, new d(activity), AppUpdateOptions.defaultOptions(i10), i11);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, @AppUpdateType int i10, IntentSenderForResultStarter intentSenderForResultStarter, int i11) throws IntentSender.SendIntentException {
        return startUpdateFlowForResult(appUpdateInfo, intentSenderForResultStarter, AppUpdateOptions.defaultOptions(i10), i11);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions, int i10) throws IntentSender.SendIntentException {
        return startUpdateFlowForResult(appUpdateInfo, new d(activity), appUpdateOptions, i10);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, IntentSenderForResultStarter intentSenderForResultStarter, AppUpdateOptions appUpdateOptions, int i10) throws IntentSender.SendIntentException {
        if (!appUpdateInfo.isUpdateTypeAllowed(appUpdateOptions)) {
            return false;
        }
        intentSenderForResultStarter.startIntentSenderForResult(appUpdateInfo.a(appUpdateOptions).getIntentSender(), i10, null, 0, 0, 0, null);
        return true;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final synchronized void unregisterListener(InstallStateUpdatedListener installStateUpdatedListener) {
        this.f11736b.b(installStateUpdatedListener);
    }
}
