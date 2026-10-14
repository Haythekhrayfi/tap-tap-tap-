package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r.e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgj {
    public static final /* synthetic */ int zzj = 0;
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;

    @Deprecated
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final String zzh;
    public final int zzi;

    static {
        zzbq.zzb("media3.datasource");
    }

    public zzgj(Uri uri) {
        this(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 0, null);
    }

    private zzgj(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        long j13 = j10 + j11;
        boolean z10 = false;
        zzdy.zzd(j13 >= 0);
        zzdy.zzd(j11 >= 0);
        long j14 = -1;
        if (j12 <= 0) {
            if (j12 != -1) {
                j14 = j12;
            }
            zzdy.zzd(z10);
            this.zza = uri;
            this.zzb = 1;
            this.zzc = null;
            this.zzd = Collections.unmodifiableMap(new HashMap(map));
            this.zzf = j11;
            this.zze = j13;
            this.zzg = j14;
            this.zzh = null;
            this.zzi = i11;
        }
        j14 = j12;
        z10 = true;
        zzdy.zzd(z10);
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zzf = j11;
        this.zze = j13;
        this.zzg = j14;
        this.zzh = null;
        this.zzi = i11;
    }

    @Deprecated
    public zzgj(Uri uri, byte[] bArr, long j10, long j11, long j12, String str, int i10) {
        this(uri, j10 - j11, 1, null, Collections.emptyMap(), j11, j12, null, i10, null);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zza);
        long j10 = this.zzf;
        long j11 = this.zzg;
        int i10 = this.zzi;
        StringBuilder sbA = q2.a.a("DataSpec[", "GET", " ", strValueOf, ", ");
        sbA.append(j10);
        e.a(sbA, ", ", j11, ", null, ");
        return b.a(sbA, i10, "]");
    }

    public final boolean zza(int i10) {
        return (this.zzi & i10) == i10;
    }
}
