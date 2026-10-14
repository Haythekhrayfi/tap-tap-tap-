package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.i;
import androidx.activity.k;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;
import p0.s0;
import q0.g;
import u0.c;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final int CORNER_ANIMATION_DURATION = 500;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_BottomSheet_Modal;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    private static final int SIGNIFICANT_VEL_THRESHOLD = 500;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";
    public int activePointerId;
    private ColorStateList backgroundTint;
    private final ArrayList<BottomSheetCallback> callbacks;
    private int childHeight;
    public int collapsedOffset;
    private final c.AbstractC0423c dragCallback;
    private boolean draggable;
    public float elevation;
    private int expandHalfwayActionId;
    public int expandedOffset;
    private boolean fitToContents;
    public int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    public int halfExpandedOffset;
    public float halfExpandedRatio;
    public boolean hideable;
    private boolean ignoreEvents;
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    private int insetBottom;
    private int insetTop;
    private ValueAnimator interpolatorAnimator;
    private boolean isShapeExpanded;
    private int lastNestedScrollDy;
    public int lastStableState;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private MaterialShapeDrawable materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean nestedScrolled;
    public WeakReference<View> nestedScrollingChildRef;
    private boolean paddingBottomSystemWindowInsets;
    private boolean paddingLeftSystemWindowInsets;
    private boolean paddingRightSystemWindowInsets;
    private boolean paddingTopSystemWindowInsets;
    public int parentHeight;
    public int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean skipCollapsed;
    public int state;
    private final BottomSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;
    public boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;
    private VelocityTracker velocityTracker;
    public c viewDragHelper;
    public WeakReference<V> viewRef;

    public static abstract class BottomSheetCallback {
        public void onLayout(View view) {
        }

        public abstract void onSlide(View view, float f10);

        public abstract void onStateChanged(View view, int i10);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SaveFlags {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        };
        public boolean fitToContents;
        public boolean hideable;
        public int peekHeight;
        public boolean skipCollapsed;
        public final int state;

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i10) {
            super(parcelable);
            this.state = i10;
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = ((BottomSheetBehavior) bottomSheetBehavior).peekHeight;
            this.fitToContents = ((BottomSheetBehavior) bottomSheetBehavior).fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = ((BottomSheetBehavior) bottomSheetBehavior).skipCollapsed;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StableState {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public class StateSettlingTracker {
        private final Runnable continueSettlingRunnable;
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        private StateSettlingTracker() {
            this.continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.1
                @Override // java.lang.Runnable
                public void run() {
                    StateSettlingTracker.this.isContinueSettlingRunnablePosted = false;
                    c cVar = BottomSheetBehavior.this.viewDragHelper;
                    if (cVar != null && cVar.i(true)) {
                        StateSettlingTracker stateSettlingTracker = StateSettlingTracker.this;
                        stateSettlingTracker.continueSettlingToState(stateSettlingTracker.targetState);
                        return;
                    }
                    StateSettlingTracker stateSettlingTracker2 = StateSettlingTracker.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.state == 2) {
                        bottomSheetBehavior.setStateInternal(stateSettlingTracker2.targetState);
                    }
                }
            };
        }

        public void continueSettlingToState(int i10) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.targetState = i10;
            if (this.isContinueSettlingRunnablePosted) {
                return;
            }
            V v10 = BottomSheetBehavior.this.viewRef.get();
            Runnable runnable = this.continueSettlingRunnable;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.d.m(v10, runnable);
            this.isContinueSettlingRunnablePosted = true;
        }
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.callbacks = new ArrayList<>();
        this.expandHalfwayActionId = -1;
        this.dragCallback = new c.AbstractC0423c() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            private long viewCapturedMillis;

            private boolean releasedLow(View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2;
            }

            @Override // u0.c.AbstractC0423c
            public int clampViewPositionHorizontal(View view, int i10, int i11) {
                return view.getLeft();
            }

            @Override // u0.c.AbstractC0423c
            public int clampViewPositionVertical(View view, int i10, int i11) {
                int expandedOffset = BottomSheetBehavior.this.getExpandedOffset();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return i.j(i10, expandedOffset, bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset);
            }

            @Override // u0.c.AbstractC0423c
            public int getViewVerticalDragRange(View view) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
            }

            @Override // u0.c.AbstractC0423c
            public void onViewDragStateChanged(int i10) {
                if (i10 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // u0.c.AbstractC0423c
            public void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
                BottomSheetBehavior.this.dispatchOnSlide(i11);
            }

            /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
            /* JADX WARN: Code duplicated, block: B:6:0x0010  */
            @Override // u0.c.AbstractC0423c
            public void onViewReleased(View view, float f10, float f11) {
                int i10 = 6;
                if (f11 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.hideable && bottomSheetBehavior.shouldHide(view, f11)) {
                        if ((Math.abs(f10) < Math.abs(f11) && f11 > 500.0f) || releasedLow(view)) {
                            i10 = 5;
                        } else if (BottomSheetBehavior.this.fitToContents || Math.abs(view.getTop() - BottomSheetBehavior.this.getExpandedOffset()) < Math.abs(view.getTop() - BottomSheetBehavior.this.halfExpandedOffset)) {
                            i10 = 3;
                        }
                    } else if (f11 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || Math.abs(f10) > Math.abs(f11)) {
                        int top = view.getTop();
                        if (!BottomSheetBehavior.this.fitToContents) {
                            BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                            int i11 = bottomSheetBehavior2.halfExpandedOffset;
                            if (top < i11) {
                                if (top < Math.abs(top - bottomSheetBehavior2.collapsedOffset)) {
                                    i10 = 3;
                                } else if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                    i10 = 4;
                                }
                            } else if (Math.abs(top - i11) >= Math.abs(top - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                i10 = 4;
                            }
                        } else if (Math.abs(top - BottomSheetBehavior.this.fitToContentsOffset) < Math.abs(top - BottomSheetBehavior.this.collapsedOffset)) {
                            i10 = 3;
                        } else {
                            i10 = 4;
                        }
                    } else if (BottomSheetBehavior.this.fitToContents) {
                        i10 = 4;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.halfExpandedOffset) >= Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                            i10 = 4;
                        }
                    }
                } else if (BottomSheetBehavior.this.fitToContents) {
                    i10 = 3;
                } else {
                    int top3 = view.getTop();
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.viewCapturedMillis;
                    if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        if (!bottomSheetBehavior3.shouldExpandOnUpwardDrag(jCurrentTimeMillis, (top3 * 100.0f) / bottomSheetBehavior3.parentHeight)) {
                            i10 = 4;
                        }
                    } else if (top3 <= BottomSheetBehavior.this.halfExpandedOffset) {
                    }
                    i10 = 3;
                }
                BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                bottomSheetBehavior4.startSettling(view, i10, bottomSheetBehavior4.shouldSkipSmoothAnimation());
            }

            @Override // u0.c.AbstractC0423c
            public boolean tryCaptureView(View view, int i10) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i11 = bottomSheetBehavior.state;
                if (i11 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i11 == 3 && bottomSheetBehavior.activePointerId == i10) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.callbacks = new ArrayList<>();
        this.expandHalfwayActionId = -1;
        this.dragCallback = new c.AbstractC0423c() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            private long viewCapturedMillis;

            private boolean releasedLow(View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2;
            }

            @Override // u0.c.AbstractC0423c
            public int clampViewPositionHorizontal(View view, int i11, int i12) {
                return view.getLeft();
            }

            @Override // u0.c.AbstractC0423c
            public int clampViewPositionVertical(View view, int i11, int i12) {
                int expandedOffset = BottomSheetBehavior.this.getExpandedOffset();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return i.j(i11, expandedOffset, bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset);
            }

            @Override // u0.c.AbstractC0423c
            public int getViewVerticalDragRange(View view) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
            }

            @Override // u0.c.AbstractC0423c
            public void onViewDragStateChanged(int i11) {
                if (i11 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // u0.c.AbstractC0423c
            public void onViewPositionChanged(View view, int i11, int i12, int i13, int i14) {
                BottomSheetBehavior.this.dispatchOnSlide(i12);
            }

            /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
            /* JADX WARN: Code duplicated, block: B:6:0x0010  */
            @Override // u0.c.AbstractC0423c
            public void onViewReleased(View view, float f10, float f11) {
                int i11 = 6;
                if (f11 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.hideable && bottomSheetBehavior.shouldHide(view, f11)) {
                        if ((Math.abs(f10) < Math.abs(f11) && f11 > 500.0f) || releasedLow(view)) {
                            i11 = 5;
                        } else if (BottomSheetBehavior.this.fitToContents || Math.abs(view.getTop() - BottomSheetBehavior.this.getExpandedOffset()) < Math.abs(view.getTop() - BottomSheetBehavior.this.halfExpandedOffset)) {
                            i11 = 3;
                        }
                    } else if (f11 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || Math.abs(f10) > Math.abs(f11)) {
                        int top = view.getTop();
                        if (!BottomSheetBehavior.this.fitToContents) {
                            BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                            int i12 = bottomSheetBehavior2.halfExpandedOffset;
                            if (top < i12) {
                                if (top < Math.abs(top - bottomSheetBehavior2.collapsedOffset)) {
                                    i11 = 3;
                                } else if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                    i11 = 4;
                                }
                            } else if (Math.abs(top - i12) >= Math.abs(top - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                i11 = 4;
                            }
                        } else if (Math.abs(top - BottomSheetBehavior.this.fitToContentsOffset) < Math.abs(top - BottomSheetBehavior.this.collapsedOffset)) {
                            i11 = 3;
                        } else {
                            i11 = 4;
                        }
                    } else if (BottomSheetBehavior.this.fitToContents) {
                        i11 = 4;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.halfExpandedOffset) >= Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                            i11 = 4;
                        }
                    }
                } else if (BottomSheetBehavior.this.fitToContents) {
                    i11 = 3;
                } else {
                    int top3 = view.getTop();
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.viewCapturedMillis;
                    if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        if (!bottomSheetBehavior3.shouldExpandOnUpwardDrag(jCurrentTimeMillis, (top3 * 100.0f) / bottomSheetBehavior3.parentHeight)) {
                            i11 = 4;
                        }
                    } else if (top3 <= BottomSheetBehavior.this.halfExpandedOffset) {
                    }
                    i11 = 3;
                }
                BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                bottomSheetBehavior4.startSettling(view, i11, bottomSheetBehavior4.shouldSkipSmoothAnimation());
            }

            @Override // u0.c.AbstractC0423c
            public boolean tryCaptureView(View view, int i11) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i12 = bottomSheetBehavior.state;
                if (i12 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i12 == 3 && bottomSheetBehavior.activePointerId == i11) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        int i11 = R.styleable.BottomSheetBehavior_Layout_backgroundTint;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i11);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModelDefault = ShapeAppearanceModel.builder(context, attributeSet, R.attr.bottomSheetStyle, DEF_STYLE_RES).build();
        }
        createMaterialShapeDrawableIfNeeded(context);
        createShapeValueAnimator();
        this.elevation = typedArrayObtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i12 = R.styleable.BottomSheetBehavior_Layout_android_maxWidth;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = R.styleable.BottomSheetBehavior_Layout_android_maxHeight;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i14);
        if (typedValuePeekValue == null || (i10 = typedValuePeekValue.data) != -1) {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(i14, -1));
        } else {
            setPeekHeight(i10);
        }
        setHideable(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        setSaveFlags(typedArrayObtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(typedArrayObtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        int i15 = R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i15);
        setExpandedOffset((typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(i15, 0) : typedValuePeekValue2.data);
        this.paddingBottomSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.paddingLeftSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.paddingRightSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.paddingTopSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.marginLeftSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.marginRightSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.marginTopSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private int addAccessibilityActionForState(V v10, int i10, int i11) {
        int iA;
        String string = v10.getResources().getString(i10);
        g gVarCreateAccessibilityViewCommandForState = createAccessibilityViewCommandForState(i11);
        List<q0.c.a> listH = e0.h(v10);
        int i12 = 0;
        while (true) {
            if (i12 >= listH.size()) {
                int i13 = 0;
                int i14 = -1;
                while (true) {
                    int[] iArr = e0.f34357d;
                    if (i13 >= iArr.length || i14 != -1) {
                        break;
                    }
                    int i15 = iArr[i13];
                    boolean z10 = true;
                    for (int i16 = 0; i16 < listH.size(); i16++) {
                        z10 &= listH.get(i16).a() != i15;
                    }
                    if (z10) {
                        i14 = i15;
                    }
                    i13++;
                }
                iA = i14;
                break;
            }
            if (TextUtils.equals(string, listH.get(i12).b())) {
                iA = listH.get(i12).a();
                break;
            }
            i12++;
        }
        if (iA != -1) {
            e0.a(v10, new q0.c.a(iA, string, gVarCreateAccessibilityViewCommandForState));
        }
        return iA;
    }

    private void calculateCollapsedOffset() {
        int iCalculatePeekHeight = calculatePeekHeight();
        if (this.fitToContents) {
            this.collapsedOffset = Math.max(this.parentHeight - iCalculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - iCalculatePeekHeight;
        }
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) ((1.0f - this.halfExpandedRatio) * this.parentHeight);
    }

    private int calculatePeekHeight() {
        int i10;
        if (this.peekHeightAuto) {
            return Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) + this.insetBottom;
        }
        return (this.gestureInsetBottomIgnored || this.paddingBottomSystemWindowInsets || (i10 = this.gestureInsetBottom) <= 0) ? this.peekHeight + this.insetBottom : Math.max(this.peekHeight, i10 + this.peekHeightGestureInsetBuffer);
    }

    private g createAccessibilityViewCommandForState(final int i10) {
        return new g() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            @Override // q0.g
            public boolean perform(View view, g.a aVar) {
                BottomSheetBehavior.this.setState(i10);
                return true;
            }
        };
    }

    private void createMaterialShapeDrawableIfNeeded(Context context) {
        if (this.shapeAppearanceModelDefault == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModelDefault);
        this.materialShapeDrawable = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != null) {
            this.materialShapeDrawable.setFillColor(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
        this.materialShapeDrawable.setTint(typedValue.data);
    }

    private void createShapeValueAnimator() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f);
        this.interpolatorAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.materialShapeDrawable != null) {
                    BottomSheetBehavior.this.materialShapeDrawable.setInterpolation(fFloatValue);
                }
            }
        });
    }

    public static <V extends View> BottomSheetBehavior<V> from(V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).f1620a;
        if (cVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int getChildMeasureSpec(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    private int getTopOffsetForState(int i10) {
        if (i10 == 3) {
            return getExpandedOffset();
        }
        if (i10 == 4) {
            return this.collapsedOffset;
        }
        if (i10 == 5) {
            return this.parentHeight;
        }
        if (i10 == 6) {
            return this.halfExpandedOffset;
        }
        throw new IllegalArgumentException(a.a("Invalid state to get top offset: ", i10));
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private boolean isLayouting(V v10) {
        ViewParent parent = v10.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            if (e0.g.b(v10)) {
                return true;
            }
        }
        return false;
    }

    private void replaceAccessibilityActionForState(V v10, q0.c.a aVar, int i10) {
        e0.o(v10, aVar, null, createAccessibilityViewCommandForState(i10));
    }

    private void reset() {
        this.activePointerId = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(SavedState savedState) {
        int i10 = this.saveFlags;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.peekHeight = savedState.peekHeight;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.fitToContents = savedState.fitToContents;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.hideable = savedState.hideable;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.skipCollapsed = savedState.skipCollapsed;
        }
    }

    private void runAfterLayout(V v10, Runnable runnable) {
        if (isLayouting(v10)) {
            v10.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void setWindowInsetsListener(View view) {
        final boolean z10 = (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.peekHeightAuto) ? false : true;
        if (this.paddingBottomSystemWindowInsets || this.paddingLeftSystemWindowInsets || this.paddingRightSystemWindowInsets || this.marginLeftSystemWindowInsets || this.marginRightSystemWindowInsets || this.marginTopSystemWindowInsets || z10) {
            ViewUtils.doOnApplyWindowInsets(view, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
                /* JADX WARN: Code duplicated, block: B:22:0x007b  */
                /* JADX WARN: Code duplicated, block: B:33:0x009e  */
                @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
                public s0 onApplyWindowInsets(View view2, s0 s0Var, ViewUtils.RelativePadding relativePadding) {
                    boolean z11;
                    h0.g gVarB = s0Var.b(7);
                    h0.g gVarB2 = s0Var.b(32);
                    BottomSheetBehavior.this.insetTop = gVarB.f30460b;
                    boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view2);
                    int paddingBottom = view2.getPaddingBottom();
                    int paddingLeft = view2.getPaddingLeft();
                    int paddingRight = view2.getPaddingRight();
                    if (BottomSheetBehavior.this.paddingBottomSystemWindowInsets) {
                        BottomSheetBehavior.this.insetBottom = s0Var.c();
                        paddingBottom = relativePadding.bottom + BottomSheetBehavior.this.insetBottom;
                    }
                    if (BottomSheetBehavior.this.paddingLeftSystemWindowInsets) {
                        paddingLeft = (zIsLayoutRtl ? relativePadding.end : relativePadding.start) + gVarB.f30459a;
                    }
                    if (BottomSheetBehavior.this.paddingRightSystemWindowInsets) {
                        paddingRight = (zIsLayoutRtl ? relativePadding.start : relativePadding.end) + gVarB.f30461c;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                    boolean z12 = true;
                    if (BottomSheetBehavior.this.marginLeftSystemWindowInsets) {
                        int i10 = marginLayoutParams.leftMargin;
                        int i11 = gVarB.f30459a;
                        if (i10 != i11) {
                            marginLayoutParams.leftMargin = i11;
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                    }
                    if (BottomSheetBehavior.this.marginRightSystemWindowInsets) {
                        int i12 = marginLayoutParams.rightMargin;
                        int i13 = gVarB.f30461c;
                        if (i12 != i13) {
                            marginLayoutParams.rightMargin = i13;
                            z11 = true;
                        }
                    }
                    if (BottomSheetBehavior.this.marginTopSystemWindowInsets) {
                        int i14 = marginLayoutParams.topMargin;
                        int i15 = gVarB.f30460b;
                        if (i14 != i15) {
                            marginLayoutParams.topMargin = i15;
                        } else {
                            z12 = z11;
                        }
                    } else {
                        z12 = z11;
                    }
                    if (z12) {
                        view2.setLayoutParams(marginLayoutParams);
                    }
                    view2.setPadding(paddingLeft, view2.getPaddingTop(), paddingRight, paddingBottom);
                    if (z10) {
                        BottomSheetBehavior.this.gestureInsetBottom = gVarB2.f30462d;
                    }
                    if (BottomSheetBehavior.this.paddingBottomSystemWindowInsets || z10) {
                        BottomSheetBehavior.this.updatePeekHeight(false);
                    }
                    return s0Var;
                }
            });
        }
    }

    private boolean shouldHandleDraggingWithHelper() {
        return this.viewDragHelper != null && (this.draggable || this.state == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i10, boolean z10) {
        int topOffsetForState = getTopOffsetForState(i10);
        c cVar = this.viewDragHelper;
        if (!(cVar != null && (!z10 ? !cVar.x(view, view.getLeft(), topOffsetForState) : !cVar.v(view.getLeft(), topOffsetForState)))) {
            setStateInternal(i10);
            return;
        }
        setStateInternal(2);
        updateDrawableForTargetState(i10);
        this.stateSettlingTracker.continueSettlingToState(i10);
    }

    private void updateAccessibilityActions() {
        V v10;
        int i10;
        q0.c.a aVar;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        e0.n(524288, v10);
        e0.j(v10, 0);
        e0.n(262144, v10);
        e0.j(v10, 0);
        e0.n(1048576, v10);
        e0.j(v10, 0);
        int i11 = this.expandHalfwayActionId;
        if (i11 != -1) {
            e0.n(i11, v10);
            e0.j(v10, 0);
        }
        if (!this.fitToContents && this.state != 6) {
            this.expandHalfwayActionId = addAccessibilityActionForState(v10, R.string.bottomsheet_action_expand_halfway, 6);
        }
        if (this.hideable && this.state != 5) {
            replaceAccessibilityActionForState(v10, q0.c.a.f34756l, 5);
        }
        int i12 = this.state;
        if (i12 == 3) {
            i10 = this.fitToContents ? 4 : 6;
            aVar = q0.c.a.f34755k;
        } else {
            if (i12 != 4) {
                if (i12 != 6) {
                    return;
                }
                replaceAccessibilityActionForState(v10, q0.c.a.f34755k, 4);
                replaceAccessibilityActionForState(v10, q0.c.a.f34754j, 3);
                return;
            }
            i10 = this.fitToContents ? 3 : 6;
            aVar = q0.c.a.f34754j;
        }
        replaceAccessibilityActionForState(v10, aVar, i10);
    }

    private void updateDrawableForTargetState(int i10) {
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        boolean z10 = i10 == 3;
        if (this.isShapeExpanded != z10) {
            this.isShapeExpanded = z10;
            if (this.materialShapeDrawable == null || (valueAnimator = this.interpolatorAnimator) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.interpolatorAnimator.reverse();
                return;
            }
            float f10 = z10 ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : 1.0f;
            this.interpolatorAnimator.setFloatValues(1.0f - f10, f10);
            this.interpolatorAnimator.start();
        }
    }

    private void updateImportantForAccessibility(boolean z10) {
        Map<View, Integer> map;
        int iIntValue;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.importantForAccessibilityMap != null) {
                    return;
                } else {
                    this.importantForAccessibilityMap = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.viewRef.get()) {
                    if (z10) {
                        this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.updateImportantForAccessibilityOnSiblings) {
                            iIntValue = 4;
                            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                            e0.d.s(childAt, iIntValue);
                        }
                    } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                        iIntValue = this.importantForAccessibilityMap.get(childAt).intValue();
                        WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
                        e0.d.s(childAt, iIntValue);
                    }
                }
            }
            if (!z10) {
                this.importantForAccessibilityMap = null;
            } else if (this.updateImportantForAccessibilityOnSiblings) {
                this.viewRef.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePeekHeight(boolean z10) {
        V v10;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state != 4 || (v10 = this.viewRef.get()) == null) {
                return;
            }
            if (z10) {
                setState(4);
            } else {
                v10.requestLayout();
            }
        }
    }

    public void addBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        if (this.callbacks.contains(bottomSheetCallback)) {
            return;
        }
        this.callbacks.add(bottomSheetCallback);
    }

    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    public void dispatchOnSlide(int i10) {
        float f10;
        float expandedOffset;
        V v10 = this.viewRef.get();
        if (v10 == null || this.callbacks.isEmpty()) {
            return;
        }
        int i11 = this.collapsedOffset;
        if (i10 > i11 || i11 == getExpandedOffset()) {
            int i12 = this.collapsedOffset;
            f10 = i12 - i10;
            expandedOffset = this.parentHeight - i12;
        } else {
            int i13 = this.collapsedOffset;
            f10 = i13 - i10;
            expandedOffset = i13 - getExpandedOffset();
        }
        float f11 = f10 / expandedOffset;
        for (int i14 = 0; i14 < this.callbacks.size(); i14++) {
            this.callbacks.get(i14).onSlide(v10, f11);
        }
    }

    public View findScrollingChild(View view) {
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        if (e0.i.p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View viewFindScrollingChild = findScrollingChild(viewGroup.getChildAt(i10));
            if (viewFindScrollingChild != null) {
                return viewFindScrollingChild;
            }
        }
        return null;
    }

    public int getExpandedOffset() {
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        return Math.max(this.expandedOffset, this.paddingTopSystemWindowInsets ? 0 : this.insetTop);
    }

    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public int getLastStableState() {
        return this.lastStableState;
    }

    public MaterialShapeDrawable getMaterialShapeDrawable() {
        return this.materialShapeDrawable;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    public int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
        super.onAttachedToLayoutParams(fVar);
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        c cVar;
        if (!v10.isShown() || !this.draggable) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            if (this.state != 2) {
                WeakReference<View> weakReference = this.nestedScrollingChildRef;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x10, this.initialY)) {
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.touchingScrollingChild = true;
                }
            }
            this.ignoreEvents = this.activePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v10, x10, this.initialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.touchingScrollingChild = false;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        }
        if (!this.ignoreEvents && (cVar = this.viewDragHelper) != null && cVar.w(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || Math.abs(((float) this.initialY) - motionEvent.getY()) <= ((float) this.viewDragHelper.f35923b)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00fc A[LOOP:0: B:58:0x00f4->B:60:0x00fc, LOOP_END] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        int expandedOffset;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        if (e0.d.b(coordinatorLayout) && !e0.d.b(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            setWindowInsetsListener(v10);
            this.viewRef = new WeakReference<>(v10);
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            if (materialShapeDrawable != null) {
                e0.d.q(v10, materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
                float fI = this.elevation;
                if (fI == -1.0f) {
                    fI = e0.i.i(v10);
                }
                materialShapeDrawable2.setElevation(fI);
                boolean z10 = this.state == 3;
                this.isShapeExpanded = z10;
                this.materialShapeDrawable.setInterpolation(z10 ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : 1.0f);
            } else {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    e0.i.q(v10, colorStateList);
                }
            }
            updateAccessibilityActions();
            if (e0.d.c(v10) == 0) {
                e0.d.s(v10, 1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = new c(coordinatorLayout.getContext(), coordinatorLayout, this.dragCallback);
        }
        int top = v10.getTop();
        coordinatorLayout.onLayoutChild(v10, i10);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.childHeight = height;
        int i11 = this.parentHeight;
        int i12 = i11 - height;
        int i13 = this.insetTop;
        if (i12 < i13) {
            if (this.paddingTopSystemWindowInsets) {
                this.childHeight = i11;
            } else {
                this.childHeight = i11 - i13;
            }
        }
        this.fitToContentsOffset = Math.max(0, i11 - this.childHeight);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i14 = this.state;
        if (i14 == 3) {
            expandedOffset = getExpandedOffset();
        } else if (i14 == 6) {
            expandedOffset = this.halfExpandedOffset;
        } else {
            if (!this.hideable || i14 != 5) {
                if (i14 == 4) {
                    expandedOffset = this.collapsedOffset;
                } else if (i14 == 1 || i14 == 2) {
                    v10.offsetTopAndBottom(top - v10.getTop());
                }
                this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v10));
                for (int i15 = 0; i15 < this.callbacks.size(); i15++) {
                    this.callbacks.get(i15).onLayout(v10);
                }
                return true;
            }
            expandedOffset = this.parentHeight;
        }
        v10.offsetTopAndBottom(expandedOffset);
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v10));
        while (i15 < this.callbacks.size()) {
            this.callbacks.get(i15).onLayout(v10);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.maxWidth, marginLayoutParams.width), getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.maxHeight, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
        WeakReference<View> weakReference;
        if (isNestedScrollingCheckEnabled() && (weakReference = this.nestedScrollingChildRef) != null && view == weakReference.get()) {
            return this.state != 3 || super.onNestedPreFling(coordinatorLayout, v10, view, f10, f11);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        int i13;
        int i14;
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!isNestedScrollingCheckEnabled() || view == view2) {
            int top = v10.getTop();
            int i15 = top - i11;
            if (i11 > 0) {
                if (i15 < getExpandedOffset()) {
                    iArr[1] = top - getExpandedOffset();
                    int i16 = -iArr[1];
                    WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                    v10.offsetTopAndBottom(i16);
                    i14 = 3;
                    setStateInternal(i14);
                } else {
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i11;
                    i13 = -i11;
                    WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
                    v10.offsetTopAndBottom(i13);
                    setStateInternal(1);
                }
            } else if (i11 < 0 && !view.canScrollVertically(-1)) {
                int i17 = this.collapsedOffset;
                if (i15 > i17 && !this.hideable) {
                    iArr[1] = top - i17;
                    int i18 = -iArr[1];
                    WeakHashMap<View, m0> weakHashMap3 = e0.f34354a;
                    v10.offsetTopAndBottom(i18);
                    i14 = 4;
                    setStateInternal(i14);
                } else {
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i11;
                    i13 = -i11;
                    WeakHashMap<View, m0> weakHashMap4 = e0.f34354a;
                    v10.offsetTopAndBottom(i13);
                    setStateInternal(1);
                }
            }
            dispatchOnSlide(v10.getTop());
            this.lastNestedScrollDy = i11;
            this.nestedScrolled = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v10, savedState.getSuperState());
        restoreOptionalState(savedState);
        int i10 = savedState.state;
        if (i10 == 1 || i10 == 2) {
            i10 = 4;
        }
        this.state = i10;
        this.lastStableState = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v10) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v10), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
        WeakReference<View> weakReference;
        int i11 = 3;
        if (v10.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        if (!isNestedScrollingCheckEnabled() || ((weakReference = this.nestedScrollingChildRef) != null && view == weakReference.get() && this.nestedScrolled)) {
            if (this.lastNestedScrollDy > 0) {
                if (!this.fitToContents && v10.getTop() > this.halfExpandedOffset) {
                    i11 = 6;
                }
            } else if (this.hideable && shouldHide(v10, getYVelocity())) {
                i11 = 5;
            } else if (this.lastNestedScrollDy == 0) {
                int top = v10.getTop();
                if (!this.fitToContents) {
                    int i12 = this.halfExpandedOffset;
                    if (top < i12) {
                        if (top >= Math.abs(top - this.collapsedOffset)) {
                            if (shouldSkipHalfExpandedStateWhenDragging()) {
                                i11 = 4;
                            } else {
                                i11 = 6;
                            }
                        }
                    } else if (Math.abs(top - i12) < Math.abs(top - this.collapsedOffset)) {
                        i11 = 6;
                    } else {
                        i11 = 4;
                    }
                } else if (Math.abs(top - this.fitToContentsOffset) >= Math.abs(top - this.collapsedOffset)) {
                    i11 = 4;
                }
            } else {
                if (!this.fitToContents) {
                    int top2 = v10.getTop();
                    if (Math.abs(top2 - this.halfExpandedOffset) < Math.abs(top2 - this.collapsedOffset)) {
                        i11 = 6;
                    }
                }
                i11 = 4;
            }
            startSettling(v10, i11, false);
            this.nestedScrolled = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.p(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents) {
            float fAbs = Math.abs(this.initialY - motionEvent.getY());
            c cVar = this.viewDragHelper;
            if (fAbs > cVar.f35923b) {
                cVar.b(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.ignoreEvents;
    }

    public void removeBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        this.callbacks.remove(bottomSheetCallback);
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        Log.w(TAG, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.callbacks.clear();
        if (bottomSheetCallback != null) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public void setDraggable(boolean z10) {
        this.draggable = z10;
    }

    public void setExpandedOffset(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.expandedOffset = i10;
    }

    public void setFitToContents(boolean z10) {
        if (this.fitToContents == z10) {
            return;
        }
        this.fitToContents = z10;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.fitToContents && this.state == 6) ? 3 : this.state);
        updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean z10) {
        this.gestureInsetBottomIgnored = z10;
    }

    public void setHalfExpandedRatio(float f10) {
        if (f10 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.halfExpandedRatio = f10;
        if (this.viewRef != null) {
            calculateHalfExpandedOffset();
        }
    }

    public void setHideable(boolean z10) {
        if (this.hideable != z10) {
            this.hideable = z10;
            if (!z10 && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public void setHideableInternal(boolean z10) {
        this.hideable = z10;
    }

    public void setMaxHeight(int i10) {
        this.maxHeight = i10;
    }

    public void setMaxWidth(int i10) {
        this.maxWidth = i10;
    }

    public void setPeekHeight(int i10) {
        setPeekHeight(i10, false);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015  */
    public final void setPeekHeight(int i10, boolean z10) {
        boolean z11 = true;
        if (i10 == -1) {
            if (this.peekHeightAuto) {
                z11 = false;
            } else {
                this.peekHeightAuto = true;
            }
        } else if (this.peekHeightAuto || this.peekHeight != i10) {
            this.peekHeightAuto = false;
            this.peekHeight = Math.max(0, i10);
        } else {
            z11 = false;
        }
        if (z11) {
            updatePeekHeight(z10);
        }
    }

    public void setSaveFlags(int i10) {
        this.saveFlags = i10;
    }

    public void setSkipCollapsed(boolean z10) {
        this.skipCollapsed = z10;
    }

    public void setState(int i10) {
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(k.a(defpackage.a.a("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.hideable && i10 == 5) {
            Log.w(TAG, "Cannot set state: " + i10);
            return;
        }
        final int i11 = (i10 == 6 && this.fitToContents && getTopOffsetForState(i10) <= this.fitToContentsOffset) ? 3 : i10;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i10);
        } else {
            final V v10 = this.viewRef.get();
            runAfterLayout(v10, new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
                @Override // java.lang.Runnable
                public void run() {
                    BottomSheetBehavior.this.startSettling(v10, i11, false);
                }
            });
        }
    }

    public void setStateInternal(int i10) {
        V v10;
        if (this.state == i10) {
            return;
        }
        this.state = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.hideable && i10 == 5)) {
            this.lastStableState = i10;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            updateImportantForAccessibility(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i10);
        for (int i11 = 0; i11 < this.callbacks.size(); i11++) {
            this.callbacks.get(i11).onStateChanged(v10, i10);
        }
        updateAccessibilityActions();
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z10) {
        this.updateImportantForAccessibilityOnSiblings = z10;
    }

    public boolean shouldExpandOnUpwardDrag(long j10, float f10) {
        return false;
    }

    public boolean shouldHide(View view, float f10) {
        if (this.skipCollapsed) {
            return true;
        }
        if (view.getTop() < this.collapsedOffset) {
            return false;
        }
        return Math.abs(((f10 * HIDE_FRICTION) + ((float) view.getTop())) - ((float) this.collapsedOffset)) / ((float) calculatePeekHeight()) > 0.5f;
    }

    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }
}
