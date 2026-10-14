package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcae {
    public static final zzfwn zza;
    public static final zzfwn zzb;
    public static final zzfwn zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzfwn zze;
    public static final zzfwn zzf;

    static {
        Executor threadPoolExecutor;
        ExecutorService executorServiceZzc;
        ExecutorService executorServiceZzb;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfmc.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzcaa("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcaa("Default"));
        }
        zzcac zzcacVar = null;
        zza = new zzcad(threadPoolExecutor, zzcacVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceZzc = zzfmc.zza().zzc(5, new zzcaa("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcaa("Loader"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            executorServiceZzc = threadPoolExecutor2;
        }
        zzb = new zzcad(executorServiceZzc, zzcacVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceZzb = zzfmc.zza().zzb(new zzcaa("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcaa("Activeview"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorServiceZzb = threadPoolExecutor3;
        }
        zzc = new zzcad(executorServiceZzb, zzcacVar);
        zzd = new zzbzz(3, new zzcaa("Schedule"));
        zze = new zzcad(new zzcab(), zzcacVar);
        zzf = new zzcad(zzfwt.zzb(), zzcacVar);
    }
}
