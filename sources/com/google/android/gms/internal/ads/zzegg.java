package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzegg implements zzeci {
    private final Context zza;
    private final zzdmr zzb;

    public zzegg(Context context, zzdmr zzdmrVar) {
        this.zza = context;
        this.zzb = zzdmrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeci
    public final /* bridge */ /* synthetic */ Object zza(zzezz zzezzVar, zzezn zzeznVar, zzecf zzecfVar) throws zzefu, zzfan {
        zzeeh zzeehVar = new zzeeh(zzeznVar, (zzbpt) zzecfVar.zzb, AdFormat.REWARDED);
        zzdmn zzdmnVarZze = this.zzb.zze(new zzcrs(zzezzVar, zzeznVar, zzecfVar.zza), new zzdmo(zzeehVar));
        zzeehVar.zzb(zzdmnVarZze.zzc());
        ((zzedy) zzecfVar.zzc).zzc(zzdmnVarZze.zzn());
        return zzdmnVarZze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzeci
    public final void zzb(zzezz zzezzVar, zzezn zzeznVar, zzecf zzecfVar) throws zzfan {
        try {
            ((zzbpt) zzecfVar.zzb).zzq(zzeznVar.zzaa);
            if (zzezzVar.zza.zza.zzo.zza == 3) {
                ((zzbpt) zzecfVar.zzb).zzo(zzeznVar.zzV, zzeznVar.zzw.toString(), zzezzVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzegf(this, zzecfVar, null), (zzboc) zzecfVar.zzc);
            } else {
                ((zzbpt) zzecfVar.zzb).zzp(zzeznVar.zzV, zzeznVar.zzw.toString(), zzezzVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzegf(this, zzecfVar, null), (zzboc) zzecfVar.zzc);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e10);
        }
    }
}
