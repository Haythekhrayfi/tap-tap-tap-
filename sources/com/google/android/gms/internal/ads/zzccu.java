package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class zzccu implements zzge {
    private final Context zza;
    private final zzge zzb;
    private final String zzc;
    private final int zzd;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzawl zzi;
    private zzgj zzm;
    private boolean zzj = false;
    private boolean zzk = false;
    private final AtomicLong zzl = new AtomicLong(-1);
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbJ)).booleanValue();

    public zzccu(Context context, zzge zzgeVar, String str, int i10, zzhg zzhgVar, zzcct zzcctVar) {
        this.zza = context;
        this.zzb = zzgeVar;
        this.zzc = str;
        this.zzd = i10;
    }

    private final boolean zzg() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeb)).booleanValue() || this.zzj) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzec)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i10, i11) : this.zzb.zza(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final long zzb(zzgj zzgjVar) throws IOException {
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        Uri uri = zzgjVar.zza;
        this.zzh = uri;
        this.zzm = zzgjVar;
        this.zzi = zzawl.zza(uri);
        zzawi zzawiVarZzb = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdY)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzgjVar.zzf;
                this.zzi.zzi = zzfpw.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzawiVarZzb = com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zzi);
            }
            if (zzawiVarZzb != null && zzawiVarZzb.zze()) {
                this.zzj = zzawiVarZzb.zzg();
                this.zzk = zzawiVarZzb.zzf();
                if (!zzg()) {
                    this.zzf = zzawiVarZzb.zzc();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzgjVar.zzf;
            this.zzi.zzi = zzfpw.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(this.zzi.zzg ? zzbbm.zzea : zzbbm.zzdZ)).longValue();
            com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzd();
            Future futureZza = zzaww.zza(this.zza, this.zzi);
            try {
                try {
                    zzawx zzawxVar = (zzawx) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                    zzawxVar.zzd();
                    this.zzj = zzawxVar.zzf();
                    this.zzk = zzawxVar.zze();
                    zzawxVar.zza();
                    if (zzg()) {
                        com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                        throw null;
                    }
                    this.zzf = zzawxVar.zzc();
                    com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                    throw null;
                } catch (InterruptedException unused) {
                    futureZza.cancel(false);
                    Thread.currentThread().interrupt();
                    com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                    throw null;
                } catch (ExecutionException | TimeoutException unused2) {
                    futureZza.cancel(false);
                    com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                    throw null;
                }
            } catch (Throwable unused3) {
                com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                throw null;
            }
        }
        if (this.zzi != null) {
            this.zzm = new zzgj(Uri.parse(this.zzi.zza), null, zzgjVar.zze, zzgjVar.zzf, zzgjVar.zzg, null, zzgjVar.zzi);
        }
        return this.zzb.zzb(this.zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void zzf(zzhg zzhgVar) {
    }
}
