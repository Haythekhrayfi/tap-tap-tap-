package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfs extends zzcb implements zzdg {
    private static final zzfs zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        zzfs zzfsVar = new zzfs();
        zzb = zzfsVar;
        zzcb.zzp(zzfs.class, zzfsVar);
    }

    private zzfs() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzcb
    public final Object zzu(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzcb.zzm(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", zzfo.zza, "zzf"});
        }
        if (i11 == 3) {
            return new zzfs();
        }
        zzfq zzfqVar = null;
        if (i11 == 4) {
            return new zzfr(zzfqVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
