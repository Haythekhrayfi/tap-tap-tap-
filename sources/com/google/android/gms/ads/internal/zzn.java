package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class zzn implements View.OnTouchListener {
    public final /* synthetic */ zzs zza;

    public zzn(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzs zzsVar = this.zza;
        if (zzsVar.zzh == null) {
            return false;
        }
        zzsVar.zzh.zzd(motionEvent);
        return false;
    }
}
