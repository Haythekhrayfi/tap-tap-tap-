package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes2.dex */
final class zzbqn implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbqo zza;

    public zzbqn(zzbqo zzbqoVar) {
        this.zza = zzbqoVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzg("Operation denied by user.");
    }
}
