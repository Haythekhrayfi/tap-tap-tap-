package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzgou {
    private final zzgot zza;

    private zzgou(zzgot zzgotVar) {
        byte[] bArr = zzgpw.zzd;
        this.zza = zzgotVar;
        zzgotVar.zze = this;
    }

    public static zzgou zza(zzgot zzgotVar) {
        zzgou zzgouVar = zzgotVar.zze;
        return zzgouVar != null ? zzgouVar : new zzgou(zzgotVar);
    }

    public final void zzA(int i10, int i11) throws IOException {
        this.zza.zzr(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void zzB(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                zzgot zzgotVar = this.zza;
                int iIntValue = ((Integer) list.get(i11)).intValue();
                zzgotVar.zzr(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i11++;
            }
            return;
        }
        this.zza.zzq(i10, 2);
        int iZzA = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = ((Integer) list.get(i12)).intValue();
            iZzA += zzgot.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.zza.zzs(iZzA);
        while (i11 < list.size()) {
            zzgot zzgotVar2 = this.zza;
            int iIntValue3 = ((Integer) list.get(i11)).intValue();
            zzgotVar2.zzs((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i11++;
        }
    }

    public final void zzC(int i10, long j10) throws IOException {
        this.zza.zzt(i10, (j10 >> 63) ^ (j10 + j10));
    }

    public final void zzD(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                zzgot zzgotVar = this.zza;
                long jLongValue = ((Long) list.get(i11)).longValue();
                zzgotVar.zzt(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return;
        }
        this.zza.zzq(i10, 2);
        int iZzB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iZzB += zzgot.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.zza.zzs(iZzB);
        while (i11 < list.size()) {
            zzgot zzgotVar2 = this.zza;
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            zzgotVar2.zzu((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i11++;
        }
    }

    @Deprecated
    public final void zzE(int i10) throws IOException {
        this.zza.zzq(i10, 3);
    }

    public final void zzF(int i10, String str) throws IOException {
        this.zza.zzo(i10, str);
    }

    public final void zzG(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgqe)) {
            while (i11 < list.size()) {
                this.zza.zzo(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        zzgqe zzgqeVar = (zzgqe) list;
        while (i11 < list.size()) {
            Object objZzf = zzgqeVar.zzf(i11);
            if (objZzf instanceof String) {
                this.zza.zzo(i10, (String) objZzf);
            } else {
                this.zza.zzL(i10, (zzgoe) objZzf);
            }
            i11++;
        }
    }

    public final void zzH(int i10, int i11) throws IOException {
        this.zza.zzr(i10, i11);
    }

    public final void zzI(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzr(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzq(i10, 2);
        int iZzA = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZzA += zzgot.zzA(((Integer) list.get(i12)).intValue());
        }
        this.zza.zzs(iZzA);
        while (i11 < list.size()) {
            this.zza.zzs(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzJ(int i10, long j10) throws IOException {
        this.zza.zzt(i10, j10);
    }

    public final void zzK(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzt(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzq(i10, 2);
        int iZzB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZzB += zzgot.zzB(((Long) list.get(i12)).longValue());
        }
        this.zza.zzs(iZzB);
        while (i11 < list.size()) {
            this.zza.zzu(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void zzb(int i10, boolean z10) throws IOException {
        this.zza.zzK(i10, z10);
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
    public final void zzc(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzK(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.zza.zzq(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).booleanValue();
            i12++;
        }
        this.zza.zzs(i12);
        while (i11 < list.size()) {
            this.zza.zzJ(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public final void zzd(int i10, zzgoe zzgoeVar) throws IOException {
        this.zza.zzL(i10, zzgoeVar);
    }

    public final void zze(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzL(i10, (zzgoe) list.get(i11));
        }
    }

    public final void zzf(int i10, double d10) throws IOException {
        this.zza.zzj(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzg(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzj(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        this.zza.zzq(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).doubleValue();
            i12 += 8;
        }
        this.zza.zzs(i12);
        while (i11 < list.size()) {
            this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Deprecated
    public final void zzh(int i10) throws IOException {
        this.zza.zzq(i10, 4);
    }

    public final void zzi(int i10, int i11) throws IOException {
        this.zza.zzl(i10, i11);
    }

    public final void zzj(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzl(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzq(i10, 2);
        int iZzx = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZzx += zzgot.zzx(((Integer) list.get(i12)).intValue());
        }
        this.zza.zzs(iZzx);
        while (i11 < list.size()) {
            this.zza.zzm(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzk(int i10, int i11) throws IOException {
        this.zza.zzh(i10, i11);
    }

    public final void zzl(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzh(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzq(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        this.zza.zzs(i12);
        while (i11 < list.size()) {
            this.zza.zzi(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzm(int i10, long j10) throws IOException {
        this.zza.zzj(i10, j10);
    }

    public final void zzn(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzj(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzq(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        this.zza.zzs(i12);
        while (i11 < list.size()) {
            this.zza.zzk(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void zzo(int i10, float f10) throws IOException {
        this.zza.zzh(i10, Float.floatToRawIntBits(f10));
    }

    public final void zzp(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzh(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        this.zza.zzq(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).floatValue();
            i12 += 4;
        }
        this.zza.zzs(i12);
        while (i11 < list.size()) {
            this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public final void zzq(int i10, Object obj, zzgrp zzgrpVar) throws IOException {
        zzgot zzgotVar = this.zza;
        zzgotVar.zzq(i10, 3);
        zzgrpVar.zzm((zzgqw) obj, zzgotVar.zze);
        zzgotVar.zzq(i10, 4);
    }

    public final void zzr(int i10, int i11) throws IOException {
        this.zza.zzl(i10, i11);
    }

    public final void zzs(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzl(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzq(i10, 2);
        int iZzx = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZzx += zzgot.zzx(((Integer) list.get(i12)).intValue());
        }
        this.zza.zzs(iZzx);
        while (i11 < list.size()) {
            this.zza.zzm(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzt(int i10, long j10) throws IOException {
        this.zza.zzt(i10, j10);
    }

    public final void zzu(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzt(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzq(i10, 2);
        int iZzB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZzB += zzgot.zzB(((Long) list.get(i12)).longValue());
        }
        this.zza.zzs(iZzB);
        while (i11 < list.size()) {
            this.zza.zzu(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void zzv(int i10, Object obj, zzgrp zzgrpVar) throws IOException {
        this.zza.zzn(i10, (zzgqw) obj, zzgrpVar);
    }

    public final void zzw(int i10, int i11) throws IOException {
        this.zza.zzh(i10, i11);
    }

    public final void zzx(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzh(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzq(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        this.zza.zzs(i12);
        while (i11 < list.size()) {
            this.zza.zzi(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzy(int i10, long j10) throws IOException {
        this.zza.zzj(i10, j10);
    }

    public final void zzz(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzj(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzq(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        this.zza.zzs(i12);
        while (i11 < list.size()) {
            this.zza.zzk(((Long) list.get(i11)).longValue());
            i11++;
        }
    }
}
