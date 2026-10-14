package com.google.android.play.core.ktx;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import fd.j0;
import jc.w;
import uc.l;

/* JADX INFO: loaded from: classes2.dex */
final class AppUpdatePassthroughListener implements InstallStateUpdatedListener {
    private final l<AppUpdatePassthroughListener, w> disposeAction;
    private final InstallStateUpdatedListener listener;

    /* JADX WARN: Multi-variable type inference failed */
    public AppUpdatePassthroughListener(InstallStateUpdatedListener installStateUpdatedListener, l<? super AppUpdatePassthroughListener, w> lVar) {
        j0.j(installStateUpdatedListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        j0.j(lVar, "disposeAction");
        this.listener = installStateUpdatedListener;
        this.disposeAction = lVar;
    }

    public final l<AppUpdatePassthroughListener, w> getDisposeAction() {
        return this.disposeAction;
    }

    public final InstallStateUpdatedListener getListener() {
        return this.listener;
    }

    @Override // com.google.android.play.core.listener.StateUpdatedListener
    public void onStateUpdate(InstallState installState) {
        j0.j(installState, "state");
        this.listener.onStateUpdate(installState);
        int iInstallStatus = installState.installStatus();
        if (iInstallStatus == 0 || iInstallStatus == 11 || iInstallStatus == 5 || iInstallStatus == 6) {
            this.disposeAction.invoke(this);
        }
    }
}
