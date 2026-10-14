package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;
import p0.s0;
import p0.u;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int[] f2928f0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final Comparator<f> f2929g0 = new a();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Interpolator f2930h0 = new b();

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final m f2931i0 = new m();
    public boolean A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public float G;
    public float H;
    public int I;
    public VelocityTracker J;
    public int K;
    public int L;
    public int M;
    public int N;
    public EdgeEffect O;
    public EdgeEffect P;
    public boolean Q;
    public boolean R;
    public int S;
    public List<j> T;
    public j U;
    public List<i> V;
    public k W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f2932a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f2933b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2934c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ArrayList<View> f2935c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<f> f2936d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Runnable f2937d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f2938e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f2939e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f2940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v1.a f2941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Parcelable f2944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ClassLoader f2945k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Scroller f2946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2947m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l f2948n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2949o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f2950p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2951q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2952r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f2953s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f2954t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2955u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2956v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2957w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2958x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2959y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f2960z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2961c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Parcelable f2962d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ClassLoader f2963e;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f2961c = parcel.readInt();
            this.f2962d = parcel.readParcelable(classLoader);
            this.f2963e = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("FragmentPager.SavedState{");
            sbA.append(Integer.toHexString(System.identityHashCode(this)));
            sbA.append(" position=");
            return android.support.v4.media.b.a(sbA, this.f2961c, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2961c);
            parcel.writeParcelable(this.f2962d, i10);
        }
    }

    public static class a implements Comparator<f> {
        @Override // java.util.Comparator
        public int compare(f fVar, f fVar2) {
            return fVar.f2968b - fVar2.f2968b;
        }
    }

    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager viewPager = ViewPager.this;
            viewPager.t(viewPager.f2942h);
        }
    }

    public class d implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f2965a = new Rect();

        public d() {
        }

        @Override // p0.u
        public s0 onApplyWindowInsets(View view, s0 s0Var) {
            s0 s0VarK = e0.k(view, s0Var);
            if (s0VarK.h()) {
                return s0VarK;
            }
            Rect rect = this.f2965a;
            rect.left = s0VarK.d();
            rect.top = s0VarK.f();
            rect.right = s0VarK.e();
            rect.bottom = s0VarK.c();
            int childCount = ViewPager.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                s0 s0VarC = e0.c(ViewPager.this.getChildAt(i10), s0VarK);
                rect.left = Math.min(s0VarC.d(), rect.left);
                rect.top = Math.min(s0VarC.f(), rect.top);
                rect.right = Math.min(s0VarC.e(), rect.right);
                rect.bottom = Math.min(s0VarC.c(), rect.bottom);
            }
            int i11 = rect.left;
            int i12 = rect.top;
            int i13 = rect.right;
            int i14 = rect.bottom;
            s0.b bVar = new s0.b(s0VarK);
            bVar.f34409a.d(h0.g.b(i11, i12, i13, i14));
            return bVar.a();
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f2967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f2970d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f2971e;
    }

    public static class g extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f2974c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2975d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2976e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2977f;

        public g() {
            super(-1, -1);
            this.f2974c = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2974c = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f2928f0);
            this.f2973b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class h extends p0.a {
        public h() {
        }

        @Override // p0.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            v1.a aVar;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            v1.a aVar2 = ViewPager.this.f2941g;
            accessibilityEvent.setScrollable(aVar2 != null && aVar2.b() > 1);
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.f2941g) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.b());
            accessibilityEvent.setFromIndex(ViewPager.this.f2942h);
            accessibilityEvent.setToIndex(ViewPager.this.f2942h);
        }

        @Override // p0.a
        public void onInitializeAccessibilityNodeInfo(View view, q0.c cVar) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            cVar.f34746a.setClassName(ViewPager.class.getName());
            v1.a aVar = ViewPager.this.f2941g;
            cVar.f34746a.setScrollable(aVar != null && aVar.b() > 1);
            if (ViewPager.this.canScrollHorizontally(1)) {
                cVar.f34746a.addAction(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                cVar.f34746a.addAction(8192);
            }
        }

        @Override // p0.a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            ViewPager viewPager;
            int i11;
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            if (i10 != 4096) {
                if (i10 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i11 = viewPager.f2942h - 1;
            } else {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i11 = viewPager.f2942h + 1;
            }
            viewPager.setCurrentItem(i11);
            return true;
        }
    }

    public interface i {
        void onAdapterChanged(ViewPager viewPager, v1.a aVar, v1.a aVar2);
    }

    public interface j {
        void onPageScrollStateChanged(int i10);

        void onPageScrolled(int i10, float f10, int i11);

        void onPageSelected(int i10);
    }

    public interface k {
    }

    public class l extends DataSetObserver {
        public l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.f();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.f();
        }
    }

    public static class m implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z10 = gVar.f2972a;
            if (z10 != gVar2.f2972a) {
                return z10 ? 1 : -1;
            }
            return gVar.f2976e - gVar2.f2976e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.f2936d = new ArrayList<>();
        this.f2938e = new f();
        this.f2940f = new Rect();
        this.f2943i = -1;
        this.f2944j = null;
        this.f2945k = null;
        this.f2953s = -3.4028235E38f;
        this.f2954t = Float.MAX_VALUE;
        this.f2959y = 1;
        this.I = -1;
        this.Q = true;
        this.f2937d0 = new c();
        this.f2939e0 = 0;
        l();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2936d = new ArrayList<>();
        this.f2938e = new f();
        this.f2940f = new Rect();
        this.f2943i = -1;
        this.f2944j = null;
        this.f2945k = null;
        this.f2953s = -3.4028235E38f;
        this.f2954t = Float.MAX_VALUE;
        this.f2959y = 1;
        this.I = -1;
        this.Q = true;
        this.f2937d0 = new c();
        this.f2939e0 = 0;
        l();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f2957w != z10) {
            this.f2957w = z10;
        }
    }

    public void A(boolean z10, k kVar) {
        boolean z11 = true != (this.W != null);
        this.W = kVar;
        setChildrenDrawingOrderEnabled(true);
        this.f2933b0 = z10 ? 2 : 1;
        this.f2932a0 = 2;
        if (z11) {
            t(this.f2942h);
        }
    }

    public final void B() {
        if (this.f2933b0 != 0) {
            ArrayList<View> arrayList = this.f2935c0;
            if (arrayList == null) {
                this.f2935c0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f2935c0.add(getChildAt(i10));
            }
            Collections.sort(this.f2935c0, f2931i0);
        }
    }

    public f a(int i10, int i11) {
        f fVar = new f();
        fVar.f2968b = i10;
        fVar.f2967a = this.f2941g.d(this, i10);
        Objects.requireNonNull(this.f2941g);
        fVar.f2970d = 1.0f;
        if (i11 < 0 || i11 >= this.f2936d.size()) {
            this.f2936d.add(fVar);
        } else {
            this.f2936d.add(i11, fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        f fVarI;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (fVarI = i(childAt)) != null && fVarI.f2968b == this.f2942h) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f fVarI;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (fVarI = i(childAt)) != null && fVarI.f2968b == this.f2942h) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new g();
        }
        g gVar = (g) layoutParams;
        boolean z10 = gVar.f2972a | (view.getClass().getAnnotation(e.class) != null);
        gVar.f2972a = z10;
        if (!this.f2956v) {
            super.addView(view, i10, layoutParams);
        } else {
            if (z10) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.f2975d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    public void b(j jVar) {
        if (this.T == null) {
            this.T = new ArrayList();
        }
        this.T.add(jVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
    public boolean c(int i10) {
        boolean zP;
        boolean z10;
        View viewFindFocus = findFocus();
        boolean zO = false;
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    z10 = false;
                    break;
                }
                if (parent == this) {
                    z10 = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb2.append(" => ");
                    sb2.append(parent2.getClass().getSimpleName());
                }
                StringBuilder sbA = defpackage.a.a("arrowScroll tried to find focus based on non-child current focused view ");
                sbA.append(sb2.toString());
                Log.e("ViewPager", sbA.toString());
                viewFindFocus = null;
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i10 == 17 || i10 == 1) {
                zO = o();
            } else if (i10 == 66 || i10 == 2) {
                zO = p();
            }
        } else if (i10 == 17) {
            int i11 = h(this.f2940f, viewFindNextFocus).left;
            int i12 = h(this.f2940f, viewFindFocus).left;
            if (viewFindFocus == null || i11 < i12) {
                zP = viewFindNextFocus.requestFocus();
            } else {
                zP = o();
            }
            zO = zP;
        } else if (i10 == 66) {
            int i13 = h(this.f2940f, viewFindNextFocus).left;
            int i14 = h(this.f2940f, viewFindFocus).left;
            if (viewFindFocus == null || i13 > i14) {
                zP = viewFindNextFocus.requestFocus();
            } else {
                zP = p();
            }
            zO = zP;
        }
        if (zO) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zO;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.f2941g == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.f2953s));
        }
        return i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.f2954t));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f2947m = true;
        if (this.f2946l.isFinished() || !this.f2946l.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f2946l.getCurrX();
        int currY = this.f2946l.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!q(currX)) {
                this.f2946l.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.d.k(this);
    }

    public boolean d(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && d(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zO;
        int i10;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zO = false;
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode != 22) {
                        if (keyCode != 61) {
                            zO = false;
                        } else if (keyEvent.hasNoModifiers()) {
                            zO = c(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            zO = c(1);
                        } else {
                            zO = false;
                        }
                    } else if (keyEvent.hasModifiers(2)) {
                        zO = p();
                    } else {
                        i10 = 66;
                        zO = c(i10);
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    zO = o();
                } else {
                    i10 = 17;
                    zO = c(i10);
                }
            }
            if (!zO) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarI;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (fVarI = i(childAt)) != null && fVarI.f2968b == this.f2942h && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        v1.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f2941g) != null && aVar.b() > 1)) {
            if (!this.O.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f2953s * width);
                this.O.setSize(height, width);
                zDraw = false | this.O.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.P.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f2954t + 1.0f)) * width2);
                this.P.setSize(height2, width2);
                zDraw |= this.P.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.O.finish();
            this.P.finish();
        }
        if (zDraw) {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.d.k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2950p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e(boolean z10) {
        boolean z11 = this.f2939e0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f2946l.isFinished()) {
                this.f2946l.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f2946l.getCurrX();
                int currY = this.f2946l.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        q(currX);
                    }
                }
            }
        }
        this.f2958x = false;
        for (int i10 = 0; i10 < this.f2936d.size(); i10++) {
            f fVar = this.f2936d.get(i10);
            if (fVar.f2969c) {
                fVar.f2969c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (!z10) {
                this.f2937d0.run();
                return;
            }
            Runnable runnable = this.f2937d0;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.d.m(this, runnable);
        }
    }

    public void f() {
        int iB = this.f2941g.b();
        this.f2934c = iB;
        boolean z10 = this.f2936d.size() < (this.f2959y * 2) + 1 && this.f2936d.size() < iB;
        int iMax = this.f2942h;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < this.f2936d.size()) {
            f fVar = this.f2936d.get(i10);
            int iC = this.f2941g.c(fVar.f2967a);
            if (iC != -1) {
                if (iC == -2) {
                    this.f2936d.remove(i10);
                    i10--;
                    if (!z11) {
                        Objects.requireNonNull(this.f2941g);
                        z11 = true;
                    }
                    this.f2941g.a(this, fVar.f2968b, fVar.f2967a);
                    int i11 = this.f2942h;
                    if (i11 == fVar.f2968b) {
                        iMax = Math.max(0, Math.min(i11, iB - 1));
                    }
                } else {
                    int i12 = fVar.f2968b;
                    if (i12 != iC) {
                        if (i12 == this.f2942h) {
                            iMax = iC;
                        }
                        fVar.f2968b = iC;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        if (z11) {
            Objects.requireNonNull(this.f2941g);
        }
        Collections.sort(this.f2936d, f2929g0);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                g gVar = (g) getChildAt(i13).getLayoutParams();
                if (!gVar.f2972a) {
                    gVar.f2974c = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                }
            }
            z(iMax, false, true, 0);
            requestLayout();
        }
    }

    public final void g(int i10) {
        j jVar = this.U;
        if (jVar != null) {
            jVar.onPageSelected(i10);
        }
        List<j> list = this.T;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = this.T.get(i11);
                if (jVar2 != null) {
                    jVar2.onPageSelected(i10);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new g();
    }

    public v1.a getAdapter() {
        return this.f2941g;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.f2933b0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((g) this.f2935c0.get(i11).getLayoutParams()).f2977f;
    }

    public int getCurrentItem() {
        return this.f2942h;
    }

    public int getOffscreenPageLimit() {
        return this.f2959y;
    }

    public int getPageMargin() {
        return this.f2949o;
    }

    public final Rect h(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public f i(View view) {
        for (int i10 = 0; i10 < this.f2936d.size(); i10++) {
            f fVar = this.f2936d.get(i10);
            if (this.f2941g.e(view, fVar.f2967a)) {
                return fVar;
            }
        }
        return null;
    }

    public final f j() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.f2949o / clientWidth : 0.0f;
        f fVar = null;
        int i11 = 0;
        int i12 = -1;
        boolean z10 = true;
        float f12 = 0.0f;
        while (i11 < this.f2936d.size()) {
            f fVar2 = this.f2936d.get(i11);
            if (!z10 && fVar2.f2968b != (i10 = i12 + 1)) {
                fVar2 = this.f2938e;
                fVar2.f2971e = f10 + f12 + f11;
                fVar2.f2968b = i10;
                Objects.requireNonNull(this.f2941g);
                fVar2.f2970d = 1.0f;
                i11--;
            }
            f10 = fVar2.f2971e;
            float f13 = fVar2.f2970d + f10 + f11;
            if (!z10 && scrollX < f10) {
                return fVar;
            }
            if (scrollX < f13 || i11 == this.f2936d.size() - 1) {
                return fVar2;
            }
            i12 = fVar2.f2968b;
            f12 = fVar2.f2970d;
            i11++;
            z10 = false;
            fVar = fVar2;
        }
        return fVar;
    }

    public f k(int i10) {
        for (int i11 = 0; i11 < this.f2936d.size(); i11++) {
            f fVar = this.f2936d.get(i11);
            if (fVar.f2968b == i10) {
                return fVar;
            }
        }
        return null;
    }

    public void l() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f2946l = new Scroller(context, f2930h0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.D = viewConfiguration.getScaledPagingTouchSlop();
        this.K = (int) (400.0f * f10);
        this.L = viewConfiguration.getScaledMaximumFlingVelocity();
        this.O = new EdgeEffect(context);
        this.P = new EdgeEffect(context);
        this.M = (int) (25.0f * f10);
        this.N = (int) (2.0f * f10);
        this.B = (int) (f10 * 16.0f);
        e0.q(this, new h());
        if (e0.d.c(this) == 0) {
            e0.d.s(this, 1);
        }
        e0.i.u(this, new d());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    public void m(int i10, float f10, int i11) {
        t9.c<TAB_DATA, TAB_VIEW, ACTION>.e eVar;
        int iMax;
        int width;
        int left;
        if (this.S > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f2972a) {
                    int i13 = gVar.f2973b & 7;
                    if (i13 != 1) {
                        if (i13 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i13 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i14 = iMax;
                    width = paddingLeft;
                    paddingLeft = i14;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        j jVar = this.U;
        if (jVar != null) {
            jVar.onPageScrolled(i10, f10, i11);
        }
        List<j> list = this.T;
        if (list != null) {
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                j jVar2 = this.T.get(i15);
                if (jVar2 != null) {
                    jVar2.onPageScrolled(i10, f10, i11);
                }
            }
        }
        if (this.W != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt2 = getChildAt(i16);
                if (!((g) childAt2.getLayoutParams()).f2972a) {
                    float left2 = (childAt2.getLeft() - scrollX2) / getClientWidth();
                    t9.c cVar = t9.c.this;
                    if (!cVar.f35741o && left2 > -1.0f && left2 < 1.0f && (eVar = cVar.f35734h.get(childAt2)) != null) {
                        eVar.a();
                    }
                }
            }
        }
        this.R = true;
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.I) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.E = motionEvent.getX(i10);
            this.I = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean o() {
        int i10 = this.f2942h;
        if (i10 <= 0) {
            return false;
        }
        y(i10 - 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f2937d0);
        Scroller scroller = this.f2946l;
        if (scroller != null && !scroller.isFinished()) {
            this.f2946l.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        float f10;
        super.onDraw(canvas);
        if (this.f2949o <= 0 || this.f2950p == null || this.f2936d.size() <= 0 || this.f2941g == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f11 = width;
        float f12 = this.f2949o / f11;
        int i11 = 0;
        f fVar = this.f2936d.get(0);
        float f13 = fVar.f2971e;
        int size = this.f2936d.size();
        int i12 = fVar.f2968b;
        int i13 = this.f2936d.get(size - 1).f2968b;
        while (i12 < i13) {
            while (true) {
                i10 = fVar.f2968b;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                fVar = this.f2936d.get(i11);
            }
            if (i12 == i10) {
                float f14 = fVar.f2971e;
                float f15 = fVar.f2970d;
                f10 = (f14 + f15) * f11;
                f13 = f14 + f15 + f12;
            } else {
                Objects.requireNonNull(this.f2941g);
                f10 = (f13 + 1.0f) * f11;
                f13 = 1.0f + f12 + f13;
            }
            if (this.f2949o + f10 > scrollX) {
                this.f2950p.setBounds(Math.round(f10), this.f2951q, Math.round(this.f2949o + f10), this.f2952r);
                this.f2950p.draw(canvas);
            }
            if (f10 > scrollX + width) {
                return;
            }
            i12++;
            f12 = f12;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            w();
            return false;
        }
        if (action != 0) {
            if (this.f2960z) {
                return true;
            }
            if (this.A) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.G = x10;
            this.E = x10;
            float y10 = motionEvent.getY();
            this.H = y10;
            this.F = y10;
            this.I = motionEvent.getPointerId(0);
            this.A = false;
            this.f2947m = true;
            this.f2946l.computeScrollOffset();
            if (this.f2939e0 != 2 || Math.abs(this.f2946l.getFinalX() - this.f2946l.getCurrX()) <= this.N) {
                e(false);
                this.f2960z = false;
            } else {
                this.f2946l.abortAnimation();
                this.f2958x = false;
                t(this.f2942h);
                this.f2960z = true;
                v(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.I;
            if (i10 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.E;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.H);
                if (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    float f11 = this.E;
                    if (!((f11 < ((float) this.C) && f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) || (f11 > ((float) (getWidth() - this.C)) && f10 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD)) && d(this, false, (int) f10, (int) x11, (int) y11)) {
                        this.E = x11;
                        this.F = y11;
                        this.A = true;
                        return false;
                    }
                }
                int i11 = this.D;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    this.f2960z = true;
                    v(true);
                    setScrollState(1);
                    float f12 = this.G;
                    float f13 = this.D;
                    this.E = f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? f12 + f13 : f12 - f13;
                    this.F = y11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i11) {
                    this.A = true;
                }
                if (this.f2960z && r(x11)) {
                    WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                    e0.d.k(this);
                }
            }
        } else if (action == 6) {
            n(motionEvent);
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        return this.f2960z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        f fVarI;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f2972a) {
                    int i18 = gVar.f2973b;
                    int i19 = i18 & 7;
                    int i20 = i18 & 112;
                    if (i19 != 1) {
                        if (i19 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i19 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i14 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i20 != 16) {
                            if (i20 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i20 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i21 = paddingLeft + scrollX;
                            childAt.layout(i21, paddingTop, childAt.getMeasuredWidth() + i21, childAt.getMeasuredHeight() + paddingTop);
                            i16++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i22 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i22;
                        int i23 = paddingLeft + scrollX;
                        childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, childAt.getMeasuredHeight() + paddingTop);
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i14 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i24 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i24;
                    if (i20 != 16) {
                        if (i20 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i20 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i25 = paddingLeft + scrollX;
                        childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, childAt.getMeasuredHeight() + paddingTop);
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i26 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i26;
                    int i27 = paddingLeft + scrollX;
                    childAt.layout(i27, paddingTop, childAt.getMeasuredWidth() + i27, childAt.getMeasuredHeight() + paddingTop);
                    i16++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i28 = (i14 - paddingLeft) - paddingRight;
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt2 = getChildAt(i29);
            if (childAt2.getVisibility() != 8) {
                g gVar2 = (g) childAt2.getLayoutParams();
                if (!gVar2.f2972a && (fVarI = i(childAt2)) != null) {
                    float f10 = i28;
                    int i30 = ((int) (fVarI.f2971e * f10)) + paddingLeft;
                    if (gVar2.f2975d) {
                        gVar2.f2975d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * gVar2.f2974c), 1073741824), View.MeasureSpec.makeMeasureSpec((i15 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i30, paddingTop, childAt2.getMeasuredWidth() + i30, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f2951q = paddingTop;
        this.f2952r = i15 - paddingBottom;
        this.S = i16;
        if (this.Q) {
            z11 = false;
            x(this.f2942h, false, 0, false);
        } else {
            z11 = false;
        }
        this.Q = z11;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        g gVar;
        g gVar2;
        int i12;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i10), ViewGroup.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.C = Math.min(measuredWidth / 10, this.B);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f2972a) {
                int i15 = gVar2.f2973b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f2955u = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f2956v = true;
        t(this.f2942h);
        this.f2956v = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f2972a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f2974c), 1073741824), this.f2955u);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        f fVarI;
        int childCount = getChildCount();
        int i13 = -1;
        if ((i10 & 2) != 0) {
            i13 = childCount;
            i11 = 0;
            i12 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
        }
        while (i11 != i13) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (fVarI = i(childAt)) != null && fVarI.f2968b == this.f2942h && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        v1.a aVar = this.f2941g;
        if (aVar != null) {
            aVar.f(savedState.f2962d, savedState.f2963e);
            z(savedState.f2961c, false, true, 0);
        } else {
            this.f2943i = savedState.f2961c;
            this.f2944j = savedState.f2962d;
            this.f2945k = savedState.f2963e;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2961c = this.f2942h;
        v1.a aVar = this.f2941g;
        if (aVar != null) {
            savedState.f2962d = aVar.g();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f2949o;
            u(i10, i12, i14, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        v1.a aVar;
        int pointerId;
        boolean zW = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f2941g) == null || aVar.b() == 0) {
            return false;
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.f2960z) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.I);
                        if (iFindPointerIndex == -1) {
                            zW = w();
                        } else {
                            float x10 = motionEvent.getX(iFindPointerIndex);
                            float fAbs = Math.abs(x10 - this.E);
                            float y10 = motionEvent.getY(iFindPointerIndex);
                            float fAbs2 = Math.abs(y10 - this.F);
                            if (fAbs > this.D && fAbs > fAbs2) {
                                this.f2960z = true;
                                v(true);
                                float f10 = this.G;
                                this.E = x10 - f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? f10 + this.D : f10 - this.D;
                                this.F = y10;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.f2960z) {
                        zW = false | r(motionEvent.getX(motionEvent.findPointerIndex(this.I)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.E = motionEvent.getX(actionIndex);
                        pointerId = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        n(motionEvent);
                        this.E = motionEvent.getX(motionEvent.findPointerIndex(this.I));
                    }
                } else if (this.f2960z) {
                    x(this.f2942h, true, 0, false);
                    zW = w();
                }
            } else if (this.f2960z) {
                VelocityTracker velocityTracker = this.J;
                velocityTracker.computeCurrentVelocity(1000, this.L);
                int xVelocity = (int) velocityTracker.getXVelocity(this.I);
                this.f2958x = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                f fVarJ = j();
                float f11 = clientWidth;
                float f12 = this.f2949o / f11;
                int iMax = fVarJ.f2968b;
                float f13 = ((scrollX / f11) - fVarJ.f2971e) / (fVarJ.f2970d + f12);
                if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.I)) - this.G)) <= this.M || Math.abs(xVelocity) <= this.K) {
                    iMax += (int) (f13 + (iMax >= this.f2942h ? 0.4f : 0.6f));
                } else if (xVelocity <= 0) {
                    iMax++;
                }
                if (this.f2936d.size() > 0) {
                    f fVar = this.f2936d.get(0);
                    ArrayList<f> arrayList = this.f2936d;
                    iMax = Math.max(fVar.f2968b, Math.min(iMax, arrayList.get(arrayList.size() - 1).f2968b));
                }
                z(iMax, true, true, xVelocity);
                zW = w();
            }
            if (zW) {
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                e0.d.k(this);
            }
            return true;
        }
        this.f2946l.abortAnimation();
        this.f2958x = false;
        t(this.f2942h);
        float x11 = motionEvent.getX();
        this.G = x11;
        this.E = x11;
        float y11 = motionEvent.getY();
        this.H = y11;
        this.F = y11;
        pointerId = motionEvent.getPointerId(0);
        this.I = pointerId;
        if (zW) {
            WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
            e0.d.k(this);
        }
        return true;
    }

    public boolean p() {
        v1.a aVar = this.f2941g;
        if (aVar == null || this.f2942h >= aVar.b() - 1) {
            return false;
        }
        y(this.f2942h + 1, true);
        return true;
    }

    public final boolean q(int i10) {
        if (this.f2936d.size() == 0) {
            if (this.Q) {
                return false;
            }
            this.R = false;
            m(0, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0);
            if (this.R) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarJ = j();
        int clientWidth = getClientWidth();
        int i11 = this.f2949o;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = fVarJ.f2968b;
        float f11 = ((i10 / f10) - fVarJ.f2971e) / (fVarJ.f2970d + (i11 / f10));
        this.R = false;
        m(i13, f11, (int) (i12 * f11));
        if (this.R) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean r(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.E - f10;
        this.E = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.f2953s * clientWidth;
        float f13 = this.f2954t * clientWidth;
        boolean z12 = false;
        f fVar = this.f2936d.get(0);
        ArrayList<f> arrayList = this.f2936d;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f2968b != 0) {
            f12 = fVar.f2971e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (fVar2.f2968b != this.f2941g.b() - 1) {
            f13 = fVar2.f2971e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.O.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.P.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.E = (scrollX - i10) + this.E;
        scrollTo(i10, getScrollY());
        q(i10);
        return z12;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f2956v) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void s() {
        t(this.f2942h);
    }

    public void setAdapter(v1.a aVar) {
        v1.a aVar2 = this.f2941g;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.f36657b = null;
            }
            Objects.requireNonNull(this.f2941g);
            for (int i10 = 0; i10 < this.f2936d.size(); i10++) {
                f fVar = this.f2936d.get(i10);
                this.f2941g.a(this, fVar.f2968b, fVar.f2967a);
            }
            Objects.requireNonNull(this.f2941g);
            this.f2936d.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((g) getChildAt(i11).getLayoutParams()).f2972a) {
                    removeViewAt(i11);
                    i11--;
                }
                i11++;
            }
            this.f2942h = 0;
            scrollTo(0, 0);
        }
        v1.a aVar3 = this.f2941g;
        this.f2941g = aVar;
        this.f2934c = 0;
        if (aVar != null) {
            if (this.f2948n == null) {
                this.f2948n = new l();
            }
            v1.a aVar4 = this.f2941g;
            l lVar = this.f2948n;
            synchronized (aVar4) {
                aVar4.f36657b = lVar;
            }
            this.f2958x = false;
            boolean z10 = this.Q;
            this.Q = true;
            this.f2934c = this.f2941g.b();
            if (this.f2943i >= 0) {
                this.f2941g.f(this.f2944j, this.f2945k);
                z(this.f2943i, false, true, 0);
                this.f2943i = -1;
                this.f2944j = null;
                this.f2945k = null;
            } else if (z10) {
                requestLayout();
            } else {
                t(this.f2942h);
            }
        }
        List<i> list = this.V;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.V.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.V.get(i12).onAdapterChanged(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i10) {
        this.f2958x = false;
        z(i10, !this.Q, false, 0);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f2959y) {
            this.f2959y = i10;
            t(this.f2942h);
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.U = jVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f2949o;
        this.f2949o = i10;
        int width = getWidth();
        u(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(int i10) {
        Context context = getContext();
        Object obj = e0.a.f28964a;
        setPageMarginDrawable(e0.a.c.b(context, i10));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f2950p = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.f2939e0 == i10) {
            return;
        }
        this.f2939e0 = i10;
        if (this.W != null) {
            boolean z10 = i10 != 0;
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                getChildAt(i11).setLayerType(z10 ? this.f2932a0 : 0, null);
            }
        }
        j jVar = this.U;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i10);
        }
        List<j> list = this.T;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = this.T.get(i12);
                if (jVar2 != null) {
                    jVar2.onPageScrollStateChanged(i10);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d9 A[PHI: r2 r6 r12
  0x00d9: PHI (r2v18 int) = (r2v17 int), (r2v6 int), (r2v21 int) binds: [B:61:0x00d7, B:58:0x00c9, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00d9: PHI (r6v6 int) = (r6v1 int), (r6v5 int), (r6v9 int) binds: [B:61:0x00d7, B:58:0x00c9, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00d9: PHI (r12v5 float) = (r12v3 float), (r12v4 float), (r12v2 float) binds: [B:61:0x00d7, B:58:0x00c9, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e2 A[PHI: r2 r6 r12
  0x00e2: PHI (r2v20 int) = (r2v17 int), (r2v6 int), (r2v21 int) binds: [B:61:0x00d7, B:58:0x00c9, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00e2: PHI (r6v8 int) = (r6v1 int), (r6v5 int), (r6v9 int) binds: [B:61:0x00d7, B:58:0x00c9, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00e2: PHI (r12v7 float) = (r12v3 float), (r12v4 float), (r12v2 float) binds: [B:61:0x00d7, B:58:0x00c9, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x015e A[PHI: r1 r9
  0x015e: PHI (r1v18 float) = (r1v16 float), (r1v17 float), (r1v15 float) binds: [B:95:0x015c, B:92:0x014a, B:86:0x0136] A[DONT_GENERATE, DONT_INLINE]
  0x015e: PHI (r9v22 int) = (r9v20 int), (r9v21 int), (r9v19 int) binds: [B:95:0x015c, B:92:0x014a, B:86:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x0167 A[PHI: r1 r9
  0x0167: PHI (r1v20 float) = (r1v16 float), (r1v17 float), (r1v15 float) binds: [B:95:0x015c, B:92:0x014a, B:86:0x0136] A[DONT_GENERATE, DONT_INLINE]
  0x0167: PHI (r9v24 int) = (r9v20 int), (r9v21 int), (r9v19 int) binds: [B:95:0x015c, B:92:0x014a, B:86:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    public void t(int i10) {
        f fVarK;
        String hexString;
        f fVarA;
        f fVarI;
        f fVarI2;
        int i11;
        int i12;
        f fVar;
        f fVar2;
        int i13 = this.f2942h;
        if (i13 != i10) {
            fVarK = k(i13);
            this.f2942h = i10;
        } else {
            fVarK = null;
        }
        if (this.f2941g == null) {
            B();
            return;
        }
        if (this.f2958x) {
            B();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        Objects.requireNonNull(this.f2941g);
        int i14 = this.f2959y;
        int i15 = 0;
        int iMax = Math.max(0, this.f2942h - i14);
        int iB = this.f2941g.b();
        int iMin = Math.min(iB - 1, this.f2942h + i14);
        if (iB != this.f2934c) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sbA = defpackage.a.a("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            v1.b.a(sbA, this.f2934c, ", found: ", iB, " Pager id: ");
            sbA.append(hexString);
            sbA.append(" Pager class: ");
            sbA.append(getClass());
            sbA.append(" Problematic adapter: ");
            sbA.append(this.f2941g.getClass());
            throw new IllegalStateException(sbA.toString());
        }
        while (true) {
            if (i15 < this.f2936d.size()) {
                fVarA = this.f2936d.get(i15);
                int i16 = fVarA.f2968b;
                int i17 = this.f2942h;
                if (i16 >= i17) {
                    if (i16 != i17) {
                        break;
                    } else {
                        break;
                    }
                }
                i15++;
            }
            fVarA = null;
            break;
        }
        if (fVarA == null && iB > 0) {
            fVarA = a(this.f2942h, i15);
        }
        if (fVarA != null) {
            int i18 = i15 - 1;
            f fVar3 = i18 >= 0 ? this.f2936d.get(i18) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - fVarA.f2970d);
            float f10 = 0.0f;
            for (int i19 = this.f2942h - 1; i19 >= 0; i19--) {
                if (f10 >= paddingLeft && i19 < iMax) {
                    if (fVar3 == null) {
                        break;
                    }
                    if (i19 == fVar3.f2968b && !fVar3.f2969c) {
                        this.f2936d.remove(i18);
                        this.f2941g.a(this, i19, fVar3.f2967a);
                        i18--;
                        i15--;
                        if (i18 >= 0) {
                            fVar3 = this.f2936d.get(i18);
                        } else {
                            fVar3 = null;
                        }
                    }
                } else if (fVar3 == null || i19 != fVar3.f2968b) {
                    f10 += a(i19, i18 + 1).f2970d;
                    i15++;
                    if (i18 >= 0) {
                        fVar3 = this.f2936d.get(i18);
                    } else {
                        fVar3 = null;
                    }
                } else {
                    f10 += fVar3.f2970d;
                    i18--;
                    if (i18 >= 0) {
                        fVar3 = this.f2936d.get(i18);
                    } else {
                        fVar3 = null;
                    }
                }
            }
            float f11 = fVarA.f2970d;
            int i20 = i15 + 1;
            if (f11 < 2.0f) {
                f fVar4 = i20 < this.f2936d.size() ? this.f2936d.get(i20) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i21 = i20;
                for (int i22 = this.f2942h + 1; i22 < iB; i22++) {
                    if (f11 >= paddingRight && i22 > iMin) {
                        if (fVar4 == null) {
                            break;
                        }
                        if (i22 == fVar4.f2968b && !fVar4.f2969c) {
                            this.f2936d.remove(i21);
                            this.f2941g.a(this, i22, fVar4.f2967a);
                            if (i21 < this.f2936d.size()) {
                                fVar4 = this.f2936d.get(i21);
                            } else {
                                fVar4 = null;
                            }
                        }
                    } else if (fVar4 == null || i22 != fVar4.f2968b) {
                        f fVarA2 = a(i22, i21);
                        i21++;
                        f11 += fVarA2.f2970d;
                        if (i21 < this.f2936d.size()) {
                            fVar4 = this.f2936d.get(i21);
                        } else {
                            fVar4 = null;
                        }
                    } else {
                        f11 += fVar4.f2970d;
                        i21++;
                        if (i21 < this.f2936d.size()) {
                            fVar4 = this.f2936d.get(i21);
                        } else {
                            fVar4 = null;
                        }
                    }
                }
            }
            int iB2 = this.f2941g.b();
            int clientWidth2 = getClientWidth();
            float f12 = clientWidth2 > 0 ? this.f2949o / clientWidth2 : 0.0f;
            if (fVarK != null) {
                int i23 = fVarK.f2968b;
                int i24 = fVarA.f2968b;
                if (i23 < i24) {
                    float f13 = fVarK.f2971e + fVarK.f2970d + f12;
                    int i25 = 0;
                    while (true) {
                        i23++;
                        if (i23 > fVarA.f2968b || i25 >= this.f2936d.size()) {
                            break;
                        }
                        while (true) {
                            fVar2 = this.f2936d.get(i25);
                            if (i23 <= fVar2.f2968b || i25 >= this.f2936d.size() - 1) {
                                break;
                            } else {
                                i25++;
                            }
                        }
                        while (i23 < fVar2.f2968b) {
                            Objects.requireNonNull(this.f2941g);
                            f13 += 1.0f + f12;
                            i23++;
                        }
                        fVar2.f2971e = f13;
                        f13 += fVar2.f2970d + f12;
                    }
                } else if (i23 > i24) {
                    int size = this.f2936d.size() - 1;
                    float f14 = fVarK.f2971e;
                    while (true) {
                        i23--;
                        if (i23 < fVarA.f2968b || size < 0) {
                            break;
                        }
                        while (true) {
                            fVar = this.f2936d.get(size);
                            if (i23 >= fVar.f2968b || size <= 0) {
                                break;
                            } else {
                                size--;
                            }
                        }
                        while (i23 > fVar.f2968b) {
                            Objects.requireNonNull(this.f2941g);
                            f14 -= 1.0f + f12;
                            i23--;
                        }
                        f14 -= fVar.f2970d + f12;
                        fVar.f2971e = f14;
                    }
                }
            }
            int size2 = this.f2936d.size();
            float f15 = fVarA.f2971e;
            int i26 = fVarA.f2968b;
            int i27 = i26 - 1;
            this.f2953s = i26 == 0 ? f15 : -3.4028235E38f;
            int i28 = iB2 - 1;
            this.f2954t = i26 == i28 ? (fVarA.f2970d + f15) - 1.0f : Float.MAX_VALUE;
            int i29 = i15 - 1;
            while (i29 >= 0) {
                f fVar5 = this.f2936d.get(i29);
                while (true) {
                    i12 = fVar5.f2968b;
                    if (i27 <= i12) {
                        break;
                    }
                    i27--;
                    Objects.requireNonNull(this.f2941g);
                    f15 -= 1.0f + f12;
                }
                f15 -= fVar5.f2970d + f12;
                fVar5.f2971e = f15;
                if (i12 == 0) {
                    this.f2953s = f15;
                }
                i29--;
                i27--;
            }
            float f16 = fVarA.f2971e + fVarA.f2970d + f12;
            int i30 = fVarA.f2968b;
            while (true) {
                i30++;
                if (i20 >= size2) {
                    break;
                }
                f fVar6 = this.f2936d.get(i20);
                while (true) {
                    i11 = fVar6.f2968b;
                    if (i30 >= i11) {
                        break;
                    }
                    i30++;
                    Objects.requireNonNull(this.f2941g);
                    f16 += 1.0f + f12;
                }
                if (i11 == i28) {
                    this.f2954t = (fVar6.f2970d + f16) - 1.0f;
                }
                fVar6.f2971e = f16;
                f16 += fVar6.f2970d + f12;
                i20++;
            }
            Objects.requireNonNull(this.f2941g);
        }
        Objects.requireNonNull(this.f2941g);
        int childCount = getChildCount();
        for (int i31 = 0; i31 < childCount; i31++) {
            View childAt = getChildAt(i31);
            g gVar = (g) childAt.getLayoutParams();
            gVar.f2977f = i31;
            if (!gVar.f2972a && gVar.f2974c == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && (fVarI2 = i(childAt)) != null) {
                gVar.f2974c = fVarI2.f2970d;
                gVar.f2976e = fVarI2.f2968b;
            }
        }
        B();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                fVarI = null;
                break;
            }
            while (true) {
                Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    fVarI = i(viewFindFocus);
                    break;
                } else {
                    if (parent == null || !(parent instanceof View)) {
                        fVarI = null;
                        break;
                    }
                    viewFindFocus = (View) parent;
                }
            }
            if (fVarI == null || fVarI.f2968b != this.f2942h) {
                for (int i32 = 0; i32 < getChildCount(); i32++) {
                    View childAt2 = getChildAt(i32);
                    f fVarI3 = i(childAt2);
                    if (fVarI3 != null && fVarI3.f2968b == this.f2942h && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final void u(int i10, int i11, int i12, int i13) {
        int iMin;
        if (i11 <= 0 || this.f2936d.isEmpty()) {
            f fVarK = k(this.f2942h);
            iMin = (int) ((fVarK != null ? Math.min(fVarK.f2971e, this.f2954t) : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) * ((i10 - getPaddingLeft()) - getPaddingRight()));
            if (iMin == getScrollX()) {
                return;
            } else {
                e(false);
            }
        } else if (!this.f2946l.isFinished()) {
            this.f2946l.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            iMin = (int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12));
        }
        scrollTo(iMin, getScrollY());
    }

    public final void v(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2950p;
    }

    public final boolean w() {
        this.I = -1;
        this.f2960z = false;
        this.A = false;
        VelocityTracker velocityTracker = this.J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J = null;
        }
        this.O.onRelease();
        this.P.onRelease();
        return this.O.isFinished() || this.P.isFinished();
    }

    public final void x(int i10, boolean z10, int i11, boolean z11) {
        int iMax;
        int scrollX;
        int iAbs;
        f fVarK = k(i10);
        if (fVarK != null) {
            iMax = (int) (Math.max(this.f2953s, Math.min(fVarK.f2971e, this.f2954t)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (!z10) {
            if (z11) {
                g(i10);
            }
            e(false);
            scrollTo(iMax, 0);
            q(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.f2946l;
            if ((scroller == null || scroller.isFinished()) ? false : true) {
                scrollX = this.f2947m ? this.f2946l.getCurrX() : this.f2946l.getStartX();
                this.f2946l.abortAnimation();
                setScrollingCacheEnabled(false);
            } else {
                scrollX = getScrollX();
            }
            int i12 = scrollX;
            int scrollY = getScrollY();
            int i13 = iMax - i12;
            int i14 = 0 - scrollY;
            if (i13 == 0 && i14 == 0) {
                e(false);
                s();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i15 = clientWidth / 2;
                float f10 = clientWidth;
                float f11 = i15;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i13) * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
                int iAbs2 = Math.abs(i11);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    Objects.requireNonNull(this.f2941g);
                    iAbs = (int) (((Math.abs(i13) / ((f10 * 1.0f) + this.f2949o)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.f2947m = false;
                this.f2946l.startScroll(i12, scrollY, i13, i14, iMin);
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                e0.d.k(this);
            }
        }
        if (z11) {
            g(i10);
        }
    }

    public void y(int i10, boolean z10) {
        this.f2958x = false;
        z(i10, z10, false, 0);
    }

    public void z(int i10, boolean z10, boolean z11, int i11) {
        v1.a aVar = this.f2941g;
        if (aVar == null || aVar.b() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z11 && this.f2942h == i10 && this.f2936d.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.f2941g.b()) {
            i10 = this.f2941g.b() - 1;
        }
        int i12 = this.f2959y;
        int i13 = this.f2942h;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < this.f2936d.size(); i14++) {
                this.f2936d.get(i14).f2969c = true;
            }
        }
        boolean z12 = this.f2942h != i10;
        if (!this.Q) {
            t(i10);
            x(i10, z10, i11, z12);
        } else {
            this.f2942h = i10;
            if (z12) {
                g(i10);
            }
            requestLayout();
        }
    }
}
