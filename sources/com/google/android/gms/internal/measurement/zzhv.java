package com.google.android.gms.internal.measurement;

import android.util.Log;
import androidx.activity.result.c;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class zzhv extends zzia {
    public zzhv(zzhx zzhxVar, String str, Double d10, boolean z10) {
        super(zzhxVar, "measurement.test.double_flag", d10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbA = c.a("Invalid double value for ", super.zzc(), ": ");
            sbA.append((String) obj);
            Log.e("PhenotypeFlag", sbA.toString());
            return null;
        }
    }
}
