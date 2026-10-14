package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class ar implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.internal.af f11868a = new com.google.android.play.core.internal.af("AssetPackServiceImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Intent f11869b = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bz f11871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.play.core.internal.ap<com.google.android.play.core.internal.s> f11872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.play.core.internal.ap<com.google.android.play.core.internal.s> f11873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f11874g = new AtomicBoolean();

    public ar(Context context, bz bzVar) {
        this.f11870c = context.getPackageName();
        this.f11871d = bzVar;
        if (com.google.android.play.core.internal.by.a(context)) {
            Context contextA = com.google.android.play.core.splitcompat.p.a(context);
            com.google.android.play.core.internal.af afVar = f11868a;
            Intent intent = f11869b;
            this.f11872e = new com.google.android.play.core.internal.ap<>(contextA, afVar, "AssetPackService", intent, x.f12222a);
            this.f11873f = new com.google.android.play.core.internal.ap<>(com.google.android.play.core.splitcompat.p.a(context), afVar, "AssetPackService-keepAlive", intent, y.f12223a);
        }
        f11868a.a("AssetPackService initiated.", new Object[0]);
    }

    public static /* synthetic */ ArrayList a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static /* synthetic */ List a(ar arVar, List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AssetPackState next = AssetPackStates.a((Bundle) list.get(i10), arVar.f11871d).packStates().values().iterator().next();
            if (next == null) {
                f11868a.b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (db.a(next.status())) {
                arrayList.add(next.name());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i10, String str, int i11) {
        if (this.f11872e == null) {
            throw new bv("The Play Store app is not installed or is an unofficial version.", i10);
        }
        com.google.android.play.core.tasks.i iVarA = com.google.android.play.core.appupdate.z.a(f11868a, "notifyModuleCompleted", new Object[0]);
        this.f11872e.a(new ag(this, iVarA, i10, str, iVarA, i11));
    }

    public static /* synthetic */ Bundle b(Map map) {
        Bundle bundleE = e();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        bundleE.putParcelableArrayList("installed_asset_module", arrayList);
        return bundleE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle c(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i10);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle c(int i10, String str) {
        Bundle bundleC = c(i10);
        bundleC.putString("module_name", str);
        return bundleC;
    }

    public static /* synthetic */ Bundle c(int i10, String str, String str2, int i11) {
        Bundle bundleC = c(i10, str);
        bundleC.putString("slice_id", str2);
        bundleC.putInt("chunk_number", i11);
        return bundleC;
    }

    private static <T> Task<T> d() {
        f11868a.b("onError(%d)", -11);
        return Tasks.a((Exception) new AssetPackException(-11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10800);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList<>());
        return bundle;
    }

    @Override // com.google.android.play.core.assetpacks.w
    public final Task<AssetPackStates> a(List<String> list, az azVar, Map<String, Long> map) {
        if (this.f11872e == null) {
            return d();
        }
        com.google.android.play.core.tasks.i iVarA = com.google.android.play.core.appupdate.z.a(f11868a, "getPackStates(%s)", new Object[]{list});
        this.f11872e.a(new ae(this, iVarA, list, map, iVarA, azVar));
        return iVarA.a();
    }

    @Override // com.google.android.play.core.assetpacks.w
    public final Task<AssetPackStates> a(List<String> list, List<String> list2, Map<String, Long> map) {
        if (this.f11872e == null) {
            return d();
        }
        com.google.android.play.core.tasks.i iVarA = com.google.android.play.core.appupdate.z.a(f11868a, "startDownload(%s)", new Object[]{list2});
        this.f11872e.a(new ab(this, iVarA, list2, map, iVarA, list));
        iVarA.a().addOnSuccessListener(new OnSuccessListener(this) { // from class: com.google.android.play.core.assetpacks.z

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ar f12224a;

            {
                this.f12224a = this;
            }

            @Override // com.google.android.play.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f12224a.a();
            }
        });
        return iVarA.a();
    }

    @Override // com.google.android.play.core.assetpacks.w
    public final Task<List<String>> a(Map<String, Long> map) {
        if (this.f11872e == null) {
            return d();
        }
        com.google.android.play.core.tasks.i iVarA = com.google.android.play.core.appupdate.z.a(f11868a, "syncPacks", new Object[0]);
        this.f11872e.a(new ad(this, iVarA, map, iVarA));
        return iVarA.a();
    }

    @Override // com.google.android.play.core.assetpacks.w
    public final synchronized void a() {
        if (this.f11873f == null) {
            f11868a.d("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        com.google.android.play.core.internal.af afVar = f11868a;
        afVar.c("keepAlive", new Object[0]);
        if (!this.f11874g.compareAndSet(false, true)) {
            afVar.c("Service is already kept alive.", new Object[0]);
        } else {
            com.google.android.play.core.tasks.i iVar = new com.google.android.play.core.tasks.i();
            this.f11873f.a(new aj(this, iVar, iVar));
        }
    }

    @Override // com.google.android.play.core.assetpacks.w
    public final void a(int i10) {
        if (this.f11872e == null) {
            throw new bv("The Play Store app is not installed or is an unofficial version.", i10);
        }
        com.google.android.play.core.tasks.i iVarA = com.google.android.play.core.appupdate.z.a(f11868a, "notifySessionFailed", new Object[0]);
        this.f11872e.a(new ah(this, iVarA, i10, iVarA));
    }

    @Override // com.google.android.play.core.assetpacks.w
    public final void a(int i10, String str) {
        a(i10, str, 10);
    }

    @Override // com.google.android.play.core.assetpacks.w
    public final void a(int i10, String str, String str2, int i11) {
        if (this.f11872e == null) {
            throw new bv("The Play Store app is not installed or is an unofficial version.", i10);
        }
        com.google.android.play.core.tasks.i iVarA = com.google.android.play.core.appupdate.z.a(f11868a, "notifyChunkTransferred", new Object[0]);
        this.f11872e.a(new af(this, iVarA, i10, str, str2, i11, iVarA));
    }

    @Override // com.google.android.play.core.assetpacks.w
    public final void a(String str) {
        if (this.f11872e == null) {
            return;
        }
        com.google.android.play.core.tasks.i iVarA = com.google.android.play.core.appupdate.z.a(f11868a, "removePack(%s)", new Object[]{str});
        this.f11872e.a(new aa(this, iVarA, str, iVarA));
    }

    @Override // com.google.android.play.core.assetpacks.w
    public final void a(List<String> list) {
        if (this.f11872e == null) {
            return;
        }
        com.google.android.play.core.tasks.i iVarA = com.google.android.play.core.appupdate.z.a(f11868a, "cancelDownloads(%s)", new Object[]{list});
        this.f11872e.a(new ac(this, iVarA, list, iVarA));
    }

    @Override // com.google.android.play.core.assetpacks.w
    public final Task<ParcelFileDescriptor> b(int i10, String str, String str2, int i11) {
        if (this.f11872e == null) {
            return d();
        }
        com.google.android.play.core.tasks.i iVarA = com.google.android.play.core.appupdate.z.a(f11868a, "getChunkFileDescriptor(%s, %s, %d, session=%d)", new Object[]{str, str2, Integer.valueOf(i11), Integer.valueOf(i10)});
        this.f11872e.a(new ai(this, iVarA, i10, str, str2, i11, iVarA));
        return iVarA.a();
    }
}
