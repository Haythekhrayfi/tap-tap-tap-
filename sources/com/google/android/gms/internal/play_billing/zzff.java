package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzff extends zzcb implements zzdg {
    private static final zzff zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        zzff zzffVar = new zzff();
        zzb = zzffVar;
        zzcb.zzp(zzff.class, zzffVar);
    }

    private zzff() {
    }

    public static zzfe zzv() {
        return (zzfe) zzb.zzg();
    }

    public static /* synthetic */ void zzx(zzff zzffVar, zzfw zzfwVar) {
        Objects.requireNonNull(zzfwVar);
        zzffVar.zzf = zzfwVar;
        zzffVar.zze = 2;
    }

    public static /* synthetic */ void zzy(zzff zzffVar, int i10) {
        zzffVar.zzg = i10 - 1;
        zzffVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcb
    public final Object zzu(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzcb.zzm(zzb, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzfc.zza, zzfw.class});
        }
        if (i11 == 3) {
            return new zzff();
        }
        zzfd zzfdVar = null;
        if (i11 == 4) {
            return new zzfe(zzfdVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
