package com.google.android.gms.internal.ads;

import android.support.v4.media.b;

/* JADX INFO: loaded from: classes2.dex */
final class zzfbx {
    private final zzfbw zza = new zzfbw();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public final zzfbw zza() {
        zzfbw zzfbwVarClone = this.zza.clone();
        zzfbw zzfbwVar = this.zza;
        zzfbwVar.zza = false;
        zzfbwVar.zzb = false;
        return zzfbwVarClone;
    }

    public final String zzb() {
        StringBuilder sbA = defpackage.a.a("\n\tPool does not exist: ");
        sbA.append(this.zzd);
        sbA.append("\n\tNew pools created: ");
        sbA.append(this.zzb);
        sbA.append("\n\tPools removed: ");
        sbA.append(this.zzc);
        sbA.append("\n\tEntries added: ");
        sbA.append(this.zzf);
        sbA.append("\n\tNo entries retrieved: ");
        return b.a(sbA, this.zze, "\n");
    }

    public final void zzc() {
        this.zzf++;
    }

    public final void zzd() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zze() {
        this.zze++;
    }

    public final void zzf() {
        this.zzd++;
    }

    public final void zzg() {
        this.zzc++;
        this.zza.zzb = true;
    }
}
