package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.yandex.mobile.ads.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u7 f23990a = new u7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t70 f23991b = new t70();

    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Dialog f23992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t70 f23993b;

        public a(Dialog dialog, t70 t70Var) {
            this.f23992a = dialog;
            this.f23993b = t70Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Objects.requireNonNull(this.f23993b);
            t70.a(view);
            this.f23992a.dismiss();
        }
    }

    public static class b implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f23994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f23995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Dialog f23996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final t70 f23997d;

        public b(ViewGroup viewGroup, Dialog dialog, t70 t70Var) {
            this.f23995b = viewGroup;
            this.f23996c = dialog;
            this.f23997d = t70Var;
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f23994a = rawY;
                return true;
            }
            if (action == 1) {
                if (rawY > this.f23994a) {
                    Objects.requireNonNull(this.f23997d);
                    t70.a(view);
                    this.f23996c.dismiss();
                }
                return true;
            }
            if (action != 2) {
                return false;
            }
            float f10 = this.f23994a;
            if (rawY > f10) {
                this.f23995b.setTranslationY(rawY - f10);
            } else {
                this.f23995b.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            }
            return true;
        }
    }

    public final void a(ViewGroup viewGroup, Dialog dialog) {
        Objects.requireNonNull(this.f23990a);
        View viewFindViewById = viewGroup.findViewById(R.id.adtune_drag_view_container);
        if (viewFindViewById != null) {
            viewFindViewById.setOnTouchListener(new b(viewGroup, dialog, this.f23991b));
        }
        Objects.requireNonNull(this.f23990a);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.adtune_background_view);
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new a(dialog, this.f23991b));
        }
    }
}
