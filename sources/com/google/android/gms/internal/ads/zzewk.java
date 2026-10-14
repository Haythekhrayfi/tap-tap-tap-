package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewk implements zzexe {
    private final zzexe zza;
    private final zzexe zzb;
    private final zzfcq zzc;
    private final String zzd;
    private zzcun zze;
    private final Executor zzf;

    public zzewk(zzexe zzexeVar, zzexe zzexeVar2, zzfcq zzfcqVar, String str, Executor executor) {
        this.zza = zzexeVar;
        this.zzb = zzexeVar2;
        this.zzc = zzfcqVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final zzfwm zzg(zzfcd zzfcdVar, zzexf zzexfVar) {
        zzcun zzcunVar = zzfcdVar.zza;
        this.zze = zzcunVar;
        if (zzfcdVar.zzc != null) {
            if (zzcunVar.zzf() != null) {
                zzfcdVar.zzc.zzo().zzbG(zzfcdVar.zza.zzf());
            }
            return zzfwc.zzh(zzfcdVar.zzc);
        }
        zzcunVar.zzb().zzl(zzfcdVar.zzb);
        return ((zzewu) this.zza).zzb(zzexfVar, null, zzfcdVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzexe
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcun zzd() {
        return this.zze;
    }

    public final /* synthetic */ zzfwm zzb(zzexf zzexfVar, zzewj zzewjVar, zzexd zzexdVar, zzcun zzcunVar, zzewp zzewpVar) throws Exception {
        if (zzewpVar != null) {
            zzewj zzewjVar2 = new zzewj(zzewjVar.zza, zzewjVar.zzb, zzewjVar.zzc, zzewjVar.zzd, zzewjVar.zze, zzewjVar.zzf, zzewpVar.zza);
            if (zzewpVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzewjVar2);
                return zzg(zzewpVar.zzc, zzexfVar);
            }
            zzfwm zzfwmVarZza = this.zzc.zza(zzewjVar2);
            if (zzfwmVarZza != null) {
                this.zze = null;
                return zzfwc.zzm(zzfwmVarZza, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzewg
                    @Override // com.google.android.gms.internal.ads.zzfvj
                    public final zzfwm zza(Object obj) {
                        return this.zza.zze((zzfcn) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzewjVar2);
            zzexfVar = new zzexf(zzexfVar.zzb, zzewpVar.zzb);
        }
        zzfwm zzfwmVarZzb = ((zzewu) this.zza).zzb(zzexfVar, zzexdVar, zzcunVar);
        this.zze = zzcunVar;
        return zzfwmVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzexe
    public final /* bridge */ /* synthetic */ zzfwm zzc(zzexf zzexfVar, zzexd zzexdVar, Object obj) {
        return zzf(zzexfVar, zzexdVar, null);
    }

    public final /* synthetic */ zzfwm zze(zzfcn zzfcnVar) throws Exception {
        zzfcp zzfcpVar;
        if (zzfcnVar == null || zzfcnVar.zza == null || (zzfcpVar = zzfcnVar.zzb) == null) {
            throw new zzdtx(1, "Empty prefetch");
        }
        zzaxo zzaxoVarZza = zzaxu.zza();
        zzaxm zzaxmVarZza = zzaxn.zza();
        zzaxmVarZza.zzd(2);
        zzaxmVarZza.zzb(zzaxr.zzd());
        zzaxoVarZza.zza(zzaxmVarZza);
        zzfcnVar.zza.zza.zzb().zzc().zzi((zzaxu) zzaxoVarZza.zzal());
        return zzg(zzfcnVar.zza, ((zzewj) zzfcpVar).zzb);
    }

    public final synchronized zzfwm zzf(final zzexf zzexfVar, final zzexd zzexdVar, zzcun zzcunVar) {
        zzcum zzcumVarZza = zzexdVar.zza(zzexfVar.zzb);
        zzcumVarZza.zza(new zzewl(this.zzd));
        final zzcun zzcunVar2 = (zzcun) zzcumVarZza.zzh();
        zzcunVar2.zzg();
        zzcunVar2.zzg();
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzcunVar2.zzg().zzd;
        if (zzlVar.zzs == null && zzlVar.zzx == null) {
            zzfai zzfaiVarZzg = zzcunVar2.zzg();
            final zzewj zzewjVar = new zzewj(zzexdVar, zzexfVar, zzfaiVarZzg.zzd, zzfaiVarZzg.zzf, this.zzf, zzfaiVarZzg.zzj, null);
            return zzfwc.zzm(zzfvt.zzv(((zzewq) this.zzb).zzb(zzexfVar, zzexdVar, zzcunVar2)), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzewh
                @Override // com.google.android.gms.internal.ads.zzfvj
                public final zzfwm zza(Object obj) {
                    return this.zza.zzb(zzexfVar, zzewjVar, zzexdVar, zzcunVar2, (zzewp) obj);
                }
            }, this.zzf);
        }
        this.zze = zzcunVar2;
        return ((zzewu) this.zza).zzb(zzexfVar, zzexdVar, zzcunVar2);
    }
}
