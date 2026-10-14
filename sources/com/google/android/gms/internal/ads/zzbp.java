package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbp {
    public final String zzc;
    public final zzbi zzd;

    @Deprecated
    public final zzbi zze;
    public final zzbf zzf;
    public final zzbv zzg;
    public final zzav zzh;

    @Deprecated
    public final zzax zzi;
    public final zzbl zzj;
    public static final zzbp zza = new zzar().zzc();
    private static final String zzk = Integer.toString(0, 36);
    private static final String zzl = Integer.toString(1, 36);
    private static final String zzm = Integer.toString(2, 36);
    private static final String zzn = Integer.toString(3, 36);
    private static final String zzo = Integer.toString(4, 36);
    private static final String zzp = Integer.toString(5, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzao
    };

    public /* synthetic */ zzbp(String str, zzax zzaxVar, zzbi zzbiVar, zzbf zzbfVar, zzbv zzbvVar, zzbl zzblVar, zzbo zzboVar) {
        this.zzc = str;
        this.zzd = zzbiVar;
        this.zze = zzbiVar;
        this.zzf = zzbfVar;
        this.zzg = zzbvVar;
        this.zzh = zzaxVar;
        this.zzi = zzaxVar;
        this.zzj = zzblVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbp)) {
            return false;
        }
        zzbp zzbpVar = (zzbp) obj;
        return zzfj.zzC(this.zzc, zzbpVar.zzc) && this.zzh.equals(zzbpVar.zzh) && zzfj.zzC(this.zzd, zzbpVar.zzd) && zzfj.zzC(this.zzf, zzbpVar.zzf) && zzfj.zzC(this.zzg, zzbpVar.zzg) && zzfj.zzC(this.zzj, zzbpVar.zzj);
    }

    public final int hashCode() {
        int iHashCode = this.zzc.hashCode() * 31;
        zzbi zzbiVar = this.zzd;
        return (this.zzg.hashCode() + ((this.zzh.hashCode() + ((this.zzf.hashCode() + ((iHashCode + (zzbiVar != null ? zzbiVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
    }
}
