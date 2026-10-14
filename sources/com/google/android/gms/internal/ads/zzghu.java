package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzghu {
    private final zzghn zza;
    private final List zzb;

    @Nullable
    private final Integer zzc;

    public /* synthetic */ zzghu(zzghn zzghnVar, List list, Integer num, zzght zzghtVar) {
        this.zza = zzghnVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghu)) {
            return false;
        }
        zzghu zzghuVar = (zzghu) obj;
        if (this.zza.equals(zzghuVar.zza) && this.zzb.equals(zzghuVar.zzb)) {
            Integer num = this.zzc;
            Integer num2 = zzghuVar.zzc;
            if (num == num2) {
                return true;
            }
            if (num != null && num.equals(num2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}
