package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
public final class zzfjm {
    private final Context zza;
    private final Looper zzb;

    public zzfjm(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfka zzfkaVarZza = zzfkc.zza();
        zzfkaVarZza.zza(this.zza.getPackageName());
        zzfkaVarZza.zzc(2);
        zzfjx zzfjxVarZza = zzfjy.zza();
        zzfjxVarZza.zza(str);
        zzfjxVarZza.zzb(2);
        zzfkaVarZza.zzb(zzfjxVarZza);
        new zzfjn(this.zza, this.zzb, (zzfkc) zzfkaVarZza.zzal()).zza();
    }
}
