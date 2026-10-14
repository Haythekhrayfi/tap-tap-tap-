package com.google.android.gms.internal.measurement;

import android.util.Log;
import androidx.activity.result.c;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class zzhu extends zzia {
    public zzhu(zzhx zzhxVar, String str, Boolean bool, boolean z10) {
        super(zzhxVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzia
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        if (zzgz.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzgz.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        StringBuilder sbA = c.a("Invalid boolean value for ", super.zzc(), ": ");
        sbA.append((String) obj);
        Log.e("PhenotypeFlag", sbA.toString());
        return null;
    }
}
