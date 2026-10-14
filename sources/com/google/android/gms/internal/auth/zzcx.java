package com.google.android.gms.internal.auth;

import android.util.Log;
import androidx.activity.result.c;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class zzcx extends zzdc {
    public zzcx(zzcz zzczVar, String str, Double d10, boolean z10) {
        super(zzczVar, str, d10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
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
