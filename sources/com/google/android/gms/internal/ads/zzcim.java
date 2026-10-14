package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
final class zzcim extends zzesh {
    private final zzerv zza;
    private final zzciq zzb;
    private final zzcim zzc = this;
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

    public /* synthetic */ zzcim(zzciq zzciqVar, zzerv zzervVar, zzcil zzcilVar) {
        this.zzb = zzciqVar;
        this.zza = zzervVar;
        this.zzd = zzgwd.zzc(new zzffz(zzciqVar.zzG));
        zzesd zzesdVar = new zzesd(zzervVar);
        this.zze = zzesdVar;
        zzgwr zzgwrVarZzc = zzgwd.zzc(zzdoz.zza());
        this.zzf = zzgwrVarZzc;
        zzgwr zzgwrVarZzc2 = zzgwd.zzc(zzdox.zza());
        this.zzg = zzgwrVarZzc2;
        zzgwr zzgwrVarZzc3 = zzgwd.zzc(zzdpb.zza());
        this.zzh = zzgwrVarZzc3;
        zzgwr zzgwrVarZzc4 = zzgwd.zzc(zzdpd.zza());
        this.zzi = zzgwrVarZzc4;
        zzgwh zzgwhVarZzc = zzgwi.zzc(4);
        zzgwhVarZzc.zzb(zzfef.GMS_SIGNALS, zzgwrVarZzc);
        zzgwhVarZzc.zzb(zzfef.BUILD_URL, zzgwrVarZzc2);
        zzgwhVarZzc.zzb(zzfef.HTTP, zzgwrVarZzc3);
        zzgwhVarZzc.zzb(zzfef.PRE_PROCESS, zzgwrVarZzc4);
        zzgwi zzgwiVarZzc = zzgwhVarZzc.zzc();
        this.zzj = zzgwiVarZzc;
        zzgwr zzgwrVarZzc5 = zzgwd.zzc(new zzdpe(zzesdVar, zzciqVar.zzg, zzfdg.zza(), zzgwiVarZzc));
        this.zzk = zzgwrVarZzc5;
        zzgwo zzgwoVarZza = zzgwp.zza(0, 1);
        zzgwoVarZza.zza(zzgwrVarZzc5);
        zzgwp zzgwpVarZzc = zzgwoVarZza.zzc();
        this.zzl = zzgwpVarZzc;
        zzfeo zzfeoVar = new zzfeo(zzgwpVarZzc);
        this.zzm = zzfeoVar;
        this.zzn = zzgwd.zzc(new zzfen(zzfdg.zza(), zzciqVar.zzm, zzfeoVar));
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final zzerb zza() {
        Context contextZza = this.zzb.zza.zza();
        zzgwm.zzb(contextZza);
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        zzbyo zzbyoVar = new zzbyo();
        zzgwm.zzb(zzfwnVar);
        zzeqy zzeqyVarZza = zzeub.zza(new zzetf(zzbyoVar, zzfwnVar, zzerw.zza(this.zza)), zzepa.zza(), (ScheduledExecutorService) this.zzb.zzm.zzb(), 0);
        zzbrx zzbrxVar = new zzbrx();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzm.zzb();
        Context contextZza2 = this.zzb.zza.zza();
        zzgwm.zzb(contextZza2);
        zzeqy zzeqyVarZzb = zzeub.zzb(new zzetp(zzbrxVar, scheduledExecutorService, contextZza2), (ScheduledExecutorService) this.zzb.zzm.zzb());
        zzbyr zzbyrVar = new zzbyr();
        Context contextZza3 = this.zzb.zza.zza();
        zzgwm.zzb(contextZza3);
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.zzb.zzm.zzb();
        zzgwm.zzb(zzfwnVar);
        zzeqy zzeqyVarZza2 = zzeuc.zza(zzerp.zza(zzbyrVar, contextZza3, scheduledExecutorService2, zzfwnVar, zzerx.zza(this.zza), zzerz.zza(this.zza), zzesa.zza(this.zza)), (ScheduledExecutorService) this.zzb.zzm.zzb());
        zzgwm.zzb(zzfwnVar);
        zzeqy zzeqyVarZzc = zzeub.zzc(new zzeuk(zzfwnVar), (ScheduledExecutorService) this.zzb.zzm.zzb());
        zzetz zzetzVar = zzetz.zza;
        Context contextZza4 = this.zzb.zza.zza();
        zzgwm.zzb(contextZza4);
        String strZza = zzerw.zza(this.zza);
        zzgwm.zzb(zzfwnVar);
        zzesj zzesjVar = new zzesj(null, contextZza4, strZza, zzfwnVar);
        zzawo zzawoVar = new zzawo();
        zzgwm.zzb(zzfwnVar);
        Context contextZza5 = this.zzb.zza.zza();
        zzgwm.zzb(contextZza5);
        zzbax zzbaxVar = new zzbax();
        zzgwm.zzb(zzfwnVar);
        zzbyr zzbyrVar2 = new zzbyr();
        zzgwm.zzb(zzfwnVar);
        zzbyr zzbyrVar3 = new zzbyr();
        int iZza = zzerx.zza(this.zza);
        Context contextZza6 = this.zzb.zza.zza();
        zzgwm.zzb(contextZza6);
        zzbza zzbzaVar = (zzbza) this.zzb.zzag.zzb();
        ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.zzb.zzm.zzb();
        zzgwm.zzb(zzfwnVar);
        String strZza2 = zzerw.zza(this.zza);
        zzawc zzawcVar = new zzawc();
        zzbza zzbzaVar2 = (zzbza) this.zzb.zzag.zzb();
        ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) this.zzb.zzm.zzb();
        zzgwm.zzb(zzfwnVar);
        return new zzerb(contextZza, zzfwnVar, zzfsh.zzp(zzeqyVarZza, zzeqyVarZzb, zzeqyVarZza2, zzeqyVarZzc, zzetzVar, zzesjVar, new zzesy(zzawoVar, zzfwnVar, contextZza5), new zzetj(zzbaxVar, zzfwnVar, zzery.zza(this.zza)), new zzert(zzbyrVar2, zzfwnVar, zzesb.zza(this.zza), zzesc.zza(this.zza), zzerx.zza(this.zza)), new zzesu(zzbyrVar3, iZza, contextZza6, zzbzaVar, scheduledExecutorService3, zzfwnVar, zzerw.zza(this.zza)), (zzeqy) this.zzb.zzaI.zzb(), zzesq.zza(strZza2, zzawcVar, zzbzaVar2, scheduledExecutorService4, zzfwnVar)), (zzffy) this.zzd.zzb(), (zzdqa) this.zzb.zzZ.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final zzfel zzb() {
        return (zzfel) this.zzn.zzb();
    }
}
