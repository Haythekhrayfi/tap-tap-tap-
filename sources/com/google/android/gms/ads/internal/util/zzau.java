package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
final class zzau implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzav zza;

    public zzau(zzav zzavVar) {
        this.zza = zzavVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        com.google.android.gms.ads.internal.zzt.zzp();
        zzs.zzQ(this.zza.zza, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
