package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;
import q0.g;
import u0.c;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    private boolean interceptingEvents;
    public OnDismissListener listener;
    private boolean sensitivitySet;
    public c viewDragHelper;
    private float sensitivity = 0.0f;
    public int swipeDirection = 2;
    public float dragDismissThreshold = 0.5f;
    public float alphaStartSwipeDistance = 0.0f;
    public float alphaEndSwipeDistance = 0.5f;
    private final c.AbstractC0423c dragCallback = new c.AbstractC0423c() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1
        private static final int INVALID_POINTER_ID = -1;
        private int activePointerId = -1;
        private int originalCapturedViewLeft;

        private boolean shouldDismiss(View view, float f10) {
            if (f10 == 0.0f) {
                return Math.abs(view.getLeft() - this.originalCapturedViewLeft) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.dragDismissThreshold);
            }
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            boolean z10 = e0.e.d(view) == 1;
            int i10 = SwipeDismissBehavior.this.swipeDirection;
            if (i10 == 2) {
                return true;
            }
            if (i10 == 0) {
                if (z10) {
                    if (f10 >= 0.0f) {
                        return false;
                    }
                } else if (f10 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            if (z10) {
                if (f10 <= 0.0f) {
                    return false;
                }
            } else if (f10 >= 0.0f) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001e  */
        /* JADX WARN: Code duplicated, block: B:9:0x0014  */
        @Override // u0.c.AbstractC0423c
        public int clampViewPositionHorizontal(View view, int i10, int i11) {
            int width;
            int width2;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            boolean z10 = e0.e.d(view) == 1;
            int i12 = SwipeDismissBehavior.this.swipeDirection;
            if (i12 == 0) {
                if (z10) {
                    width = this.originalCapturedViewLeft - view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                } else {
                    width = this.originalCapturedViewLeft;
                    width2 = view.getWidth() + width;
                }
            } else if (i12 != 1) {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = view.getWidth() + this.originalCapturedViewLeft;
            } else if (z10) {
                width = this.originalCapturedViewLeft;
                width2 = view.getWidth() + width;
            } else {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = this.originalCapturedViewLeft;
            }
            return SwipeDismissBehavior.clamp(width, i10, width2);
        }

        @Override // u0.c.AbstractC0423c
        public int clampViewPositionVertical(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // u0.c.AbstractC0423c
        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        @Override // u0.c.AbstractC0423c
        public void onViewCaptured(View view, int i10) {
            this.activePointerId = i10;
            this.originalCapturedViewLeft = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // u0.c.AbstractC0423c
        public void onViewDragStateChanged(int i10) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i10);
            }
        }

        @Override // u0.c.AbstractC0423c
        public void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.alphaStartSwipeDistance) + this.originalCapturedViewLeft;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.alphaEndSwipeDistance) + this.originalCapturedViewLeft;
            float f10 = i10;
            if (f10 <= width) {
                view.setAlpha(1.0f);
            } else if (f10 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.clamp(0.0f, 1.0f - SwipeDismissBehavior.fraction(width, width2, f10), 1.0f));
            }
        }

        @Override // u0.c.AbstractC0423c
        public void onViewReleased(View view, float f10, float f11) {
            int i10;
            boolean z10;
            OnDismissListener onDismissListener;
            this.activePointerId = -1;
            int width = view.getWidth();
            if (shouldDismiss(view, f10)) {
                int left = view.getLeft();
                int i11 = this.originalCapturedViewLeft;
                i10 = left < i11 ? i11 - width : i11 + width;
                z10 = true;
            } else {
                i10 = this.originalCapturedViewLeft;
                z10 = false;
            }
            if (SwipeDismissBehavior.this.viewDragHelper.v(i10, view.getTop())) {
                SettleRunnable settleRunnable = new SettleRunnable(view, z10);
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                e0.d.m(view, settleRunnable);
            } else {
                if (!z10 || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(view);
            }
        }

        @Override // u0.c.AbstractC0423c
        public boolean tryCaptureView(View view, int i10) {
            int i11 = this.activePointerId;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.canSwipeDismissView(view);
        }
    };

    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i10);
    }

    public class SettleRunnable implements Runnable {
        private final boolean dismiss;
        private final View view;

        public SettleRunnable(View view, boolean z10) {
            this.view = view;
            this.dismiss = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDismissListener onDismissListener;
            c cVar = SwipeDismissBehavior.this.viewDragHelper;
            if (cVar != null && cVar.i(true)) {
                View view = this.view;
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                e0.d.m(view, this);
            } else {
                if (!this.dismiss || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(this.view);
            }
        }
    }

    public static float clamp(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    public static int clamp(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        c cVar;
        if (this.viewDragHelper == null) {
            if (this.sensitivitySet) {
                cVar = c.j(viewGroup, this.sensitivity, this.dragCallback);
            } else {
                cVar = new c(viewGroup.getContext(), viewGroup, this.dragCallback);
            }
            this.viewDragHelper = cVar;
        }
    }

    public static float fraction(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    private void updateAccessibilityActions(View view) {
        e0.n(1048576, view);
        e0.j(view, 0);
        if (canSwipeDismissView(view)) {
            e0.o(view, q0.c.a.f34756l, null, new g() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                @Override // q0.g
                public boolean perform(View view2, g.a aVar) {
                    boolean z10 = false;
                    if (!SwipeDismissBehavior.this.canSwipeDismissView(view2)) {
                        return false;
                    }
                    WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                    boolean z11 = e0.e.d(view2) == 1;
                    int i10 = SwipeDismissBehavior.this.swipeDirection;
                    if ((i10 == 0 && z11) || (i10 == 1 && !z11)) {
                        z10 = true;
                    }
                    int width = view2.getWidth();
                    if (z10) {
                        width = -width;
                    }
                    view2.offsetLeftAndRight(width);
                    view2.setAlpha(0.0f);
                    OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(view2);
                    }
                    return true;
                }
            });
        }
    }

    public boolean canSwipeDismissView(View view) {
        return true;
    }

    public int getDragState() {
        c cVar = this.viewDragHelper;
        if (cVar != null) {
            return cVar.f35922a;
        }
        return 0;
    }

    public OnDismissListener getListener() {
        return this.listener;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean zIsPointInChildBounds = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zIsPointInChildBounds = coordinatorLayout.isPointInChildBounds(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = zIsPointInChildBounds;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.interceptingEvents = false;
        }
        if (!zIsPointInChildBounds) {
            return false;
        }
        ensureViewDragHelper(coordinatorLayout);
        return this.viewDragHelper.w(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, v10, i10);
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        if (e0.d.c(v10) == 0) {
            e0.d.s(v10, 1);
            updateAccessibilityActions(v10);
        }
        return zOnLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        c cVar = this.viewDragHelper;
        if (cVar == null) {
            return false;
        }
        cVar.p(motionEvent);
        return true;
    }

    public void setDragDismissDistance(float f10) {
        this.dragDismissThreshold = clamp(0.0f, f10, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f10) {
        this.alphaEndSwipeDistance = clamp(0.0f, f10, 1.0f);
    }

    public void setListener(OnDismissListener onDismissListener) {
        this.listener = onDismissListener;
    }

    public void setSensitivity(float f10) {
        this.sensitivity = f10;
        this.sensitivitySet = true;
    }

    public void setStartAlphaSwipeDistance(float f10) {
        this.alphaStartSwipeDistance = clamp(0.0f, f10, 1.0f);
    }

    public void setSwipeDirection(int i10) {
        this.swipeDirection = i10;
    }
}
