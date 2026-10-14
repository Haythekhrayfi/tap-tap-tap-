package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.sdk.R;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f8011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f8012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f8013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8014d;

    public interface a {
        void a(float f10, float f11, boolean z10);
    }

    public final class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f8016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f8017c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f8018d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f8019e;

        private b() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f8016b = f10;
            this.f8017c = f11;
            this.f8018d = z10;
            if (this.f8019e) {
                return;
            }
            this.f8019e = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8019e = false;
            if (AspectRatioFrameLayout.this.f8012b == null) {
                return;
            }
            AspectRatioFrameLayout.this.f8012b.a(this.f8016b, this.f8017c, this.f8018d);
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8014d = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AppLovinAspectRatioFrameLayout, 0, 0);
            try {
                this.f8014d = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinAspectRatioFrameLayout_al_resize_mode, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f8011a = new b();
    }

    public int getResizeMode() {
        return this.f8014d;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f8013c <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        float f12 = f10 / f11;
        float f13 = (this.f8013c / f12) - 1.0f;
        if (Math.abs(f13) <= 0.01f) {
            this.f8011a.a(this.f8013c, f12, false);
            return;
        }
        int i12 = this.f8014d;
        if (i12 != 0) {
            if (i12 == 1) {
                measuredHeight = (int) (f10 / this.f8013c);
            } else if (i12 == 2) {
                measuredWidth = (int) (f11 * this.f8013c);
            } else if (i12 == 4) {
                if (f13 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    measuredWidth = (int) (f11 * this.f8013c);
                } else {
                    measuredHeight = (int) (f10 / this.f8013c);
                }
            }
        } else if (f13 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            measuredHeight = (int) (f10 / this.f8013c);
        } else {
            measuredWidth = (int) (f11 * this.f8013c);
        }
        this.f8011a.a(this.f8013c, f12, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f8013c != f10) {
            this.f8013c = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
        this.f8012b = aVar;
    }

    public void setResizeMode(int i10) {
        if (this.f8014d != i10) {
            this.f8014d = i10;
            requestLayout();
        }
    }
}
