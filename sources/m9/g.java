package m9;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import kc.q;
import kotlin.reflect.KProperty;
import vc.b0;

/* JADX INFO: loaded from: classes2.dex */
public class g extends e implements u8.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f33345m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f33346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f33347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<View> f33348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<View> f33349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set<View> f33350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f33351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f33352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f33353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final yc.b f33354l;

    public static final class a extends vc.l implements uc.l<Float, Float> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f33355c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public Float invoke(Float f10) {
            return Float.valueOf(bd.e.a(f10.floatValue(), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD));
        }
    }

    static {
        vc.n nVar = new vc.n(g.class, "aspectRatio", "getAspectRatio()F", 0);
        Objects.requireNonNull(b0.f36991a);
        f33345m = new cd.i[]{nVar};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f33346d = new Rect();
        this.f33348f = new LinkedHashSet();
        this.f33349g = new LinkedHashSet();
        this.f33350h = new LinkedHashSet();
        this.f33354l = new u8.e(Float.valueOf(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD), a.f33355c);
    }

    public /* synthetic */ g(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final int getHorizontalPadding() {
        return getPaddingLeftWithForeground() + getPaddingRightWithForeground();
    }

    public static /* synthetic */ void getMeasureAllChildren$annotations() {
    }

    private final int getPaddingBottomWithForeground() {
        return Math.max(getPaddingBottom(), this.f33346d.bottom);
    }

    private final int getPaddingLeftWithForeground() {
        return Math.max(getPaddingLeft(), this.f33346d.left);
    }

    private final int getPaddingRightWithForeground() {
        return Math.max(getPaddingRight(), this.f33346d.right);
    }

    private final int getPaddingTopWithForeground() {
        return Math.max(getPaddingTop(), this.f33346d.top);
    }

    private final boolean getUseAspect() {
        return !(getAspectRatio() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
    }

    private final int getVerticalPadding() {
        return getPaddingTopWithForeground() + getPaddingBottomWithForeground();
    }

    @Override // m9.e, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d(-1, -1);
    }

    public float getAspectRatio() {
        return ((Number) this.f33354l.getValue(this, f33345m[0])).floatValue();
    }

    public final boolean getMeasureAllChildren() {
        return this.f33347e;
    }

    public final boolean i(d dVar, boolean z10, boolean z11) {
        if (!z10 && ((ViewGroup.MarginLayoutParams) dVar).width == -1) {
            return true;
        }
        return !z11 && ((ViewGroup.MarginLayoutParams) dVar).height == -1;
    }

    public final void j(int i10) {
        this.f33352j = Math.max(this.f33352j, i10);
    }

    public final void k(int i10) {
        this.f33351i = Math.max(this.f33351i, i10);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    /* JADX WARN: Code duplicated, block: B:20:0x0084  */
    /* JADX WARN: Code duplicated, block: B:21:0x008b  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int iA;
        int left = getLeft();
        int top = getTop();
        int right = getRight();
        int bottom = getBottom();
        int paddingLeftWithForeground = getPaddingLeftWithForeground();
        int paddingRightWithForeground = (right - left) - getPaddingRightWithForeground();
        int paddingTopWithForeground = getPaddingTopWithForeground();
        int paddingBottomWithForeground = (bottom - top) - getPaddingBottomWithForeground();
        int childCount = getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            int i17 = i16 + 1;
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                d dVar = (d) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int absoluteGravity = Gravity.getAbsoluteGravity(dVar.f33324a, getLayoutDirection());
                int i18 = dVar.f33324a & 112;
                int i19 = absoluteGravity & 7;
                if (i19 != 1) {
                    if (i19 != 5) {
                        i14 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                    } else {
                        i15 = (paddingRightWithForeground - measuredWidth) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                    }
                    if (i18 != 16) {
                        iA = androidx.appcompat.widget.a.a(((paddingBottomWithForeground - paddingTopWithForeground) - measuredHeight) + ((ViewGroup.MarginLayoutParams) dVar).topMargin, ((ViewGroup.MarginLayoutParams) dVar).bottomMargin, 2, paddingTopWithForeground);
                    } else if (i18 != 80) {
                        iA = ((ViewGroup.MarginLayoutParams) dVar).topMargin + paddingTopWithForeground;
                    } else {
                        iA = (paddingBottomWithForeground - measuredHeight) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                    }
                    childAt.layout(i15, iA, measuredWidth + i15, measuredHeight + iA);
                } else {
                    i14 = ((((paddingRightWithForeground - paddingLeftWithForeground) - measuredWidth) + ((ViewGroup.MarginLayoutParams) dVar).leftMargin) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin) / 2;
                }
                i15 = i14 + paddingLeftWithForeground;
                if (i18 != 16) {
                    iA = androidx.appcompat.widget.a.a(((paddingBottomWithForeground - paddingTopWithForeground) - measuredHeight) + ((ViewGroup.MarginLayoutParams) dVar).topMargin, ((ViewGroup.MarginLayoutParams) dVar).bottomMargin, 2, paddingTopWithForeground);
                } else if (i18 != 80) {
                    iA = ((ViewGroup.MarginLayoutParams) dVar).topMargin + paddingTopWithForeground;
                } else {
                    iA = (paddingBottomWithForeground - measuredHeight) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                }
                childAt.layout(i15, iA, measuredWidth + i15, measuredHeight + iA);
            }
            i16 = i17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:197:0x0316  */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        String str;
        View view;
        int horizontalPadding;
        Integer numValueOf;
        int verticalPadding;
        int i14;
        int iA;
        int iA2;
        View view2;
        boolean z10 = false;
        this.f33351i = 0;
        this.f33352j = 0;
        this.f33353k = 0;
        int iMakeMeasureSpec = getUseAspect() ? !u1.a.i(i10) ? View.MeasureSpec.makeMeasureSpec(0, 0) : u1.a.n(xc.b.c(View.MeasureSpec.getSize(i10) / getAspectRatio())) : i11;
        boolean z11 = !this.f33347e;
        int childCount = getChildCount();
        int i15 = 0;
        while (true) {
            i12 = 8;
            i13 = -1;
            str = "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams";
            if (i15 >= childCount) {
                break;
            }
            int i16 = i15 + 1;
            View childAt = getChildAt(i15);
            if (!z11 || childAt.getVisibility() != 8) {
                j0.h(childAt, "child");
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                d dVar = (d) layoutParams;
                boolean zI = u1.a.i(i10);
                boolean zI2 = u1.a.i(iMakeMeasureSpec);
                boolean z12 = ((ViewGroup.MarginLayoutParams) dVar).width == -1 ? true : z10;
                int i17 = ((ViewGroup.MarginLayoutParams) dVar).height;
                boolean z13 = i17 == -1 ? true : z10;
                if ((!(zI && zI2) && (!zI2 ? !(!zI ? !(z12 && (z13 || (i17 == -3 && getUseAspect()))) : !z13) : !z12)) ? z10 : true) {
                    measureChildWithMargins(childAt, i10, 0, iMakeMeasureSpec, 0);
                    this.f33353k = ViewGroup.combineMeasuredStates(this.f33353k, childAt.getMeasuredState());
                    if (i(dVar, zI, zI2)) {
                        view2 = childAt;
                        this.f33348f.add(view2);
                    } else {
                        view2 = childAt;
                    }
                    if (!zI && !z12) {
                        k(dVar.a() + view2.getMeasuredWidth());
                    }
                    if (!zI2 && !z13 && !getUseAspect()) {
                        j(dVar.b() + view2.getMeasuredHeight());
                    }
                } else if (i(dVar, zI, zI2)) {
                    this.f33349g.add(childAt);
                }
            }
            i15 = i16;
            z10 = false;
        }
        q.l(this.f33350h, this.f33348f);
        q.l(this.f33350h, this.f33349g);
        if (!this.f33350h.isEmpty()) {
            if (u1.a.h(i10) && this.f33351i == 0) {
                this.f33351i = View.MeasureSpec.getSize(i10);
            }
            if (!getUseAspect() && u1.a.h(iMakeMeasureSpec) && this.f33352j == 0) {
                this.f33352j = View.MeasureSpec.getSize(iMakeMeasureSpec);
            }
        }
        if (!this.f33350h.isEmpty()) {
            boolean zI3 = u1.a.i(i10);
            boolean zI4 = u1.a.i(iMakeMeasureSpec);
            if (!zI3 || !zI4) {
                boolean z14 = !zI3 && this.f33351i == 0;
                boolean z15 = (zI4 || getUseAspect() || this.f33352j != 0) ? false : true;
                if (z14 || z15) {
                    for (View view3 : this.f33350h) {
                        ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                        Objects.requireNonNull(layoutParams2, str);
                        d dVar2 = (d) layoutParams2;
                        if (this.f33349g.contains(view3) && ((((ViewGroup.MarginLayoutParams) dVar2).width == i13 && z14) || (((ViewGroup.MarginLayoutParams) dVar2).height == i13 && z15))) {
                            measureChildWithMargins(view3, i10, 0, iMakeMeasureSpec, 0);
                            this.f33353k = ViewGroup.combineMeasuredStates(this.f33353k, view3.getMeasuredState());
                            view = view3;
                            this.f33349g.remove(view);
                        } else {
                            view = view3;
                        }
                        if (z14) {
                            k(dVar2.a() + view.getMeasuredWidth());
                        }
                        if (z15) {
                            j(dVar2.b() + view.getMeasuredHeight());
                        }
                        str = str;
                        i13 = -1;
                    }
                } else {
                    Iterator<T> it = this.f33350h.iterator();
                    while (it.hasNext()) {
                        ViewGroup.LayoutParams layoutParams3 = ((View) it.next()).getLayoutParams();
                        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        d dVar3 = (d) layoutParams3;
                        if (!zI3 && ((ViewGroup.MarginLayoutParams) dVar3).width == -1) {
                            k(dVar3.a());
                        }
                        if (!zI4 && ((ViewGroup.MarginLayoutParams) dVar3).height == -1) {
                            j(dVar3.b());
                        }
                    }
                }
            }
        }
        String str2 = str;
        Integer numValueOf2 = null;
        if (u1.a.i(i10)) {
            horizontalPadding = 0;
        } else {
            horizontalPadding = this.f33351i + getHorizontalPadding();
            int suggestedMinimumWidth = getSuggestedMinimumWidth();
            if (horizontalPadding < suggestedMinimumWidth) {
                horizontalPadding = suggestedMinimumWidth;
            }
            Drawable foreground = getForeground();
            if (foreground == null) {
                numValueOf = null;
            } else {
                int minimumWidth = foreground.getMinimumWidth();
                if (horizontalPadding >= minimumWidth) {
                    minimumWidth = horizontalPadding;
                }
                numValueOf = Integer.valueOf(minimumWidth);
            }
            if (numValueOf != null) {
                horizontalPadding = numValueOf.intValue();
            }
        }
        int iResolveSizeAndState = ViewGroup.resolveSizeAndState(horizontalPadding, i10, this.f33353k);
        int i18 = 16777215 & iResolveSizeAndState;
        if (u1.a.i(iMakeMeasureSpec)) {
            i14 = 0;
        } else {
            if (getUseAspect() && !u1.a.i(i10)) {
                verticalPadding = xc.b.c(i18 / getAspectRatio());
            } else {
                verticalPadding = this.f33352j + getVerticalPadding();
                int suggestedMinimumHeight = getSuggestedMinimumHeight();
                if (verticalPadding < suggestedMinimumHeight) {
                    verticalPadding = suggestedMinimumHeight;
                }
                Drawable foreground2 = getForeground();
                if (foreground2 != null) {
                    int minimumHeight = foreground2.getMinimumHeight();
                    if (verticalPadding >= minimumHeight) {
                        minimumHeight = verticalPadding;
                    }
                    numValueOf2 = Integer.valueOf(minimumHeight);
                }
                if (numValueOf2 != null) {
                    verticalPadding = numValueOf2.intValue();
                }
            }
            i14 = verticalPadding;
        }
        if (u1.a.l(iMakeMeasureSpec)) {
            iMakeMeasureSpec = u1.a.n(i14);
            if (getUseAspect() && !u1.a.i(i10)) {
                boolean z16 = true ^ this.f33347e;
                int childCount2 = getChildCount();
                int i19 = 0;
                while (i19 < childCount2) {
                    int i20 = i19 + 1;
                    View childAt2 = getChildAt(i19);
                    if (!z16 || childAt2.getVisibility() != i12) {
                        j0.h(childAt2, "child");
                        ViewGroup.LayoutParams layoutParams4 = childAt2.getLayoutParams();
                        Objects.requireNonNull(layoutParams4, str2);
                        if (((ViewGroup.MarginLayoutParams) ((d) layoutParams4)).height == -3) {
                            measureChildWithMargins(childAt2, i10, 0, iMakeMeasureSpec, 0);
                            this.f33350h.remove(childAt2);
                        }
                    }
                    i19 = i20;
                    childCount2 = childCount2;
                    i12 = 8;
                }
            }
        }
        setMeasuredDimension(iResolveSizeAndState, ViewGroup.resolveSizeAndState(i14, iMakeMeasureSpec, this.f33353k << 16));
        for (View view4 : this.f33350h) {
            e.a aVar = e.f33332c;
            ViewGroup.LayoutParams layoutParams5 = view4.getLayoutParams();
            Objects.requireNonNull(layoutParams5, str2);
            d dVar4 = (d) layoutParams5;
            int iA3 = dVar4.a() + getHorizontalPadding();
            int verticalPadding2 = getVerticalPadding() + dVar4.b();
            int i21 = ((ViewGroup.MarginLayoutParams) dVar4).width;
            if (i21 == -1) {
                int measuredWidth = getMeasuredWidth() - iA3;
                if (measuredWidth < 0) {
                    measuredWidth = 0;
                }
                iA = u1.a.n(measuredWidth);
            } else {
                iA = aVar.a(i10, iA3, i21, view4.getMinimumWidth(), dVar4.f33331h);
            }
            int i22 = ((ViewGroup.MarginLayoutParams) dVar4).height;
            if (i22 == -1) {
                int measuredHeight = getMeasuredHeight() - verticalPadding2;
                if (measuredHeight < 0) {
                    measuredHeight = 0;
                }
                iA2 = u1.a.n(measuredHeight);
            } else {
                iA2 = aVar.a(iMakeMeasureSpec, verticalPadding2, i22, view4.getMinimumHeight(), dVar4.f33330g);
            }
            view4.measure(iA, iA2);
            if (this.f33349g.contains(view4)) {
                this.f33353k = ViewGroup.combineMeasuredStates(this.f33353k, view4.getMeasuredState());
            }
        }
        this.f33348f.clear();
        this.f33349g.clear();
        this.f33350h.clear();
    }

    @Override // u8.d
    public void setAspectRatio(float f10) {
        this.f33354l.setValue(this, f33345m[0], Float.valueOf(f10));
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (getForegroundGravity() == i10) {
            return;
        }
        super.setForegroundGravity(i10);
        if (getForegroundGravity() != 119 || getForeground() == null) {
            this.f33346d.setEmpty();
        } else {
            getForeground().getPadding(this.f33346d);
        }
        requestLayout();
    }

    public final void setMeasureAllChildren(boolean z10) {
        this.f33347e = z10;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
