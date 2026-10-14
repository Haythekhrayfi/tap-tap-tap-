package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class zzfni extends zzfnu {
    public final /* synthetic */ zzfnj zza;
    private final zzfno zzb;

    public zzfni(zzfnj zzfnjVar, zzfno zzfnoVar) {
        this.zza = zzfnjVar;
        this.zzb = zzfnoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzb(Bundle bundle) {
        int i10 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfnm zzfnmVarZzc = zzfnn.zzc();
        zzfnmVarZzc.zzb(i10);
        if (string != null) {
            zzfnmVarZzc.zza(string);
        }
        this.zzb.zza(zzfnmVarZzc.zzc());
        if (i10 == 8157) {
            this.zza.zzc();
        }
    }
}
