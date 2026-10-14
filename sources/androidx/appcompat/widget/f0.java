package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f1210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f1211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Runnable f1212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1213i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f1215k = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = f0.this.f1210f.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = f0.this;
            f0Var.a();
            View view = f0Var.f1210f;
            if (view.isEnabled() && !view.isLongClickable() && f0Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                f0Var.f1213i = true;
            }
        }
    }

    public f0(View view) {
        this.f1210f = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1207c = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1208d = tapTimeout;
        this.f1209e = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        Runnable runnable = this.f1212h;
        if (runnable != null) {
            this.f1210f.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1211g;
        if (runnable2 != null) {
            this.f1210f.removeCallbacks(runnable2);
        }
    }

    public abstract j.f b();

    public boolean c() {
        j.f fVarB = b();
        if (fVarB == null || fVarB.a()) {
            return true;
        }
        fVarB.show();
        return true;
    }

    public boolean d() {
        j.f fVarB = b();
        if (fVarB == null || !fVarB.a()) {
            return true;
        }
        fVarB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        d0 d0Var;
        boolean z13 = this.f1213i;
        if (z13) {
            View view2 = this.f1210f;
            j.f fVarB = b();
            if (fVarB == null || !fVarB.a() || (d0Var = (d0) fVarB.h()) == null || !d0Var.isShown()) {
                z12 = false;
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f1215k;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                int[] iArr2 = this.f1215k;
                d0Var.getLocationOnScreen(iArr2);
                motionEventObtainNoHistory.offsetLocation(-iArr2[0], -iArr2[1]);
                boolean zB = d0Var.b(motionEventObtainNoHistory, this.f1214j);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z14 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z14) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            z11 = z12 || !d();
        } else {
            View view3 = this.f1210f;
            if (view3.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f1214j = motionEvent.getPointerId(0);
                    if (this.f1211g == null) {
                        this.f1211g = new a();
                    }
                    view3.postDelayed(this.f1211g, this.f1208d);
                    if (this.f1212h == null) {
                        this.f1212h = new b();
                    }
                    view3.postDelayed(this.f1212h, this.f1209e);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f1214j);
                    if (iFindPointerIndex >= 0) {
                        float x10 = motionEvent.getX(iFindPointerIndex);
                        float y10 = motionEvent.getY(iFindPointerIndex);
                        float f10 = this.f1207c;
                        float f11 = -f10;
                        if (!(x10 >= f11 && y10 >= f11 && x10 < ((float) (view3.getRight() - view3.getLeft())) + f10 && y10 < ((float) (view3.getBottom() - view3.getTop())) + f10)) {
                            a();
                            view3.getParent().requestDisallowInterceptTouchEvent(true);
                            z10 = true;
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z10 = false;
            } else {
                z10 = false;
            }
            z11 = z10 && c();
            if (z11) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0);
                this.f1210f.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f1213i = z11;
        return z11 || z13;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1213i = false;
        this.f1214j = -1;
        Runnable runnable = this.f1211g;
        if (runnable != null) {
            this.f1210f.removeCallbacks(runnable);
        }
    }
}
