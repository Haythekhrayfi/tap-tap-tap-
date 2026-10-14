package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzasf extends zzath {
    public zzasf(zzart zzartVar, String str, String str2, zzanq zzanqVar, int i10, int i11) {
        super(zzartVar, "W3XZxcuCkVWMGpB7rckmrrZNc8kIRKZXHq2IDWH2bOmQhacxUDxUUq9zi2tOIl+6", "TZLhLjkSWa88s5Ub32Va4FnAdRMP/dTQp+jLbB+9PU0=", zzanqVar, i10, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzaa(3);
        try {
            int i10 = 1;
            boolean zBooleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzanq zzanqVar = this.zze;
            if (true == zBooleanValue) {
                i10 = 2;
            }
            zzanqVar.zzaa(i10);
        } catch (InvocationTargetException e10) {
            if (!(e10.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e10;
            }
        }
    }
}
