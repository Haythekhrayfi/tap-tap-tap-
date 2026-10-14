package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.R;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;
import p0.s0;
import p0.u;

/* JADX INFO: loaded from: classes2.dex */
public class ViewUtils {

    public interface OnApplyWindowInsetsListener {
        s0 onApplyWindowInsets(View view, s0 s0Var, RelativePadding relativePadding);
    }

    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;
        public int top;

        public RelativePadding(int i10, int i11, int i12, int i13) {
            this.start = i10;
            this.top = i11;
            this.end = i12;
            this.bottom = i13;
        }

        public RelativePadding(RelativePadding relativePadding) {
            this.start = relativePadding.start;
            this.top = relativePadding.top;
            this.end = relativePadding.end;
            this.bottom = relativePadding.bottom;
        }

        public void applyToView(View view) {
            int i10 = this.start;
            int i11 = this.top;
            int i12 = this.end;
            int i13 = this.bottom;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.e.k(view, i10, i11, i12, i13);
        }
    }

    private ViewUtils() {
    }

    public static void addOnGlobalLayoutListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void doOnApplyWindowInsets(View view, AttributeSet attributeSet, int i10, int i11) {
        doOnApplyWindowInsets(view, attributeSet, i10, i11, null);
    }

    public static void doOnApplyWindowInsets(View view, AttributeSet attributeSet, int i10, int i11, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, R.styleable.Insets, i10, i11);
        final boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        final boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        final boolean z12 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Insets_paddingRightSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        doOnApplyWindowInsets(view, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.2
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public s0 onApplyWindowInsets(View view2, s0 s0Var, RelativePadding relativePadding) {
                if (z10) {
                    relativePadding.bottom = s0Var.c() + relativePadding.bottom;
                }
                boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view2);
                if (z11) {
                    if (zIsLayoutRtl) {
                        relativePadding.end = s0Var.d() + relativePadding.end;
                    } else {
                        relativePadding.start = s0Var.d() + relativePadding.start;
                    }
                }
                if (z12) {
                    if (zIsLayoutRtl) {
                        relativePadding.start = s0Var.e() + relativePadding.start;
                    } else {
                        relativePadding.end = s0Var.e() + relativePadding.end;
                    }
                }
                relativePadding.applyToView(view2);
                OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                return onApplyWindowInsetsListener2 != null ? onApplyWindowInsetsListener2.onApplyWindowInsets(view2, s0Var, relativePadding) : s0Var;
            }
        });
    }

    public static void doOnApplyWindowInsets(View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        final RelativePadding relativePadding = new RelativePadding(e0.e.f(view), view.getPaddingTop(), e0.e.e(view), view.getPaddingBottom());
        e0.i.u(view, new u() { // from class: com.google.android.material.internal.ViewUtils.3
            @Override // p0.u
            public s0 onApplyWindowInsets(View view2, s0 s0Var) {
                return onApplyWindowInsetsListener.onApplyWindowInsets(view2, s0Var, new RelativePadding(relativePadding));
            }
        });
        requestApplyInsetsWhenAttached(view);
    }

    public static float dpToPx(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static Integer getBackgroundColor(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    public static ViewGroup getContentView(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(android.R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static ViewOverlayImpl getContentViewOverlay(View view) {
        return getOverlay(getContentView(view));
    }

    public static ViewOverlayImpl getOverlay(View view) {
        if (view == null) {
            return null;
        }
        return new ViewOverlayApi18(view);
    }

    public static float getParentAbsoluteElevation(View view) {
        float fI = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            fI += e0.i.i((View) parent);
        }
        return fI;
    }

    public static boolean isLayoutRtl(View view) {
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        return e0.e.d(view) == 1;
    }

    public static PorterDuff.Mode parseTintMode(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void removeOnGlobalLayoutListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            removeOnGlobalLayoutListener(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void removeOnGlobalLayoutListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void requestApplyInsetsWhenAttached(View view) {
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        if (e0.g.b(view)) {
            e0.h.c(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.internal.ViewUtils.4
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
                    e0.h.c(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
        }
    }

    public static void requestFocusAndShowKeyboard(final View view) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.ViewUtils.1
            @Override // java.lang.Runnable
            public void run() {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
            }
        });
    }
}
