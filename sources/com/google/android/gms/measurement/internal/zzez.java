package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class zzez {
    public final /* synthetic */ zzfd zza;
    private final String zzb;
    private final long zzc;
    private boolean zzd;
    private long zze;

    public zzez(zzfd zzfdVar, String str, long j10) {
        this.zza = zzfdVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = j10;
    }

    public final long zza() {
        if (!this.zzd) {
            this.zzd = true;
            this.zze = this.zza.zza().getLong(this.zzb, this.zzc);
        }
        return this.zze;
    }

    public final void zzb(long j10) {
        SharedPreferences.Editor editorEdit = this.zza.zza().edit();
        editorEdit.putLong(this.zzb, j10);
        editorEdit.apply();
        this.zze = j10;
    }
}
