package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfpa {
    private final String zza;
    private final zzfoy zzb;
    private zzfoy zzc;

    public /* synthetic */ zzfpa(String str, zzfoz zzfozVar) {
        zzfoy zzfoyVar = new zzfoy(null);
        this.zzb = zzfoyVar;
        this.zzc = zzfoyVar;
        Objects.requireNonNull(str);
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzfoy zzfoyVar = this.zzb.zzb;
        String str = "";
        while (zzfoyVar != null) {
            Object obj = zzfoyVar.zza;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzfoyVar = zzfoyVar.zzb;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzfpa zza(@CheckForNull Object obj) {
        zzfoy zzfoyVar = new zzfoy(null);
        this.zzc.zzb = zzfoyVar;
        this.zzc = zzfoyVar;
        zzfoyVar.zza = obj;
        return this;
    }
}
