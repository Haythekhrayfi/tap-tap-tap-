package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.appcompat.widget.r0;
import androidx.customview.view.AbsSavedState;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.g0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements p0.p {
    public static final boolean DEBUG = false;
    public static final int DEFAULT_ORIENTATION = 1;
    public static final boolean DISPATCH_TEMP_DETACH = false;
    public static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    public static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    public static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    public static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    public static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    public static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    public static final Interpolator sQuinticInterpolator;
    public androidx.recyclerview.widget.a0 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    public g mAdapter;
    public androidx.recyclerview.widget.a mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private j mChildDrawingOrderCallback;
    public androidx.recyclerview.widget.e mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private k mEdgeEffectFactory;
    public boolean mEnableFastScroller;
    public boolean mFirstLayoutComplete;
    public androidx.recyclerview.widget.n mGapWorker;
    public boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private s mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public l mItemAnimator;
    private l.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    public final ArrayList<n> mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    public o mLayout;
    private int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final x mObserver;
    private List<q> mOnChildAttachStateListeners;
    private r mOnFlingListener;
    private final ArrayList<s> mOnItemTouchListeners;
    public final List<c0> mPendingAccessibilityImportanceChange;
    private SavedState mPendingSavedState;
    public boolean mPostedAnimatorRunner;
    public androidx.recyclerview.widget.n.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    public final v mRecycler;
    public w mRecyclerListener;
    public final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private t mScrollListener;
    private List<t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private p0.q mScrollingChildHelper;
    public final z mState;
    public final Rect mTempRect;
    private final Rect mTempRect2;
    public final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    public final b0 mViewFlinger;
    private final f0.b mViewInfoProcessCallback;
    public final f0 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    public static final boolean POST_UPDATES_ON_ANIMATION = true;
    public static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Parcelable f2450c;

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
            this.f2450c = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f2450c, 0);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    public static abstract class a0 {
        public abstract View a(v vVar, int i10, int i11);
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = RecyclerView.this.mItemAnimator;
            if (lVar != null) {
                lVar.n();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    public class b0 implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public OverScroller f2455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Interpolator f2456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f2457g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f2458h;

        public b0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f2456f = interpolator;
            this.f2457g = false;
            this.f2458h = false;
            this.f2455e = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public void a() {
            if (this.f2457g) {
                this.f2458h = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
            p0.e0.d.m(recyclerView, this);
        }

        public void b(int i10, int i11, int i12, Interpolator interpolator) {
            int iRound;
            if (i12 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i10);
                int iAbs2 = Math.abs(i11);
                boolean z10 = iAbs > iAbs2;
                int iSqrt = (int) Math.sqrt(0);
                int iSqrt2 = (int) Math.sqrt((i11 * i11) + (i10 * i10));
                RecyclerView recyclerView = RecyclerView.this;
                int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
                int i13 = width / 2;
                float f10 = width;
                float f11 = i13;
                float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
                if (iSqrt > 0) {
                    iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
                } else {
                    if (!z10) {
                        iAbs = iAbs2;
                    }
                    iRound = (int) (((iAbs / f10) + 1.0f) * 300.0f);
                }
                i12 = Math.min(iRound, 2000);
            }
            int i14 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f2456f != interpolator) {
                this.f2456f = interpolator;
                this.f2455e = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f2454d = 0;
            this.f2453c = 0;
            RecyclerView.this.setScrollState(2);
            this.f2455e.startScroll(0, 0, i10, i11, i14);
            a();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            int i12;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                stop();
                return;
            }
            this.f2458h = false;
            this.f2457g = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f2455e;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i13 = currX - this.f2453c;
                int i14 = currY - this.f2454d;
                this.f2453c = currX;
                this.f2454d = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i13, i14, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i13 -= iArr2[0];
                    i14 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i13, i14);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i13, i14, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i11 = iArr4[0];
                    i10 = iArr4[1];
                    i13 -= i11;
                    i14 -= i10;
                    y yVar = recyclerView4.mLayout.mSmoothScroller;
                    if (yVar != null && !yVar.isPendingInitialRun() && yVar.isRunning()) {
                        int iB = RecyclerView.this.mState.b();
                        if (iB == 0) {
                            yVar.stop();
                        } else {
                            if (yVar.getTargetPosition() >= iB) {
                                yVar.setTargetPosition(iB - 1);
                            }
                            yVar.onAnimation(i11, i10);
                        }
                    }
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i11, i10, i13, i14, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i15 = i13 - iArr6[0];
                int i16 = i14 - iArr6[1];
                if (i11 != 0 || i10 != 0) {
                    recyclerView6.dispatchOnScrolled(i11, i10);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i15 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i16 != 0));
                y yVar2 = RecyclerView.this.mLayout.mSmoothScroller;
                if ((yVar2 != null && yVar2.isPendingInitialRun()) || !z10) {
                    a();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.n nVar = recyclerView7.mGapWorker;
                    if (nVar != null) {
                        nVar.a(recyclerView7, i11, i10);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i15 < 0) {
                            i12 = -currVelocity;
                        } else {
                            i12 = i15 > 0 ? currVelocity : 0;
                        }
                        if (i16 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i16 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i12, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        androidx.recyclerview.widget.n.b bVar = RecyclerView.this.mPrefetchRegistry;
                        int[] iArr7 = bVar.f2724c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.f2725d = 0;
                    }
                }
            }
            y yVar3 = RecyclerView.this.mLayout.mSmoothScroller;
            if (yVar3 != null && yVar3.isPendingInitialRun()) {
                yVar3.onAnimation(0, 0);
            }
            this.f2457g = false;
            if (!this.f2458h) {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            } else {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView8 = RecyclerView.this;
                WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
                p0.e0.d.m(recyclerView8, this);
            }
        }

        public void stop() {
            RecyclerView.this.removeCallbacks(this);
            this.f2455e.abortAnimation();
        }
    }

    public static class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public static abstract class c0 {
        public static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        public static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        public static final int FLAG_BOUND = 1;
        public static final int FLAG_IGNORE = 128;
        public static final int FLAG_INVALID = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_NOT_RECYCLABLE = 16;
        public static final int FLAG_REMOVED = 8;
        public static final int FLAG_RETURNED_FROM_SCRAP = 32;
        public static final int FLAG_TMP_DETACHED = 256;
        public static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        public static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        public int mFlags;
        public WeakReference<RecyclerView> mNestedRecyclerView;
        public RecyclerView mOwnerRecyclerView;
        public int mPosition = -1;
        public int mOldPosition = -1;
        public long mItemId = -1;
        public int mItemViewType = -1;
        public int mPreLayoutPosition = -1;
        public c0 mShadowedHolder = null;
        public c0 mShadowingHolder = null;
        public List<Object> mPayloads = null;
        public List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        public v mScrapContainer = null;
        public boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        public int mPendingAccessibilityState = -1;

        public c0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
                if (p0.e0.d.i(view)) {
                    return true;
                }
            }
            return false;
        }

        public void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
            addFlags(8);
            offsetPosition(i11, z10);
            this.mPosition = i10;
        }

        public final int getAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i10) {
            return (i10 & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
                if (!p0.e0.d.i(view)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i10, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((p) this.itemView.getLayoutParams()).f2480c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int iC = this.mPendingAccessibilityState;
            if (iC == -1) {
                View view = this.itemView;
                WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
                iC = p0.e0.d.c(view);
            }
            this.mWasImportantForAccessibilityBeforeHidden = iC;
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
        }

        public final void setIsRecyclable(boolean z10) {
            int i10;
            int i11 = this.mIsRecyclableCount;
            int i12 = z10 ? i11 - 1 : i11 + 1;
            this.mIsRecyclableCount = i12;
            if (i12 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z10 && i12 == 1) {
                i10 = this.mFlags | 16;
            } else if (!z10 || i12 != 0) {
                return;
            } else {
                i10 = this.mFlags & (-17);
            }
            this.mFlags = i10;
        }

        public void setScrapContainer(v vVar, boolean z10) {
            this.mScrapContainer = vVar;
            this.mInChangeScrap = z10;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sbA = android.support.v4.media.c.a(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbA.append(Integer.toHexString(hashCode()));
            sbA.append(" position=");
            sbA.append(this.mPosition);
            sbA.append(" id=");
            sbA.append(this.mItemId);
            sbA.append(", oldPos=");
            sbA.append(this.mOldPosition);
            sbA.append(", pLpos:");
            sbA.append(this.mPreLayoutPosition);
            StringBuilder sb2 = new StringBuilder(sbA.toString());
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                StringBuilder sbA2 = defpackage.a.a(" not recyclable(");
                sbA2.append(this.mIsRecyclableCount);
                sbA2.append(")");
                sb2.append(sbA2.toString());
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public void unScrap() {
            this.mScrapContainer.l(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    public class d implements f0.b {
        public d() {
        }
    }

    public class e implements androidx.recyclerview.widget.e.b {
        public e() {
        }

        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        public int b() {
            return RecyclerView.this.getChildCount();
        }

        public void c(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }
    }

    public class f implements androidx.recyclerview.widget.a.InterfaceC0040a {
        public f() {
        }

        public void a(androidx.recyclerview.widget.a.b bVar) {
            int i10 = bVar.f2578a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.onItemsAdded(recyclerView, bVar.f2579b, bVar.f2581d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.onItemsRemoved(recyclerView2, bVar.f2579b, bVar.f2581d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.onItemsUpdated(recyclerView3, bVar.f2579b, bVar.f2581d, bVar.f2580c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.onItemsMoved(recyclerView4, bVar.f2579b, bVar.f2581d, 1);
            }
        }

        public c0 b(int i10) {
            c0 c0VarFindViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i10, true);
            if (c0VarFindViewHolderForPosition == null || RecyclerView.this.mChildHelper.k(c0VarFindViewHolderForPosition.itemView)) {
                return null;
            }
            return c0VarFindViewHolderForPosition;
        }

        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.viewRangeUpdate(i10, i11, obj);
            RecyclerView.this.mItemsChanged = true;
        }
    }

    public static abstract class g<VH extends c0> {
        private final h mObservable = new h();
        private boolean mHasStableIds = false;

        public final void bindViewHolder(VH vh, int i10) {
            vh.mPosition = i10;
            if (hasStableIds()) {
                vh.mItemId = getItemId(i10);
            }
            vh.setFlags(1, 519);
            int i11 = l0.j.f32096a;
            l0.j.a.a(RecyclerView.TRACE_BIND_VIEW_TAG);
            onBindViewHolder(vh, i10, vh.getUnmodifiedPayloads());
            vh.clearPayload();
            ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f2480c = true;
            }
            l0.j.a.b();
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i10) {
            try {
                int i11 = l0.j.f32096a;
                l0.j.a.a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH vh = (VH) onCreateViewHolder(viewGroup, i10);
                if (vh.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.mItemViewType = i10;
                l0.j.a.b();
                return vh;
            } catch (Throwable th) {
                int i12 = l0.j.f32096a;
                l0.j.a.b();
                throw th;
            }
        }

        public abstract int getItemCount();

        public long getItemId(int i10) {
            return -1L;
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i10) {
            this.mObservable.d(i10, 1, null);
        }

        public final void notifyItemChanged(int i10, Object obj) {
            this.mObservable.d(i10, 1, obj);
        }

        public final void notifyItemInserted(int i10) {
            this.mObservable.e(i10, 1);
        }

        public final void notifyItemMoved(int i10, int i11) {
            this.mObservable.c(i10, i11);
        }

        public final void notifyItemRangeChanged(int i10, int i11) {
            this.mObservable.d(i10, i11, null);
        }

        public final void notifyItemRangeChanged(int i10, int i11, Object obj) {
            this.mObservable.d(i10, i11, obj);
        }

        public final void notifyItemRangeInserted(int i10, int i11) {
            this.mObservable.e(i10, i11);
        }

        public final void notifyItemRangeRemoved(int i10, int i11) {
            this.mObservable.f(i10, i11);
        }

        public final void notifyItemRemoved(int i10) {
            this.mObservable.f(i10, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i10);

        public void onBindViewHolder(VH vh, int i10, List<Object> list) {
            onBindViewHolder(vh, i10);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i10);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(i iVar) {
            this.mObservable.registerObserver(iVar);
        }

        public void setHasStableIds(boolean z10) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z10;
        }

        public void unregisterAdapterDataObserver(i iVar) {
            this.mObservable.unregisterObserver(iVar);
        }
    }

    public static class h extends Observable<i> {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i10, i11, 1);
            }
        }

        public void d(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i10, i11, obj);
            }
        }

        public void e(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i10, i11);
            }
        }

        public void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i10, i11);
            }
        }
    }

    public static abstract class i {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i10, int i11) {
        }

        public void onItemRangeChanged(int i10, int i11, Object obj) {
            onItemRangeChanged(i10, i11);
        }

        public void onItemRangeInserted(int i10, int i11) {
        }

        public void onItemRangeMoved(int i10, int i11, int i12) {
        }

        public void onItemRangeRemoved(int i10, int i11) {
        }
    }

    public interface j {
        int a(int i10, int i11);
    }

    public static class k {
        public EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f2463a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<a> f2464b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f2465c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f2466d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f2467e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f2468f = 250;

        public interface a {
            void a();
        }

        public interface b {
        }

        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f2469a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f2470b;
        }

        public static int e(c0 c0Var) {
            int i10 = c0Var.mFlags & 14;
            if (c0Var.isInvalid()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i10;
            }
            int oldPosition = c0Var.getOldPosition();
            int adapterPosition = c0Var.getAdapterPosition();
            return (oldPosition == -1 || adapterPosition == -1 || oldPosition == adapterPosition) ? i10 : i10 | 2048;
        }

        public abstract boolean a(c0 c0Var, c cVar, c cVar2);

        public abstract boolean b(c0 c0Var, c0 c0Var2, c cVar, c cVar2);

        public abstract boolean c(c0 c0Var, c cVar, c cVar2);

        public abstract boolean d(c0 c0Var, c cVar, c cVar2);

        public boolean f(c0 c0Var) {
            return true;
        }

        public boolean g(c0 c0Var, List<Object> list) {
            return f(c0Var);
        }

        public final void h(c0 c0Var) {
            b bVar = this.f2463a;
            if (bVar != null) {
                m mVar = (m) bVar;
                Objects.requireNonNull(mVar);
                c0Var.setIsRecyclable(true);
                if (c0Var.mShadowedHolder != null && c0Var.mShadowingHolder == null) {
                    c0Var.mShadowedHolder = null;
                }
                c0Var.mShadowingHolder = null;
                if (c0Var.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(c0Var.itemView) || !c0Var.isTmpDetached()) {
                    return;
                }
                RecyclerView.this.removeDetachedView(c0Var.itemView, false);
            }
        }

        public final void i() {
            int size = this.f2464b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f2464b.get(i10).a();
            }
            this.f2464b.clear();
        }

        public abstract void j(c0 c0Var);

        public abstract void k();

        public abstract boolean l();

        public c m(c0 c0Var) {
            c cVar = new c();
            View view = c0Var.itemView;
            cVar.f2469a = view.getLeft();
            cVar.f2470b = view.getTop();
            view.getRight();
            view.getBottom();
            return cVar;
        }

        public abstract void n();
    }

    public class m implements l.b {
        public m() {
        }
    }

    public static abstract class n {
        @Deprecated
        public void getItemOffsets(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, z zVar) {
            getItemOffsets(rect, ((p) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, z zVar) {
            onDraw(canvas, recyclerView);
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, z zVar) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public static abstract class o {
        public boolean mAutoMeasure;
        public androidx.recyclerview.widget.e mChildHelper;
        private int mHeight;
        private int mHeightMode;
        public e0 mHorizontalBoundCheck;
        private final e0.b mHorizontalBoundCheckCallback;
        public boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        public int mPrefetchMaxCountObserved;
        public boolean mPrefetchMaxObservedInInitialPrefetch;
        public RecyclerView mRecyclerView;
        public boolean mRequestedSimpleAnimations;
        public y mSmoothScroller;
        public e0 mVerticalBoundCheck;
        private final e0.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        public class a implements e0.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.e0.b
            public int a(View view) {
                return o.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.e0.b
            public int b() {
                return o.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.e0.b
            public int c() {
                return o.this.getWidth() - o.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.e0.b
            public View d(int i10) {
                return o.this.getChildAt(i10);
            }

            @Override // androidx.recyclerview.widget.e0.b
            public int e(View view) {
                return o.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        public class b implements e0.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.e0.b
            public int a(View view) {
                return o.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.e0.b
            public int b() {
                return o.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.e0.b
            public int c() {
                return o.this.getHeight() - o.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.e0.b
            public View d(int i10) {
                return o.this.getChildAt(i10);
            }

            @Override // androidx.recyclerview.widget.e0.b
            public int e(View view) {
                return o.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
        }

        public static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f2474a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f2475b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f2476c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f2477d;
        }

        public o() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new e0(aVar);
            this.mVerticalBoundCheck = new e0(bVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(View view, int i10, boolean z10) {
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z10 || childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.a(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.f(childViewHolderInt);
            }
            p pVar = (p) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.b(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int iJ = this.mChildHelper.j(view);
                if (i10 == -1) {
                    i10 = this.mChildHelper.e();
                }
                if (iJ == -1) {
                    StringBuilder sbA = defpackage.a.a("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sbA.append(this.mRecyclerView.indexOfChild(view));
                    throw new IllegalStateException(androidx.recyclerview.widget.d.a(this.mRecyclerView, sbA));
                }
                if (iJ != i10) {
                    this.mRecyclerView.mLayout.moveView(iJ, i10);
                }
            } else {
                this.mChildHelper.a(view, i10, false);
                pVar.f2480c = true;
                y yVar = this.mSmoothScroller;
                if (yVar != null && yVar.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (pVar.f2481d) {
                childViewHolderInt.itemView.invalidate();
                pVar.f2481d = false;
            }
        }

        public static int chooseSize(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i11, i12) : size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        private void detachViewInternal(int i10, View view) {
            this.mChildHelper.c(i10);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001c  */
        /* JADX WARN: Code duplicated, block: B:14:0x0020  */
        /* JADX WARN: Code duplicated, block: B:21:0x002f  */
        public static int getChildMeasureSpec(int i10, int i11, int i12, int i13, boolean z10) {
            int iMax = Math.max(0, i10 - i12);
            if (z10) {
                if (i13 >= 0) {
                    i11 = 1073741824;
                } else if (i13 != -1 || (i11 != Integer.MIN_VALUE && (i11 == 0 || i11 != 1073741824))) {
                    i11 = 0;
                    i13 = 0;
                } else {
                    i13 = iMax;
                }
            } else if (i13 >= 0) {
                i11 = 1073741824;
            } else if (i13 == -1) {
                i13 = iMax;
            } else if (i13 != -2) {
                i11 = 0;
                i13 = 0;
            } else if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
                i13 = iMax;
                i11 = Integer.MIN_VALUE;
            } else {
                i13 = iMax;
                i11 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i13, i11);
        }

        /* JADX WARN: Code duplicated, block: B:6:0x000d  */
        /* JADX WARN: Code duplicated, block: B:8:0x0011 A[PHI: r3
  0x0011: PHI (r3v3 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x000f, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        @Deprecated
        public static int getChildMeasureSpec(int i10, int i11, int i12, boolean z10) {
            int i13 = i10 - i11;
            int i14 = 0;
            int iMax = Math.max(0, i13);
            if (z10) {
                if (i12 >= 0) {
                    i14 = 1073741824;
                } else {
                    i12 = 0;
                }
            } else if (i12 >= 0) {
                i14 = 1073741824;
            } else if (i12 == -1) {
                i12 = iMax;
                i14 = 1073741824;
            } else if (i12 == -2) {
                i14 = Integer.MIN_VALUE;
                i12 = iMax;
            } else {
                i12 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i12, i14);
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - paddingLeft;
            int iMin = Math.min(0, i10);
            int i11 = top - paddingTop;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - width;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - height);
            if (getLayoutDirection() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i12);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            iArr[0] = iMax;
            iArr[1] = iMin2;
            return iArr;
        }

        public static d getProperties(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i1.a.f31184a, i10, i11);
            dVar.f2474a = typedArrayObtainStyledAttributes.getInt(0, 1);
            dVar.f2475b = typedArrayObtainStyledAttributes.getInt(10, 1);
            dVar.f2476c = typedArrayObtainStyledAttributes.getBoolean(9, false);
            dVar.f2477d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i10 < width && rect.right - i10 > paddingLeft && rect.top - i11 < height && rect.bottom - i11 > paddingTop;
        }

        private static boolean isMeasurementUpToDate(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        private void scrapOrRecycleView(v vVar, int i10, View view) {
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i10);
                vVar.i(childViewHolderInt);
            } else {
                detachViewAt(i10);
                vVar.j(view);
                this.mRecyclerView.mViewInfoStore.f(childViewHolderInt);
            }
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addDisappearingView(View view, int i10) {
            addViewInt(view, i10, true);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void addView(View view, int i10) {
            addViewInt(view, i10, false);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(View view) {
            attachView(view, -1);
        }

        public void attachView(View view, int i10) {
            attachView(view, i10, (p) view.getLayoutParams());
        }

        public void attachView(View view, int i10, p pVar) {
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.a(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.f(childViewHolderInt);
            }
            this.mChildHelper.b(view, i10, pVar, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(p pVar) {
            return pVar != null;
        }

        public void collectAdjacentPrefetchPositions(int i10, int i11, z zVar, c cVar) {
        }

        public void collectInitialPrefetchPositions(int i10, c cVar) {
        }

        public int computeHorizontalScrollExtent(z zVar) {
            return 0;
        }

        public int computeHorizontalScrollOffset(z zVar) {
            return 0;
        }

        public int computeHorizontalScrollRange(z zVar) {
            return 0;
        }

        public int computeVerticalScrollExtent(z zVar) {
            return 0;
        }

        public int computeVerticalScrollOffset(z zVar) {
            return 0;
        }

        public int computeVerticalScrollRange(z zVar) {
            return 0;
        }

        public void detachAndScrapAttachedViews(v vVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(vVar, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(View view, v vVar) {
            scrapOrRecycleView(vVar, this.mChildHelper.j(view), view);
        }

        public void detachAndScrapViewAt(int i10, v vVar) {
            scrapOrRecycleView(vVar, i10, getChildAt(i10));
        }

        public void detachView(View view) {
            int iJ = this.mChildHelper.j(view);
            if (iJ >= 0) {
                detachViewInternal(iJ, view);
            }
        }

        public void detachViewAt(int i10) {
            detachViewInternal(i10, getChildAt(i10));
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, v vVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, vVar);
        }

        public void endAnimation(View view) {
            l lVar = this.mRecyclerView.mItemAnimator;
            if (lVar != null) {
                lVar.j(RecyclerView.getChildViewHolderInt(view));
            }
        }

        public View findContainingItemView(View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.f2598c.contains(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        public View findViewByPosition(int i10) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i10 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.f2511g || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract p generateDefaultLayoutParams();

        public p generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof p) {
                return new p((p) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(View view) {
            return ((p) view.getLayoutParams()).f2479b.bottom;
        }

        public View getChildAt(int i10) {
            androidx.recyclerview.widget.e eVar = this.mChildHelper;
            if (eVar == null) {
                return null;
            }
            return ((e) eVar.f2596a).a(eVar.f(i10));
        }

        public int getChildCount() {
            androidx.recyclerview.widget.e eVar = this.mChildHelper;
            if (eVar != null) {
                return eVar.e();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(v vVar, z zVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.mAdapter == null || !canScrollHorizontally()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public int getDecoratedBottom(View view) {
            return getBottomDecorationHeight(view) + view.getBottom();
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((p) view.getLayoutParams()).f2479b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((p) view.getLayoutParams()).f2479b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view) {
            return getRightDecorationWidth(view) + view.getRight();
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.f2598c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
            return p0.e0.e.d(recyclerView);
        }

        public int getLeftDecorationWidth(View view) {
            return ((p) view.getLayoutParams()).f2479b.left;
        }

        public int getMinimumHeight() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
            return p0.e0.d.d(recyclerView);
        }

        public int getMinimumWidth() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
            return p0.e0.d.e(recyclerView);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
            return p0.e0.e.e(recyclerView);
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
            return p0.e0.e.f(recyclerView);
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        public int getRightDecorationWidth(View view) {
            return ((p) view.getLayoutParams()).f2479b.right;
        }

        public int getRowCountForAccessibility(v vVar, z zVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.mAdapter == null || !canScrollVertically()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public int getSelectionModeForAccessibility(v vVar, z zVar) {
            return 0;
        }

        public int getTopDecorationHeight(View view) {
            return ((p) view.getLayoutParams()).f2479b.top;
        }

        public void getTransformedBoundingBox(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((p) view.getLayoutParams()).f2479b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException(androidx.recyclerview.widget.d.a(this.mRecyclerView, defpackage.a.a("View should be fully attached to be ignored")));
            }
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.g(childViewHolderInt);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(v vVar, z zVar) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            y yVar = this.mSmoothScroller;
            return yVar != null && yVar.isRunning();
        }

        public boolean isViewPartiallyVisible(View view, boolean z10, boolean z11) {
            boolean z12 = this.mHorizontalBoundCheck.b(view, 24579) && this.mVerticalBoundCheck.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public void layoutDecorated(View view, int i10, int i11, int i12, int i13) {
            Rect rect = ((p) view.getLayoutParams()).f2479b;
            view.layout(i10 + rect.left, i11 + rect.top, i12 - rect.right, i13 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view, int i10, int i11, int i12, int i13) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f2479b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public void measureChild(View view, int i10, int i11) {
            p pVar = (p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i12 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i10;
            int i13 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i11;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i12, ((ViewGroup.MarginLayoutParams) pVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i13, ((ViewGroup.MarginLayoutParams) pVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, pVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(View view, int i10, int i11) {
            p pVar = (p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i12 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i10;
            int i13 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i11;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) pVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) pVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, pVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i10, int i11) {
            View childAt = getChildAt(i10);
            if (childAt != null) {
                detachViewAt(i10);
                attachView(childAt, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(int i10) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i10);
            }
        }

        public void offsetChildrenVertical(int i10) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i10);
            }
        }

        public void onAdapterChanged(g gVar, g gVar2) {
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, v vVar) {
            onDetachedFromWindow(recyclerView);
        }

        public View onFocusSearchFailed(View view, int i10, v vVar, z zVar) {
            return null;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityEvent(v vVar, z zVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            g gVar = this.mRecyclerView.mAdapter;
            if (gVar != null) {
                accessibilityEvent.setItemCount(gVar.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(v vVar, z zVar, q0.c cVar) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                cVar.f34746a.addAction(8192);
                cVar.f34746a.setScrollable(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                cVar.f34746a.addAction(4096);
                cVar.f34746a.setScrollable(true);
            }
            cVar.m(q0.c.b.a(getRowCountForAccessibility(vVar, zVar), getColumnCountForAccessibility(vVar, zVar), isLayoutHierarchical(vVar, zVar), getSelectionModeForAccessibility(vVar, zVar)));
        }

        public void onInitializeAccessibilityNodeInfo(q0.c cVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, cVar);
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, q0.c cVar) {
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.k(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, cVar);
        }

        public void onInitializeAccessibilityNodeInfoForItem(v vVar, z zVar, View view, q0.c cVar) {
            cVar.n(q0.c.C0389c.a(canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false, false));
        }

        public View onInterceptFocusSearch(View view, int i10) {
            return null;
        }

        public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
            onItemsUpdated(recyclerView, i10, i11);
        }

        public void onLayoutChildren(v vVar, z zVar) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onLayoutCompleted(z zVar) {
        }

        public void onMeasure(v vVar, z zVar, int i10, int i11) {
            this.mRecyclerView.defaultOnMeasure(i10, i11);
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, z zVar, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i10) {
        }

        public void onSmoothScrollerStopped(y yVar) {
            if (this.mSmoothScroller == yVar) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i10, bundle);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0071 A[PHI: r8
  0x0071: PHI (r8v8 int) = (r8v4 int), (r8v12 int) binds: [B:22:0x005e, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean performAccessibilityAction(v vVar, z zVar, int i10, Bundle bundle) {
            int height;
            int width;
            int i11;
            int i12;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return false;
            }
            if (i10 == 4096) {
                height = recyclerView.canScrollVertically(1) ? (getHeight() - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    i11 = height;
                    i12 = width;
                } else {
                    i11 = height;
                    i12 = 0;
                }
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                height = recyclerView.canScrollVertically(-1) ? -((getHeight() - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    width = -((getWidth() - getPaddingLeft()) - getPaddingRight());
                    i11 = height;
                    i12 = width;
                } else {
                    i11 = height;
                    i12 = 0;
                }
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i12, i11, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean performAccessibilityActionForItem(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i10, bundle);
        }

        public boolean performAccessibilityActionForItem(v vVar, z zVar, View view, int i10, Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
                p0.e0.d.m(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.l(childCount);
            }
        }

        public void removeAndRecycleAllViews(v vVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, vVar);
                }
            }
        }

        public void removeAndRecycleScrapInt(v vVar) {
            int size = vVar.f2488a.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                View view = vVar.f2488a.get(i10).itemView;
                c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    l lVar = this.mRecyclerView.mItemAnimator;
                    if (lVar != null) {
                        lVar.j(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    c0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    vVar.i(childViewHolderInt2);
                }
            }
            vVar.f2488a.clear();
            ArrayList<c0> arrayList = vVar.f2489b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(View view, v vVar) {
            removeView(view);
            vVar.h(view);
        }

        public void removeAndRecycleViewAt(int i10, v vVar) {
            View childAt = getChildAt(i10);
            removeViewAt(i10);
            vVar.h(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            androidx.recyclerview.widget.e eVar = this.mChildHelper;
            int iIndexOfChild = RecyclerView.this.indexOfChild(view);
            if (iIndexOfChild < 0) {
                return;
            }
            if (eVar.f2597b.f(iIndexOfChild)) {
                eVar.m(view);
            }
            ((e) eVar.f2596a).c(iIndexOfChild);
        }

        public void removeViewAt(int i10) {
            if (getChildAt(i10) != null) {
                this.mChildHelper.l(i10);
            }
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z10, false);
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i10 = childRectangleOnScreenScrollAmount[0];
            int i11 = childRectangleOnScreenScrollAmount[1];
            if ((z11 && !isFocusedChildVisibleAfterScrolling(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.smoothScrollBy(i10, i11);
            }
            return true;
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i10, v vVar, z zVar) {
            return 0;
        }

        public void scrollToPosition(int i10) {
        }

        public int scrollVerticallyBy(int i10, v vVar, z zVar) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z10) {
            this.mAutoMeasure = z10;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z10) {
            if (z10 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z10;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.m();
                }
            }
        }

        public void setMeasureSpecs(int i10, int i11) {
            this.mWidth = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(int i10, int i11) {
            this.mRecyclerView.setMeasuredDimension(i10, i11);
        }

        public void setMeasuredDimension(Rect rect, int i10, int i11) {
            setMeasuredDimension(chooseSize(i10, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i11, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i10, int i11) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MIN_VALUE;
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i17 = rect.left;
                if (i17 < i13) {
                    i13 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i14) {
                    i14 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i15) {
                    i15 = i20;
                }
            }
            this.mRecyclerView.mTempRect.set(i13, i14, i12, i15);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i10, i11);
        }

        public void setMeasurementCacheEnabled(boolean z10) {
            this.mMeasurementCacheEnabled = z10;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                height = 0;
                this.mWidth = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.mHeight = height;
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldMeasureChild(View view, int i10, int i11, p pVar) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) pVar).width) && isMeasurementUpToDate(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view, int i10, int i11, p pVar) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) pVar).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, z zVar, int i10) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(y yVar) {
            y yVar2 = this.mSmoothScroller;
            if (yVar2 != null && yVar != yVar2 && yVar2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = yVar;
            yVar.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(View view) {
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void stopSmoothScroller() {
            y yVar = this.mSmoothScroller;
            if (yVar != null) {
                yVar.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }
    }

    public static class p extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c0 f2478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f2479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2481d;

        public p(int i10, int i11) {
            super(i10, i11);
            this.f2479b = new Rect();
            this.f2480c = true;
            this.f2481d = false;
        }

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2479b = new Rect();
            this.f2480c = true;
            this.f2481d = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2479b = new Rect();
            this.f2480c = true;
            this.f2481d = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2479b = new Rect();
            this.f2480c = true;
            this.f2481d = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.f2479b = new Rect();
            this.f2480c = true;
            this.f2481d = false;
        }

        public int a() {
            return this.f2478a.getLayoutPosition();
        }

        public boolean b() {
            return this.f2478a.isUpdated();
        }

        public boolean c() {
            return this.f2478a.isRemoved();
        }
    }

    public interface q {
        void b(View view);

        void d(View view);
    }

    public static abstract class r {
        public abstract boolean a(int i10, int i11);
    }

    public interface s {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z10);
    }

    public static abstract class t {
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        }

        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public static class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SparseArray<a> f2482a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2483b = 0;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList<c0> f2484a = new ArrayList<>();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f2485b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f2486c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public long f2487d = 0;
        }

        public void a() {
            for (int i10 = 0; i10 < this.f2482a.size(); i10++) {
                this.f2482a.valueAt(i10).f2484a.clear();
            }
        }

        public c0 b(int i10) {
            a aVar = this.f2482a.get(i10);
            if (aVar == null || aVar.f2484a.isEmpty()) {
                return null;
            }
            ArrayList<c0> arrayList = aVar.f2484a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public final a c(int i10) {
            a aVar = this.f2482a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f2482a.put(i10, aVar2);
            return aVar2;
        }

        public void d(c0 c0Var) {
            int itemViewType = c0Var.getItemViewType();
            ArrayList<c0> arrayList = c(itemViewType).f2484a;
            if (this.f2482a.get(itemViewType).f2485b <= arrayList.size()) {
                return;
            }
            c0Var.resetInternal();
            arrayList.add(c0Var);
        }

        public long e(long j10, long j11) {
            if (j10 == 0) {
                return j11;
            }
            return (j11 / 4) + ((j10 / 4) * 3);
        }
    }

    public final class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<c0> f2488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<c0> f2489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<c0> f2490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<c0> f2491d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2492e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2493f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public u f2494g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public a0 f2495h;

        public v() {
            ArrayList<c0> arrayList = new ArrayList<>();
            this.f2488a = arrayList;
            this.f2489b = null;
            this.f2490c = new ArrayList<>();
            this.f2491d = Collections.unmodifiableList(arrayList);
            this.f2492e = 2;
            this.f2493f = 2;
        }

        public void a(c0 c0Var, boolean z10) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(c0Var);
            View view = c0Var.itemView;
            androidx.recyclerview.widget.a0 a0Var = RecyclerView.this.mAccessibilityDelegate;
            if (a0Var != null) {
                p0.a itemDelegate = a0Var.getItemDelegate();
                p0.e0.q(view, itemDelegate instanceof androidx.recyclerview.widget.a0.a ? ((androidx.recyclerview.widget.a0.a) itemDelegate).f2583b.remove(view) : null);
            }
            if (z10) {
                w wVar = RecyclerView.this.mRecyclerListener;
                if (wVar != null) {
                    wVar.a(c0Var);
                }
                g gVar = RecyclerView.this.mAdapter;
                if (gVar != null) {
                    gVar.onViewRecycled(c0Var);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.g(c0Var);
                }
            }
            c0Var.mOwnerRecyclerView = null;
            d().d(c0Var);
        }

        public void b() {
            this.f2488a.clear();
            f();
        }

        public int c(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.mState.b()) {
                RecyclerView recyclerView = RecyclerView.this;
                return !recyclerView.mState.f2511g ? i10 : recyclerView.mAdapterHelper.f(i10, 0);
            }
            StringBuilder sbA = r0.a("invalid position ", i10, ". State item count is ");
            sbA.append(RecyclerView.this.mState.b());
            throw new IndexOutOfBoundsException(androidx.recyclerview.widget.d.a(RecyclerView.this, sbA));
        }

        public u d() {
            if (this.f2494g == null) {
                this.f2494g = new u();
            }
            return this.f2494g;
        }

        public final void e(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    e((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public void f() {
            for (int size = this.f2490c.size() - 1; size >= 0; size--) {
                g(size);
            }
            this.f2490c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                androidx.recyclerview.widget.n.b bVar = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = bVar.f2724c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f2725d = 0;
            }
        }

        public void g(int i10) {
            a(this.f2490c.get(i10), true);
            this.f2490c.remove(i10);
        }

        public void h(View view) {
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            i(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            RecyclerView.this.mItemAnimator.j(childViewHolderInt);
        }

        public void i(c0 c0Var) {
            boolean z10;
            boolean z11;
            boolean z12 = false;
            if (c0Var.isScrap() || c0Var.itemView.getParent() != null) {
                StringBuilder sbA = defpackage.a.a("Scrapped or attached views may not be recycled. isScrap:");
                sbA.append(c0Var.isScrap());
                sbA.append(" isAttached:");
                sbA.append(c0Var.itemView.getParent() != null);
                throw new IllegalArgumentException(androidx.recyclerview.widget.d.a(RecyclerView.this, sbA));
            }
            if (c0Var.isTmpDetached()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(c0Var);
                throw new IllegalArgumentException(androidx.recyclerview.widget.d.a(RecyclerView.this, sb2));
            }
            if (c0Var.shouldIgnore()) {
                throw new IllegalArgumentException(androidx.recyclerview.widget.d.a(RecyclerView.this, defpackage.a.a("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
            boolean zDoesTransientStatePreventRecycling = c0Var.doesTransientStatePreventRecycling();
            g gVar = RecyclerView.this.mAdapter;
            if ((gVar != null && zDoesTransientStatePreventRecycling && gVar.onFailedToRecycleView(c0Var)) || c0Var.isRecyclable()) {
                if (this.f2493f <= 0 || c0Var.hasAnyOfTheFlags(526)) {
                    z10 = false;
                } else {
                    int size = this.f2490c.size();
                    if (size >= this.f2493f && size > 0) {
                        g(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.c(c0Var.mPosition)) {
                        do {
                            size--;
                            if (size < 0) {
                                break;
                            }
                        } while (RecyclerView.this.mPrefetchRegistry.c(this.f2490c.get(size).mPosition));
                        size++;
                    }
                    this.f2490c.add(size, c0Var);
                    z10 = true;
                }
                if (!z10) {
                    a(c0Var, true);
                    z12 = true;
                }
                z11 = z12;
                z12 = z10;
            } else {
                z11 = false;
            }
            RecyclerView.this.mViewInfoStore.g(c0Var);
            if (z12 || z11 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            c0Var.mOwnerRecyclerView = null;
        }

        public void j(View view) {
            ArrayList<c0> arrayList;
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f2489b == null) {
                    this.f2489b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                arrayList = this.f2489b;
            } else {
                if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !RecyclerView.this.mAdapter.hasStableIds()) {
                    throw new IllegalArgumentException(androidx.recyclerview.widget.d.a(RecyclerView.this, defpackage.a.a("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
                }
                childViewHolderInt.setScrapContainer(this, false);
                arrayList = this.f2488a;
            }
            arrayList.add(childViewHolderInt);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x01d3  */
        /* JADX WARN: Code duplicated, block: B:116:0x0216 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:117:0x0218  */
        /* JADX WARN: Code duplicated, block: B:119:0x0222  */
        /* JADX WARN: Code duplicated, block: B:120:0x022d  */
        /* JADX WARN: Code duplicated, block: B:122:0x0233  */
        /* JADX WARN: Code duplicated, block: B:125:0x023b  */
        /* JADX WARN: Code duplicated, block: B:130:0x025d  */
        /* JADX WARN: Code duplicated, block: B:219:0x041d  */
        /* JADX WARN: Code duplicated, block: B:225:0x0443  */
        /* JADX WARN: Code duplicated, block: B:227:0x0449  */
        /* JADX WARN: Code duplicated, block: B:231:0x0455  */
        /* JADX WARN: Code duplicated, block: B:233:0x046f  */
        /* JADX WARN: Code duplicated, block: B:235:0x047d  */
        /* JADX WARN: Code duplicated, block: B:239:0x0485  */
        /* JADX WARN: Code duplicated, block: B:241:0x0488  */
        /* JADX WARN: Code duplicated, block: B:244:0x04b3  */
        /* JADX WARN: Code duplicated, block: B:246:0x04bd  */
        /* JADX WARN: Code duplicated, block: B:247:0x04c2  */
        /* JADX WARN: Code duplicated, block: B:251:0x04ca  */
        /* JADX WARN: Code duplicated, block: B:253:0x04d2  */
        /* JADX WARN: Code duplicated, block: B:255:0x04de A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:259:0x04ea  */
        /* JADX WARN: Code duplicated, block: B:262:0x04f3  */
        /* JADX WARN: Code duplicated, block: B:266:0x04fe  */
        /* JADX WARN: Code duplicated, block: B:267:0x0505  */
        /* JADX WARN: Code duplicated, block: B:269:0x050d  */
        /* JADX WARN: Code duplicated, block: B:271:0x051b  */
        /* JADX WARN: Code duplicated, block: B:274:0x0521 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:286:0x00cf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:292:0x0107 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:296:0x01bf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:298:0x01bc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x008c A[EDGE_INSN: B:35:0x008c->B:36:0x008d BREAK  A[LOOP:0: B:14:0x0028->B:20:0x0042]] */
        /* JADX WARN: Code duplicated, block: B:42:0x0096  */
        /* JADX WARN: Code duplicated, block: B:44:0x009f  */
        /* JADX WARN: Code duplicated, block: B:57:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:59:0x00de  */
        /* JADX WARN: Code duplicated, block: B:69:0x010a  */
        /* JADX WARN: Code duplicated, block: B:71:0x011e  */
        /* JADX WARN: Code duplicated, block: B:73:0x0126  */
        /* JADX WARN: Code duplicated, block: B:75:0x0138 A[EDGE_INSN: B:75:0x0138->B:95:0x01c0 BREAK  A[LOOP:1: B:43:0x009d->B:55:0x00cc]] */
        /* JADX WARN: Code duplicated, block: B:76:0x0149  */
        /* JADX WARN: Code duplicated, block: B:78:0x0162  */
        /* JADX WARN: Code duplicated, block: B:80:0x0179  */
        /* JADX WARN: Code duplicated, block: B:82:0x0190  */
        /* JADX WARN: Code duplicated, block: B:84:0x0199  */
        /* JADX WARN: Code duplicated, block: B:86:0x01a7  */
        /* JADX WARN: Code duplicated, block: B:96:0x01c2  */
        /* JADX WARN: Code duplicated, block: B:98:0x01c8  */
        /* JADX WARN: Code duplicated, block: B:99:0x01cf  */
        /* JADX WARN: Instruction removed from duplicated block: B:78:0x0162, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:80:0x0179, please report this as an issue */
        public c0 k(int i10, boolean z10, long j10) {
            c0 childViewHolder;
            boolean z11;
            int itemViewType;
            boolean z12;
            boolean z13;
            View view;
            boolean z14;
            androidx.recyclerview.widget.a0 a0Var;
            p0.a itemDelegate;
            androidx.recyclerview.widget.a0.a aVar;
            p0.a aVarE;
            long j11;
            boolean z15;
            ViewGroup.LayoutParams layoutParams;
            p pVar;
            ViewGroup.LayoutParams layoutParamsGenerateLayoutParams;
            int iF;
            RecyclerView recyclerViewFindNestedRecyclerView;
            a0 a0Var2;
            View viewA;
            c0 c0Var;
            int size;
            int i11;
            int size2;
            int i12;
            c0 c0Var2;
            androidx.recyclerview.widget.e eVar;
            int size3;
            int i13;
            View view2;
            androidx.recyclerview.widget.e eVar2;
            int iIndexOfChild;
            int iJ;
            c0 childViewHolderInt;
            int i14;
            boolean z16;
            int size4;
            int iF2;
            if (i10 < 0 || i10 >= RecyclerView.this.mState.b()) {
                StringBuilder sbA = androidx.recyclerview.widget.o.a("Invalid item position ", i10, "(", i10, "). Item count:");
                sbA.append(RecyclerView.this.mState.b());
                throw new IndexOutOfBoundsException(androidx.recyclerview.widget.d.a(RecyclerView.this, sbA));
            }
            int i15 = 32;
            boolean z17 = false;
            if (RecyclerView.this.mState.f2511g) {
                ArrayList<c0> arrayList = this.f2489b;
                if (arrayList != null && (size4 = arrayList.size()) != 0) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size4) {
                            if (RecyclerView.this.mAdapter.hasStableIds() && (iF2 = RecyclerView.this.mAdapterHelper.f(i10, 0)) > 0 && iF2 < RecyclerView.this.mAdapter.getItemCount()) {
                                long itemId = RecyclerView.this.mAdapter.getItemId(iF2);
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= size4) {
                                        childViewHolder = null;
                                        break;
                                    }
                                    c0 c0Var3 = this.f2489b.get(i17);
                                    if (!c0Var3.wasReturnedFromScrap() && c0Var3.getItemId() == itemId) {
                                        c0Var3.addFlags(32);
                                        childViewHolder = c0Var3;
                                        break;
                                    }
                                    i17++;
                                }
                            } else {
                                childViewHolder = null;
                                break;
                            }
                        } else {
                            childViewHolder = this.f2489b.get(i16);
                            if (!childViewHolder.wasReturnedFromScrap() && childViewHolder.getLayoutPosition() == i10) {
                                childViewHolder.addFlags(32);
                                break;
                            }
                            i16++;
                        }
                    }
                } else {
                    childViewHolder = null;
                    break;
                }
                if (childViewHolder != null) {
                    z11 = true;
                }
                if (childViewHolder == null) {
                    size = this.f2488a.size();
                    i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            if (z10) {
                                eVar = RecyclerView.this.mChildHelper;
                                size3 = eVar.f2598c.size();
                                i13 = 0;
                                while (true) {
                                    if (i13 < size3) {
                                        view2 = null;
                                        break;
                                    }
                                    view2 = eVar.f2598c.get(i13);
                                    Objects.requireNonNull((e) eVar.f2596a);
                                    childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
                                    if (childViewHolderInt.getLayoutPosition() != i10 && !childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved()) {
                                        break;
                                    }
                                    i13++;
                                }
                                if (view2 != null) {
                                    size2 = this.f2490c.size();
                                    i12 = 0;
                                    while (true) {
                                        if (i12 < size2) {
                                            childViewHolder = null;
                                            break;
                                        }
                                        c0Var2 = this.f2490c.get(i12);
                                        if (!c0Var2.isInvalid() || c0Var2.getLayoutPosition() != i10 || c0Var2.isAttachedToTransitionOverlay()) {
                                            i12++;
                                        } else if (!z10) {
                                            this.f2490c.remove(i12);
                                        }
                                    }
                                } else {
                                    childViewHolder = RecyclerView.getChildViewHolderInt(view2);
                                    eVar2 = RecyclerView.this.mChildHelper;
                                    iIndexOfChild = RecyclerView.this.indexOfChild(view2);
                                    if (iIndexOfChild >= 0) {
                                        throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                                    }
                                    if (eVar2.f2597b.d(iIndexOfChild)) {
                                        throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                                    }
                                    eVar2.f2597b.a(iIndexOfChild);
                                    eVar2.m(view2);
                                    iJ = RecyclerView.this.mChildHelper.j(view2);
                                    if (iJ != -1) {
                                        RecyclerView.this.mChildHelper.c(iJ);
                                        j(view2);
                                        childViewHolder.addFlags(8224);
                                        break;
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("layout index should not be -1 after unhiding a view:");
                                    sb2.append(childViewHolder);
                                    throw new IllegalStateException(androidx.recyclerview.widget.d.a(RecyclerView.this, sb2));
                                }
                            } else {
                                size2 = this.f2490c.size();
                                i12 = 0;
                                while (true) {
                                    if (i12 < size2) {
                                        childViewHolder = null;
                                        break;
                                    }
                                    c0Var2 = this.f2490c.get(i12);
                                    if (!c0Var2.isInvalid()) {
                                    }
                                    i12++;
                                }
                            }
                        } else {
                            c0Var2 = this.f2488a.get(i11);
                            if (!c0Var2.wasReturnedFromScrap() || c0Var2.getLayoutPosition() != i10 || c0Var2.isInvalid() || (!RecyclerView.this.mState.f2511g && c0Var2.isRemoved())) {
                                i11++;
                            } else {
                                c0Var2.addFlags(32);
                            }
                        }
                        childViewHolder = c0Var2;
                        break;
                    }
                    if (childViewHolder != null) {
                        if (childViewHolder.isRemoved()) {
                            z16 = RecyclerView.this.mState.f2511g;
                        } else {
                            i14 = childViewHolder.mPosition;
                            if (i14 >= 0 || i14 >= RecyclerView.this.mAdapter.getItemCount()) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Inconsistency detected. Invalid view holder adapter position");
                                sb3.append(childViewHolder);
                                throw new IndexOutOfBoundsException(androidx.recyclerview.widget.d.a(RecyclerView.this, sb3));
                            }
                            RecyclerView recyclerView = RecyclerView.this;
                            z16 = (recyclerView.mState.f2511g || recyclerView.mAdapter.getItemViewType(childViewHolder.mPosition) == childViewHolder.getItemViewType()) && (!RecyclerView.this.mAdapter.hasStableIds() || childViewHolder.getItemId() == RecyclerView.this.mAdapter.getItemId(childViewHolder.mPosition));
                        }
                        if (z16) {
                            z11 = true;
                        } else {
                            if (!z10) {
                                childViewHolder.addFlags(4);
                                if (childViewHolder.isScrap()) {
                                    RecyclerView.this.removeDetachedView(childViewHolder.itemView, false);
                                    childViewHolder.unScrap();
                                } else if (childViewHolder.wasReturnedFromScrap()) {
                                    childViewHolder.clearReturnedFromScrapFlag();
                                }
                                i(childViewHolder);
                            }
                            childViewHolder = null;
                        }
                    }
                }
                if (childViewHolder == null) {
                    iF = RecyclerView.this.mAdapterHelper.f(i10, 0);
                    if (iF >= 0 || iF >= RecyclerView.this.mAdapter.getItemCount()) {
                        StringBuilder sbA2 = androidx.recyclerview.widget.o.a("Inconsistency detected. Invalid item position ", i10, "(offset:", iF, ").state:");
                        sbA2.append(RecyclerView.this.mState.b());
                        throw new IndexOutOfBoundsException(androidx.recyclerview.widget.d.a(RecyclerView.this, sbA2));
                    }
                    int itemViewType2 = RecyclerView.this.mAdapter.getItemViewType(iF);
                    if (RecyclerView.this.mAdapter.hasStableIds()) {
                        long itemId2 = RecyclerView.this.mAdapter.getItemId(iF);
                        int size5 = this.f2488a.size() - 1;
                        while (true) {
                            if (size5 < 0) {
                                int size6 = this.f2490c.size() - 1;
                                while (true) {
                                    if (size6 >= 0) {
                                        c0Var = this.f2490c.get(size6);
                                        if (c0Var.getItemId() == itemId2 && !c0Var.isAttachedToTransitionOverlay()) {
                                            if (itemViewType2 == c0Var.getItemViewType()) {
                                                if (!z10) {
                                                    this.f2490c.remove(size6);
                                                }
                                            } else if (!z10) {
                                                g(size6);
                                            }
                                        }
                                        size6--;
                                    }
                                    childViewHolder = null;
                                    break;
                                }
                            }
                            c0Var = this.f2488a.get(size5);
                            if (c0Var.getItemId() == itemId2 && !c0Var.wasReturnedFromScrap()) {
                                if (itemViewType2 == c0Var.getItemViewType()) {
                                    c0Var.addFlags(i15);
                                    if (c0Var.isRemoved() && !RecyclerView.this.mState.f2511g) {
                                        c0Var.setFlags(2, 14);
                                    }
                                } else if (!z10) {
                                    this.f2488a.remove(size5);
                                    RecyclerView.this.removeDetachedView(c0Var.itemView, false);
                                    c0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(c0Var.itemView);
                                    childViewHolderInt2.mScrapContainer = null;
                                    childViewHolderInt2.mInChangeScrap = false;
                                    childViewHolderInt2.clearReturnedFromScrapFlag();
                                    i(childViewHolderInt2);
                                }
                            }
                            size5--;
                            i15 = 32;
                            childViewHolder = c0Var;
                            break;
                        }
                        if (childViewHolder != null) {
                            childViewHolder.mPosition = iF;
                            z11 = true;
                        }
                    }
                    if (childViewHolder == null && (a0Var2 = this.f2495h) != null && (viewA = a0Var2.a(this, i10, itemViewType2)) != null) {
                        childViewHolder = RecyclerView.this.getChildViewHolder(viewA);
                        if (childViewHolder == null) {
                            throw new IllegalArgumentException(androidx.recyclerview.widget.d.a(RecyclerView.this, defpackage.a.a("getViewForPositionAndType returned a view which does not have a ViewHolder")));
                        }
                        if (childViewHolder.shouldIgnore()) {
                            throw new IllegalArgumentException(androidx.recyclerview.widget.d.a(RecyclerView.this, defpackage.a.a("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.")));
                        }
                    }
                    if (childViewHolder == null) {
                        c0 c0VarB = d().b(itemViewType2);
                        if (c0VarB != null) {
                            c0VarB.resetInternal();
                            if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                View view3 = c0VarB.itemView;
                                if (view3 instanceof ViewGroup) {
                                    e((ViewGroup) view3, false);
                                }
                            }
                        }
                        childViewHolder = c0VarB;
                    }
                    if (childViewHolder == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j10 != RecyclerView.FOREVER_NS) {
                            long j12 = this.f2494g.c(itemViewType2).f2486c;
                            if (!(j12 == 0 || j12 + nanoTime < j10)) {
                                return null;
                            }
                        }
                        RecyclerView recyclerView2 = RecyclerView.this;
                        c0 c0VarCreateViewHolder = recyclerView2.mAdapter.createViewHolder(recyclerView2, itemViewType2);
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(c0VarCreateViewHolder.itemView)) != null) {
                            c0VarCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                        }
                        long nanoTime2 = RecyclerView.this.getNanoTime();
                        u uVar = this.f2494g;
                        long j13 = nanoTime2 - nanoTime;
                        u.a aVarC = uVar.c(itemViewType2);
                        aVarC.f2486c = uVar.e(aVarC.f2486c, j13);
                        childViewHolder = c0VarCreateViewHolder;
                    }
                }
                if (z11 && !RecyclerView.this.mState.f2511g && childViewHolder.hasAnyOfTheFlags(8192)) {
                    childViewHolder.setFlags(0, 8192);
                    if (RecyclerView.this.mState.f2514j) {
                        l.e(childViewHolder);
                        RecyclerView recyclerView3 = RecyclerView.this;
                        l lVar = recyclerView3.mItemAnimator;
                        z zVar = recyclerView3.mState;
                        childViewHolder.getUnmodifiedPayloads();
                        RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(childViewHolder, lVar.m(childViewHolder));
                    }
                }
                if (RecyclerView.this.mState.f2511g || !childViewHolder.isBound()) {
                    if (childViewHolder.isBound() || childViewHolder.needsUpdate() || childViewHolder.isInvalid()) {
                        int iF3 = RecyclerView.this.mAdapterHelper.f(i10, 0);
                        childViewHolder.mOwnerRecyclerView = RecyclerView.this;
                        itemViewType = childViewHolder.getItemViewType();
                        long nanoTime3 = RecyclerView.this.getNanoTime();
                        if (j10 != RecyclerView.FOREVER_NS) {
                            j11 = this.f2494g.c(itemViewType).f2487d;
                            if (j11 != 0 || j11 + nanoTime3 < j10) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (!z15) {
                            }
                        }
                        RecyclerView.this.mAdapter.bindViewHolder(childViewHolder, iF3);
                        long nanoTime4 = RecyclerView.this.getNanoTime();
                        u uVar2 = this.f2494g;
                        u.a aVarC2 = uVar2.c(childViewHolder.getItemViewType());
                        aVarC2.f2487d = uVar2.e(aVarC2.f2487d, nanoTime4 - nanoTime3);
                        if (RecyclerView.this.isAccessibilityEnabled()) {
                            view = childViewHolder.itemView;
                            WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
                            if (p0.e0.d.c(view) == 0) {
                                z14 = true;
                                p0.e0.d.s(view, 1);
                            } else {
                                z14 = true;
                            }
                            a0Var = RecyclerView.this.mAccessibilityDelegate;
                            if (a0Var != null) {
                                itemDelegate = a0Var.getItemDelegate();
                                if (itemDelegate instanceof androidx.recyclerview.widget.a0.a) {
                                    aVar = (androidx.recyclerview.widget.a0.a) itemDelegate;
                                    Objects.requireNonNull(aVar);
                                    aVarE = p0.e0.e(view);
                                    if (aVarE != null && aVarE != aVar) {
                                        aVar.f2583b.put(view, aVarE);
                                    }
                                }
                                p0.e0.q(view, itemDelegate);
                            }
                            z12 = z14;
                        } else {
                            z12 = true;
                        }
                        if (RecyclerView.this.mState.f2511g) {
                            childViewHolder.mPreLayoutPosition = i10;
                        }
                        z13 = z12;
                    }
                    layoutParams = childViewHolder.itemView.getLayoutParams();
                    if (layoutParams != null) {
                        if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                            pVar = (p) layoutParams;
                        } else {
                            layoutParamsGenerateLayoutParams = RecyclerView.this.generateLayoutParams(layoutParams);
                        }
                        pVar.f2478a = childViewHolder;
                        if (z11 && z12) {
                            z17 = z13;
                        }
                        pVar.f2481d = z17;
                        return childViewHolder;
                    }
                    layoutParamsGenerateLayoutParams = RecyclerView.this.generateDefaultLayoutParams();
                    pVar = (p) layoutParamsGenerateLayoutParams;
                    childViewHolder.itemView.setLayoutParams(pVar);
                    pVar.f2478a = childViewHolder;
                    if (z11) {
                        z17 = z13;
                    }
                    pVar.f2481d = z17;
                    return childViewHolder;
                }
                childViewHolder.mPreLayoutPosition = i10;
                z13 = true;
                z12 = false;
                layoutParams = childViewHolder.itemView.getLayoutParams();
                if (layoutParams != null) {
                    if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                        layoutParamsGenerateLayoutParams = RecyclerView.this.generateLayoutParams(layoutParams);
                    } else {
                        pVar = (p) layoutParams;
                    }
                    pVar.f2478a = childViewHolder;
                    if (z11) {
                        z17 = z13;
                    }
                    pVar.f2481d = z17;
                    return childViewHolder;
                }
                layoutParamsGenerateLayoutParams = RecyclerView.this.generateDefaultLayoutParams();
                pVar = (p) layoutParamsGenerateLayoutParams;
                childViewHolder.itemView.setLayoutParams(pVar);
                pVar.f2478a = childViewHolder;
                if (z11) {
                    z17 = z13;
                }
                pVar.f2481d = z17;
                return childViewHolder;
            }
            childViewHolder = null;
            z11 = false;
            if (childViewHolder == null) {
                size = this.f2488a.size();
                i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        c0Var2 = this.f2488a.get(i11);
                        if (c0Var2.wasReturnedFromScrap()) {
                        }
                        i11++;
                    } else {
                        if (z10) {
                            size2 = this.f2490c.size();
                            i12 = 0;
                            while (true) {
                                if (i12 < size2) {
                                    childViewHolder = null;
                                    break;
                                }
                                c0Var2 = this.f2490c.get(i12);
                                if (!c0Var2.isInvalid()) {
                                }
                                i12++;
                            }
                        } else {
                            eVar = RecyclerView.this.mChildHelper;
                            size3 = eVar.f2598c.size();
                            i13 = 0;
                            while (true) {
                                if (i13 < size3) {
                                    view2 = null;
                                    break;
                                }
                                view2 = eVar.f2598c.get(i13);
                                Objects.requireNonNull((e) eVar.f2596a);
                                childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
                                if (childViewHolderInt.getLayoutPosition() != i10) {
                                }
                                i13++;
                            }
                            if (view2 != null) {
                                size2 = this.f2490c.size();
                                i12 = 0;
                                while (true) {
                                    if (i12 < size2) {
                                        childViewHolder = null;
                                        break;
                                    }
                                    c0Var2 = this.f2490c.get(i12);
                                    if (!c0Var2.isInvalid()) {
                                    }
                                    i12++;
                                }
                            } else {
                                childViewHolder = RecyclerView.getChildViewHolderInt(view2);
                                eVar2 = RecyclerView.this.mChildHelper;
                                iIndexOfChild = RecyclerView.this.indexOfChild(view2);
                                if (iIndexOfChild >= 0) {
                                    throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                                }
                                if (eVar2.f2597b.d(iIndexOfChild)) {
                                    throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                                }
                                eVar2.f2597b.a(iIndexOfChild);
                                eVar2.m(view2);
                                iJ = RecyclerView.this.mChildHelper.j(view2);
                                if (iJ != -1) {
                                    RecyclerView.this.mChildHelper.c(iJ);
                                    j(view2);
                                    childViewHolder.addFlags(8224);
                                    break;
                                }
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("layout index should not be -1 after unhiding a view:");
                                sb4.append(childViewHolder);
                                throw new IllegalStateException(androidx.recyclerview.widget.d.a(RecyclerView.this, sb4));
                            }
                        }
                        if (childViewHolder != null) {
                            if (childViewHolder.isRemoved()) {
                                i14 = childViewHolder.mPosition;
                                if (i14 >= 0) {
                                }
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("Inconsistency detected. Invalid view holder adapter position");
                                sb5.append(childViewHolder);
                                throw new IndexOutOfBoundsException(androidx.recyclerview.widget.d.a(RecyclerView.this, sb5));
                            }
                            z16 = RecyclerView.this.mState.f2511g;
                            if (z16) {
                                if (!z10) {
                                    childViewHolder.addFlags(4);
                                    if (childViewHolder.isScrap()) {
                                        RecyclerView.this.removeDetachedView(childViewHolder.itemView, false);
                                        childViewHolder.unScrap();
                                    } else if (childViewHolder.wasReturnedFromScrap()) {
                                        childViewHolder.clearReturnedFromScrapFlag();
                                    }
                                    i(childViewHolder);
                                }
                                childViewHolder = null;
                            } else {
                                z11 = true;
                            }
                        }
                    }
                    childViewHolder = c0Var2;
                    if (childViewHolder != null) {
                        if (childViewHolder.isRemoved()) {
                            i14 = childViewHolder.mPosition;
                            if (i14 >= 0) {
                            }
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("Inconsistency detected. Invalid view holder adapter position");
                            sb6.append(childViewHolder);
                            throw new IndexOutOfBoundsException(androidx.recyclerview.widget.d.a(RecyclerView.this, sb6));
                        }
                        z16 = RecyclerView.this.mState.f2511g;
                        if (z16) {
                            if (!z10) {
                                childViewHolder.addFlags(4);
                                if (childViewHolder.isScrap()) {
                                    RecyclerView.this.removeDetachedView(childViewHolder.itemView, false);
                                    childViewHolder.unScrap();
                                } else if (childViewHolder.wasReturnedFromScrap()) {
                                    childViewHolder.clearReturnedFromScrapFlag();
                                }
                                i(childViewHolder);
                            }
                            childViewHolder = null;
                        } else {
                            z11 = true;
                        }
                    }
                }
            }
            if (childViewHolder == null) {
                iF = RecyclerView.this.mAdapterHelper.f(i10, 0);
                if (iF >= 0) {
                }
                StringBuilder sbA3 = androidx.recyclerview.widget.o.a("Inconsistency detected. Invalid item position ", i10, "(offset:", iF, ").state:");
                sbA3.append(RecyclerView.this.mState.b());
                throw new IndexOutOfBoundsException(androidx.recyclerview.widget.d.a(RecyclerView.this, sbA3));
            }
            if (z11) {
                childViewHolder.setFlags(0, 8192);
                if (RecyclerView.this.mState.f2514j) {
                    l.e(childViewHolder);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    l lVar2 = recyclerView4.mItemAnimator;
                    z zVar2 = recyclerView4.mState;
                    childViewHolder.getUnmodifiedPayloads();
                    RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(childViewHolder, lVar2.m(childViewHolder));
                }
            }
            if (RecyclerView.this.mState.f2511g) {
                if (childViewHolder.isBound()) {
                    int iF4 = RecyclerView.this.mAdapterHelper.f(i10, 0);
                    childViewHolder.mOwnerRecyclerView = RecyclerView.this;
                    itemViewType = childViewHolder.getItemViewType();
                    long nanoTime5 = RecyclerView.this.getNanoTime();
                    if (j10 != RecyclerView.FOREVER_NS) {
                        j11 = this.f2494g.c(itemViewType).f2487d;
                        if (j11 != 0) {
                            z15 = true;
                        } else {
                            z15 = true;
                        }
                        if (!z15) {
                            z13 = true;
                            z12 = false;
                        }
                    }
                    RecyclerView.this.mAdapter.bindViewHolder(childViewHolder, iF4);
                    long nanoTime6 = RecyclerView.this.getNanoTime();
                    u uVar3 = this.f2494g;
                    u.a aVarC3 = uVar3.c(childViewHolder.getItemViewType());
                    aVarC3.f2487d = uVar3.e(aVarC3.f2487d, nanoTime6 - nanoTime5);
                    if (RecyclerView.this.isAccessibilityEnabled()) {
                        view = childViewHolder.itemView;
                        WeakHashMap<View, m0> weakHashMap2 = p0.e0.f34354a;
                        if (p0.e0.d.c(view) == 0) {
                            z14 = true;
                            p0.e0.d.s(view, 1);
                        } else {
                            z14 = true;
                        }
                        a0Var = RecyclerView.this.mAccessibilityDelegate;
                        if (a0Var != null) {
                            itemDelegate = a0Var.getItemDelegate();
                            if (itemDelegate instanceof androidx.recyclerview.widget.a0.a) {
                                aVar = (androidx.recyclerview.widget.a0.a) itemDelegate;
                                Objects.requireNonNull(aVar);
                                aVarE = p0.e0.e(view);
                                if (aVarE != null) {
                                    aVar.f2583b.put(view, aVarE);
                                }
                            }
                            p0.e0.q(view, itemDelegate);
                        }
                        z12 = z14;
                    } else {
                        z12 = true;
                    }
                    if (RecyclerView.this.mState.f2511g) {
                        childViewHolder.mPreLayoutPosition = i10;
                    }
                    z13 = z12;
                } else {
                    int iF5 = RecyclerView.this.mAdapterHelper.f(i10, 0);
                    childViewHolder.mOwnerRecyclerView = RecyclerView.this;
                    itemViewType = childViewHolder.getItemViewType();
                    long nanoTime7 = RecyclerView.this.getNanoTime();
                    if (j10 != RecyclerView.FOREVER_NS) {
                        j11 = this.f2494g.c(itemViewType).f2487d;
                        if (j11 != 0) {
                            z15 = true;
                        } else {
                            z15 = true;
                        }
                        if (!z15) {
                            z13 = true;
                            z12 = false;
                        }
                    }
                    RecyclerView.this.mAdapter.bindViewHolder(childViewHolder, iF5);
                    long nanoTime8 = RecyclerView.this.getNanoTime();
                    u uVar4 = this.f2494g;
                    u.a aVarC4 = uVar4.c(childViewHolder.getItemViewType());
                    aVarC4.f2487d = uVar4.e(aVarC4.f2487d, nanoTime8 - nanoTime7);
                    if (RecyclerView.this.isAccessibilityEnabled()) {
                        view = childViewHolder.itemView;
                        WeakHashMap<View, m0> weakHashMap3 = p0.e0.f34354a;
                        if (p0.e0.d.c(view) == 0) {
                            z14 = true;
                            p0.e0.d.s(view, 1);
                        } else {
                            z14 = true;
                        }
                        a0Var = RecyclerView.this.mAccessibilityDelegate;
                        if (a0Var != null) {
                            itemDelegate = a0Var.getItemDelegate();
                            if (itemDelegate instanceof androidx.recyclerview.widget.a0.a) {
                                aVar = (androidx.recyclerview.widget.a0.a) itemDelegate;
                                Objects.requireNonNull(aVar);
                                aVarE = p0.e0.e(view);
                                if (aVarE != null) {
                                    aVar.f2583b.put(view, aVarE);
                                }
                            }
                            p0.e0.q(view, itemDelegate);
                        }
                        z12 = z14;
                    } else {
                        z12 = true;
                    }
                    if (RecyclerView.this.mState.f2511g) {
                        childViewHolder.mPreLayoutPosition = i10;
                    }
                    z13 = z12;
                }
            } else if (childViewHolder.isBound()) {
                int iF6 = RecyclerView.this.mAdapterHelper.f(i10, 0);
                childViewHolder.mOwnerRecyclerView = RecyclerView.this;
                itemViewType = childViewHolder.getItemViewType();
                long nanoTime9 = RecyclerView.this.getNanoTime();
                if (j10 != RecyclerView.FOREVER_NS) {
                    j11 = this.f2494g.c(itemViewType).f2487d;
                    if (j11 != 0) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (!z15) {
                        z13 = true;
                        z12 = false;
                    }
                }
                RecyclerView.this.mAdapter.bindViewHolder(childViewHolder, iF6);
                long nanoTime10 = RecyclerView.this.getNanoTime();
                u uVar5 = this.f2494g;
                u.a aVarC5 = uVar5.c(childViewHolder.getItemViewType());
                aVarC5.f2487d = uVar5.e(aVarC5.f2487d, nanoTime10 - nanoTime9);
                if (RecyclerView.this.isAccessibilityEnabled()) {
                    view = childViewHolder.itemView;
                    WeakHashMap<View, m0> weakHashMap4 = p0.e0.f34354a;
                    if (p0.e0.d.c(view) == 0) {
                        z14 = true;
                        p0.e0.d.s(view, 1);
                    } else {
                        z14 = true;
                    }
                    a0Var = RecyclerView.this.mAccessibilityDelegate;
                    if (a0Var != null) {
                        itemDelegate = a0Var.getItemDelegate();
                        if (itemDelegate instanceof androidx.recyclerview.widget.a0.a) {
                            aVar = (androidx.recyclerview.widget.a0.a) itemDelegate;
                            Objects.requireNonNull(aVar);
                            aVarE = p0.e0.e(view);
                            if (aVarE != null) {
                                aVar.f2583b.put(view, aVarE);
                            }
                        }
                        p0.e0.q(view, itemDelegate);
                    }
                    z12 = z14;
                } else {
                    z12 = true;
                }
                if (RecyclerView.this.mState.f2511g) {
                    childViewHolder.mPreLayoutPosition = i10;
                }
                z13 = z12;
            } else {
                int iF7 = RecyclerView.this.mAdapterHelper.f(i10, 0);
                childViewHolder.mOwnerRecyclerView = RecyclerView.this;
                itemViewType = childViewHolder.getItemViewType();
                long nanoTime11 = RecyclerView.this.getNanoTime();
                if (j10 != RecyclerView.FOREVER_NS) {
                    j11 = this.f2494g.c(itemViewType).f2487d;
                    if (j11 != 0) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (!z15) {
                        z13 = true;
                        z12 = false;
                    }
                }
                RecyclerView.this.mAdapter.bindViewHolder(childViewHolder, iF7);
                long nanoTime12 = RecyclerView.this.getNanoTime();
                u uVar6 = this.f2494g;
                u.a aVarC6 = uVar6.c(childViewHolder.getItemViewType());
                aVarC6.f2487d = uVar6.e(aVarC6.f2487d, nanoTime12 - nanoTime11);
                if (RecyclerView.this.isAccessibilityEnabled()) {
                    view = childViewHolder.itemView;
                    WeakHashMap<View, m0> weakHashMap5 = p0.e0.f34354a;
                    if (p0.e0.d.c(view) == 0) {
                        z14 = true;
                        p0.e0.d.s(view, 1);
                    } else {
                        z14 = true;
                    }
                    a0Var = RecyclerView.this.mAccessibilityDelegate;
                    if (a0Var != null) {
                        itemDelegate = a0Var.getItemDelegate();
                        if (itemDelegate instanceof androidx.recyclerview.widget.a0.a) {
                            aVar = (androidx.recyclerview.widget.a0.a) itemDelegate;
                            Objects.requireNonNull(aVar);
                            aVarE = p0.e0.e(view);
                            if (aVarE != null) {
                                aVar.f2583b.put(view, aVarE);
                            }
                        }
                        p0.e0.q(view, itemDelegate);
                    }
                    z12 = z14;
                } else {
                    z12 = true;
                }
                if (RecyclerView.this.mState.f2511g) {
                    childViewHolder.mPreLayoutPosition = i10;
                }
                z13 = z12;
            }
            layoutParams = childViewHolder.itemView.getLayoutParams();
            if (layoutParams != null) {
                if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                    layoutParamsGenerateLayoutParams = RecyclerView.this.generateLayoutParams(layoutParams);
                } else {
                    pVar = (p) layoutParams;
                }
                pVar.f2478a = childViewHolder;
                if (z11) {
                    z17 = z13;
                }
                pVar.f2481d = z17;
                return childViewHolder;
            }
            layoutParamsGenerateLayoutParams = RecyclerView.this.generateDefaultLayoutParams();
            pVar = (p) layoutParamsGenerateLayoutParams;
            childViewHolder.itemView.setLayoutParams(pVar);
            pVar.f2478a = childViewHolder;
            if (z11) {
                z17 = z13;
            }
            pVar.f2481d = z17;
            return childViewHolder;
        }

        public void l(c0 c0Var) {
            (c0Var.mInChangeScrap ? this.f2489b : this.f2488a).remove(c0Var);
            c0Var.mScrapContainer = null;
            c0Var.mInChangeScrap = false;
            c0Var.clearReturnedFromScrapFlag();
        }

        public void m() {
            o oVar = RecyclerView.this.mLayout;
            this.f2493f = this.f2492e + (oVar != null ? oVar.mPrefetchMaxCountObserved : 0);
            for (int size = this.f2490c.size() - 1; size >= 0 && this.f2490c.size() > this.f2493f; size--) {
                g(size);
            }
        }
    }

    public interface w {
        void a(c0 c0Var);
    }

    public class x extends i {
        public x() {
        }

        public void a() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
                    WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
                    p0.e0.d.m(recyclerView, runnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f2510f = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.g()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int i10, int i11, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = RecyclerView.this.mAdapterHelper;
            Objects.requireNonNull(aVar);
            boolean z10 = false;
            if (i11 >= 1) {
                aVar.f2573b.add(aVar.h(4, i10, i11, obj));
                aVar.f2577f |= 4;
                if (aVar.f2573b.size() == 1) {
                    z10 = true;
                }
            }
            if (z10) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeInserted(int i10, int i11) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = RecyclerView.this.mAdapterHelper;
            Objects.requireNonNull(aVar);
            boolean z10 = false;
            if (i11 >= 1) {
                aVar.f2573b.add(aVar.h(1, i10, i11, null));
                aVar.f2577f |= 1;
                if (aVar.f2573b.size() == 1) {
                    z10 = true;
                }
            }
            if (z10) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeMoved(int i10, int i11, int i12) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = RecyclerView.this.mAdapterHelper;
            Objects.requireNonNull(aVar);
            boolean z10 = false;
            if (i10 != i11) {
                if (i12 != 1) {
                    throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
                }
                aVar.f2573b.add(aVar.h(8, i10, i11, null));
                aVar.f2577f |= 8;
                if (aVar.f2573b.size() == 1) {
                    z10 = true;
                }
            }
            if (z10) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeRemoved(int i10, int i11) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = RecyclerView.this.mAdapterHelper;
            Objects.requireNonNull(aVar);
            boolean z10 = false;
            if (i11 >= 1) {
                aVar.f2573b.add(aVar.h(2, i10, i11, null));
                aVar.f2577f |= 2;
                if (aVar.f2573b.size() == 1) {
                    z10 = true;
                }
            }
            if (z10) {
                a();
            }
        }
    }

    public static abstract class y {
        private o mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final a mRecyclingAction = new a(0, 0);

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f2498a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f2499b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f2500c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f2501d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Interpolator f2502e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f2503f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f2504g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, null);
            }

            public a(int i10, int i11, int i12) {
                this(i10, i11, i12, null);
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f2501d = -1;
                this.f2503f = false;
                this.f2504g = 0;
                this.f2498a = i10;
                this.f2499b = i11;
                this.f2500c = i12;
                this.f2502e = interpolator;
            }

            public void a(RecyclerView recyclerView) {
                int i10 = this.f2501d;
                if (i10 >= 0) {
                    this.f2501d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i10);
                    this.f2503f = false;
                    return;
                }
                if (!this.f2503f) {
                    this.f2504g = 0;
                    return;
                }
                Interpolator interpolator = this.f2502e;
                if (interpolator != null && this.f2500c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i11 = this.f2500c;
                if (i11 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.mViewFlinger.b(this.f2498a, this.f2499b, i11, interpolator);
                int i12 = this.f2504g + 1;
                this.f2504g = i12;
                if (i12 > 10) {
                    Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f2503f = false;
            }

            public void b(int i10, int i11, int i12, Interpolator interpolator) {
                this.f2498a = i10;
                this.f2499b = i11;
                this.f2500c = i12;
                this.f2502e = interpolator;
                this.f2503f = true;
            }
        }

        public interface b {
            PointF computeScrollVectorForPosition(int i10);
        }

        public PointF computeScrollVectorForPosition(int i10) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof b) {
                return ((b) layoutManager).computeScrollVectorForPosition(i10);
            }
            StringBuilder sbA = defpackage.a.a("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sbA.append(b.class.getCanonicalName());
            Log.w(RecyclerView.TAG, sbA.toString());
            return null;
        }

        public View findViewByPosition(int i10) {
            return this.mRecyclerView.mLayout.findViewByPosition(i10);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        public o getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i10) {
            this.mRecyclerView.scrollToPosition(i10);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public void normalize(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public void onAnimation(int i10, int i11) {
            PointF pointFComputeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f10 = pointFComputeScrollVectorForPosition.x;
                if (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || pointFComputeScrollVectorForPosition.y != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    recyclerView.scrollStep((int) Math.signum(f10), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.a(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i10, i11, recyclerView.mState, this.mRecyclingAction);
                a aVar = this.mRecyclingAction;
                boolean z10 = aVar.f2501d >= 0;
                aVar.a(recyclerView);
                if (z10 && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.a();
                }
            }
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        public abstract void onSeekTargetStep(int i10, int i11, z zVar, a aVar);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(View view, z zVar, a aVar);

        public void setTargetPosition(int i10) {
            this.mTargetPosition = i10;
        }

        public void start(RecyclerView recyclerView, o oVar) {
            recyclerView.mViewFlinger.stop();
            if (this.mStarted) {
                StringBuilder sbA = defpackage.a.a("An instance of ");
                sbA.append(getClass().getSimpleName());
                sbA.append(" was started more than once. Each instance of");
                sbA.append(getClass().getSimpleName());
                sbA.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w(RecyclerView.TAG, sbA.toString());
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = oVar;
            int i10 = this.mTargetPosition;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f2505a = i10;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.a();
            this.mStarted = true;
        }

        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.f2505a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    public static class z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2505a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2506b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2507c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2508d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2509e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f2510f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f2511g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f2512h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f2513i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f2514j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f2515k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f2516l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f2517m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f2518n;

        public void a(int i10) {
            if ((this.f2508d & i10) != 0) {
                return;
            }
            StringBuilder sbA = defpackage.a.a("Layout state should be one of ");
            sbA.append(Integer.toBinaryString(i10));
            sbA.append(" but it is ");
            sbA.append(Integer.toBinaryString(this.f2508d));
            throw new IllegalStateException(sbA.toString());
        }

        public int b() {
            return this.f2511g ? this.f2506b - this.f2507c : this.f2509e;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("State{mTargetPosition=");
            sbA.append(this.f2505a);
            sbA.append(", mData=");
            sbA.append((Object) null);
            sbA.append(", mItemCount=");
            sbA.append(this.f2509e);
            sbA.append(", mIsMeasuring=");
            sbA.append(this.f2513i);
            sbA.append(", mPreviousLayoutItemCount=");
            sbA.append(this.f2506b);
            sbA.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sbA.append(this.f2507c);
            sbA.append(", mStructureChanged=");
            sbA.append(this.f2510f);
            sbA.append(", mInPreLayout=");
            sbA.append(this.f2511g);
            sbA.append(", mRunSimpleAnimations=");
            sbA.append(this.f2514j);
            sbA.append(", mRunPredictiveAnimations=");
            return androidx.recyclerview.widget.s.a(sbA, this.f2515k, '}');
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.inscode.autoclicker.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mObserver = new x();
        this.mRecycler = new v();
        this.mViewInfoStore = new f0();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new k();
        this.mItemAnimator = new androidx.recyclerview.widget.f();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new b0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new androidx.recyclerview.widget.n.b() : null;
        this.mState = new z();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        Method method = g0.f34378a;
        int i11 = Build.VERSION.SDK_INT;
        this.mScaledHorizontalScrollFactor = i11 >= 26 ? g0.a.a(viewConfiguration) : g0.a(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = i11 >= 26 ? g0.a.b(viewConfiguration) : g0.a(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f2463a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
        if (p0.e0.d.c(this) == 0) {
            p0.e0.d.s(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.a0(this));
        int[] iArr = i1.a.f31184a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        if (i11 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z10;
        if (z10) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6), typedArrayObtainStyledAttributes.getDrawable(7), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4), typedArrayObtainStyledAttributes.getDrawable(5));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i10, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        if (i11 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        }
        boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
    }

    private void addAnimatingView(c0 c0Var) {
        View view = c0Var.itemView;
        boolean z10 = view.getParent() == this;
        this.mRecycler.l(getChildViewHolder(view));
        if (c0Var.isTmpDetached()) {
            this.mChildHelper.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        androidx.recyclerview.widget.e eVar = this.mChildHelper;
        if (!z10) {
            eVar.a(view, -1, true);
            return;
        }
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            eVar.f2597b.h(iIndexOfChild);
            eVar.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    private void animateChange(c0 c0Var, c0 c0Var2, l.c cVar, l.c cVar2, boolean z10, boolean z11) {
        c0Var.setIsRecyclable(false);
        if (z10) {
            addAnimatingView(c0Var);
        }
        if (c0Var != c0Var2) {
            if (z11) {
                addAnimatingView(c0Var2);
            }
            c0Var.mShadowedHolder = c0Var2;
            addAnimatingView(c0Var);
            this.mRecycler.l(c0Var);
            c0Var2.setIsRecyclable(false);
            c0Var2.mShadowingHolder = c0Var;
        }
        if (this.mItemAnimator.b(c0Var, c0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(c0 c0Var) {
        WeakReference<RecyclerView> weakReference = c0Var.mNestedRecyclerView;
        if (weakReference == null) {
            return;
        }
        Object parent = weakReference.get();
        while (true) {
            View view = (View) parent;
            while (true) {
                if (view == null) {
                    c0Var.mNestedRecyclerView = null;
                    return;
                } else {
                    if (view == c0Var.itemView) {
                        return;
                    }
                    parent = view.getParent();
                    if (parent instanceof View) {
                        break;
                    } else {
                        view = null;
                    }
                }
            }
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                Object[] objArr = null;
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e16);
            }
        }
    }

    private boolean didChildRangeChange(int i10, int i11) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i10 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i10 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        q0.b.b(accessibilityEventObtain, i10);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f2513i = false;
        startInterceptRequestLayout();
        f0 f0Var = this.mViewInfoStore;
        f0Var.f2637a.clear();
        f0Var.f2638b.b();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        z zVar = this.mState;
        zVar.f2512h = zVar.f2514j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        zVar.f2511g = zVar.f2515k;
        zVar.f2509e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f2514j) {
            int iE = this.mChildHelper.e();
            for (int i10 = 0; i10 < iE; i10++) {
                c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i10));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    l lVar = this.mItemAnimator;
                    l.e(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    this.mViewInfoStore.c(childViewHolderInt, lVar.m(childViewHolderInt));
                    if (this.mState.f2512h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f2638b.j(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f2515k) {
            saveOldPositions();
            z zVar2 = this.mState;
            boolean z10 = zVar2.f2510f;
            zVar2.f2510f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, zVar2);
            this.mState.f2510f = z10;
            for (int i11 = 0; i11 < this.mChildHelper.e(); i11++) {
                c0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i11));
                if (!childViewHolderInt2.shouldIgnore()) {
                    f0.a orDefault = this.mViewInfoStore.f2637a.getOrDefault(childViewHolderInt2, null);
                    if (!((orDefault == null || (orDefault.f2640a & 4) == 0) ? false : true)) {
                        l.e(childViewHolderInt2);
                        boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                        l lVar2 = this.mItemAnimator;
                        childViewHolderInt2.getUnmodifiedPayloads();
                        l.c cVarM = lVar2.m(childViewHolderInt2);
                        if (zHasAnyOfTheFlags) {
                            recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, cVarM);
                        } else {
                            f0 f0Var2 = this.mViewInfoStore;
                            f0.a orDefault2 = f0Var2.f2637a.getOrDefault(childViewHolderInt2, null);
                            if (orDefault2 == null) {
                                orDefault2 = f0.a.a();
                                f0Var2.f2637a.put(childViewHolderInt2, orDefault2);
                            }
                            orDefault2.f2640a |= 2;
                            orDefault2.f2641b = cVarM;
                        }
                    }
                }
            }
        }
        clearOldPositions();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f2508d = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.f2509e = this.mAdapter.getItemCount();
        z zVar = this.mState;
        zVar.f2507c = 0;
        zVar.f2511g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, zVar);
        z zVar2 = this.mState;
        zVar2.f2510f = false;
        this.mPendingSavedState = null;
        zVar2.f2514j = zVar2.f2514j && this.mItemAnimator != null;
        zVar2.f2508d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:48:0x010a  */
    /* JADX WARN: Code duplicated, block: B:55:0x012b  */
    private void dispatchLayoutStep3() {
        l.c cVar;
        l.c cVar2;
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        z zVar = this.mState;
        zVar.f2508d = 1;
        if (zVar.f2514j) {
            for (int iE = this.mChildHelper.e() - 1; iE >= 0; iE--) {
                c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(iE));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    Objects.requireNonNull(this.mItemAnimator);
                    l.c cVar3 = new l.c();
                    View view = childViewHolderInt.itemView;
                    cVar3.f2469a = view.getLeft();
                    cVar3.f2470b = view.getTop();
                    view.getRight();
                    view.getBottom();
                    c0 c0VarG = this.mViewInfoStore.f2638b.g(changedHolderKey, null);
                    if (c0VarG == null || c0VarG.shouldIgnore()) {
                        this.mViewInfoStore.b(childViewHolderInt, cVar3);
                    } else {
                        boolean zD = this.mViewInfoStore.d(c0VarG);
                        boolean zD2 = this.mViewInfoStore.d(childViewHolderInt);
                        if (zD && c0VarG == childViewHolderInt) {
                            this.mViewInfoStore.b(childViewHolderInt, cVar3);
                        } else {
                            l.c cVarE = this.mViewInfoStore.e(c0VarG, 4);
                            this.mViewInfoStore.b(childViewHolderInt, cVar3);
                            l.c cVarE2 = this.mViewInfoStore.e(childViewHolderInt, 8);
                            if (cVarE == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, c0VarG);
                            } else {
                                animateChange(c0VarG, childViewHolderInt, cVarE, cVarE2, zD, zD2);
                            }
                        }
                    }
                }
            }
            f0 f0Var = this.mViewInfoStore;
            f0.b bVar = this.mViewInfoProcessCallback;
            int i10 = f0Var.f2637a.f34737e;
            while (true) {
                i10--;
                if (i10 < 0) {
                    break;
                }
                c0 c0VarH = f0Var.f2637a.h(i10);
                f0.a aVarJ = f0Var.f2637a.j(i10);
                int i11 = aVarJ.f2640a;
                if ((i11 & 3) != 3) {
                    if ((i11 & 1) != 0) {
                        cVar = aVarJ.f2641b;
                        if (cVar == null) {
                            RecyclerView recyclerView = RecyclerView.this;
                            recyclerView.mLayout.removeAndRecycleView(c0VarH.itemView, recyclerView.mRecycler);
                        } else {
                            cVar2 = aVarJ.f2642c;
                        }
                    } else if ((i11 & 14) == 14) {
                        RecyclerView.this.animateAppearance(c0VarH, aVarJ.f2641b, aVarJ.f2642c);
                    } else if ((i11 & 12) == 12) {
                        l.c cVar4 = aVarJ.f2641b;
                        l.c cVar5 = aVarJ.f2642c;
                        d dVar = (d) bVar;
                        Objects.requireNonNull(dVar);
                        c0VarH.setIsRecyclable(false);
                        RecyclerView recyclerView2 = RecyclerView.this;
                        boolean z10 = recyclerView2.mDataSetHasChangedAfterLayout;
                        l lVar = recyclerView2.mItemAnimator;
                        if (z10) {
                            if (lVar.b(c0VarH, c0VarH, cVar4, cVar5)) {
                                RecyclerView.this.postAnimationRunner();
                            }
                        } else if (lVar.d(c0VarH, cVar4, cVar5)) {
                            RecyclerView.this.postAnimationRunner();
                        }
                    } else if ((i11 & 4) != 0) {
                        cVar = aVarJ.f2641b;
                        cVar2 = null;
                    } else if ((i11 & 8) != 0) {
                        RecyclerView.this.animateAppearance(c0VarH, aVarJ.f2641b, aVarJ.f2642c);
                    }
                    d dVar2 = (d) bVar;
                    RecyclerView.this.mRecycler.l(c0VarH);
                    RecyclerView.this.animateDisappearance(c0VarH, cVar, cVar2);
                } else {
                    RecyclerView recyclerView3 = RecyclerView.this;
                    recyclerView3.mLayout.removeAndRecycleView(c0VarH.itemView, recyclerView3.mRecycler);
                }
                f0.a.b(aVarJ);
            }
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        z zVar2 = this.mState;
        zVar2.f2506b = zVar2.f2509e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        zVar2.f2514j = false;
        zVar2.f2515k = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<c0> arrayList = this.mRecycler.f2489b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.mLayout;
        if (oVar.mPrefetchMaxObservedInInitialPrefetch) {
            oVar.mPrefetchMaxCountObserved = 0;
            oVar.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.m();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        f0 f0Var2 = this.mViewInfoStore;
        f0Var2.f2637a.clear();
        f0Var2.f2638b.b();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        s sVar = this.mInterceptingOnItemTouchListener;
        if (sVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        sVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            s sVar = this.mOnItemTouchListeners.get(i10);
            if (sVar.c(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = sVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int iE = this.mChildHelper.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iE; i12++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i12));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i10));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        c0 c0VarFindViewHolderForAdapterPosition;
        z zVar = this.mState;
        int i10 = zVar.f2516l;
        if (i10 == -1) {
            i10 = 0;
        }
        int iB = zVar.b();
        for (int i11 = i10; i11 < iB; i11++) {
            c0 c0VarFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i11);
            if (c0VarFindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (c0VarFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return c0VarFindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iB, i10);
        do {
            iMin--;
            if (iMin < 0 || (c0VarFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!c0VarFindViewHolderForAdapterPosition.itemView.hasFocusable());
        return c0VarFindViewHolderForAdapterPosition.itemView;
    }

    public static c0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f2478a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f2479b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2;
        loop0: while (true) {
            id2 = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
            break loop0;
        }
        return id2;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + CoreConstants.DOT + str;
    }

    private p0.q getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new p0.q(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j10, c0 c0Var, c0 c0Var2) {
        int iE = this.mChildHelper.e();
        for (int i10 = 0; i10 < iE; i10++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i10));
            if (childViewHolderInt != c0Var && getChangedHolderKey(childViewHolderInt) == j10) {
                g gVar = this.mAdapter;
                if (gVar == null || !gVar.hasStableIds()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb2.append(childViewHolderInt);
                    sb2.append(" \n View Holder 2:");
                    sb2.append(c0Var);
                    throw new IllegalStateException(androidx.recyclerview.widget.d.a(this, sb2));
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb3.append(childViewHolderInt);
                sb3.append(" \n View Holder 2:");
                sb3.append(c0Var);
                throw new IllegalStateException(androidx.recyclerview.widget.d.a(this, sb3));
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c0Var2 + " cannot be found but it is necessary for " + c0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int iE = this.mChildHelper.e();
        for (int i10 = 0; i10 < iE; i10++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 >= 26 ? p0.e0.l.b(this) : 0) != 0 || i10 < 26) {
            return;
        }
        p0.e0.l.l(this, 8);
    }

    private void initChildrenHelper() {
        this.mChildHelper = new androidx.recyclerview.widget.e(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        byte b10 = -1;
        int i12 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i13 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            b10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                b10 = 0;
            }
        }
        if (i10 == 1) {
            return b10 < 0 || (b10 == 0 && i11 * i12 <= 0);
        }
        if (i10 == 2) {
            return b10 > 0 || (b10 == 0 && i11 * i12 >= 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return b10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return b10 > 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid direction: ");
        sb2.append(i10);
        throw new IllegalArgumentException(androidx.recyclerview.widget.d.a(this, sb2));
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z10;
        boolean z11 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            aVar.l(aVar.f2573b);
            aVar.l(aVar.f2574c);
            aVar.f2577f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.j();
        } else {
            this.mAdapterHelper.c();
        }
        boolean z12 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f2514j = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z10 = this.mDataSetHasChangedAfterLayout) || z12 || this.mLayout.mRequestedSimpleAnimations) && (!z10 || this.mAdapter.hasStableIds());
        z zVar = this.mState;
        if (zVar.f2514j && z12 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z11 = true;
        }
        zVar.f2515k = z11;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:15:0x0057  */
    /* JADX WARN: Code duplicated, block: B:16:0x006e  */
    private void pullGlows(float f10, float f11, float f12, float f13) {
        boolean z10;
        EdgeEffect edgeEffect;
        float width;
        float height;
        boolean z11 = true;
        if (f11 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            if (f11 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                ensureRightGlow();
                edgeEffect = this.mRightGlow;
                width = f11 / getWidth();
                height = f12 / getHeight();
            } else {
                z10 = false;
            }
            if (f13 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                ensureTopGlow();
                androidx.core.widget.d.a.a(this.mTopGlow, (-f13) / getHeight(), f10 / getWidth());
            } else if (f13 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                ensureBottomGlow();
                androidx.core.widget.d.a.a(this.mBottomGlow, f13 / getHeight(), 1.0f - (f10 / getWidth()));
            } else {
                z11 = z10;
            }
            if (z11 && f11 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f13 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                return;
            }
            WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
            p0.e0.d.k(this);
        }
        ensureLeftGlow();
        edgeEffect = this.mLeftGlow;
        width = (-f11) / getWidth();
        height = 1.0f - (f12 / getHeight());
        androidx.core.widget.d.a.a(edgeEffect, width, height);
        z10 = true;
        if (f13 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            ensureTopGlow();
            androidx.core.widget.d.a.a(this.mTopGlow, (-f13) / getHeight(), f10 / getWidth());
        } else if (f13 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            ensureBottomGlow();
            androidx.core.widget.d.a.a(this.mBottomGlow, f13 / getHeight(), 1.0f - (f10 / getWidth()));
        } else {
            z11 = z10;
        }
        if (z11) {
        }
        WeakHashMap<View, m0> weakHashMap2 = p0.e0.f34354a;
        p0.e0.d.k(this);
    }

    private void recoverFocusFromState() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.k(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.e() == 0) {
                requestFocus();
                return;
            }
        }
        View viewFindNextViewToFocus = null;
        c0 c0VarFindViewHolderForItemId = (this.mState.f2517m == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f2517m);
        if (c0VarFindViewHolderForItemId != null && !this.mChildHelper.k(c0VarFindViewHolderForItemId.itemView) && c0VarFindViewHolderForItemId.itemView.hasFocusable()) {
            viewFindNextViewToFocus = c0VarFindViewHolderForItemId.itemView;
        } else if (this.mChildHelper.e() > 0) {
            viewFindNextViewToFocus = findNextViewToFocus();
        }
        if (viewFindNextViewToFocus != null) {
            int i10 = this.mState.f2518n;
            if (i10 != -1 && (viewFindViewById = viewFindNextViewToFocus.findViewById(i10)) != null && viewFindViewById.isFocusable()) {
                viewFindNextViewToFocus = viewFindViewById;
            }
            viewFindNextViewToFocus.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
            p0.e0.d.k(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f2480c) {
                Rect rect = pVar.f2479b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        z zVar = this.mState;
        zVar.f2517m = -1L;
        zVar.f2516l = -1;
        zVar.f2518n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int adapterPosition;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        c0 c0VarFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (c0VarFindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f2517m = this.mAdapter.hasStableIds() ? c0VarFindContainingViewHolder.getItemId() : -1L;
        z zVar = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            adapterPosition = -1;
        } else {
            adapterPosition = c0VarFindContainingViewHolder.isRemoved() ? c0VarFindContainingViewHolder.mOldPosition : c0VarFindContainingViewHolder.getAdapterPosition();
        }
        zVar.f2516l = adapterPosition;
        this.mState.f2518n = getDeepestFocusedViewWithId(c0VarFindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(g gVar, boolean z10, boolean z11) {
        g gVar2 = this.mAdapter;
        if (gVar2 != null) {
            gVar2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z10 || z11) {
            removeAndRecycleViews();
        }
        androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
        aVar.l(aVar.f2573b);
        aVar.l(aVar.f2574c);
        aVar.f2577f = 0;
        g gVar3 = this.mAdapter;
        this.mAdapter = gVar;
        if (gVar != null) {
            gVar.registerAdapterDataObserver(this.mObserver);
            gVar.onAttachedToRecyclerView(this);
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.onAdapterChanged(gVar3, this.mAdapter);
        }
        v vVar = this.mRecycler;
        g gVar4 = this.mAdapter;
        vVar.b();
        u uVarD = vVar.d();
        Objects.requireNonNull(uVarD);
        if (gVar3 != null) {
            uVarD.f2483b--;
        }
        if (!z10 && uVarD.f2483b == 0) {
            uVarD.a();
        }
        if (gVar4 != null) {
            uVarD.f2483b++;
        }
        this.mState.f2510f = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.stop();
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.stopSmoothScroller();
        }
    }

    public void absorbGlows(int i10, int i11) {
        if (i10 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
        p0.e0.d.k(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        o oVar = this.mLayout;
        if (oVar == null || !oVar.onAddFocusables(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    public void addItemDecoration(n nVar) {
        addItemDecoration(nVar, -1);
    }

    public void addItemDecoration(n nVar, int i10) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.mItemDecorations.add(nVar);
        } else {
            this.mItemDecorations.add(i10, nVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(q qVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(qVar);
    }

    public void addOnItemTouchListener(s sVar) {
        this.mOnItemTouchListeners.add(sVar);
    }

    public void addOnScrollListener(t tVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(tVar);
    }

    public void animateAppearance(c0 c0Var, l.c cVar, l.c cVar2) {
        c0Var.setIsRecyclable(false);
        if (this.mItemAnimator.a(c0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(c0 c0Var, l.c cVar, l.c cVar2) {
        addAnimatingView(c0Var);
        c0Var.setIsRecyclable(false);
        if (this.mItemAnimator.c(c0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(androidx.recyclerview.widget.d.a(this, defpackage.a.a(str)));
        }
        throw new IllegalStateException(androidx.recyclerview.widget.d.a(this, defpackage.a.a("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(androidx.recyclerview.widget.d.a(this, defpackage.a.a("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(androidx.recyclerview.widget.d.a(this, defpackage.a.a(""))));
        }
    }

    public boolean canReuseUpdatedViewHolder(c0 c0Var) {
        l lVar = this.mItemAnimator;
        return lVar == null || lVar.g(c0Var, c0Var.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.mLayout.checkLayoutParams((p) layoutParams);
    }

    public void clearOldPositions() {
        int iH = this.mChildHelper.h();
        for (int i10 = 0; i10 < iH; i10++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        v vVar = this.mRecycler;
        int size = vVar.f2490c.size();
        for (int i11 = 0; i11 < size; i11++) {
            vVar.f2490c.get(i11).clearOldPosition();
        }
        int size2 = vVar.f2488a.size();
        for (int i12 = 0; i12 < size2; i12++) {
            vVar.f2488a.get(i12).clearOldPosition();
        }
        ArrayList<c0> arrayList = vVar.f2489b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i13 = 0; i13 < size3; i13++) {
                vVar.f2489b.get(i13).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
            p0.e0.d.k(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i10 = l0.j.f32096a;
            l0.j.a.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            l0.j.a.b();
            return;
        }
        if (this.mAdapterHelper.g()) {
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            int i11 = aVar.f2577f;
            if ((i11 & 4) != 0) {
                if (!((i11 & 11) != 0)) {
                    int i12 = l0.j.f32096a;
                    l0.j.a.a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                    startInterceptRequestLayout();
                    onEnterLayoutOrScroll();
                    this.mAdapterHelper.j();
                    if (!this.mLayoutWasDefered) {
                        if (hasUpdatedView()) {
                            dispatchLayout();
                        } else {
                            this.mAdapterHelper.b();
                        }
                    }
                    stopInterceptRequestLayout(true);
                    onExitLayoutOrScroll();
                } else {
                    if (aVar.g()) {
                        return;
                    }
                    int i13 = l0.j.f32096a;
                    l0.j.a.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                }
            } else {
                if (aVar.g()) {
                    return;
                }
                int i14 = l0.j.f32096a;
                l0.j.a.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
            }
            l0.j.a.b();
        }
    }

    public void defaultOnMeasure(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
        setMeasuredDimension(o.chooseSize(i10, paddingRight, p0.e0.d.e(this)), o.chooseSize(i11, getPaddingBottom() + getPaddingTop(), p0.e0.d.d(this)));
    }

    public void dispatchChildAttached(View view) {
        c0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        g gVar = this.mAdapter;
        if (gVar != null && childViewHolderInt != null) {
            gVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).d(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        c0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        g gVar = this.mAdapter;
        if (gVar != null && childViewHolderInt != null) {
            gVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    public void dispatchLayout() {
        String str;
        if (this.mAdapter == null) {
            str = "No adapter attached; skipping layout";
        } else {
            if (this.mLayout != null) {
                z zVar = this.mState;
                boolean z10 = false;
                zVar.f2513i = false;
                if (zVar.f2508d != 1) {
                    androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
                    if (!aVar.f2574c.isEmpty() && !aVar.f2573b.isEmpty()) {
                        z10 = true;
                    }
                    if (!z10 && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                        this.mLayout.setExactMeasureSpecsFrom(this);
                    }
                    dispatchLayoutStep3();
                    return;
                }
                dispatchLayoutStep1();
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
                dispatchLayoutStep3();
                return;
            }
            str = "No layout manager attached; skipping layout";
        }
        Log.e(TAG, str);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, 0);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, i12);
    }

    public final void dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().f(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().e(i10, i11, i12, i13, iArr);
    }

    public void dispatchOnScrollStateChanged(int i10) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.onScrollStateChanged(i10);
        }
        onScrollStateChanged(i10);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.onScrollStateChanged(this, i10);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i10);
            }
        }
    }

    public void dispatchOnScrolled(int i10, int i11) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        onScrolled(i10, i11);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.onScrolled(this, i10, i11);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i10, i11);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i10;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            c0 c0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (c0Var.itemView.getParent() == this && !c0Var.shouldIgnore() && (i10 = c0Var.mPendingAccessibilityState) != -1) {
                View view = c0Var.itemView;
                WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
                p0.e0.d.s(view, i10);
                c0Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        float paddingRight;
        float paddingBottom;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.mItemDecorations.get(i10).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom2 = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom2, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                paddingRight = getPaddingRight() + (-getWidth());
                paddingBottom = getPaddingBottom() + (-getHeight());
            } else {
                paddingRight = -getWidth();
                paddingBottom = -getHeight();
            }
            canvas.translate(paddingRight, paddingBottom);
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.l()) ? z10 : true) {
            WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
            p0.e0.d.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public void ensureBottomGlow() {
        int measuredWidth;
        int measuredHeight;
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this);
        this.mBottomGlow = edgeEffectA;
        if (this.mClipToPadding) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectA.setSize(measuredWidth, measuredHeight);
    }

    public void ensureLeftGlow() {
        int measuredHeight;
        int measuredWidth;
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this);
        this.mLeftGlow = edgeEffectA;
        if (this.mClipToPadding) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectA.setSize(measuredHeight, measuredWidth);
    }

    public void ensureRightGlow() {
        int measuredHeight;
        int measuredWidth;
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this);
        this.mRightGlow = edgeEffectA;
        if (this.mClipToPadding) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectA.setSize(measuredHeight, measuredWidth);
    }

    public void ensureTopGlow() {
        int measuredWidth;
        int measuredHeight;
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this);
        this.mTopGlow = edgeEffectA;
        if (this.mClipToPadding) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectA.setSize(measuredWidth, measuredHeight);
    }

    public String exceptionLabel() {
        StringBuilder sbA = defpackage.a.a(" ");
        sbA.append(super.toString());
        sbA.append(", adapter:");
        sbA.append(this.mAdapter);
        sbA.append(", layout:");
        sbA.append(this.mLayout);
        sbA.append(", context:");
        sbA.append(getContext());
        return sbA.toString();
    }

    public final void fillRemainingScrollValues(z zVar) {
        if (getScrollState() != 2) {
            Objects.requireNonNull(zVar);
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f2455e;
        overScroller.getFinalX();
        overScroller.getCurrX();
        Objects.requireNonNull(zVar);
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View findChildViewUnder(float f10, float f11) {
        for (int iE = this.mChildHelper.e() - 1; iE >= 0; iE--) {
            View viewD = this.mChildHelper.d(iE);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (f10 >= viewD.getLeft() + translationX && f10 <= viewD.getRight() + translationX && f11 >= viewD.getTop() + translationY && f11 <= viewD.getBottom() + translationY) {
                return viewD;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        Object parent;
        while (true) {
            parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public c0 findContainingViewHolder(View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public c0 findViewHolderForAdapterPosition(int i10) {
        c0 c0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iH = this.mChildHelper.h();
        for (int i11 = 0; i11 < iH; i11++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionFor(childViewHolderInt) == i10) {
                if (!this.mChildHelper.k(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                c0Var = childViewHolderInt;
            }
        }
        return c0Var;
    }

    public c0 findViewHolderForItemId(long j10) {
        g gVar = this.mAdapter;
        c0 c0Var = null;
        if (gVar != null && gVar.hasStableIds()) {
            int iH = this.mChildHelper.h();
            for (int i10 = 0; i10 < iH; i10++) {
                c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j10) {
                    if (!this.mChildHelper.k(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    c0Var = childViewHolderInt;
                }
            }
        }
        return c0Var;
    }

    public c0 findViewHolderForLayoutPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    @Deprecated
    public c0 findViewHolderForPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[SYNTHETIC] */
    public c0 findViewHolderForPosition(int i10, boolean z10) {
        int iH = this.mChildHelper.h();
        c0 c0Var = null;
        for (int i11 = 0; i11 < iH; i11++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z10) {
                    if (childViewHolderInt.mPosition != i10) {
                        continue;
                    } else {
                        if (this.mChildHelper.k(childViewHolderInt.itemView)) {
                            return childViewHolderInt;
                        }
                        c0Var = childViewHolderInt;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i10) {
                    continue;
                } else {
                    if (this.mChildHelper.k(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    c0Var = childViewHolderInt;
                }
            }
        }
        return c0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public boolean fling(int i10, int i11) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = oVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        int i12 = (iCanScrollHorizontally == 0 || Math.abs(i10) < this.mMinFlingVelocity) ? 0 : i10;
        int i13 = (!zCanScrollVertically || Math.abs(i11) < this.mMinFlingVelocity) ? 0 : i11;
        if (i12 == 0 && i13 == 0) {
            return false;
        }
        float f10 = i12;
        float f11 = i13;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f10, f11, z10);
            r rVar = this.mOnFlingListener;
            if (rVar != null && rVar.a(i12, i13)) {
                return true;
            }
            if (z10) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i14 = this.mMaxFlingVelocity;
                int iMax = Math.max(-i14, Math.min(i12, i14));
                int i15 = this.mMaxFlingVelocity;
                int iMax2 = Math.max(-i15, Math.min(i13, i15));
                b0 b0Var = this.mViewFlinger;
                RecyclerView.this.setScrollState(2);
                b0Var.f2454d = 0;
                b0Var.f2453c = 0;
                Interpolator interpolator = b0Var.f2456f;
                Interpolator interpolator2 = sQuinticInterpolator;
                if (interpolator != interpolator2) {
                    b0Var.f2456f = interpolator2;
                    b0Var.f2455e = new OverScroller(RecyclerView.this.getContext(), interpolator2);
                }
                b0Var.f2455e.fling(0, 0, iMax, iMax2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                b0Var.a();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View viewOnFocusSearchFailed;
        boolean z10;
        View viewOnInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i10);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z11 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i11 = i10 == 2 ? 130 : 33;
                z10 = focusFinder.findNextFocus(this, view, i11) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i10 = i11;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.mLayout.canScrollHorizontally()) {
                int i12 = (this.mLayout.getLayoutDirection() == 1) ^ (i10 == 2) ? 66 : 17;
                boolean z12 = focusFinder.findNextFocus(this, view, i12) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i10 = i12;
                }
                z10 = z12;
            }
            if (z10) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i10, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i10);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z11) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                viewOnFocusSearchFailed = this.mLayout.onFocusSearchFailed(view, i10, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                viewOnFocusSearchFailed = viewFindNextFocus;
            }
        }
        if (viewOnFocusSearchFailed == null || viewOnFocusSearchFailed.hasFocusable()) {
            return isPreferredNextFocus(view, viewOnFocusSearchFailed, i10) ? viewOnFocusSearchFailed : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        requestChildOnScreen(viewOnFocusSearchFailed, null);
        return view;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(androidx.recyclerview.widget.d.a(this, defpackage.a.a("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(androidx.recyclerview.widget.d.a(this, defpackage.a.a("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(androidx.recyclerview.widget.d.a(this, defpackage.a.a("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionFor(c0 c0Var) {
        if (c0Var.hasAnyOfTheFlags(524) || !c0Var.isBound()) {
            return -1;
        }
        androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
        int i10 = c0Var.mPosition;
        int size = aVar.f2573b.size();
        for (int i11 = 0; i11 < size; i11++) {
            androidx.recyclerview.widget.a.b bVar = aVar.f2573b.get(i11);
            int i12 = bVar.f2578a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f2579b;
                    if (i13 <= i10) {
                        int i14 = bVar.f2581d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f2579b;
                    if (i15 == i10) {
                        i10 = bVar.f2581d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f2581d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f2579b <= i10) {
                i10 += bVar.f2581d;
            }
        }
        return i10;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.mLayout;
        return oVar != null ? oVar.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(c0 c0Var) {
        return this.mAdapter.hasStableIds() ? c0Var.getItemId() : c0Var.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        c0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        j jVar = this.mChildDrawingOrderCallback;
        return jVar == null ? super.getChildDrawingOrder(i10, i11) : jVar.a(i10, i11);
    }

    public long getChildItemId(View view) {
        c0 childViewHolderInt;
        g gVar = this.mAdapter;
        if (gVar == null || !gVar.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        c0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public c0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public androidx.recyclerview.widget.a0 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public l getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f2480c) {
            return pVar.f2479b;
        }
        if (this.mState.f2511g && (pVar.b() || pVar.f2478a.isInvalid())) {
            return pVar.f2479b;
        }
        Rect rect = pVar.f2479b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i10).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i11 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f2480c = false;
        return rect;
    }

    public n getItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            return this.mItemDecorations.get(i10);
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public u getRecycledViewPool() {
        return this.mRecycler.d();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().h(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.g();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.a(new f());
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(androidx.recyclerview.widget.d.a(this, defpackage.a.a("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new androidx.recyclerview.widget.m(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.inscode.autoclicker.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.inscode.autoclicker.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.inscode.autoclicker.R.dimen.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        l lVar = this.mItemAnimator;
        return lVar != null && lVar.l();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f34401d;
    }

    public void jumpToPositionForSmoothScroller(int i10) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i10);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int iH = this.mChildHelper.h();
        for (int i10 = 0; i10 < iH; i10++) {
            ((p) this.mChildHelper.g(i10).getLayoutParams()).f2480c = true;
        }
        v vVar = this.mRecycler;
        int size = vVar.f2490c.size();
        for (int i11 = 0; i11 < size; i11++) {
            p pVar = (p) vVar.f2490c.get(i11).itemView.getLayoutParams();
            if (pVar != null) {
                pVar.f2480c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int iH = this.mChildHelper.h();
        for (int i10 = 0; i10 < iH; i10++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        v vVar = this.mRecycler;
        int size = vVar.f2490c.size();
        for (int i11 = 0; i11 < size; i11++) {
            c0 c0Var = vVar.f2490c.get(i11);
            if (c0Var != null) {
                c0Var.addFlags(6);
                c0Var.addChangePayload(null);
            }
        }
        g gVar = RecyclerView.this.mAdapter;
        if (gVar == null || !gVar.hasStableIds()) {
            vVar.f();
        }
    }

    public void offsetChildrenHorizontal(int i10) {
        int iE = this.mChildHelper.e();
        for (int i11 = 0; i11 < iE; i11++) {
            this.mChildHelper.d(i11).offsetLeftAndRight(i10);
        }
    }

    public void offsetChildrenVertical(int i10) {
        int iE = this.mChildHelper.e();
        for (int i11 = 0; i11 < iE; i11++) {
            this.mChildHelper.d(i11).offsetTopAndBottom(i10);
        }
    }

    public void offsetPositionRecordsForInsert(int i10, int i11) {
        int iH = this.mChildHelper.h();
        for (int i12 = 0; i12 < iH; i12++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i10) {
                childViewHolderInt.offsetPosition(i11, false);
                this.mState.f2510f = true;
            }
        }
        v vVar = this.mRecycler;
        int size = vVar.f2490c.size();
        for (int i13 = 0; i13 < size; i13++) {
            c0 c0Var = vVar.f2490c.get(i13);
            if (c0Var != null && c0Var.mPosition >= i10) {
                c0Var.offsetPosition(i11, true);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iH = this.mChildHelper.h();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < iH; i20++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i20));
            if (childViewHolderInt != null && (i18 = childViewHolderInt.mPosition) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    childViewHolderInt.offsetPosition(i11 - i10, false);
                } else {
                    childViewHolderInt.offsetPosition(i14, false);
                }
                this.mState.f2510f = true;
            }
        }
        v vVar = this.mRecycler;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i19 = 1;
            i16 = i11;
        }
        int size = vVar.f2490c.size();
        for (int i21 = 0; i21 < size; i21++) {
            c0 c0Var = vVar.f2490c.get(i21);
            if (c0Var != null && (i17 = c0Var.mPosition) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    c0Var.offsetPosition(i11 - i10, false);
                } else {
                    c0Var.offsetPosition(i19, false);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iH = this.mChildHelper.h();
        for (int i13 = 0; i13 < iH; i13++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i13));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i14 = childViewHolderInt.mPosition;
                if (i14 >= i12) {
                    childViewHolderInt.offsetPosition(-i11, z10);
                } else if (i14 >= i10) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                }
                this.mState.f2510f = true;
            }
        }
        v vVar = this.mRecycler;
        int size = vVar.f2490c.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            c0 c0Var = vVar.f2490c.get(size);
            if (c0Var != null) {
                int i15 = c0Var.mPosition;
                if (i15 >= i12) {
                    c0Var.offsetPosition(-i11, z10);
                } else if (i15 >= i10) {
                    c0Var.addFlags(8);
                    vVar.g(size);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<androidx.recyclerview.widget.n> threadLocal = androidx.recyclerview.widget.n.f2716g;
            androidx.recyclerview.widget.n nVar = threadLocal.get();
            this.mGapWorker = nVar;
            if (nVar == null) {
                this.mGapWorker = new androidx.recyclerview.widget.n();
                WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
                Display displayB = p0.e0.e.b(this);
                float f10 = 60.0f;
                if (!isInEditMode() && displayB != null) {
                    float refreshRate = displayB.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f10 = refreshRate;
                    }
                }
                androidx.recyclerview.widget.n nVar2 = this.mGapWorker;
                nVar2.f2720e = (long) (1.0E9f / f10);
                threadLocal.set(nVar2);
            }
            this.mGapWorker.f2718c.add(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.n nVar;
        super.onDetachedFromWindow();
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.k();
        }
        stopScroll();
        this.mIsAttached = false;
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        Objects.requireNonNull(this.mViewInfoStore);
        while (((o0.f) f0.a.f2639d).b() != null) {
        }
        if (!ALLOW_THREAD_GAP_WORK || (nVar = this.mGapWorker) == null) {
            return;
        }
        nVar.f2718c.remove(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mItemDecorations.get(i10).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public void onExitLayoutOrScroll(boolean z10) {
        int i10 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i10;
        if (i10 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z10) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float axisValue;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f10 = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.mLayout.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    f10 = -axisValue2;
                } else if (this.mLayout.canScrollHorizontally()) {
                    axisValue = axisValue2;
                    f10 = 0.0f;
                } else {
                    f10 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f10 = 0.0f;
                axisValue = 0.0f;
            }
            if (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || axisValue != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                scrollByInternal((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f10 * this.mScaledVerticalScrollFactor), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean zCanScrollHorizontally = oVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i10 = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i10, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                StringBuilder sbA = defpackage.a.a("Error processing scroll; pointer index for id ");
                sbA.append(this.mScrollPointerId);
                sbA.append(" not found. Did any MotionEvents get skipped?");
                Log.e(TAG, sbA.toString());
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i11 = x11 - this.mInitialTouchX;
                int i12 = y11 - this.mInitialTouchY;
                if (!zCanScrollHorizontally || Math.abs(i11) <= this.mTouchSlop) {
                    z10 = false;
                } else {
                    this.mLastTouchX = x11;
                    z10 = true;
                }
                if (zCanScrollVertically && Math.abs(i12) > this.mTouchSlop) {
                    this.mLastTouchY = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x12;
            this.mInitialTouchX = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y12;
            this.mInitialTouchY = y12;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = l0.j.f32096a;
        l0.j.a.a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        l0.j.a.b();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(i10, i11);
            return;
        }
        boolean z10 = false;
        if (oVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            if (z10 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f2508d == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i10, i11);
            this.mState.f2513i = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i10, i11);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f2513i = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i10, i11);
                return;
            }
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i10, i11);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            z zVar = this.mState;
            if (zVar.f2515k) {
                zVar.f2511g = true;
            } else {
                this.mAdapterHelper.c();
                this.mState.f2511g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f2515k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        g gVar = this.mAdapter;
        if (gVar != null) {
            this.mState.f2509e = gVar.getItemCount();
        } else {
            this.mState.f2509e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i10, i11);
        stopInterceptRequestLayout(false);
        this.mState.f2511g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        o oVar = this.mLayout;
        if (oVar == null || (parcelable2 = this.mPendingSavedState.f2450c) == null) {
            return;
        }
        oVar.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.f2450c = savedState2.f2450c;
        } else {
            o oVar = this.mLayout;
            savedState.f2450c = oVar != null ? oVar.onSaveInstanceState() : null;
        }
        return savedState;
    }

    public void onScrollStateChanged(int i10) {
    }

    public void onScrolled(int i10, int i11) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d9 A[PHI: r0
  0x00d9: PHI (r0v36 int) = (r0v26 int), (r0v40 int) binds: [B:41:0x00c4, B:46:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        boolean z11 = false;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean zCanScrollHorizontally = oVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
            if (zCanScrollVertically) {
                i10 = zCanScrollHorizontally;
                i10 = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            i10 = zCanScrollHorizontally;
            startNestedScroll(i10, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.addMovement(motionEventObtain);
            this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
            float f10 = zCanScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
            float f11 = zCanScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
            if ((f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f11 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) || !fling((int) f10, (int) f11)) {
                setScrollState(0);
            }
            resetScroll();
            z11 = true;
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                StringBuilder sbA = defpackage.a.a("Error processing scroll; pointer index for id ");
                sbA.append(this.mScrollPointerId);
                sbA.append(" not found. Did any MotionEvents get skipped?");
                Log.e(TAG, sbA.toString());
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            int iMax = this.mLastTouchX - x11;
            int iMax2 = this.mLastTouchY - y11;
            if (this.mScrollState != 1) {
                if (zCanScrollHorizontally) {
                    int i11 = this.mTouchSlop;
                    iMax = iMax > 0 ? Math.max(0, iMax - i11) : Math.min(0, iMax + i11);
                    if (iMax != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (zCanScrollVertically) {
                    int i12 = this.mTouchSlop;
                    iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - i12) : Math.min(0, iMax2 + i12);
                    if (iMax2 != 0) {
                        z10 = true;
                    }
                }
                if (z10) {
                    setScrollState(1);
                }
            }
            int i13 = iMax;
            int i14 = iMax2;
            if (this.mScrollState == 1) {
                int[] iArr3 = this.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                if (dispatchNestedPreScroll(zCanScrollHorizontally ? i13 : 0, zCanScrollVertically ? i14 : 0, iArr3, this.mScrollOffset, 0)) {
                    int[] iArr4 = this.mReusableIntPair;
                    i13 -= iArr4[0];
                    i14 -= iArr4[1];
                    int[] iArr5 = this.mNestedOffsets;
                    int i15 = iArr5[0];
                    int[] iArr6 = this.mScrollOffset;
                    iArr5[0] = i15 + iArr6[0];
                    iArr5[1] = iArr5[1] + iArr6[1];
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int i16 = i14;
                int[] iArr7 = this.mScrollOffset;
                this.mLastTouchX = x11 - iArr7[0];
                this.mLastTouchY = y11 - iArr7[1];
                if (scrollByInternal(zCanScrollHorizontally ? i13 : 0, zCanScrollVertically ? i16 : 0, motionEvent)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                androidx.recyclerview.widget.n nVar = this.mGapWorker;
                if (nVar != null && (i13 != 0 || i16 != 0)) {
                    nVar.a(this, i13, i16);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x12;
            this.mInitialTouchX = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y12;
            this.mInitialTouchY = y12;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (!z11) {
            this.mVelocityTracker.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
        p0.e0.d.m(this, runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z10) {
        this.mDispatchItemsChangedEvent = z10 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(c0 c0Var, l.c cVar) {
        c0Var.setFlags(0, 8192);
        if (this.mState.f2512h && c0Var.isUpdated() && !c0Var.isRemoved() && !c0Var.shouldIgnore()) {
            this.mViewInfoStore.f2638b.j(getChangedHolderKey(c0Var), c0Var);
        }
        this.mViewInfoStore.c(c0Var, cVar);
    }

    public void removeAndRecycleViews() {
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.b();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        androidx.recyclerview.widget.e eVar = this.mChildHelper;
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        boolean z10 = true;
        if (iIndexOfChild == -1) {
            eVar.m(view);
        } else if (eVar.f2597b.d(iIndexOfChild)) {
            eVar.f2597b.f(iIndexOfChild);
            eVar.m(view);
            ((e) eVar.f2596a).c(iIndexOfChild);
        } else {
            z10 = false;
        }
        if (z10) {
            c0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.l(childViewHolderInt);
            this.mRecycler.i(childViewHolderInt);
        }
        stopInterceptRequestLayout(!z10);
        return z10;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z10) {
        c0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(androidx.recyclerview.widget.d.a(this, sb2));
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z10);
    }

    public void removeItemDecoration(n nVar) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(nVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i10));
            return;
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(q qVar) {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(qVar);
    }

    public void removeOnItemTouchListener(s sVar) {
        this.mOnItemTouchListeners.remove(sVar);
        if (this.mInterceptingOnItemTouchListener == sVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(t tVar) {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(tVar);
        }
    }

    public void repositionShadowingViews() {
        c0 c0Var;
        int iE = this.mChildHelper.e();
        for (int i10 = 0; i10 < iE; i10++) {
            View viewD = this.mChildHelper.d(i10);
            c0 childViewHolder = getChildViewHolder(viewD);
            if (childViewHolder != null && (c0Var = childViewHolder.mShadowingHolder) != null) {
                View view = c0Var.itemView;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mOnItemTouchListeners.get(i10).e(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int iH = this.mChildHelper.h();
        for (int i10 = 0; i10 < iH; i10++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = oVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i10 = 0;
            }
            if (!zCanScrollVertically) {
                i11 = 0;
            }
            scrollByInternal(i10, i11, null);
        }
    }

    public boolean scrollByInternal(int i10, int i11, MotionEvent motionEvent) {
        int i12;
        int i13;
        int i14;
        int i15;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i10, i11, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i16 = iArr2[0];
            int i17 = iArr2[1];
            i12 = i17;
            i13 = i16;
            i14 = i10 - i16;
            i15 = i11 - i17;
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i13, i12, i14, i15, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i18 = i14 - iArr4[0];
        int i19 = i15 - iArr4[1];
        boolean z10 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i20 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i20 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !p0.o.a(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i18, motionEvent.getY(), i19);
            }
            considerReleasingGlowsOnScroll(i10, i11);
        }
        if (i13 != 0 || i12 != 0) {
            dispatchOnScrolled(i13, i12);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i13 == 0 && i12 == 0) ? false : true;
    }

    public void scrollStep(int i10, int i11, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i12 = l0.j.f32096a;
        l0.j.a.a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i10 != 0 ? this.mLayout.scrollHorizontallyBy(i10, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i11 != 0 ? this.mLayout.scrollVerticallyBy(i11, this.mRecycler, this.mState) : 0;
        l0.j.a.b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i10) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.scrollToPosition(i10);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.a0 a0Var) {
        this.mAccessibilityDelegate = a0Var;
        p0.e0.q(this, a0Var);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = jVar;
        setChildrenDrawingOrderEnabled(jVar != null);
    }

    public boolean setChildImportantForAccessibilityInternal(c0 c0Var, int i10) {
        if (isComputingLayout()) {
            c0Var.mPendingAccessibilityState = i10;
            this.mPendingAccessibilityImportanceChange.add(c0Var);
            return false;
        }
        View view = c0Var.itemView;
        WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
        p0.e0.d.s(view, i10);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z10;
        super.setClipToPadding(z10);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        Objects.requireNonNull(kVar);
        this.mEdgeEffectFactory = kVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z10) {
        this.mHasFixedSize = z10;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.k();
            this.mItemAnimator.f2463a = null;
        }
        this.mItemAnimator = lVar;
        if (lVar != null) {
            lVar.f2463a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i10) {
        v vVar = this.mRecycler;
        vVar.f2492e = i10;
        vVar.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(o oVar) {
        if (oVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            l lVar = this.mItemAnimator;
            if (lVar != null) {
                lVar.k();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.b();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.b();
        }
        androidx.recyclerview.widget.e eVar = this.mChildHelper;
        androidx.recyclerview.widget.e.a aVar = eVar.f2597b;
        aVar.f2599a = 0L;
        androidx.recyclerview.widget.e.a aVar2 = aVar.f2600b;
        if (aVar2 != null) {
            aVar2.g();
        }
        int size = eVar.f2598c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            androidx.recyclerview.widget.e.b bVar = eVar.f2596a;
            View view = eVar.f2598c.get(size);
            e eVar2 = (e) bVar;
            Objects.requireNonNull(eVar2);
            c0 childViewHolderInt = getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
            eVar.f2598c.remove(size);
        }
        e eVar3 = (e) eVar.f2596a;
        int iB = eVar3.b();
        for (int i10 = 0; i10 < iB; i10++) {
            View viewA = eVar3.a(i10);
            RecyclerView.this.dispatchChildDetached(viewA);
            viewA.clearAnimation();
        }
        RecyclerView.this.removeAllViews();
        this.mLayout = oVar;
        if (oVar != null) {
            if (oVar.mRecyclerView != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("LayoutManager ");
                sb2.append(oVar);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(androidx.recyclerview.widget.d.a(oVar.mRecyclerView, sb2));
            }
            oVar.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        p0.q scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f34401d) {
            View view = scrollingChildHelper.f34400c;
            WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
            p0.e0.i.z(view);
        }
        scrollingChildHelper.f34401d = z10;
    }

    public void setOnFlingListener(r rVar) {
        this.mOnFlingListener = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.mScrollListener = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.mPreserveFocusAfterLayout = z10;
    }

    public void setRecycledViewPool(u uVar) {
        v vVar = this.mRecycler;
        u uVar2 = vVar.f2494g;
        if (uVar2 != null) {
            uVar2.f2483b--;
        }
        vVar.f2494g = uVar;
        if (uVar == null || RecyclerView.this.getAdapter() == null) {
            return;
        }
        vVar.f2494g.f2483b++;
    }

    public void setRecyclerListener(w wVar) {
        this.mRecyclerListener = wVar;
    }

    void setScrollState(int i10) {
        if (i10 == this.mScrollState) {
            return;
        }
        this.mScrollState = i10;
        if (i10 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 == 0) {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else if (i10 != 1) {
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
        this.mTouchSlop = scaledTouchSlop;
    }

    public void setViewCacheExtension(a0 a0Var) {
        this.mRecycler.f2495h = a0Var;
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int iA = accessibilityEvent != null ? q0.b.a(accessibilityEvent) : 0;
        this.mEatenAccessibilityChangeFlags |= iA != 0 ? iA : 0;
        return true;
    }

    public void smoothScrollBy(int i10, int i11) {
        smoothScrollBy(i10, i11, null);
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator) {
        smoothScrollBy(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator, int i12) {
        smoothScrollBy(i10, i11, interpolator, i12, false);
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!oVar.canScrollHorizontally()) {
            i10 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (!(i12 == Integer.MIN_VALUE || i12 > 0)) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            startNestedScroll(i13, 1);
        }
        this.mViewFlinger.b(i10, i11, i12, interpolator);
    }

    public void smoothScrollToPosition(int i10) {
        if (this.mLayoutSuppressed) {
            return;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.smoothScrollToPosition(this, this.mState, i10);
        }
    }

    public void startInterceptRequestLayout() {
        int i10 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i10;
        if (i10 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().i(i10, 0);
    }

    public boolean startNestedScroll(int i10, int i11) {
        return getScrollingChildHelper().i(i10, i11);
    }

    public void stopInterceptRequestLayout(boolean z10) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z10 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z10 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().j(0);
    }

    public void stopNestedScroll(int i10) {
        getScrollingChildHelper().j(i10);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(g gVar, boolean z10) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, true, z10);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i10, int i11, Object obj) {
        int i12;
        int i13;
        int iH = this.mChildHelper.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < iH; i15++) {
            View viewG = this.mChildHelper.g(i15);
            c0 childViewHolderInt = getChildViewHolderInt(viewG);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i13 = childViewHolderInt.mPosition) >= i10 && i13 < i14) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((p) viewG.getLayoutParams()).f2480c = true;
            }
        }
        v vVar = this.mRecycler;
        int size = vVar.f2490c.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            c0 c0Var = vVar.f2490c.get(size);
            if (c0Var != null && (i12 = c0Var.mPosition) >= i10 && i12 < i14) {
                c0Var.addFlags(2);
                vVar.g(size);
            }
        }
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr, i14, null);
    }

    public boolean hasNestedScrollingParent(int i10) {
        return getScrollingChildHelper().g(i10) != null;
    }
}
