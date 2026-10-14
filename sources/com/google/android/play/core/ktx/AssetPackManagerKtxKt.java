package com.google.android.play.core.ktx;

import android.app.Activity;
import com.google.android.play.core.assetpacks.AssetLocation;
import com.google.android.play.core.assetpacks.AssetPackLocation;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import com.google.android.play.core.assetpacks.AssetPackStates;
import com.google.android.play.core.assetpacks.model.AssetPackErrorCode;
import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import com.google.android.play.core.assetpacks.model.AssetPackStorageMethod;
import com.google.android.play.core.tasks.OnFailureListener;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.google.android.play.core.tasks.Task;
import fd.j0;
import fd.z;
import hd.n;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jc.w;
import mc.d;
import oc.c;
import oc.e;
import oc.h;
import uc.a;
import uc.p;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class AssetPackManagerKtxKt {

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestCellularDataConfirmation$1, reason: invalid class name */
    @e(c = "com.google.android.play.core.ktx.AssetPackManagerKtxKt", f = "AssetPackManagerKtx.kt", l = {97}, m = "requestCellularDataConfirmation")
    public static final class AnonymousClass1 extends c {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(d dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssetPackManagerKtxKt.requestCellularDataConfirmation(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestFetch$1, reason: invalid class name and case insensitive filesystem */
    @e(c = "com.google.android.play.core.ktx.AssetPackManagerKtxKt", f = "AssetPackManagerKtx.kt", l = {32}, m = "requestFetch")
    public static final class C14821 extends c {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C14821(d dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssetPackManagerKtxKt.requestFetch(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestPackStates$1, reason: invalid class name and case insensitive filesystem */
    @e(c = "com.google.android.play.core.ktx.AssetPackManagerKtxKt", f = "AssetPackManagerKtx.kt", l = {79}, m = "requestPackStates")
    public static final class C14831 extends c {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C14831(d dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssetPackManagerKtxKt.requestPackStates(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestProgressFlow$1, reason: invalid class name and case insensitive filesystem */
    @e(c = "com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestProgressFlow$1", f = "AssetPackManagerKtx.kt", l = {67}, m = "invokeSuspend")
    public static final class C14841 extends h implements p<hd.p<? super AssetPackState>, d<? super w>, Object> {
        public final /* synthetic */ List $packs;
        public final /* synthetic */ AssetPackManager $this_requestProgressFlow;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        private hd.p p$;

        /* JADX INFO: renamed from: com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestProgressFlow$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends l implements a<w> {
            public final /* synthetic */ AssetPackStateUpdateListener $globalSessionListener;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(AssetPackStateUpdateListener assetPackStateUpdateListener) {
                super(0);
                this.$globalSessionListener = assetPackStateUpdateListener;
            }

            @Override // uc.a
            public /* bridge */ /* synthetic */ w invoke() {
                invoke2();
                return w.f31842a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C14841.this.$this_requestProgressFlow.unregisterListener(this.$globalSessionListener);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14841(AssetPackManager assetPackManager, List list, d dVar) {
            super(2, dVar);
            this.$this_requestProgressFlow = assetPackManager;
            this.$packs = list;
        }

        @Override // oc.a
        public final d<w> create(Object obj, d<?> dVar) {
            j0.j(dVar, "completion");
            C14841 c14841 = new C14841(this.$this_requestProgressFlow, this.$packs, dVar);
            c14841.p$ = (hd.p) obj;
            return c14841;
        }

        @Override // uc.p
        public final Object invoke(hd.p<? super AssetPackState> pVar, d<? super w> dVar) {
            return ((C14841) create(pVar, dVar)).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                h9.d.t(obj);
                final hd.p pVar = this.p$;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                AssetPackStateUpdateListener assetPackStateUpdateListener = new AssetPackStateUpdateListener() { // from class: com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestProgressFlow$1$globalSessionListener$1
                    @Override // com.google.android.play.core.listener.StateUpdatedListener
                    public final void onStateUpdate(AssetPackState assetPackState) {
                        j0.j(assetPackState, "state");
                        Set set = linkedHashSet;
                        String strName = assetPackState.name();
                        j0.e(strName, "name()");
                        set.add(strName);
                        TaskUtilsKt.tryOffer(pVar, assetPackState);
                    }
                };
                this.$this_requestProgressFlow.registerListener(assetPackStateUpdateListener);
                this.$this_requestProgressFlow.getPackStates(this.$packs).addOnSuccessListener(new OnSuccessListener<AssetPackStates>() { // from class: com.google.android.play.core.ktx.AssetPackManagerKtxKt.requestProgressFlow.1.1
                    @Override // com.google.android.play.core.tasks.OnSuccessListener
                    public final void onSuccess(AssetPackStates assetPackStates) {
                        j0.j(assetPackStates, "states");
                        List list = C14841.this.$packs;
                        ArrayList<String> arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (!linkedHashSet.contains((String) obj2)) {
                                arrayList.add(obj2);
                            }
                        }
                        for (String str : arrayList) {
                            hd.p pVar2 = pVar;
                            Map<String, AssetPackState> mapPackStates = assetPackStates.packStates();
                            j0.e(mapPackStates, "packStates()");
                            AssetPackState assetPackState = mapPackStates.get(str);
                            if (assetPackState == null) {
                                j0.q();
                                throw null;
                            }
                            TaskUtilsKt.tryOffer(pVar2, assetPackState);
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.AssetPackManagerKtxKt.requestProgressFlow.1.2
                    @Override // com.google.android.play.core.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        pVar.v(exc);
                    }
                });
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(assetPackStateUpdateListener);
                this.L$0 = pVar;
                this.L$1 = linkedHashSet;
                this.L$2 = assetPackStateUpdateListener;
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

    public static final String getAssetsPath(AssetPackLocation assetPackLocation) {
        j0.j(assetPackLocation, "$this$assetsPath");
        return assetPackLocation.assetsPath();
    }

    public static final long getBytesDownloaded(AssetPackState assetPackState) {
        j0.j(assetPackState, "$this$bytesDownloaded");
        return assetPackState.bytesDownloaded();
    }

    @AssetPackErrorCode
    public static final int getErrorCode(AssetPackState assetPackState) {
        j0.j(assetPackState, "$this$errorCode");
        return assetPackState.errorCode();
    }

    public static final String getName(AssetPackState assetPackState) {
        j0.j(assetPackState, "$this$name");
        String strName = assetPackState.name();
        j0.e(strName, "name()");
        return strName;
    }

    public static final long getOffset(AssetLocation assetLocation) {
        j0.j(assetLocation, "$this$offset");
        return assetLocation.offset();
    }

    public static final Map<String, AssetPackState> getPackStates(AssetPackStates assetPackStates) {
        j0.j(assetPackStates, "$this$packStates");
        Map<String, AssetPackState> mapPackStates = assetPackStates.packStates();
        j0.e(mapPackStates, "packStates()");
        return mapPackStates;
    }

    @AssetPackStorageMethod
    public static final int getPackStorageMethod(AssetPackLocation assetPackLocation) {
        j0.j(assetPackLocation, "$this$packStorageMethod");
        return assetPackLocation.packStorageMethod();
    }

    public static final String getPath(AssetLocation assetLocation) {
        j0.j(assetLocation, "$this$path");
        String strPath = assetLocation.path();
        j0.e(strPath, "path()");
        return strPath;
    }

    public static final String getPath(AssetPackLocation assetPackLocation) {
        j0.j(assetPackLocation, "$this$path");
        return assetPackLocation.path();
    }

    public static final long getSize(AssetLocation assetLocation) {
        j0.j(assetLocation, "$this$size");
        return assetLocation.size();
    }

    @AssetPackStatus
    public static final int getStatus(AssetPackState assetPackState) {
        j0.j(assetPackState, "$this$status");
        return assetPackState.status();
    }

    public static final long getTotalBytes(AssetPackStates assetPackStates) {
        j0.j(assetPackStates, "$this$totalBytes");
        return assetPackStates.totalBytes();
    }

    public static final long getTotalBytesToDownload(AssetPackState assetPackState) {
        j0.j(assetPackState, "$this$totalBytesToDownload");
        return assetPackState.totalBytesToDownload();
    }

    public static final int getTransferProgressPercentage(AssetPackState assetPackState) {
        j0.j(assetPackState, "$this$transferProgressPercentage");
        return assetPackState.transferProgressPercentage();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object requestCellularDataConfirmation(AssetPackManager assetPackManager, Activity activity, d<? super Integer> dVar) {
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
            Task<Integer> taskShowCellularDataConfirmation = assetPackManager.showCellularDataConfirmation(activity);
            j0.e(taskShowCellularDataConfirmation, "showCellularDataConfirmation(activity)");
            anonymousClass1.L$0 = assetPackManager;
            anonymousClass1.L$1 = activity;
            anonymousClass1.label = 1;
            objRunTask$default = TaskUtilsKt.runTask$default(taskShowCellularDataConfirmation, null, anonymousClass1, 2, null);
            if (objRunTask$default == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(objRunTask$default);
        }
        j0.e(objRunTask$default, "runTask(showCellularDataConfirmation(activity))");
        return objRunTask$default;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object requestFetch(AssetPackManager assetPackManager, List<String> list, d<? super AssetPackStates> dVar) {
        C14821 c14821;
        if (dVar instanceof C14821) {
            c14821 = (C14821) dVar;
            int i10 = c14821.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c14821.label = i10 - Integer.MIN_VALUE;
            } else {
                c14821 = new C14821(dVar);
            }
        } else {
            c14821 = new C14821(dVar);
        }
        Object objRunTask$default = c14821.result;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = c14821.label;
        if (i11 == 0) {
            h9.d.t(objRunTask$default);
            Task<AssetPackStates> taskFetch = assetPackManager.fetch(list);
            j0.e(taskFetch, "fetch(packs)");
            c14821.L$0 = assetPackManager;
            c14821.L$1 = list;
            c14821.label = 1;
            objRunTask$default = TaskUtilsKt.runTask$default(taskFetch, null, c14821, 2, null);
            if (objRunTask$default == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(objRunTask$default);
        }
        j0.e(objRunTask$default, "runTask(fetch(packs))");
        return objRunTask$default;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object requestPackStates(AssetPackManager assetPackManager, List<String> list, d<? super AssetPackStates> dVar) {
        C14831 c14831;
        if (dVar instanceof C14831) {
            c14831 = (C14831) dVar;
            int i10 = c14831.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c14831.label = i10 - Integer.MIN_VALUE;
            } else {
                c14831 = new C14831(dVar);
            }
        } else {
            c14831 = new C14831(dVar);
        }
        Object objRunTask$default = c14831.result;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = c14831.label;
        if (i11 == 0) {
            h9.d.t(objRunTask$default);
            Task<AssetPackStates> packStates = assetPackManager.getPackStates(list);
            j0.e(packStates, "task");
            c14831.L$0 = assetPackManager;
            c14831.L$1 = list;
            c14831.L$2 = packStates;
            c14831.label = 1;
            objRunTask$default = TaskUtilsKt.runTask$default(packStates, null, c14831, 2, null);
            if (objRunTask$default == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(objRunTask$default);
        }
        j0.e(objRunTask$default, "runTask(task)");
        return objRunTask$default;
    }

    public static final id.d<AssetPackState> requestProgressFlow(AssetPackManager assetPackManager, List<String> list) {
        j0.j(assetPackManager, "$this$requestProgressFlow");
        j0.j(list, "packs");
        return z.e(z.f(new C14841(assetPackManager, list, null)), Integer.MAX_VALUE, null, 2, null);
    }

    public static final Object requestRemovePack(AssetPackManager assetPackManager, String str, d<? super w> dVar) {
        Task<Void> taskRemovePack = assetPackManager.removePack(str);
        j0.e(taskRemovePack, "removePack(packName)");
        Object objRunTask$default = TaskUtilsKt.runTask$default(taskRemovePack, null, dVar, 2, null);
        return objRunTask$default == nc.a.COROUTINE_SUSPENDED ? objRunTask$default : w.f31842a;
    }
}
