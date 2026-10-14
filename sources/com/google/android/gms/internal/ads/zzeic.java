package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeic {
    private final zzdeo zza;

    public zzeic(zzdeo zzdeoVar) {
        this.zza = zzdeoVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzezz zzezzVar, zzezn zzeznVar, View view, zzehy zzehyVar) {
        zzddo zzddoVarZze = this.zza.zze(new zzcrs(zzezzVar, zzeznVar, null), new zzeia(this, new zzdew() { // from class: com.google.android.gms.internal.ads.zzehz
            @Override // com.google.android.gms.internal.ads.zzdew
            public final void zza(boolean z10, Context context, zzcvt zzcvtVar) {
            }
        }));
        zzehyVar.zzd(new zzeib(this, zzddoVarZze));
        return zzddoVarZze.zzg();
    }
}
