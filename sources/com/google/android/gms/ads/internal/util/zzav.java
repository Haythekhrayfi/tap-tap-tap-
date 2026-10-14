package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
final class zzav implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ boolean zzd;

    public zzav(zzaw zzawVar, Context context, String str, boolean z10, boolean z11) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder builderZzG = zzs.zzG(this.zza);
        builderZzG.setMessage(this.zzb);
        builderZzG.setTitle(this.zzc ? "Error" : "Info");
        if (this.zzd) {
            builderZzG.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderZzG.setPositiveButton("Learn More", new zzau(this));
            builderZzG.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderZzG.create().show();
    }
}
