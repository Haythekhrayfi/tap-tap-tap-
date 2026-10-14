package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0749Ab extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ X7 A01;

    public C0749Ab(X7 x10, AudioTrack audioTrack) {
        this.A01 = x10;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            try {
                this.A00.flush();
                this.A00.release();
            } finally {
                this.A01.A0f.open();
            }
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
