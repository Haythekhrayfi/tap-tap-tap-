package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzgsg {
    public abstract int zza(Object obj);

    public abstract int zzb(Object obj);

    public abstract Object zzc(Object obj);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract void zzh(Object obj, int i10, int i11);

    public abstract void zzi(Object obj, int i10, long j10);

    public abstract void zzj(Object obj, int i10, Object obj2);

    public abstract void zzk(Object obj, int i10, zzgoe zzgoeVar);

    public abstract void zzl(Object obj, int i10, long j10);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public final boolean zzp(Object obj, zzgrh zzgrhVar) throws IOException {
        int iZzd = zzgrhVar.zzd();
        int i10 = iZzd >>> 3;
        int i11 = iZzd & 7;
        if (i11 == 0) {
            zzl(obj, i10, zzgrhVar.zzl());
            return true;
        }
        if (i11 == 1) {
            zzi(obj, i10, zzgrhVar.zzk());
            return true;
        }
        if (i11 == 2) {
            zzk(obj, i10, zzgrhVar.zzp());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw zzgpy.zza();
            }
            zzh(obj, i10, zzgrhVar.zzf());
            return true;
        }
        Object objZzf = zzf();
        int i12 = i10 << 3;
        while (zzgrhVar.zzc() != Integer.MAX_VALUE && zzp(objZzf, zzgrhVar)) {
        }
        if ((4 | i12) != zzgrhVar.zzd()) {
            throw zzgpy.zzb();
        }
        zzg(objZzf);
        zzj(obj, i10, objZzf);
        return true;
    }

    public abstract boolean zzq(zzgrh zzgrhVar);

    public abstract void zzr(Object obj, zzgou zzgouVar) throws IOException;
}
