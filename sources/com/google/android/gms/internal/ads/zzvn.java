package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvn {
    public final int zzc;
    private final zzfsc zze;
    private int zzf;
    public static final zzvn zza = new zzvn(new zzcy[0]);
    private static final String zzd = Integer.toString(0, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzvm
    };

    /* JADX WARN: Multi-variable type inference failed */
    public zzvn(zzcy... zzcyVarArr) {
        this.zze = zzfsc.zzk(zzcyVarArr);
        this.zzc = zzcyVarArr.length;
        int i10 = 0;
        while (i10 < this.zze.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.zze.size(); i12++) {
                if (((zzcy) this.zze.get(i10)).equals(this.zze.get(i12))) {
                    zzer.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzvn.class == obj.getClass()) {
            zzvn zzvnVar = (zzvn) obj;
            if (this.zzc == zzvnVar.zzc && this.zze.equals(zzvnVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzf;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.zze.hashCode();
        this.zzf = iHashCode;
        return iHashCode;
    }

    public final int zza(zzcy zzcyVar) {
        int iIndexOf = this.zze.indexOf(zzcyVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzcy zzb(int i10) {
        return (zzcy) this.zze.get(i10);
    }
}
