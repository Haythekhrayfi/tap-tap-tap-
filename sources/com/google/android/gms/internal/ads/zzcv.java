package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcv {
    private static final String zzA;
    private static final String zzB;
    private static final String zzC;
    private static final String zzD;
    private static final String zzE;
    public static final zzn zzb;
    private static final zzbp zzr;
    private static final String zzs;
    private static final String zzt;
    private static final String zzu;
    private static final String zzv;
    private static final String zzw;
    private static final String zzx;
    private static final String zzy;
    private static final String zzz;
    public Object zzc = zza;
    public zzbp zzd = zzr;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;

    @Deprecated
    public boolean zzj;
    public zzbf zzk;
    public boolean zzl;
    public long zzm;
    public long zzn;
    public int zzo;
    public int zzp;
    public static final Object zza = new Object();
    private static final Object zzq = new Object();

    static {
        zzar zzarVar = new zzar();
        zzarVar.zza("androidx.media3.common.Timeline");
        zzarVar.zzb(Uri.EMPTY);
        zzr = zzarVar.zzc();
        zzs = Integer.toString(1, 36);
        zzt = Integer.toString(2, 36);
        zzu = Integer.toString(3, 36);
        zzv = Integer.toString(4, 36);
        zzw = Integer.toString(5, 36);
        zzx = Integer.toString(6, 36);
        zzy = Integer.toString(7, 36);
        zzz = Integer.toString(8, 36);
        zzA = Integer.toString(9, 36);
        zzB = Integer.toString(10, 36);
        zzC = Integer.toString(11, 36);
        zzD = Integer.toString(12, 36);
        zzE = Integer.toString(13, 36);
        zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcu
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcv.class.equals(obj.getClass())) {
            zzcv zzcvVar = (zzcv) obj;
            if (zzfj.zzC(this.zzc, zzcvVar.zzc) && zzfj.zzC(this.zzd, zzcvVar.zzd) && zzfj.zzC(null, null) && zzfj.zzC(this.zzk, zzcvVar.zzk) && this.zze == zzcvVar.zze && this.zzf == zzcvVar.zzf && this.zzg == zzcvVar.zzg && this.zzh == zzcvVar.zzh && this.zzi == zzcvVar.zzi && this.zzl == zzcvVar.zzl && this.zzn == zzcvVar.zzn && this.zzo == zzcvVar.zzo && this.zzp == zzcvVar.zzp) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.zzc.hashCode() + 217) * 31) + this.zzd.hashCode();
        zzbf zzbfVar = this.zzk;
        int iHashCode2 = ((iHashCode * 961) + (zzbfVar == null ? 0 : zzbfVar.hashCode())) * 31;
        long j10 = this.zze;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.zzf;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.zzg;
        int i12 = ((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzl ? 1 : 0);
        long j13 = this.zzn;
        return ((((((i12 * 961) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.zzo) * 31) + this.zzp) * 31;
    }

    public final zzcv zza(Object obj, zzbp zzbpVar, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, zzbf zzbfVar, long j13, long j14, int i10, int i11, long j15) {
        this.zzc = obj;
        this.zzd = zzbpVar == null ? zzr : zzbpVar;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = z10;
        this.zzi = z11;
        this.zzj = zzbfVar != null;
        this.zzk = zzbfVar;
        this.zzm = 0L;
        this.zzn = j14;
        this.zzo = 0;
        this.zzp = 0;
        this.zzl = false;
        return this;
    }

    public final boolean zzb() {
        zzdy.zzf(this.zzj == (this.zzk != null));
        return this.zzk != null;
    }
}
