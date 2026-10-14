package com.google.android.play.core.assetpacks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.listener.StateUpdatedListener;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class j implements AssetPackManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.internal.af f12189a = new com.google.android.play.core.internal.af("AssetPackManager");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bb f12190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.core.internal.cj<w> f12191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final aw f12192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.core.splitinstall.p f12193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final cp f12194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final bz f12195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final bn f12196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.play.core.internal.cj<Executor> f12197i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Handler f12198j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f12199k;

    public j(bb bbVar, com.google.android.play.core.internal.cj<w> cjVar, aw awVar, com.google.android.play.core.splitinstall.p pVar, cp cpVar, bz bzVar, bn bnVar, com.google.android.play.core.internal.cj<Executor> cjVar2) {
        this.f12190b = bbVar;
        this.f12191c = cjVar;
        this.f12192d = awVar;
        this.f12193e = pVar;
        this.f12194f = cpVar;
        this.f12195g = bzVar;
        this.f12196h = bnVar;
        this.f12197i = cjVar2;
    }

    private final void c() {
        this.f12197i.a().execute(new Runnable(this) { // from class: com.google.android.play.core.assetpacks.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final j f12183a;

            {
                this.f12183a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12183a.b();
            }
        });
    }

    private final void d() {
        this.f12197i.a().execute(new f(this));
        this.f12199k = true;
    }

    @AssetPackStatus
    public final int a(@AssetPackStatus int i10, String str) {
        if (!this.f12190b.a(str) && i10 == 4) {
            return 8;
        }
        if (!this.f12190b.a(str) || i10 == 4) {
            return i10;
        }
        return 4;
    }

    public final /* synthetic */ void a() {
        this.f12190b.d();
        this.f12190b.c();
        this.f12190b.e();
    }

    public final /* synthetic */ void a(String str, com.google.android.play.core.tasks.i iVar) {
        if (!this.f12190b.d(str)) {
            iVar.a((Exception) new IOException(String.format("Failed to remove pack %s.", str)));
        } else {
            iVar.a((Object) null);
            this.f12191c.a().a(str);
        }
    }

    public final void a(boolean z10) {
        boolean zB = this.f12192d.b();
        this.f12192d.a(z10);
        if (!z10 || zB) {
            return;
        }
        c();
    }

    public final /* synthetic */ void b() {
        Task<List<String>> taskA = this.f12191c.a().a(this.f12190b.b());
        Executor executorA = this.f12197i.a();
        bb bbVar = this.f12190b;
        Objects.requireNonNull(bbVar);
        taskA.addOnSuccessListener(executorA, g.a(bbVar)).addOnFailureListener(this.f12197i.a(), h.f12186a);
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final AssetPackStates cancel(List<String> list) {
        Map<String, Integer> mapA = this.f12194f.a(list);
        HashMap map = new HashMap();
        for (String str : list) {
            Integer num = mapA.get(str);
            map.put(str, AssetPackState.a(str, num == null ? 0 : num.intValue(), 0, 0L, 0L, 0.0d));
        }
        this.f12191c.a().a(list);
        return AssetPackStates.a(0L, map);
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final void clearListeners() {
        this.f12192d.a();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final Task<AssetPackStates> fetch(List<String> list) {
        Map<String, Long> mapB = this.f12190b.b();
        ArrayList arrayList = new ArrayList(list);
        arrayList.removeAll(mapB.keySet());
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.removeAll(arrayList);
        if (!arrayList.isEmpty()) {
            return this.f12191c.a().a(arrayList2, arrayList, mapB);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("error_code", 0);
        for (String str : list) {
            bundle.putInt(com.google.android.play.core.internal.h.a("status", str), 4);
            bundle.putInt(com.google.android.play.core.internal.h.a("error_code", str), 0);
            bundle.putLong(com.google.android.play.core.internal.h.a("total_bytes_to_download", str), 0L);
            bundle.putLong(com.google.android.play.core.internal.h.a("bytes_downloaded", str), 0L);
        }
        bundle.putStringArrayList("pack_names", new ArrayList<>(list));
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        return Tasks.a(AssetPackStates.a(bundle, this.f12195g));
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final AssetLocation getAssetLocation(String str, String str2) {
        AssetPackLocation assetPackLocationB;
        if (!this.f12199k) {
            this.f12197i.a().execute(new f(this));
            this.f12199k = true;
        }
        if (this.f12190b.a(str)) {
            try {
                assetPackLocationB = this.f12190b.b(str);
            } catch (IOException unused) {
            }
        } else {
            assetPackLocationB = this.f12193e.a().contains(str) ? AssetPackLocation.a() : null;
        }
        if (assetPackLocationB == null) {
            return null;
        }
        if (assetPackLocationB.packStorageMethod() == 1) {
            return this.f12190b.a(str, str2);
        }
        if (assetPackLocationB.packStorageMethod() == 0) {
            return this.f12190b.a(str, str2, assetPackLocationB);
        }
        f12189a.a("The asset %s is not present in Asset Pack %s", str2, str);
        return null;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final AssetPackLocation getPackLocation(String str) {
        if (!this.f12199k) {
            d();
        }
        if (this.f12190b.a(str)) {
            try {
                return this.f12190b.b(str);
            } catch (IOException unused) {
                return null;
            }
        }
        if (this.f12193e.a().contains(str)) {
            return AssetPackLocation.a();
        }
        return null;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final Map<String, AssetPackLocation> getPackLocations() {
        Map<String, AssetPackLocation> mapA = this.f12190b.a();
        HashMap map = new HashMap();
        Iterator<String> it = this.f12193e.a().iterator();
        while (it.hasNext()) {
            map.put(it.next(), AssetPackLocation.a());
        }
        mapA.putAll(map);
        return mapA;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final Task<AssetPackStates> getPackStates(List<String> list) {
        return this.f12191c.a().a(list, new az(this) { // from class: com.google.android.play.core.assetpacks.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final j f12018a;

            {
                this.f12018a = this;
            }

            @Override // com.google.android.play.core.assetpacks.az
            public final int a(int i10, String str) {
                return this.f12018a.a(i10, str);
            }
        }, this.f12190b.b());
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final synchronized void registerListener(AssetPackStateUpdateListener assetPackStateUpdateListener) {
        boolean zB = this.f12192d.b();
        this.f12192d.a((StateUpdatedListener) assetPackStateUpdateListener);
        if (zB) {
            return;
        }
        c();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final Task<Void> removePack(final String str) {
        final com.google.android.play.core.tasks.i iVar = new com.google.android.play.core.tasks.i();
        this.f12197i.a().execute(new Runnable(this, str, iVar) { // from class: com.google.android.play.core.assetpacks.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final j f12096a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f12097b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final com.google.android.play.core.tasks.i f12098c;

            {
                this.f12096a = this;
                this.f12097b = str;
                this.f12098c = iVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12096a.a(this.f12097b, this.f12098c);
            }
        });
        return iVar.a();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final Task<Integer> showCellularDataConfirmation(Activity activity) {
        if (this.f12196h.a() == null) {
            return Tasks.a((Exception) new AssetPackException(-12));
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", this.f12196h.a());
        com.google.android.play.core.tasks.i iVar = new com.google.android.play.core.tasks.i();
        intent.putExtra("result_receiver", new i(this, this.f12198j, iVar));
        activity.startActivity(intent);
        return iVar.a();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final void unregisterListener(AssetPackStateUpdateListener assetPackStateUpdateListener) {
        this.f12192d.b(assetPackStateUpdateListener);
    }
}
