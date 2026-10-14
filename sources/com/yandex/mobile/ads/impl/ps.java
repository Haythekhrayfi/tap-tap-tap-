package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.Player;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h6 f24231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q3 f24232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i4 f24233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d4 f24234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final cf f24235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ys f24236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g7 f24237g = new g7();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Handler f24238h = new Handler(Looper.getMainLooper());

    public ps(cf cfVar, g6 g6Var, i4 i4Var, ys ysVar) {
        this.f24232b = g6Var.a();
        this.f24231a = g6Var.b();
        this.f24234d = g6Var.c();
        this.f24233c = i4Var;
        this.f24235e = cfVar;
        this.f24236f = ysVar;
    }

    private void a(int i10, int i11, IOException iOException) {
        this.f24234d.a(this.f24234d.a().withAdLoadError(i10, i11));
        VideoAd videoAdA = this.f24232b.a(new n3(i10, i11));
        if (videoAdA == null) {
            x60.c("Unexpected prepared ad error", new Object[0]);
            return;
        }
        this.f24231a.a(videoAdA, n40.f23221f);
        Objects.requireNonNull(this.f24237g);
        this.f24233c.onError(videoAdA, g7.c(iOException));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(final int i10, final int i11, final long j10) {
        VideoAd videoAdA;
        if (SystemClock.elapsedRealtime() - j10 < 200) {
            Player playerA = this.f24236f.a();
            if (playerA == null || playerA.getDuration() == -9223372036854775807L) {
                this.f24238h.postDelayed(new Runnable() { // from class: com.yandex.mobile.ads.impl.op1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23868c.a(i10, i11, j10);
                    }
                }, 20L);
                return;
            }
            videoAdA = this.f24232b.a(new n3(i10, i11));
            if (videoAdA == null) {
                x60.c("Unexpected prepared ad", new Object[0]);
                return;
            }
        } else {
            videoAdA = this.f24232b.a(new n3(i10, i11));
            if (videoAdA == null) {
                x60.c("Unexpected prepared ad", new Object[0]);
                return;
            }
        }
        this.f24231a.a(videoAdA, n40.f23217b);
        this.f24233c.onAdPrepared(videoAdA);
    }

    public final void a(int i10, int i11) {
        a(i10, i11, SystemClock.elapsedRealtime());
    }

    public final void b(int i10, int i11, IOException iOException) {
        if (!this.f24236f.b() || !this.f24235e.b()) {
            x60.f("Ignoring ad prepare error after release", new Object[0]);
            return;
        }
        try {
            a(i10, i11, iOException);
        } catch (RuntimeException e10) {
            x60.c("Unexpected exception while handling prepare error - %s", e10);
        }
    }
}
