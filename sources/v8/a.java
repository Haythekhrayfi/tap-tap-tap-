package v8;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import cd.i;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;
import h0.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import jc.w;
import kotlin.reflect.KProperty;
import m9.e;
import okhttp3.internal.http2.Http2Connection;
import p0.i0;
import u8.d;
import vc.b0;
import vc.g;
import vc.l;
import vc.n;

/* JADX INFO: loaded from: classes2.dex */
public class a extends e implements d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f36718q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f36723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f36724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f36725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<C0437a> f36726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f36727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f36728m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f36729n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f36730o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yc.b f36731p;

    /* JADX INFO: renamed from: v8.a$a, reason: collision with other inner class name */
    public static final class C0437a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f36733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f36734c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f36735d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f36736e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f36737f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f36738g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f36739h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f36740i;

        public C0437a() {
            this(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, null);
        }

        public C0437a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f36732a = i10;
            this.f36733b = i11;
            this.f36734c = i12;
            this.f36735d = i13;
            this.f36736e = i14;
            this.f36737f = i15;
            this.f36738g = i16;
            this.f36739h = i17;
            this.f36740i = i18;
        }

        public /* synthetic */ C0437a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, g gVar) {
            this((i19 & 1) != 0 ? 0 : i10, (i19 & 2) != 0 ? 0 : i11, (i19 & 4) != 0 ? 0 : i12, (i19 & 8) != 0 ? -1 : i13, (i19 & 16) != 0 ? 0 : i14, (i19 & 32) != 0 ? 0 : i15, (i19 & 64) != 0 ? 0 : i16, (i19 & 128) != 0 ? 0 : i17, (i19 & 256) == 0 ? i18 : 0);
        }

        public final int a() {
            return this.f36739h - this.f36740i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0437a)) {
                return false;
            }
            C0437a c0437a = (C0437a) obj;
            return this.f36732a == c0437a.f36732a && this.f36733b == c0437a.f36733b && this.f36734c == c0437a.f36734c && this.f36735d == c0437a.f36735d && this.f36736e == c0437a.f36736e && this.f36737f == c0437a.f36737f && this.f36738g == c0437a.f36738g && this.f36739h == c0437a.f36739h && this.f36740i == c0437a.f36740i;
        }

        public int hashCode() {
            return Integer.hashCode(this.f36740i) + r6.a.a(this.f36739h, r6.a.a(this.f36738g, r6.a.a(this.f36737f, r6.a.a(this.f36736e, r6.a.a(this.f36735d, r6.a.a(this.f36734c, r6.a.a(this.f36733b, Integer.hashCode(this.f36732a) * 31, 31), 31), 31), 31), 31), 31), 31);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("WrapLine(firstIndex=");
            sbA.append(this.f36732a);
            sbA.append(", mainSize=");
            sbA.append(this.f36733b);
            sbA.append(", crossSize=");
            sbA.append(this.f36734c);
            sbA.append(", maxBaseline=");
            sbA.append(this.f36735d);
            sbA.append(", maxHeightUnderBaseline=");
            sbA.append(this.f36736e);
            sbA.append(", right=");
            sbA.append(this.f36737f);
            sbA.append(", bottom=");
            sbA.append(this.f36738g);
            sbA.append(", itemCount=");
            sbA.append(this.f36739h);
            sbA.append(", goneItemCount=");
            return f.a(sbA, this.f36740i, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final class b extends l implements uc.l<Float, Float> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f36741c = new b();

        public b() {
            super(1);
        }

        @Override // uc.l
        public Float invoke(Float f10) {
            return Float.valueOf(bd.e.a(f10.floatValue(), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD));
        }
    }

    static {
        n nVar = new n(a.class, "aspectRatio", "getAspectRatio()F", 0);
        Objects.requireNonNull(b0.f36991a);
        f36718q = new i[]{nVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f36720e = 51;
        this.f36725j = true;
        this.f36726k = new ArrayList();
        this.f36731p = new u8.e(Float.valueOf(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD), b.f36741c);
    }

    private final int getEdgeLineSeparatorsLength() {
        return getStartLineSeparatorLength() + getEndLineSeparatorLength();
    }

    private final int getEdgeSeparatorsLength() {
        return getStartSeparatorLength() + getEndSeparatorLength();
    }

    private final int getEndLineSeparatorLength() {
        if (q(this.f36722g)) {
            return this.f36729n;
        }
        return 0;
    }

    private final int getEndSeparatorLength() {
        if (q(this.f36721f)) {
            return this.f36728m;
        }
        return 0;
    }

    private final C0437a getFirstVisibleLine() {
        Object next;
        Iterator<T> it = this.f36726k.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((C0437a) next).a() > 0) {
                return (C0437a) next;
            }
        }
        next = null;
        return (C0437a) next;
    }

    private final int getLargestMainSize() {
        Integer num;
        Iterator<T> it = this.f36726k.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(((C0437a) it.next()).f36733b);
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((C0437a) it.next()).f36733b);
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        Integer num2 = num;
        if (num2 == null) {
            return 0;
        }
        return num2.intValue();
    }

    private final int getMiddleLineSeparatorLength() {
        if (s(this.f36722g)) {
            return this.f36729n;
        }
        return 0;
    }

    private final int getMiddleSeparatorLength() {
        if (s(this.f36721f)) {
            return this.f36728m;
        }
        return 0;
    }

    public static /* synthetic */ void getShowLineSeparators$annotations() {
    }

    public static /* synthetic */ void getShowSeparators$annotations() {
    }

    private final int getStartLineSeparatorLength() {
        if (r(this.f36722g)) {
            return this.f36729n;
        }
        return 0;
    }

    private final int getStartSeparatorLength() {
        if (r(this.f36721f)) {
            return this.f36728m;
        }
        return 0;
    }

    private final int getSumOfCrossSize() {
        Iterator<T> it = this.f36726k.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((C0437a) it.next()).f36734c;
        }
        return ((getVisibleLinesCount() - 1) * getMiddleLineSeparatorLength()) + i10 + getEdgeLineSeparatorsLength();
    }

    private final int getVisibleLinesCount() {
        List<C0437a> list = this.f36726k;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if ((((C0437a) it.next()).a() > 0) && (i10 = i10 + 1) < 0) {
                kc.l.h();
                throw null;
            }
        }
        return i10;
    }

    public static /* synthetic */ void getWrapDirection$annotations() {
    }

    public float getAspectRatio() {
        return ((Number) this.f36731p.getValue(this, f36718q[0])).floatValue();
    }

    @Override // android.view.View
    public int getBaseline() {
        Integer numValueOf;
        C0437a firstVisibleLine = getFirstVisibleLine();
        if (firstVisibleLine == null) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(getPaddingTop() + firstVisibleLine.f36735d);
        }
        return numValueOf == null ? super.getBaseline() : numValueOf.intValue();
    }

    public final int getGravity() {
        return this.f36720e;
    }

    public final Drawable getLineSeparatorDrawable() {
        return this.f36724i;
    }

    public final Drawable getSeparatorDrawable() {
        return this.f36723h;
    }

    public final int getShowLineSeparators() {
        return this.f36722g;
    }

    public final int getShowSeparators() {
        return this.f36721f;
    }

    public final int getWrapDirection() {
        return this.f36719d;
    }

    public final void i(C0437a c0437a) {
        this.f36726k.add(c0437a);
        int i10 = c0437a.f36735d;
        if (i10 > 0) {
            c0437a.f36734c = Math.max(c0437a.f36734c, i10 + c0437a.f36736e);
        }
        this.f36730o += c0437a.f36734c;
    }

    public final void j(int i10, C0437a c0437a) {
        if (i10 == getChildCount() - 1 && c0437a.a() != 0) {
            i(c0437a);
        }
    }

    public final void k(int i10, int i11, int i12) {
        if (this.f36726k.size() != 0 && View.MeasureSpec.getMode(i10) == 1073741824) {
            int size = View.MeasureSpec.getSize(i10);
            if (this.f36726k.size() == 1) {
                this.f36726k.get(0).f36734c = size - i12;
                return;
            }
            int sumOfCrossSize = getSumOfCrossSize() + i12;
            if (i11 != 1) {
                if (i11 != 5) {
                    if (i11 != 16) {
                        if (i11 != 80) {
                            return;
                        }
                    }
                }
                C0437a c0437a = new C0437a(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, null);
                c0437a.f36734c = size - sumOfCrossSize;
                this.f36726k.add(0, c0437a);
                return;
            }
            C0437a c0437a2 = new C0437a(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, null);
            c0437a2.f36734c = (size - sumOfCrossSize) / 2;
            this.f36726k.add(0, c0437a2);
            this.f36726k.add(c0437a2);
        }
    }

    public final w l(Drawable drawable, Canvas canvas, int i10, int i11, int i12, int i13) {
        if (drawable == null) {
            return null;
        }
        float f10 = (i10 + i12) / 2.0f;
        float f11 = (i11 + i13) / 2.0f;
        float intrinsicWidth = drawable.getIntrinsicWidth() / 2.0f;
        float intrinsicHeight = drawable.getIntrinsicHeight() / 2.0f;
        drawable.setBounds((int) (f10 - intrinsicWidth), (int) (f11 - intrinsicHeight), (int) (f10 + intrinsicWidth), (int) (f11 + intrinsicHeight));
        drawable.draw(canvas);
        return w.f31842a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0010  */
    public final boolean m(View view) {
        int i10;
        Integer numValueOf;
        boolean z10 = this.f36725j;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (z10) {
            if (layoutParams == null) {
                numValueOf = null;
            } else {
                i10 = layoutParams.height;
                numValueOf = Integer.valueOf(i10);
            }
        } else if (layoutParams == null) {
            numValueOf = null;
        } else {
            i10 = layoutParams.width;
            numValueOf = Integer.valueOf(i10);
        }
        return p(numValueOf);
    }

    public final int n(int i10, int i11, int i12, boolean z10) {
        if (i10 != Integer.MIN_VALUE) {
            if (i10 != 0) {
                if (i10 == 1073741824) {
                    return i11;
                }
                throw new IllegalStateException(j0.p("Unknown size mode is set: ", Integer.valueOf(i10)));
            }
        } else {
            if (z10) {
                return Math.min(i11, i12);
            }
            if (i12 < i11 || getVisibleLinesCount() > 1) {
                return i11;
            }
        }
        return i12;
    }

    public final boolean o(View view) {
        return view.getVisibility() == 8 || m(view);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        j0.i(canvas, "canvas");
        if (this.f36723h == null && this.f36724i == null) {
            return;
        }
        if (this.f36721f == 0 && this.f36722g == 0) {
            return;
        }
        if (this.f36725j) {
            v8.b bVar = new v8.b(this, canvas);
            if (this.f36726k.size() > 0 && r(this.f36722g)) {
                C0437a firstVisibleLine = getFirstVisibleLine();
                bVar.invoke(Integer.valueOf(firstVisibleLine == null ? 0 : firstVisibleLine.f36738g - firstVisibleLine.f36734c));
            }
            int i10 = 0;
            boolean z10 = false;
            for (C0437a c0437a : this.f36726k) {
                if (c0437a.a() != 0) {
                    int i11 = c0437a.f36738g;
                    int i12 = i11 - c0437a.f36734c;
                    if (z10 && s(getShowLineSeparators())) {
                        bVar.invoke(Integer.valueOf(i12));
                    }
                    int i13 = c0437a.f36739h;
                    int i14 = 0;
                    int i15 = 0;
                    boolean z11 = true;
                    while (i14 < i13) {
                        int i16 = i14 + 1;
                        View childAt = getChildAt(c0437a.f36732a + i14);
                        if (childAt == null || o(childAt)) {
                            i13 = i13;
                        } else {
                            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                            m9.d dVar = (m9.d) layoutParams;
                            int left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                            if (z11) {
                                if (r(getShowSeparators())) {
                                    l(getSeparatorDrawable(), canvas, left - this.f36728m, i12, left, i11);
                                }
                                z11 = false;
                            } else {
                                i13 = i13;
                                if (s(getShowSeparators())) {
                                    l(getSeparatorDrawable(), canvas, left - this.f36728m, i12, left, i11);
                                }
                            }
                            i15 = right;
                        }
                        i14 = i16;
                        i13 = i13;
                    }
                    if (i15 > 0 && q(getShowSeparators())) {
                        l(getSeparatorDrawable(), canvas, i15, i12, i15 + this.f36728m, i11);
                    }
                    z10 = true;
                    i10 = i11;
                }
            }
            if (i10 <= 0 || !q(this.f36722g)) {
                return;
            }
            bVar.invoke(Integer.valueOf(i10 + this.f36729n));
            return;
        }
        c cVar = new c(this, canvas);
        if (this.f36726k.size() > 0 && r(this.f36722g)) {
            C0437a firstVisibleLine2 = getFirstVisibleLine();
            cVar.invoke(Integer.valueOf(firstVisibleLine2 == null ? 0 : firstVisibleLine2.f36737f - firstVisibleLine2.f36734c));
        }
        int i17 = 0;
        boolean z12 = false;
        for (C0437a c0437a2 : this.f36726k) {
            if (c0437a2.a() != 0) {
                int i18 = c0437a2.f36737f;
                int i19 = i18 - c0437a2.f36734c;
                if (z12 && s(getShowLineSeparators())) {
                    cVar.invoke(Integer.valueOf(i19));
                }
                boolean z13 = getLineSeparatorDrawable() != null;
                int i20 = c0437a2.f36739h;
                int i21 = 0;
                int i22 = 0;
                boolean z14 = true;
                while (i21 < i20) {
                    int i23 = i21 + 1;
                    View childAt2 = getChildAt(c0437a2.f36732a + i21);
                    if (childAt2 == null || o(childAt2)) {
                        i20 = i20;
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        m9.d dVar2 = (m9.d) layoutParams2;
                        int top = childAt2.getTop() - ((ViewGroup.MarginLayoutParams) dVar2).topMargin;
                        int bottom = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) dVar2).bottomMargin;
                        if (z14) {
                            if (r(getShowSeparators())) {
                                l(getSeparatorDrawable(), canvas, i19, top - this.f36728m, i18, top);
                            }
                            z14 = false;
                        } else {
                            i20 = i20;
                            if (s(getShowSeparators())) {
                                l(getSeparatorDrawable(), canvas, i19, top - this.f36728m, i18, top);
                            }
                        }
                        i22 = bottom;
                    }
                    i21 = i23;
                    i20 = i20;
                }
                if (i22 > 0 && q(getShowSeparators())) {
                    l(getSeparatorDrawable(), canvas, i19, i22, i18, i22 + this.f36728m);
                }
                i17 = i18;
                z12 = z13;
            }
        }
        if (i17 <= 0 || !q(this.f36722g)) {
            return;
        }
        cVar.invoke(Integer.valueOf(i17 + this.f36729n));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x018f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0191  */
    /* JADX WARN: Code duplicated, block: B:69:0x019e  */
    /* JADX WARN: Code duplicated, block: B:85:0x020c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0217  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingTop;
        int paddingBottom;
        int paddingTop2;
        int i14;
        int i15;
        View childAt;
        int i16;
        int iA;
        int i17;
        int measuredHeight;
        int i18 = 5;
        int i19 = 80;
        int i20 = 1;
        if (this.f36725j) {
            int i21 = i12 - i10;
            int paddingTop3 = getPaddingTop() + getStartLineSeparatorLength();
            int i22 = 0;
            for (C0437a c0437a : this.f36726k) {
                int startSeparatorLength = getStartSeparatorLength();
                int gravity = getGravity() & 7;
                if (gravity == i20) {
                    iA = androidx.appcompat.widget.a.a(i21, c0437a.f36733b, 2, getPaddingLeft());
                } else if (gravity == 3) {
                    iA = getPaddingLeft();
                } else {
                    if (gravity != i18) {
                        throw new IllegalStateException(j0.p("Invalid horizontal gravity is set: ", Integer.valueOf(gravity)));
                    }
                    iA = (i21 - c0437a.f36733b) - getPaddingRight();
                }
                int measuredWidth = startSeparatorLength + iA;
                if (c0437a.a() > 0) {
                    if (i22 != 0) {
                        paddingTop3 += getMiddleLineSeparatorLength();
                    }
                    i22 = i20;
                }
                int i23 = c0437a.f36739h;
                int i24 = 0;
                boolean z11 = false;
                while (i24 < i23) {
                    int i25 = i24 + 1;
                    View childAt2 = getChildAt(c0437a.f36732a + i24);
                    if (childAt2 == null || o(childAt2)) {
                        i17 = i21;
                        j0.h(childAt2, "child");
                        if (m(childAt2)) {
                            childAt2.layout(0, 0, 0, 0);
                        }
                    } else {
                        ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        m9.d dVar = (m9.d) layoutParams;
                        int middleSeparatorLength = measuredWidth + ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                        if (z11) {
                            middleSeparatorLength += getMiddleSeparatorLength();
                        }
                        ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        m9.d dVar2 = (m9.d) layoutParams2;
                        int i26 = dVar2.f33324a & 112;
                        i17 = i21;
                        if (i26 == 16) {
                            measuredHeight = (((c0437a.f36734c - childAt2.getMeasuredHeight()) + ((ViewGroup.MarginLayoutParams) dVar2).topMargin) - ((ViewGroup.MarginLayoutParams) dVar2).bottomMargin) / 2;
                        } else if (i26 != i19) {
                            measuredHeight = dVar2.f33325b ? Math.max(c0437a.f36735d - childAt2.getBaseline(), ((ViewGroup.MarginLayoutParams) dVar2).topMargin) : ((ViewGroup.MarginLayoutParams) dVar2).topMargin;
                        } else {
                            measuredHeight = (c0437a.f36734c - childAt2.getMeasuredHeight()) - ((ViewGroup.MarginLayoutParams) dVar2).bottomMargin;
                        }
                        int i27 = measuredHeight + paddingTop3;
                        childAt2.layout(middleSeparatorLength, i27, childAt2.getMeasuredWidth() + middleSeparatorLength, childAt2.getMeasuredHeight() + i27);
                        measuredWidth = childAt2.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar).rightMargin + middleSeparatorLength;
                        z11 = true;
                    }
                    i19 = 80;
                    i21 = i17;
                    i24 = i25;
                }
                paddingTop3 += c0437a.f36734c;
                c0437a.f36737f = measuredWidth;
                c0437a.f36738g = paddingTop3;
                i18 = 5;
                i19 = 80;
                i20 = 1;
                i21 = i21;
            }
            return;
        }
        int i28 = 16;
        int i29 = i13 - i11;
        int paddingLeft = getPaddingLeft() + getStartLineSeparatorLength();
        boolean z12 = false;
        for (C0437a c0437a2 : this.f36726k) {
            int startSeparatorLength2 = getStartSeparatorLength();
            int gravity2 = getGravity() & 112;
            if (gravity2 != i28) {
                if (gravity2 == 48) {
                    paddingTop2 = getPaddingTop();
                } else {
                    if (gravity2 != 80) {
                        throw new IllegalStateException(j0.p("Invalid vertical gravity is set: ", Integer.valueOf(gravity2)));
                    }
                    paddingTop = i29 - c0437a2.f36733b;
                    paddingBottom = getPaddingBottom();
                }
                int measuredHeight2 = startSeparatorLength2 + paddingTop2;
                if (c0437a2.a() > 0) {
                    if (z12) {
                        paddingLeft += getMiddleLineSeparatorLength();
                    }
                    z12 = true;
                }
                i14 = c0437a2.f36739h;
                i15 = 0;
                boolean z13 = false;
                while (i15 < i14) {
                    int i30 = i15 + 1;
                    childAt = getChildAt(c0437a2.f36732a + i15);
                    if (childAt != null || o(childAt)) {
                        i16 = i14;
                        j0.h(childAt, "child");
                        if (m(childAt)) {
                            childAt.layout(0, 0, 0, 0);
                        }
                    } else {
                        ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        m9.d dVar3 = (m9.d) layoutParams3;
                        int middleSeparatorLength2 = measuredHeight2 + ((ViewGroup.MarginLayoutParams) dVar3).topMargin;
                        if (z13) {
                            middleSeparatorLength2 += getMiddleSeparatorLength();
                        }
                        int i31 = c0437a2.f36734c;
                        ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                        Objects.requireNonNull(layoutParams4, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        m9.d dVar4 = (m9.d) layoutParams4;
                        int i32 = dVar4.f33324a & 7;
                        i16 = i14;
                        int measuredWidth2 = (i32 != 1 ? i32 != 5 ? ((ViewGroup.MarginLayoutParams) dVar4).leftMargin : (i31 - childAt.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin : (((i31 - childAt.getMeasuredWidth()) + ((ViewGroup.MarginLayoutParams) dVar4).leftMargin) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin) / 2) + paddingLeft;
                        childAt.layout(measuredWidth2, middleSeparatorLength2, childAt.getMeasuredWidth() + measuredWidth2, childAt.getMeasuredHeight() + middleSeparatorLength2);
                        measuredHeight2 = middleSeparatorLength2 + childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin;
                        z13 = true;
                    }
                    i14 = i16;
                    i15 = i30;
                }
                paddingLeft += c0437a2.f36734c;
                c0437a2.f36737f = paddingLeft;
                c0437a2.f36738g = measuredHeight2;
                i28 = 16;
            } else {
                paddingTop = getPaddingTop();
                paddingBottom = (i29 - c0437a2.f36733b) / 2;
            }
            paddingTop2 = paddingTop + paddingBottom;
            int measuredHeight3 = startSeparatorLength2 + paddingTop2;
            if (c0437a2.a() > 0) {
                if (z12) {
                    paddingLeft += getMiddleLineSeparatorLength();
                }
                z12 = true;
            }
            i14 = c0437a2.f36739h;
            i15 = 0;
            boolean z14 = false;
            while (i15 < i14) {
                int i33 = i15 + 1;
                childAt = getChildAt(c0437a2.f36732a + i15);
                if (childAt != null) {
                    i16 = i14;
                    j0.h(childAt, "child");
                    if (m(childAt)) {
                        childAt.layout(0, 0, 0, 0);
                    }
                } else {
                    i16 = i14;
                    j0.h(childAt, "child");
                    if (m(childAt)) {
                        childAt.layout(0, 0, 0, 0);
                    }
                }
                i14 = i16;
                i15 = i33;
            }
            paddingLeft += c0437a2.f36734c;
            c0437a2.f36737f = paddingLeft;
            c0437a2.f36738g = measuredHeight3;
            i28 = 16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x02b0  */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        int mode;
        int size;
        int paddingRight;
        int largestMainSize;
        int iMakeMeasureSpec2;
        int i12;
        int iC;
        int edgeSeparatorsLength;
        int edgeSeparatorsLength2;
        int i13;
        int i14;
        this.f36726k.clear();
        this.f36727l = 0;
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if ((getAspectRatio() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) || mode2 != 1073741824) {
            iMakeMeasureSpec = i11;
            mode = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
        } else {
            int iC2 = xc.b.c(size2 / getAspectRatio());
            size = iC2;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iC2, 1073741824);
            mode = 1073741824;
        }
        this.f36730o = getEdgeLineSeparatorsLength();
        int i15 = this.f36725j ? i10 : iMakeMeasureSpec;
        int mode3 = View.MeasureSpec.getMode(i15);
        int size3 = View.MeasureSpec.getSize(i15);
        int paddingRight2 = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int edgeSeparatorsLength3 = getEdgeSeparatorsLength() + (this.f36725j ? paddingRight2 : paddingBottom);
        C0437a c0437a = new C0437a(0, edgeSeparatorsLength3, 0, 0, 0, 0, 0, 0, 0, 509, null);
        Iterator<View> it = ((i0.a) i0.b(this)).iterator();
        C0437a c0437a2 = c0437a;
        int i16 = 0;
        int i17 = Integer.MIN_VALUE;
        while (true) {
            p0.j0 j0Var = (p0.j0) it;
            if (!j0Var.hasNext()) {
                int i18 = iMakeMeasureSpec;
                if (this.f36725j) {
                    k(i18, this.f36720e & 112, getPaddingBottom() + getPaddingTop());
                } else {
                    k(i10, this.f36720e & 7, getPaddingRight() + getPaddingLeft());
                }
                if (this.f36725j) {
                    paddingRight = getLargestMainSize();
                } else {
                    paddingRight = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
                }
                if (this.f36725j) {
                    largestMainSize = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
                } else {
                    largestMainSize = getLargestMainSize();
                }
                int iCombineMeasuredStates = this.f36727l;
                if (mode2 != 0 && size2 < paddingRight) {
                    iCombineMeasuredStates = ViewGroup.combineMeasuredStates(iCombineMeasuredStates, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                }
                this.f36727l = iCombineMeasuredStates;
                int iResolveSizeAndState = ViewGroup.resolveSizeAndState(n(mode2, size2, paddingRight, !this.f36725j), i10, this.f36727l);
                if (this.f36725j) {
                    if ((getAspectRatio() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) || mode2 == 1073741824) {
                        iMakeMeasureSpec2 = i18;
                        i12 = mode;
                        iC = size;
                    } else {
                        iC = xc.b.c((16777215 & iResolveSizeAndState) / getAspectRatio());
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iC, 1073741824);
                        i12 = 1073741824;
                    }
                } else {
                    iMakeMeasureSpec2 = i18;
                    i12 = mode;
                    iC = size;
                }
                int iCombineMeasuredStates2 = this.f36727l;
                if (i12 != 0 && iC < largestMainSize) {
                    iCombineMeasuredStates2 = ViewGroup.combineMeasuredStates(iCombineMeasuredStates2, 256);
                }
                this.f36727l = iCombineMeasuredStates2;
                setMeasuredDimension(iResolveSizeAndState, ViewGroup.resolveSizeAndState(n(i12, iC, largestMainSize, this.f36725j), iMakeMeasureSpec2, this.f36727l));
                return;
            }
            Object next = j0Var.next();
            int i19 = i16 + 1;
            if (i16 < 0) {
                kc.l.i();
                throw null;
            }
            View view = (View) next;
            if (o(view)) {
                c0437a2.f36740i++;
                c0437a2.f36739h++;
                j(i16, c0437a2);
                i13 = size3;
            } else {
                e.a aVar = e.f33332c;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                m9.d dVar = (m9.d) layoutParams;
                int iA = dVar.a() + paddingRight2;
                int iB = dVar.b() + paddingBottom;
                if (this.f36725j) {
                    edgeSeparatorsLength = iA + getEdgeSeparatorsLength();
                    edgeSeparatorsLength2 = this.f36730o;
                } else {
                    edgeSeparatorsLength = iA + this.f36730o;
                    edgeSeparatorsLength2 = getEdgeSeparatorsLength();
                }
                int i20 = i16;
                C0437a c0437a3 = c0437a2;
                int iA2 = aVar.a(i10, edgeSeparatorsLength, ((ViewGroup.MarginLayoutParams) dVar).width, view.getMinimumWidth(), dVar.f33331h);
                i13 = size3;
                view.measure(iA2, aVar.a(iMakeMeasureSpec, iB + edgeSeparatorsLength2, ((ViewGroup.MarginLayoutParams) dVar).height, view.getMinimumHeight(), dVar.f33330g));
                this.f36727l = View.combineMeasuredStates(this.f36727l, view.getMeasuredState());
                int iA3 = dVar.a() + view.getMeasuredWidth();
                int iB2 = dVar.b() + view.getMeasuredHeight();
                if (!this.f36725j) {
                    iB2 = iA3;
                    iA3 = iB2;
                }
                if (mode3 != 0 && i13 < (c0437a3.f36733b + iA3) + (c0437a3.f36739h != 0 ? getMiddleSeparatorLength() : 0)) {
                    if (c0437a3.a() > 0) {
                        i(c0437a3);
                    }
                    c0437a2 = new C0437a(i20, edgeSeparatorsLength3, 0, 0, 0, 0, 0, 1, 0, 380, null);
                    i14 = Integer.MIN_VALUE;
                } else {
                    if (c0437a3.f36739h > 0) {
                        c0437a3.f36733b += getMiddleSeparatorLength();
                    }
                    c0437a3.f36739h++;
                    c0437a2 = c0437a3;
                    i14 = i17;
                }
                if (this.f36725j && dVar.f33325b) {
                    c0437a2.f36735d = Math.max(c0437a2.f36735d, view.getBaseline() + ((ViewGroup.MarginLayoutParams) dVar).topMargin);
                    c0437a2.f36736e = Math.max(c0437a2.f36736e, (view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin) - view.getBaseline());
                }
                c0437a2.f36733b += iA3;
                int iMax = Math.max(i14, iB2);
                c0437a2.f36734c = Math.max(c0437a2.f36734c, iMax);
                j(i20, c0437a2);
                i17 = iMax;
            }
            size3 = i13;
            iMakeMeasureSpec = iMakeMeasureSpec;
            i16 = i19;
        }
    }

    public final boolean p(Integer num) {
        return (num != null && num.intValue() == -1) || (num != null && num.intValue() == -3);
    }

    public final boolean q(int i10) {
        return (i10 & 4) != 0;
    }

    public final boolean r(int i10) {
        return (i10 & 1) != 0;
    }

    public final boolean s(int i10) {
        return (i10 & 2) != 0;
    }

    @Override // u8.d
    public void setAspectRatio(float f10) {
        this.f36731p.setValue(this, f36718q[0], Float.valueOf(f10));
    }

    public final void setGravity(int i10) {
        if (this.f36720e == i10) {
            return;
        }
        if ((i10 & 7) == 0) {
            i10 |= 3;
        }
        if ((i10 & 112) == 0) {
            i10 |= 48;
        }
        this.f36720e = i10;
        requestLayout();
    }

    public final void setLineSeparatorDrawable(Drawable drawable) {
        int intrinsicHeight;
        if (j0.d(this.f36724i, drawable)) {
            return;
        }
        this.f36724i = drawable;
        if (drawable == null) {
            intrinsicHeight = 0;
        } else {
            intrinsicHeight = this.f36725j ? drawable.getIntrinsicHeight() : drawable.getIntrinsicWidth();
        }
        this.f36729n = intrinsicHeight;
        requestLayout();
    }

    public final void setSeparatorDrawable(Drawable drawable) {
        int intrinsicWidth;
        if (j0.d(this.f36723h, drawable)) {
            return;
        }
        this.f36723h = drawable;
        if (drawable == null) {
            intrinsicWidth = 0;
        } else {
            intrinsicWidth = this.f36725j ? drawable.getIntrinsicWidth() : drawable.getIntrinsicHeight();
        }
        this.f36728m = intrinsicWidth;
        requestLayout();
    }

    public final void setShowLineSeparators(int i10) {
        if (this.f36722g != i10) {
            this.f36722g = i10;
            requestLayout();
        }
    }

    public final void setShowSeparators(int i10) {
        if (this.f36721f != i10) {
            this.f36721f = i10;
            requestLayout();
        }
    }

    public final void setWrapDirection(int i10) {
        if (this.f36719d != i10) {
            this.f36719d = i10;
            int intrinsicHeight = 0;
            if (i10 == 0) {
                this.f36725j = true;
                Drawable drawable = this.f36723h;
                this.f36728m = drawable == null ? 0 : drawable.getIntrinsicWidth();
                Drawable drawable2 = this.f36724i;
                if (drawable2 != null) {
                    intrinsicHeight = drawable2.getIntrinsicHeight();
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException(j0.p("Invalid value for the wrap direction is set: ", Integer.valueOf(this.f36719d)));
                }
                this.f36725j = false;
                Drawable drawable3 = this.f36723h;
                this.f36728m = drawable3 == null ? 0 : drawable3.getIntrinsicHeight();
                Drawable drawable4 = this.f36724i;
                if (drawable4 != null) {
                    intrinsicHeight = drawable4.getIntrinsicWidth();
                }
            }
            this.f36729n = intrinsicHeight;
            requestLayout();
        }
    }
}
