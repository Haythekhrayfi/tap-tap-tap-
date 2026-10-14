package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public class zzgqc {
    private static final zzgoy zzb = zzgoy.zza;
    public volatile zzgqw zza;
    private volatile zzgoe zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgqc)) {
            return false;
        }
        zzgqc zzgqcVar = (zzgqc) obj;
        zzgqw zzgqwVar = this.zza;
        zzgqw zzgqwVar2 = zzgqcVar.zza;
        if (zzgqwVar == null && zzgqwVar2 == null) {
            return zzb().equals(zzgqcVar.zzb());
        }
        if (zzgqwVar != null && zzgqwVar2 != null) {
            return zzgqwVar.equals(zzgqwVar2);
        }
        if (zzgqwVar != null) {
            zzgqcVar.zzc(zzgqwVar.zzbf());
            return zzgqwVar.equals(zzgqcVar.zza);
        }
        zzc(zzgqwVar2.zzbf());
        return this.zza.equals(zzgqwVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgoa) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaz();
        }
        return 0;
    }

    public final zzgoe zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            this.zzc = this.zza == null ? zzgoe.zzb : this.zza.zzau();
            return this.zzc;
        }
    }

    public final void zzc(zzgqw zzgqwVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzgqwVar;
                    this.zzc = zzgoe.zzb;
                } catch (zzgpy unused) {
                    this.zza = zzgqwVar;
                    this.zzc = zzgoe.zzb;
                }
            }
        }
    }
}
