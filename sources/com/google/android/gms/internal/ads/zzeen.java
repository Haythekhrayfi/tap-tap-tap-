package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeen implements zzeci {
    private final Context zza;
    private final zzdeo zzb;

    public zzeen(Context context, zzdeo zzdeoVar) {
        this.zza = context;
        this.zzb = zzdeoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeci
    public final /* bridge */ /* synthetic */ Object zza(zzezz zzezzVar, zzezn zzeznVar, zzecf zzecfVar) throws zzefu, zzfan {
        zzeeh zzeehVar = new zzeeh(zzeznVar, (zzbpt) zzecfVar.zzb, AdFormat.INTERSTITIAL);
        zzddo zzddoVarZze = this.zzb.zze(new zzcrs(zzezzVar, zzeznVar, zzecfVar.zza), new zzddr(zzeehVar, null));
        zzeehVar.zzb(zzddoVarZze.zzc());
        ((zzedy) zzecfVar.zzc).zzc(zzddoVarZze.zzi());
        return zzddoVarZze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzeci
    public final void zzb(zzezz zzezzVar, zzezn zzeznVar, zzecf zzecfVar) throws zzfan {
        try {
            ((zzbpt) zzecfVar.zzb).zzq(zzeznVar.zzaa);
            ((zzbpt) zzecfVar.zzb).zzl(zzeznVar.zzV, zzeznVar.zzw.toString(), zzezzVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeem(this, zzecfVar, null), (zzboc) zzecfVar.zzc);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e10);
            throw new zzfan(e10);
        }
    }
}
