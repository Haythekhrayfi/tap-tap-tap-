package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzghq {

    @Nullable
    private ArrayList zza = new ArrayList();
    private zzghn zzb = zzghn.zza;

    @Nullable
    private Integer zzc = null;

    public final zzghq zza(zzfxs zzfxsVar, int i10, String str, String str2) {
        ArrayList arrayList = this.zza;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new zzghs(zzfxsVar, i10, str, str2, null));
        return this;
    }

    public final zzghq zzb(zzghn zzghnVar) {
        if (this.zza == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.zzb = zzghnVar;
        return this;
    }

    public final zzghq zzc(int i10) {
        if (this.zza == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.zzc = Integer.valueOf(i10);
        return this;
    }

    public final zzghu zzd() throws GeneralSecurityException {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.zzc;
        if (num != null) {
            int iIntValue = num.intValue();
            ArrayList arrayList = this.zza;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int iZza = ((zzghs) arrayList.get(i10)).zza();
                i10++;
                if (iZza == iIntValue) {
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        zzghu zzghuVar = new zzghu(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
        this.zza = null;
        return zzghuVar;
    }
}
