package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.nativeads.MediaView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zc0 extends og1<MediaView, vc0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gd0 f27278b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc0(MediaView mediaView, k2 k2Var) {
        super(mediaView);
        fd.j0.i(mediaView, "mediaView");
        fd.j0.i(k2Var, "adConfiguration");
        Context applicationContext = mediaView.getContext().getApplicationContext();
        fd.j0.h(applicationContext, "mediaView.context.applicationContext");
        this.f27278b = new gd0(applicationContext, k2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(zc0 zc0Var, MediaView mediaView) {
        fd.j0.i(zc0Var, "this$0");
        fd.j0.i(mediaView, "$view");
        zc0Var.f27278b.a(mediaView, yc0.a(zc0Var.c()));
        return false;
    }

    public abstract void a(vc0 vc0Var);

    @Override // com.yandex.mobile.ads.impl.og1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(final MediaView mediaView, vc0 vc0Var) {
        fd.j0.i(mediaView, "view");
        fd.j0.i(vc0Var, "value");
        eh1.a(mediaView, new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.mobile.ads.impl.lq1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return zc0.a(this.f22763c, mediaView);
            }
        });
    }

    public abstract int c();
}
