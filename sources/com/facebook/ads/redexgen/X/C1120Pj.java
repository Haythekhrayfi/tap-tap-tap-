package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1120Pj implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C06676q A00;

    public C1120Pj(C06676q c06676q) {
        this.A00 = c06676q;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        new Handler(Looper.getMainLooper()).post(new C0980Jx(this, i10));
    }
}
