package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class zzex {
    public final /* synthetic */ zzfd zza;
    private final String zzb;
    private final boolean zzc;
    private boolean zzd;
    private boolean zze;

    public zzex(zzfd zzfdVar, String str, boolean z10) {
        this.zza = zzfdVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = z10;
    }

    public final void zza(boolean z10) {
        SharedPreferences.Editor editorEdit = this.zza.zza().edit();
        editorEdit.putBoolean(this.zzb, z10);
        editorEdit.apply();
        this.zze = z10;
    }

    public final boolean zzb() {
        if (!this.zzd) {
            this.zzd = true;
            this.zze = this.zza.zza().getBoolean(this.zzb, this.zzc);
        }
        return this.zze;
    }
}
