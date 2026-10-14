package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzga extends zzke implements zzlm {
    private static final zzga zza;
    private zzkl zze = zzke.zzbD();

    static {
        zzga zzgaVar = new zzga();
        zza = zzgaVar;
        zzke.zzbJ(zzga.class, zzgaVar);
    }

    private zzga() {
    }

    public static zzfz zza() {
        return (zzfz) zza.zzbx();
    }

    public static /* synthetic */ void zze(zzga zzgaVar, zzgc zzgcVar) {
        Objects.requireNonNull(zzgcVar);
        zzkl zzklVar = zzgaVar.zze;
        if (!zzklVar.zzc()) {
            zzgaVar.zze = zzke.zzbE(zzklVar);
        }
        zzgaVar.zze.add(zzgcVar);
    }

    public final zzgc zzc(int i10) {
        return (zzgc) this.zze.get(0);
    }

    public final List zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzke.zzbI(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzgc.class});
        }
        if (i11 == 3) {
            return new zzga();
        }
        zzfj zzfjVar = null;
        if (i11 == 4) {
            return new zzfz(zzfjVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
