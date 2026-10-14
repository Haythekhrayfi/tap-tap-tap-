package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f3009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f3010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.viewpager2.widget.c f3011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RecyclerView.i f3014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayoutManager f3015i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3016j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Parcelable f3017k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RecyclerView f3018l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public z f3019m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public androidx.viewpager2.widget.f f3020n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public androidx.viewpager2.widget.c f3021o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public androidx.viewpager2.widget.d f3022p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public androidx.viewpager2.widget.e f3023q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView.l f3024r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3025s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3026t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3027u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public d f3028v;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3030d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Parcelable f3031e;

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
            this.f3029c = parcel.readInt();
            this.f3030d = parcel.readInt();
            this.f3031e = parcel.readParcelable(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f3029c);
            parcel.writeInt(this.f3030d);
            parcel.writeParcelable(this.f3031e, i10);
        }
    }

    public class a extends e {
        public a() {
            super(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f3013g = true;
            viewPager2.f3020n.f3066l = true;
        }
    }

    public class b extends g {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void onPageScrollStateChanged(int i10) {
            if (i10 == 0) {
                ViewPager2.this.h();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void onPageSelected(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f3012f != i10) {
                viewPager2.f3012f = i10;
                ((h) viewPager2.f3028v).c();
            }
        }
    }

    public class c extends g {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void onPageSelected(int i10) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f3018l.requestFocus(2);
            }
        }
    }

    public abstract class d {
        public d(ViewPager2 viewPager2, a aVar) {
        }

        public abstract void a(androidx.viewpager2.widget.c cVar, RecyclerView recyclerView);
    }

    public static abstract class e extends RecyclerView.i {
        public e() {
        }

        public e(a aVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i10, int i11, Object obj) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeInserted(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeRemoved(int i10, int i11) {
            onChanged();
        }
    }

    public class f extends LinearLayoutManager {
        public f(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(RecyclerView.z zVar, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(zVar, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onInitializeAccessibilityNodeInfo(RecyclerView.v vVar, RecyclerView.z zVar, q0.c cVar) {
            super.onInitializeAccessibilityNodeInfo(vVar, zVar, cVar);
            Objects.requireNonNull(ViewPager2.this.f3028v);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public boolean performAccessibilityAction(RecyclerView.v vVar, RecyclerView.z zVar, int i10, Bundle bundle) {
            Objects.requireNonNull(ViewPager2.this.f3028v);
            return super.performAccessibilityAction(vVar, zVar, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    public static abstract class g {
        public void onPageScrollStateChanged(int i10) {
        }

        public void onPageScrolled(int i10, float f10, int i11) {
        }

        public void onPageSelected(int i10) {
        }
    }

    public class h extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q0.g f3036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q0.g f3037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public RecyclerView.i f3038c;

        public class a implements q0.g {
            public a() {
            }

            @Override // q0.g
            public boolean perform(View view, q0.g.a aVar) {
                h.this.b(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        public class b implements q0.g {
            public b() {
            }

            @Override // q0.g
            public boolean perform(View view, q0.g.a aVar) {
                h.this.b(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        public class c extends e {
            public c() {
                super(null);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onChanged() {
                h.this.c();
            }
        }

        public h() {
            super(ViewPager2.this, null);
            this.f3036a = new a();
            this.f3037b = new b();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.d
        public void a(androidx.viewpager2.widget.c cVar, RecyclerView recyclerView) {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.d.s(recyclerView, 2);
            this.f3038c = new c();
            if (e0.d.c(ViewPager2.this) == 0) {
                e0.d.s(ViewPager2.this, 1);
            }
        }

        public void b(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f3026t) {
                viewPager2.f(i10, true);
            }
        }

        public void c() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i10 = R.id.accessibilityActionPageLeft;
            e0.m(viewPager2, R.id.accessibilityActionPageLeft);
            e0.n(R.id.accessibilityActionPageRight, viewPager2);
            e0.j(viewPager2, 0);
            e0.n(R.id.accessibilityActionPageUp, viewPager2);
            e0.j(viewPager2, 0);
            e0.n(R.id.accessibilityActionPageDown, viewPager2);
            e0.j(viewPager2, 0);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0) {
                return;
            }
            ViewPager2 viewPager3 = ViewPager2.this;
            if (viewPager3.f3026t) {
                if (viewPager3.getOrientation() != 0) {
                    if (ViewPager2.this.f3012f < itemCount - 1) {
                        e0.o(viewPager2, new q0.c.a(R.id.accessibilityActionPageDown, null), null, this.f3036a);
                    }
                    if (ViewPager2.this.f3012f > 0) {
                        e0.o(viewPager2, new q0.c.a(R.id.accessibilityActionPageUp, null), null, this.f3037b);
                        return;
                    }
                    return;
                }
                boolean zB = ViewPager2.this.b();
                int i11 = zB ? 16908360 : 16908361;
                if (zB) {
                    i10 = 16908361;
                }
                if (ViewPager2.this.f3012f < itemCount - 1) {
                    e0.o(viewPager2, new q0.c.a(i11, null), null, this.f3036a);
                }
                if (ViewPager2.this.f3012f > 0) {
                    e0.o(viewPager2, new q0.c.a(i10, null), null, this.f3037b);
                }
            }
        }
    }

    public interface i {
    }

    public class j extends z {
        public j() {
        }

        @Override // androidx.recyclerview.widget.z, androidx.recyclerview.widget.d0
        public View e(RecyclerView.o oVar) {
            if (((androidx.viewpager2.widget.f) ViewPager2.this.f3022p.f3051b).f3067m) {
                return null;
            }
            return super.e(oVar);
        }
    }

    public class k extends RecyclerView {
        public k(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            Objects.requireNonNull(ViewPager2.this.f3028v);
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f3012f);
            accessibilityEvent.setToIndex(ViewPager2.this.f3012f);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f3026t && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f3026t && super.onTouchEvent(motionEvent);
        }
    }

    public static class l implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f3045c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final RecyclerView f3046d;

        public l(int i10, RecyclerView recyclerView) {
            this.f3045c = i10;
            this.f3046d = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3046d.smoothScrollToPosition(this.f3045c);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.f3009c = new Rect();
        this.f3010d = new Rect();
        this.f3011e = new androidx.viewpager2.widget.c(3);
        this.f3013g = false;
        this.f3014h = new a();
        this.f3016j = -1;
        this.f3024r = null;
        this.f3025s = false;
        this.f3026t = true;
        this.f3027u = -1;
        a(context, null);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3009c = new Rect();
        this.f3010d = new Rect();
        this.f3011e = new androidx.viewpager2.widget.c(3);
        this.f3013g = false;
        this.f3014h = new a();
        this.f3016j = -1;
        this.f3024r = null;
        this.f3025s = false;
        this.f3026t = true;
        this.f3027u = -1;
        a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3009c = new Rect();
        this.f3010d = new Rect();
        this.f3011e = new androidx.viewpager2.widget.c(3);
        this.f3013g = false;
        this.f3014h = new a();
        this.f3016j = -1;
        this.f3024r = null;
        this.f3025s = false;
        this.f3026t = true;
        this.f3027u = -1;
        a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f3009c = new Rect();
        this.f3010d = new Rect();
        this.f3011e = new androidx.viewpager2.widget.c(3);
        this.f3013g = false;
        this.f3014h = new a();
        this.f3016j = -1;
        this.f3024r = null;
        this.f3025s = false;
        this.f3026t = true;
        this.f3027u = -1;
        a(context, attributeSet);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        this.f3028v = new h();
        k kVar = new k(context);
        this.f3018l = kVar;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        kVar.setId(e0.e.a());
        this.f3018l.setDescendantFocusability(131072);
        f fVar = new f(context);
        this.f3015i = fVar;
        this.f3018l.setLayoutManager(fVar);
        this.f3018l.setScrollingTouchSlop(1);
        int[] iArr = w1.a.f37081a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f3018l.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f3018l.addOnChildAttachStateChangeListener(new androidx.viewpager2.widget.g(this));
            androidx.viewpager2.widget.f fVar2 = new androidx.viewpager2.widget.f(this);
            this.f3020n = fVar2;
            this.f3022p = new androidx.viewpager2.widget.d(this, fVar2, this.f3018l);
            j jVar = new j();
            this.f3019m = jVar;
            jVar.b(this.f3018l);
            this.f3018l.addOnScrollListener(this.f3020n);
            androidx.viewpager2.widget.c cVar = new androidx.viewpager2.widget.c(3);
            this.f3021o = cVar;
            this.f3020n.f3055a = cVar;
            b bVar = new b();
            c cVar2 = new c();
            this.f3021o.f3049a.add(bVar);
            this.f3021o.f3049a.add(cVar2);
            this.f3028v.a(this.f3021o, this.f3018l);
            androidx.viewpager2.widget.c cVar3 = this.f3021o;
            cVar3.f3049a.add(this.f3011e);
            androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this.f3015i);
            this.f3023q = eVar;
            this.f3021o.f3049a.add(eVar);
            RecyclerView recyclerView = this.f3018l;
            attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public boolean b() {
        return this.f3015i.getLayoutDirection() == 1;
    }

    public void c(g gVar) {
        this.f3011e.f3049a.add(gVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f3018l.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f3018l.canScrollVertically(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        RecyclerView.g adapter;
        if (this.f3016j == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f3017k;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.h) {
                ((androidx.viewpager2.adapter.h) adapter).b(parcelable);
            }
            this.f3017k = null;
        }
        int iMax = Math.max(0, Math.min(this.f3016j, adapter.getItemCount() - 1));
        this.f3012f = iMax;
        this.f3016j = -1;
        this.f3018l.scrollToPosition(iMax);
        ((h) this.f3028v).c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i10 = ((SavedState) parcelable).f3029c;
            sparseArray.put(this.f3018l.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        d();
    }

    public void e(int i10, boolean z10) {
        if (((androidx.viewpager2.widget.f) this.f3022p.f3051b).f3067m) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        f(i10, z10);
    }

    public void f(int i10, boolean z10) {
        g gVar;
        RecyclerView.g adapter = getAdapter();
        if (adapter == null) {
            if (this.f3016j != -1) {
                this.f3016j = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i10, 0), adapter.getItemCount() - 1);
        int i11 = this.f3012f;
        if (iMin == i11) {
            if (this.f3020n.f3060f == 0) {
                return;
            }
        }
        if (iMin == i11 && z10) {
            return;
        }
        double d10 = i11;
        this.f3012f = iMin;
        ((h) this.f3028v).c();
        androidx.viewpager2.widget.f fVar = this.f3020n;
        if (!(fVar.f3060f == 0)) {
            fVar.d();
            androidx.viewpager2.widget.f.a aVar = fVar.f3061g;
            d10 = ((double) aVar.f3068a) + ((double) aVar.f3069b);
        }
        androidx.viewpager2.widget.f fVar2 = this.f3020n;
        fVar2.f3059e = z10 ? 2 : 3;
        fVar2.f3067m = false;
        boolean z11 = fVar2.f3063i != iMin;
        fVar2.f3063i = iMin;
        fVar2.b(2);
        if (z11 && (gVar = fVar2.f3055a) != null) {
            gVar.onPageSelected(iMin);
        }
        if (!z10) {
            this.f3018l.scrollToPosition(iMin);
            return;
        }
        double d11 = iMin;
        if (Math.abs(d11 - d10) <= 3.0d) {
            this.f3018l.smoothScrollToPosition(iMin);
            return;
        }
        this.f3018l.scrollToPosition(d11 > d10 ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f3018l;
        recyclerView.post(new l(iMin, recyclerView));
    }

    public void g(g gVar) {
        this.f3011e.f3049a.remove(gVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        d dVar = this.f3028v;
        Objects.requireNonNull(dVar);
        if (!(dVar instanceof h)) {
            return super.getAccessibilityClassName();
        }
        Objects.requireNonNull(this.f3028v);
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.g getAdapter() {
        return this.f3018l.getAdapter();
    }

    public int getCurrentItem() {
        return this.f3012f;
    }

    public int getItemDecorationCount() {
        return this.f3018l.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f3027u;
    }

    public int getOrientation() {
        return this.f3015i.getOrientation();
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f3018l;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f3020n.f3060f;
    }

    public void h() {
        z zVar = this.f3019m;
        if (zVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewE = zVar.e(this.f3015i);
        if (viewE == null) {
            return;
        }
        int position = this.f3015i.getPosition(viewE);
        if (position != this.f3012f && getScrollState() == 0) {
            this.f3021o.onPageSelected(position);
        }
        this.f3013g = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h hVar = (h) this.f3028v;
        if (ViewPager2.this.getAdapter() == null) {
            itemCount = 0;
            itemCount2 = 0;
        } else if (ViewPager2.this.getOrientation() == 1) {
            itemCount = ViewPager2.this.getAdapter().getItemCount();
            itemCount2 = 0;
        } else {
            itemCount2 = ViewPager2.this.getAdapter().getItemCount();
            itemCount = 0;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) q0.c.b.a(itemCount, itemCount2, false, 0).f34764a);
        RecyclerView.g adapter = ViewPager2.this.getAdapter();
        if (adapter == null || (itemCount3 = adapter.getItemCount()) == 0) {
            return;
        }
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.f3026t) {
            if (viewPager2.f3012f > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (ViewPager2.this.f3012f < itemCount3 - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f3018l.getMeasuredWidth();
        int measuredHeight = this.f3018l.getMeasuredHeight();
        this.f3009c.left = getPaddingLeft();
        this.f3009c.right = (i12 - i10) - getPaddingRight();
        this.f3009c.top = getPaddingTop();
        this.f3009c.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f3009c, this.f3010d);
        RecyclerView recyclerView = this.f3018l;
        Rect rect = this.f3010d;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f3013g) {
            h();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        measureChild(this.f3018l, i10, i11);
        int measuredWidth = this.f3018l.getMeasuredWidth();
        int measuredHeight = this.f3018l.getMeasuredHeight();
        int measuredState = this.f3018l.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f3016j = savedState.f3030d;
        this.f3017k = savedState.f3031e;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3029c = this.f3018l.getId();
        int i10 = this.f3016j;
        if (i10 == -1) {
            i10 = this.f3012f;
        }
        savedState.f3030d = i10;
        Parcelable parcelableA = this.f3017k;
        if (parcelableA != null) {
            savedState.f3031e = parcelableA;
        } else {
            Object adapter = this.f3018l.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.h) {
                parcelableA = ((androidx.viewpager2.adapter.h) adapter).a();
                savedState.f3031e = parcelableA;
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        Objects.requireNonNull((h) this.f3028v);
        if (!(i10 == 8192 || i10 == 4096)) {
            return super.performAccessibilityAction(i10, bundle);
        }
        h hVar = (h) this.f3028v;
        Objects.requireNonNull(hVar);
        if (!(i10 == 8192 || i10 == 4096)) {
            throw new IllegalStateException();
        }
        hVar.b(i10 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
        return true;
    }

    public void setAdapter(RecyclerView.g gVar) {
        RecyclerView.g adapter = this.f3018l.getAdapter();
        h hVar = (h) this.f3028v;
        Objects.requireNonNull(hVar);
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(hVar.f3038c);
        }
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.f3014h);
        }
        this.f3018l.setAdapter(gVar);
        this.f3012f = 0;
        d();
        h hVar2 = (h) this.f3028v;
        hVar2.c();
        if (gVar != null) {
            gVar.registerAdapterDataObserver(hVar2.f3038c);
        }
        if (gVar != null) {
            gVar.registerAdapterDataObserver(this.f3014h);
        }
    }

    public void setCurrentItem(int i10) {
        e(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        ((h) this.f3028v).c();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f3027u = i10;
        this.f3018l.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f3015i.setOrientation(i10);
        ((h) this.f3028v).c();
    }

    public void setPageTransformer(i iVar) {
        boolean z10 = this.f3025s;
        if (iVar != null) {
            if (!z10) {
                this.f3024r = this.f3018l.getItemAnimator();
                this.f3025s = true;
            }
            this.f3018l.setItemAnimator(null);
        } else if (z10) {
            this.f3018l.setItemAnimator(this.f3024r);
            this.f3024r = null;
            this.f3025s = false;
        }
        androidx.viewpager2.widget.e eVar = this.f3023q;
        if (iVar == eVar.f3054b) {
            return;
        }
        eVar.f3054b = iVar;
        if (iVar == null) {
            return;
        }
        androidx.viewpager2.widget.f fVar = this.f3020n;
        fVar.d();
        androidx.viewpager2.widget.f.a aVar = fVar.f3061g;
        double d10 = ((double) aVar.f3068a) + ((double) aVar.f3069b);
        int i10 = (int) d10;
        float f10 = (float) (d10 - ((double) i10));
        this.f3023q.onPageScrolled(i10, f10, Math.round(getPageSize() * f10));
    }

    public void setUserInputEnabled(boolean z10) {
        this.f3026t = z10;
        ((h) this.f3028v).c();
    }
}
