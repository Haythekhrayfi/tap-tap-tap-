package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements p.g, RecyclerView.y.b {
    public static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    public final a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final b mLayoutChunkResult;
    private c mLayoutState;
    public int mOrientation;
    public y mOrientationHelper;
    public SavedState mPendingSavedState;
    public int mPendingScrollPosition;
    public int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    public boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2428e;

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
            this.f2426c = parcel.readInt();
            this.f2427d = parcel.readInt();
            this.f2428e = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f2426c = savedState.f2426c;
            this.f2427d = savedState.f2427d;
            this.f2428e = savedState.f2428e;
        }

        public boolean c() {
            return this.f2426c >= 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2426c);
            parcel.writeInt(this.f2427d);
            parcel.writeInt(this.f2428e ? 1 : 0);
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y f2429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2432d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2433e;

        public a() {
            d();
        }

        public void a() {
            this.f2431c = this.f2432d ? this.f2429a.g() : this.f2429a.k();
        }

        public void b(View view, int i10) {
            if (this.f2432d) {
                this.f2431c = this.f2429a.m() + this.f2429a.b(view);
            } else {
                this.f2431c = this.f2429a.e(view);
            }
            this.f2430b = i10;
        }

        public void c(View view, int i10) {
            int iMin;
            int iM = this.f2429a.m();
            if (iM >= 0) {
                b(view, i10);
                return;
            }
            this.f2430b = i10;
            if (this.f2432d) {
                int iG = (this.f2429a.g() - iM) - this.f2429a.b(view);
                this.f2431c = this.f2429a.g() - iG;
                if (iG <= 0) {
                    return;
                }
                int iC = this.f2431c - this.f2429a.c(view);
                int iK = this.f2429a.k();
                int iMin2 = iC - (Math.min(this.f2429a.e(view) - iK, 0) + iK);
                if (iMin2 >= 0) {
                    return;
                }
                iMin = Math.min(iG, -iMin2) + this.f2431c;
            } else {
                int iE = this.f2429a.e(view);
                int iK2 = iE - this.f2429a.k();
                this.f2431c = iE;
                if (iK2 <= 0) {
                    return;
                }
                int iG2 = (this.f2429a.g() - Math.min(0, (this.f2429a.g() - iM) - this.f2429a.b(view))) - (this.f2429a.c(view) + iE);
                if (iG2 >= 0) {
                    return;
                } else {
                    iMin = this.f2431c - Math.min(iK2, -iG2);
                }
            }
            this.f2431c = iMin;
        }

        public void d() {
            this.f2430b = -1;
            this.f2431c = Integer.MIN_VALUE;
            this.f2432d = false;
            this.f2433e = false;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("AnchorInfo{mPosition=");
            sbA.append(this.f2430b);
            sbA.append(", mCoordinate=");
            sbA.append(this.f2431c);
            sbA.append(", mLayoutFromEnd=");
            sbA.append(this.f2432d);
            sbA.append(", mValid=");
            return s.a(sbA, this.f2433e, '}');
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2436c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2437d;
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2441d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2442e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2443f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2444g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f2447j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f2449l;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2438a = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2445h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f2446i = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List<RecyclerView.c0> f2448k = null;

        public void a(View view) {
            int iA;
            int size = this.f2448k.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f2448k.get(i11).itemView;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (iA = (pVar.a() - this.f2441d) * this.f2442e) >= 0 && iA < i10) {
                    view2 = view3;
                    if (iA == 0) {
                        break;
                    } else {
                        i10 = iA;
                    }
                }
            }
            this.f2441d = view2 == null ? -1 : ((RecyclerView.p) view2.getLayoutParams()).a();
        }

        public boolean b(RecyclerView.z zVar) {
            int i10 = this.f2441d;
            return i10 >= 0 && i10 < zVar.b();
        }

        public View c(RecyclerView.v vVar) {
            List<RecyclerView.c0> list = this.f2448k;
            if (list == null) {
                View view = vVar.k(this.f2441d, false, RecyclerView.FOREVER_NS).itemView;
                this.f2441d += this.f2442e;
                return view;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view2 = this.f2448k.get(i10).itemView;
                RecyclerView.p pVar = (RecyclerView.p) view2.getLayoutParams();
                if (!pVar.c() && this.f2441d == pVar.a()) {
                    a(view2);
                    return view2;
                }
            }
            return null;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i10);
        setReverseLayout(z10);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.o.d properties = RecyclerView.o.getProperties(context, attributeSet, i10, i11);
        setOrientation(properties.f2474a);
        setReverseLayout(properties.f2476c);
        setStackFromEnd(properties.f2477d);
    }

    private int computeScrollExtent(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return b0.a(zVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return b0.b(zVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return b0.c(zVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findFirstReferenceChild(RecyclerView.v vVar, RecyclerView.z zVar) {
        return findReferenceChild(vVar, zVar, 0, getChildCount(), zVar.b());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findLastReferenceChild(RecyclerView.v vVar, RecyclerView.z zVar) {
        return findReferenceChild(vVar, zVar, getChildCount() - 1, -1, zVar.b());
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        return this.mShouldReverseLayout ? findFirstPartiallyOrCompletelyInvisibleChild() : findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        return this.mShouldReverseLayout ? findLastPartiallyOrCompletelyInvisibleChild() : findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private View findReferenceChildClosestToEnd(RecyclerView.v vVar, RecyclerView.z zVar) {
        return this.mShouldReverseLayout ? findFirstReferenceChild(vVar, zVar) : findLastReferenceChild(vVar, zVar);
    }

    private View findReferenceChildClosestToStart(RecyclerView.v vVar, RecyclerView.z zVar) {
        return this.mShouldReverseLayout ? findLastReferenceChild(vVar, zVar) : findFirstReferenceChild(vVar, zVar);
    }

    private int fixLayoutEndGap(int i10, RecyclerView.v vVar, RecyclerView.z zVar, boolean z10) {
        int iG;
        int iG2 = this.mOrientationHelper.g() - i10;
        if (iG2 <= 0) {
            return 0;
        }
        int i11 = -scrollBy(-iG2, vVar, zVar);
        int i12 = i10 + i11;
        if (!z10 || (iG = this.mOrientationHelper.g() - i12) <= 0) {
            return i11;
        }
        this.mOrientationHelper.p(iG);
        return iG + i11;
    }

    private int fixLayoutStartGap(int i10, RecyclerView.v vVar, RecyclerView.z zVar, boolean z10) {
        int iK;
        int iK2 = i10 - this.mOrientationHelper.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i11 = -scrollBy(iK2, vVar, zVar);
        int i12 = i10 + i11;
        if (!z10 || (iK = i12 - this.mOrientationHelper.k()) <= 0) {
            return i11;
        }
        this.mOrientationHelper.p(-iK);
        return i11 - iK;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(RecyclerView.v vVar, RecyclerView.z zVar, int i10, int i11) {
        if (!zVar.f2515k || getChildCount() == 0 || zVar.f2511g || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.c0> list = vVar.f2491d;
        int size = list.size();
        int position = getPosition(getChildAt(0));
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView.c0 c0Var = list.get(i14);
            if (!c0Var.isRemoved()) {
                byte b10 = (c0Var.getLayoutPosition() < position) != this.mShouldReverseLayout ? (byte) -1 : (byte) 1;
                int iC = this.mOrientationHelper.c(c0Var.itemView);
                if (b10 == -1) {
                    i12 += iC;
                } else {
                    i13 += iC;
                }
            }
        }
        this.mLayoutState.f2448k = list;
        if (i12 > 0) {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i10);
            c cVar = this.mLayoutState;
            cVar.f2445h = i12;
            cVar.f2440c = 0;
            cVar.a(null);
            fill(vVar, this.mLayoutState, zVar, false);
        }
        if (i13 > 0) {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i11);
            c cVar2 = this.mLayoutState;
            cVar2.f2445h = i13;
            cVar2.f2440c = 0;
            cVar2.a(null);
            fill(vVar, this.mLayoutState, zVar, false);
        }
        this.mLayoutState.f2448k = null;
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            StringBuilder sbA = defpackage.a.a("item ");
            sbA.append(getPosition(childAt));
            sbA.append(", coord:");
            sbA.append(this.mOrientationHelper.e(childAt));
            Log.d(TAG, sbA.toString());
        }
        Log.d(TAG, "==============");
    }

    private void recycleByLayoutState(RecyclerView.v vVar, c cVar) {
        if (!cVar.f2438a || cVar.f2449l) {
            return;
        }
        int i10 = cVar.f2444g;
        int i11 = cVar.f2446i;
        if (cVar.f2443f == -1) {
            recycleViewsFromEnd(vVar, i10, i11);
        } else {
            recycleViewsFromStart(vVar, i10, i11);
        }
    }

    private void recycleChildren(RecyclerView.v vVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                removeAndRecycleViewAt(i10, vVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                removeAndRecycleViewAt(i12, vVar);
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView.v vVar, int i10, int i11) {
        int childCount = getChildCount();
        if (i10 < 0) {
            return;
        }
        int iF = (this.mOrientationHelper.f() - i10) + i11;
        if (this.mShouldReverseLayout) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (this.mOrientationHelper.e(childAt) < iF || this.mOrientationHelper.o(childAt) < iF) {
                    recycleChildren(vVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = childCount - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View childAt2 = getChildAt(i14);
            if (this.mOrientationHelper.e(childAt2) < iF || this.mOrientationHelper.o(childAt2) < iF) {
                recycleChildren(vVar, i13, i14);
                return;
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.v vVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (this.mOrientationHelper.b(childAt) > i12 || this.mOrientationHelper.n(childAt) > i12) {
                    recycleChildren(vVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = childCount - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View childAt2 = getChildAt(i15);
            if (this.mOrientationHelper.b(childAt2) > i12 || this.mOrientationHelper.n(childAt2) > i12) {
                recycleChildren(vVar, i14, i15);
                return;
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        this.mShouldReverseLayout = (this.mOrientation == 1 || !isLayoutRTL()) ? this.mReverseLayout : !this.mReverseLayout;
    }

    private boolean updateAnchorFromChildren(RecyclerView.v vVar, RecyclerView.z zVar, a aVar) {
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null) {
            Objects.requireNonNull(aVar);
            RecyclerView.p pVar = (RecyclerView.p) focusedChild.getLayoutParams();
            if (!pVar.c() && pVar.a() >= 0 && pVar.a() < zVar.b()) {
                aVar.c(focusedChild, getPosition(focusedChild));
                return true;
            }
        }
        if (this.mLastStackFromEnd != this.mStackFromEnd) {
            return false;
        }
        View viewFindReferenceChildClosestToEnd = aVar.f2432d ? findReferenceChildClosestToEnd(vVar, zVar) : findReferenceChildClosestToStart(vVar, zVar);
        if (viewFindReferenceChildClosestToEnd == null) {
            return false;
        }
        aVar.b(viewFindReferenceChildClosestToEnd, getPosition(viewFindReferenceChildClosestToEnd));
        if (!zVar.f2511g && supportsPredictiveItemAnimations()) {
            if (this.mOrientationHelper.e(viewFindReferenceChildClosestToEnd) >= this.mOrientationHelper.g() || this.mOrientationHelper.b(viewFindReferenceChildClosestToEnd) < this.mOrientationHelper.k()) {
                aVar.f2431c = aVar.f2432d ? this.mOrientationHelper.g() : this.mOrientationHelper.k();
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.z zVar, a aVar) {
        int i10;
        if (!zVar.f2511g && (i10 = this.mPendingScrollPosition) != -1) {
            if (i10 >= 0 && i10 < zVar.b()) {
                aVar.f2430b = this.mPendingScrollPosition;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.c()) {
                    boolean z10 = this.mPendingSavedState.f2428e;
                    aVar.f2432d = z10;
                    aVar.f2431c = z10 ? this.mOrientationHelper.g() - this.mPendingSavedState.f2427d : this.mOrientationHelper.k() + this.mPendingSavedState.f2427d;
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z11 = this.mShouldReverseLayout;
                    aVar.f2432d = z11;
                    aVar.f2431c = z11 ? this.mOrientationHelper.g() - this.mPendingScrollPositionOffset : this.mOrientationHelper.k() + this.mPendingScrollPositionOffset;
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0) {
                        aVar.f2432d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    aVar.a();
                } else {
                    if (this.mOrientationHelper.c(viewFindViewByPosition) > this.mOrientationHelper.l()) {
                        aVar.a();
                        return true;
                    }
                    if (this.mOrientationHelper.e(viewFindViewByPosition) - this.mOrientationHelper.k() < 0) {
                        aVar.f2431c = this.mOrientationHelper.k();
                        aVar.f2432d = false;
                        return true;
                    }
                    if (this.mOrientationHelper.g() - this.mOrientationHelper.b(viewFindViewByPosition) < 0) {
                        aVar.f2431c = this.mOrientationHelper.g();
                        aVar.f2432d = true;
                        return true;
                    }
                    aVar.f2431c = aVar.f2432d ? this.mOrientationHelper.m() + this.mOrientationHelper.b(viewFindViewByPosition) : this.mOrientationHelper.e(viewFindViewByPosition);
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.v vVar, RecyclerView.z zVar, a aVar) {
        if (updateAnchorFromPendingData(zVar, aVar) || updateAnchorFromChildren(vVar, zVar, aVar)) {
            return;
        }
        aVar.a();
        aVar.f2430b = this.mStackFromEnd ? zVar.b() - 1 : 0;
    }

    private void updateLayoutState(int i10, int i11, boolean z10, RecyclerView.z zVar) {
        int iK;
        this.mLayoutState.f2449l = resolveIsInfinite();
        this.mLayoutState.f2443f = i10;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(zVar, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z11 = i10 == 1;
        c cVar = this.mLayoutState;
        int i12 = z11 ? iMax2 : iMax;
        cVar.f2445h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        cVar.f2446i = iMax;
        if (z11) {
            cVar.f2445h = this.mOrientationHelper.h() + i12;
            View childClosestToEnd = getChildClosestToEnd();
            c cVar2 = this.mLayoutState;
            cVar2.f2442e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            c cVar3 = this.mLayoutState;
            cVar2.f2441d = position + cVar3.f2442e;
            cVar3.f2439b = this.mOrientationHelper.b(childClosestToEnd);
            iK = this.mOrientationHelper.b(childClosestToEnd) - this.mOrientationHelper.g();
        } else {
            View childClosestToStart = getChildClosestToStart();
            c cVar4 = this.mLayoutState;
            cVar4.f2445h = this.mOrientationHelper.k() + cVar4.f2445h;
            c cVar5 = this.mLayoutState;
            cVar5.f2442e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            c cVar6 = this.mLayoutState;
            cVar5.f2441d = position2 + cVar6.f2442e;
            cVar6.f2439b = this.mOrientationHelper.e(childClosestToStart);
            iK = (-this.mOrientationHelper.e(childClosestToStart)) + this.mOrientationHelper.k();
        }
        c cVar7 = this.mLayoutState;
        cVar7.f2440c = i11;
        if (z10) {
            cVar7.f2440c = i11 - iK;
        }
        cVar7.f2444g = iK;
    }

    private void updateLayoutStateToFillEnd(int i10, int i11) {
        this.mLayoutState.f2440c = this.mOrientationHelper.g() - i11;
        c cVar = this.mLayoutState;
        cVar.f2442e = this.mShouldReverseLayout ? -1 : 1;
        cVar.f2441d = i10;
        cVar.f2443f = 1;
        cVar.f2439b = i11;
        cVar.f2444g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillEnd(a aVar) {
        updateLayoutStateToFillEnd(aVar.f2430b, aVar.f2431c);
    }

    private void updateLayoutStateToFillStart(int i10, int i11) {
        this.mLayoutState.f2440c = i11 - this.mOrientationHelper.k();
        c cVar = this.mLayoutState;
        cVar.f2441d = i10;
        cVar.f2442e = this.mShouldReverseLayout ? 1 : -1;
        cVar.f2443f = -1;
        cVar.f2439b = i11;
        cVar.f2444g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(a aVar) {
        updateLayoutStateToFillStart(aVar.f2430b, aVar.f2431c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(RecyclerView.z zVar, int[] iArr) {
        int i10;
        int extraLayoutSpace = getExtraLayoutSpace(zVar);
        if (this.mLayoutState.f2443f == -1) {
            i10 = 0;
        } else {
            i10 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void collectAdjacentPrefetchPositions(int i10, int i11, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        if (this.mOrientation != 0) {
            i10 = i11;
        }
        if (getChildCount() == 0 || i10 == 0) {
            return;
        }
        ensureLayoutState();
        updateLayoutState(i10 > 0 ? 1 : -1, Math.abs(i10), true, zVar);
        collectPrefetchPositionsForLayoutState(zVar, this.mLayoutState, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void collectInitialPrefetchPositions(int i10, RecyclerView.o.c cVar) {
        boolean z10;
        int i11;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || !savedState.c()) {
            resolveShouldLayoutReverse();
            z10 = this.mShouldReverseLayout;
            i11 = this.mPendingScrollPosition;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.mPendingSavedState;
            z10 = savedState2.f2428e;
            i11 = savedState2.f2426c;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.mInitialPrefetchItemCount && i11 >= 0 && i11 < i10; i13++) {
            ((n.b) cVar).a(i11, 0);
            i11 += i12;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.z zVar, c cVar, RecyclerView.o.c cVar2) {
        int i10 = cVar.f2441d;
        if (i10 < 0 || i10 >= zVar.b()) {
            return;
        }
        ((n.b) cVar2).a(i10, Math.max(0, cVar.f2444g));
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

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF computeScrollVectorForPosition(int i10) {
        if (getChildCount() == 0) {
            return null;
        }
        int i11 = (i10 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i11, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) : new PointF(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, i11);
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

    public int convertFocusDirectionToLayoutDirection(int i10) {
        if (i10 == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.mOrientation == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.mOrientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 != 66) {
            return (i10 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.mOrientation == 0 ? 1 : Integer.MIN_VALUE;
    }

    public c createLayoutState() {
        return new c();
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(RecyclerView.v vVar, c cVar, RecyclerView.z zVar, boolean z10) {
        int i10 = cVar.f2440c;
        int i11 = cVar.f2444g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f2444g = i11 + i10;
            }
            recycleByLayoutState(vVar, cVar);
        }
        int i12 = cVar.f2440c + cVar.f2445h;
        b bVar = this.mLayoutChunkResult;
        while (true) {
            if ((!cVar.f2449l && i12 <= 0) || !cVar.b(zVar)) {
                break;
            }
            bVar.f2434a = 0;
            bVar.f2435b = false;
            bVar.f2436c = false;
            bVar.f2437d = false;
            layoutChunk(vVar, zVar, cVar, bVar);
            if (!bVar.f2435b) {
                int i13 = cVar.f2439b;
                int i14 = bVar.f2434a;
                cVar.f2439b = (cVar.f2443f * i14) + i13;
                if (!bVar.f2436c || cVar.f2448k != null || !zVar.f2511g) {
                    cVar.f2440c -= i14;
                    i12 -= i14;
                }
                int i15 = cVar.f2444g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    cVar.f2444g = i16;
                    int i17 = cVar.f2440c;
                    if (i17 < 0) {
                        cVar.f2444g = i16 + i17;
                    }
                    recycleByLayoutState(vVar, cVar);
                }
                if (z10 && bVar.f2437d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f2440c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z10, boolean z11) {
        int childCount;
        int childCount2;
        if (this.mShouldReverseLayout) {
            childCount = 0;
            childCount2 = getChildCount();
        } else {
            childCount = getChildCount() - 1;
            childCount2 = -1;
        }
        return findOneVisibleChild(childCount, childCount2, z10, z11);
    }

    public View findFirstVisibleChildClosestToStart(boolean z10, boolean z11) {
        int childCount;
        int childCount2;
        if (this.mShouldReverseLayout) {
            childCount = getChildCount() - 1;
            childCount2 = -1;
        } else {
            childCount = 0;
            childCount2 = getChildCount();
        }
        return findOneVisibleChild(childCount, childCount2, z10, z11);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i10, int i11) {
        byte b10;
        int i12;
        int i13;
        ensureLayoutState();
        if (i11 > i10) {
            b10 = 1;
        } else {
            b10 = i11 < i10 ? (byte) -1 : (byte) 0;
        }
        if (b10 == 0) {
            return getChildAt(i10);
        }
        if (this.mOrientationHelper.e(getChildAt(i10)) < this.mOrientationHelper.k()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return (this.mOrientation == 0 ? this.mHorizontalBoundCheck : this.mVerticalBoundCheck).a(i10, i11, i12, i13);
    }

    public View findOneVisibleChild(int i10, int i11, boolean z10, boolean z11) {
        ensureLayoutState();
        return (this.mOrientation == 0 ? this.mHorizontalBoundCheck : this.mVerticalBoundCheck).a(i10, i11, z10 ? 24579 : 320, z11 ? 320 : 0);
    }

    public View findReferenceChild(RecyclerView.v vVar, RecyclerView.z zVar, int i10, int i11, int i12) {
        ensureLayoutState();
        int iK = this.mOrientationHelper.k();
        int iG = this.mOrientationHelper.g();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View childAt = getChildAt(i10);
            int position = getPosition(childAt);
            if (position >= 0 && position < i12) {
                if (((RecyclerView.p) childAt.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.e(childAt) < iG && this.mOrientationHelper.b(childAt) >= iK) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i10 += i13;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View findViewByPosition(int i10) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i10 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i10) {
                return childAt;
            }
        }
        return super.findViewByPosition(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateDefaultLayoutParams() {
        return new RecyclerView.p(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.z zVar) {
        if (zVar.f2505a != -1) {
            return this.mOrientationHelper.l();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public void layoutChunk(RecyclerView.v vVar, RecyclerView.z zVar, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int paddingLeft;
        int iD;
        View viewC = cVar.c(vVar);
        if (viewC == null) {
            bVar.f2435b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) viewC.getLayoutParams();
        if (cVar.f2448k == null) {
            if (this.mShouldReverseLayout == (cVar.f2443f == -1)) {
                addView(viewC);
            } else {
                addView(viewC, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (cVar.f2443f == -1)) {
                addDisappearingView(viewC);
            } else {
                addDisappearingView(viewC, 0);
            }
        }
        measureChildWithMargins(viewC, 0, 0);
        bVar.f2434a = this.mOrientationHelper.c(viewC);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iD = getWidth() - getPaddingRight();
                paddingLeft = iD - this.mOrientationHelper.d(viewC);
            } else {
                paddingLeft = getPaddingLeft();
                iD = this.mOrientationHelper.d(viewC) + paddingLeft;
            }
            int i13 = cVar.f2443f;
            int i14 = cVar.f2439b;
            if (i13 == -1) {
                i12 = i14;
                i11 = iD;
                i10 = i14 - bVar.f2434a;
            } else {
                i10 = i14;
                i11 = iD;
                i12 = bVar.f2434a + i14;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iD2 = this.mOrientationHelper.d(viewC) + paddingTop;
            int i15 = cVar.f2443f;
            int i16 = cVar.f2439b;
            if (i15 == -1) {
                i11 = i16;
                i10 = paddingTop;
                i12 = iD2;
                paddingLeft = i16 - bVar.f2434a;
            } else {
                i10 = paddingTop;
                i11 = bVar.f2434a + i16;
                i12 = iD2;
                paddingLeft = i16;
            }
        }
        layoutDecoratedWithMargins(viewC, paddingLeft, i10, i11, i12);
        if (pVar.c() || pVar.b()) {
            bVar.f2436c = true;
        }
        bVar.f2437d = viewC.hasFocusable();
    }

    public void onAnchorReady(RecyclerView.v vVar, RecyclerView.z zVar, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(vVar);
            vVar.b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View onFocusSearchFailed(View view, int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        int iConvertFocusDirectionToLayoutDirection;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.l() * MAX_SCROLL_FACTOR), false, zVar);
        c cVar = this.mLayoutState;
        cVar.f2444g = Integer.MIN_VALUE;
        cVar.f2438a = false;
        fill(vVar, cVar, zVar, true);
        View viewFindPartiallyOrCompletelyInvisibleChildClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? findPartiallyOrCompletelyInvisibleChildClosestToStart() : findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        View childClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? getChildClosestToStart() : getChildClosestToEnd();
        if (!childClosestToStart.hasFocusable()) {
            return viewFindPartiallyOrCompletelyInvisibleChildClosestToStart;
        }
        if (viewFindPartiallyOrCompletelyInvisibleChildClosestToStart == null) {
            return null;
        }
        return childClosestToStart;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.z zVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iFixLayoutEndGap;
        int i14;
        View viewFindViewByPosition;
        int iE;
        int iG;
        int i15 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && zVar.b() == 0) {
            removeAndRecycleAllViews(vVar);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.c()) {
            this.mPendingScrollPosition = this.mPendingSavedState.f2426c;
        }
        ensureLayoutState();
        this.mLayoutState.f2438a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        a aVar = this.mAnchorInfo;
        if (!aVar.f2433e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            aVar.d();
            a aVar2 = this.mAnchorInfo;
            aVar2.f2432d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(vVar, zVar, aVar2);
            this.mAnchorInfo.f2433e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.e(focusedChild) >= this.mOrientationHelper.g() || this.mOrientationHelper.b(focusedChild) <= this.mOrientationHelper.k())) {
            this.mAnchorInfo.c(focusedChild, getPosition(focusedChild));
        }
        c cVar = this.mLayoutState;
        cVar.f2443f = cVar.f2447j >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(zVar, iArr);
        int iK = this.mOrientationHelper.k() + Math.max(0, this.mReusableIntPair[0]);
        int iH = this.mOrientationHelper.h() + Math.max(0, this.mReusableIntPair[1]);
        if (zVar.f2511g && (i14 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i14)) != null) {
            if (this.mShouldReverseLayout) {
                iG = this.mOrientationHelper.g() - this.mOrientationHelper.b(viewFindViewByPosition);
                iE = this.mPendingScrollPositionOffset;
            } else {
                iE = this.mOrientationHelper.e(viewFindViewByPosition) - this.mOrientationHelper.k();
                iG = this.mPendingScrollPositionOffset;
            }
            int i16 = iG - iE;
            if (i16 > 0) {
                iK += i16;
            } else {
                iH -= i16;
            }
        }
        a aVar3 = this.mAnchorInfo;
        if (!aVar3.f2432d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i15 = 1;
        }
        onAnchorReady(vVar, zVar, aVar3, i15);
        detachAndScrapAttachedViews(vVar);
        this.mLayoutState.f2449l = resolveIsInfinite();
        Objects.requireNonNull(this.mLayoutState);
        this.mLayoutState.f2446i = 0;
        a aVar4 = this.mAnchorInfo;
        if (aVar4.f2432d) {
            updateLayoutStateToFillStart(aVar4);
            c cVar2 = this.mLayoutState;
            cVar2.f2445h = iK;
            fill(vVar, cVar2, zVar, false);
            c cVar3 = this.mLayoutState;
            i11 = cVar3.f2439b;
            int i17 = cVar3.f2441d;
            int i18 = cVar3.f2440c;
            if (i18 > 0) {
                iH += i18;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            c cVar4 = this.mLayoutState;
            cVar4.f2445h = iH;
            cVar4.f2441d += cVar4.f2442e;
            fill(vVar, cVar4, zVar, false);
            c cVar5 = this.mLayoutState;
            i10 = cVar5.f2439b;
            int i19 = cVar5.f2440c;
            if (i19 > 0) {
                updateLayoutStateToFillStart(i17, i11);
                c cVar6 = this.mLayoutState;
                cVar6.f2445h = i19;
                fill(vVar, cVar6, zVar, false);
                i11 = this.mLayoutState.f2439b;
            }
        } else {
            updateLayoutStateToFillEnd(aVar4);
            c cVar7 = this.mLayoutState;
            cVar7.f2445h = iH;
            fill(vVar, cVar7, zVar, false);
            c cVar8 = this.mLayoutState;
            i10 = cVar8.f2439b;
            int i20 = cVar8.f2441d;
            int i21 = cVar8.f2440c;
            if (i21 > 0) {
                iK += i21;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            c cVar9 = this.mLayoutState;
            cVar9.f2445h = iK;
            cVar9.f2441d += cVar9.f2442e;
            fill(vVar, cVar9, zVar, false);
            c cVar10 = this.mLayoutState;
            int i22 = cVar10.f2439b;
            int i23 = cVar10.f2440c;
            if (i23 > 0) {
                updateLayoutStateToFillEnd(i20, i10);
                c cVar11 = this.mLayoutState;
                cVar11.f2445h = i23;
                fill(vVar, cVar11, zVar, false);
                i10 = this.mLayoutState.f2439b;
            }
            i11 = i22;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iFixLayoutEndGap2 = fixLayoutEndGap(i10, vVar, zVar, true);
                i12 = i11 + iFixLayoutEndGap2;
                i13 = i10 + iFixLayoutEndGap2;
                iFixLayoutEndGap = fixLayoutStartGap(i12, vVar, zVar, false);
            } else {
                int iFixLayoutStartGap = fixLayoutStartGap(i11, vVar, zVar, true);
                i12 = i11 + iFixLayoutStartGap;
                i13 = i10 + iFixLayoutStartGap;
                iFixLayoutEndGap = fixLayoutEndGap(i13, vVar, zVar, false);
            }
            i11 = i12 + iFixLayoutEndGap;
            i10 = i13 + iFixLayoutEndGap;
        }
        layoutForPredictiveAnimations(vVar, zVar, i11, i10);
        if (zVar.f2511g) {
            this.mAnchorInfo.d();
        } else {
            y yVar = this.mOrientationHelper;
            yVar.f2795b = yVar.l();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.z zVar) {
        super.onLayoutCompleted(zVar);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z10 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState2.f2428e = z10;
            if (z10) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState2.f2427d = this.mOrientationHelper.g() - this.mOrientationHelper.b(childClosestToEnd);
                savedState2.f2426c = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                savedState2.f2426c = getPosition(childClosestToStart);
                savedState2.f2427d = this.mOrientationHelper.e(childClosestToStart) - this.mOrientationHelper.k();
            }
        } else {
            savedState2.f2426c = -1;
        }
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.p.g
    public void prepareForDrop(View view, View view2, int i10, int i11) {
        int iE;
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b10 = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            if (b10 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - (this.mOrientationHelper.c(view) + this.mOrientationHelper.e(view2)));
                return;
            }
            iE = this.mOrientationHelper.g() - this.mOrientationHelper.b(view2);
        } else {
            if (b10 != -1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.b(view2) - this.mOrientationHelper.c(view));
                return;
            }
            iE = this.mOrientationHelper.e(view2);
        }
        scrollToPositionWithOffset(position2, iE);
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.i() == 0 && this.mOrientationHelper.f() == 0;
    }

    public int scrollBy(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f2438a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        updateLayoutState(i11, iAbs, true, zVar);
        c cVar = this.mLayoutState;
        int iFill = fill(vVar, cVar, zVar, false) + cVar.f2444g;
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i10 = i11 * iFill;
        }
        this.mOrientationHelper.p(-i10);
        this.mLayoutState.f2447j = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollHorizontallyBy(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i10, vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void scrollToPosition(int i10) {
        this.mPendingScrollPosition = i10;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f2426c = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i10, int i11) {
        this.mPendingScrollPosition = i10;
        this.mPendingScrollPositionOffset = i11;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f2426c = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollVerticallyBy(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i10, vVar, zVar);
    }

    public void setInitialPrefetchItemCount(int i10) {
        this.mInitialPrefetchItemCount = i10;
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("invalid orientation:", i10));
        }
        assertNotInLayoutOrScroll(null);
        if (i10 != this.mOrientation || this.mOrientationHelper == null) {
            y yVarA = y.a(this, i10);
            this.mOrientationHelper = yVarA;
            this.mAnchorInfo.f2429a = yVarA;
            this.mOrientation = i10;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z10) {
        this.mRecycleChildrenOnDetach = z10;
    }

    public void setReverseLayout(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (z10 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z10;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z10) {
        this.mSmoothScrollbarEnabled = z10;
    }

    public void setStackFromEnd(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z10) {
            return;
        }
        this.mStackFromEnd = z10;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.z zVar, int i10) {
        t tVar = new t(recyclerView.getContext());
        tVar.setTargetPosition(i10);
        startSmoothScroll(tVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        StringBuilder sbA = defpackage.a.a("validating child count ");
        sbA.append(getChildCount());
        Log.d(TAG, sbA.toString());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iE = this.mOrientationHelper.e(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i10 = 1; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                int position2 = getPosition(childAt);
                int iE2 = this.mOrientationHelper.e(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sbA2 = defpackage.a.a("detected invalid position. loc invalid? ");
                    sbA2.append(iE2 < iE);
                    throw new RuntimeException(sbA2.toString());
                }
                if (iE2 > iE) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i11 = 1; i11 < getChildCount(); i11++) {
            View childAt2 = getChildAt(i11);
            int position3 = getPosition(childAt2);
            int iE3 = this.mOrientationHelper.e(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sbA3 = defpackage.a.a("detected invalid position. loc invalid? ");
                sbA3.append(iE3 < iE);
                throw new RuntimeException(sbA3.toString());
            }
            if (iE3 < iE) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }
}
