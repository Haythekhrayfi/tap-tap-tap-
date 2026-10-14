package com.yandex.metrica.impl.ob;

import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f13620b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f13621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f13622b;

        public a(long j10, long j11) {
            this.f13621a = j10;
            this.f13622b = j11;
        }
    }

    public static class b {
    }

    public A0(Context context) {
        this(context, new b());
    }

    public A0(Context context, b bVar) {
        this.f13619a = context;
        this.f13620b = bVar;
    }

    public a a() {
        long j10;
        long totalBytes = 0;
        if (!U2.a(26)) {
            if (U2.a(18)) {
                try {
                    Objects.requireNonNull(this.f13620b);
                    StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                    long blockSizeLong = statFs.getBlockSizeLong();
                    return new a((statFs.getBlockCountLong() * blockSizeLong) / 1024, (statFs.getAvailableBlocksLong() * blockSizeLong) / 1024);
                } catch (Throwable unused) {
                    return new a(0L, 0L);
                }
            }
            try {
                Objects.requireNonNull(this.f13620b);
                StatFs statFs2 = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                long blockSize = statFs2.getBlockSize();
                return new a((((long) statFs2.getBlockCount()) * blockSize) / 1024, (((long) statFs2.getAvailableBlocks()) * blockSize) / 1024);
            } catch (Throwable unused2) {
                return new a(0L, 0L);
            }
        }
        StorageStatsManager storageStatsManager = (StorageStatsManager) this.f13619a.getSystemService("storagestats");
        StorageManager storageManager = (StorageManager) this.f13619a.getSystemService("storage");
        if (storageManager == null || storageStatsManager == null) {
            j10 = 0;
        } else {
            Iterator<StorageVolume> it = storageManager.getStorageVolumes().iterator();
            long freeBytes = 0;
            while (it.hasNext()) {
                try {
                    String uuid = it.next().getUuid();
                    UUID uuidFromString = uuid == null ? StorageManager.UUID_DEFAULT : UUID.fromString(uuid);
                    totalBytes += storageStatsManager.getTotalBytes(uuidFromString);
                    freeBytes += storageStatsManager.getFreeBytes(uuidFromString);
                } catch (Throwable unused3) {
                }
            }
            long j11 = totalBytes;
            totalBytes = freeBytes;
            j10 = j11;
        }
        return new a(j10 / 1024, totalBytes / 1024);
    }
}
