package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzld implements zzlx {
    private static final zzlj zza = new zzlb();
    private final zzlj zzb;

    public zzld() {
        zzlj zzljVar;
        zzlj[] zzljVarArr = new zzlj[2];
        zzljVarArr[0] = zzjz.zza();
        try {
            zzljVar = (zzlj) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzljVar = zza;
        }
        zzljVarArr[1] = zzljVar;
        zzlc zzlcVar = new zzlc(zzljVarArr);
        zzkm.zzf(zzlcVar, "messageInfoFactory");
        this.zzb = zzlcVar;
    }

    private static boolean zzb(zzli zzliVar) {
        return zzliVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final zzlw zza(Class cls) {
        zzlq zzlqVarZza;
        zzkz zzkzVarZzc;
        zzmn zzmnVarZzA;
        zzjr zzjrVarZza;
        zzlg zzlgVarZza;
        zzmn zzmnVarZzz;
        zzjr zzjrVarZza2;
        zzly.zzG(cls);
        zzli zzliVarZzb = this.zzb.zzb(cls);
        if (zzliVarZzb.zzb()) {
            if (zzke.class.isAssignableFrom(cls)) {
                zzmnVarZzz = zzly.zzB();
                zzjrVarZza2 = zzjt.zzb();
            } else {
                zzmnVarZzz = zzly.zzz();
                zzjrVarZza2 = zzjt.zza();
            }
            return zzlp.zzc(zzmnVarZzz, zzjrVarZza2, zzliVarZzb.zza());
        }
        if (zzke.class.isAssignableFrom(cls)) {
            boolean zZzb = zzb(zzliVarZzb);
            zzlqVarZza = zzlr.zzb();
            zzkzVarZzc = zzkz.zzd();
            zzmnVarZzA = zzly.zzB();
            zzjrVarZza = zZzb ? zzjt.zzb() : null;
            zzlgVarZza = zzlh.zzb();
        } else {
            boolean zZzb2 = zzb(zzliVarZzb);
            zzlqVarZza = zzlr.zza();
            zzkzVarZzc = zzkz.zzc();
            if (zZzb2) {
                zzmnVarZzA = zzly.zzz();
                zzjrVarZza = zzjt.zza();
            } else {
                zzmnVarZzA = zzly.zzA();
                zzjrVarZza = null;
            }
            zzlgVarZza = zzlh.zza();
        }
        return zzlo.zzl(cls, zzliVarZzb, zzlqVarZza, zzkzVarZzc, zzmnVarZzA, zzjrVarZza, zzlgVarZza);
    }
}
