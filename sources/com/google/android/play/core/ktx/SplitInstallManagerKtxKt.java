package com.google.android.play.core.ktx;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus;
import com.google.android.play.core.tasks.OnFailureListener;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.google.android.play.core.tasks.Task;
import fd.j0;
import fd.z;
import hd.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import jc.w;
import l0.f;
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
public final class SplitInstallManagerKtxKt {

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$SplitInstallStateUpdatedListener$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l implements uc.l<SplitInstallSessionState, w> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ w invoke(SplitInstallSessionState splitInstallSessionState) {
            invoke2(splitInstallSessionState);
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SplitInstallSessionState splitInstallSessionState) {
            j0.j(splitInstallSessionState, "it");
        }
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$SplitInstallStateUpdatedListener$2, reason: invalid class name */
    public static final class AnonymousClass2 extends l implements uc.l<SplitInstallSessionState, w> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ w invoke(SplitInstallSessionState splitInstallSessionState) {
            invoke2(splitInstallSessionState);
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SplitInstallSessionState splitInstallSessionState) {
            j0.j(splitInstallSessionState, "it");
        }
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$SplitInstallStateUpdatedListener$3, reason: invalid class name */
    public static final class AnonymousClass3 extends l implements uc.l<SplitInstallSessionState, w> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ w invoke(SplitInstallSessionState splitInstallSessionState) {
            invoke2(splitInstallSessionState);
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SplitInstallSessionState splitInstallSessionState) {
            j0.j(splitInstallSessionState, "it");
        }
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$SplitInstallStateUpdatedListener$4, reason: invalid class name */
    public static final class AnonymousClass4 extends l implements uc.l<SplitInstallSessionState, w> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ w invoke(SplitInstallSessionState splitInstallSessionState) {
            invoke2(splitInstallSessionState);
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SplitInstallSessionState splitInstallSessionState) {
            j0.j(splitInstallSessionState, "it");
        }
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$SplitInstallStateUpdatedListener$5, reason: invalid class name */
    public static final class AnonymousClass5 extends l implements uc.l<SplitInstallSessionState, w> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ w invoke(SplitInstallSessionState splitInstallSessionState) {
            invoke2(splitInstallSessionState);
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SplitInstallSessionState splitInstallSessionState) {
            j0.j(splitInstallSessionState, "it");
        }
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$SplitInstallStateUpdatedListener$6, reason: invalid class name */
    public static final class AnonymousClass6 extends l implements uc.l<SplitInstallSessionState, w> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ w invoke(SplitInstallSessionState splitInstallSessionState) {
            invoke2(splitInstallSessionState);
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SplitInstallSessionState splitInstallSessionState) {
            j0.j(splitInstallSessionState, "it");
        }
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$SplitInstallStateUpdatedListener$7, reason: invalid class name */
    public static final class AnonymousClass7 extends l implements uc.l<SplitInstallSessionState, w> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        public AnonymousClass7() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ w invoke(SplitInstallSessionState splitInstallSessionState) {
            invoke2(splitInstallSessionState);
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SplitInstallSessionState splitInstallSessionState) {
            j0.j(splitInstallSessionState, "it");
        }
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$SplitInstallStateUpdatedListener$8, reason: invalid class name */
    public static final class AnonymousClass8 extends l implements uc.l<SplitInstallSessionState, w> {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        public AnonymousClass8() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ w invoke(SplitInstallSessionState splitInstallSessionState) {
            invoke2(splitInstallSessionState);
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SplitInstallSessionState splitInstallSessionState) {
            j0.j(splitInstallSessionState, "it");
        }
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$SplitInstallStateUpdatedListener$9, reason: invalid class name */
    public static final class AnonymousClass9 extends l implements uc.l<SplitInstallSessionState, w> {
        public static final AnonymousClass9 INSTANCE = new AnonymousClass9();

