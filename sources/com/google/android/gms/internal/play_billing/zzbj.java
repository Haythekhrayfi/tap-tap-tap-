package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzbj implements zzey {
    private final zzbi zza;

    private zzbj(zzbi zzbiVar) {
        byte[] bArr = zzcg.zzd;
        this.zza = zzbiVar;
        zzbiVar.zza = this;
    }

    public static zzbj zza(zzbi zzbiVar) {
        zzbj zzbjVar = zzbiVar.zza;
        return zzbjVar != null ? zzbjVar : new zzbj(zzbiVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzA(int i10, int i11) throws IOException {
        this.zza.zzp(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzB(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                zzbi zzbiVar = this.zza;
                int iIntValue = ((Integer) list.get(i11)).intValue();
                zzbiVar.zzp(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int iZzx = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = ((Integer) list.get(i12)).intValue();
            iZzx += zzbi.zzx((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.zza.zzq(iZzx);
        while (i11 < list.size()) {
            zzbi zzbiVar2 = this.zza;
            int iIntValue3 = ((Integer) list.get(i11)).intValue();
            zzbiVar2.zzq((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzC(int i10, long j10) throws IOException {
        this.zza.zzr(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzD(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                zzbi zzbiVar = this.zza;
                long jLongValue = ((Long) list.get(i11)).longValue();
                zzbiVar.zzr(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int iZzy = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iZzy += zzbi.zzy((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.zza.zzq(iZzy);
        while (i11 < list.size()) {
            zzbi zzbiVar2 = this.zza;
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            zzbiVar2.zzs((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    @Deprecated
    public final void zzE(int i10) throws IOException {
        this.zza.zzo(i10, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzF(int i10, String str) throws IOException {
        this.zza.zzm(i10, str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzG(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzcn)) {
            while (i11 < list.size()) {
                this.zza.zzm(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        zzcn zzcnVar = (zzcn) list;
        while (i11 < list.size()) {
            Object objZzf = zzcnVar.zzf(i11);
            if (objZzf instanceof String) {
                this.zza.zzm(i10, (String) objZzf);
            } else {
                this.zza.zze(i10, (zzba) objZzf);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzH(int i10, int i11) throws IOException {
        this.zza.zzp(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzI(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzp(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int iZzx = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZzx += zzbi.zzx(((Integer) list.get(i12)).intValue());
        }
        this.zza.zzq(iZzx);
        while (i11 < list.size()) {
            this.zza.zzq(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzJ(int i10, long j10) throws IOException {
        this.zza.zzr(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzK(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzr(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int iZzy = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZzy += zzbi.zzy(((Long) list.get(i12)).longValue());
        }
        this.zza.zzq(iZzy);
        while (i11 < list.size()) {
            this.zza.zzs(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzb(int i10, boolean z10) throws IOException {
        this.zza.zzd(i10, z10);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzc(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzd(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).booleanValue();
            i12++;
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            this.zza.zzb(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzd(int i10, zzba zzbaVar) throws IOException {
        this.zza.zze(i10, zzbaVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zze(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zze(i10, (zzba) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzf(int i10, double d10) throws IOException {
        this.zza.zzh(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzg(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzh(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).doubleValue();
            i12 += 8;
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    @Deprecated
    public final void zzh(int i10) throws IOException {
        this.zza.zzo(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzi(int i10, int i11) throws IOException {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzj(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int iZzu = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZzu += zzbi.zzu(((Integer) list.get(i12)).intValue());
        }
        this.zza.zzq(iZzu);
        while (i11 < list.size()) {
            this.zza.zzk(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzk(int i10, int i11) throws IOException {
        this.zza.zzf(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzl(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            this.zza.zzg(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzm(int i10, long j10) throws IOException {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzn(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            this.zza.zzi(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzo(int i10, float f10) throws IOException {
        this.zza.zzf(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzp(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzf(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).floatValue();
            i12 += 4;
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzq(int i10, Object obj, zzdp zzdpVar) throws IOException {
        zzbi zzbiVar = this.zza;
        zzbiVar.zzo(i10, 3);
        zzdpVar.zzi((zzdf) obj, zzbiVar.zza);
        zzbiVar.zzo(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzr(int i10, int i11) throws IOException {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzs(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int iZzu = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZzu += zzbi.zzu(((Integer) list.get(i12)).intValue());
        }
        this.zza.zzq(iZzu);
        while (i11 < list.size()) {
            this.zza.zzk(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzt(int i10, long j10) throws IOException {
        this.zza.zzr(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzu(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzr(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int iZzy = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZzy += zzbi.zzy(((Long) list.get(i12)).longValue());
        }
        this.zza.zzq(iZzy);
        while (i11 < list.size()) {
            this.zza.zzs(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzv(int i10, Object obj, zzdp zzdpVar) throws IOException {
        zzdf zzdfVar = (zzdf) obj;
        zzbf zzbfVar = (zzbf) this.zza;
        zzbfVar.zzq((i10 << 3) | 2);
        zzbfVar.zzq(((zzak) zzdfVar).zza(zzdpVar));
        zzdpVar.zzi(zzdfVar, zzbfVar.zza);
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzw(int i10, int i11) throws IOException {
        this.zza.zzf(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzx(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            this.zza.zzg(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzy(int i10, long j10) throws IOException {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzey
    public final void zzz(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            this.zza.zzi(((Long) list.get(i11)).longValue());
            i11++;
        }
    }
}
