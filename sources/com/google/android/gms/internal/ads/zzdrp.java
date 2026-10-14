package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdrp implements zzdqz {
    private final long zza;
    private final zzdre zzb;
    private final zzeze zzc;

    public zzdrp(long j10, Context context, zzdre zzdreVar, zzcgu zzcguVar, String str) {
        this.zza = j10;
        this.zzb = zzdreVar;
        zzezg zzezgVarZzu = zzcguVar.zzu();
        zzezgVarZzu.zzb(context);
        zzezgVarZzu.zza(str);
        this.zzc = zzezgVarZzu.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        try {
            this.zzc.zzf(zzlVar, new zzdrn(this));
        } catch (RemoteException e10) {
            zzbzr.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzc() {
        try {
            this.zzc.zzk(new zzdro(this));
            this.zzc.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e10) {
            zzbzr.zzl("#007 Could not call remote method.", e10);
        }
    }
}
