package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDelegateImpl;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f1043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f1044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f1045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f1046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TypedValue f1047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TypedValue f1048h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f1049i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f1050j;

    public interface a {
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1049i = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1047g == null) {
            this.f1047g = new TypedValue();
        }
        return this.f1047g;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1048h == null) {
            this.f1048h = new TypedValue();
        }
        return this.f1048h;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1045e == null) {
            this.f1045e = new TypedValue();
        }
        return this.f1045e;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1046f == null) {
            this.f1046f = new TypedValue();
        }
        return this.f1046f;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1043c == null) {
            this.f1043c = new TypedValue();
        }
        return this.f1043c;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1044d == null) {
            this.f1044d = new TypedValue();
        }
        return this.f1044d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f1050j;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f1050j;
        if (aVar != null) {
            AppCompatDelegateImpl appCompatDelegateImpl = ((androidx.appcompat.app.k) aVar).f681a;
            a0 a0Var = appCompatDelegateImpl.f612t;
            if (a0Var != null) {
                a0Var.i();
            }
            if (appCompatDelegateImpl.f617y != null) {
                appCompatDelegateImpl.f606n.getDecorView().removeCallbacks(appCompatDelegateImpl.f618z);
                if (appCompatDelegateImpl.f617y.isShowing()) {
                    try {
                        appCompatDelegateImpl.f617y.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                appCompatDelegateImpl.f617y = null;
            }
            appCompatDelegateImpl.L();
            androidx.appcompat.view.menu.e eVar = appCompatDelegateImpl.Q(0).f626h;
            if (eVar != null) {
                eVar.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        float fraction;
        int i14;
        int i15;
        float fraction2;
        int i16;
        int i17;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z11 = true;
        boolean z12 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            z10 = false;
        } else {
            TypedValue typedValue = z12 ? this.f1046f : this.f1045e;
            if (typedValue == null || (i16 = typedValue.type) == 0) {
                z10 = false;
            } else {
                if (i16 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i16 == 6) {
                        int i18 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i18, i18);
                    } else {
                        i17 = 0;
                    }
                    if (i17 > 0) {
                        Rect rect = this.f1049i;
                        i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                i17 = (int) fraction3;
                if (i17 > 0) {
                    Rect rect2 = this.f1049i;
                    i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect2.left + rect2.right), View.MeasureSpec.getSize(i10)), 1073741824);
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z12 ? this.f1047g : this.f1048h;
            if (typedValue2 != null && (i14 = typedValue2.type) != 0) {
                if (i14 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i14 == 6) {
                        int i19 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i19, i19);
                    } else {
                        i15 = 0;
                    }
                    if (i15 > 0) {
                        Rect rect3 = this.f1049i;
                        i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect3.top + rect3.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                    }
                }
                i15 = (int) fraction2;
                if (i15 > 0) {
                    Rect rect4 = this.f1049i;
                    i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect4.top + rect4.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                }
            }
        }
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z10 || mode != Integer.MIN_VALUE) {
            z11 = false;
        } else {
            TypedValue typedValue3 = z12 ? this.f1044d : this.f1043c;
            if (typedValue3 == null || (i12 = typedValue3.type) == 0) {
                z11 = false;
            } else {
                if (i12 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i12 == 6) {
                        int i20 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i20, i20);
                    } else {
                        i13 = 0;
                    }
                    if (i13 > 0) {
                        Rect rect5 = this.f1049i;
                        i13 -= rect5.left + rect5.right;
                    }
                    if (measuredWidth < i13) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                    } else {
                        z11 = false;
                    }
                }
                i13 = (int) fraction;
                if (i13 > 0) {
                    Rect rect6 = this.f1049i;
                    i13 -= rect6.left + rect6.right;
                }
                if (measuredWidth < i13) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                } else {
                    z11 = false;
                }
            }
        }
        if (z11) {
            super.onMeasure(iMakeMeasureSpec, i11);
        }
    }

    public void setAttachListener(a aVar) {
        this.f1050j = aVar;
    }
}
