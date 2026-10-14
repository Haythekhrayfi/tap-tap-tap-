package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzern implements zzeqy {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzbyr zzg;

    public zzern(zzbyr zzbyrVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z10, boolean z11) {
        this.zzg = zzbyrVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i10;
        this.zze = z10;
        this.zzf = z11;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaR)).booleanValue()) {
            return zzfwc.zzg(new Exception("Did not ad Ad ID into query param."));
        }
        return zzfwc.zze((zzfvt) zzfwc.zzn(zzfwc.zzl(zzfvt.zzv(this.zzg.zza(this.zza, this.zzd)), new zzfov() { // from class: com.google.android.gms.internal.ads.zzerl
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                return this.zza.zzc((AdvertisingIdClient.Info) obj);
            }
        }, this.zzc), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaS)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfov() { // from class: com.google.android.gms.internal.ads.zzerm
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                return this.zza.zzd((Throwable) obj);
            }
        }, this.zzc);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final /* synthetic */ zzero zzc(AdvertisingIdClient.Info info) {
        zzfme zzfmeVar = new zzfme();
        if (!this.zze) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcJ)).booleanValue()) {
                zzfmh zzfmhVarZzj = zzfmh.zzj(this.zza);
                Objects.requireNonNull(info);
                String id2 = info.getId();
                Objects.requireNonNull(id2);
                zzfmeVar = zzfmhVarZzj.zzi(id2, this.zza.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcP)).longValue(), this.zzf);
            } else if (this.zze) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcK)).booleanValue()) {
                    try {
                        zzfmh zzfmhVarZzj2 = zzfmh.zzj(this.zza);
                        Objects.requireNonNull(info);
                        String id3 = info.getId();
                        Objects.requireNonNull(id3);
                        zzfmeVar = zzfmhVarZzj2.zzi(id3, this.zza.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcP)).longValue(), this.zzf);
                    } catch (IOException | IllegalArgumentException e10) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "AdIdInfoSignalSource.getPaidV1");
                        zzfmeVar = new zzfme();
                    }
                }
            }
        } else if (this.zze) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcK)).booleanValue()) {
                zzfmh zzfmhVarZzj3 = zzfmh.zzj(this.zza);
                Objects.requireNonNull(info);
                String id4 = info.getId();
                Objects.requireNonNull(id4);
                zzfmeVar = zzfmhVarZzj3.zzi(id4, this.zza.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcP)).longValue(), this.zzf);
            }
        }
        return new zzero(info, null, zzfmeVar);
    }

    public final /* synthetic */ zzero zzd(Throwable th) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzero(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzfme());
    }
}
