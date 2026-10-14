package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzepn implements zzeqy {
    private final Context zza;
    private final zzfwn zzb;
    private final zzfai zzc;
    private final zzbzx zzd;

    public zzepn(Context context, zzfwn zzfwnVar, zzfai zzfaiVar, zzbzx zzbzxVar) {
        this.zza = context;
        this.zzb = zzfwnVar;
        this.zzc = zzfaiVar;
        this.zzd = zzbzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0044 A[Catch: IOException -> 0x0122, TryCatch #0 {IOException -> 0x0122, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:8:0x0030, B:13:0x0056, B:14:0x007a, B:16:0x008c, B:18:0x00a2, B:20:0x00ab, B:25:0x00d1, B:27:0x00eb, B:28:0x010f, B:30:0x011a, B:23:0x00bf, B:11:0x0044), top: B:35:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0056 A[Catch: IOException -> 0x0122, TryCatch #0 {IOException -> 0x0122, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:8:0x0030, B:13:0x0056, B:14:0x007a, B:16:0x008c, B:18:0x00a2, B:20:0x00ab, B:25:0x00d1, B:27:0x00eb, B:28:0x010f, B:30:0x011a, B:23:0x00bf, B:11:0x0044), top: B:35:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x00bf A[Catch: IOException -> 0x0122, TryCatch #0 {IOException -> 0x0122, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:8:0x0030, B:13:0x0056, B:14:0x007a, B:16:0x008c, B:18:0x00a2, B:20:0x00ab, B:25:0x00d1, B:27:0x00eb, B:28:0x010f, B:30:0x011a, B:23:0x00bf, B:11:0x0044), top: B:35:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00d1 A[Catch: IOException -> 0x0122, TryCatch #0 {IOException -> 0x0122, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:8:0x0030, B:13:0x0056, B:14:0x007a, B:16:0x008c, B:18:0x00a2, B:20:0x00ab, B:25:0x00d1, B:27:0x00eb, B:28:0x010f, B:30:0x011a, B:23:0x00bf, B:11:0x0044), top: B:35:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00eb A[Catch: IOException -> 0x0122, TryCatch #0 {IOException -> 0x0122, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:8:0x0030, B:13:0x0056, B:14:0x007a, B:16:0x008c, B:18:0x00a2, B:20:0x00ab, B:25:0x00d1, B:27:0x00eb, B:28:0x010f, B:30:0x011a, B:23:0x00bf, B:11:0x0044), top: B:35:0x0000 }] */
    public final /* synthetic */ zzepo zzc() throws Exception {
        zzfme zzfmeVar;
        boolean z10;
        boolean zZzp;
        zzfmi zzfmiVarZzi;
        try {
            Context context = this.zza;
            boolean zZzb = this.zzc.zzb();
            zzfme zzfmeVar2 = new zzfme();
            zzfme zzfmeVar3 = new zzfme();
            boolean zZzo = true;
            if (zZzb) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcG)).booleanValue()) {
                    return new zzepo(true);
                }
            }
            if (!zZzb) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcC)).booleanValue()) {
                    zzfmeVar2 = zzfmh.zzj(context).zzh(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcP)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().zzh().zzP());
                } else if (zZzb) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcE)).booleanValue()) {
                        zzfmeVar2 = zzfmh.zzj(context).zzh(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcP)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().zzh().zzP());
                    }
                }
            } else if (zZzb) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcE)).booleanValue()) {
                    zzfmeVar2 = zzfmh.zzj(context).zzh(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcP)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().zzh().zzP());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcN)).booleanValue()) {
                if (this.zzd.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcM)).intValue()) {
                    zzfmi.zzi(context).zzj();
                }
            }
            if (zZzb) {
                if (zZzb) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcF)).booleanValue()) {
                        zzfmiVarZzi = zzfmi.zzi(context);
                        if (this.zzd.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcM)).intValue()) {
                            zzfmeVar3 = zzfmiVarZzi.zzh(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcQ)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().zzh().zzP());
                            zZzo = zzfmiVarZzi.zzo();
                        }
                        zZzp = zzfmiVarZzi.zzp();
                        zzfmeVar = zzfmeVar3;
                        z10 = zZzo;
                    }
                }
                zzfmeVar = zzfmeVar3;
                z10 = true;
                zZzp = true;
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcD)).booleanValue()) {
                    zzfmiVarZzi = zzfmi.zzi(context);
                    if (this.zzd.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcM)).intValue()) {
                        zzfmeVar3 = zzfmiVarZzi.zzh(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcQ)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().zzh().zzP());
                        zZzo = zzfmiVarZzi.zzo();
                    }
                    zZzp = zzfmiVarZzi.zzp();
                    zzfmeVar = zzfmeVar3;
                    z10 = zZzo;
                } else {
                    if (zZzb) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcF)).booleanValue()) {
                            zzfmiVarZzi = zzfmi.zzi(context);
                            if (this.zzd.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcM)).intValue()) {
                                zzfmeVar3 = zzfmiVarZzi.zzh(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcQ)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().zzh().zzP());
                                zZzo = zzfmiVarZzi.zzo();
                            }
                            zZzp = zzfmiVarZzi.zzp();
                            zzfmeVar = zzfmeVar3;
                            z10 = zZzo;
                        }
                    }
                    zzfmeVar = zzfmeVar3;
                    z10 = true;
                    zZzp = true;
                }
            }
            return new zzepo(zzfmeVar2, zzfmeVar, z10, zZzp, zZzb);
        } catch (IOException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "PerAppIdSignal");
            return new zzepo(this.zzc.zzb());
        }
    }
}
