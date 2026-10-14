package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.nativeads.Rating;

/* JADX INFO: loaded from: classes3.dex */
public final class ui0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f25659c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile ui0 f25660d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f25661a = new Handler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25662b;

    private ui0() {
    }

    public static ui0 a() {
        if (f25660d == null) {
            synchronized (f25659c) {
                if (f25660d == null) {
                    f25660d = new ui0();
                }
            }
        }
        return f25660d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        if (this.f25662b) {
            view.setAlpha(view.getAlpha() * 2.0f);
            this.f25662b = false;
        }
    }

    private void a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (!this.f25662b) {
                view.setAlpha(view.getAlpha() / 2.0f);
                this.f25662b = true;
            }
            this.f25661a.postDelayed(new do1(this, view), 100L);
        }
    }

    public final void b(View view, MotionEvent motionEvent) {
        if ((view instanceof TextView) || (view instanceof Rating)) {
            a(view, motionEvent);
        }
    }
}
