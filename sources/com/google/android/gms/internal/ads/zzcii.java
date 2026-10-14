package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
final class zzcii extends zzesf {
    private final zzetl zza;
    private final zzciq zzb;
    private final zzcii zzc = this;
    private final zzgwr zzd;
    private final zzgwr zze;
    private final zzgwr zzf;
    private final zzgwr zzg;
    private final zzgwr zzh;
    private final zzgwr zzi;
    private final zzgwr zzj;
    private final zzgwr zzk;
    private final zzgwr zzl;
    private final zzgwr zzm;
    private final zzgwr zzn;

    public /* synthetic */ zzcii(zzciq zzciqVar, zzetl zzetlVar, zzcih zzcihVar) {
        this.zzb = zzciqVar;
        this.zza = zzetlVar;
        zzetn zzetnVar = new zzetn(zzetlVar);
        this.zzd = zzetnVar;
        zzgwr zzgwrVarZzc = zzgwd.zzc(zzdoz.zza());
        this.zze = zzgwrVarZzc;
        zzgwr zzgwrVarZzc2 = zzgwd.zzc(zzdox.zza());
        this.zzf = zzgwrVarZzc2;
        zzgwr zzgwrVarZzc3 = zzgwd.zzc(zzdpb.zza());
        this.zzg = zzgwrVarZzc3;
        zzgwr zzgwrVarZzc4 = zzgwd.zzc(zzdpd.zza());
        this.zzh = zzgwrVarZzc4;
        zzgwh zzgwhVarZzc = zzgwi.zzc(4);
        zzgwhVarZzc.zzb(zzfef.GMS_SIGNALS, zzgwrVarZzc);
        zzgwhVarZzc.zzb(zzfef.BUILD_URL, zzgwrVarZzc2);
        zzgwhVarZzc.zzb(zzfef.HTTP, zzgwrVarZzc3);
        zzgwhVarZzc.zzb(zzfef.PRE_PROCESS, zzgwrVarZzc4);
        zzgwi zzgwiVarZzc = zzgwhVarZzc.zzc();
        this.zzi = zzgwiVarZzc;
        zzgwr zzgwrVarZzc5 = zzgwd.zzc(new zzdpe(zzetnVar, zzciqVar.zzg, zzfdg.zza(), zzgwiVarZzc));
        this.zzj = zzgwrVarZzc5;
        zzgwo zzgwoVarZza = zzgwp.zza(0, 1);
        zzgwoVarZza.zza(zzgwrVarZzc5);
        zzgwp zzgwpVarZzc = zzgwoVarZza.zzc();
        this.zzk = zzgwpVarZzc;
        zzfeo zzfeoVar = new zzfeo(zzgwpVarZzc);
        this.zzl = zzfeoVar;
        this.zzm = zzgwd.zzc(new zzfen(zzfdg.zza(), zzciqVar.zzm, zzfeoVar));
        this.zzn = zzgwd.zzc(new zzffz(zzciqVar.zzG));
    }

    @Override // com.google.android.gms.internal.ads.zzesf
    public final zzerb zza() {
        Context contextZza = this.zzb.zza.zza();
        zzgwm.zzb(contextZza);
        zzbyo zzbyoVar = new zzbyo();
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        zzetf zzetfVar = new zzetf(zzbyoVar, zzfwnVar, zzetm.zza(this.zza));
        zzgwm.zzb(zzfwnVar);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzm.zzb();
        zzffy zzffyVar = (zzffy) this.zzn.zzb();
        zzdqa zzdqaVar = (zzdqa) this.zzb.zzZ.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new zzepg(zzetfVar, 0L, scheduledExecutorService));
        return new zzerb(contextZza, zzfwnVar, hashSet, zzffyVar, zzdqaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzesf
    public final zzfel zzb() {
        return (zzfel) this.zzm.zzb();
    }
}
