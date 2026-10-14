package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
@TargetApi(18)
final class zzfnj {
    private static final zzfnw zzb = new zzfnw("OverlayDisplayService");
    private static final Intent zzc = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    public final zzfoh zza;
    private final String zzd;

    public zzfnj(Context context) {
        this.zza = zzfok.zza(context) ? new zzfoh(context.getApplicationContext(), zzb, "OverlayDisplayService", zzc, zzfne.zza, null) : null;
        this.zzd = context.getPackageName();
    }

    public final void zzc() {
        if (this.zza == null) {
            return;
        }
        zzb.zzc("unbind LMD display overlay service", new Object[0]);
        this.zza.zzu();
    }

    public final void zzd(zzfna zzfnaVar, zzfno zzfnoVar) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfng(this, taskCompletionSource, zzfnaVar, zzfnoVar, taskCompletionSource), taskCompletionSource);
        }
    }

    public final void zze(zzfnl zzfnlVar, zzfno zzfnoVar) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
            return;
        }
        if (zzfnlVar.zzg() != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfnf(this, taskCompletionSource, zzfnlVar, zzfnoVar, taskCompletionSource), taskCompletionSource);
        } else {
            zzb.zza("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            zzfnm zzfnmVarZzc = zzfnn.zzc();
            zzfnmVarZzc.zzb(8160);
            zzfnoVar.zza(zzfnmVarZzc.zzc());
        }
    }

    public final void zzf(zzfnq zzfnqVar, zzfno zzfnoVar, int i10) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfnh(this, taskCompletionSource, zzfnqVar, i10, zzfnoVar, taskCompletionSource), taskCompletionSource);
        }
    }
}
