package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class cz implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.internal.af f12087a = new com.google.android.play.core.internal.af("FakeAssetPackService");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicInteger f12088h = new AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aw f12090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bz f12091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f12092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final dl f12093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.play.core.internal.cj<Executor> f12094g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Handler f12095i = new Handler(Looper.getMainLooper());

    public cz(File file, aw awVar, bz bzVar, Context context, dl dlVar, com.google.android.play.core.internal.cj<Executor> cjVar) {
        this.f12089b = file.getAbsolutePath();
        this.f12090c = awVar;
        this.f12091d = bzVar;
        this.f12092e = context;
        this.f12093f = dlVar;
        this.f12094g = cjVar;
    }

    public static long a(@AssetPackStatus int i10, long j10) {
        if (i10 == 2) {
            return j10 / 2;
        }
        if (i10 == 3 || i10 == 4) {
            return j10;
        }
        return 0L;
    }

    private final AssetPackState a(String str, @AssetPackStatus int i10) throws LocalTestingException {
        long length = 0;
        for (File file : b(str)) {
            length += file.length();
        }
        return AssetPackState.a(str, i10, 0, a(i10, length), length, this.f12091d.b(str));
    }

    private static String a(File file) throws LocalTestingException {
        try {
            return db.a((List<File>) Arrays.asList(file));
        } catch (IOException e10) {
            throw new LocalTestingException(String.format("Could not digest file: %s.", file), e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new LocalTestingException("SHA256 algorithm not supported.", e11);
        }
    }

    private final void a(int i10, String str, @AssetPackStatus int i11) throws LocalTestingException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f12093f.a());
        bundle.putInt("session_id", i10);
        File[] fileArrB = b(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long length = 0;
        for (File file : fileArrB) {
            length += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i11 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String strA = com.google.android.play.core.internal.av.a(file);
            bundle.putParcelableArrayList(com.google.android.play.core.internal.h.a("chunk_intents", str, strA), arrayList2);
            bundle.putString(com.google.android.play.core.internal.h.a("uncompressed_hash_sha256", str, strA), a(file));
            bundle.putLong(com.google.android.play.core.internal.h.a("uncompressed_size", str, strA), file.length());
            arrayList.add(strA);
        }
        bundle.putStringArrayList(com.google.android.play.core.internal.h.a("slice_ids", str), arrayList);
        bundle.putLong(com.google.android.play.core.internal.h.a("pack_version", str), this.f12093f.a());
        bundle.putInt(com.google.android.play.core.internal.h.a("status", str), i11);
        bundle.putInt(com.google.android.play.core.internal.h.a("error_code", str), 0);
        bundle.putLong(com.google.android.play.core.internal.h.a("bytes_downloaded", str), a(i11, length));
        bundle.putLong(com.google.android.play.core.internal.h.a("total_bytes_to_download", str), length);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", a(i11, length));
        bundle.putLong("total_bytes_to_download", length);
        final Intent intentPutExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.f12095i.post(new Runnable(this, intentPutExtra) { // from class: com.google.android.play.core.assetpacks.cy

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final cz f12085a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Intent f12086b;

            {
                this.f12085a = this;
                this.f12086b = intentPutExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12085a.a(this.f12086b);
            }
        });
    }

    private final File[] b(final String str) throws LocalTestingException {
        File file = new File(this.f12089b);
        if (!file.isDirectory()) {
            throw new LocalTestingException(String.format("Local testing directory '%s' not found.", file));
        }
        File[] fileArrListFiles = file.listFiles(new FilenameFilter(str) { // from class: com.google.android.play.core.assetpacks.cx

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f12084a;

            {
                this.f12084a = str;
            }

            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return str2.startsWith(String.valueOf(this.f12084a).concat("-")) && str2.endsWith(".apk");
            }
        });
        if (fileArrListFiles == null) {
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        if (fileArrListFiles.length == 0) {
            throw new LocalTestingException(String.format("No APKs available for pack '%s'.", str));
        }
        for (File file2 : fileArrListFiles) {
            if (com.google.android.play.core.internal.av.a(file2).equals(str)) {
                return fileArrListFiles;
            }
        }
        throw new LocalTestingException(String.format("No master slice available for pack '%s'.", str));
    }

    @Override // com.google.android.play.core.assetpacks.w
    public final Task<AssetPackStates> a(final List<String> list, final az azVar, Map<String, Long> map) {
        final com.google.android.play.core.tasks.i iVarA = com.google.android.play.core.appupdate.z.a(f12087a, "getPackStates(%s)", new Object[]{list});
        this.f12094g.a().execute(new Runnable(this, list, azVar, iVarA) { // from class: com.google.android.play.core.assetpacks.cv

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final cz f12077a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final List f12078b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final az f12079c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final com.google.android.play.core.tasks.i f12080d;

            {
                this.f12077a = this;
                this.f12078b = list;
                this.f12079c = azVar;
                this.f12080d = iVarA;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12077a.a(this.f12078b, this.f12079c, this.f12080d);
            }
        });
        return iVarA.a();
    }

    @Override // com.google.android.play.core.assetpacks.w
    public final Task<AssetPackStates> a(final List<String> list, final List<String> list2, Map<String, Long> map) {
        final com.google.android.play.core.tasks.i iVarA = com.google.android.play.core.appupdate.z.a(f12087a, "startDownload(%s)", new Object[]{list2});
        this.f12094g.a().execute(new Runnable(this, list2, iVarA, list) { // from class: com.google.android.play.core.assetpacks.cu

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final cz f12073a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final List f12074b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final com.google.android.play.core.tasks.i f12075c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final List f12076d;

            {
                this.f12073a = this;
                this.f12074b = list2;
                this.f12075c = iVarA;
                this.f12076d = list;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12073a.a(this.f12074b, this.f12075c, this.f12076d);
            }
        });
        return iVarA.a();
    }

    @Override // com.google.android.play.core.assetpacks.w
    public final Task<List<String>> a(Map<String, Long> map) {
        f12087a.c("syncPacks()", new Object[0]);
        return Tasks.a(new ArrayList());
    }

    @Override // com.google.android.play.core.assetpacks.w
    public final void a() {
        f12087a.c("keepAlive", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.w
    public final void a(int i10) {
        f12087a.c("notifySessionFailed", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.w
    public final void a(final int i10, final String str) {
        f12087a.c("notifyModuleCompleted", new Object[0]);
        this.f12094g.a().execute(new Runnable(this, i10, str) { // from class: com.google.android.play.core.assetpacks.cw

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final cz f12081a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f12082b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f12083c;

            {
                this.f12081a = this;
                this.f12082b = i10;
                this.f12083c = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12081a.b(this.f12082b, this.f12083c);
            }
        });
    }

    @Override // com.google.android.play.core.assetpacks.w
    public final void a(int i10, String str, String str2, int i11) {
        f12087a.c("notifyChunkTransferred", new Object[0]);
    }

    public final /* synthetic */ void a(Intent intent) {
        this.f12090c.a(this.f12092e, intent);
    }

    @Override // com.google.android.play.core.assetpacks.w
    public final void a(String str) {
        f12087a.c("removePack(%s)", str);
    }

    @Override // com.google.android.play.core.assetpacks.w
    public final void a(List<String> list) {
        f12087a.c("cancelDownload(%s)", list);
    }

    public final /* synthetic */ void a(List list, az azVar, com.google.android.play.core.tasks.i iVar) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        long j10 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                AssetPackState assetPackStateA = a(str, azVar.a(8, str));
                j10 += assetPackStateA.totalBytesToDownload();
                map.put(str, assetPackStateA);
            } catch (LocalTestingException e10) {
                iVar.a((Exception) e10);
                return;
            }
        }
        iVar.a(AssetPackStates.a(j10, map));
    }

    public final /* synthetic */ void a(List list, com.google.android.play.core.tasks.i iVar, List list2) {
        HashMap map = new HashMap();
        int size = list.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) list.get(i10);
            try {
                AssetPackState assetPackStateA = a(str, 1);
                j10 += assetPackStateA.totalBytesToDownload();
                map.put(str, assetPackStateA);
            } catch (LocalTestingException e10) {
                iVar.a((Exception) e10);
                return;
            }
        }
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            String str2 = (String) list.get(i11);
            try {
                int andIncrement = f12088h.getAndIncrement();
                a(andIncrement, str2, 1);
                a(andIncrement, str2, 2);
                a(andIncrement, str2, 3);
            } catch (LocalTestingException e11) {
                iVar.a((Exception) e11);
                return;
            }
        }
        int size3 = list2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            String str3 = (String) list2.get(i12);
            map.put(str3, AssetPackState.a(str3, 4, 0, 0L, 0L, 0.0d));
        }
        iVar.a(AssetPackStates.a(j10, map));
    }

    @Override // com.google.android.play.core.assetpacks.w
    public final Task<ParcelFileDescriptor> b(int i10, String str, String str2, int i11) {
        com.google.android.play.core.tasks.i iVarA = com.google.android.play.core.appupdate.z.a(f12087a, "getChunkFileDescriptor(session=%d, %s, %s, %d)", new Object[]{Integer.valueOf(i10), str, str2, Integer.valueOf(i11)});
        try {
            for (File file : b(str)) {
                if (com.google.android.play.core.internal.av.a(file).equals(str2)) {
                    iVarA.a(ParcelFileDescriptor.open(file, 268435456));
                    return iVarA.a();
                }
            }
            throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", str2));
        } catch (LocalTestingException e10) {
            f12087a.d("getChunkFileDescriptor failed", e10);
            iVarA.a((Exception) e10);
        } catch (FileNotFoundException e11) {
            f12087a.d("getChunkFileDescriptor failed", e11);
            iVarA.a((Exception) new LocalTestingException("Asset Slice file not found.", e11));
        }
    }

    public final /* synthetic */ void b(int i10, String str) {
        try {
            a(i10, str, 4);
        } catch (LocalTestingException e10) {
            f12087a.d("notifyModuleCompleted failed", e10);
        }
    }
}
