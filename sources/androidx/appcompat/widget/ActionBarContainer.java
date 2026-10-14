package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.inscode.autoclicker.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f925i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f926j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f927k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f928l;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c cVar = new c(this);
        WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
        p0.e0.d.q(this, cVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a.f28459a);
        boolean z10 = false;
        this.f923g = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f924h = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f928l = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f926j = true;
            this.f925i = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f926j ? !(this.f923g != null || this.f924h != null) : this.f925i == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f923g;
        if (drawable != null && drawable.isStateful()) {
            this.f923g.setState(getDrawableState());
        }
        Drawable drawable2 = this.f924h;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f924h.setState(getDrawableState());
        }
        Drawable drawable3 = this.f925i;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f925i.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f920d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f923g;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f924h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f925i;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f921e = findViewById(R.id.action_bar);
        this.f922f = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f919c || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[PHI: r0
  0x0048: PHI (r0v9 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:32:0x009d, B:34:0x00a1, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z10, i10, i11, i12, i13);
        View view2 = this.f920d;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = measuredHeight - view2.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            view2.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f926j) {
            Drawable drawable3 = this.f925i;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = z12;
            }
        } else {
            if (this.f923g != null) {
                if (this.f921e.getVisibility() == 0) {
                    drawable2 = this.f923g;
                    left = this.f921e.getLeft();
                    top = this.f921e.getTop();
                    right = this.f921e.getRight();
                    view = this.f921e;
                } else {
                    View view3 = this.f922f;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f923g.setBounds(0, 0, 0, 0);
                    } else {
                        drawable2 = this.f923g;
                        left = this.f922f.getLeft();
                        top = this.f922f.getTop();
                        right = this.f922f.getRight();
                        view = this.f922f;
                    }
                    z12 = true;
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z12 = true;
            }
            this.f927k = z13;
            if (!z13 || (drawable = this.f924h) == null) {
                z11 = z12;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z11) {
            invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iA;
        View view;
        int size;
        int i12;
        if (this.f921e == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f928l) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f921e == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view2 = this.f920d;
        if (view2 == null || view2.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (b(this.f921e)) {
            if (b(this.f922f)) {
                iA = 0;
            } else {
                view = this.f922f;
            }
            if (mode == Integer.MIN_VALUE) {
                size = View.MeasureSpec.getSize(i11);
            } else {
                size = Integer.MAX_VALUE;
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f920d) + iA, size));
        }
        view = this.f921e;
        iA = a(view);
        if (mode == Integer.MIN_VALUE) {
            size = View.MeasureSpec.getSize(i11);
        } else {
            size = Integer.MAX_VALUE;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f920d) + iA, size));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f923g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f923g);
        }
        this.f923g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f921e;
            if (view != null) {
                this.f923g.setBounds(view.getLeft(), this.f921e.getTop(), this.f921e.getRight(), this.f921e.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f926j ? this.f923g != null || this.f924h != null : this.f925i != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f925i;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f925i);
        }
        this.f925i = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f926j && (drawable2 = this.f925i) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f926j ? !(this.f923g != null || this.f924h != null) : this.f925i == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f924h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f924h);
        }
        this.f924h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f927k && (drawable2 = this.f924h) != null) {
                drawable2.setBounds(this.f920d.getLeft(), this.f920d.getTop(), this.f920d.getRight(), this.f920d.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f926j ? this.f923g != null || this.f924h != null : this.f925i != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(p0 p0Var) {
        View view = this.f920d;
        if (view != null) {
            removeView(view);
        }
        this.f920d = p0Var;
        if (p0Var != null) {
            addView(p0Var);
            ViewGroup.LayoutParams layoutParams = p0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            p0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f919c = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f923g;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f924h;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f925i;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f923g && !this.f926j) || (drawable == this.f924h && this.f927k) || ((drawable == this.f925i && this.f926j) || super.verifyDrawable(drawable));
    }
}
