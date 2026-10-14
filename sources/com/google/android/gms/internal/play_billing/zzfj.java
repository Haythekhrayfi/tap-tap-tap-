package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfj extends zzcb implements zzdg {
    private static final zzfj zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        zzfj zzfjVar = new zzfj();
        zzb = zzfjVar;
        zzcb.zzp(zzfj.class, zzfjVar);
    }

    private zzfj() {
    }

    public static zzfh zzv() {
        return (zzfh) zzb.zzg();
    }

    public static /* synthetic */ void zzx(zzfj zzfjVar, int i10) {
        zzfjVar.zzd |= 1;
        zzfjVar.zze = i10;
    }

    public static /* synthetic */ void zzy(zzfj zzfjVar, String str) {
        Objects.requireNonNull(str);
        zzfjVar.zzd |= 2;
        zzfjVar.zzf = str;
    }

    public static /* synthetic */ void zzz(zzfj zzfjVar, int i10) {
        zzfjVar.zzg = i10 - 1;
        zzfjVar.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcb
    public final Object zzu(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzcb.zzm(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", zzfi.zza, "zzh"});
        }
        if (i11 == 3) {
            return new zzfj();
        }
        zzfg zzfgVar = null;
        if (i11 == 4) {
            return new zzfh(zzfgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
