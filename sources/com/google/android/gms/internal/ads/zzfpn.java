package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfpn extends zzfps {
    public final /* synthetic */ zzfpo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfpn(zzfpo zzfpoVar, zzfpu zzfpuVar, CharSequence charSequence) {
        super(zzfpuVar, charSequence);
        this.zza = zzfpoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfps
    public final int zzc(int i10) {
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfps
    public final int zzd(int i10) {
        zzfos zzfosVar = this.zza.zza;
        CharSequence charSequence = ((zzfps) this).zzb;
        int length = charSequence.length();
        zzfph.zzb(i10, length, "index");
        while (i10 < length) {
            if (zzfosVar.zzb(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
