package com.google.android.gms.internal.auth;

import android.util.Log;
import androidx.activity.result.c;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l10, boolean z10) {
        super(zzczVar, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
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
