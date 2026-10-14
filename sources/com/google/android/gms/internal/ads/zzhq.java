package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhq extends zzcw {
    private final int zzc;
    private final zzvi zzd;

    public zzhq(boolean z10, zzvi zzviVar) {
        this.zzd = zzviVar;
        this.zzc = zzviVar.zzc();
    }

    private final int zzw(int i10, boolean z10) {
        if (z10) {
            return this.zzd.zzd(i10);
        }
        if (i10 >= this.zzc - 1) {
            return -1;
        }
        return i10 + 1;
    }

    private final int zzx(int i10, boolean z10) {
        if (z10) {
            return this.zzd.zze(i10);
        }
        if (i10 <= 0) {
            return -1;
        }
        return i10 - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final int zza(Object obj) {
        int iZza;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iZzp = zzp(obj2);
        if (iZzp == -1 || (iZza = zzu(iZzp).zza(obj3)) == -1) {
            return -1;
        }
        return zzs(iZzp) + iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final zzct zzd(int i10, zzct zzctVar, boolean z10) {
        int iZzq = zzq(i10);
        int iZzt = zzt(iZzq);
        zzu(iZzq).zzd(i10 - zzs(iZzq), zzctVar, z10);
        zzctVar.zzd += iZzt;
        if (z10) {
            Object objZzv = zzv(iZzq);
            Object obj = zzctVar.zzc;
            Objects.requireNonNull(obj);
            zzctVar.zzc = Pair.create(objZzv, obj);
        }
        return zzctVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final zzcv zze(int i10, zzcv zzcvVar, long j10) {
        int iZzr = zzr(i10);
        int iZzt = zzt(iZzr);
        int iZzs = zzs(iZzr);
        zzu(iZzr).zze(i10 - iZzt, zzcvVar, j10);
        Object objZzv = zzv(iZzr);
        if (!zzcv.zza.equals(zzcvVar.zzc)) {
            objZzv = Pair.create(objZzv, zzcvVar.zzc);
        }
        zzcvVar.zzc = objZzv;
        zzcvVar.zzo += iZzs;
        zzcvVar.zzp += iZzs;
        return zzcvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final Object zzf(int i10) {
        int iZzq = zzq(i10);
        return Pair.create(zzv(iZzq), zzu(iZzq).zzf(i10 - zzs(iZzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final int zzg(boolean z10) {
        if (this.zzc == 0) {
            return -1;
        }
        int iZza = z10 ? this.zzd.zza() : 0;
        while (zzu(iZza).zzo()) {
            iZza = zzw(iZza, z10);
            if (iZza == -1) {
                return -1;
            }
        }
        return zzu(iZza).zzg(z10) + zzt(iZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final int zzh(boolean z10) {
        int i10 = this.zzc;
        if (i10 == 0) {
            return -1;
        }
        int iZzb = z10 ? this.zzd.zzb() : i10 - 1;
        while (zzu(iZzb).zzo()) {
            iZzb = zzx(iZzb, z10);
            if (iZzb == -1) {
                return -1;
            }
        }
        return zzu(iZzb).zzh(z10) + zzt(iZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final int zzj(int i10, int i11, boolean z10) {
        int iZzr = zzr(i10);
        int iZzt = zzt(iZzr);
        int iZzj = zzu(iZzr).zzj(i10 - iZzt, i11 == 2 ? 0 : i11, z10);
        if (iZzj != -1) {
            return iZzt + iZzj;
        }
        int iZzw = zzw(iZzr, z10);
        while (iZzw != -1 && zzu(iZzw).zzo()) {
            iZzw = zzw(iZzw, z10);
        }
        if (iZzw != -1) {
            return zzu(iZzw).zzg(z10) + zzt(iZzw);
        }
        if (i11 == 2) {
            return zzg(z10);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final int zzk(int i10, int i11, boolean z10) {
        int iZzr = zzr(i10);
        int iZzt = zzt(iZzr);
        int iZzk = zzu(iZzr).zzk(i10 - iZzt, 0, false);
        if (iZzk != -1) {
            return iZzt + iZzk;
        }
        int iZzx = zzx(iZzr, false);
        while (iZzx != -1 && zzu(iZzx).zzo()) {
            iZzx = zzx(iZzx, false);
        }
        if (iZzx == -1) {
            return -1;
        }
        return zzu(iZzx).zzh(false) + zzt(iZzx);
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final zzct zzn(Object obj, zzct zzctVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iZzp = zzp(obj2);
        int iZzt = zzt(iZzp);
        zzu(iZzp).zzn(obj3, zzctVar);
        zzctVar.zzd += iZzt;
        zzctVar.zzc = obj;
        return zzctVar;
    }

    public abstract int zzp(Object obj);

    public abstract int zzq(int i10);

    public abstract int zzr(int i10);

    public abstract int zzs(int i10);

    public abstract int zzt(int i10);

    public abstract zzcw zzu(int i10);

    public abstract Object zzv(int i10);
}
