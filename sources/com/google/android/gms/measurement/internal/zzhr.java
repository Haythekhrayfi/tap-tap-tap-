package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
final class zzhr implements zzlg {
    public final /* synthetic */ zzid zza;

    public zzhr(zzid zzidVar) {
        this.zza = zzidVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlg
    public final void zza(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.zza.zzD("auto", "_err", bundle);
        } else {
            this.zza.zzF("auto", "_err", bundle, str);
        }
    }
}
