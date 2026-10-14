package com.google.android.gms.internal.auth;

import android.util.Base64;
import android.util.Log;
import androidx.activity.result.c;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzcy extends zzdc {
    public final /* synthetic */ zzhu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzcz zzczVar, String str, Object obj, boolean z10, zzhu zzhuVar, byte[] bArr) {
        super(zzczVar, "getTokenRefactor__blocked_packages", obj, true, null);
        this.zza = zzhuVar;
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final Object zza(Object obj) {
        try {
            return zzhr.zzk(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            StringBuilder sbA = c.a("Invalid byte[] value for ", super.zzc(), ": ");
            sbA.append((String) obj);
            Log.e("PhenotypeFlag", sbA.toString());
            return null;
        }
    }
}
