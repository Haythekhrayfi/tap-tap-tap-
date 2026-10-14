package com.google.android.gms.internal.measurement;

import android.util.Log;
import androidx.activity.result.c;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class zzht extends zzia {
    public zzht(zzhx zzhxVar, String str, Long l10, boolean z10) {
        super(zzhxVar, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbA = c.a("Invalid long value for ", super.zzc(), ": ");
            sbA.append((String) obj);
            Log.e("PhenotypeFlag", sbA.toString());
            return null;
        }
    }
}
