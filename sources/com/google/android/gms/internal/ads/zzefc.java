package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzefc implements zzeci {
    private final Context zza;
    private final zzdfk zzb;
    private zzbol zzc;
    private final zzbzx zzd;

    public zzefc(Context context, zzdfk zzdfkVar, zzbzx zzbzxVar) {
        this.zza = context;
        this.zzb = zzdfkVar;
        this.zzd = zzbzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeci
    public final /* bridge */ /* synthetic */ Object zza(zzezz zzezzVar, zzezn zzeznVar, zzecf zzecfVar) throws zzefu, zzfan {
        if (!zzezzVar.zza.zza.zzg.contains(Integer.toString(6))) {
            throw new zzefu(2, "Unified must be used for RTB.");
        }
        zzdha zzdhaVarZzs = zzdha.zzs(this.zzc);
        if (!zzezzVar.zza.zza.zzg.contains(Integer.toString(zzdhaVarZzs.zzc()))) {
            throw new zzefu(1, "No corresponding native ad listener");
        }
        zzdhc zzdhcVarZze = this.zzb.zze(new zzcrs(zzezzVar, zzeznVar, zzecfVar.zza), new zzdhm(zzdhaVarZzs), new zzdjb(null, null, this.zzc));
        ((zzedy) zzecfVar.zzc).zzc(zzdhcVarZze.zzi());
        return zzdhcVarZze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeci
    public final void zzb(zzezz zzezzVar, zzezn zzeznVar, zzecf zzecfVar) throws zzfan {
        try {
            ((zzbpt) zzecfVar.zzb).zzq(zzeznVar.zzaa);
            zzefa zzefaVar = null;
            if (this.zzd.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbB)).intValue()) {
                ((zzbpt) zzecfVar.zzb).zzm(zzeznVar.zzV, zzeznVar.zzw.toString(), zzezzVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzefb(this, zzecfVar, zzefaVar), (zzboc) zzecfVar.zzc);
            } else {
                ((zzbpt) zzecfVar.zzb).zzn(zzeznVar.zzV, zzeznVar.zzw.toString(), zzezzVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzefb(this, zzecfVar, zzefaVar), (zzboc) zzecfVar.zzc, zzezzVar.zza.zza.zzi);
            }
        } catch (RemoteException e10) {
            throw new zzfan(e10);
        }
    }
}
