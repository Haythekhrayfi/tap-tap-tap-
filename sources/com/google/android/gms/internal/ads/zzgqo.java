package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgqo implements zzgrq {
    private static final zzgqu zza = new zzgqm();
    private final zzgqu zzb;

    public zzgqo() {
        zzgqu zzgquVar;
        zzgqu[] zzgquVarArr = new zzgqu[2];
        zzgquVarArr[0] = zzgph.zza();
        try {
            zzgquVar = (zzgqu) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzgquVar = zza;
        }
        zzgquVarArr[1] = zzgquVar;
        zzgqn zzgqnVar = new zzgqn(zzgquVarArr);
        byte[] bArr = zzgpw.zzd;
        this.zzb = zzgqnVar;
    }

    private static boolean zzb(zzgqt zzgqtVar) {
        return zzgqtVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final zzgrp zza(Class cls) {
        zzgrb zzgrbVarZza;
        zzgqk zzgqkVarZzd;
        zzgsg zzgsgVarZzy;
        zzgoz zzgozVarZza;
        zzgqr zzgqrVarZza;
        zzgsg zzgsgVarZzy2;
        zzgoz zzgozVarZza2;
        zzgrr.zzD(cls);
        zzgqt zzgqtVarZzb = this.zzb.zzb(cls);
        if (zzgqtVarZzb.zzb()) {
            if (zzgpm.class.isAssignableFrom(cls)) {
                zzgsgVarZzy2 = zzgrr.zzz();
                zzgozVarZza2 = zzgpb.zzb();
            } else {
                zzgsgVarZzy2 = zzgrr.zzy();
                zzgozVarZza2 = zzgpb.zza();
            }
            return zzgra.zzc(zzgsgVarZzy2, zzgozVarZza2, zzgqtVarZzb.zza());
        }
        if (zzgpm.class.isAssignableFrom(cls)) {
            boolean zZzb = zzb(zzgqtVarZzb);
            zzgrbVarZza = zzgrc.zzb();
            zzgqkVarZzd = zzgqk.zze();
            zzgsgVarZzy = zzgrr.zzz();
            zzgozVarZza = zZzb ? zzgpb.zzb() : null;
            zzgqrVarZza = zzgqs.zzb();
        } else {
            boolean zZzb2 = zzb(zzgqtVarZzb);
            zzgrbVarZza = zzgrc.zza();
            zzgqkVarZzd = zzgqk.zzd();
            zzgsgVarZzy = zzgrr.zzy();
            zzgozVarZza = zZzb2 ? zzgpb.zza() : null;
            zzgqrVarZza = zzgqs.zza();
        }
        return zzgqz.zzl(cls, zzgqtVarZzb, zzgrbVarZza, zzgqkVarZzd, zzgsgVarZzy, zzgozVarZza, zzgqrVarZza);
    }
}
