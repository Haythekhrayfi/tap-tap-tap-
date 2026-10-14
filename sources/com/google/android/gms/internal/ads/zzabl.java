package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabl {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i10 = zzfj.zza;
            int i11 = Integer.parseInt(strGroup, 16);
            int i12 = Integer.parseInt(matcher.group(2), 16);
            if (i11 <= 0 && i12 <= 0) {
                return false;
            }
            this.zza = i11;
            this.zzb = i12;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }

    public final boolean zzb(zzbz zzbzVar) {
        for (int i10 = 0; i10 < zzbzVar.zza(); i10++) {
            zzby zzbyVarZzb = zzbzVar.zzb(i10);
            if (zzbyVarZzb instanceof zzaeg) {
                zzaeg zzaegVar = (zzaeg) zzbyVarZzb;
                if ("iTunSMPB".equals(zzaegVar.zzb) && zzc(zzaegVar.zzc)) {
                    return true;
                }
            } else if (zzbyVarZzb instanceof zzaep) {
                zzaep zzaepVar = (zzaep) zzbyVarZzb;
                if ("com.apple.iTunes".equals(zzaepVar.zza) && "iTunSMPB".equals(zzaepVar.zzb) && zzc(zzaepVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
