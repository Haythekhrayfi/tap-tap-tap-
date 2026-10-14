package com.google.android.gms.internal.auth;

import android.util.Log;
import androidx.activity.result.c;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class zzcw extends zzdc {
    public zzcw(zzcz zzczVar, String str, Boolean bool, boolean z10) {
        super(zzczVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzdc
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        if (zzcb.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzcb.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        StringBuilder sbA = c.a("Invalid boolean value for ", super.zzc(), ": ");
        sbA.append((String) obj);
        Log.e("PhenotypeFlag", sbA.toString());
        return null;
    }
}
