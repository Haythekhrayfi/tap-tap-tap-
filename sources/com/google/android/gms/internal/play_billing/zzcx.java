package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
final class zzcx implements zzdq {
    private static final zzdd zza = new zzcv();
    private final zzdd zzb;

    public zzcx() {
        zzdd zzddVar;
        zzdd[] zzddVarArr = new zzdd[2];
        zzddVarArr[0] = zzbw.zza();
        try {
            zzddVar = (zzdd) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzddVar = zza;
        }
        zzddVarArr[1] = zzddVar;
        zzcw zzcwVar = new zzcw(zzddVarArr);
        byte[] bArr = zzcg.zzd;
        this.zzb = zzcwVar;
    }

    private static boolean zzb(zzdc zzdcVar) {
        return zzdcVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdq
    public final zzdp zza(Class cls) {
        zzdk zzdkVarZza;
        zzct zzctVarZzc;
        zzeg zzegVarZzy;
        zzbo zzboVarZza;
        zzda zzdaVarZza;
        zzeg zzegVarZzy2;
        zzbo zzboVarZza2;
        zzdr.zzC(cls);
        zzdc zzdcVarZzb = this.zzb.zzb(cls);
        if (zzdcVarZzb.zzb()) {
            if (zzcb.class.isAssignableFrom(cls)) {
                zzegVarZzy2 = zzdr.zzz();
                zzboVarZza2 = zzbq.zzb();
            } else {
                zzegVarZzy2 = zzdr.zzy();
                zzboVarZza2 = zzbq.zza();
            }
            return zzdj.zzc(zzegVarZzy2, zzboVarZza2, zzdcVarZzb.zza());
        }
        if (zzcb.class.isAssignableFrom(cls)) {
            boolean zZzb = zzb(zzdcVarZzb);
            zzdkVarZza = zzdl.zzb();
            zzctVarZzc = zzct.zzd();
            zzegVarZzy = zzdr.zzz();
            zzboVarZza = zZzb ? zzbq.zzb() : null;
            zzdaVarZza = zzdb.zzb();
        } else {
            boolean zZzb2 = zzb(zzdcVarZzb);
            zzdkVarZza = zzdl.zza();
            zzctVarZzc = zzct.zzc();
            zzegVarZzy = zzdr.zzy();
            zzboVarZza = zZzb2 ? zzbq.zza() : null;
            zzdaVarZza = zzdb.zza();
        }
        return zzdi.zzl(cls, zzdcVarZzb, zzdkVarZza, zzctVarZzc, zzegVarZzy, zzboVarZza, zzdaVarZza);
    }
}
