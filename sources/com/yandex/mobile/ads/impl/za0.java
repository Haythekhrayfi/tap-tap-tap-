package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class za0 implements ra<vc0>, vo<vc0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r20 f27263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zc0 f27264b;

    public za0(r20 r20Var, zc0 zc0Var) {
        this.f27263a = r20Var;
        this.f27264b = zc0Var;
    }

    private static View a(og1 og1Var) {
        if (og1Var != null) {
            return og1Var.b();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.ra
    public final void a() {
        ImageView imageView = (ImageView) a((og1) this.f27263a);
        if (imageView != null) {
            this.f27263a.a(imageView);
        }
        MediaView mediaView = (MediaView) a((og1) this.f27264b);
        if (mediaView != null) {
            this.f27264b.a(mediaView);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ra
    public final void a(qa<vc0> qaVar, rg1 rg1Var) {
        vc0 vc0VarD = qaVar.d();
        r20 r20Var = this.f27263a;
        if (r20Var != null) {
            List<j20> listA = vc0VarD.a();
            j20 j20Var = null;
            if (listA != null && !listA.isEmpty()) {
                j20Var = listA.get(0);
            }
            r20Var.a(qaVar, rg1Var, j20Var);
        }
        zc0 zc0Var = this.f27264b;
        if (zc0Var != null) {
            zc0Var.a(qaVar, rg1Var, vc0VarD);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ra
    public final boolean a(vc0 vc0Var) {
        vc0 vc0Var2 = vc0Var;
        r20 r20Var = this.f27263a;
        List<j20> listA = vc0Var2.a();
        j20 j20Var = (listA == null || listA.isEmpty()) ? null : listA.get(0);
        View viewA = a((og1) r20Var);
        boolean z10 = (viewA == null || j20Var == null || !r20Var.a(viewA, j20Var)) ? false : true;
        zc0 zc0Var = this.f27264b;
        View viewA2 = a((og1) zc0Var);
        return z10 || (viewA2 != null && zc0Var.a(viewA2, vc0Var2));
    }

    @Override // com.yandex.mobile.ads.impl.vo
    public final void b(vc0 vc0Var) {
        vc0 vc0Var2 = vc0Var;
        List<j20> listA = vc0Var2.a();
        j20 j20Var = (listA == null || listA.isEmpty()) ? null : listA.get(0);
        ImageView imageView = (ImageView) a((og1) this.f27263a);
        if (imageView != null && j20Var != null) {
            this.f27263a.b(imageView, j20Var);
            imageView.setVisibility(0);
        }
        MediaView mediaView = (MediaView) a((og1) this.f27264b);
        if (mediaView != null) {
            this.f27264b.a(vc0Var2);
            mediaView.setVisibility(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    /* JADX WARN: Code duplicated, block: B:19:0x0025  */
    @Override // com.yandex.mobile.ads.impl.ra
    public final boolean b() {
        boolean z10;
        boolean z11;
        zc0 zc0Var = this.f27264b;
        if (zc0Var == null) {
            z10 = false;
        } else {
            if (zc0Var.b() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        r20 r20Var = this.f27263a;
        if (r20Var == null) {
            z11 = false;
        } else {
            if (r20Var.b() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z10 || z11;
    }

    @Override // com.yandex.mobile.ads.impl.ra
    public final ug1 c() {
        MediaView mediaView = (MediaView) a((og1) this.f27264b);
        ImageView imageView = (ImageView) a((og1) this.f27263a);
        if (mediaView != null) {
            return new ug1(mediaView);
        }
        if (imageView != null) {
            return new ug1(imageView);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.ra
    public final void c(vc0 vc0Var) {
        vc0 vc0Var2 = vc0Var;
        List<j20> listA = vc0Var2.a();
        j20 j20Var = (listA == null || listA.isEmpty()) ? null : listA.get(0);
        ImageView imageView = (ImageView) a((og1) this.f27263a);
        if (imageView != null && j20Var != null) {
            this.f27263a.b(imageView, j20Var);
            imageView.setVisibility(0);
        }
        MediaView mediaView = (MediaView) a((og1) this.f27264b);
        if (mediaView != null) {
            this.f27264b.b(mediaView, vc0Var2);
            mediaView.setVisibility(0);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ra
    public final boolean d() {
        zc0 zc0Var = this.f27264b;
        boolean z10 = zc0Var != null && eh1.a(zc0Var.b(), 100);
        r20 r20Var = this.f27263a;
        return z10 || (r20Var != null && eh1.a(r20Var.b(), 100));
    }

    @Override // com.yandex.mobile.ads.impl.ra
    public final void destroy() {
        zc0 zc0Var = this.f27264b;
        if (zc0Var != null) {
            zc0Var.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0050  */
    /* JADX WARN: Code duplicated, block: B:37:0x0055  */
    @Override // com.yandex.mobile.ads.impl.ra
    public final boolean e() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        zc0 zc0Var = this.f27264b;
        if (zc0Var == null) {
            z10 = false;
        } else {
            MediaView mediaViewB = zc0Var.b();
            if (mediaViewB == null || eh1.d(mediaViewB)) {
                z13 = false;
            } else {
                if (mediaViewB.getWidth() < 1 || mediaViewB.getHeight() < 1) {
                    z13 = false;
                } else {
                    z13 = true;
                }
            }
            if (z13) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        r20 r20Var = this.f27263a;
        if (r20Var == null) {
            z11 = false;
        } else {
            ImageView imageViewB = r20Var.b();
            if (imageViewB == null || eh1.d(imageViewB)) {
                z12 = false;
            } else {
                if (imageViewB.getWidth() < 1 || imageViewB.getHeight() < 1) {
                    z12 = false;
                } else {
                    z12 = true;
                }
            }
            if (z12) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z10 || z11;
    }

    public final int f() {
        zc0 zc0Var = this.f27264b;
        if (zc0Var != null) {
            return zc0Var.c();
        }
        return this.f27263a != null ? 4 : 0;
    }
}
