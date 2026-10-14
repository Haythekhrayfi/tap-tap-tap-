package com.google.android.play.core.ktx;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.install.InstallState;
import fd.j0;
import jc.w;
import mc.d;
import nc.a;
import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AppUpdateResult {

    public static final class Available extends AppUpdateResult {
        private final AppUpdateManager appUpdateManager;
        private final AppUpdateInfo updateInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Available(AppUpdateManager appUpdateManager, AppUpdateInfo appUpdateInfo) {
            super(null);
            j0.j(appUpdateManager, "appUpdateManager");
            j0.j(appUpdateInfo, "updateInfo");
            this.appUpdateManager = appUpdateManager;
            this.updateInfo = appUpdateInfo;
        }

        public final AppUpdateInfo getUpdateInfo() {
            return this.updateInfo;
        }

        public final boolean startFlexibleUpdate(Activity activity, int i10) {
            j0.j(activity, "activity");
            return this.appUpdateManager.startUpdateFlowForResult(this.updateInfo, 0, activity, i10);
        }

        public final boolean startFlexibleUpdate(Fragment fragment, int i10) {
            j0.j(fragment, "fragment");
            return AppUpdateManagerKtxKt.startUpdateFlowForResult(this.appUpdateManager, this.updateInfo, 0, fragment, i10);
        }

        public final boolean startImmediateUpdate(Activity activity, int i10) {
            j0.j(activity, "activity");
            return this.appUpdateManager.startUpdateFlowForResult(this.updateInfo, 1, activity, i10);
        }

        public final boolean startImmediateUpdate(Fragment fragment, int i10) {
            j0.j(fragment, "fragment");
            return AppUpdateManagerKtxKt.startUpdateFlowForResult(this.appUpdateManager, this.updateInfo, 1, fragment, i10);
        }
    }

    public static final class Downloaded extends AppUpdateResult {
        private final AppUpdateManager appUpdateManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Downloaded(AppUpdateManager appUpdateManager) {
            super(null);
            j0.j(appUpdateManager, "appUpdateManager");
            this.appUpdateManager = appUpdateManager;
        }

        public final Object completeUpdate(d<? super w> dVar) {
            Object objRequestCompleteUpdate = AppUpdateManagerKtxKt.requestCompleteUpdate(this.appUpdateManager, dVar);
            return objRequestCompleteUpdate == a.COROUTINE_SUSPENDED ? objRequestCompleteUpdate : w.f31842a;
        }
    }

    public static final class InProgress extends AppUpdateResult {
        private final InstallState installState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InProgress(InstallState installState) {
            super(null);
            j0.j(installState, "installState");
            this.installState = installState;
        }

        public final InstallState getInstallState() {
            return this.installState;
        }
    }

    public static final class NotAvailable extends AppUpdateResult {
        public static final NotAvailable INSTANCE = new NotAvailable();

        private NotAvailable() {
            super(null);
        }
    }

    private AppUpdateResult() {
    }

    public /* synthetic */ AppUpdateResult(g gVar) {
        this();
    }
}
