package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzecv implements zzeci {
    private final Context zza;
    private final zzcop zzb;

    public zzecv(Context context, zzcop zzcopVar) {
        this.zza = context;
        this.zzb = zzcopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeci
    public final /* bridge */ /* synthetic */ Object zza(zzezz zzezzVar, zzezn zzeznVar, zzecf zzecfVar) throws zzefu, zzfan {
        zzeeh zzeehVar = new zzeeh(zzeznVar, (zzbpt) zzecfVar.zzb, AdFormat.APP_OPEN_AD);
        zzcom zzcomVarZza = this.zzb.zza(new zzcrs(zzezzVar, zzeznVar, zzecfVar.zza), new zzddr(zzeehVar, null), new zzcon(zzeznVar.zzab));
        zzeehVar.zzb(zzcomVarZza.zzc());
        ((zzedy) zzecfVar.zzc).zzc(zzcomVarZza.zzi());
        return zzcomVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeci
    public final void zzb(zzezz zzezzVar, zzezn zzeznVar, zzecf zzecfVar) throws zzfan {
        try {
            ((zzbpt) zzecfVar.zzb).zzq(zzeznVar.zzaa);
            ((zzbpt) zzecfVar.zzb).zzi(zzeznVar.zzV, zzeznVar.zzw.toString(), zzezzVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzecu(zzecfVar, null), (zzboc) zzecfVar.zzc);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e10);
            throw new zzfan(e10);
        }
    }
}
