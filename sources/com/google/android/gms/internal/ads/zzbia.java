package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzbia implements zzbij {
    @Override // com.google.android.gms.internal.ads.zzbij
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcez zzcezVar = (zzcez) obj;
        if (zzcezVar.zzJ() != null) {
            zzcezVar.zzJ().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = zzcezVar.zzL();
        if (zzlVarZzL != null) {
            zzlVarZzL.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzM = zzcezVar.zzM();
        if (zzlVarZzM != null) {
            zzlVarZzM.zzb();
        } else {
            zzbzr.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
