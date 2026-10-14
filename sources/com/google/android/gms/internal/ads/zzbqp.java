package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class zzbqp implements View.OnClickListener {
    public final /* synthetic */ zzbqq zza;

    public zzbqp(zzbqq zzbqqVar) {
        this.zza = zzbqqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zza(true);
    }
}
