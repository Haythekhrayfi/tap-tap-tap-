package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgj extends zzke implements zzlm {
    private static final zzgj zza;
    private int zze;
    private int zzf;
    private zzkk zzg = zzke.zzbB();

    static {
        zzgj zzgjVar = new zzgj();
        zza = zzgjVar;
        zzke.zzbJ(zzgj.class, zzgjVar);
    }

    private zzgj() {
    }

    public static zzgi zzd() {
        return (zzgi) zza.zzbx();
    }

    public static /* synthetic */ void zzg(zzgj zzgjVar, int i10) {
        zzgjVar.zze |= 1;
        zzgjVar.zzf = i10;
    }

    public static /* synthetic */ void zzh(zzgj zzgjVar, Iterable iterable) {
        zzkk zzkkVar = zzgjVar.zzg;
        if (!zzkkVar.zzc()) {
            zzgjVar.zzg = zzke.zzbC(zzkkVar);
        }
        zzin.zzbt(iterable, zzgjVar.zzg);
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zzf;
    }

    public final long zzc(int i10) {
        return this.zzg.zza(i10);
    }

    public final List zzf() {
        return this.zzg;
    }

    public final boolean zzi() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzke.zzbI(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzgj();
        }
        zzfj zzfjVar = null;
        if (i11 == 4) {
            return new zzgi(zzfjVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
