package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaas {
    public final String zza;

    private zzaas(int i10, int i11, String str) {
        this.zza = str;
    }

    public static zzaas zza(zzfa zzfaVar) {
        String str;
        zzfaVar.zzG(2);
        int iZzk = zzfaVar.zzk();
        int i10 = iZzk >> 1;
        int i11 = iZzk & 1;
        int iZzk2 = zzfaVar.zzk() >> 3;
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        int i12 = iZzk2 | (i11 << 5);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(i12 >= 10 ? "." : ".0");
        sb2.append(i12);
        return new zzaas(i10, i12, sb2.toString());
    }
}
