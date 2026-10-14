package r9;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.Iterator;
import java.util.Objects;
import p7.i1;
import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public class d extends View {
    public boolean A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r9.a f35313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1<b> f35314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ValueAnimator f35315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ValueAnimator f35316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f35317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f35318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f35319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AccelerateDecelerateInterpolator f35320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f35321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f35322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f35323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f35324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f35325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f35326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f35327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f35328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f35329s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public s9.b f35330t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Float f35331u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f35332v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public s9.b f35333w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f35334x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f35335y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public c f35336z;

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f35337a;

        public a(d dVar) {
            j0.i(dVar, "this$0");
            this.f35337a = dVar;
        }
    }

    public interface b {
        default void a(Float f10) {
        }

        default void b(float f10) {
        }
    }

    public enum c {
        THUMB,
        THUMB_SECONDARY
    }

    /* JADX INFO: renamed from: r9.d$d, reason: collision with other inner class name */
    public /* synthetic */ class C0402d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35338a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.THUMB.ordinal()] = 1;
            iArr[c.THUMB_SECONDARY.ordinal()] = 2;
            f35338a = iArr;
        }
    }

    public static final class e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f35339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f35340b;

        public e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            j0.i(animator, "animation");
            this.f35340b = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j0.i(animator, "animation");
            d dVar = d.this;
            dVar.f35315e = null;
            if (this.f35340b) {
                return;
            }
            dVar.i(Float.valueOf(this.f35339a), d.this.getThumbValue());
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            j0.i(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j0.i(animator, "animation");
            this.f35340b = false;
        }
    }

    public static final class f implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Float f35342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f35343b;

        public f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            j0.i(animator, "animation");
            this.f35343b = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j0.i(animator, "animation");
            d dVar = d.this;
            dVar.f35316f = null;
            if (this.f35343b) {
                return;
            }
            dVar.j(this.f35342a, dVar.getThumbSecondaryValue());
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            j0.i(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j0.i(animator, "animation");
            this.f35343b = false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f35313c = new r9.a();
        this.f35314d = new i1<>();
        this.f35317g = new e();
        this.f35318h = new f();
        this.f35319i = 300L;
        this.f35320j = new AccelerateDecelerateInterpolator();
        this.f35321k = true;
        this.f35323m = 100.0f;
        this.f35328r = this.f35322l;
        this.f35334x = -1;
        this.f35335y = new a(this);
        this.f35336z = c.THUMB;
        this.A = true;
    }

    public /* synthetic */ d(Context context, AttributeSet attributeSet, int i10, int i11, g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final int getMaxTickmarkOrThumbWidth() {
        Rect bounds;
        Rect bounds2;
        Rect bounds3;
        Rect bounds4;
        if (this.f35334x == -1) {
            Drawable drawable = this.f35324n;
            int iWidth = 0;
            int iWidth2 = (drawable == null || (bounds = drawable.getBounds()) == null) ? 0 : bounds.width();
            Drawable drawable2 = this.f35325o;
            int iMax = Math.max(iWidth2, (drawable2 == null || (bounds2 = drawable2.getBounds()) == null) ? 0 : bounds2.width());
            Drawable drawable3 = this.f35329s;
            int iWidth3 = (drawable3 == null || (bounds3 = drawable3.getBounds()) == null) ? 0 : bounds3.width();
            Drawable drawable4 = this.f35332v;
            if (drawable4 != null && (bounds4 = drawable4.getBounds()) != null) {
                iWidth = bounds4.width();
            }
            this.f35334x = Math.max(iMax, Math.max(iWidth3, iWidth));
        }
        return this.f35334x;
    }

    private final void setBaseParams(ValueAnimator valueAnimator) {
        valueAnimator.setDuration(this.f35319i);
        valueAnimator.setInterpolator(this.f35320j);
    }

    public final float b(int i10) {
        return (this.f35325o == null && this.f35324n == null) ? o(i10) : xc.b.c(o(i10));
    }

    public final float c(float f10) {
        return Math.min(Math.max(f10, this.f35322l), this.f35323m);
    }

    public final boolean e() {
        return this.f35331u != null;
    }

    public final Drawable getActiveTickMarkDrawable() {
        return this.f35324n;
    }

    public final Drawable getActiveTrackDrawable() {
        return this.f35326p;
    }

    public final long getAnimationDuration() {
        return this.f35319i;
    }

    public final boolean getAnimationEnabled() {
        return this.f35321k;
    }

    public final AccelerateDecelerateInterpolator getAnimationInterpolator() {
        return this.f35320j;
    }

    public final Drawable getInactiveTickMarkDrawable() {
        return this.f35325o;
    }

    public final Drawable getInactiveTrackDrawable() {
        return this.f35327q;
    }

    public final boolean getInteractive() {
        return this.A;
    }

    public final float getMaxValue() {
        return this.f35323m;
    }

    public final float getMinValue() {
        return this.f35322l;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        Rect bounds;
        Rect bounds2;
        Rect bounds3;
        Rect bounds4;
        Drawable drawable = this.f35326p;
        int iHeight = 0;
        int iHeight2 = (drawable == null || (bounds = drawable.getBounds()) == null) ? 0 : bounds.height();
        Drawable drawable2 = this.f35327q;
        int iMax = Math.max(iHeight2, (drawable2 == null || (bounds2 = drawable2.getBounds()) == null) ? 0 : bounds2.height());
        Drawable drawable3 = this.f35329s;
        int iHeight3 = (drawable3 == null || (bounds3 = drawable3.getBounds()) == null) ? 0 : bounds3.height();
        Drawable drawable4 = this.f35332v;
        if (drawable4 != null && (bounds4 = drawable4.getBounds()) != null) {
            iHeight = bounds4.height();
        }
        return Math.max(Math.max(iHeight3, iHeight), iMax);
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        Rect bounds;
        Rect bounds2;
        Rect bounds3;
        Rect bounds4;
        int i10 = (int) ((this.f35323m - this.f35322l) + 1);
        Drawable drawable = this.f35326p;
        int iWidth = ((drawable == null || (bounds = drawable.getBounds()) == null) ? 0 : bounds.width()) * i10;
        Drawable drawable2 = this.f35327q;
        int iMax = Math.max(iWidth, ((drawable2 == null || (bounds2 = drawable2.getBounds()) == null) ? 0 : bounds2.width()) * i10);
        Drawable drawable3 = this.f35329s;
        int iWidth2 = (drawable3 == null || (bounds3 = drawable3.getBounds()) == null) ? 0 : bounds3.width();
        Drawable drawable4 = this.f35332v;
        int iMax2 = Math.max(Math.max(iWidth2, (drawable4 == null || (bounds4 = drawable4.getBounds()) == null) ? 0 : bounds4.width()), iMax);
        s9.b bVar = this.f35330t;
        int intrinsicWidth = bVar == null ? 0 : bVar.getIntrinsicWidth();
        s9.b bVar2 = this.f35333w;
        return Math.max(iMax2, Math.max(intrinsicWidth, bVar2 != null ? bVar2.getIntrinsicWidth() : 0));
    }

    public final Drawable getThumbDrawable() {
        return this.f35329s;
    }

    public final s9.b getThumbSecondTextDrawable() {
        return this.f35333w;
    }

    public final Drawable getThumbSecondaryDrawable() {
        return this.f35332v;
    }

    public final Float getThumbSecondaryValue() {
        return this.f35331u;
    }

    public final s9.b getThumbTextDrawable() {
        return this.f35330t;
    }

    public final float getThumbValue() {
        return this.f35328r;
    }

    public final int h(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i10 : size;
        }
        return Math.min(i10, size);
    }

    public final void i(Float f10, float f11) {
        if (f10 != null && f10.floatValue() == f11) {
            return;
        }
        Iterator<b> it = this.f35314d.iterator();
        while (it.hasNext()) {
            it.next().b(f11);
        }
    }

    public final void j(Float f10, Float f11) {
        if (j0.c(f10, f11)) {
            return;
        }
        Iterator<b> it = this.f35314d.iterator();
        while (it.hasNext()) {
            it.next().a(f11);
        }
    }

    public final void k() {
        q(c(this.f35328r), false, true);
        if (e()) {
            Float f10 = this.f35331u;
            p(f10 == null ? null : Float.valueOf(c(f10.floatValue())), false, true);
        }
    }

    public final void l() {
        q(xc.b.c(this.f35328r), false, true);
        Float f10 = this.f35331u;
        if (f10 == null) {
            return;
        }
        p(Float.valueOf(xc.b.c(f10.floatValue())), false, true);
    }

    public final void m(c cVar, float f10, boolean z10) {
        int i10 = C0402d.f35338a[cVar.ordinal()];
        if (i10 == 1) {
            q(f10, z10, false);
        } else {
            if (i10 != 2) {
                throw new jc.g();
            }
            p(Float.valueOf(f10), z10, false);
        }
    }

    public final int n(float f10) {
        return (int) (((f10 - this.f35322l) * (((getWidth() - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth())) / (this.f35323m - this.f35322l));
    }

    public final float o(int i10) {
        return (((this.f35323m - this.f35322l) * i10) / (((getWidth() - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth())) + this.f35322l;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float fMin;
        float fMax;
        j0.i(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft() + (getMaxTickmarkOrThumbWidth() / 2), getPaddingTop());
        r9.a aVar = this.f35313c;
        Drawable drawable = this.f35327q;
        Objects.requireNonNull(aVar);
        j0.i(canvas, "canvas");
        if (drawable != null) {
            drawable.setBounds(0, (aVar.f35305b / 2) - (drawable.getIntrinsicHeight() / 2), aVar.f35304a, (drawable.getIntrinsicHeight() / 2) + (aVar.f35305b / 2));
            drawable.draw(canvas);
        }
        a aVar2 = this.f35335y;
        if (aVar2.f35337a.e()) {
            float thumbValue = aVar2.f35337a.getThumbValue();
            Float thumbSecondaryValue = aVar2.f35337a.getThumbSecondaryValue();
            if (thumbSecondaryValue == null) {
                fMin = thumbValue;
            } else {
                thumbSecondaryValue.floatValue();
                fMin = Math.min(thumbValue, thumbSecondaryValue.floatValue());
            }
        } else {
            fMin = aVar2.f35337a.getMinValue();
        }
        a aVar3 = this.f35335y;
        if (aVar3.f35337a.e()) {
            float thumbValue2 = aVar3.f35337a.getThumbValue();
            Float thumbSecondaryValue2 = aVar3.f35337a.getThumbSecondaryValue();
            if (thumbSecondaryValue2 == null) {
                fMax = thumbValue2;
            } else {
                thumbSecondaryValue2.floatValue();
                fMax = Math.max(thumbValue2, thumbSecondaryValue2.floatValue());
            }
        } else {
            fMax = aVar3.f35337a.getThumbValue();
        }
        r9.a aVar4 = this.f35313c;
        Drawable drawable2 = this.f35326p;
        int iN = n(fMin);
        int iN2 = n(fMax);
        Objects.requireNonNull(aVar4);
        j0.i(canvas, "canvas");
        if (drawable2 != null) {
            drawable2.setBounds(iN, (aVar4.f35305b / 2) - (drawable2.getIntrinsicHeight() / 2), iN2, (drawable2.getIntrinsicHeight() / 2) + (aVar4.f35305b / 2));
            drawable2.draw(canvas);
        }
        int i10 = (int) this.f35322l;
        int i11 = (int) this.f35323m;
        if (i10 <= i11) {
            while (true) {
                int i12 = i10 + 1;
                this.f35313c.a(canvas, i10 <= ((int) fMax) && ((int) fMin) <= i10 ? this.f35324n : this.f35325o, n(i10));
                if (i10 == i11) {
                    break;
                } else {
                    i10 = i12;
                }
            }
        }
        this.f35313c.b(canvas, n(this.f35328r), this.f35329s, (int) this.f35328r, this.f35330t);
        if (e()) {
            r9.a aVar5 = this.f35313c;
            Float f10 = this.f35331u;
            j0.f(f10);
            int iN3 = n(f10.floatValue());
            Drawable drawable3 = this.f35332v;
            Float f11 = this.f35331u;
            j0.f(f11);
            aVar5.b(canvas, iN3, drawable3, (int) f11.floatValue(), this.f35333w);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight();
        int iH = h(paddingRight, i10);
        int iH2 = h(paddingBottom, i11);
        setMeasuredDimension(iH, iH2);
        r9.a aVar = this.f35313c;
        int paddingLeft = ((iH - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth();
        int paddingTop = (iH2 - getPaddingTop()) - getPaddingBottom();
        aVar.f35304a = paddingLeft;
        aVar.f35305b = paddingTop;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar;
        j0.i(motionEvent, "ev");
        if (!this.A) {
            return false;
        }
        int x10 = (((int) motionEvent.getX()) - getPaddingLeft()) - (getMaxTickmarkOrThumbWidth() / 2);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                m(this.f35336z, b(x10), this.f35321k);
                return true;
            }
            if (action != 2) {
                return false;
            }
            m(this.f35336z, b(x10), false);
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        if (e()) {
            int iAbs = Math.abs(x10 - n(this.f35328r));
            Float f10 = this.f35331u;
            j0.f(f10);
            if (iAbs < Math.abs(x10 - n(f10.floatValue()))) {
                cVar = c.THUMB;
            } else {
                cVar = c.THUMB_SECONDARY;
            }
        } else {
            cVar = c.THUMB;
        }
        this.f35336z = cVar;
        m(cVar, b(x10), this.f35321k);
        return true;
    }

    public final void p(Float f10, boolean z10, boolean z11) {
        ValueAnimator valueAnimator;
        Float f11;
        Float fValueOf = f10 == null ? null : Float.valueOf(c(f10.floatValue()));
        if (j0.c(this.f35331u, fValueOf)) {
            return;
        }
        if (!z10 || !this.f35321k || (f11 = this.f35331u) == null || fValueOf == null) {
            if (z11 && (valueAnimator = this.f35316f) != null) {
                valueAnimator.cancel();
            }
            if (z11 || this.f35316f == null) {
                f fVar = this.f35318h;
                Float f12 = this.f35331u;
                fVar.f35342a = f12;
                this.f35331u = fValueOf;
                j(f12, fValueOf);
            }
        } else {
            ValueAnimator valueAnimator2 = this.f35316f;
            if (valueAnimator2 == null) {
                this.f35318h.f35342a = f11;
            }
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            Float f13 = this.f35331u;
            j0.f(f13);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f13.floatValue(), fValueOf.floatValue());
            valueAnimatorOfFloat.addUpdateListener(new r9.c(this, 1));
            valueAnimatorOfFloat.addListener(this.f35318h);
            setBaseParams(valueAnimatorOfFloat);
            valueAnimatorOfFloat.start();
            this.f35316f = valueAnimatorOfFloat;
        }
        invalidate();
    }

    public final void q(float f10, boolean z10, boolean z11) {
        ValueAnimator valueAnimator;
        float fMin = Math.min(Math.max(f10, this.f35322l), this.f35323m);
        float f11 = this.f35328r;
        if (f11 == fMin) {
            return;
        }
        if (z10 && this.f35321k) {
            ValueAnimator valueAnimator2 = this.f35315e;
            if (valueAnimator2 == null) {
                this.f35317g.f35339a = f11;
            }
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f35328r, fMin);
            valueAnimatorOfFloat.addUpdateListener(new r9.c(this, 0));
            valueAnimatorOfFloat.addListener(this.f35317g);
            setBaseParams(valueAnimatorOfFloat);
            valueAnimatorOfFloat.start();
            this.f35315e = valueAnimatorOfFloat;
        } else {
            if (z11 && (valueAnimator = this.f35315e) != null) {
                valueAnimator.cancel();
            }
            if (z11 || this.f35315e == null) {
                e eVar = this.f35317g;
                float f12 = this.f35328r;
                eVar.f35339a = f12;
                this.f35328r = fMin;
                i(Float.valueOf(f12), this.f35328r);
            }
        }
        invalidate();
    }

    public final void setActiveTickMarkDrawable(Drawable drawable) {
        this.f35324n = drawable;
        this.f35334x = -1;
        l();
        invalidate();
    }

    public final void setActiveTrackDrawable(Drawable drawable) {
        this.f35326p = drawable;
        invalidate();
    }

    public final void setAnimationDuration(long j10) {
        if (this.f35319i == j10 || j10 < 0) {
            return;
        }
        this.f35319i = j10;
    }

    public final void setAnimationEnabled(boolean z10) {
        this.f35321k = z10;
    }

    public final void setAnimationInterpolator(AccelerateDecelerateInterpolator accelerateDecelerateInterpolator) {
        j0.i(accelerateDecelerateInterpolator, "<set-?>");
        this.f35320j = accelerateDecelerateInterpolator;
    }

    public final void setInactiveTickMarkDrawable(Drawable drawable) {
        this.f35325o = drawable;
        this.f35334x = -1;
        l();
        invalidate();
    }

    public final void setInactiveTrackDrawable(Drawable drawable) {
        this.f35327q = drawable;
        invalidate();
    }

    public final void setInteractive(boolean z10) {
        this.A = z10;
    }

    public final void setMaxValue(float f10) {
        if (this.f35323m == f10) {
            return;
        }
        setMinValue(Math.min(this.f35322l, f10 - 1.0f));
        this.f35323m = f10;
        k();
        invalidate();
    }

    public final void setMinValue(float f10) {
        if (this.f35322l == f10) {
            return;
        }
        setMaxValue(Math.max(this.f35323m, 1.0f + f10));
        this.f35322l = f10;
        k();
        invalidate();
    }

    public final void setThumbDrawable(Drawable drawable) {
        this.f35329s = drawable;
        this.f35334x = -1;
        invalidate();
    }

    public final void setThumbSecondTextDrawable(s9.b bVar) {
        this.f35333w = bVar;
        invalidate();
    }

    public final void setThumbSecondaryDrawable(Drawable drawable) {
        this.f35332v = drawable;
        this.f35334x = -1;
        invalidate();
    }

    public final void setThumbTextDrawable(s9.b bVar) {
        this.f35330t = bVar;
        invalidate();
    }
}
