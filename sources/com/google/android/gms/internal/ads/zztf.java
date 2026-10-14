package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class zztf {
    private static final AtomicLong zzd = new AtomicLong();
    public final zzgj zza;
    public final Uri zzb;
    public final Map zzc;

    public zztf(long j10, zzgj zzgjVar, Uri uri, Map map, long j11, long j12, long j13) {
        this.zza = zzgjVar;
        this.zzb = uri;
        this.zzc = map;
    }

    public static long zza() {
        return zzd.getAndIncrement();
    }
}
