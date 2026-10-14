package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.y.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d[] f2520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y f2521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f2522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f2525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BitSet f2528j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2530l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LazySpanLookup f2531m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2533o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SavedState f2535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f2536r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f2537s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2538t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[] f2539u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Runnable f2540v;

    public static class LazySpanLookup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f2541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<FullSpanItem> f2542b;

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f2543c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f2544d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int[] f2545e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f2546f;

            public static class a implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public FullSpanItem[] newArray(int i10) {
                    return new FullSpanItem[i10];
                }
            }

            public FullSpanItem() {
            }

            public FullSpanItem(Parcel parcel) {
                this.f2543c = parcel.readInt();
                this.f2544d = parcel.readInt();
                this.f2546f = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    this.f2545e = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder sbA = defpackage.a.a("FullSpanItem{mPosition=");
                sbA.append(this.f2543c);
                sbA.append(", mGapDir=");
                sbA.append(this.f2544d);
                sbA.append(", mHasUnwantedGapAfter=");
                sbA.append(this.f2546f);
                sbA.append(", mGapPerSpan=");
                sbA.append(Arrays.toString(this.f2545e));
                sbA.append('}');
                return sbA.toString();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f2543c);
                parcel.writeInt(this.f2544d);
                parcel.writeInt(this.f2546f ? 1 : 0);
                int[] iArr = this.f2545e;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f2545e);
                }
            }
        }

        public void a() {
            int[] iArr = this.f2541a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2542b = null;
        }

        public void b(int i10) {
            int[] iArr = this.f2541a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f2541a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int length = iArr.length;
                while (length <= i10) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f2541a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2541a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public FullSpanItem c(int i10) {
            List<FullSpanItem> list = this.f2542b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f2542b.get(size);
                if (fullSpanItem.f2543c == i10) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x000e  */
        public int d(int i10) {
            int i11;
            int[] iArr = this.f2541a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            if (this.f2542b != null) {
                FullSpanItem fullSpanItemC = c(i10);
                if (fullSpanItemC != null) {
                    this.f2542b.remove(fullSpanItemC);
                }
                int size = this.f2542b.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        i12 = -1;
                        break;
                    }
                    if (this.f2542b.get(i12).f2543c >= i10) {
                        break;
                    }
                    i12++;
                }
                if (i12 != -1) {
                    FullSpanItem fullSpanItem = this.f2542b.get(i12);
                    this.f2542b.remove(i12);
                    i11 = fullSpanItem.f2543c;
                } else {
                    i11 = -1;
                }
            } else {
                i11 = -1;
            }
            if (i11 == -1) {
                int[] iArr2 = this.f2541a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f2541a.length;
            }
            int i13 = i11 + 1;
            Arrays.fill(this.f2541a, i10, i13, -1);
            return i13;
        }

        public void e(int i10, int i11) {
            int[] iArr = this.f2541a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            b(i12);
            int[] iArr2 = this.f2541a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f2541a, i10, i12, -1);
            List<FullSpanItem> list = this.f2542b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f2542b.get(size);
                int i13 = fullSpanItem.f2543c;
                if (i13 >= i10) {
                    fullSpanItem.f2543c = i13 + i11;
                }
            }
        }

        public void f(int i10, int i11) {
            int[] iArr = this.f2541a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            b(i12);
            int[] iArr2 = this.f2541a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f2541a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            List<FullSpanItem> list = this.f2542b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f2542b.get(size);
                int i13 = fullSpanItem.f2543c;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f2542b.remove(size);
                    } else {
                        fullSpanItem.f2543c = i13 - i11;
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f2550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2551g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int[] f2552h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List<LazySpanLookup.FullSpanItem> f2553i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f2554j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f2555k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f2556l;

        public static class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f2547c = parcel.readInt();
            this.f2548d = parcel.readInt();
            int i10 = parcel.readInt();
            this.f2549e = i10;
            if (i10 > 0) {
                int[] iArr = new int[i10];
                this.f2550f = iArr;
                parcel.readIntArray(iArr);
            }
            int i11 = parcel.readInt();
            this.f2551g = i11;
            if (i11 > 0) {
                int[] iArr2 = new int[i11];
                this.f2552h = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f2554j = parcel.readInt() == 1;
            this.f2555k = parcel.readInt() == 1;
            this.f2556l = parcel.readInt() == 1;
            this.f2553i = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f2549e = savedState.f2549e;
            this.f2547c = savedState.f2547c;
            this.f2548d = savedState.f2548d;
            this.f2550f = savedState.f2550f;
            this.f2551g = savedState.f2551g;
            this.f2552h = savedState.f2552h;
            this.f2554j = savedState.f2554j;
            this.f2555k = savedState.f2555k;
            this.f2556l = savedState.f2556l;
            this.f2553i = savedState.f2553i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2547c);
            parcel.writeInt(this.f2548d);
            parcel.writeInt(this.f2549e);
            if (this.f2549e > 0) {
                parcel.writeIntArray(this.f2550f);
            }
            parcel.writeInt(this.f2551g);
            if (this.f2551g > 0) {
                parcel.writeIntArray(this.f2552h);
            }
            parcel.writeInt(this.f2554j ? 1 : 0);
            parcel.writeInt(this.f2555k ? 1 : 0);
            parcel.writeInt(this.f2556l ? 1 : 0);
            parcel.writeList(this.f2553i);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.x();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2560c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2561d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2562e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f2563f;

        public b() {
            b();
        }

        public void a() {
            this.f2559b = this.f2560c ? StaggeredGridLayoutManager.this.f2521c.g() : StaggeredGridLayoutManager.this.f2521c.k();
        }

        public void b() {
            this.f2558a = -1;
            this.f2559b = Integer.MIN_VALUE;
            this.f2560c = false;
            this.f2561d = false;
            this.f2562e = false;
            int[] iArr = this.f2563f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.p {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d f2565e;

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(RecyclerView.p pVar) {
            super(pVar);
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList<View> f2566a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2567b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2568c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2569d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f2570e;

        public d(int i10) {
            this.f2570e = i10;
        }

        public void a(View view) {
            c cVarL = l(view);
            cVarL.f2565e = this;
            this.f2566a.add(view);
            this.f2568c = Integer.MIN_VALUE;
            if (this.f2566a.size() == 1) {
                this.f2567b = Integer.MIN_VALUE;
            }
            if (cVarL.c() || cVarL.b()) {
                this.f2569d = StaggeredGridLayoutManager.this.f2521c.c(view) + this.f2569d;
            }
        }

        public void b() {
            ArrayList<View> arrayList = this.f2566a;
            View view = arrayList.get(arrayList.size() - 1);
            c cVarL = l(view);
            this.f2568c = StaggeredGridLayoutManager.this.f2521c.b(view);
            Objects.requireNonNull(cVarL);
        }

        public void c() {
            View view = this.f2566a.get(0);
            c cVarL = l(view);
            this.f2567b = StaggeredGridLayoutManager.this.f2521c.e(view);
            Objects.requireNonNull(cVarL);
        }

        public void d() {
            this.f2566a.clear();
            this.f2567b = Integer.MIN_VALUE;
            this.f2568c = Integer.MIN_VALUE;
            this.f2569d = 0;
        }

        public int e() {
            int size;
            int size2;
            if (StaggeredGridLayoutManager.this.f2526h) {
                size = this.f2566a.size() - 1;
                size2 = -1;
            } else {
                size = 0;
                size2 = this.f2566a.size();
            }
            return h(size, size2, true);
        }

        public int f() {
            int size;
            int size2;
            if (StaggeredGridLayoutManager.this.f2526h) {
                size = 0;
                size2 = this.f2566a.size();
            } else {
                size = this.f2566a.size() - 1;
                size2 = -1;
            }
            return h(size, size2, true);
        }

        public int g(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int iK = StaggeredGridLayoutManager.this.f2521c.k();
            int iG = StaggeredGridLayoutManager.this.f2521c.g();
            int i12 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f2566a.get(i10);
                int iE = StaggeredGridLayoutManager.this.f2521c.e(view);
                int iB = StaggeredGridLayoutManager.this.f2521c.b(view);
                boolean z13 = false;
                boolean z14 = !z12 ? iE >= iG : iE > iG;
                if (!z12 ? iB > iK : iB >= iK) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (iE >= iK && iB <= iG) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else if (z11 || iE < iK || iB > iG) {
                        return StaggeredGridLayoutManager.this.getPosition(view);
                    }
                }
                i10 += i12;
            }
            return -1;
        }

        public int h(int i10, int i11, boolean z10) {
            return g(i10, i11, false, false, z10);
        }

        public int i(int i10, int i11, boolean z10) {
            return g(i10, i11, z10, true, false);
        }

        public int j(int i10) {
            int i11 = this.f2568c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f2566a.size() == 0) {
                return i10;
            }
            b();
            return this.f2568c;
        }

        public View k(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f2566a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f2566a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f2526h && staggeredGridLayoutManager.getPosition(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f2526h && staggeredGridLayoutManager2.getPosition(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f2566a.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = this.f2566a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f2526h && staggeredGridLayoutManager3.getPosition(view3) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f2526h && staggeredGridLayoutManager4.getPosition(view3) >= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        public c l(View view) {
            return (c) view.getLayoutParams();
        }

        public int m(int i10) {
            int i11 = this.f2567b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f2566a.size() == 0) {
                return i10;
            }
            c();
            return this.f2567b;
        }

        public void n() {
            int size = this.f2566a.size();
            View viewRemove = this.f2566a.remove(size - 1);
            c cVarL = l(viewRemove);
            cVarL.f2565e = null;
            if (cVarL.c() || cVarL.b()) {
                this.f2569d -= StaggeredGridLayoutManager.this.f2521c.c(viewRemove);
            }
            if (size == 1) {
                this.f2567b = Integer.MIN_VALUE;
            }
            this.f2568c = Integer.MIN_VALUE;
        }

        public void o() {
            View viewRemove = this.f2566a.remove(0);
            c cVarL = l(viewRemove);
            cVarL.f2565e = null;
            if (this.f2566a.size() == 0) {
                this.f2568c = Integer.MIN_VALUE;
            }
            if (cVarL.c() || cVarL.b()) {
                this.f2569d -= StaggeredGridLayoutManager.this.f2521c.c(viewRemove);
            }
            this.f2567b = Integer.MIN_VALUE;
        }

        public void p(View view) {
            c cVarL = l(view);
            cVarL.f2565e = this;
            this.f2566a.add(0, view);
            this.f2567b = Integer.MIN_VALUE;
            if (this.f2566a.size() == 1) {
                this.f2568c = Integer.MIN_VALUE;
            }
            if (cVarL.c() || cVarL.b()) {
                this.f2569d = StaggeredGridLayoutManager.this.f2521c.c(view) + this.f2569d;
            }
        }
    }

    public StaggeredGridLayoutManager(int i10, int i11) {
        this.f2519a = -1;
        this.f2526h = false;
        this.f2527i = false;
        this.f2529k = -1;
        this.f2530l = Integer.MIN_VALUE;
        this.f2531m = new LazySpanLookup();
        this.f2532n = 2;
        this.f2536r = new Rect();
        this.f2537s = new b();
        this.f2538t = true;
        this.f2540v = new a();
        this.f2523e = i11;
        R(i10);
        this.f2525g = new r();
        this.f2521c = y.a(this, this.f2523e);
        this.f2522d = y.a(this, 1 - this.f2523e);
    }

    public View A(boolean z10) {
        int iK = this.f2521c.k();
        int iG = this.f2521c.g();
        int childCount = getChildCount();
        View view = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int iE = this.f2521c.e(childAt);
            if (this.f2521c.b(childAt) > iK && iE < iG) {
                if (iE >= iK || !z10) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final void B(RecyclerView.v vVar, RecyclerView.z zVar, boolean z10) {
        int iG;
        int iF = F(Integer.MIN_VALUE);
        if (iF != Integer.MIN_VALUE && (iG = this.f2521c.g() - iF) > 0) {
            int i10 = iG - (-scrollBy(-iG, vVar, zVar));
            if (!z10 || i10 <= 0) {
                return;
            }
            this.f2521c.p(i10);
        }
    }

    public final void C(RecyclerView.v vVar, RecyclerView.z zVar, boolean z10) {
        int iK;
        int iG = G(Integer.MAX_VALUE);
        if (iG != Integer.MAX_VALUE && (iK = iG - this.f2521c.k()) > 0) {
            int iScrollBy = iK - scrollBy(iK, vVar, zVar);
            if (!z10 || iScrollBy <= 0) {
                return;
            }
            this.f2521c.p(-iScrollBy);
        }
    }

    public int D() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public int E() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public final int F(int i10) {
        int iJ = this.f2520b[0].j(i10);
        for (int i11 = 1; i11 < this.f2519a; i11++) {
            int iJ2 = this.f2520b[i11].j(i10);
            if (iJ2 > iJ) {
                iJ = iJ2;
            }
        }
        return iJ;
    }

    public final int G(int i10) {
        int iM = this.f2520b[0].m(i10);
        for (int i11 = 1; i11 < this.f2519a; i11++) {
            int iM2 = this.f2520b[i11].m(i10);
            if (iM2 < iM) {
                iM = iM2;
            }
        }
        return iM;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:17:0x0028 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public final void H(int i10, int i11, int i12) {
        int i13;
        int i14;
        int iE;
        int iE2 = this.f2527i ? E() : D();
        if (i12 == 8) {
            if (i10 < i11) {
                i13 = i11 + 1;
            } else {
                i13 = i10 + 1;
                i14 = i11;
            }
            this.f2531m.d(i14);
            if (i12 != 1) {
                this.f2531m.e(i10, i11);
            } else if (i12 != 2) {
                this.f2531m.f(i10, i11);
            } else if (i12 == 8) {
                this.f2531m.f(i10, 1);
                this.f2531m.e(i11, 1);
            }
            if (i13 <= iE2) {
                return;
            }
            if (this.f2527i) {
                iE = D();
            } else {
                iE = E();
            }
            if (i14 <= iE) {
                requestLayout();
            }
        }
        i13 = i10 + i11;
        i14 = i10;
        this.f2531m.d(i14);
        if (i12 != 1) {
            this.f2531m.e(i10, i11);
        } else if (i12 != 2) {
            this.f2531m.f(i10, i11);
        } else if (i12 == 8) {
            this.f2531m.f(i10, 1);
            this.f2531m.e(i11, 1);
        }
        if (i13 <= iE2) {
            return;
        }
        if (this.f2527i) {
            iE = D();
        } else {
            iE = E();
        }
        if (i14 <= iE) {
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
    public View I() {
        int i10;
        boolean z10;
        View view;
        boolean z11;
        int childCount = getChildCount() - 1;
        BitSet bitSet = new BitSet(this.f2519a);
        bitSet.set(0, this.f2519a, true);
        byte b10 = (this.f2523e == 1 && isLayoutRTL()) ? (byte) 1 : (byte) -1;
        if (this.f2527i) {
            i10 = -1;
        } else {
            i10 = childCount + 1;
            childCount = 0;
        }
        int i11 = childCount < i10 ? 1 : -1;
        while (childCount != i10) {
            View childAt = getChildAt(childCount);
            c cVar = (c) childAt.getLayoutParams();
            if (bitSet.get(cVar.f2565e.f2570e)) {
                d dVar = cVar.f2565e;
                if (this.f2527i) {
                    int i12 = dVar.f2568c;
                    if (i12 == Integer.MIN_VALUE) {
                        dVar.b();
                        i12 = dVar.f2568c;
                    }
                    if (i12 < this.f2521c.g()) {
                        ArrayList<View> arrayList = dVar.f2566a;
                        view = arrayList.get(arrayList.size() - 1);
                        Objects.requireNonNull(dVar.l(view));
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    int i13 = dVar.f2567b;
                    if (i13 == Integer.MIN_VALUE) {
                        dVar.c();
                        i13 = dVar.f2567b;
                    }
                    if (i13 > this.f2521c.k()) {
                        view = dVar.f2566a.get(0);
                        Objects.requireNonNull(dVar.l(view));
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    return childAt;
                }
                bitSet.clear(cVar.f2565e.f2570e);
            }
            int i14 = childCount + i11;
            if (i14 != i10) {
                View childAt2 = getChildAt(i14);
                if (this.f2527i) {
                    int iB = this.f2521c.b(childAt);
                    int iB2 = this.f2521c.b(childAt2);
                    if (iB < iB2) {
                        return childAt;
                    }
                    if (iB == iB2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    int iE = this.f2521c.e(childAt);
                    int iE2 = this.f2521c.e(childAt2);
                    if (iE > iE2) {
                        return childAt;
                    }
                    if (iE == iE2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    if ((cVar.f2565e.f2570e - ((c) childAt2.getLayoutParams()).f2565e.f2570e < 0) != (b10 < 0)) {
                        return childAt;
                    }
                } else {
                    continue;
                }
            }
            childCount += i11;
        }
        return null;
    }

    public final void J(View view, int i10, int i11, boolean z10) {
        calculateItemDecorationsForChild(view, this.f2536r);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f2536r;
        int iV = V(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f2536r;
        int iV2 = V(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10 ? shouldReMeasureChild(view, iV, iV2, cVar) : shouldMeasureChild(view, iV, iV2, cVar)) {
            view.measure(iV, iV2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:247:0x03ed  */
    public final void K(RecyclerView.v vVar, RecyclerView.z zVar, boolean z10) {
        boolean z11;
        SavedState savedState;
        boolean z12;
        int position;
        int i10;
        int iG;
        int iG2;
        int iK;
        int iE;
        boolean z13;
        b bVar = this.f2537s;
        if (!(this.f2535q == null && this.f2529k == -1) && zVar.b() == 0) {
            removeAndRecycleAllViews(vVar);
            bVar.b();
            return;
        }
        boolean z14 = (bVar.f2562e && this.f2529k == -1 && this.f2535q == null) ? false : true;
        if (z14) {
            bVar.b();
            SavedState savedState2 = this.f2535q;
            if (savedState2 != null) {
                int i11 = savedState2.f2549e;
                if (i11 > 0) {
                    if (i11 == this.f2519a) {
                        for (int i12 = 0; i12 < this.f2519a; i12++) {
                            this.f2520b[i12].d();
                            SavedState savedState3 = this.f2535q;
                            int iG3 = savedState3.f2550f[i12];
                            if (iG3 != Integer.MIN_VALUE) {
                                iG3 += savedState3.f2555k ? this.f2521c.g() : this.f2521c.k();
                            }
                            d dVar = this.f2520b[i12];
                            dVar.f2567b = iG3;
                            dVar.f2568c = iG3;
                        }
                    } else {
                        savedState2.f2550f = null;
                        savedState2.f2549e = 0;
                        savedState2.f2551g = 0;
                        savedState2.f2552h = null;
                        savedState2.f2553i = null;
                        savedState2.f2547c = savedState2.f2548d;
                    }
                }
                SavedState savedState4 = this.f2535q;
                this.f2534p = savedState4.f2556l;
                boolean z15 = savedState4.f2554j;
                assertNotInLayoutOrScroll(null);
                SavedState savedState5 = this.f2535q;
                if (savedState5 != null && savedState5.f2554j != z15) {
                    savedState5.f2554j = z15;
                }
                this.f2526h = z15;
                requestLayout();
                resolveShouldLayoutReverse();
                SavedState savedState6 = this.f2535q;
                int i13 = savedState6.f2547c;
                if (i13 != -1) {
                    this.f2529k = i13;
                    z13 = savedState6.f2555k;
                } else {
                    z13 = this.f2527i;
                }
                bVar.f2560c = z13;
                if (savedState6.f2551g > 1) {
                    LazySpanLookup lazySpanLookup = this.f2531m;
                    lazySpanLookup.f2541a = savedState6.f2552h;
                    lazySpanLookup.f2542b = savedState6.f2553i;
                }
            } else {
                resolveShouldLayoutReverse();
                bVar.f2560c = this.f2527i;
            }
            if (zVar.f2511g || (i10 = this.f2529k) == -1) {
                z12 = false;
            } else if (i10 < 0 || i10 >= zVar.b()) {
                this.f2529k = -1;
                this.f2530l = Integer.MIN_VALUE;
                z12 = false;
            } else {
                SavedState savedState7 = this.f2535q;
                if (savedState7 == null || savedState7.f2547c == -1 || savedState7.f2549e < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f2529k);
                    if (viewFindViewByPosition != null) {
                        bVar.f2558a = this.f2527i ? E() : D();
                        if (this.f2530l != Integer.MIN_VALUE) {
                            if (bVar.f2560c) {
                                iK = this.f2521c.g() - this.f2530l;
                                iE = this.f2521c.b(viewFindViewByPosition);
                            } else {
                                iK = this.f2521c.k() + this.f2530l;
                                iE = this.f2521c.e(viewFindViewByPosition);
                            }
                            iG = iK - iE;
                        } else {
                            if (this.f2521c.c(viewFindViewByPosition) > this.f2521c.l()) {
                                iG2 = bVar.f2560c ? this.f2521c.g() : this.f2521c.k();
                            } else {
                                int iE2 = this.f2521c.e(viewFindViewByPosition) - this.f2521c.k();
                                if (iE2 < 0) {
                                    iG2 = -iE2;
                                } else {
                                    iG = this.f2521c.g() - this.f2521c.b(viewFindViewByPosition);
                                    if (iG >= 0) {
                                        bVar.f2559b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                            bVar.f2559b = iG2;
                        }
                        bVar.f2559b = iG;
                    } else {
                        int i14 = this.f2529k;
                        bVar.f2558a = i14;
                        int i15 = this.f2530l;
                        if (i15 == Integer.MIN_VALUE) {
                            bVar.f2560c = w(i14) == 1;
                            bVar.a();
                        } else {
                            bVar.f2559b = bVar.f2560c ? StaggeredGridLayoutManager.this.f2521c.g() - i15 : StaggeredGridLayoutManager.this.f2521c.k() + i15;
                        }
                        bVar.f2561d = true;
                    }
                } else {
                    bVar.f2559b = Integer.MIN_VALUE;
                    bVar.f2558a = this.f2529k;
                }
                z12 = true;
            }
            if (!z12) {
                boolean z16 = this.f2533o;
                int iB = zVar.b();
                if (z16) {
                    int childCount = getChildCount();
                    while (true) {
                        childCount--;
                        if (childCount < 0) {
                            position = 0;
                            break;
                        }
                        position = getPosition(getChildAt(childCount));
                        if (position >= 0 && position < iB) {
                            break;
                        }
                    }
                } else {
                    int childCount2 = getChildCount();
                    int i16 = 0;
                    while (true) {
                        if (i16 >= childCount2) {
                            position = 0;
                            break;
                        }
                        int position2 = getPosition(getChildAt(i16));
                        if (position2 >= 0 && position2 < iB) {
                            position = position2;
                            break;
                        }
                        i16++;
                    }
                }
                bVar.f2558a = position;
                bVar.f2559b = Integer.MIN_VALUE;
            }
            bVar.f2562e = true;
        }
        if (this.f2535q == null && this.f2529k == -1 && (bVar.f2560c != this.f2533o || isLayoutRTL() != this.f2534p)) {
            this.f2531m.a();
            bVar.f2561d = true;
        }
        if (getChildCount() > 0 && ((savedState = this.f2535q) == null || savedState.f2549e < 1)) {
            if (bVar.f2561d) {
                for (int i17 = 0; i17 < this.f2519a; i17++) {
                    this.f2520b[i17].d();
                    int i18 = bVar.f2559b;
                    if (i18 != Integer.MIN_VALUE) {
                        d dVar2 = this.f2520b[i17];
                        dVar2.f2567b = i18;
                        dVar2.f2568c = i18;
                    }
                }
            } else if (z14 || this.f2537s.f2563f == null) {
                for (int i19 = 0; i19 < this.f2519a; i19++) {
                    d dVar3 = this.f2520b[i19];
                    boolean z17 = this.f2527i;
                    int i20 = bVar.f2559b;
                    int iJ = z17 ? dVar3.j(Integer.MIN_VALUE) : dVar3.m(Integer.MIN_VALUE);
                    dVar3.d();
                    if (iJ != Integer.MIN_VALUE && ((!z17 || iJ >= StaggeredGridLayoutManager.this.f2521c.g()) && (z17 || iJ <= StaggeredGridLayoutManager.this.f2521c.k()))) {
                        if (i20 != Integer.MIN_VALUE) {
                            iJ += i20;
                        }
                        dVar3.f2568c = iJ;
                        dVar3.f2567b = iJ;
                    }
                }
                b bVar2 = this.f2537s;
                d[] dVarArr = this.f2520b;
                Objects.requireNonNull(bVar2);
                int length = dVarArr.length;
                int[] iArr = bVar2.f2563f;
                if (iArr == null || iArr.length < length) {
                    bVar2.f2563f = new int[StaggeredGridLayoutManager.this.f2520b.length];
                }
                for (int i21 = 0; i21 < length; i21++) {
                    bVar2.f2563f[i21] = dVarArr[i21].m(Integer.MIN_VALUE);
                }
            } else {
                for (int i22 = 0; i22 < this.f2519a; i22++) {
                    d dVar4 = this.f2520b[i22];
                    dVar4.d();
                    int i23 = this.f2537s.f2563f[i22];
                    dVar4.f2567b = i23;
                    dVar4.f2568c = i23;
                }
            }
        }
        detachAndScrapAttachedViews(vVar);
        this.f2525g.f2784a = false;
        int iL = this.f2522d.l();
        this.f2524f = iL / this.f2519a;
        View.MeasureSpec.makeMeasureSpec(iL, this.f2522d.i());
        T(bVar.f2558a, zVar);
        if (bVar.f2560c) {
            Q(-1);
            y(vVar, this.f2525g, zVar);
            Q(1);
        } else {
            Q(1);
            y(vVar, this.f2525g, zVar);
            Q(-1);
        }
        r rVar = this.f2525g;
        rVar.f2786c = bVar.f2558a + rVar.f2787d;
        y(vVar, rVar, zVar);
        if (this.f2522d.i() != 1073741824) {
            float fMax = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            int childCount3 = getChildCount();
            for (int i24 = 0; i24 < childCount3; i24++) {
                View childAt = getChildAt(i24);
                float fC = this.f2522d.c(childAt);
                if (fC >= fMax) {
                    Objects.requireNonNull((c) childAt.getLayoutParams());
                    fMax = Math.max(fMax, fC);
                }
            }
            int i25 = this.f2524f;
            int iRound = Math.round(fMax * this.f2519a);
            if (this.f2522d.i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f2522d.l());
            }
            this.f2524f = iRound / this.f2519a;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f2522d.i());
            if (this.f2524f != i25) {
                for (int i26 = 0; i26 < childCount3; i26++) {
                    View childAt2 = getChildAt(i26);
                    c cVar = (c) childAt2.getLayoutParams();
                    Objects.requireNonNull(cVar);
                    if (isLayoutRTL() && this.f2523e == 1) {
                        int i27 = this.f2519a;
                        int i28 = cVar.f2565e.f2570e;
                        childAt2.offsetLeftAndRight(((-((i27 - 1) - i28)) * this.f2524f) - ((-((i27 - 1) - i28)) * i25));
                    } else {
                        int i29 = cVar.f2565e.f2570e;
                        int i30 = this.f2523e;
                        int i31 = (this.f2524f * i29) - (i29 * i25);
                        if (i30 == 1) {
                            childAt2.offsetLeftAndRight(i31);
                        } else {
                            childAt2.offsetTopAndBottom(i31);
                        }
                    }
                }
            }
        }
        if (getChildCount() > 0) {
            if (this.f2527i) {
                B(vVar, zVar, true);
                C(vVar, zVar, false);
            } else {
                C(vVar, zVar, true);
                B(vVar, zVar, false);
            }
        }
        if (z10 && !zVar.f2511g) {
            if ((this.f2532n == 0 || getChildCount() <= 0 || I() == null) ? false : true) {
                removeCallbacks(this.f2540v);
                z11 = x();
            }
        }
        if (zVar.f2511g) {
            this.f2537s.b();
        }
        this.f2533o = bVar.f2560c;
        this.f2534p = isLayoutRTL();
        if (z11) {
            this.f2537s.b();
            K(vVar, zVar, false);
        }
    }

    public final boolean L(int i10) {
        if (this.f2523e == 0) {
            return (i10 == -1) != this.f2527i;
        }
        return ((i10 == -1) == this.f2527i) == isLayoutRTL();
    }

    public void M(int i10, RecyclerView.z zVar) {
        int i11;
        int iD;
        if (i10 > 0) {
            iD = E();
            i11 = 1;
        } else {
            i11 = -1;
            iD = D();
        }
        this.f2525g.f2784a = true;
        T(iD, zVar);
        Q(i11);
        r rVar = this.f2525g;
        rVar.f2786c = iD + rVar.f2787d;
        rVar.f2785b = Math.abs(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
    
        if (r6.f2788e == (-1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(androidx.recyclerview.widget.RecyclerView.v r5, androidx.recyclerview.widget.r r6) {
        /*
            r4 = this;
            boolean r0 = r6.f2784a
            if (r0 == 0) goto L7c
            boolean r0 = r6.f2792i
            if (r0 == 0) goto La
            goto L7c
        La:
            int r0 = r6.f2785b
            r1 = -1
            if (r0 != 0) goto L1f
            int r0 = r6.f2788e
            if (r0 != r1) goto L19
        L13:
            int r6 = r6.f2790g
        L15:
            r4.O(r5, r6)
            goto L7c
        L19:
            int r6 = r6.f2789f
        L1b:
            r4.P(r5, r6)
            goto L7c
        L1f:
            int r0 = r6.f2788e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L50
            int r0 = r6.f2789f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r1 = r4.f2520b
            r1 = r1[r2]
            int r1 = r1.m(r0)
        L2f:
            int r2 = r4.f2519a
            if (r3 >= r2) goto L41
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r2 = r4.f2520b
            r2 = r2[r3]
            int r2 = r2.m(r0)
            if (r2 <= r1) goto L3e
            r1 = r2
        L3e:
            int r3 = r3 + 1
            goto L2f
        L41:
            int r0 = r0 - r1
            if (r0 >= 0) goto L45
            goto L13
        L45:
            int r1 = r6.f2790g
            int r6 = r6.f2785b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L15
        L50:
            int r0 = r6.f2790g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r1 = r4.f2520b
            r1 = r1[r2]
            int r1 = r1.j(r0)
        L5a:
            int r2 = r4.f2519a
            if (r3 >= r2) goto L6c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r2 = r4.f2520b
            r2 = r2[r3]
            int r2 = r2.j(r0)
            if (r2 >= r1) goto L69
            r1 = r2
        L69:
            int r3 = r3 + 1
            goto L5a
        L6c:
            int r0 = r6.f2790g
            int r1 = r1 - r0
            if (r1 >= 0) goto L72
            goto L19
        L72:
            int r0 = r6.f2789f
            int r6 = r6.f2785b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L1b
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.N(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.r):void");
    }

    public final void O(RecyclerView.v vVar, int i10) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f2521c.e(childAt) < i10 || this.f2521c.o(childAt) < i10) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            Objects.requireNonNull(cVar);
            if (cVar.f2565e.f2566a.size() == 1) {
                return;
            }
            cVar.f2565e.n();
            removeAndRecycleView(childAt, vVar);
        }
    }

    public final void P(RecyclerView.v vVar, int i10) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f2521c.b(childAt) > i10 || this.f2521c.n(childAt) > i10) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            Objects.requireNonNull(cVar);
            if (cVar.f2565e.f2566a.size() == 1) {
                return;
            }
            cVar.f2565e.o();
            removeAndRecycleView(childAt, vVar);
        }
    }

    public final void Q(int i10) {
        r rVar = this.f2525g;
        rVar.f2788e = i10;
        rVar.f2787d = this.f2527i != (i10 == -1) ? -1 : 1;
    }

    public void R(int i10) {
        assertNotInLayoutOrScroll(null);
        if (i10 != this.f2519a) {
            this.f2531m.a();
            requestLayout();
            this.f2519a = i10;
            this.f2528j = new BitSet(this.f2519a);
            this.f2520b = new d[this.f2519a];
            for (int i11 = 0; i11 < this.f2519a; i11++) {
                this.f2520b[i11] = new d(i11);
            }
            requestLayout();
        }
    }

    public final void S(int i10, int i11) {
        for (int i12 = 0; i12 < this.f2519a; i12++) {
            if (!this.f2520b[i12].f2566a.isEmpty()) {
                U(this.f2520b[i12], i10, i11);
            }
        }
    }

    public final void T(int i10, RecyclerView.z zVar) {
        int iL;
        int iL2;
        int i11;
        r rVar = this.f2525g;
        boolean z10 = false;
        rVar.f2785b = 0;
        rVar.f2786c = i10;
        if (!isSmoothScrolling() || (i11 = zVar.f2505a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.f2527i == (i11 < i10)) {
                iL = this.f2521c.l();
                iL2 = 0;
            } else {
                iL2 = this.f2521c.l();
                iL = 0;
            }
        }
        if (getClipToPadding()) {
            this.f2525g.f2789f = this.f2521c.k() - iL2;
            this.f2525g.f2790g = this.f2521c.g() + iL;
        } else {
            this.f2525g.f2790g = this.f2521c.f() + iL;
            this.f2525g.f2789f = -iL2;
        }
        r rVar2 = this.f2525g;
        rVar2.f2791h = false;
        rVar2.f2784a = true;
        if (this.f2521c.i() == 0 && this.f2521c.f() == 0) {
            z10 = true;
        }
        rVar2.f2792i = z10;
    }

    public final void U(d dVar, int i10, int i11) {
        int i12 = dVar.f2569d;
        if (i10 == -1) {
            int i13 = dVar.f2567b;
            if (i13 == Integer.MIN_VALUE) {
                dVar.c();
                i13 = dVar.f2567b;
            }
            if (i13 + i12 > i11) {
                return;
            }
        } else {
            int i14 = dVar.f2568c;
            if (i14 == Integer.MIN_VALUE) {
                dVar.b();
                i14 = dVar.f2568c;
            }
            if (i14 - i12 < i11) {
                return;
            }
        }
        this.f2528j.set(dVar.f2570e, false);
    }

    public final int V(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f2535q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollHorizontally() {
        return this.f2523e == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollVertically() {
        return this.f2523e == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean checkLayoutParams(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void collectAdjacentPrefetchPositions(int i10, int i11, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        int iJ;
        int iM;
        if (this.f2523e != 0) {
            i10 = i11;
        }
        if (getChildCount() == 0 || i10 == 0) {
            return;
        }
        M(i10, zVar);
        int[] iArr = this.f2539u;
        if (iArr == null || iArr.length < this.f2519a) {
            this.f2539u = new int[this.f2519a];
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f2519a; i13++) {
            r rVar = this.f2525g;
            if (rVar.f2787d == -1) {
                iJ = rVar.f2789f;
                iM = this.f2520b[i13].m(iJ);
            } else {
                iJ = this.f2520b[i13].j(rVar.f2790g);
                iM = this.f2525g.f2790g;
            }
            int i14 = iJ - iM;
            if (i14 >= 0) {
                this.f2539u[i12] = i14;
                i12++;
            }
        }
        Arrays.sort(this.f2539u, 0, i12);
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = this.f2525g.f2786c;
            if (!(i16 >= 0 && i16 < zVar.b())) {
                return;
            }
            ((n.b) cVar).a(this.f2525g.f2786c, this.f2539u[i15]);
            r rVar2 = this.f2525g;
            rVar2.f2786c += rVar2.f2787d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollExtent(RecyclerView.z zVar) {
        return computeScrollExtent(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollOffset(RecyclerView.z zVar) {
        return computeScrollOffset(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollRange(RecyclerView.z zVar) {
        return computeScrollRange(zVar);
    }

    public final int computeScrollExtent(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return b0.a(zVar, this.f2521c, A(!this.f2538t), z(!this.f2538t), this, this.f2538t);
    }

    public final int computeScrollOffset(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return b0.b(zVar, this.f2521c, A(!this.f2538t), z(!this.f2538t), this, this.f2538t, this.f2527i);
    }

    public final int computeScrollRange(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return b0.c(zVar, this.f2521c, A(!this.f2538t), z(!this.f2538t), this, this.f2538t);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF computeScrollVectorForPosition(int i10) {
        int iW = w(i10);
        PointF pointF = new PointF();
        if (iW == 0) {
            return null;
        }
        if (this.f2523e == 0) {
            pointF.x = iW;
            pointF.y = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        } else {
            pointF.x = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            pointF.y = iW;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollExtent(RecyclerView.z zVar) {
        return computeScrollExtent(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollOffset(RecyclerView.z zVar) {
        return computeScrollOffset(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollRange(RecyclerView.z zVar) {
        return computeScrollRange(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateDefaultLayoutParams() {
        return this.f2523e == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getColumnCountForAccessibility(RecyclerView.v vVar, RecyclerView.z zVar) {
        return this.f2523e == 1 ? this.f2519a : super.getColumnCountForAccessibility(vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getRowCountForAccessibility(RecyclerView.v vVar, RecyclerView.z zVar) {
        return this.f2523e == 0 ? this.f2519a : super.getRowCountForAccessibility(vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean isAutoMeasureEnabled() {
        return this.f2532n != 0;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void offsetChildrenHorizontal(int i10) {
        super.offsetChildrenHorizontal(i10);
        for (int i11 = 0; i11 < this.f2519a; i11++) {
            d dVar = this.f2520b[i11];
            int i12 = dVar.f2567b;
            if (i12 != Integer.MIN_VALUE) {
                dVar.f2567b = i12 + i10;
            }
            int i13 = dVar.f2568c;
            if (i13 != Integer.MIN_VALUE) {
                dVar.f2568c = i13 + i10;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void offsetChildrenVertical(int i10) {
        super.offsetChildrenVertical(i10);
        for (int i11 = 0; i11 < this.f2519a; i11++) {
            d dVar = this.f2520b[i11];
            int i12 = dVar.f2567b;
            if (i12 != Integer.MIN_VALUE) {
                dVar.f2567b = i12 + i10;
            }
            int i13 = dVar.f2568c;
            if (i13 != Integer.MIN_VALUE) {
                dVar.f2568c = i13 + i10;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        removeCallbacks(this.f2540v);
        for (int i10 = 0; i10 < this.f2519a; i10++) {
            this.f2520b[i10].d();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0030  */
    /* JADX WARN: Code duplicated, block: B:30:0x003d  */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View onFocusSearchFailed(View view, int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        View viewFindContainingItemView;
        int i11;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 == 66 ? this.f2523e == 0 : !(i10 != 130 || this.f2523e != 1)) {
                            i11 = 1;
                        }
                    } else if (this.f2523e == 1) {
                        i11 = -1;
                    }
                    i11 = Integer.MIN_VALUE;
                } else if (this.f2523e == 0) {
                    i11 = -1;
                } else {
                    i11 = Integer.MIN_VALUE;
                }
            } else if (this.f2523e != 1 && isLayoutRTL()) {
                i11 = -1;
            } else {
                i11 = 1;
            }
        } else if (this.f2523e != 1 && isLayoutRTL()) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewFindContainingItemView.getLayoutParams();
        Objects.requireNonNull(cVar);
        d dVar = cVar.f2565e;
        int iE = i11 == 1 ? E() : D();
        T(iE, zVar);
        Q(i11);
        r rVar = this.f2525g;
        rVar.f2786c = rVar.f2787d + iE;
        rVar.f2785b = (int) (this.f2521c.l() * 0.33333334f);
        r rVar2 = this.f2525g;
        rVar2.f2791h = true;
        rVar2.f2784a = false;
        y(vVar, rVar2, zVar);
        this.f2533o = this.f2527i;
        View viewK = dVar.k(iE, i11);
        if (viewK != null && viewK != viewFindContainingItemView) {
            return viewK;
        }
        if (L(i11)) {
            for (int i12 = this.f2519a - 1; i12 >= 0; i12--) {
                View viewK2 = this.f2520b[i12].k(iE, i11);
                if (viewK2 != null && viewK2 != viewFindContainingItemView) {
                    return viewK2;
                }
            }
        } else {
            for (int i13 = 0; i13 < this.f2519a; i13++) {
                View viewK3 = this.f2520b[i13].k(iE, i11);
                if (viewK3 != null && viewK3 != viewFindContainingItemView) {
                    return viewK3;
                }
            }
        }
        boolean z10 = (this.f2526h ^ true) == (i11 == -1);
        View viewFindViewByPosition = findViewByPosition(z10 ? dVar.e() : dVar.f());
        if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
            return viewFindViewByPosition;
        }
        if (L(i11)) {
            for (int i14 = this.f2519a - 1; i14 >= 0; i14--) {
                if (i14 != dVar.f2570e) {
                    d[] dVarArr = this.f2520b;
                    View viewFindViewByPosition2 = findViewByPosition(z10 ? dVarArr[i14].e() : dVarArr[i14].f());
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i15 = 0; i15 < this.f2519a; i15++) {
                d[] dVarArr2 = this.f2520b;
                View viewFindViewByPosition3 = findViewByPosition(z10 ? dVarArr2[i15].e() : dVarArr2[i15].f());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewA = A(false);
            View viewZ = z(false);
            if (viewA == null || viewZ == null) {
                return;
            }
            int position = getPosition(viewA);
            int position2 = getPosition(viewZ);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.v vVar, RecyclerView.z zVar, View view, q0.c cVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, cVar);
            return;
        }
        c cVar2 = (c) layoutParams;
        if (this.f2523e == 0) {
            d dVar = cVar2.f2565e;
            i12 = dVar == null ? -1 : dVar.f2570e;
            i13 = 1;
            i10 = -1;
            i11 = -1;
        } else {
            d dVar2 = cVar2.f2565e;
            i10 = dVar2 == null ? -1 : dVar2.f2570e;
            i11 = 1;
            i12 = -1;
            i13 = -1;
        }
        cVar.f34746a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) q0.c.C0389c.a(i12, i13, i10, i11, false, false).f34765a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        H(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f2531m.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        H(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        H(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
        H(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.z zVar) {
        K(vVar, zVar, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.z zVar) {
        super.onLayoutCompleted(zVar);
        this.f2529k = -1;
        this.f2530l = Integer.MIN_VALUE;
        this.f2535q = null;
        this.f2537s.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f2535q = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable onSaveInstanceState() {
        int iM;
        int iK;
        int[] iArr;
        SavedState savedState = this.f2535q;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f2554j = this.f2526h;
        savedState2.f2555k = this.f2533o;
        savedState2.f2556l = this.f2534p;
        LazySpanLookup lazySpanLookup = this.f2531m;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f2541a) == null) {
            savedState2.f2551g = 0;
        } else {
            savedState2.f2552h = iArr;
            savedState2.f2551g = iArr.length;
            savedState2.f2553i = lazySpanLookup.f2542b;
        }
        if (getChildCount() > 0) {
            savedState2.f2547c = this.f2533o ? E() : D();
            View viewZ = this.f2527i ? z(true) : A(true);
            savedState2.f2548d = viewZ != null ? getPosition(viewZ) : -1;
            int i10 = this.f2519a;
            savedState2.f2549e = i10;
            savedState2.f2550f = new int[i10];
            for (int i11 = 0; i11 < this.f2519a; i11++) {
                if (this.f2533o) {
                    iM = this.f2520b[i11].j(Integer.MIN_VALUE);
                    if (iM != Integer.MIN_VALUE) {
                        iK = this.f2521c.g();
                        iM -= iK;
                    }
                } else {
                    iM = this.f2520b[i11].m(Integer.MIN_VALUE);
                    if (iM != Integer.MIN_VALUE) {
                        iK = this.f2521c.k();
                        iM -= iK;
                    }
                }
                savedState2.f2550f[i11] = iM;
            }
        } else {
            savedState2.f2547c = -1;
            savedState2.f2548d = -1;
            savedState2.f2549e = 0;
        }
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onScrollStateChanged(int i10) {
        if (i10 == 0) {
            x();
        }
    }

    public final void resolveShouldLayoutReverse() {
        this.f2527i = (this.f2523e == 1 || !isLayoutRTL()) ? this.f2526h : !this.f2526h;
    }

    public int scrollBy(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        M(i10, zVar);
        int iY = y(vVar, this.f2525g, zVar);
        if (this.f2525g.f2785b >= iY) {
            i10 = i10 < 0 ? -iY : iY;
        }
        this.f2521c.p(-i10);
        this.f2533o = this.f2527i;
        r rVar = this.f2525g;
        rVar.f2785b = 0;
        N(vVar, rVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollHorizontallyBy(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        return scrollBy(i10, vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void scrollToPosition(int i10) {
        SavedState savedState = this.f2535q;
        if (savedState != null && savedState.f2547c != i10) {
            savedState.f2550f = null;
            savedState.f2549e = 0;
            savedState.f2547c = -1;
            savedState.f2548d = -1;
        }
        this.f2529k = i10;
        this.f2530l = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollVerticallyBy(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        return scrollBy(i10, vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void setMeasuredDimension(Rect rect, int i10, int i11) {
        int iChooseSize;
        int iChooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f2523e == 1) {
            iChooseSize2 = RecyclerView.o.chooseSize(i11, rect.height() + paddingBottom, getMinimumHeight());
            iChooseSize = RecyclerView.o.chooseSize(i10, (this.f2524f * this.f2519a) + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.o.chooseSize(i10, rect.width() + paddingRight, getMinimumWidth());
            iChooseSize2 = RecyclerView.o.chooseSize(i11, (this.f2524f * this.f2519a) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.z zVar, int i10) {
        t tVar = new t(recyclerView.getContext());
        tVar.setTargetPosition(i10);
        startSmoothScroll(tVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean supportsPredictiveItemAnimations() {
        return this.f2535q == null;
    }

    public final int w(int i10) {
        if (getChildCount() == 0) {
            return this.f2527i ? 1 : -1;
        }
        return (i10 < D()) != this.f2527i ? -1 : 1;
    }

    public boolean x() {
        int iD;
        if (getChildCount() != 0 && this.f2532n != 0 && isAttachedToWindow()) {
            if (this.f2527i) {
                iD = E();
                D();
            } else {
                iD = D();
                E();
            }
            if (iD == 0 && I() != null) {
                this.f2531m.a();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [int] */
    /* JADX WARN: Type inference failed for: r4v19, types: [int] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    public final int y(RecyclerView.v vVar, r rVar, RecyclerView.z zVar) {
        int i10;
        int iF;
        d dVar;
        ?? r10;
        int childMeasureSpec;
        boolean z10;
        int childMeasureSpec2;
        int iM;
        int iC;
        int iK;
        int iC2;
        int i11;
        int i12;
        int i13;
        boolean z11;
        ?? r11;
        int i14;
        ?? r12;
        ?? r13;
        boolean z12 = false;
        this.f2528j.set(0, this.f2519a, true);
        if (this.f2525g.f2792i) {
            i10 = rVar.f2788e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i10 = rVar.f2788e == 1 ? rVar.f2790g + rVar.f2785b : rVar.f2789f - rVar.f2785b;
        }
        S(rVar.f2788e, i10);
        int iG = this.f2527i ? this.f2521c.g() : this.f2521c.k();
        boolean z13 = false;
        while (true) {
            int i15 = rVar.f2786c;
            int i16 = -1;
            if (!((i15 < 0 || i15 >= zVar.b()) ? z12 : true) || (!this.f2525g.f2792i && this.f2528j.isEmpty())) {
                break;
            }
            View view = vVar.k(rVar.f2786c, z12, RecyclerView.FOREVER_NS).itemView;
            rVar.f2786c += rVar.f2787d;
            c cVar = (c) view.getLayoutParams();
            int iA = cVar.a();
            int[] iArr = this.f2531m.f2541a;
            int i17 = (iArr == null || iA >= iArr.length) ? -1 : iArr[iA];
            if (i17 == -1 ? true : z12) {
                if (L(rVar.f2788e)) {
                    r11 = this.f2519a - 1;
                    i14 = -1;
                } else {
                    i16 = this.f2519a;
                    r11 = z12;
                    i14 = 1;
                }
                d dVar2 = null;
                if (rVar.f2788e == 1) {
                    int iK2 = this.f2521c.k();
                    int i18 = Integer.MAX_VALUE;
                    while (r13 != i16) {
                        d dVar3 = this.f2520b[r13];
                        int iJ = dVar3.j(iK2);
                        if (iJ < i18) {
                            r13 = r11;
                            i18 = iJ;
                            dVar2 = dVar3;
                        } else {
                            r13 = r11;
                        }
                        r13 += i14;
                    }
                    r13 = r11;
                } else {
                    int iG2 = this.f2521c.g();
                    int i19 = Integer.MIN_VALUE;
                    while (r12 != i16) {
                        d dVar4 = this.f2520b[r12];
                        int iM2 = dVar4.m(iG2);
                        if (iM2 > i19) {
                            r12 = r11;
                            dVar2 = dVar4;
                            i19 = iM2;
                        } else {
                            r12 = r11;
                        }
                        r12 += i14;
                    }
                    r12 = r11;
                }
                dVar = dVar2;
                LazySpanLookup lazySpanLookup = this.f2531m;
                lazySpanLookup.b(iA);
                lazySpanLookup.f2541a[iA] = dVar.f2570e;
            } else {
                dVar = this.f2520b[i17];
            }
            d dVar5 = dVar;
            cVar.f2565e = dVar5;
            if (rVar.f2788e == 1) {
                addView(view);
                r10 = 0;
            } else {
                r10 = 0;
                addView(view, 0);
            }
            if (this.f2523e == 1) {
                childMeasureSpec = RecyclerView.o.getChildMeasureSpec(this.f2524f, getWidthMode(), r10, ((ViewGroup.MarginLayoutParams) cVar).width, r10);
                childMeasureSpec2 = RecyclerView.o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
                z10 = false;
            } else {
                childMeasureSpec = RecyclerView.o.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
                z10 = false;
                childMeasureSpec2 = RecyclerView.o.getChildMeasureSpec(this.f2524f, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
            }
            J(view, childMeasureSpec, childMeasureSpec2, z10);
            if (rVar.f2788e == 1) {
                iC = dVar5.j(iG);
                iM = this.f2521c.c(view) + iC;
            } else {
                iM = dVar5.m(iG);
                iC = iM - this.f2521c.c(view);
            }
            int i20 = rVar.f2788e;
            d dVar6 = cVar.f2565e;
            if (i20 == 1) {
                dVar6.a(view);
            } else {
                dVar6.p(view);
            }
            if (isLayoutRTL() && this.f2523e == 1) {
                iC2 = this.f2522d.g() - (((this.f2519a - 1) - dVar5.f2570e) * this.f2524f);
                iK = iC2 - this.f2522d.c(view);
            } else {
                iK = this.f2522d.k() + (dVar5.f2570e * this.f2524f);
                iC2 = this.f2522d.c(view) + iK;
            }
            if (this.f2523e == 1) {
                i12 = iC2;
                i11 = iM;
                i13 = iK;
                iK = iC;
            } else {
                i11 = iC2;
                i12 = iM;
                i13 = iC;
            }
            layoutDecoratedWithMargins(view, i13, iK, i12, i11);
            U(dVar5, this.f2525g.f2788e, i10);
            N(vVar, this.f2525g);
            if (this.f2525g.f2791h && view.hasFocusable()) {
                z11 = false;
                this.f2528j.set(dVar5.f2570e, false);
            } else {
                z11 = false;
            }
            z12 = z11;
            z13 = true;
        }
        boolean z14 = z12;
        if (!z13) {
            N(vVar, this.f2525g);
        }
        if (this.f2525g.f2788e == -1) {
            iF = this.f2521c.k() - G(this.f2521c.k());
        } else {
            iF = F(this.f2521c.g()) - this.f2521c.g();
        }
        return iF > 0 ? Math.min(rVar.f2785b, iF) : z14 ? 1 : 0;
    }

    public View z(boolean z10) {
        int iK = this.f2521c.k();
        int iG = this.f2521c.g();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iE = this.f2521c.e(childAt);
            int iB = this.f2521c.b(childAt);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z10) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2519a = -1;
        this.f2526h = false;
        this.f2527i = false;
        this.f2529k = -1;
        this.f2530l = Integer.MIN_VALUE;
        this.f2531m = new LazySpanLookup();
        this.f2532n = 2;
        this.f2536r = new Rect();
        this.f2537s = new b();
        this.f2538t = true;
        this.f2540v = new a();
        RecyclerView.o.d properties = RecyclerView.o.getProperties(context, attributeSet, i10, i11);
        int i12 = properties.f2474a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i12 != this.f2523e) {
            this.f2523e = i12;
            y yVar = this.f2521c;
            this.f2521c = this.f2522d;
            this.f2522d = yVar;
            requestLayout();
        }
        R(properties.f2475b);
        boolean z10 = properties.f2476c;
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.f2535q;
        if (savedState != null && savedState.f2554j != z10) {
            savedState.f2554j = z10;
        }
        this.f2526h = z10;
        requestLayout();
        this.f2525g = new r();
        this.f2521c = y.a(this, this.f2523e);
        this.f2522d = y.a(this, 1 - this.f2523e);
    }
}
