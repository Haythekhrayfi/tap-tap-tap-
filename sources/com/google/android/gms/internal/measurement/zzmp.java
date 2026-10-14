package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzmp extends zzmn {
    @Override // com.google.android.gms.internal.measurement.zzmn
    public final /* synthetic */ int zza(Object obj) {
        return ((zzmo) obj).zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzmn
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzmo) obj).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzmn
    public final /* synthetic */ Object zzc(Object obj) {
        return ((zzke) obj).zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzmn
    public final /* bridge */ /* synthetic */ Object zzd(Object obj, Object obj2) {
        zzmo zzmoVar = (zzmo) obj2;
        return zzmoVar.equals(zzmo.zzc()) ? obj : zzmo.zzd((zzmo) obj, zzmoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmn
    public final /* synthetic */ Object zze() {
        return zzmo.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzmn
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i10, long j10) {
        ((zzmo) obj).zzh(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzmn
    public final void zzg(Object obj) {
        ((zzke) obj).zzc.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzmn
    public final /* synthetic */ void zzh(Object obj, Object obj2) {
        ((zzke) obj).zzc = (zzmo) obj2;
    }

    @Override // com.google.android.gms.internal.measurement.zzmn
    public final /* synthetic */ void zzi(Object obj, zznf zznfVar) throws IOException {
        ((zzmo) obj).zzi(zznfVar);
    }
}
