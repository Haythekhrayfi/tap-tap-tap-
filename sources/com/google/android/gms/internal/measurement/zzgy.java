package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
final class zzgy extends ContentObserver {
    public zzgy(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        zzgz.zzk.set(true);
    }
}
