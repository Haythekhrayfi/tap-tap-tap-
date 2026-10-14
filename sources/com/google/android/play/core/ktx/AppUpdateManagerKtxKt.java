package com.google.android.play.core.ktx;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;
import com.google.android.play.core.tasks.OnFailureListener;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.google.android.play.core.tasks.Task;
import fd.j0;
import fd.z;
import hd.n;
import jc.w;
import mc.d;
import oc.c;
import oc.e;
import oc.h;
import uc.a;
import uc.p;
import uc.u;
import vc.b0;
import vc.j;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class AppUpdateManagerKtxKt {

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestAppUpdateInfo$1, reason: invalid class name */
    @e(c = "com.google.android.play.core.ktx.AppUpdateManagerKtxKt", f = "AppUpdateManagerKtx.kt", l = {199}, m = "requestAppUpdateInfo")
    public static final class AnonymousClass1 extends c {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(d dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppUpdateManagerKtxKt.requestAppUpdateInfo(null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1, reason: invalid class name and case insensitive filesystem */
    @e(c = "com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1", f = "AppUpdateManagerKtx.kt", l = {75}, m = "invokeSuspend")
    public static final class C14801 extends h implements p<hd.p<? super AppUpdateResult>, d<? super w>, Object> {
        public final /* synthetic */ AppUpdateManager $this_requestUpdateFlow;
        public Object L$0;
        public Object L$1;
        public int label;
        private hd.p p$;

        /* JADX INFO: renamed from: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends l implements a<w> {
            public final /* synthetic */ AppUpdatePassthroughListener $globalUpdateListener;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(AppUpdatePassthroughListener appUpdatePassthroughListener) {
                super(0);
                this.$globalUpdateListener = appUpdatePassthroughListener;
            }

            @Override // uc.a
            public /* bridge */ /* synthetic */ w invoke() {
                invoke2();
                return w.f31842a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C14801.this.$this_requestUpdateFlow.unregisterListener(this.$globalUpdateListener);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14801(AppUpdateManager appUpdateManager, d dVar) {
            super(2, dVar);
            this.$this_requestUpdateFlow = appUpdateManager;
        }

        @Override // oc.a
        public final d<w> create(Object obj, d<?> dVar) {
            j0.j(dVar, "completion");
            C14801 c14801 = new C14801(this.$this_requestUpdateFlow, dVar);
            c14801.p$ = (hd.p) obj;
            return c14801;
        }

        @Override // uc.p
        public final Object invoke(hd.p<? super AppUpdateResult> pVar, d<? super w> dVar) {
            return ((C14801) create(pVar, dVar)).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                h9.d.t(obj);
                final hd.p pVar = this.p$;
                final AppUpdatePassthroughListener appUpdatePassthroughListener = new AppUpdatePassthroughListener(new InstallStateUpdatedListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$1
                    @Override // com.google.android.play.core.listener.StateUpdatedListener
                    public final void onStateUpdate(InstallState installState) {
                        j0.j(installState, "installState");
                        if (installState.installStatus() == 11) {
                            TaskUtilsKt.tryOffer(pVar, new AppUpdateResult.Downloaded(this.this$0.$this_requestUpdateFlow));
                        } else {
                            TaskUtilsKt.tryOffer(pVar, new AppUpdateResult.InProgress(installState));
                        }
                    }
                }, new AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$2(pVar));
                this.$this_requestUpdateFlow.getAppUpdateInfo().addOnSuccessListener(new OnSuccessListener<AppUpdateInfo>() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt.requestUpdateFlow.1.1
                    @Override // com.google.android.play.core.tasks.OnSuccessListener
                    public final void onSuccess(AppUpdateInfo appUpdateInfo) {
                        hd.p pVar2;
                        Object downloaded;
                        int iUpdateAvailability = appUpdateInfo.updateAvailability();
                        if (iUpdateAvailability == 0) {
                            pVar.v(new InstallException(-2));
                            return;
                        }
                        if (iUpdateAvailability == 1) {
                            pVar2 = pVar;
                            downloaded = AppUpdateResult.NotAvailable.INSTANCE;
                        } else {
                            if (iUpdateAvailability != 2 && iUpdateAvailability != 3) {
                                return;
                            }
                            if (appUpdateInfo.installStatus() != 11) {
                                C14801.this.$this_requestUpdateFlow.registerListener(appUpdatePassthroughListener);
                                TaskUtilsKt.tryOffer(pVar, new AppUpdateResult.Available(C14801.this.$this_requestUpdateFlow, appUpdateInfo));
                                return;
                            } else {
                                pVar2 = pVar;
                                downloaded = new AppUpdateResult.Downloaded(C14801.this.$this_requestUpdateFlow);
                            }
                        }
                        TaskUtilsKt.tryOffer(pVar2, downloaded);
                        pVar.v(null);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt.requestUpdateFlow.1.2
                    @Override // com.google.android.play.core.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        pVar.v(exc);
                    }
                });
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(appUpdatePassthroughListener);
                this.L$0 = pVar;
                this.L$1 = appUpdatePassthroughListener;
                this.label = 1;
                if (n.a(pVar, anonymousClass3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return w.f31842a;
        }
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$startUpdateFlowForResult$1, reason: invalid class name and case insensitive filesystem */
    public static final /* synthetic */ class C14811 extends j implements u<IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle, w> {
        public C14811(Fragment fragment) {
            super(7, fragment);
        }

        @Override // vc.c
        public final String getName() {
            return "startIntentSenderForResult";
        }

        @Override // vc.c
        public final cd.d getOwner() {
            return b0.a(Fragment.class);
        }

        @Override // vc.c
        public final String getSignature() {
            return "startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V";
        }

        @Override // uc.u
        public /* bridge */ /* synthetic */ w invoke(IntentSender intentSender, Integer num, Intent intent, Integer num2, Integer num3, Integer num4, Bundle bundle) throws IntentSender.SendIntentException {
            invoke(intentSender, num.intValue(), intent, num2.intValue(), num3.intValue(), num4.intValue(), bundle);
            return w.f31842a;
        }

        public final void invoke(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
            ((Fragment) this.receiver).startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public static final long getBytesDownloaded(AppUpdateInfo appUpdateInfo) {
        j0.j(appUpdateInfo, "$this$bytesDownloaded");
        return appUpdateInfo.bytesDownloaded();
    }

    public static final long getBytesDownloaded(InstallState installState) {
        j0.j(installState, "$this$bytesDownloaded");
        return installState.bytesDownloaded();
    }

    public static final Integer getClientVersionStalenessDays(AppUpdateInfo appUpdateInfo) {
        j0.j(appUpdateInfo, "$this$clientVersionStalenessDays");
        return appUpdateInfo.clientVersionStalenessDays();
    }

    public static final boolean getHasTerminalStatus(InstallState installState) {
        j0.j(installState, "$this$hasTerminalStatus");
        int iInstallStatus = installState.installStatus();
        return iInstallStatus == 0 || iInstallStatus == 11 || iInstallStatus == 5 || iInstallStatus == 6;
    }

    @InstallErrorCode
    public static final int getInstallErrorCode(InstallState installState) {
        j0.j(installState, "$this$installErrorCode");
        return installState.installErrorCode();
    }

    @InstallStatus
    public static final int getInstallStatus(AppUpdateInfo appUpdateInfo) {
        j0.j(appUpdateInfo, "$this$installStatus");
        return appUpdateInfo.installStatus();
    }

    @InstallStatus
    public static final int getInstallStatus(InstallState installState) {
        j0.j(installState, "$this$installStatus");
        return installState.installStatus();
    }

    public static final String getPackageName(InstallState installState) {
        j0.j(installState, "$this$packageName");
        String strPackageName = installState.packageName();
        j0.e(strPackageName, "packageName()");
        return strPackageName;
    }

    public static final long getTotalBytesToDownload(AppUpdateInfo appUpdateInfo) {
        j0.j(appUpdateInfo, "$this$totalBytesToDownload");
        return appUpdateInfo.totalBytesToDownload();
    }

    public static final long getTotalBytesToDownload(InstallState installState) {
        j0.j(installState, "$this$totalBytesToDownload");
        return installState.totalBytesToDownload();
    }

    public static final int getUpdatePriority(AppUpdateInfo appUpdateInfo) {
        j0.j(appUpdateInfo, "$this$updatePriority");
        return appUpdateInfo.updatePriority();
    }

    public static final boolean isFlexibleUpdateAllowed(AppUpdateInfo appUpdateInfo) {
        j0.j(appUpdateInfo, "$this$isFlexibleUpdateAllowed");
        return appUpdateInfo.isUpdateTypeAllowed(0);
    }

    public static final boolean isImmediateUpdateAllowed(AppUpdateInfo appUpdateInfo) {
        j0.j(appUpdateInfo, "$this$isImmediateUpdateAllowed");
        return appUpdateInfo.isUpdateTypeAllowed(1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object requestAppUpdateInfo(AppUpdateManager appUpdateManager, d<? super AppUpdateInfo> dVar) {
        AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object objRunTask$default = anonymousClass1.result;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            h9.d.t(objRunTask$default);
            Task<AppUpdateInfo> appUpdateInfo = appUpdateManager.getAppUpdateInfo();
            j0.e(appUpdateInfo, "appUpdateInfo");
            anonymousClass1.L$0 = appUpdateManager;
            anonymousClass1.label = 1;
            objRunTask$default = TaskUtilsKt.runTask$default(appUpdateInfo, null, anonymousClass1, 2, null);
            if (objRunTask$default == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(objRunTask$default);
        }
        j0.e(objRunTask$default, "runTask(appUpdateInfo)");
        return objRunTask$default;
    }

    public static final Object requestCompleteUpdate(AppUpdateManager appUpdateManager, d<? super w> dVar) {
        Task<Void> taskCompleteUpdate = appUpdateManager.completeUpdate();
        j0.e(taskCompleteUpdate, "completeUpdate()");
        Object objRunTask$default = TaskUtilsKt.runTask$default(taskCompleteUpdate, null, dVar, 2, null);
        return objRunTask$default == nc.a.COROUTINE_SUSPENDED ? objRunTask$default : w.f31842a;
    }

    public static final id.d<AppUpdateResult> requestUpdateFlow(AppUpdateManager appUpdateManager) throws InstallException {
        j0.j(appUpdateManager, "$this$requestUpdateFlow");
        return z.e(z.f(new C14801(appUpdateManager, null)), -1, null, 2, null);
    }

    public static final boolean startUpdateFlowForResult(AppUpdateManager appUpdateManager, AppUpdateInfo appUpdateInfo, @AppUpdateType int i10, Fragment fragment, int i11) throws IntentSender.SendIntentException {
        j0.j(appUpdateManager, "$this$startUpdateFlowForResult");
        j0.j(appUpdateInfo, "appUpdateInfo");
        j0.j(fragment, "fragment");
        if (!appUpdateInfo.isUpdateTypeAllowed(i10)) {
            return false;
        }
        final C14811 c14811 = new C14811(fragment);
        return appUpdateManager.startUpdateFlowForResult(appUpdateInfo, i10, new IntentSenderForResultStarter() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$sam$com_google_android_play_core_common_IntentSenderForResultStarter$0
            @Override // com.google.android.play.core.common.IntentSenderForResultStarter
            public final /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i12, Intent intent, int i13, int i14, int i15, Bundle bundle) {
                j0.j(intentSender, "p0");
                j0.e(c14811.invoke(intentSender, Integer.valueOf(i12), intent, Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), bundle), "invoke(...)");
            }
        }, i11);
    }
}
