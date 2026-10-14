package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes2.dex */
final class zzbqs implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbqt zza;

    public zzbqs(zzbqt zzbqtVar) {
        this.zza = zzbqtVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzg("User canceled the download.");
    }
}
