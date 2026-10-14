package u8;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.reflect.KProperty;
import okhttp3.internal.http2.Http2Connection;
import p0.e0;
import p0.m0;
import vc.b0;

/* JADX INFO: loaded from: classes2.dex */
public class i extends m9.e implements d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f36104v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f36109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f36110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f36111j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final yc.b f36112k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f36113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f36114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f36115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f36116o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f36117p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List<View> f36118q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Set<View> f36119r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f36120s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Set<View> f36121t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f36122u;

    public static final class a extends vc.l implements uc.l<Float, Float> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f36123c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public Float invoke(Float f10) {
            return Float.valueOf(bd.e.a(f10.floatValue(), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD));
        }
    }

    static {
        vc.n nVar = new vc.n(i.class, "aspectRatio", "getAspectRatio()F", 0);
        Objects.requireNonNull(b0.f36991a);
        f36104v = new cd.i[]{nVar};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f36105d = -1;
        this.f36106e = -1;
        this.f36108g = 8388659;
        this.f36112k = new e(Float.valueOf(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD), a.f36123c);
        this.f36118q = new ArrayList();
        this.f36119r = new LinkedHashSet();
        this.f36121t = new LinkedHashSet();
    }

    public /* synthetic */ i(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static /* synthetic */ void getOrientation$annotations() {
    }

    public static /* synthetic */ void getShowDividers$annotations() {
    }

    public static final float i(i iVar, m9.d dVar) {
        Objects.requireNonNull(iVar);
        float f10 = dVar.f33327d;
        int i10 = ((ViewGroup.MarginLayoutParams) dVar).width;
        if (f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return f10;
        }
        if (i10 == -1) {
            return 1.0f;
        }
        return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    public static final float j(i iVar, m9.d dVar) {
        Objects.requireNonNull(iVar);
        float f10 = dVar.f33326c;
        int i10 = ((ViewGroup.MarginLayoutParams) dVar).height;
        if (f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return f10;
        }
        if (i10 == -1) {
            return 1.0f;
        }
        return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    private final void setParentCrossSizeIfNeeded(int i10) {
        if (!this.f36121t.isEmpty() && this.f36120s <= 0 && u1.a.h(i10)) {
            this.f36120s = View.MeasureSpec.getSize(i10);
        }
    }

    public final void A(View view, int i10, int i11, int i12) {
        m9.e.a aVar = m9.e.f33332c;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        m9.d dVar = (m9.d) layoutParams;
        int i13 = ((ViewGroup.MarginLayoutParams) dVar).width;
        if (i13 == -1) {
            if (i11 == 0) {
                ((ViewGroup.MarginLayoutParams) dVar).width = -3;
            } else {
                i10 = u1.a.n(i11);
            }
        }
        int i14 = i10;
        int iA = aVar.a(i14, dVar.a() + getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) dVar).width, view.getMinimumWidth(), dVar.f33331h);
        ((ViewGroup.MarginLayoutParams) dVar).width = i13;
        view.measure(iA, u1.a.n(i12));
        this.f36111j = ViewGroup.combineMeasuredStates(this.f36111j, view.getMeasuredState() & (-256));
    }

    public final void B(int i10, int i11, int i12, int i13) {
        boolean z10;
        int i14 = i11 - this.f36109h;
        List<View> list = this.f36118q;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (p((View) it.next()) != Integer.MAX_VALUE) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
        } else {
            z10 = false;
            break;
        }
        if (z10 || y(i14, i12)) {
            this.f36109h = 0;
            List<View> list2 = this.f36118q;
            if (i14 >= 0) {
                for (View view : list2) {
                    if (p(view) != Integer.MAX_VALUE) {
                        A(view, i10, this.f36120s, Math.min(view.getMeasuredHeight(), p(view)));
                    }
                }
            } else {
                if (list2.size() > 1) {
                    kc.p.k(list2, new s());
                }
                int measuredHeight = i14;
                for (View view2 : this.f36118q) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    m9.d dVar = (m9.d) layoutParams;
                    int measuredHeight2 = view2.getMeasuredHeight();
                    int iB = dVar.b() + measuredHeight2;
                    int iC = xc.b.c((iB / this.f36110i) * measuredHeight) + measuredHeight2;
                    int minimumHeight = view2.getMinimumHeight();
                    if (iC < minimumHeight) {
                        iC = minimumHeight;
                    }
                    int i15 = dVar.f33330g;
                    if (iC > i15) {
                        iC = i15;
                    }
                    A(view2, i10, this.f36120s, iC);
                    this.f36111j = ViewGroup.combineMeasuredStates(this.f36111j, view2.getMeasuredState() & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE & (-256));
                    this.f36110i -= iB;
                    measuredHeight -= view2.getMeasuredHeight() - measuredHeight2;
                }
            }
            vc.y yVar = new vc.y();
            yVar.f37006c = i14;
            vc.x xVar = new vc.x();
            xVar.f37005c = this.f36122u;
            int i16 = this.f36120s;
            this.f36120s = i13;
            n(new u(i14, this, yVar, xVar, i10, i16));
            int i17 = e9.a.f29114a;
            this.f36109h = getPaddingBottom() + getPaddingTop() + this.f36109h;
        }
    }

    public final void C(View view) {
        int baseline;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        m9.d dVar = (m9.d) layoutParams;
        if (dVar.f33325b && (baseline = view.getBaseline()) != -1) {
            this.f36105d = Math.max(this.f36105d, ((ViewGroup.MarginLayoutParams) dVar).topMargin + baseline);
            this.f36106e = Math.max(this.f36106e, (view.getMeasuredHeight() - baseline) - ((ViewGroup.MarginLayoutParams) dVar).topMargin);
        }
    }

    public final void D(int i10, int i11) {
        if (u1.a.i(i10)) {
            return;
        }
        this.f36120s = Math.max(this.f36120s, i11);
    }

    @Override // m9.e, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return w() ? new m9.d(-1, -2) : new m9.d(-2, -2);
    }

    public float getAspectRatio() {
        return ((Number) this.f36112k.getValue(this, f36104v[0])).floatValue();
    }

    @Override // android.view.View
    public int getBaseline() {
        if (!w()) {
            int i10 = this.f36105d;
            return i10 != -1 ? getPaddingTop() + i10 : super.getBaseline();
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return super.getBaseline();
        }
        int baseline = childAt.getBaseline();
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return getPaddingTop() + baseline + ((ViewGroup.MarginLayoutParams) ((m9.d) layoutParams)).topMargin;
    }

    public final Drawable getDividerDrawable() {
        return this.f36115n;
    }

    public final int getDividerPadding() {
        return this.f36117p;
    }

    public final int getGravity() {
        return this.f36108g;
    }

    public final int getOrientation() {
        return this.f36107f;
    }

    public final int getShowDividers() {
        return this.f36116o;
    }

    public final jc.w k(Canvas canvas, int i10, int i11, int i12, int i13) {
        Drawable drawable = this.f36115n;
        if (drawable == null) {
            return null;
        }
        float f10 = (i10 + i12) / 2.0f;
        float f11 = (i11 + i13) / 2.0f;
        float f12 = this.f36113l / 2.0f;
        float f13 = this.f36114m / 2.0f;
        drawable.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f10 + f12), (int) (f11 + f13));
        drawable.draw(canvas);
        return jc.w.f31842a;
    }

    public final jc.w l(Canvas canvas, int i10) {
        return k(canvas, getPaddingLeft() + this.f36117p, i10, (getWidth() - getPaddingRight()) - this.f36117p, i10 + this.f36114m);
    }

    public final jc.w m(Canvas canvas, int i10) {
        return k(canvas, i10, getPaddingTop() + this.f36117p, i10 + this.f36113l, (getHeight() - getPaddingBottom()) - this.f36117p);
    }

    public final void n(uc.l<? super View, jc.w> lVar) {
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            int i11 = i10 + 1;
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                lVar.invoke(childAt);
            }
            i10 = i11;
        }
    }

    public final void o(uc.p<? super View, ? super Integer, jc.w> pVar) {
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            int i11 = i10 + 1;
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                pVar.invoke(childAt, Integer.valueOf(i10));
            }
            i10 = i11;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int paddingLeft;
        int left;
        int paddingRight;
        Integer numValueOf;
        j0.i(canvas, "canvas");
        if (this.f36115n == null) {
            return;
        }
        if (w()) {
            o(new k(this, canvas));
            if (t(getChildCount())) {
                View childAt = getChildAt(getChildCount() - 1);
                if (childAt == null) {
                    numValueOf = null;
                } else {
                    int bottom = childAt.getBottom();
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    numValueOf = Integer.valueOf(bottom + ((ViewGroup.MarginLayoutParams) ((m9.d) layoutParams)).bottomMargin);
                }
                l(canvas, numValueOf == null ? (getHeight() - getPaddingBottom()) - this.f36114m : numValueOf.intValue());
                return;
            }
            return;
        }
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        boolean z10 = e0.e.d(this) == 1;
        o(new j(this, z10, canvas));
        if (t(getChildCount())) {
            View childAt2 = getChildAt(getChildCount() - 1);
            if (childAt2 == null && z10) {
                paddingLeft = getPaddingLeft();
            } else {
                if (childAt2 == null) {
                    left = getWidth();
                    paddingRight = getPaddingRight();
                } else if (z10) {
                    left = childAt2.getLeft();
                    ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    paddingRight = ((ViewGroup.MarginLayoutParams) ((m9.d) layoutParams2)).leftMargin;
                } else {
                    int right = childAt2.getRight();
                    ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                    Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    paddingLeft = right + ((ViewGroup.MarginLayoutParams) ((m9.d) layoutParams3)).rightMargin;
                }
                paddingLeft = (left - paddingRight) - this.f36113l;
            }
            m(canvas, paddingLeft);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0155  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iA;
        int childCount;
        int paddingTop;
        int i14;
        int paddingTop2;
        int iA2;
        if (w()) {
            int i15 = i12 - i10;
            int paddingRight = i15 - getPaddingRight();
            int paddingLeft = (i15 - getPaddingLeft()) - getPaddingRight();
            int gravity = getGravity() & 112;
            int gravity2 = 8388615 & getGravity();
            vc.y yVar = new vc.y();
            if (gravity != 16) {
                iA2 = (gravity == 48 || gravity != 80) ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f36109h;
            } else {
                iA2 = androidx.appcompat.widget.a.a(i13 - i11, this.f36109h, 2, getPaddingTop());
            }
            yVar.f37006c = iA2;
            o(new l(gravity2, this, paddingLeft, paddingRight, yVar));
            return;
        }
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        int i16 = 0;
        int i17 = 1;
        boolean z11 = e0.e.d(this) == 1;
        int i18 = i13 - i11;
        int paddingBottom = i18 - getPaddingBottom();
        int paddingTop3 = (i18 - getPaddingTop()) - getPaddingBottom();
        int gravity3 = 8388615 & getGravity();
        int gravity4 = getGravity() & 112;
        int absoluteGravity = Gravity.getAbsoluteGravity(gravity3, e0.e.d(this));
        if (absoluteGravity != 1) {
            iA = (absoluteGravity == 3 || absoluteGravity != 5) ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f36109h;
        } else {
            iA = androidx.appcompat.widget.a.a(i12 - i10, this.f36109h, 2, getPaddingLeft());
        }
        int baseline = -1;
        if (z11) {
            childCount = getChildCount() - 1;
            i17 = -1;
        } else {
            childCount = 0;
        }
        int childCount2 = getChildCount();
        while (i16 < childCount2) {
            int i19 = i16 + 1;
            int i20 = (i16 * i17) + childCount;
            View childAt = getChildAt(i20);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                m9.d dVar = (m9.d) layoutParams;
                if (dVar.f33325b && ((ViewGroup.MarginLayoutParams) dVar).height != baseline) {
                    baseline = childAt.getBaseline();
                }
                int i21 = dVar.f33324a;
                if (i21 < 0) {
                    i21 = gravity4;
                }
                int i22 = i21 & 112;
                if (i22 != 16) {
                    if (i22 != 48) {
                        paddingTop2 = i22 != 80 ? getPaddingTop() : (paddingBottom - measuredHeight) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                    } else {
                        int paddingTop4 = getPaddingTop();
                        int i23 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                        int i24 = paddingTop4 + i23;
                        if (baseline != -1) {
                            i14 = (this.f36105d - baseline) - i23;
                            paddingTop = i24;
                        } else {
                            paddingTop2 = i24;
                        }
                    }
                    if (t(i20)) {
                        iA += this.f36113l;
                    }
                    int i25 = iA + ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                    childAt.layout(i25, paddingTop2, measuredWidth + i25, measuredHeight + paddingTop2);
                    iA = measuredWidth + ((ViewGroup.MarginLayoutParams) dVar).rightMargin + i25;
                } else {
                    paddingTop = getPaddingTop();
                    i14 = (((paddingTop3 - measuredHeight) + ((ViewGroup.MarginLayoutParams) dVar).topMargin) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin) / 2;
                }
                paddingTop2 = paddingTop + i14;
                if (t(i20)) {
                    iA += this.f36113l;
                }
                int i26 = iA + ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                childAt.layout(i26, paddingTop2, measuredWidth + i26, measuredHeight + paddingTop2);
                iA = measuredWidth + ((ViewGroup.MarginLayoutParams) dVar).rightMargin + i26;
            }
            baseline = -1;
            childCount = childCount;
            i16 = i19;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        int iN;
        this.f36109h = 0;
        this.f36122u = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f36111j = 0;
        if (w()) {
            int size = View.MeasureSpec.getSize(i10);
            boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
            vc.y yVar = new vc.y();
            yVar.f37006c = getAspectRatio() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? i11 : z11 ? u1.a.n(xc.b.c(size / getAspectRatio())) : u1.a.n(0);
            if (!z11) {
                size = getSuggestedMinimumWidth();
            }
            int i12 = size < 0 ? 0 : size;
            this.f36120s = i12;
            o(new q(this, i10, yVar));
            setParentCrossSizeIfNeeded(i10);
            int i13 = yVar.f37006c;
            if (!u1.a.i(i10)) {
                if (this.f36120s != 0) {
                    for (View view : this.f36121t) {
                        int i14 = this.f36120s;
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        this.f36120s = Math.max(i14, ((m9.d) layoutParams).a());
                    }
                } else {
                    for (View view2 : this.f36121t) {
                        x(view2, i10, i13, true, false);
                        this.f36119r.remove(view2);
                    }
                }
            }
            for (View view3 : this.f36121t) {
                int i15 = yVar.f37006c;
                if (u(view3, i15)) {
                    x(view3, u1.a.n(this.f36120s), i15, false, true);
                    this.f36119r.remove(view3);
                }
            }
            n(new r(this, yVar));
            if (this.f36109h > 0 && t(getChildCount())) {
                this.f36109h += this.f36114m;
            }
            this.f36109h = getPaddingBottom() + getPaddingTop() + this.f36109h;
            int size2 = View.MeasureSpec.getSize(yVar.f37006c);
            if ((getAspectRatio() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) || z11) {
                if (!(getAspectRatio() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) || u1.a.i(yVar.f37006c)) {
                    iN = yVar.f37006c;
                } else {
                    int iMax = Math.max(this.f36109h, getSuggestedMinimumHeight());
                    if (u1.a.h(yVar.f37006c) && this.f36122u > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        iMax = Math.max(View.MeasureSpec.getSize(yVar.f37006c), iMax);
                    }
                    B(i10, ViewGroup.resolveSize(iMax, yVar.f37006c), yVar.f37006c, i12);
                    size2 = Math.max(this.f36109h, getSuggestedMinimumHeight());
                }
                setMeasuredDimension(s(this.f36120s, i12, i10), ViewGroup.resolveSizeAndState(size2, yVar.f37006c, this.f36111j << 16));
            } else {
                size2 = xc.b.c((s(this.f36120s, i12, i10) & 16777215) / getAspectRatio());
                iN = u1.a.n(size2);
                yVar.f37006c = iN;
            }
            B(i10, size2, iN, i12);
            setMeasuredDimension(s(this.f36120s, i12, i10), ViewGroup.resolveSizeAndState(size2, yVar.f37006c, this.f36111j << 16));
        } else {
            this.f36105d = -1;
            this.f36106e = -1;
            boolean zI = u1.a.i(i10);
            vc.y yVar2 = new vc.y();
            yVar2.f37006c = getAspectRatio() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? i11 : zI ? u1.a.n(xc.b.c(View.MeasureSpec.getSize(i10) / getAspectRatio())) : u1.a.n(0);
            vc.y yVar3 = new vc.y();
            yVar3.f37006c = View.MeasureSpec.getSize(yVar2.f37006c);
            boolean zI2 = u1.a.i(yVar2.f37006c);
            int suggestedMinimumHeight = zI2 ? yVar3.f37006c : getSuggestedMinimumHeight();
            int i16 = suggestedMinimumHeight < 0 ? 0 : suggestedMinimumHeight;
            o(new m(this, i10, yVar2));
            n(new n(this, i10));
            if (this.f36109h > 0 && t(getChildCount())) {
                this.f36109h += this.f36113l;
            }
            this.f36109h = getPaddingRight() + getPaddingLeft() + this.f36109h;
            if (u1.a.h(i10) && this.f36122u > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                this.f36109h = Math.max(View.MeasureSpec.getSize(i10), this.f36109h);
            }
            int iResolveSizeAndState = ViewGroup.resolveSizeAndState(this.f36109h, i10, this.f36111j);
            if (!zI) {
                if (!(getAspectRatio() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD)) {
                    int iC = xc.b.c((iResolveSizeAndState & 16777215) / getAspectRatio());
                    yVar3.f37006c = iC;
                    yVar2.f37006c = u1.a.n(iC);
                }
            }
            int i17 = yVar2.f37006c;
            int size3 = View.MeasureSpec.getSize(i10) - this.f36109h;
            List<View> list = this.f36118q;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (r((View) it.next()) != Integer.MAX_VALUE) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
            } else {
                z10 = false;
                break;
            }
            if (z10 || y(size3, i10)) {
                this.f36109h = 0;
                List<View> list2 = this.f36118q;
                if (size3 >= 0) {
                    for (View view4 : list2) {
                        if (r(view4) != Integer.MAX_VALUE) {
                            z(view4, i17, Math.min(view4.getMeasuredWidth(), r(view4)));
                        }
                    }
                } else {
                    if (list2.size() > 1) {
                        kc.p.k(list2, new t());
                    }
                    int measuredWidth = size3;
                    for (View view5 : this.f36118q) {
                        ViewGroup.LayoutParams layoutParams2 = view5.getLayoutParams();
                        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        m9.d dVar = (m9.d) layoutParams2;
                        int measuredWidth2 = view5.getMeasuredWidth();
                        int iA = dVar.a() + measuredWidth2;
                        int iC2 = xc.b.c((iA / this.f36110i) * measuredWidth) + measuredWidth2;
                        int minimumWidth = view5.getMinimumWidth();
                        if (iC2 < minimumWidth) {
                            iC2 = minimumWidth;
                        }
                        int i18 = dVar.f33331h;
                        if (iC2 > i18) {
                            iC2 = i18;
                        }
                        z(view5, i17, iC2);
                        this.f36111j = ViewGroup.combineMeasuredStates(this.f36111j, view5.getMeasuredState() & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE & (-16777216));
                        this.f36110i -= iA;
                        measuredWidth -= view5.getMeasuredWidth() - measuredWidth2;
                    }
                }
                vc.y yVar4 = new vc.y();
                yVar4.f37006c = size3;
                vc.x xVar = new vc.x();
                xVar.f37005c = this.f36122u;
                this.f36120s = i16;
                this.f36105d = -1;
                this.f36106e = -1;
                n(new v(size3, this, yVar4, xVar, i17));
                this.f36109h = getPaddingBottom() + getPaddingTop() + this.f36109h;
            }
            if (!zI2) {
                if (getAspectRatio() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    setParentCrossSizeIfNeeded(yVar2.f37006c);
                    n(new o(this, yVar2));
                    int i19 = this.f36105d;
                    if (i19 != -1) {
                        D(yVar2.f37006c, i19 + this.f36106e);
                    }
                    int i20 = this.f36120s;
                    yVar3.f37006c = ViewGroup.resolveSize(i20 + (i20 == i16 ? 0 : getPaddingTop() + getPaddingBottom()), yVar2.f37006c);
                }
            }
            n(new p(this, yVar3));
            setMeasuredDimension(iResolveSizeAndState, ViewGroup.resolveSizeAndState(yVar3.f37006c, yVar2.f37006c, this.f36111j << 16));
        }
        this.f36118q.clear();
        this.f36121t.clear();
        this.f36119r.clear();
    }

    public final int p(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return ((m9.d) layoutParams).f33330g;
    }

    public final int q(int i10, int i11) {
        return Math.max(i10, i11 + i10);
    }

    public final int r(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return ((m9.d) layoutParams).f33331h;
    }

    public final int s(int i10, int i11, int i12) {
        return ViewGroup.resolveSizeAndState(i10 + (i10 == i11 ? 0 : getPaddingLeft() + getPaddingRight()), i12, this.f36111j);
    }

    @Override // u8.d
    public void setAspectRatio(float f10) {
        this.f36112k.setValue(this, f36104v[0], Float.valueOf(f10));
    }

    public final void setDividerDrawable(Drawable drawable) {
        if (j0.d(this.f36115n, drawable)) {
            return;
        }
        this.f36115n = drawable;
        this.f36113l = drawable == null ? 0 : drawable.getIntrinsicWidth();
        this.f36114m = drawable == null ? 0 : drawable.getIntrinsicHeight();
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public final void setDividerPadding(int i10) {
        this.f36117p = i10;
    }

    public final void setGravity(int i10) {
        if (this.f36108g == i10) {
            return;
        }
        if ((8388615 & i10) == 0) {
            i10 |= 8388611;
        }
        if ((i10 & 112) == 0) {
            i10 |= 48;
        }
        this.f36108g = i10;
        requestLayout();
    }

    public final void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        if ((8388615 & getGravity()) == i11) {
            return;
        }
        this.f36108g = i11 | (getGravity() & (-8388616));
        requestLayout();
    }

    public final void setOrientation(int i10) {
        if (this.f36107f != i10) {
            this.f36107f = i10;
            requestLayout();
        }
    }

    public final void setShowDividers(int i10) {
        if (this.f36116o == i10) {
            return;
        }
        this.f36116o = i10;
        requestLayout();
    }

    public final void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        if ((getGravity() & 112) == i11) {
            return;
        }
        this.f36108g = i11 | (getGravity() & (-113));
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean t(int i10) {
        int i11;
        if (i10 == 0) {
            if ((this.f36116o & 1) == 0) {
                return false;
            }
        } else if (i10 == getChildCount()) {
            if ((this.f36116o & 4) == 0) {
                return false;
            }
        } else {
            if ((this.f36116o & 2) == 0 || (i11 = i10 - 1) < 0) {
                return false;
            }
            while (true) {
                int i12 = i11 - 1;
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
                if (i12 < 0) {
                    return false;
                }
                i11 = i12;
            }
        }
        return true;
    }

    public final boolean u(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return ((ViewGroup.MarginLayoutParams) ((m9.d) layoutParams)).height != -1 || u1.a.l(i10);
    }

    public final boolean v(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return ((ViewGroup.MarginLayoutParams) ((m9.d) layoutParams)).width != -1 || u1.a.l(i10);
    }

    public final boolean w() {
        return this.f36107f == 1;
    }

    public final void x(View view, int i10, int i11, boolean z10, boolean z11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        m9.d dVar = (m9.d) layoutParams;
        if (((ViewGroup.MarginLayoutParams) dVar).height == -3) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            m9.d dVar2 = (m9.d) layoutParams2;
            int i12 = dVar2.f33330g;
            ((ViewGroup.MarginLayoutParams) dVar2).height = -2;
            dVar2.f33330g = Integer.MAX_VALUE;
            measureChildWithMargins(view, i10, 0, i11, 0);
            ((ViewGroup.MarginLayoutParams) dVar2).height = -3;
            dVar2.f33330g = i12;
            if (z11) {
                this.f36110i = q(this.f36110i, dVar2.b() + view.getMeasuredHeight());
                if (!this.f36118q.contains(view)) {
                    this.f36118q.add(view);
                }
            }
        } else {
            measureChildWithMargins(view, i10, 0, i11, 0);
        }
        this.f36111j = ViewGroup.combineMeasuredStates(this.f36111j, view.getMeasuredState());
        if (z10) {
            D(i10, dVar.a() + view.getMeasuredWidth());
        }
        if (z11 && u(view, i11)) {
            this.f36109h = q(this.f36109h, dVar.b() + view.getMeasuredHeight());
        }
    }

    public final boolean y(int i10, int i11) {
        if (!u1.a.l(i11)) {
            if (!this.f36119r.isEmpty()) {
                return true;
            }
            if (i10 > 0) {
                if (this.f36122u > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    return true;
                }
            } else if (i10 < 0 && this.f36110i > 0) {
                return true;
            }
        }
        return false;
    }

    public final int z(View view, int i10, int i11) {
        m9.e.a aVar = m9.e.f33332c;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        m9.d dVar = (m9.d) layoutParams;
        view.measure(u1.a.n(i11), aVar.a(i10, dVar.b() + getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) dVar).height, view.getMinimumHeight(), dVar.f33330g));
        return ViewGroup.combineMeasuredStates(this.f36111j, view.getMeasuredState() & (-16777216));
    }
}
