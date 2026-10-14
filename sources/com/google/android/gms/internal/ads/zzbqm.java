package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
final class zzbqm implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbqo zza;

    public zzbqm(zzbqo zzbqoVar) {
        this.zza = zzbqoVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Intent intentZzb = this.zza.zzb();
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzs.zzP(this.zza.zzb, intentZzb);
    }
}
