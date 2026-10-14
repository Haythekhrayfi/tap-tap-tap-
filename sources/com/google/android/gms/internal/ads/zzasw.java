package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzasw extends zzath {
    public zzasw(zzart zzartVar, String str, String str2, zzanq zzanqVar, int i10, int i11) {
        super(zzartVar, "IXWwWv5JK/+sPkAKl3c1KDv4Hvk1BPLRteoZBxJagTzyJxEU8SumoR58fR6LdW3i", "Et5K8MZEoJYE/LdMCgxh0i7wX7GVWBBs6Isd533FNz4=", zzanqVar, i10, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            int i10 = 1;
            boolean zBooleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzanq zzanqVar = this.zze;
            if (true == zBooleanValue) {
                i10 = 2;
            }
            zzanqVar.zzaf(i10);
        } catch (InvocationTargetException unused) {
            this.zze.zzaf(3);
        }
    }
}
