package androidx.drawerlayout.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;
import p0.s0;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] F = {R.attr.colorPrimaryDark};
    public static final int[] G = {R.attr.layout_gravity};
    public static final boolean H;
    public static final boolean I;
    public static boolean J;
    public boolean A;
    public final ArrayList<View> B;
    public Rect C;
    public Matrix D;
    public final q0.g E;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f1725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f1729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Paint f1730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u0.c f1731i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u0.c f1732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f1733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f1734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1736n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1737o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1738p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1739q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1740r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1741s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1742t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public e f1743u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<e> f1744v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f1745w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f1746x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Drawable f1747y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f1748z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1749c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1750d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1751e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1752f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1753g;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f1749c = 0;
            this.f1749c = parcel.readInt();
            this.f1750d = parcel.readInt();
            this.f1751e = parcel.readInt();
            this.f1752f = parcel.readInt();
            this.f1753g = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f1749c = 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1749c);
            parcel.writeInt(this.f1750d);
            parcel.writeInt(this.f1751e);
            parcel.writeInt(this.f1752f);
            parcel.writeInt(this.f1753g);
        }
    }

    public class a implements q0.g {
        public a() {
        }

        @Override // q0.g
        public boolean perform(View view, q0.g.a aVar) {
            if (!DrawerLayout.this.k(view) || DrawerLayout.this.g(view) == 2) {
                return false;
            }
            DrawerLayout.this.b(view);
            return true;
        }
    }

    public class b implements View.OnApplyWindowInsetsListener {
        public b(DrawerLayout drawerLayout) {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            DrawerLayout drawerLayout = (DrawerLayout) view;
            boolean z10 = windowInsets.getSystemWindowInsetTop() > 0;
            drawerLayout.f1748z = windowInsets;
            drawerLayout.A = z10;
            drawerLayout.setWillNotDraw(!z10 && drawerLayout.getBackground() == null);
            drawerLayout.requestLayout();
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public class c extends p0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f1755a = new Rect();

        public c() {
        }

        @Override // p0.a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            View viewF = DrawerLayout.this.f();
            if (viewF == null) {
                return true;
            }
            int iH = DrawerLayout.this.h(viewF);
            DrawerLayout drawerLayout = DrawerLayout.this;
            Objects.requireNonNull(drawerLayout);
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            Gravity.getAbsoluteGravity(iH, e0.e.d(drawerLayout));
            return true;
        }

        @Override // p0.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // p0.a
        public void onInitializeAccessibilityNodeInfo(View view, q0.c cVar) {
            if (DrawerLayout.H) {
                super.onInitializeAccessibilityNodeInfo(view, cVar);
            } else {
                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(cVar.f34746a);
                q0.c cVar2 = new q0.c(accessibilityNodeInfoObtain);
                super.onInitializeAccessibilityNodeInfo(view, cVar2);
                cVar.f34748c = -1;
                cVar.f34746a.setSource(view);
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                Object objF = e0.d.f(view);
                if (objF instanceof View) {
                    cVar.p((View) objF);
                }
                Rect rect = this.f1755a;
                accessibilityNodeInfoObtain.getBoundsInScreen(rect);
                cVar.f34746a.setBoundsInScreen(rect);
                cVar.f34746a.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
                cVar.f34746a.setPackageName(accessibilityNodeInfoObtain.getPackageName());
                cVar.f34746a.setClassName(cVar2.e());
                cVar.f34746a.setContentDescription(cVar2.g());
                cVar.f34746a.setEnabled(cVar2.j());
                cVar.f34746a.setFocused(accessibilityNodeInfoObtain.isFocused());
                cVar.f34746a.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
                cVar.f34746a.setSelected(accessibilityNodeInfoObtain.isSelected());
                cVar.f34746a.addAction(cVar2.d());
                accessibilityNodeInfoObtain.recycle();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (DrawerLayout.i(childAt)) {
                        cVar.f34746a.addChild(childAt);
                    }
                }
            }
            cVar.f34746a.setClassName("androidx.drawerlayout.widget.DrawerLayout");
            cVar.f34746a.setFocusable(false);
            cVar.f34746a.setFocused(false);
            cVar.k(q0.c.a.f34749e);
            cVar.k(q0.c.a.f34750f);
        }

        @Override // p0.a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.H || DrawerLayout.i(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    public static final class d extends p0.a {
        @Override // p0.a
        public void onInitializeAccessibilityNodeInfo(View view, q0.c cVar) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            if (DrawerLayout.i(view)) {
                return;
            }
            cVar.p(null);
        }
    }

    public interface e {
        void a(View view);

        void b(View view);

        void c(int i10);

        void d(View view, float f10);
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f1758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1759c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1760d;

        public f(int i10, int i11) {
            super(i10, i11);
            this.f1757a = 0;
        }

        public f(int i10, int i11, int i12) {
            this(i10, i11);
            this.f1757a = i12;
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1757a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.G);
            this.f1757a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1757a = 0;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1757a = 0;
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f1757a = 0;
            this.f1757a = fVar.f1757a;
        }
    }

    public class g extends u0.c.AbstractC0423c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public u0.c f1762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f1763c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                View viewD;
                int width;
                g gVar = g.this;
                int i10 = gVar.f1762b.f35936o;
                boolean z10 = gVar.f1761a == 3;
                if (z10) {
                    viewD = DrawerLayout.this.d(3);
                    width = (viewD != null ? -viewD.getWidth() : 0) + i10;
                } else {
                    viewD = DrawerLayout.this.d(5);
                    width = DrawerLayout.this.getWidth() - i10;
                }
                if (viewD != null) {
                    if (((!z10 || viewD.getLeft() >= width) && (z10 || viewD.getLeft() <= width)) || DrawerLayout.this.g(viewD) != 0) {
                        return;
                    }
                    f fVar = (f) viewD.getLayoutParams();
                    gVar.f1762b.x(viewD, width, viewD.getTop());
                    fVar.f1759c = true;
                    DrawerLayout.this.invalidate();
                    gVar.a();
                    DrawerLayout drawerLayout = DrawerLayout.this;
                    if (drawerLayout.f1742t) {
                        return;
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        drawerLayout.getChildAt(i11).dispatchTouchEvent(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    drawerLayout.f1742t = true;
                }
            }
        }

        public g(int i10) {
            this.f1761a = i10;
        }

        public final void a() {
            View viewD = DrawerLayout.this.d(this.f1761a == 3 ? 5 : 3);
            if (viewD != null) {
                DrawerLayout.this.b(viewD);
            }
        }

        public void b() {
            DrawerLayout.this.removeCallbacks(this.f1763c);
        }

        @Override // u0.c.AbstractC0423c
        public int clampViewPositionHorizontal(View view, int i10, int i11) {
            int width;
            int width2;
            if (DrawerLayout.this.a(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i10, width));
        }

        @Override // u0.c.AbstractC0423c
        public int clampViewPositionVertical(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // u0.c.AbstractC0423c
        public int getViewHorizontalDragRange(View view) {
            if (DrawerLayout.this.l(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // u0.c.AbstractC0423c
        public void onEdgeDragStarted(int i10, int i11) {
            DrawerLayout drawerLayout;
            int i12;
            if ((i10 & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i12 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i12 = 5;
            }
            View viewD = drawerLayout.d(i12);
            if (viewD == null || DrawerLayout.this.g(viewD) != 0) {
                return;
            }
            this.f1762b.b(viewD, i11);
        }

        @Override // u0.c.AbstractC0423c
        public boolean onEdgeLock(int i10) {
            return false;
        }

        @Override // u0.c.AbstractC0423c
        public void onEdgeTouched(int i10, int i11) {
            DrawerLayout.this.postDelayed(this.f1763c, 160L);
        }

        @Override // u0.c.AbstractC0423c
        public void onViewCaptured(View view, int i10) {
            ((f) view.getLayoutParams()).f1759c = false;
            a();
        }

        @Override // u0.c.AbstractC0423c
        public void onViewDragStateChanged(int i10) {
            DrawerLayout.this.r(i10, this.f1762b.f35941t);
        }

        @Override // u0.c.AbstractC0423c
        public void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.a(view, 3) ? i10 + width : DrawerLayout.this.getWidth() - i10) / width;
            DrawerLayout.this.o(view, width2);
            view.setVisibility(width2 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // u0.c.AbstractC0423c
        public void onViewReleased(View view, float f10, float f11) {
            int i10;
            Objects.requireNonNull(DrawerLayout.this);
            float f12 = ((f) view.getLayoutParams()).f1758b;
            int width = view.getWidth();
            if (DrawerLayout.this.a(view, 3)) {
                i10 = (f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || (f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f12 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f10 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || (f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f12 > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f1762b.v(i10, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // u0.c.AbstractC0423c
        public boolean tryCaptureView(View view, int i10) {
            return DrawerLayout.this.l(view) && DrawerLayout.this.a(view, this.f1761a) && DrawerLayout.this.g(view) == 0;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        H = true;
        I = true;
        J = i10 >= 29;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.inscode.autoclicker.R.attr.drawerLayoutStyle);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1725c = new d();
        this.f1728f = -1728053248;
        this.f1730h = new Paint();
        this.f1737o = true;
        this.f1738p = 3;
        this.f1739q = 3;
        this.f1740r = 3;
        this.f1741s = 3;
        this.E = new a();
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f1727e = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        g gVar = new g(3);
        this.f1733k = gVar;
        g gVar2 = new g(5);
        this.f1734l = gVar2;
        u0.c cVarJ = u0.c.j(this, 1.0f, gVar);
        this.f1731i = cVarJ;
        cVarJ.f35938q = 1;
        cVarJ.f35935n = f11;
        gVar.f1762b = cVarJ;
        u0.c cVarJ2 = u0.c.j(this, 1.0f, gVar2);
        this.f1732j = cVarJ2;
        cVarJ2.f35938q = 2;
        cVarJ2.f35935n = f11;
        gVar2.f1762b = cVarJ2;
        setFocusableInTouchMode(true);
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.d.s(this, 1);
        e0.q(this, new c());
        setMotionEventSplittingEnabled(false);
        if (e0.d.b(this)) {
            setOnApplyWindowInsetsListener(new b(this));
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(F);
            try {
                this.f1747y = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, v0.a.f36655a, i10, 0);
        try {
            this.f1726d = typedArrayObtainStyledAttributes2.hasValue(0) ? typedArrayObtainStyledAttributes2.getDimension(0, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) : getResources().getDimension(com.inscode.autoclicker.R.dimen.def_drawer_elevation);
            typedArrayObtainStyledAttributes2.recycle();
            this.B = new ArrayList<>();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public static boolean i(View view) {
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        return (e0.d.c(view) == 4 || e0.d.c(view) == 2) ? false : true;
    }

    public boolean a(View view, int i10) {
        return (h(view) & i10) == i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (!l(childAt)) {
                this.B.add(childAt);
            } else if (k(childAt)) {
                childAt.addFocusables(arrayList, i10, i11);
                z10 = true;
            }
        }
        if (!z10) {
            int size = this.B.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = this.B.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        this.B.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        int i11 = (e() != null || l(view)) ? 4 : 1;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.d.s(view, i11);
        if (H) {
            return;
        }
        e0.q(view, this.f1725c);
    }

    public void b(View view) {
        u0.c cVar;
        int width;
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.f1737o) {
            fVar.f1758b = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            fVar.f1760d = 0;
        } else {
            fVar.f1760d |= 4;
            if (a(view, 3)) {
                cVar = this.f1731i;
                width = -view.getWidth();
            } else {
                cVar = this.f1732j;
                width = getWidth();
            }
            cVar.x(view, width, view.getTop());
        }
        invalidate();
    }

    public void c(boolean z10) {
        int childCount = getChildCount();
        boolean zX = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVar = (f) childAt.getLayoutParams();
            if (l(childAt) && (!z10 || fVar.f1759c)) {
                zX |= a(childAt, 3) ? this.f1731i.x(childAt, -childAt.getWidth(), childAt.getTop()) : this.f1732j.x(childAt, getWidth(), childAt.getTop());
                fVar.f1759c = false;
            }
        }
        this.f1733k.b();
        this.f1734l.b();
        if (zX) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        for (int i10 = 0; i10 < childCount; i10++) {
            fMax = Math.max(fMax, ((f) getChildAt(i10).getLayoutParams()).f1758b);
        }
        this.f1729g = fMax;
        boolean zI = this.f1731i.i(true);
        boolean zI2 = this.f1732j.i(true);
        if (zI || zI2) {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.d.k(this);
        }
    }

    public View d(int i10) {
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, e0.e.d(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((h(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f1729g <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (this.C == null) {
                this.C = new Rect();
            }
            childAt.getHitRect(this.C);
            if (this.C.contains((int) x10, (int) y10) && !j(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.D == null) {
                            this.D = new Matrix();
                        }
                        matrix.invert(this.D);
                        motionEventObtain.transform(this.D);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        int height = getHeight();
        boolean zJ = j(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i10 = 0;
        if (zJ) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if ((background != null && background.getOpacity() == -1) && l(childAt) && childAt.getHeight() >= height) {
                        if (a(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i11) {
                                i11 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(iSave);
        float f10 = this.f1729g;
        if (f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && zJ) {
            int i13 = this.f1728f;
            this.f1730h.setColor((((int) ((((-16777216) & i13) >>> 24) * f10)) << 24) | (i13 & 16777215));
            canvas.drawRect(i10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, width, getHeight(), this.f1730h);
        }
        return zDrawChild;
    }

    public View e() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((f) childAt.getLayoutParams()).f1760d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public View f() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (l(childAt)) {
                if (!l(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((f) childAt.getLayoutParams()).f1758b > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public int g(View view) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i10 = ((f) view.getLayoutParams()).f1757a;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        int iD = e0.e.d(this);
        if (i10 == 3) {
            int i11 = this.f1738p;
            if (i11 != 3) {
                return i11;
            }
            int i12 = iD == 0 ? this.f1740r : this.f1741s;
            if (i12 != 3) {
                return i12;
            }
        } else if (i10 == 5) {
            int i13 = this.f1739q;
            if (i13 != 3) {
                return i13;
            }
            int i14 = iD == 0 ? this.f1741s : this.f1740r;
            if (i14 != 3) {
                return i14;
            }
        } else if (i10 == 8388611) {
            int i15 = this.f1740r;
            if (i15 != 3) {
                return i15;
            }
            int i16 = iD == 0 ? this.f1738p : this.f1739q;
            if (i16 != 3) {
                return i16;
            }
        } else if (i10 == 8388613) {
            int i17 = this.f1741s;
            if (i17 != 3) {
                return i17;
            }
            int i18 = iD == 0 ? this.f1739q : this.f1738p;
            if (i18 != 3) {
                return i18;
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public float getDrawerElevation() {
        return I ? this.f1726d : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1747y;
    }

    public int h(View view) {
        int i10 = ((f) view.getLayoutParams()).f1757a;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        return Gravity.getAbsoluteGravity(i10, e0.e.d(this));
    }

    public boolean j(View view) {
        return ((f) view.getLayoutParams()).f1757a == 0;
    }

    public boolean k(View view) {
        if (l(view)) {
            return (((f) view.getLayoutParams()).f1760d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean l(View view) {
        int i10 = ((f) view.getLayoutParams()).f1757a;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, e0.e.d(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public void m(View view) {
        u0.c cVar;
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.f1737o) {
            fVar.f1758b = 1.0f;
            fVar.f1760d = 1;
            q(view, true);
            p(view);
        } else {
            int width = 0;
            fVar.f1760d |= 2;
            if (a(view, 3)) {
                cVar = this.f1731i;
            } else {
                cVar = this.f1732j;
                width = getWidth() - view.getWidth();
            }
            cVar.x(view, width, view.getTop());
        }
        invalidate();
    }

    public void n(int i10, int i11) {
        View viewD;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, e0.e.d(this));
        if (i11 == 3) {
            this.f1738p = i10;
        } else if (i11 == 5) {
            this.f1739q = i10;
        } else if (i11 == 8388611) {
            this.f1740r = i10;
        } else if (i11 == 8388613) {
            this.f1741s = i10;
        }
        if (i10 != 0) {
            (absoluteGravity == 3 ? this.f1731i : this.f1732j).a();
        }
        if (i10 != 1) {
            if (i10 == 2 && (viewD = d(absoluteGravity)) != null) {
                m(viewD);
                return;
            }
            return;
        }
        View viewD2 = d(absoluteGravity);
        if (viewD2 != null) {
            b(viewD2);
        }
    }

    public void o(View view, float f10) {
        f fVar = (f) view.getLayoutParams();
        if (f10 == fVar.f1758b) {
            return;
        }
        fVar.f1758b = f10;
        List<e> list = this.f1744v;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                this.f1744v.get(size).d(view, f10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1737o = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1737o = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.A || this.f1747y == null) {
            return;
        }
        Object obj = this.f1748z;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f1747y.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f1747y.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View viewL;
        boolean z11;
        boolean z12;
        boolean z13;
        int actionMasked = motionEvent.getActionMasked();
        boolean zW = this.f1731i.w(motionEvent) | this.f1732j.w(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                c(true);
                this.f1742t = false;
            } else if (actionMasked == 2) {
                u0.c cVar = this.f1731i;
                int length = cVar.f35925d.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        z12 = false;
                        break;
                    }
                    if (cVar.n(i10)) {
                        float f10 = cVar.f35927f[i10] - cVar.f35925d[i10];
                        float f11 = cVar.f35928g[i10] - cVar.f35926e[i10];
                        float f12 = (f11 * f11) + (f10 * f10);
                        int i11 = cVar.f35923b;
                        if (f12 > i11 * i11) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        z12 = true;
                        break;
                    }
                    i10++;
                }
                if (z12) {
                    this.f1733k.b();
                    this.f1734l.b();
                }
            } else if (actionMasked == 3) {
                c(true);
                this.f1742t = false;
            }
            z10 = false;
        } else {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f1745w = x10;
            this.f1746x = y10;
            z10 = this.f1729g > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && (viewL = this.f1731i.l((int) x10, (int) y10)) != null && j(viewL);
            this.f1742t = false;
        }
        if (!zW && !z10) {
            int childCount = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    z11 = false;
                    break;
                }
                if (((f) getChildAt(i12).getLayoutParams()).f1759c) {
                    z11 = true;
                    break;
                }
                i12++;
            }
            if (!z11 && !this.f1742t) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            if (f() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View viewF = f();
        if (viewF != null && g(viewF) == 0) {
            c(false);
        }
        return viewF != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        int measuredHeight;
        int i15;
        int i16;
        boolean z11 = true;
        this.f1736n = true;
        int i17 = i12 - i10;
        int childCount = getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (j(childAt)) {
                    int i19 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i19, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f11 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (fVar.f1758b * f11));
                        f10 = (measuredWidth + i14) / f11;
                    } else {
                        float f12 = measuredWidth;
                        int i20 = i17 - ((int) (fVar.f1758b * f12));
                        f10 = (i17 - i20) / f12;
                        i14 = i20;
                    }
                    boolean z12 = f10 != fVar.f1758b ? z11 : false;
                    int i21 = fVar.f1757a & 112;
                    if (i21 != 16) {
                        if (i21 != 80) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                            i15 = measuredWidth + i14;
                            i16 = measuredHeight2 + measuredHeight;
                        } else {
                            int i22 = i13 - i11;
                            measuredHeight = (i22 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight();
                            i15 = measuredWidth + i14;
                            i16 = i22 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                        }
                        childAt.layout(i14, measuredHeight, i15, i16);
                    } else {
                        int i23 = i13 - i11;
                        int i24 = (i23 - measuredHeight2) / 2;
                        int i25 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i24 < i25) {
                            i24 = i25;
                        } else {
                            int i26 = i24 + measuredHeight2;
                            int i27 = i23 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i26 > i27) {
                                i24 = i27 - measuredHeight2;
                            }
                        }
                        childAt.layout(i14, i24, measuredWidth + i14, measuredHeight2 + i24);
                    }
                    if (z12) {
                        o(childAt, f10);
                    }
                    int i28 = fVar.f1758b > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? 0 : 4;
                    if (childAt.getVisibility() != i28) {
                        childAt.setVisibility(i28);
                    }
                }
            }
            i18++;
            z11 = true;
        }
        if (J && (rootWindowInsets = getRootWindowInsets()) != null) {
            h0.g gVarK = s0.k(rootWindowInsets, null).f34404a.k();
            u0.c cVar = this.f1731i;
            cVar.f35936o = Math.max(cVar.f35937p, gVarK.f30459a);
            u0.c cVar2 = this.f1732j;
            cVar2.f35936o = Math.max(cVar2.f35937p, gVarK.f30461c);
        }
        this.f1736n = false;
        this.f1737o = false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i10, int i11) {
        boolean z10;
        String hexString;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i12 = 0;
        if (this.f1748z != null) {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            if (e0.d.b(this)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
        int iD = e0.e.d(this);
        int childCount = getChildCount();
        int i13 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z10) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar.f1757a, iD);
                    boolean zB = e0.d.b(childAt);
                    WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f1748z;
                    if (zB) {
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), i13, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(i13, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), i13, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(i13, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom();
                    }
                }
                if (j(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, 1073741824));
                } else {
                    if (!l(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (I) {
                        float fI = e0.i.i(childAt);
                        float f10 = this.f1726d;
                        if (fI != f10) {
                            e0.i.s(childAt, f10);
                        }
                    }
                    int iH = h(childAt) & 7;
                    if (iH == 3) {
                        i13 = 1;
                    }
                    if ((i13 != 0 && z11) || (i13 == 0 && z12)) {
                        StringBuilder sbA = defpackage.a.a("Child drawer has absolute gravity ");
                        if ((iH & 3) != 3) {
                            hexString = (iH & 5) == 5 ? "RIGHT" : Integer.toHexString(iH);
                        } else {
                            hexString = "LEFT";
                        }
                        throw new IllegalStateException(w0.a.a(sbA, hexString, " but this ", "DrawerLayout", " already has a drawer view along that edge"));
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z12 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f1727e + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                }
            }
            i12++;
            i13 = 0;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View viewD;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i10 = savedState.f1749c;
        if (i10 != 0 && (viewD = d(i10)) != null) {
            m(viewD);
        }
        int i11 = savedState.f1750d;
        if (i11 != 3) {
            n(i11, 3);
        }
        int i12 = savedState.f1751e;
        if (i12 != 3) {
            n(i12, 5);
        }
        int i13 = savedState.f1752f;
        if (i13 != 3) {
            n(i13, 8388611);
        }
        int i14 = savedState.f1753g;
        if (i14 != 3) {
            n(i14, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        if (I) {
            return;
        }
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.e.d(this);
        e0.e.d(this);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            f fVar = (f) getChildAt(i10).getLayoutParams();
            int i11 = fVar.f1760d;
            boolean z10 = i11 == 1;
            boolean z11 = i11 == 2;
            if (z10 || z11) {
                savedState.f1749c = fVar.f1757a;
                break;
            }
        }
        savedState.f1750d = this.f1738p;
        savedState.f1751e = this.f1739q;
        savedState.f1752f = this.f1740r;
        savedState.f1753g = this.f1741s;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View viewE;
        this.f1731i.p(motionEvent);
        this.f1732j.p(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                View viewL = this.f1731i.l((int) x10, (int) y10);
                if (viewL != null && j(viewL)) {
                    float f10 = x10 - this.f1745w;
                    float f11 = y10 - this.f1746x;
                    int i10 = this.f1731i.f35923b;
                    z10 = (f11 * f11) + (f10 * f10) >= ((float) (i10 * i10)) || (viewE = e()) == null || g(viewE) == 2;
                }
                c(z10);
            } else if (action == 3) {
                c(true);
            }
            return true;
        }
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        this.f1745w = x11;
        this.f1746x = y11;
        this.f1742t = false;
        return true;
    }

    public final void p(View view) {
        q0.c.a aVar = q0.c.a.f34756l;
        e0.n(aVar.a(), view);
        e0.j(view, 0);
        if (!k(view) || g(view) == 2) {
            return;
        }
        e0.o(view, aVar, null, this.E);
    }

    public final void q(View view, boolean z10) {
        int i10;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((z10 || l(childAt)) && !(z10 && childAt == view)) {
                i10 = 4;
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            } else {
                WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
                i10 = 1;
            }
            e0.d.s(childAt, i10);
        }
    }

    public void r(int i10, View view) {
        View rootView;
        int i11 = this.f1731i.f35922a;
        int i12 = this.f1732j.f35922a;
        int i13 = 2;
        if (i11 == 1 || i12 == 1) {
            i13 = 1;
        } else if (i11 != 2 && i12 != 2) {
            i13 = 0;
        }
        if (view != null && i10 == 0) {
            float f10 = ((f) view.getLayoutParams()).f1758b;
            if (f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                f fVar = (f) view.getLayoutParams();
                if ((fVar.f1760d & 1) == 1) {
                    fVar.f1760d = 0;
                    List<e> list = this.f1744v;
                    if (list != null) {
                        for (int size = list.size() - 1; size >= 0; size--) {
                            this.f1744v.get(size).b(view);
                        }
                    }
                    q(view, false);
                    p(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f10 == 1.0f) {
                f fVar2 = (f) view.getLayoutParams();
                if ((fVar2.f1760d & 1) == 0) {
                    fVar2.f1760d = 1;
                    List<e> list2 = this.f1744v;
                    if (list2 != null) {
                        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                            this.f1744v.get(size2).a(view);
                        }
                    }
                    q(view, true);
                    p(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i13 != this.f1735m) {
            this.f1735m = i13;
            List<e> list3 = this.f1744v;
            if (list3 != null) {
                for (int size3 = list3.size() - 1; size3 >= 0; size3--) {
                    this.f1744v.get(size3).c(i13);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f1736n) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f10) {
        this.f1726d = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (l(childAt)) {
                float f11 = this.f1726d;
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                e0.i.s(childAt, f11);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        List<e> list;
        e eVar2 = this.f1743u;
        if (eVar2 != null && eVar2 != null && (list = this.f1744v) != null) {
            list.remove(eVar2);
        }
        if (eVar != null) {
            if (this.f1744v == null) {
                this.f1744v = new ArrayList();
            }
            this.f1744v.add(eVar);
        }
        this.f1743u = eVar;
    }

    public void setDrawerLockMode(int i10) {
        n(i10, 3);
        n(i10, 5);
    }

    public void setScrimColor(int i10) {
        this.f1728f = i10;
        invalidate();
    }

    public void setStatusBarBackground(int i10) {
        Drawable drawableB;
        if (i10 != 0) {
            Context context = getContext();
            Object obj = e0.a.f28964a;
            drawableB = e0.a.c.b(context, i10);
        } else {
            drawableB = null;
        }
        this.f1747y = drawableB;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f1747y = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.f1747y = new ColorDrawable(i10);
        invalidate();
    }
}
