package com.yandex.mobile.ads.instream;

import com.yandex.mobile.ads.impl.a6;
import com.yandex.mobile.ads.impl.gf1;
import com.yandex.mobile.ads.impl.yf1;
import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements VideoPlayerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f27490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yf1 f27491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f27492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private gf1 f27493d;

    public d(e eVar, b bVar) {
        this.f27490a = eVar;
        this.f27491b = eVar.a();
        this.f27492c = bVar;
    }

    public final void a() {
        int iA = a6.a(this.f27491b.a());
        if (iA == 0) {
            this.f27492c.g();
            return;
        }
        if (iA == 7) {
            this.f27492c.e();
            return;
        }
        if (iA == 4) {
            this.f27490a.d();
            this.f27492c.i();
        } else {
            if (iA != 5) {
                return;
            }
            this.f27492c.b();
        }
    }

    public final void a(gf1 gf1Var) {
        this.f27493d = gf1Var;
    }

    public final void b() {
        int iA = a6.a(this.f27491b.a());
        if (iA == 1 || iA == 2 || iA == 3 || iA == 4 || iA == 6 || iA == 7) {
            this.f27491b.a(1);
            gf1 gf1Var = this.f27493d;
            if (gf1Var != null) {
                gf1Var.a();
            }
        }
    }

    public final void c() {
        int iA = a6.a(this.f27491b.a());
        if (iA == 2 || iA == 3) {
            this.f27490a.d();
        }
    }

    public final void d() {
        this.f27491b.a(2);
        this.f27490a.e();
    }

    public final void e() {
        int iA = a6.a(this.f27491b.a());
        if (iA == 2 || iA == 6) {
            this.f27490a.f();
        }
    }

    public final void f() {
        yf1 yf1Var;
        int iA = a6.a(this.f27491b.a());
        int i10 = 1;
        if (iA == 1) {
            yf1Var = this.f27491b;
        } else {
            if (iA != 2 && iA != 3 && iA != 6) {
                return;
            }
            yf1Var = this.f27491b;
            i10 = 5;
        }
        yf1Var.a(i10);
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoCompleted() {
        this.f27491b.a(6);
        gf1 gf1Var = this.f27493d;
        if (gf1Var != null) {
            gf1Var.onVideoCompleted();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoError() {
        this.f27491b.a(8);
        gf1 gf1Var = this.f27493d;
        if (gf1Var != null) {
            gf1Var.onVideoError();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPaused() {
        this.f27491b.a(7);
        gf1 gf1Var = this.f27493d;
        if (gf1Var != null) {
            gf1Var.onVideoPaused();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPrepared() {
        if (a6.a(2, this.f27491b.a())) {
            this.f27491b.a(3);
            this.f27492c.f();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoResumed() {
        this.f27491b.a(4);
        gf1 gf1Var = this.f27493d;
        if (gf1Var != null) {
            gf1Var.onVideoResumed();
        }
    }
}
