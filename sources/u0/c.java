package u0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Interpolator f35921x = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35923b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f35925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f35926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f35927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f35928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f35929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f35930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f35931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f35933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f35934m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f35935n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35936o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f35937p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35938q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public OverScroller f35939r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0423c f35940s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f35941t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f35942u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ViewGroup f35943v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35924c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Runnable f35944w = new b();

    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.u(0);
        }
    }

    /* JADX INFO: renamed from: u0.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0423c {
        public int clampViewPositionHorizontal(View view, int i10, int i11) {
            return 0;
        }

        public int clampViewPositionVertical(View view, int i10, int i11) {
            return 0;
        }

        public int getOrderedChildIndex(int i10) {
            return i10;
        }

        public int getViewHorizontalDragRange(View view) {
            return 0;
        }

        public int getViewVerticalDragRange(View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i10, int i11) {
        }

        public boolean onEdgeLock(int i10) {
            return false;
        }

        public void onEdgeTouched(int i10, int i11) {
        }

        public void onViewCaptured(View view, int i10) {
        }

        public void onViewDragStateChanged(int i10) {
        }

        public void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
        }

        public void onViewReleased(View view, float f10, float f11) {
        }

        public abstract boolean tryCaptureView(View view, int i10);
    }

    public c(Context context, ViewGroup viewGroup, AbstractC0423c abstractC0423c) {
        if (abstractC0423c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f35943v = viewGroup;
        this.f35940s = abstractC0423c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f35937p = i10;
        this.f35936o = i10;
        this.f35923b = viewConfiguration.getScaledTouchSlop();
        this.f35934m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f35935n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f35939r = new OverScroller(context, f35921x);
    }

    public static c j(ViewGroup viewGroup, float f10, AbstractC0423c abstractC0423c) {
        c cVar = new c(viewGroup.getContext(), viewGroup, abstractC0423c);
        cVar.f35923b = (int) ((1.0f / f10) * cVar.f35923b);
        return cVar;
    }

    public void a() {
        this.f35924c = -1;
        float[] fArr = this.f35925d;
        if (fArr != null) {
            Arrays.fill(fArr, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            Arrays.fill(this.f35926e, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            Arrays.fill(this.f35927f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            Arrays.fill(this.f35928g, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            Arrays.fill(this.f35929h, 0);
            Arrays.fill(this.f35930i, 0);
            Arrays.fill(this.f35931j, 0);
            this.f35932k = 0;
        }
        VelocityTracker velocityTracker = this.f35933l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f35933l = null;
        }
    }

    public void b(View view, int i10) {
        if (view.getParent() != this.f35943v) {
            StringBuilder sbA = defpackage.a.a("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            sbA.append(this.f35943v);
            sbA.append(")");
            throw new IllegalArgumentException(sbA.toString());
        }
        this.f35941t = view;
        this.f35924c = i10;
        this.f35940s.onViewCaptured(view, i10);
        u(1);
    }

    public final boolean c(float f10, float f11, int i10, int i11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f35929h[i10] & i11) != i11 || (this.f35938q & i11) == 0 || (this.f35931j[i10] & i11) == i11 || (this.f35930i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f35923b;
        if (fAbs <= i12 && fAbs2 <= i12) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f35940s.onEdgeLock(i11)) {
            return (this.f35930i[i10] & i11) == 0 && fAbs > ((float) this.f35923b);
        }
        int[] iArr = this.f35931j;
        iArr[i10] = iArr[i10] | i11;
        return false;
    }

    public final boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f35940s.getViewHorizontalDragRange(view) > 0;
        boolean z11 = this.f35940s.getViewVerticalDragRange(view) > 0;
        if (z10 && z11) {
            float f12 = (f11 * f11) + (f10 * f10);
            int i10 = this.f35923b;
            return f12 > ((float) (i10 * i10));
        }
        if (z10) {
            return Math.abs(f10) > ((float) this.f35923b);
        }
        return z11 && Math.abs(f11) > ((float) this.f35923b);
    }

    public final float e(float f10, float f11, float f12) {
        float fAbs = Math.abs(f10);
        if (fAbs < f11) {
            return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        if (fAbs > f12) {
            return f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? f12 : -f12;
        }
        return f10;
    }

    public final int f(int i10, int i11, int i12) {
        int iAbs = Math.abs(i10);
        if (iAbs < i11) {
            return 0;
        }
        if (iAbs > i12) {
            return i10 > 0 ? i12 : -i12;
        }
        return i10;
    }

    public final void g(int i10) {
        if (this.f35925d == null || !n(i10)) {
            return;
        }
        this.f35925d[i10] = 0.0f;
        this.f35926e[i10] = 0.0f;
        this.f35927f[i10] = 0.0f;
        this.f35928g[i10] = 0.0f;
        this.f35929h[i10] = 0;
        this.f35930i[i10] = 0;
        this.f35931j[i10] = 0;
        this.f35932k = (~(1 << i10)) & this.f35932k;
    }

    public final int h(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f35943v.getWidth();
        float f10 = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / width) - 0.5f) * 0.47123894f)) * f10) + f10;
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    public boolean i(boolean z10) {
        if (this.f35922a == 2) {
            boolean zComputeScrollOffset = this.f35939r.computeScrollOffset();
            int currX = this.f35939r.getCurrX();
            int currY = this.f35939r.getCurrY();
            int left = currX - this.f35941t.getLeft();
            int top = currY - this.f35941t.getTop();
            if (left != 0) {
                View view = this.f35941t;
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f35941t;
                WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f35940s.onViewPositionChanged(this.f35941t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f35939r.getFinalX() && currY == this.f35939r.getFinalY()) {
                this.f35939r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z10) {
                    this.f35943v.post(this.f35944w);
                } else {
                    u(0);
                }
            }
        }
        return this.f35922a == 2;
    }

    public final void k(float f10, float f11) {
        this.f35942u = true;
        this.f35940s.onViewReleased(this.f35941t, f10, f11);
        this.f35942u = false;
        if (this.f35922a == 1) {
            u(0);
        }
    }

    public View l(int i10, int i11) {
        for (int childCount = this.f35943v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f35943v.getChildAt(this.f35940s.getOrderedChildIndex(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean m(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f35941t.getLeft();
        int top = this.f35941t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f35939r.abortAnimation();
            u(0);
            return false;
        }
        View view = this.f35941t;
        int iF = f(i12, (int) this.f35935n, (int) this.f35934m);
        int iF2 = f(i13, (int) this.f35935n, (int) this.f35934m);
        int iAbs = Math.abs(i14);
        int iAbs2 = Math.abs(i15);
        int iAbs3 = Math.abs(iF);
        int iAbs4 = Math.abs(iF2);
        int i16 = iAbs3 + iAbs4;
        int i17 = iAbs + iAbs2;
        if (iF != 0) {
            f10 = iAbs3;
            f11 = i16;
        } else {
            f10 = iAbs;
            f11 = i17;
        }
        float f14 = f10 / f11;
        if (iF2 != 0) {
            f12 = iAbs4;
            f13 = i16;
        } else {
            f12 = iAbs2;
            f13 = i17;
        }
        int iH = h(i14, iF, this.f35940s.getViewHorizontalDragRange(view));
        this.f35939r.startScroll(left, top, i14, i15, (int) ((h(i15, iF2, this.f35940s.getViewVerticalDragRange(view)) * (f12 / f13)) + (iH * f14)));
        u(2);
        return true;
    }

    public boolean n(int i10) {
        return ((1 << i10) & this.f35932k) != 0;
    }

    public final boolean o(int i10) {
        if (n(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public void p(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f35933l == null) {
            this.f35933l = VelocityTracker.obtain();
        }
        this.f35933l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewL = l((int) x10, (int) y10);
            s(x10, y10, pointerId);
            y(viewL, pointerId);
            int i12 = this.f35929h[pointerId];
            int i13 = this.f35938q;
            if ((i12 & i13) != 0) {
                this.f35940s.onEdgeTouched(i12 & i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f35922a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i11 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i11);
                        if (o(pointerId2)) {
                            float x11 = motionEvent.getX(i11);
                            float y11 = motionEvent.getY(i11);
                            float f10 = x11 - this.f35925d[pointerId2];
                            float f11 = y11 - this.f35926e[pointerId2];
                            r(f10, f11, pointerId2);
                            if (this.f35922a != 1) {
                                View viewL2 = l((int) x11, (int) y11);
                                if (d(viewL2, f10, f11) && y(viewL2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i11++;
                    }
                } else {
                    if (!o(this.f35924c)) {
                        return;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f35924c);
                    float x12 = motionEvent.getX(iFindPointerIndex);
                    float y12 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f35927f;
                    int i14 = this.f35924c;
                    int i15 = (int) (x12 - fArr[i14]);
                    int i16 = (int) (y12 - this.f35928g[i14]);
                    int left = this.f35941t.getLeft() + i15;
                    int top = this.f35941t.getTop() + i16;
                    int left2 = this.f35941t.getLeft();
                    int top2 = this.f35941t.getTop();
                    if (i15 != 0) {
                        left = this.f35940s.clampViewPositionHorizontal(this.f35941t, left, i15);
                        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                        this.f35941t.offsetLeftAndRight(left - left2);
                    }
                    int i17 = left;
                    if (i16 != 0) {
                        top = this.f35940s.clampViewPositionVertical(this.f35941t, top, i16);
                        WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
                        this.f35941t.offsetTopAndBottom(top - top2);
                    }
                    int i18 = top;
                    if (i15 != 0 || i16 != 0) {
                        this.f35940s.onViewPositionChanged(this.f35941t, i17, i18, i17 - left2, i18 - top2);
                    }
                }
                t(motionEvent);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    if (this.f35922a == 1 && pointerId3 == this.f35924c) {
                        int pointerCount2 = motionEvent.getPointerCount();
                        while (true) {
                            if (i11 >= pointerCount2) {
                                i10 = -1;
                                break;
                            }
                            int pointerId4 = motionEvent.getPointerId(i11);
                            if (pointerId4 != this.f35924c) {
                                View viewL3 = l((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                                View view = this.f35941t;
                                if (viewL3 == view && y(view, pointerId4)) {
                                    i10 = this.f35924c;
                                    break;
                                }
                            }
                            i11++;
                        }
                        if (i10 == -1) {
                            q();
                        }
                    }
                    g(pointerId3);
                    return;
                }
                int pointerId5 = motionEvent.getPointerId(actionIndex);
                float x13 = motionEvent.getX(actionIndex);
                float y13 = motionEvent.getY(actionIndex);
                s(x13, y13, pointerId5);
                if (this.f35922a == 0) {
                    y(l((int) x13, (int) y13), pointerId5);
                    int i19 = this.f35929h[pointerId5];
                    int i20 = this.f35938q;
                    if ((i19 & i20) != 0) {
                        this.f35940s.onEdgeTouched(i19 & i20, pointerId5);
                        return;
                    }
                    return;
                }
                int i21 = (int) x13;
                int i22 = (int) y13;
                View view2 = this.f35941t;
                if (view2 != null && i21 >= view2.getLeft() && i21 < view2.getRight() && i22 >= view2.getTop() && i22 < view2.getBottom()) {
                    i11 = 1;
                }
                if (i11 != 0) {
                    y(this.f35941t, pointerId5);
                    return;
                }
                return;
            }
            if (this.f35922a == 1) {
                k(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            }
        } else if (this.f35922a == 1) {
            q();
        }
        a();
    }

    public final void q() {
        this.f35933l.computeCurrentVelocity(1000, this.f35934m);
        k(e(this.f35933l.getXVelocity(this.f35924c), this.f35935n, this.f35934m), e(this.f35933l.getYVelocity(this.f35924c), this.f35935n, this.f35934m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [u0.c$c] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r(float f10, float f11, int i10) {
        int i11;
        boolean zC = c(f10, f11, i10, 1);
        ?? r10 = zC;
        if (c(f11, f10, i10, 4)) {
            r10 = (zC ? 1 : 0) | 4;
        }
        ?? r11 = r10;
        if (c(f10, f11, i10, 2)) {
            r11 = (r10 == true ? 1 : 0) | 2;
        }
        ?? r12 = r11;
        if (c(f11, f10, i10, 8)) {
            i11 = (r11 == true ? 1 : 0) | 8;
        }
        if (r12 == 0) {
            r12 = i11;
            return;
        }
        r12 = i11;
        int[] iArr = this.f35930i;
        iArr[i10] = (iArr[i10] | r12) == true ? 1 : 0;
        this.f35940s.onEdgeDragStarted(r12, i10);
    }

    public final void s(float f10, float f11, int i10) {
        float[] fArr = this.f35925d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f35926e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f35927f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f35928g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f35929h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f35930i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f35931j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f35925d = fArr2;
            this.f35926e = fArr3;
            this.f35927f = fArr4;
            this.f35928g = fArr5;
            this.f35929h = iArr;
            this.f35930i = iArr2;
            this.f35931j = iArr3;
        }
        float[] fArr9 = this.f35925d;
        this.f35927f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f35926e;
        this.f35928g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f35929h;
        int i12 = (int) f10;
        int i13 = (int) f11;
        int i14 = i12 < this.f35943v.getLeft() + this.f35936o ? 1 : 0;
        if (i13 < this.f35943v.getTop() + this.f35936o) {
            i14 |= 4;
        }
        if (i12 > this.f35943v.getRight() - this.f35936o) {
            i14 |= 2;
        }
        if (i13 > this.f35943v.getBottom() - this.f35936o) {
            i14 |= 8;
        }
        iArr7[i10] = i14;
        this.f35932k |= 1 << i10;
    }

    public final void t(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (o(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f35927f[pointerId] = x10;
                this.f35928g[pointerId] = y10;
            }
        }
    }

    public void u(int i10) {
        this.f35943v.removeCallbacks(this.f35944w);
        if (this.f35922a != i10) {
            this.f35922a = i10;
            this.f35940s.onViewDragStateChanged(i10);
            if (this.f35922a == 0) {
                this.f35941t = null;
            }
        }
    }

    public boolean v(int i10, int i11) {
        if (this.f35942u) {
            return m(i10, i11, (int) this.f35933l.getXVelocity(this.f35924c), (int) this.f35933l.getYVelocity(this.f35924c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ff  */
    public boolean w(MotionEvent motionEvent) {
        boolean z10;
        View viewL;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f35933l == null) {
            this.f35933l = VelocityTracker.obtain();
        }
        this.f35933l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                a();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    a();
                } else if (actionMasked == 5) {
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    float x10 = motionEvent.getX(actionIndex);
                    float y10 = motionEvent.getY(actionIndex);
                    s(x10, y10, pointerId);
                    int i10 = this.f35922a;
                    if (i10 == 0) {
                        int i11 = this.f35929h[pointerId] & this.f35938q;
                        if (i11 != 0) {
                            this.f35940s.onEdgeTouched(i11, pointerId);
                        }
                    } else if (i10 == 2 && (viewL = l((int) x10, (int) y10)) == this.f35941t) {
                        y(viewL, pointerId);
                    }
                } else if (actionMasked == 6) {
                    g(motionEvent.getPointerId(actionIndex));
                }
            } else if (this.f35925d != null && this.f35926e != null) {
                int pointerCount = motionEvent.getPointerCount();
                for (int i12 = 0; i12 < pointerCount; i12++) {
                    int pointerId2 = motionEvent.getPointerId(i12);
                    if (o(pointerId2)) {
                        float x11 = motionEvent.getX(i12);
                        float y11 = motionEvent.getY(i12);
                        float f10 = x11 - this.f35925d[pointerId2];
                        float f11 = y11 - this.f35926e[pointerId2];
                        View viewL2 = l((int) x11, (int) y11);
                        boolean z11 = viewL2 != null && d(viewL2, f10, f11);
                        if (!z11) {
                            r(f10, f11, pointerId2);
                            if (this.f35922a != 1) {
                                break;
                            }
                        } else {
                            int left = viewL2.getLeft();
                            int i13 = (int) f10;
                            int iClampViewPositionHorizontal = this.f35940s.clampViewPositionHorizontal(viewL2, left + i13, i13);
                            int top = viewL2.getTop();
                            int i14 = (int) f11;
                            int iClampViewPositionVertical = this.f35940s.clampViewPositionVertical(viewL2, top + i14, i14);
                            int viewHorizontalDragRange = this.f35940s.getViewHorizontalDragRange(viewL2);
                            int viewVerticalDragRange = this.f35940s.getViewVerticalDragRange(viewL2);
                            if ((viewHorizontalDragRange == 0 || (viewHorizontalDragRange > 0 && iClampViewPositionHorizontal == left)) && (viewVerticalDragRange == 0 || (viewVerticalDragRange > 0 && iClampViewPositionVertical == top))) {
                                break;
                            }
                            r(f10, f11, pointerId2);
                            if (this.f35922a != 1 || (z11 && y(viewL2, pointerId2))) {
                                break;
                            }
                        }
                    }
                }
                t(motionEvent);
            }
            z10 = false;
        } else {
            float x12 = motionEvent.getX();
            float y12 = motionEvent.getY();
            z10 = false;
            int pointerId3 = motionEvent.getPointerId(0);
            s(x12, y12, pointerId3);
            View viewL3 = l((int) x12, (int) y12);
            if (viewL3 == this.f35941t && this.f35922a == 2) {
                y(viewL3, pointerId3);
            }
            int i15 = this.f35929h[pointerId3] & this.f35938q;
            if (i15 != 0) {
                this.f35940s.onEdgeTouched(i15, pointerId3);
            }
        }
        if (this.f35922a == 1) {
            return true;
        }
        return z10;
    }

    public boolean x(View view, int i10, int i11) {
        this.f35941t = view;
        this.f35924c = -1;
        boolean zM = m(i10, i11, 0, 0);
        if (!zM && this.f35922a == 0 && this.f35941t != null) {
            this.f35941t = null;
        }
        return zM;
    }

    public boolean y(View view, int i10) {
        if (view == this.f35941t && this.f35924c == i10) {
            return true;
        }
        if (view == null || !this.f35940s.tryCaptureView(view, i10)) {
            return false;
        }
        this.f35924c = i10;
        b(view, i10);
        return true;
    }
}
