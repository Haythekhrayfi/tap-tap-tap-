package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcgu implements zzcmg {

    @Nullable
    private static zzcgu zza;

    private static synchronized zzcgu zzC(Context context, @Nullable zzbnw zzbnwVar, int i10, boolean z10, int i11, zzchy zzchyVar) {
        zzcgu zzcguVar = zza;
        if (zzcguVar != null) {
            return zzcguVar;
        }
        zzbbm.zza(context);
        zzfbb zzfbbVarZzd = zzfbb.zzd(context);
        zzbzx zzbzxVarZzc = zzfbbVarZzd.zzc(ModuleDescriptor.MODULE_VERSION, false, i11);
        zzfbbVarZzd.zzf(zzbnwVar);
        zzcjm zzcjmVar = new zzcjm(null);
        zzcgv zzcgvVar = new zzcgv();
        zzcgvVar.zzd(zzbzxVarZzc);
        zzcgvVar.zzc(context);
        zzcjmVar.zzb(new zzcgx(zzcgvVar, null));
        zzcjmVar.zzc(new zzckz(zzchyVar));
        zzcgu zzcguVarZza = zzcjmVar.zza();
        com.google.android.gms.ads.internal.zzt.zzo().zzs(context, zzbzxVarZzc);
        com.google.android.gms.ads.internal.zzt.zzc().zzi(context);
        com.google.android.gms.ads.internal.zzt.zzp().zzj(context);
        com.google.android.gms.ads.internal.zzt.zzp().zzi(context);
        com.google.android.gms.ads.internal.util.zzd.zza(context);
        com.google.android.gms.ads.internal.zzt.zzb().zzd(context);
        com.google.android.gms.ads.internal.zzt.zzv().zzb(context);
        zzbxx.zzd(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfW)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzav)).booleanValue()) {
                zzawz zzawzVar = new zzawz(new zzaxf(context));
                zzdzt zzdztVar = new zzdzt(new zzdzp(context), zzcguVarZza.zzz());
                com.google.android.gms.ads.internal.zzt.zzp();
                new zzeap(context, zzbzxVarZzc, zzawzVar, zzdztVar, UUID.randomUUID().toString(), zzcguVarZza.zzx()).zzb(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzP());
            }
        }
        zza = zzcguVarZza;
        return zzcguVarZza;
    }

    public static zzcgu zza(Context context, @Nullable zzbnw zzbnwVar, int i10) {
        return zzC(context, zzbnwVar, ModuleDescriptor.MODULE_VERSION, false, i10, new zzchy());
    }

    public abstract Executor zzA();

    public abstract ScheduledExecutorService zzB();

    public abstract zzclj zzb();

    public abstract zzcoo zzc();

    public abstract zzcpx zzd();

    public abstract zzcxv zze();

    public abstract zzden zzf();

    public abstract zzdfj zzg();

    public abstract zzdmq zzh();

    public abstract zzdri zzi();

    public abstract zzdsx zzj();

    public abstract zzdtr zzk();

    public abstract zzebl zzl();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzc zzm();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzg zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzaa zzo();

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final zzerq zzp(zzbue zzbueVar, int i10) {
        return zzq(new zzets(zzbueVar, i10));
    }

    public abstract zzerq zzq(zzets zzetsVar);

    public abstract zzeun zzr();

    public abstract zzewb zzs();

    public abstract zzexs zzt();

    public abstract zzezg zzu();

    public abstract zzfau zzv();

    public abstract zzfbe zzw();

    public abstract zzfev zzx();

    public abstract zzfgb zzy();

    public abstract zzfwn zzz();
}
