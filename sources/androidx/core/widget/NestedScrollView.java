package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;
import p0.o;
import p0.p;
import p0.q;
import p0.s;
import p0.t;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements s, p {
    public static final float D = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final a E = new a();
    public static final int[] F = {R.attr.fillViewport};
    public final q A;
    public float B;
    public c C;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f1666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OverScroller f1667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EdgeEffect f1668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EdgeEffect f1669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1672k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f1673l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1674m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public VelocityTracker f1675n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1676o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1677p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1678q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1679r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1680s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1681t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f1682u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f1683v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1684w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1685x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SavedState f1686y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final t f1687z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1688c;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1688c = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("HorizontalScrollView.SavedState{");
            sbA.append(Integer.toHexString(System.identityHashCode(this)));
            sbA.append(" scrollPosition=");
            return android.support.v4.media.b.a(sbA, this.f1688c, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1688c);
        }
    }

    public static class a extends p0.a {
        @Override // p0.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            q0.e.c(accessibilityEvent, nestedScrollView.getScrollX());
            q0.e.d(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // p0.a
        public void onInitializeAccessibilityNodeInfo(View view, q0.c cVar) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.f34746a.setClassName(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            cVar.f34746a.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                cVar.a(q0.c.a.f34753i);
                cVar.a(q0.c.a.f34757m);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                cVar.a(q0.c.a.f34752h);
                cVar.a(q0.c.a.f34758n);
            }
        }

        /* JADX WARN: Code duplicated, block: B:30:0x008a A[RETURN] */
        @Override // p0.a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            int iMin;
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 == 4096) {
                iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (iMin == nestedScrollView.getScrollY()) {
                    return false;
                }
            } else if (i10 == 8192 || i10 == 16908344) {
                iMin = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (iMin == nestedScrollView.getScrollY()) {
                    return false;
                }
            } else {
                if (i10 != 16908346) {
                    return false;
                }
                iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (iMin == nestedScrollView.getScrollY()) {
                    return false;
                }
            }
            nestedScrollView.v(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), BaseTransientBottomBar.ANIMATION_DURATION, true);
            return true;
        }
    }

    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.inscode.autoclicker.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1666e = new Rect();
        this.f1671j = true;
        this.f1672k = false;
        this.f1673l = null;
        this.f1674m = false;
        this.f1677p = true;
        this.f1681t = -1;
        this.f1682u = new int[2];
        this.f1683v = new int[2];
        int i11 = Build.VERSION.SDK_INT;
        this.f1668g = i11 >= 31 ? d.b.a(context, attributeSet) : new EdgeEffect(context);
        this.f1669h = i11 >= 31 ? d.b.a(context, attributeSet) : new EdgeEffect(context);
        this.f1664c = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1667f = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1678q = viewConfiguration.getScaledTouchSlop();
        this.f1679r = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1680s = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, F, i10, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f1687z = new t(this);
        this.A = new q(this);
        setNestedScrollingEnabled(true);
        e0.q(this, E);
    }

    public static int d(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.B == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.B = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.B;
    }

    public static boolean l(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, view2);
    }

    public final void a() {
        this.f1667f.abortAnimation();
        this.A.j(1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public boolean b(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            g(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.f1666e);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f1666e);
            g(e(this.f1666e));
            viewFindNextFocus.requestFocus(i10);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && (!m(viewFindFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final boolean c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        int iRound;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        if (this.f1667f.isFinished()) {
            return;
        }
        this.f1667f.computeScrollOffset();
        int currY = this.f1667f.getCurrY();
        int i10 = currY - this.f1685x;
        int height = getHeight();
        if (i10 > 0 && d.a(this.f1668g) != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            iRound = Math.round(d.b(this.f1668g, ((-i10) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
            if (iRound != i10) {
                edgeEffect = this.f1668g;
                edgeEffect.finish();
            }
            i10 -= iRound;
        } else if (i10 < 0 && d.a(this.f1669h) != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            float f10 = height;
            iRound = Math.round(d.b(this.f1669h, (i10 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
            if (iRound != i10) {
                edgeEffect = this.f1669h;
                edgeEffect.finish();
            }
            i10 -= iRound;
        }
        int i11 = i10;
        this.f1685x = currY;
        int[] iArr = this.f1683v;
        boolean z10 = false;
        iArr[1] = 0;
        f(0, i11, iArr, null, 1);
        int i12 = i11 - this.f1683v[1];
        int scrollRange = getScrollRange();
        if (i12 != 0) {
            int scrollY = getScrollY();
            p(0, i12, getScrollX(), scrollY, 0, scrollRange, 0, 0);
            int scrollY2 = getScrollY() - scrollY;
            int i13 = i12 - scrollY2;
            int[] iArr2 = this.f1683v;
            iArr2[1] = 0;
            this.A.f(0, scrollY2, 0, i13, this.f1682u, 1, iArr2);
            i12 = i13 - this.f1683v[1];
        }
        if (i12 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z10 = true;
            }
            if (z10) {
                if (i12 < 0) {
                    if (this.f1668g.isFinished()) {
                        edgeEffect2 = this.f1668g;
                        edgeEffect2.onAbsorb((int) this.f1667f.getCurrVelocity());
                    }
                } else if (this.f1669h.isFinished()) {
                    edgeEffect2 = this.f1669h;
                    edgeEffect2.onAbsorb((int) this.f1667f.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f1667f.isFinished()) {
            this.A.j(1);
        } else {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.d.k(this);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || h(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.A.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.A.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return f(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.A.e(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f1668g.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft() + 0;
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f1668g.setSize(width, height);
            if (this.f1668g.draw(canvas)) {
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                e0.d.k(this);
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f1669h.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = 0 + getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.f1669h.setSize(width2, height2);
        if (this.f1669h.draw(canvas)) {
            WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
            e0.d.k(this);
        }
        canvas.restoreToCount(iSave2);
    }

    public int e(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i11) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public boolean f(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.A.c(i10, i11, iArr, iArr2, i12);
    }

    public final void g(int i10) {
        if (i10 != 0) {
            if (this.f1677p) {
                v(0, i10, BaseTransientBottomBar.ANIMATION_DURATION, false);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1687z.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    public boolean h(KeyEvent keyEvent) {
        boolean z10;
        Rect rect;
        int i10;
        this.f1666e.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? b(33) : j(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? b(130) : j(130);
        }
        if (keyCode != 62) {
            return false;
        }
        int i11 = keyEvent.isShiftPressed() ? 33 : 130;
        boolean z11 = i11 == 130;
        int height = getHeight();
        if (z11) {
            this.f1666e.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt2 = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                rect = this.f1666e;
                if (rect.top + height > paddingBottom) {
                    i10 = paddingBottom - height;
                    rect.top = i10;
                }
            }
        } else {
            this.f1666e.top = getScrollY() - height;
            rect = this.f1666e;
            if (rect.top < 0) {
                i10 = 0;
                rect.top = i10;
            }
        }
        Rect rect2 = this.f1666e;
        int i12 = rect2.top;
        int i13 = height + i12;
        rect2.bottom = i13;
        s(i11, i12, i13);
        return false;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return k(0);
    }

    public void i(int i10) {
        if (getChildCount() > 0) {
            this.f1667f.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            r(true);
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.A.f34401d;
    }

    public boolean j(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f1666e;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1666e.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f1666e;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1666e;
        return s(i10, rect3.top, rect3.bottom);
    }

    public boolean k(int i10) {
        return this.A.g(i10) != null;
    }

    public final boolean m(View view, int i10, int i11) {
        view.getDrawingRect(this.f1666e);
        offsetDescendantRectToMyCoords(view, this.f1666e);
        return this.f1666e.bottom + i10 >= getScrollY() && this.f1666e.top - i10 <= getScrollY() + i11;
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.A.d(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1681t) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f1670i = (int) motionEvent.getY(i10);
            this.f1681t = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f1675n;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1672k = false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:33:0x007d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i10;
        int scrollRange;
        int scrollY;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12 = 0;
        if (motionEvent.getAction() == 8 && !this.f1674m) {
            if (o.a(motionEvent, 2)) {
                i10 = 9;
            } else {
                if (o.a(motionEvent, 4194304)) {
                    i10 = 26;
                } else {
                    axisValue = 0.0f;
                }
                if (axisValue != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                    scrollRange = getScrollRange();
                    scrollY = getScrollY();
                    i11 = scrollY - verticalScrollFactorCompat;
                    if (i11 < 0) {
                        if (c() || o.a(motionEvent, 8194)) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (z12) {
                            d.b(this.f1668g, (-i11) / getHeight(), 0.5f);
                            this.f1668g.onRelease();
                            invalidate();
                            z10 = 1;
                        } else {
                            z10 = 0;
                        }
                    } else if (i11 > scrollRange) {
                        if (c() || o.a(motionEvent, 8194)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            d.b(this.f1669h, (i11 - scrollRange) / getHeight(), 0.5f);
                            this.f1669h.onRelease();
                            invalidate();
                            i12 = 1;
                        }
                        z10 = i12;
                        i12 = scrollRange;
                    } else {
                        z10 = 0;
                        i12 = i11;
                    }
                    if (i12 != scrollY) {
                        return z10;
                    }
                    super.scrollTo(getScrollX(), i12);
                    return true;
                }
            }
            axisValue = motionEvent.getAxisValue(i10);
            if (axisValue != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                int verticalScrollFactorCompat2 = (int) (axisValue * getVerticalScrollFactorCompat());
                scrollRange = getScrollRange();
                scrollY = getScrollY();
                i11 = scrollY - verticalScrollFactorCompat2;
                if (i11 < 0) {
                    if (c()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        d.b(this.f1668g, (-i11) / getHeight(), 0.5f);
                        this.f1668g.onRelease();
                        invalidate();
                        z10 = 1;
                    } else {
                        z10 = 0;
                    }
                } else if (i11 > scrollRange) {
                    if (c()) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        d.b(this.f1669h, (i11 - scrollRange) / getHeight(), 0.5f);
                        this.f1669h.onRelease();
                        invalidate();
                        i12 = 1;
                    }
                    z10 = i12;
                    i12 = scrollRange;
                } else {
                    z10 = 0;
                    i12 = i11;
                }
                if (i12 != scrollY) {
                    return z10;
                }
                super.scrollTo(getScrollX(), i12);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e3  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        boolean z11 = true;
        if (action == 2 && this.f1674m) {
            return true;
        }
        int i10 = action & 255;
        if (i10 == 0) {
            int y10 = (int) motionEvent.getY();
            int x10 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y10 < childAt.getTop() - scrollY || y10 >= childAt.getBottom() - scrollY || x10 < childAt.getLeft() || x10 >= childAt.getRight()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            if (z10) {
                this.f1670i = y10;
                this.f1681t = motionEvent.getPointerId(0);
                VelocityTracker velocityTracker = this.f1675n;
                if (velocityTracker == null) {
                    this.f1675n = VelocityTracker.obtain();
                } else {
                    velocityTracker.clear();
                }
                this.f1675n.addMovement(motionEvent);
                this.f1667f.computeScrollOffset();
                if (!x(motionEvent) && this.f1667f.isFinished()) {
                    z11 = false;
                }
                this.f1674m = z11;
                w(2, 0);
            } else {
                if (!x(motionEvent) && this.f1667f.isFinished()) {
                    z11 = false;
                }
                this.f1674m = z11;
                q();
            }
        } else if (i10 == 1) {
            this.f1674m = false;
            this.f1681t = -1;
            q();
            if (this.f1667f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                e0.d.k(this);
            }
            this.A.j(0);
        } else if (i10 == 2) {
            int i11 = this.f1681t;
            if (i11 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                } else {
                    int y11 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y11 - this.f1670i) > this.f1678q && (2 & getNestedScrollAxes()) == 0) {
                        this.f1674m = true;
                        this.f1670i = y11;
                        if (this.f1675n == null) {
                            this.f1675n = VelocityTracker.obtain();
                        }
                        this.f1675n.addMovement(motionEvent);
                        this.f1684w = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i10 == 3) {
            this.f1674m = false;
            this.f1681t = -1;
            q();
            if (this.f1667f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
                e0.d.k(this);
            }
            this.A.j(0);
        } else if (i10 == 6) {
            o(motionEvent);
        }
        return this.f1674m;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredHeight = 0;
        this.f1671j = false;
        View view = this.f1673l;
        if (view != null && l(view, this)) {
            t(this.f1673l);
        }
        this.f1673l = null;
        if (!this.f1672k) {
            if (this.f1686y != null) {
                scrollTo(getScrollX(), this.f1686y.f1688c);
                this.f1686y = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iD = d(scrollY, paddingTop, measuredHeight);
            if (iD != scrollY) {
                scrollTo(getScrollX(), iD);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1672k = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1676o && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f11, true);
        i((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        f(i10, i11, iArr, null, 0);
    }

    @Override // p0.r
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        f(i10, i11, iArr, null, i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(i13, 0, null);
    }

    @Override // p0.r
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        n(i13, i14, null);
    }

    @Override // p0.s
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(i13, i14, iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f1687z.f34435a = i10;
        w(2, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i10) : focusFinder.findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus == null || (true ^ m(viewFindNextFocus, 0, getHeight()))) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f1686y = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1688c = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        c cVar = this.C;
        if (cVar != null) {
            cVar.a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m(viewFindFocus, 0, i13)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f1666e);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f1666e);
        g(e(this.f1666e));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (i10 & 2) != 0;
    }

    @Override // p0.r
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f1687z.f34435a = 0;
        y(0);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:94:0x022e  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        boolean z10;
        int i10;
        int i11;
        EdgeEffect edgeEffect;
        float fB;
        EdgeEffect edgeEffect2;
        EdgeEffect edgeEffect3;
        if (this.f1675n == null) {
            this.f1675n = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = false;
        if (actionMasked == 0) {
            this.f1684w = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f10 = this.f1684w;
        float f11 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        motionEventObtain.offsetLocation(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f10);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1675n;
                velocityTracker.computeCurrentVelocity(1000, this.f1680s);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1681t);
                if (Math.abs(yVelocity) >= this.f1679r) {
                    if (d.a(this.f1668g) != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        if (u(this.f1668g, yVelocity)) {
                            edgeEffect = this.f1668g;
                            i10 = yVelocity;
                            edgeEffect.onAbsorb(i10);
                            z10 = true;
                        } else {
                            i11 = -yVelocity;
                            i(i11);
                            z10 = true;
                        }
                    } else if (d.a(this.f1669h) != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        i10 = -yVelocity;
                        if (u(this.f1669h, i10)) {
                            edgeEffect = this.f1669h;
                            edgeEffect.onAbsorb(i10);
                            z10 = true;
                        } else {
                            i11 = i10;
                            i(i11);
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        int i12 = -yVelocity;
                        float f12 = i12;
                        if (!dispatchNestedPreFling(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f12)) {
                            dispatchNestedFling(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f12, true);
                            i(i12);
                        }
                    }
                } else if (this.f1667f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                    e0.d.k(this);
                }
                this.f1681t = -1;
                this.f1674m = false;
                q();
                this.A.j(0);
                this.f1668g.onRelease();
                this.f1669h.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1681t);
                if (iFindPointerIndex == -1) {
                    StringBuilder sbA = defpackage.a.a("Invalid pointerId=");
                    sbA.append(this.f1681t);
                    sbA.append(" in onTouchEvent");
                    Log.e("NestedScrollView", sbA.toString());
                } else {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    int i13 = this.f1670i - y10;
                    float x10 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i13 / getHeight();
                    if (d.a(this.f1668g) != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        fB = -d.b(this.f1668g, -height, x10);
                        if (d.a(this.f1668g) == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                            edgeEffect2 = this.f1668g;
                            edgeEffect2.onRelease();
                        }
                        f11 = fB;
                    } else if (d.a(this.f1669h) != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        fB = d.b(this.f1669h, height, 1.0f - x10);
                        if (d.a(this.f1669h) == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                            edgeEffect2 = this.f1669h;
                            edgeEffect2.onRelease();
                        }
                        f11 = fB;
                    }
                    int iRound = Math.round(f11 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i14 = i13 - iRound;
                    if (!this.f1674m && Math.abs(i14) > this.f1678q) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1674m = true;
                        int i15 = this.f1678q;
                        i14 = i14 > 0 ? i14 - i15 : i14 + i15;
                    }
                    int i16 = i14;
                    if (this.f1674m) {
                        if (f(0, i16, this.f1683v, this.f1682u, 0)) {
                            i16 -= this.f1683v[1];
                            this.f1684w += this.f1682u[1];
                        }
                        int i17 = i16;
                        this.f1670i = y10 - this.f1682u[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z12 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        boolean z13 = p(0, i17, 0, getScrollY(), 0, scrollRange, 0, 0) && !k(0);
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.f1683v;
                        iArr[1] = 0;
                        this.A.f(0, scrollY2, 0, i17 - scrollY2, this.f1682u, 0, iArr);
                        int i18 = this.f1670i;
                        int[] iArr2 = this.f1682u;
                        this.f1670i = i18 - iArr2[1];
                        this.f1684w += iArr2[1];
                        if (z12) {
                            int i19 = i17 - this.f1683v[1];
                            int i20 = scrollY + i19;
                            if (i20 < 0) {
                                d.b(this.f1668g, (-i19) / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                if (!this.f1669h.isFinished()) {
                                    edgeEffect3 = this.f1669h;
                                    edgeEffect3.onRelease();
                                }
                            } else if (i20 > scrollRange) {
                                d.b(this.f1669h, i19 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                if (!this.f1668g.isFinished()) {
                                    edgeEffect3 = this.f1668g;
                                    edgeEffect3.onRelease();
                                }
                            }
                            if (this.f1668g.isFinished() && this.f1669h.isFinished()) {
                                z11 = z13;
                            } else {
                                WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
                                e0.d.k(this);
                            }
                        } else {
                            z11 = z13;
                        }
                        if (z11) {
                            this.f1675n.clear();
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1674m && getChildCount() > 0 && this.f1667f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap<View, m0> weakHashMap3 = e0.f34354a;
                    e0.d.k(this);
                }
                this.f1681t = -1;
                this.f1674m = false;
                q();
                this.A.j(0);
                this.f1668g.onRelease();
                this.f1669h.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1670i = (int) motionEvent.getY(actionIndex);
                this.f1681t = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.f1670i = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1681t));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1674m && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1667f.isFinished()) {
                a();
            }
            this.f1670i = (int) motionEvent.getY();
            this.f1681t = motionEvent.getPointerId(0);
            w(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f1675n;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public boolean p(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z10;
        boolean z11;
        int overScrollMode = getOverScrollMode();
        boolean z12 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z13 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z14 = overScrollMode == 0 || (overScrollMode == 1 && z12);
        boolean z15 = overScrollMode == 0 || (overScrollMode == 1 && z13);
        int i18 = i12 + i10;
        int i19 = !z14 ? 0 : i16;
        int i20 = i13 + i11;
        int i21 = !z15 ? 0 : i17;
        int i22 = -i19;
        int i23 = i19 + i14;
        int i24 = -i21;
        int i25 = i21 + i15;
        if (i18 > i23) {
            i18 = i23;
            z10 = true;
        } else if (i18 < i22) {
            z10 = true;
            i18 = i22;
        } else {
            z10 = false;
        }
        if (i20 > i25) {
            i20 = i25;
            z11 = true;
        } else if (i20 < i24) {
            z11 = true;
            i20 = i24;
        } else {
            z11 = false;
        }
        if (z11 && !k(1)) {
            this.f1667f.springBack(i18, i20, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i18, i20, z10, z11);
        return z10 || z11;
    }

    public final void q() {
        VelocityTracker velocityTracker = this.f1675n;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1675n = null;
        }
    }

    public final void r(boolean z10) {
        if (z10) {
            w(2, 1);
        } else {
            this.A.j(1);
        }
        this.f1685x = getScrollY();
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.d.k(this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f1671j) {
            this.f1673l = view2;
        } else {
            t(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iE = e(rect);
        boolean z11 = iE != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, iE);
            } else {
                v(0, iE, BaseTransientBottomBar.ANIMATION_DURATION, false);
            }
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            q();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f1671j = true;
        super.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean s(int i10, int i11, int i12) {
        boolean z10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z11 = i10 == 33;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = (View) focusables.get(i14);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z13 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13 && z14) {
                            view = view2;
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else if (z14) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i11 < scrollY || i12 > i13) {
            g(z11 ? i11 - scrollY : i12 - i13);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i10);
        }
        return z10;
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iD = d(i10, width, width2);
            int iD2 = d(i11, height, height2);
            if (iD == getScrollX() && iD2 == getScrollY()) {
                return;
            }
            super.scrollTo(iD, iD2);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f1676o) {
            this.f1676o = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        q qVar = this.A;
        if (qVar.f34401d) {
            View view = qVar.f34400c;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.i.z(view);
        }
        qVar.f34401d = z10;
    }

    public void setOnScrollChangeListener(c cVar) {
        this.C = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f1677p = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.A.i(i10, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.A.j(0);
    }

    public final void t(View view) {
        view.getDrawingRect(this.f1666e);
        offsetDescendantRectToMyCoords(view, this.f1666e);
        int iE = e(this.f1666e);
        if (iE != 0) {
            scrollBy(0, iE);
        }
    }

    public final boolean u(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float fA = d.a(edgeEffect) * getHeight();
        double dLog = Math.log((Math.abs(-i10) * 0.35f) / (this.f1664c * 0.015f));
        double d10 = D;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * dLog) * ((double) (this.f1664c * 0.015f)))) < fA;
    }

    public final void v(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1665d > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1667f.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, i12);
            r(z10);
        } else {
            if (!this.f1667f.isFinished()) {
                a();
            }
            scrollBy(i10, i11);
        }
        this.f1665d = AnimationUtils.currentAnimationTimeMillis();
    }

    public boolean w(int i10, int i11) {
        return this.A.i(i10, i11);
    }

    public final boolean x(MotionEvent motionEvent) {
        boolean z10;
        if (d.a(this.f1668g) != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            d.b(this.f1668g, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (d.a(this.f1669h) == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return z10;
        }
        d.b(this.f1669h, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public void y(int i10) {
        this.A.j(i10);
    }

    @Override // p0.r
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        t tVar = this.f1687z;
        if (i11 == 1) {
            tVar.f34436b = i10;
        } else {
            tVar.f34435a = i10;
        }
        w(2, i11);
    }

    @Override // p0.r
    public void onStopNestedScroll(View view, int i10) {
        t tVar = this.f1687z;
        if (i10 == 1) {
            tVar.f34436b = 0;
        } else {
            tVar.f34435a = 0;
        }
        this.A.j(i10);
    }
}
