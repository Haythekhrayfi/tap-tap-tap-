package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.R;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements a0, p0.r, p0.s {
    public static final int[] D = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public final Runnable A;
    public final Runnable B;
    public final p0.t C;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ContentFrameLayout f944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActionBarContainer f945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b0 f946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f950k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f953n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f954o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f955p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f956q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f957r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p0.s0 f958s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p0.s0 f959t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p0.s0 f960u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p0.s0 f961v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d f962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public OverScroller f963x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ViewPropertyAnimator f964y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AnimatorListenerAdapter f965z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f964y = null;
            actionBarOverlayLayout.f952m = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f964y = null;
            actionBarOverlayLayout.f952m = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.k();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f964y = actionBarOverlayLayout.f945f.animate().translationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD).setListener(ActionBarOverlayLayout.this.f965z);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.k();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f964y = actionBarOverlayLayout.f945f.animate().translationY(-ActionBarOverlayLayout.this.f945f.getHeight()).setListener(ActionBarOverlayLayout.this.f965z);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f943d = 0;
        this.f955p = new Rect();
        this.f956q = new Rect();
        this.f957r = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        p0.s0 s0Var = p0.s0.f34403b;
        this.f958s = s0Var;
        this.f959t = s0Var;
        this.f960u = s0Var;
        this.f961v = s0Var;
        this.f965z = new a();
        this.A = new b();
        this.B = new c();
        l(context);
        this.C = new p0.t(this);
    }

    @Override // androidx.appcompat.widget.a0
    public void a(Menu menu, androidx.appcompat.view.menu.i.a aVar) {
        m();
        this.f946g.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.a0
    public boolean b() {
        m();
        return this.f946g.b();
    }

    @Override // androidx.appcompat.widget.a0
    public void c() {
        m();
        this.f946g.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.a0
    public boolean d() {
        m();
        return this.f946g.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f947h == null || this.f948i) {
            return;
        }
        if (this.f945f.getVisibility() == 0) {
            translationY = (int) (this.f945f.getTranslationY() + this.f945f.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f947h.setBounds(0, translationY, getWidth(), this.f947h.getIntrinsicHeight() + translationY);
        this.f947h.draw(canvas);
    }

    @Override // androidx.appcompat.widget.a0
    public boolean e() {
        m();
        return this.f946g.e();
    }

    @Override // androidx.appcompat.widget.a0
    public boolean f() {
        m();
        return this.f946g.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.a0
    public boolean g() {
        m();
        return this.f946g.g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f945f;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.C.a();
    }

    public CharSequence getTitle() {
        m();
        return this.f946g.getTitle();
    }

    @Override // androidx.appcompat.widget.a0
    public void h(int i10) {
        m();
        if (i10 == 2) {
            this.f946g.u();
        } else if (i10 == 5) {
            this.f946g.v();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.a0
    public void i() {
        m();
        this.f946g.h();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final boolean j(View view, Rect rect, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        e eVar = (e) view.getLayoutParams();
        if (z10) {
            int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i11 = rect.left;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i11;
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        if (z11) {
            int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            int i13 = rect.top;
            if (i12 != i13) {
                ((ViewGroup.MarginLayoutParams) eVar).topMargin = i13;
                z14 = true;
            }
        }
        if (z13) {
            int i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            int i15 = rect.right;
            if (i14 != i15) {
                ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i15;
                z14 = true;
            }
        }
        if (z12) {
            int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i17;
                return true;
            }
        }
        return z14;
    }

    public void k() {
        removeCallbacks(this.A);
        removeCallbacks(this.B);
        ViewPropertyAnimator viewPropertyAnimator = this.f964y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void l(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(D);
        this.f942c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f947h = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f948i = context.getApplicationInfo().targetSdkVersion < 19;
        this.f963x = new OverScroller(context);
    }

    public void m() {
        b0 wrapper;
        if (this.f944e == null) {
            this.f944e = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f945f = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof b0) {
                wrapper = (b0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    StringBuilder sbA = defpackage.a.a("Can't make a decor toolbar out of ");
                    sbA.append(callbackFindViewById.getClass().getSimpleName());
                    throw new IllegalStateException(sbA.toString());
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f946g = wrapper;
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m();
        p0.s0 s0VarK = p0.s0.k(windowInsets, this);
        boolean zJ = j(this.f945f, new Rect(s0VarK.d(), s0VarK.f(), s0VarK.e(), s0VarK.c()), true, true, false, true);
        Rect rect = this.f955p;
        WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
        p0.e0.i.b(this, s0VarK, rect);
        Rect rect2 = this.f955p;
        p0.s0 s0VarN = s0VarK.f34404a.n(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.f958s = s0VarN;
        boolean z10 = true;
        if (!this.f959t.equals(s0VarN)) {
            this.f959t = this.f958s;
            zJ = true;
        }
        if (this.f956q.equals(this.f955p)) {
            z10 = zJ;
        } else {
            this.f956q.set(this.f955p);
        }
        if (z10) {
            requestLayout();
        }
        return s0VarK.f34404a.a().a().f34404a.b().i();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l(getContext());
        WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
        p0.e0.h.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int measuredHeight;
        p0.s0 s0VarA;
        m();
        measureChildWithMargins(this.f945f, i10, 0, i11, 0);
        e eVar = (e) this.f945f.getLayoutParams();
        int iMax = Math.max(0, this.f945f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f945f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f945f.getMeasuredState());
        WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
        boolean z10 = (p0.e0.d.g(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f942c;
            if (this.f950k && this.f945f.getTabContainer() != null) {
                measuredHeight += this.f942c;
            }
        } else {
            measuredHeight = this.f945f.getVisibility() != 8 ? this.f945f.getMeasuredHeight() : 0;
        }
        this.f957r.set(this.f955p);
        p0.s0 s0Var = this.f958s;
        this.f960u = s0Var;
        if (this.f949j || z10) {
            h0.g gVarB = h0.g.b(s0Var.d(), this.f960u.f() + measuredHeight, this.f960u.e(), this.f960u.c() + 0);
            p0.s0.b bVar = new p0.s0.b(this.f960u);
            bVar.f34409a.d(gVarB);
            s0VarA = bVar.a();
        } else {
            Rect rect = this.f957r;
            rect.top += measuredHeight;
            rect.bottom += 0;
            s0VarA = s0Var.f34404a.n(0, measuredHeight, 0, 0);
        }
        this.f960u = s0VarA;
        j(this.f944e, this.f957r, true, true, true, true);
        if (!this.f961v.equals(this.f960u)) {
            p0.s0 s0Var2 = this.f960u;
            this.f961v = s0Var2;
            p0.e0.c(this.f944e, s0Var2);
        }
        measureChildWithMargins(this.f944e, i10, 0, i11, 0);
        e eVar2 = (e) this.f944e.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f944e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f944e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f944e.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f951l || !z10) {
            return false;
        }
        this.f963x.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f963x.getFinalY() > this.f945f.getHeight()) {
            k();
            this.B.run();
        } else {
            k();
            this.A.run();
        }
        this.f952m = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // p0.r
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f953n + i11;
        this.f953n = i14;
        setActionBarHideOffset(i14);
    }

    @Override // p0.r
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // p0.s
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        androidx.appcompat.app.z zVar;
        i.h hVar;
        this.C.f34435a = i10;
        this.f953n = getActionBarHideOffset();
        k();
        d dVar = this.f962w;
        if (dVar == null || (hVar = (zVar = (androidx.appcompat.app.z) dVar).f751u) == null) {
            return;
        }
        hVar.a();
        zVar.f751u = null;
    }

    @Override // p0.r
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f945f.getVisibility() != 0) {
            return false;
        }
        return this.f951l;
    }

    @Override // p0.r
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f951l && !this.f952m) {
            if (this.f953n <= this.f945f.getHeight()) {
                k();
                postDelayed(this.A, 600L);
            } else {
                k();
                postDelayed(this.B, 600L);
            }
        }
        d dVar = this.f962w;
        if (dVar != null) {
            Objects.requireNonNull(dVar);
        }
    }

    @Override // p0.r
    public void onStopNestedScroll(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        m();
        int i11 = this.f954o ^ i10;
        this.f954o = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        d dVar = this.f962w;
        if (dVar != null) {
            ((androidx.appcompat.app.z) dVar).f746p = !z11;
            if (z10 || !z11) {
                androidx.appcompat.app.z zVar = (androidx.appcompat.app.z) dVar;
                if (zVar.f748r) {
                    zVar.f748r = false;
                    zVar.w(true);
                }
            } else {
                androidx.appcompat.app.z zVar2 = (androidx.appcompat.app.z) dVar;
                if (!zVar2.f748r) {
                    zVar2.f748r = true;
                    zVar2.w(true);
                }
            }
        }
        if ((i11 & 256) == 0 || this.f962w == null) {
            return;
        }
        WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
        p0.e0.h.c(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f943d = i10;
        d dVar = this.f962w;
        if (dVar != null) {
            ((androidx.appcompat.app.z) dVar).f745o = i10;
        }
    }

    public void setActionBarHideOffset(int i10) {
        k();
        this.f945f.setTranslationY(-Math.max(0, Math.min(i10, this.f945f.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f962w = dVar;
        if (getWindowToken() != null) {
            ((androidx.appcompat.app.z) this.f962w).f745o = this.f943d;
            int i10 = this.f954o;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
                p0.e0.h.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f950k = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f951l) {
            this.f951l = z10;
            if (z10) {
                return;
            }
            k();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        m();
        this.f946g.setIcon(i10);
    }

    public void setIcon(Drawable drawable) {
        m();
        this.f946g.setIcon(drawable);
    }

    public void setLogo(int i10) {
        m();
        this.f946g.m(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f949j = z10;
        this.f948i = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.a0
    public void setWindowCallback(Window.Callback callback) {
        m();
        this.f946g.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.a0
    public void setWindowTitle(CharSequence charSequence) {
        m();
        this.f946g.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