        public AnonymousClass9() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ w invoke(SplitInstallSessionState splitInstallSessionState) {
            invoke2(splitInstallSessionState);
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SplitInstallSessionState splitInstallSessionState) {
            j0.j(splitInstallSessionState, "it");
        }
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$requestInstall$1, reason: invalid class name and case insensitive filesystem */
    @e(c = "com.google.android.play.core.ktx.SplitInstallManagerKtxKt", f = "SplitInstallManagerKtx.kt", l = {41}, m = "requestInstall")
    public static final class C14851 extends c {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C14851(d dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SplitInstallManagerKtxKt.requestInstall(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$requestProgressFlow$1, reason: invalid class name and case insensitive filesystem */
    @e(c = "com.google.android.play.core.ktx.SplitInstallManagerKtxKt$requestProgressFlow$1", f = "SplitInstallManagerKtx.kt", l = {78}, m = "invokeSuspend")
    public static final class C14861 extends h implements p<hd.p<? super SplitInstallSessionState>, d<? super w>, Object> {
        public final /* synthetic */ SplitInstallManager $this_requestProgressFlow;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        private hd.p p$;

        /* JADX INFO: renamed from: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$requestProgressFlow$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends l implements a<w> {
            public final /* synthetic */ SplitInstallStateUpdatedListener $globalSessionListener;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
                super(0);
                this.$globalSessionListener = splitInstallStateUpdatedListener;
            }

            @Override // uc.a
            public /* bridge */ /* synthetic */ w invoke() {
                invoke2();
                return w.f31842a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C14861.this.$this_requestProgressFlow.unregisterListener(this.$globalSessionListener);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14861(SplitInstallManager splitInstallManager, d dVar) {
            super(2, dVar);
            this.$this_requestProgressFlow = splitInstallManager;
        }

        @Override // oc.a
        public final d<w> create(Object obj, d<?> dVar) {
            j0.j(dVar, "completion");
            C14861 c14861 = new C14861(this.$this_requestProgressFlow, dVar);
            c14861.p$ = (hd.p) obj;
            return c14861;
        }

        @Override // uc.p
        public final Object invoke(hd.p<? super SplitInstallSessionState> pVar, d<? super w> dVar) {
            return ((C14861) create(pVar, dVar)).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                h9.d.t(obj);
                final hd.p pVar = this.p$;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                SplitInstallStateUpdatedListener splitInstallStateUpdatedListener = new SplitInstallStateUpdatedListener() { // from class: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$requestProgressFlow$1$globalSessionListener$1
                    @Override // com.google.android.play.core.listener.StateUpdatedListener
                    public final void onStateUpdate(SplitInstallSessionState splitInstallSessionState) {
                        j0.j(splitInstallSessionState, "state");
                        linkedHashSet.add(Integer.valueOf(splitInstallSessionState.sessionId()));
                        TaskUtilsKt.tryOffer(pVar, splitInstallSessionState);
                    }
                };
                this.$this_requestProgressFlow.registerListener(splitInstallStateUpdatedListener);
                this.$this_requestProgressFlow.getSessionStates().addOnSuccessListener(new OnSuccessListener<List<SplitInstallSessionState>>() { // from class: com.google.android.play.core.ktx.SplitInstallManagerKtxKt.requestProgressFlow.1.1
                    @Override // com.google.android.play.core.tasks.OnSuccessListener
                    public /* bridge */ /* synthetic */ void onSuccess(List<SplitInstallSessionState> list) {
                        onSuccess2((List<? extends SplitInstallSessionState>) list);
                    }

                    /* JADX INFO: renamed from: onSuccess, reason: avoid collision after fix types in other method */
                    public final void onSuccess2(List<? extends SplitInstallSessionState> list) {
                        j0.j(list, "sessionList");
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (!linkedHashSet.contains(Integer.valueOf(((SplitInstallSessionState) obj2).sessionId()))) {
                                arrayList.add(obj2);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            TaskUtilsKt.tryOffer(pVar, (SplitInstallSessionState) it.next());
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.SplitInstallManagerKtxKt.requestProgressFlow.1.2
                    @Override // com.google.android.play.core.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        pVar.v(exc);
                    }
                });
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(splitInstallStateUpdatedListener);
                this.L$0 = pVar;
                this.L$1 = linkedHashSet;
                this.L$2 = splitInstallStateUpdatedListener;
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

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$requestSessionState$1, reason: invalid class name and case insensitive filesystem */
    @e(c = "com.google.android.play.core.ktx.SplitInstallManagerKtxKt", f = "SplitInstallManagerKtx.kt", l = {115}, m = "requestSessionState")
    public static final class C14871 extends c {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C14871(d dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SplitInstallManagerKtxKt.requestSessionState(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$requestSessionStates$1, reason: invalid class name and case insensitive filesystem */
    @e(c = "com.google.android.play.core.ktx.SplitInstallManagerKtxKt", f = "SplitInstallManagerKtx.kt", l = {89}, m = "requestSessionStates")
    public static final class C14881 extends c {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C14881(d dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SplitInstallManagerKtxKt.requestSessionStates(null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$startConfirmationDialogForResult$1, reason: invalid class name and case insensitive filesystem */
    public static final /* synthetic */ class C14891 extends j implements u<IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle, w> {
        public C14891(Fragment fragment) {
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

    public static final SplitInstallStateUpdatedListener SplitInstallStateUpdatedListener(final uc.l<? super SplitInstallSessionState, w> lVar, final uc.l<? super SplitInstallSessionState, w> lVar2, final uc.l<? super SplitInstallSessionState, w> lVar3, final uc.l<? super SplitInstallSessionState, w> lVar4, final uc.l<? super SplitInstallSessionState, w> lVar5, final uc.l<? super SplitInstallSessionState, w> lVar6, final uc.l<? super SplitInstallSessionState, w> lVar7, final uc.l<? super SplitInstallSessionState, w> lVar8, final uc.l<? super SplitInstallSessionState, w> lVar9, final uc.l<? super SplitInstallSessionState, w> lVar10, final uc.l<? super SplitInstallSessionState, w> lVar11) {
        j0.j(lVar, "onRequiresConfirmation");
        j0.j(lVar2, "onInstalled");
        j0.j(lVar3, "onFailed");
        j0.j(lVar4, "onPending");
        j0.j(lVar5, "onDownloaded");
        j0.j(lVar6, "onDownloading");
        j0.j(lVar7, "onInstalling");
        j0.j(lVar8, "onCanceling");
        j0.j(lVar9, "onCanceled");
        j0.j(lVar10, "onNonTerminalStatus");
        j0.j(lVar11, "onTerminalStatus");
        return new SplitInstallStateUpdatedListener() { // from class: com.google.android.play.core.ktx.SplitInstallManagerKtxKt.SplitInstallStateUpdatedListener.10
            /* JADX WARN: Code duplicated, block: B:17:0x0030  */
            /* JADX WARN: Code duplicated, block: B:18:0x0033  */
            @Override // com.google.android.play.core.listener.StateUpdatedListener
            public final void onStateUpdate(SplitInstallSessionState splitInstallSessionState) {
                uc.l lVar12;
                uc.l lVar13;
                j0.j(splitInstallSessionState, "state");
                switch (splitInstallSessionState.status()) {
                    case 0:
                    case 6:
                        lVar13 = lVar3;
                        break;
                    case 1:
                        lVar13 = lVar4;
                        break;
                    case 2:
                        lVar13 = lVar6;
                        break;
                    case 3:
                        lVar13 = lVar5;
                        break;
                    case 4:
                        lVar13 = lVar7;
                        break;
                    case 5:
                        lVar13 = lVar2;
                        break;
                    case 7:
                        lVar13 = lVar9;
                        break;
                    case 8:
                        lVar13 = lVar;
                        break;
                    case 9:
                        lVar13 = lVar8;
                        break;
                    default:
                        if (splitInstallSessionState.hasTerminalStatus()) {
                            lVar12 = lVar11;
                        } else {
                            lVar12 = lVar10;
                        }
                        lVar12.invoke(splitInstallSessionState);
                }
                lVar13.invoke(splitInstallSessionState);
                if (splitInstallSessionState.hasTerminalStatus()) {
                    lVar12 = lVar11;
                } else {
                    lVar12 = lVar10;
                }
                lVar12.invoke(splitInstallSessionState);
            }
        };
    }

    private static final SplitInstallRequest buildSplitInstallRequest(List<String> list, List<String> list2) {
        SplitInstallRequest.Builder builderNewBuilder = SplitInstallRequest.newBuilder();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            builderNewBuilder.addModule((String) it.next());
        }
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            builderNewBuilder.addLanguage(f.b((String) it2.next()).c(0));
        }
        SplitInstallRequest splitInstallRequestBuild = builderNewBuilder.build();
        j0.e(splitInstallRequestBuild, "SplitInstallRequest.newB…lang).get(0)) }\n}.build()");
        return splitInstallRequestBuild;
    }

    public static final long getBytesDownloaded(SplitInstallSessionState splitInstallSessionState) {
        j0.j(splitInstallSessionState, "$this$bytesDownloaded");
        return splitInstallSessionState.bytesDownloaded();
    }

    @SplitInstallErrorCode
    public static final int getErrorCode(SplitInstallSessionState splitInstallSessionState) {
        j0.j(splitInstallSessionState, "$this$errorCode");
        return splitInstallSessionState.errorCode();
    }

    public static final boolean getHasTerminalStatus(SplitInstallSessionState splitInstallSessionState) {
        j0.j(splitInstallSessionState, "$this$hasTerminalStatus");
        return splitInstallSessionState.hasTerminalStatus();
    }

    public static final List<String> getLanguages(SplitInstallSessionState splitInstallSessionState) {
        j0.j(splitInstallSessionState, "$this$languages");
        List<String> listLanguages = splitInstallSessionState.languages();
        j0.e(listLanguages, "languages()");
        return listLanguages;
    }

    public static final List<String> getModuleNames(SplitInstallSessionState splitInstallSessionState) {
        j0.j(splitInstallSessionState, "$this$moduleNames");
        List<String> listModuleNames = splitInstallSessionState.moduleNames();
        j0.e(listModuleNames, "moduleNames()");
        return listModuleNames;
    }

    public static final int getSessionId(SplitInstallSessionState splitInstallSessionState) {
        j0.j(splitInstallSessionState, "$this$sessionId");
        return splitInstallSessionState.sessionId();
    }

    @SplitInstallSessionStatus
    public static final int getStatus(SplitInstallSessionState splitInstallSessionState) {
        j0.j(splitInstallSessionState, "$this$status");
        return splitInstallSessionState.status();
    }

    public static final long getTotalBytesToDownload(SplitInstallSessionState splitInstallSessionState) {
        j0.j(splitInstallSessionState, "$this$totalBytesToDownload");
        return splitInstallSessionState.totalBytesToDownload();
    }

    public static final Object requestCancelInstall(SplitInstallManager splitInstallManager, int i10, d<? super w> dVar) {
        Task<Void> taskCancelInstall = splitInstallManager.cancelInstall(i10);
        j0.e(taskCancelInstall, "cancelInstall(sessionId)");
        Object objRunTask$default = TaskUtilsKt.runTask$default(taskCancelInstall, null, dVar, 2, null);
        return objRunTask$default == nc.a.COROUTINE_SUSPENDED ? objRunTask$default : w.f31842a;
    }

    public static final Object requestDeferredInstall(SplitInstallManager splitInstallManager, List<String> list, d<? super w> dVar) {
        Task<Void> taskDeferredInstall = splitInstallManager.deferredInstall(list);
        j0.e(taskDeferredInstall, "deferredInstall(moduleNames)");
        Object objRunTask$default = TaskUtilsKt.runTask$default(taskDeferredInstall, null, dVar, 2, null);
        return objRunTask$default == nc.a.COROUTINE_SUSPENDED ? objRunTask$default : w.f31842a;
    }

    public static final Object requestDeferredLanguageInstall(SplitInstallManager splitInstallManager, List<Locale> list, d<? super w> dVar) {
        Task<Void> taskDeferredLanguageInstall = splitInstallManager.deferredLanguageInstall(list);
        j0.e(taskDeferredLanguageInstall, "deferredLanguageInstall(languages)");
        Object objRunTask$default = TaskUtilsKt.runTask$default(taskDeferredLanguageInstall, null, dVar, 2, null);
        return objRunTask$default == nc.a.COROUTINE_SUSPENDED ? objRunTask$default : w.f31842a;
    }

    public static final Object requestDeferredLanguageUninstall(SplitInstallManager splitInstallManager, List<Locale> list, d<? super w> dVar) {
        Task<Void> taskDeferredLanguageUninstall = splitInstallManager.deferredLanguageUninstall(list);
        j0.e(taskDeferredLanguageUninstall, "deferredLanguageUninstall(languages)");
        Object objRunTask$default = TaskUtilsKt.runTask$default(taskDeferredLanguageUninstall, null, dVar, 2, null);
        return objRunTask$default == nc.a.COROUTINE_SUSPENDED ? objRunTask$default : w.f31842a;
    }

    public static final Object requestDeferredUninstall(SplitInstallManager splitInstallManager, List<String> list, d<? super w> dVar) {
        Task<Void> taskDeferredInstall = splitInstallManager.deferredInstall(list);
        j0.e(taskDeferredInstall, "deferredInstall(moduleNames)");
        Object objRunTask$default = TaskUtilsKt.runTask$default(taskDeferredInstall, null, dVar, 2, null);
        return objRunTask$default == nc.a.COROUTINE_SUSPENDED ? objRunTask$default : w.f31842a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object requestInstall(SplitInstallManager splitInstallManager, List<String> list, List<String> list2, d<? super Integer> dVar) {
        C14851 c14851;
        if (dVar instanceof C14851) {
            c14851 = (C14851) dVar;
            int i10 = c14851.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c14851.label = i10 - Integer.MIN_VALUE;
            } else {
                c14851 = new C14851(dVar);
            }
        } else {
            c14851 = new C14851(dVar);
        }
        Object objRunTask$default = c14851.result;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = c14851.label;
        if (i11 == 0) {
            h9.d.t(objRunTask$default);
            Task<Integer> taskStartInstall = splitInstallManager.startInstall(buildSplitInstallRequest(list, list2));
            j0.e(taskStartInstall, "startInstall(buildSplitI…uest(modules, languages))");
            c14851.L$0 = splitInstallManager;
            c14851.L$1 = list;
            c14851.L$2 = list2;
            c14851.label = 1;
            objRunTask$default = TaskUtilsKt.runTask$default(taskStartInstall, null, c14851, 2, null);
            if (objRunTask$default == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(objRunTask$default);
        }
        j0.e(objRunTask$default, "runTask(startInstall(bui…est(modules, languages)))");
        return objRunTask$default;
    }

    public static /* synthetic */ Object requestInstall$default(SplitInstallManager splitInstallManager, List list, List list2, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = kc.w.f32009c;
        }
        if ((i10 & 2) != 0) {
            list2 = kc.w.f32009c;
        }
        return requestInstall(splitInstallManager, list, list2, dVar);
    }

    public static final id.d<SplitInstallSessionState> requestProgressFlow(SplitInstallManager splitInstallManager) {
        j0.j(splitInstallManager, "$this$requestProgressFlow");
        return z.e(z.f(new C14861(splitInstallManager, null)), Integer.MAX_VALUE, null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object requestSessionState(SplitInstallManager splitInstallManager, int i10, d<? super SplitInstallSessionState> dVar) {
        C14871 c14871;
        if (dVar instanceof C14871) {
            c14871 = (C14871) dVar;
            int i11 = c14871.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c14871.label = i11 - Integer.MIN_VALUE;
            } else {
                c14871 = new C14871(dVar);
            }
        } else {
            c14871 = new C14871(dVar);
        }
        Object objRunTask$default = c14871.result;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i12 = c14871.label;
        if (i12 == 0) {
            h9.d.t(objRunTask$default);
            Task<SplitInstallSessionState> sessionState = splitInstallManager.getSessionState(i10);
            j0.e(sessionState, "getSessionState(sessionId)");
            c14871.L$0 = splitInstallManager;
            c14871.I$0 = i10;
            c14871.label = 1;
            objRunTask$default = TaskUtilsKt.runTask$default(sessionState, null, c14871, 2, null);
            if (objRunTask$default == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(objRunTask$default);
        }
        j0.e(objRunTask$default, "runTask(getSessionState(sessionId))");
        return objRunTask$default;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object requestSessionStates(SplitInstallManager splitInstallManager, d<? super List<? extends SplitInstallSessionState>> dVar) {
        C14881 c14881;
        if (dVar instanceof C14881) {
            c14881 = (C14881) dVar;
            int i10 = c14881.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c14881.label = i10 - Integer.MIN_VALUE;
            } else {
                c14881 = new C14881(dVar);
            }
        } else {
            c14881 = new C14881(dVar);
        }
        Object objRunTask$default = c14881.result;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = c14881.label;
        if (i11 == 0) {
            h9.d.t(objRunTask$default);
            Task<List<SplitInstallSessionState>> sessionStates = splitInstallManager.getSessionStates();
            j0.e(sessionStates, "sessionStates");
            c14881.L$0 = splitInstallManager;
            c14881.label = 1;
            objRunTask$default = TaskUtilsKt.runTask$default(sessionStates, null, c14881, 2, null);
            if (objRunTask$default == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(objRunTask$default);
        }
        j0.e(objRunTask$default, "runTask(sessionStates)");
        return objRunTask$default;
    }

    public static final boolean startConfirmationDialogForResult(SplitInstallManager splitInstallManager, SplitInstallSessionState splitInstallSessionState, Fragment fragment, int i10) {
        j0.j(splitInstallManager, "$this$startConfirmationDialogForResult");
        j0.j(splitInstallSessionState, "sessionState");
        j0.j(fragment, "fragment");
        final C14891 c14891 = new C14891(fragment);
        return splitInstallManager.startConfirmationDialogForResult(splitInstallSessionState, new IntentSenderForResultStarter() { // from class: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$sam$com_google_android_play_core_common_IntentSenderForResultStarter$0
            @Override // com.google.android.play.core.common.IntentSenderForResultStarter
            public final /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) {
                j0.j(intentSender, "p0");
                j0.e(c14891.invoke(intentSender, Integer.valueOf(i11), intent, Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), bundle), "invoke(...)");
            }
        }, i10);
    }
}
