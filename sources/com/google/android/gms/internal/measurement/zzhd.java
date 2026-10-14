package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
final class zzhd extends ContentObserver {
    public final /* synthetic */ zzhe zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhd(zzhe zzheVar, Handler handler) {
        super(null);
        this.zza = zzheVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.zza.zzf();
    }
}
