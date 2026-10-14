package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfw extends zzcb implements zzdg {
    private static final zzfw zzb;
    private int zzd;
    private int zze;

    static {
        zzfw zzfwVar = new zzfw();
        zzb = zzfwVar;
        zzcb.zzp(zzfw.class, zzfwVar);
    }

    private zzfw() {
    }

    public static zzfu zzv() {
        return (zzfu) zzb.zzg();
    }

    public static /* synthetic */ void zzx(zzfw zzfwVar, int i10) {
        zzfwVar.zze = i10 - 1;
        zzfwVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcb
    public final Object zzu(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzcb.zzm(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzfv.zza});
        }
        if (i11 == 3) {
            return new zzfw();
        }
        zzft zzftVar = null;
        if (i11 == 4) {
            return new zzfu(zzftVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
