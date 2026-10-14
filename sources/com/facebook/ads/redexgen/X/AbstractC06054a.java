package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC06054a {
    public static byte[] A0I;
    public static String[] A0J = {"NGwI4w5wjKKwr8vIXUEBgcadgt82Mvhc", "UEWVJJvMFTFlt7hH7ERCIJOXwkHPD", "VrTEPZjwbsMyuvHOm", "2WwBzOWctlsBfaK16SO", "SN9IkStz5", "kDHla2kaeJhueA2usdy0jZceB2KGO", "Oz8ehwpCKAgd43CqPtwSSE9zN5", "pRsAYaXPUkY6EiG3qKZOmbtQ8"};
    public int A00;
    public C06033y A01;
    public AbstractC06174n A02;
    public EB A03;
    public C06274x A04;
    public C06274x A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public boolean A0E;
    public boolean A0F;
    public final InterfaceC06254v A0G;
    public final InterfaceC06254v A0H;

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        byte[] bArr = {-2, 33, 33, 34, 33, -35, 19, 38, 34, 52, -35, 37, Ascii.RS, 48, -35, 15, 34, 32, 54, 32, 41, 34, 47, 19, 38, 34, 52, -35, Ascii.RS, 48, -35, 45, Ascii.RS, 47, 34, 43, 49, -35, Ascii.US, 50, 49, -35, 51, 38, 34, 52, -35, 38, 48, -35, 43, 44, 49, -35, Ascii.RS, -35, 47, 34, Ascii.RS, 41, -35, 32, 37, 38, 41, 33, -21, -35, 18, 43, 35, 38, 41, 49, 34, 47, 34, 33, -35, 38, 43, 33, 34, 53, -9, -35, -5, 8, 8, 9, 14, -70, 7, 9, 16, -1, -70, -5, -70, -3, 2, 3, 6, -2, -70, 0, 12, 9, 7, -70, 8, 9, 8, -57, -1, 18, 3, 13, 14, 3, 8, 1, -70, 3, 8, -2, -1, 18, -44, -80, -61, -63, -41, -63, -54, -61, -48, -76, -57, -61, -43, 9, Ascii.US, 37, -48, Ascii.GS, 37, 35, 36, -48, Ascii.US, 38, 21, 34, 34, Ascii.EM, 20, 21, -48, Ascii.US, Ascii.RS, -4, 17, 41, Ascii.US, 37, 36, -13, Ascii.CAN, Ascii.EM, Ascii.FS, 20, 34, 21, Ascii.RS, -40, 2, 21, 19, 41, 19, Ascii.FS, 21, 34, -48, 34, 21, 19, 41, 19, Ascii.FS, 21, 34, -36, -48, 3, 36, 17, 36, 21, -48, 35, 36, 17, 36, 21, -39, -48, -78, -56, -50, 121, -58, -50, -52, -51, 121, -56, -49, -66, -53, -53, -62, -67, -66, 121, -52, -58, -56, -56, -51, -63, -84, -68, -53, -56, -59, -59, -83, -56, -87, -56, -52, -62, -51, -62, -56, -57, 121, -51, -56, 121, -52, -50, -55, -55, -56, -53, -51, 121, -52, -58, -56, -56, -51, -63, 121, -52, -68, -53, -56, -59, -59, -62, -57, -64};
        String[] strArr = A0J;
        if (strArr[2].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0J[6] = "kyP20liVKsmkdJ";
        A0I = bArr;
    }

    public abstract C06064b A1s();

    static {
        A08();
    }

    public AbstractC06054a() {
        C1356Yq c1356Yq = new C1356Yq(this);
        this.A0G = c1356Yq;
        C1355Yp c1355Yp = new C1355Yp(this);
        this.A0H = c1355Yp;
        this.A04 = new C06274x(c1356Yq);
        this.A05 = new C06274x(c1355Yp);
        this.A09 = false;
        this.A07 = false;
        this.A06 = false;
        this.A0F = true;
        this.A0E = true;
    }

    public static int A00(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        switch (mode) {
            case Integer.MIN_VALUE:
                int mode2 = Math.max(i11, i12);
                return Math.min(size, mode2);
            case 1073741824:
                return size;
            default:
                int mode3 = Math.max(i11, i12);
                return mode3;
        }
    }

    public static int A01(int i10, int i11, int i12, int i13, boolean z10) {
        int iMax = Math.max(0, i10 - i12);
        int i14 = 0;
        int resultMode = 0;
        if (z10) {
            if (i13 >= 0) {
                i14 = i13;
                String[] strArr = A0J;
                String str = strArr[5];
                String str2 = strArr[1];
                int resultSize = str.length();
                int size = str2.length();
                if (resultSize != size) {
                    throw new RuntimeException();
                }
                A0J[6] = "ru0BYCJI67FO4KgBABZqajada";
                resultMode = 1073741824;
            } else if (i13 == -1) {
                switch (i11) {
                    case Integer.MIN_VALUE:
                    case 1073741824:
                        i14 = iMax;
                        resultMode = i11;
                        break;
                    case 0:
                        i14 = 0;
                        int resultSize2 = A0J[3].length();
                        if (resultSize2 == 28) {
                            resultMode = 0;
                        } else {
                            A0J[7] = "Nw";
                            resultMode = 0;
                        }
                        break;
                }
            } else if (i13 == -2) {
                i14 = 0;
                resultMode = 0;
            }
        } else if (i13 >= 0) {
            i14 = i13;
            resultMode = 1073741824;
        } else if (i13 == -1) {
            i14 = iMax;
            resultMode = i11;
        } else if (i13 == -2) {
            i14 = iMax;
            resultMode = (i11 == Integer.MIN_VALUE || i11 == 1073741824) ? Integer.MIN_VALUE : 0;
        }
        int size2 = View.MeasureSpec.makeMeasureSpec(i14, resultMode);
        return size2;
    }

    private final int A02(View view) {
        return ((C06064b) view.getLayoutParams()).A03.bottom;
    }

    private final int A03(View view) {
        return ((C06064b) view.getLayoutParams()).A03.left;
    }

    private final int A04(View view) {
        return ((C06064b) view.getLayoutParams()).A03.right;
    }

    private final int A05(View view) {
        return ((C06064b) view.getLayoutParams()).A03.top;
    }

    private final int A06(C06124i c06124i, C06194p c06194p) {
        return 0;
    }

    private final void A09(int i10) {
        A0C(i10, A0t(i10));
    }

    private final void A0A(int i10) {
        View child = A0t(i10);
        if (child != null) {
            this.A01.A0D(i10);
        }
    }

    private final void A0B(int i10, int i11) {
        View view = A0t(i10);
        if (view != null) {
            A09(i10);
            A0E(view, i11);
            return;
        }
        throw new IllegalArgumentException(A07(85, 44, 79) + i10 + this.A03.toString());
    }

    private void A0C(int i10, View view) {
        this.A01.A0C(i10);
    }

    private final void A0D(View view) {
        this.A01.A0F(view);
    }

    private final void A0E(View view, int i10) {
        A0F(view, i10, (C06064b) view.getLayoutParams());
    }

    private final void A0F(View view, int i10, C06064b c06064b) {
        AbstractC06224s abstractC06224sA0F = EB.A0F(view);
        if (abstractC06224sA0F.A0c()) {
            this.A03.A0t.A09(abstractC06224sA0F);
        } else {
            AnonymousClass50 anonymousClass50 = this.A03.A0t;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[0] = "mtQ3Ck4zhf6OC1ISSa3eadAcnNcPftbe";
            anonymousClass50.A0A(abstractC06224sA0F);
        }
        this.A01.A0H(view, i10, c06064b, abstractC06224sA0F.A0c());
    }

    private void A0G(View view, int i10, boolean z10) {
        AbstractC06224s abstractC06224sA0F = EB.A0F(view);
        if (z10 || abstractC06224sA0F.A0c()) {
            this.A03.A0t.A09(abstractC06224sA0F);
        } else {
            this.A03.A0t.A0A(abstractC06224sA0F);
        }
        C06064b c06064b = (C06064b) view.getLayoutParams();
        if (abstractC06224sA0F.A0i() || abstractC06224sA0F.A0d()) {
            if (abstractC06224sA0F.A0d()) {
                abstractC06224sA0F.A0S();
            } else {
                abstractC06224sA0F.A0O();
            }
            this.A01.A0H(view, i10, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            EB eb2 = this.A03;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[7] = "5ABI9jSeQ";
            if (parent == eb2) {
                int iA07 = this.A01.A07(view);
                if (i10 == -1) {
                    i10 = this.A01.A05();
                }
                if (iA07 != -1) {
                    if (iA07 != i10) {
                        this.A03.A06.A0B(iA07, i10);
                    }
                } else {
                    throw new IllegalStateException(A07(0, 85, 114) + this.A03.indexOfChild(view) + this.A03.A1I());
                }
            } else {
                this.A01.A0I(view, i10, false);
                c06064b.A01 = true;
                AbstractC06174n abstractC06174n = this.A02;
                if (abstractC06174n != null && abstractC06174n.A0F()) {
                    this.A02.A0C(view);
                }
            }
        }
        if (c06064b.A02) {
            abstractC06224sA0F.A0H.invalidate();
            c06064b.A02 = false;
        }
    }

    private final void A0H(View view, Rect rect) {
        EB.A0o(view, rect);
    }

    private void A0J(C06124i c06124i, int i10, View view) {
        AbstractC06224s abstractC06224sA0F = EB.A0F(view);
        if (abstractC06224sA0F.A0h()) {
            return;
        }
        if (abstractC06224sA0F.A0b() && !abstractC06224sA0F.A0c() && !this.A03.A04.A0A()) {
            A0A(i10);
            c06124i.A0b(abstractC06224sA0F);
        } else {
            A09(i10);
            c06124i.A0W(view);
            this.A03.A0t.A0C(abstractC06224sA0F);
        }
    }

    private final void A0K(C06124i c06124i, C06194p c06194p, AccessibilityEvent accessibilityEvent) {
        EB eb2 = this.A03;
        if (eb2 == null || accessibilityEvent == null) {
            return;
        }
        boolean z10 = true;
        if (A0J[6].length() == 1) {
            throw new RuntimeException();
        }
        String[] strArr = A0J;
        strArr[2] = "A1LbQwkKC8kdEmdjm";
        strArr[4] = "mpAFCzQjd";
        if (!eb2.canScrollVertically(1) && !this.A03.canScrollVertically(-1) && !this.A03.canScrollHorizontally(-1) && !this.A03.canScrollHorizontally(1)) {
            z10 = false;
        }
        accessibilityEvent.setScrollable(z10);
        if (A0J[7].length() != 8) {
            A0J[0] = "LKoEdNrfwYhRE769hHSL4lsoF7TmWWKx";
            if (this.A03.A04 == null) {
                return;
            }
        } else if (this.A03.A04 == null) {
            return;
        }
        accessibilityEvent.setItemCount(this.A03.A04.A0D());
    }

    private final void A0L(C06124i c06124i, C06194p c06194p, C05843e c05843e) {
        if (this.A03.canScrollVertically(-1) || this.A03.canScrollHorizontally(-1)) {
            c05843e.A0N(8192);
            c05843e.A0R(true);
        }
        if (this.A03.canScrollVertically(1) || this.A03.canScrollHorizontally(1)) {
            c05843e.A0N(4096);
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[2] = "WKK7ZU1nOyoZ4isR3";
            strArr2[4] = "S1xUaVTVF";
            c05843e.A0R(true);
        }
        C05813b collectionInfo = C05813b.A00(A0r(c06124i, c06194p), A0q(c06124i, c06194p), A0P(c06124i, c06194p), A06(c06124i, c06194p));
        c05843e.A0P(collectionInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(AbstractC06174n abstractC06174n) {
        if (this.A02 == abstractC06174n) {
            this.A02 = null;
        }
    }

    private final boolean A0N() {
        AbstractC06174n abstractC06174n = this.A02;
        return abstractC06174n != null && abstractC06174n.A0F();
    }

    public static boolean A0O(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        switch (mode) {
            case Integer.MIN_VALUE:
                return size >= i10;
            case 0:
                return true;
            case 1073741824:
                return size == i10;
            default:
                return false;
        }
    }

    private final boolean A0P(C06124i c06124i, C06194p c06194p) {
        return false;
    }

    private final boolean A0Q(C06124i c06124i, C06194p c06194p, int i10, Bundle bundle) {
        EB eb2 = this.A03;
        if (eb2 == null) {
            return false;
        }
        int iA0X = 0;
        int iA0h = 0;
        switch (i10) {
            case 4096:
                if (eb2.canScrollVertically(1)) {
                    iA0X = (A0X() - A0g()) - A0d();
                }
                if (this.A03.canScrollHorizontally(1)) {
                    iA0h = (A0h() - A0e()) - A0f();
                }
                break;
            case 8192:
                if (eb2.canScrollVertically(-1)) {
                    iA0X = -((A0X() - A0g()) - A0d());
                }
                if (this.A03.canScrollHorizontally(-1)) {
                    iA0h = -((A0h() - A0e()) - A0f());
                }
                break;
        }
        if (iA0X == 0 && iA0h == 0) {
            return false;
        }
        EB eb3 = this.A03;
        if (A0J[7].length() == 8) {
            throw new RuntimeException();
        }
        A0J[7] = "6TTpYbQ6a4";
        eb3.scrollBy(iA0h, iA0X);
        return true;
    }

    private final boolean A0R(C06124i c06124i, C06194p c06194p, View view, int i10, Bundle bundle) {
        return false;
    }

    private boolean A0S(EB eb2, int i10, int i11) {
        View focusedChild = eb2.getFocusedChild();
        if (focusedChild == null) {
            return false;
        }
        int parentBottom = A0e();
        int parentRight = A0g();
        int parentTop = A0h();
        int parentTop2 = parentTop - A0f();
        int parentLeft = A0X();
        int parentLeft2 = parentLeft - A0d();
        Rect rect = this.A03.A0p;
        A0H(focusedChild, rect);
        if (rect.left - i10 >= parentTop2 || rect.right - i10 <= parentBottom || rect.top - i11 >= parentLeft2 || rect.bottom - i11 <= parentRight) {
            return false;
        }
        if (A0J[3].length() == 28) {
            throw new RuntimeException();
        }
        A0J[0] = "D1nd79aIos3YYe4Hq7EzCaafqnQh2NEe";
        return true;
    }

    @Deprecated
    private final boolean A0T(EB eb2, View view, View view2) {
        return A0N() || eb2.A1v();
    }

    private int[] A0U(View view, Rect rect) {
        int[] iArr = new int[2];
        int offScreenRight = A0e();
        int offScreenTop = A0g();
        int dy = A0h() - A0f();
        int offScreenLeft = A0X() - A0d();
        int childBottom = (view.getLeft() + rect.left) - view.getScrollX();
        int childRight = (view.getTop() + rect.top) - view.getScrollY();
        int childTop = rect.width() + childBottom;
        int parentLeft = rect.height();
        int childLeft = Math.min(0, childBottom - offScreenRight);
        int parentBottom = Math.min(0, childRight - offScreenTop);
        int parentTop = Math.max(0, childTop - dy);
        int parentLeft2 = Math.max(0, (parentLeft + childRight) - offScreenLeft);
        if (A0a() == 1) {
            if (parentTop == 0) {
                parentTop = Math.max(childLeft, childTop - dy);
            }
        } else {
            parentTop = childLeft != 0 ? childLeft : Math.min(childBottom - offScreenRight, parentTop);
        }
        if (parentBottom == 0) {
            parentBottom = Math.min(childRight - offScreenTop, parentLeft2);
        }
        iArr[0] = parentTop;
        iArr[1] = parentBottom;
        if (A0J[0].charAt(31) == 'p') {
            throw new RuntimeException();
        }
        A0J[0] = "97vXAXgJ0WxvI5IvBZpOR2Ky1DZNuVnu";
        return iArr;
    }

    public final int A0V() {
        return -1;
    }

    public final int A0W() {
        C06033y c06033y = this.A01;
        if (c06033y != null) {
            return c06033y.A05();
        }
        return 0;
    }

    public final int A0X() {
        return this.A0A;
    }

    public final int A0Y() {
        return this.A0B;
    }

    public final int A0Z() {
        EB eb2 = this.A03;
        C4O a10 = eb2 != null ? eb2.getAdapter() : null;
        if (a10 != null) {
            return a10.A0D();
        }
        return 0;
    }

    public final int A0a() {
        return C3F.A01(this.A03);
    }

    public final int A0b() {
        return C3F.A02(this.A03);
    }

    public final int A0c() {
        return C3F.A03(this.A03);
    }

    public final int A0d() {
        EB eb2 = this.A03;
        if (eb2 != null) {
            return eb2.getPaddingBottom();
        }
        return 0;
    }

    public final int A0e() {
        EB eb2 = this.A03;
        if (eb2 != null) {
            return eb2.getPaddingLeft();
        }
        return 0;
    }

    public final int A0f() {
        EB eb2 = this.A03;
        if (eb2 != null) {
            return eb2.getPaddingRight();
        }
        return 0;
    }

    public final int A0g() {
        EB eb2 = this.A03;
        if (eb2 != null) {
            return eb2.getPaddingTop();
        }
        return 0;
    }

    public final int A0h() {
        return this.A0C;
    }

    public final int A0i() {
        return this.A0D;
    }

    public final int A0j(View view) {
        return view.getBottom() + A02(view);
    }

    public final int A0k(View view) {
        return view.getLeft() - A03(view);
    }

    public final int A0l(View view) {
        Rect rect = ((C06064b) view.getLayoutParams()).A03;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int A0m(View view) {
        Rect rect = ((C06064b) view.getLayoutParams()).A03;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public final int A0n(View view) {
        return view.getRight() + A04(view);
    }

    public final int A0o(View view) {
        return view.getTop() - A05(view);
    }

    public final int A0p(View view) {
        return ((C06064b) view.getLayoutParams()).A00();
    }

    public int A0q(C06124i c06124i, C06194p c06194p) {
        EB eb2 = this.A03;
        if (eb2 == null || eb2.A04 == null || !A24()) {
            return 1;
        }
        return this.A03.A04.A0D();
    }

    public int A0r(C06124i c06124i, C06194p c06194p) {
        EB eb2 = this.A03;
        if (eb2 == null || eb2.A04 == null || !A25()) {
            return 1;
        }
        return this.A03.A04.A0D();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b A[RETURN] */
    public final View A0s() {
        EB eb2 = this.A03;
        if (eb2 == null) {
            return null;
        }
        View focusedChild = eb2.getFocusedChild();
        String[] strArr = A0J;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A0J[3] = "iiKud1wfkCloFGZ1U";
        if (focusedChild != null) {
            C06033y c06033y = this.A01;
            String[] strArr2 = A0J;
            if (strArr2[5].length() != strArr2[1].length()) {
                A0J[0] = "7ET4ZuKdeEmot2qkcvXky1gJdqYIXUUX";
                if (!c06033y.A0K(focusedChild)) {
                    return focusedChild;
                }
            } else {
                A0J[7] = "xPYIlKgRfeB9qWlMIQGlIgoODb";
                if (!c06033y.A0K(focusedChild)) {
                    return focusedChild;
                }
            }
        }
        return null;
    }

    public final View A0t(int i10) {
        C06033y c06033y = this.A01;
        if (c06033y != null) {
            return c06033y.A09(i10);
        }
        return null;
    }

    public final View A0u(View view, int i10) {
        return null;
    }

    public C06064b A0v(Context context, AttributeSet attributeSet) {
        return new C06064b(context, attributeSet);
    }

    public C06064b A0w(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C06064b) {
            return new C06064b((C06064b) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C06064b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C06064b(layoutParams);
    }

    public final void A0x() {
        AbstractC06174n abstractC06174n = this.A02;
        if (abstractC06174n != null) {
            abstractC06174n.A09();
        }
    }

    public final void A0y() {
        EB eb2 = this.A03;
        if (eb2 != null) {
            eb2.requestLayout();
        }
    }

    public final void A0z(int i10) {
        EB eb2 = this.A03;
        if (eb2 != null) {
            eb2.A1U(i10);
        }
    }

    public final void A10(int i10) {
        EB eb2 = this.A03;
        if (eb2 != null) {
            eb2.A1V(i10);
        }
    }

    public final void A11(int i10, int i11) {
        this.A0C = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.A0D = mode;
        if (mode == 0 && !EB.A1B) {
            this.A0C = 0;
        }
        this.A0A = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.A0B = mode2;
        if (mode2 == 0 && !EB.A1B) {
            this.A0A = 0;
        }
    }

    public final void A12(int i10, int i11) {
        int iA0W = A0W();
        if (iA0W == 0) {
            this.A03.A1b(i10, i11);
            return;
        }
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int maxX = Integer.MIN_VALUE;
        for (int i14 = 0; i14 < iA0W; i14++) {
            View viewA0t = A0t(i14);
            Rect rect = this.A03.A0p;
            A0H(viewA0t, rect);
            int count = rect.left;
            if (count < i12) {
                i12 = rect.left;
            }
            int count2 = rect.right;
            if (count2 > maxY) {
                maxY = rect.right;
            }
            int count3 = rect.top;
            if (count3 < i13) {
                i13 = rect.top;
            }
            int count4 = rect.bottom;
            if (count4 > maxX) {
                maxX = rect.bottom;
            }
        }
        this.A03.A0p.set(i12, i13, maxY, maxX);
        String[] strArr = A0J;
        String str = strArr[2];
        String str2 = strArr[4];
        int minX = str.length();
        int count5 = str2.length();
        if (minX == count5) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[2] = "hT857kPIBtMq0qM94";
        strArr2[4] = "qfhhOTku3";
        A15(this.A03.A0p, i10, i11);
    }

    public final void A13(int i10, int i11) {
        this.A03.setMeasuredDimension(i10, i11);
    }

    public final void A14(int i10, C06124i c06124i) {
        View view = A0t(i10);
        A0A(i10);
        c06124i.A0X(view);
    }

    public void A15(Rect rect, int i10, int i11) {
        int usedHeight = rect.width() + A0e() + A0f();
        int iHeight = rect.height();
        int usedWidth = A0g();
        int i12 = iHeight + usedWidth;
        int usedWidth2 = A0d();
        int width = i12 + usedWidth2;
        int usedWidth3 = A0c();
        int usedHeight2 = A00(i10, usedHeight, usedWidth3);
        int usedWidth4 = A0b();
        A13(usedHeight2, A00(i11, width, usedWidth4));
    }

    public final void A16(View view) {
        A18(view, -1);
    }

    public final void A17(View view) {
        A19(view, -1);
    }

    public final void A18(View view, int i10) {
        A0G(view, i10, true);
    }

    public final void A19(View view, int i10) {
        A0G(view, i10, false);
    }

    public final void A1A(View view, int i10, int i11) {
        C06064b c06064b = (C06064b) view.getLayoutParams();
        Rect rectA1D = this.A03.A1D(view);
        int i12 = i10 + rectA1D.left + rectA1D.right;
        int i13 = i11 + rectA1D.top + rectA1D.bottom;
        int iA01 = A01(A0h(), A0i(), A0e() + A0f() + c06064b.leftMargin + c06064b.rightMargin + i12, c06064b.width, A24());
        int iA0X = A0X();
        int iA0Y = A0Y();
        int widthSpec = A0g();
        int iA02 = A01(iA0X, iA0Y, widthSpec + A0d() + c06064b.topMargin + c06064b.bottomMargin + i13, c06064b.height, A25());
        if (A1a(view, iA01, iA02, c06064b)) {
            view.measure(iA01, iA02);
        }
    }

    public final void A1B(View view, int i10, int i11, int i12, int i13) {
        C06064b c06064b = (C06064b) view.getLayoutParams();
        Rect rect = c06064b.A03;
        view.layout(rect.left + i10 + c06064b.leftMargin, rect.top + i11 + c06064b.topMargin, (i12 - rect.right) - c06064b.rightMargin, (i13 - rect.bottom) - c06064b.bottomMargin);
    }

    public final void A1C(View view, C05843e c05843e) {
        AbstractC06224s abstractC06224sA0F = EB.A0F(view);
        if (abstractC06224sA0F != null && !abstractC06224sA0F.A0c() && !this.A01.A0K(abstractC06224sA0F.A0H)) {
            A1K(this.A03.A0r, this.A03.A0s, view, c05843e);
        }
    }

    public final void A1D(View view, C06124i c06124i) {
        A0D(view);
        c06124i.A0X(view);
    }

    public final void A1E(View view, boolean z10, Rect rect) {
        Matrix matrix;
        if (z10) {
            Rect rect2 = ((C06064b) view.getLayoutParams()).A03;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.A03 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.A03.A0q;
            rectF.set(rect);
            matrix.mapRect(rectF);
            int iFloor = (int) Math.floor(rectF.left);
            int iFloor2 = (int) Math.floor(rectF.top);
            float f10 = rectF.right;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[7] = "WbBFuKAltYM";
            rect.set(iFloor, iFloor2, (int) Math.ceil(f10), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void A1F(C05843e c05843e) {
        A0L(this.A03.A0r, this.A03.A0s, c05843e);
    }

    public final void A1G(C06124i c06124i) {
        int iA0E = c06124i.A0E();
        for (int i10 = iA0E - 1; i10 >= 0; i10--) {
            View viewA0F = c06124i.A0F(i10);
            AbstractC06224s abstractC06224sA0F = EB.A0F(viewA0F);
            if (!abstractC06224sA0F.A0h()) {
                abstractC06224sA0F.A0Z(false);
                if (abstractC06224sA0F.A0e()) {
                    this.A03.removeDetachedView(viewA0F, false);
                }
                if (this.A03.A05 != null) {
                    this.A03.A05.A0K(abstractC06224sA0F);
                }
                abstractC06224sA0F.A0Z(true);
                c06124i.A0V(viewA0F);
            }
        }
        c06124i.A0L();
        if (iA0E > 0) {
            this.A03.invalidate();
        }
    }

    public final void A1H(C06124i c06124i) {
        int childCount = A0W();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            A0J(c06124i, i10, A0t(i10));
        }
    }

    public final void A1I(C06124i c06124i) {
        for (int iA0W = A0W() - 1; iA0W >= 0; iA0W--) {
            if (!EB.A0F(A0t(iA0W)).A0h()) {
                A14(iA0W, c06124i);
            }
        }
    }

    public void A1J(C06124i c06124i, C06194p c06194p, int i10, int i11) {
        this.A03.A1b(i10, i11);
    }

    public void A1K(C06124i c06124i, C06194p c06194p, View view, C05843e c05843e) {
        int iA0p = A25() ? A0p(view) : 0;
        int iA0p2 = A24() ? A0p(view) : 0;
        String[] strArr = A0J;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A0J[3] = "h476R5jl";
        C05823c itemInfo = C05823c.A00(iA0p, 1, iA0p2, 1, false, false);
        c05843e.A0Q(itemInfo);
    }

    public final void A1L(AbstractC06174n abstractC06174n) {
        AbstractC06174n abstractC06174n2 = this.A02;
        if (abstractC06174n2 != null && abstractC06174n != abstractC06174n2 && abstractC06174n2.A0F()) {
            this.A02.A09();
        }
        this.A02 = abstractC06174n;
        abstractC06174n.A0D(this.A03, this);
    }

    public void A1M(EB eb2) {
    }

    public final void A1N(EB eb2) {
        this.A07 = true;
    }

    public final void A1O(EB eb2) {
        A11(View.MeasureSpec.makeMeasureSpec(eb2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(eb2.getHeight(), 1073741824));
    }

    public final void A1P(EB eb2) {
        if (eb2 == null) {
            this.A03 = null;
            this.A01 = null;
            this.A0C = 0;
            this.A0A = 0;
        } else {
            this.A03 = eb2;
            this.A01 = eb2.A01;
            this.A0C = eb2.getWidth();
            this.A0A = eb2.getHeight();
        }
        this.A0D = 1073741824;
        this.A0B = 1073741824;
    }

    public void A1Q(EB eb2, int i10, int i11) {
    }

    public void A1R(EB eb2, int i10, int i11) {
    }

    public void A1S(EB eb2, int i10, int i11, int i12) {
    }

    public void A1T(EB eb2, int i10, int i11, Object obj) {
    }

    public final void A1U(EB eb2, C06124i c06124i) {
        this.A07 = false;
        A20(eb2, c06124i);
    }

    public final void A1V(boolean z10) {
        this.A06 = z10;
    }

    public final boolean A1W() {
        int iA0W = A0W();
        for (int i10 = 0; i10 < iA0W; i10++) {
            ViewGroup.LayoutParams layoutParams = A0t(i10).getLayoutParams();
            int childCount = layoutParams.width;
            if (childCount < 0) {
                int childCount2 = layoutParams.height;
                if (childCount2 < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A1X() {
        EB eb2 = this.A03;
        return eb2 != null && eb2.A0B;
    }

    public final boolean A1Y() {
        return this.A0E;
    }

    public final boolean A1Z(int i10, Bundle bundle) {
        return A0Q(this.A03.A0r, this.A03.A0s, i10, bundle);
    }

    public final boolean A1a(View view, int i10, int i11, C06064b c06064b) {
        return (!view.isLayoutRequested() && this.A0F && A0O(view.getWidth(), i10, c06064b.width) && A0O(view.getHeight(), i11, c06064b.height)) ? false : true;
    }

    public final boolean A1b(View view, int i10, Bundle bundle) {
        return A0R(this.A03.A0r, this.A03.A0s, view, i10, bundle);
    }

    public boolean A1c(C06064b c06064b) {
        return c06064b != null;
    }

    public final boolean A1d(EB eb2, View view, Rect rect, boolean z10) {
        return A1e(eb2, view, rect, z10, false);
    }

    public final boolean A1e(EB eb2, View view, Rect rect, boolean z10, boolean z11) {
        int[] scrollAmount = A0U(view, rect);
        int i10 = scrollAmount[0];
        int i11 = scrollAmount[1];
        if ((z11 && !A0S(eb2, i10, i11)) || (i10 == 0 && i11 == 0)) {
            return false;
        }
        if (z10) {
            eb2.scrollBy(i10, i11);
        } else {
            eb2.A1f(i10, i11);
        }
        return true;
    }

    public final boolean A1f(EB eb2, C06194p c06194p, View view, View view2) {
        return A0T(eb2, view, view2);
    }

    public final boolean A1g(EB eb2, ArrayList<View> views, int i10, int i11) {
        return false;
    }

    public int A1h(int i10, C06124i c06124i, C06194p c06194p) {
        return 0;
    }

    public int A1i(int i10, C06124i c06124i, C06194p c06194p) {
        return 0;
    }

    public int A1j(C06194p c06194p) {
        return 0;
    }

    public int A1k(C06194p c06194p) {
        return 0;
    }

    public int A1l(C06194p c06194p) {
        return 0;
    }

    public int A1m(C06194p c06194p) {
        return 0;
    }

    public int A1n(C06194p c06194p) {
        return 0;
    }

    public int A1o(C06194p c06194p) {
        return 0;
    }

    public Parcelable A1p() {
        return null;
    }

    public View A1q(int i10) {
        int iA0W = A0W();
        for (int i11 = 0; i11 < iA0W; i11++) {
            View child = A0t(i11);
            AbstractC06224s abstractC06224sA0F = EB.A0F(child);
            if (abstractC06224sA0F != null) {
                int childCount = abstractC06224sA0F.A0I();
                if (childCount == i10 && !abstractC06224sA0F.A0h() && (this.A03.A0s.A07() || !abstractC06224sA0F.A0c())) {
                    return child;
                }
            }
        }
        return null;
    }

    public View A1r(View view, int i10, C06124i c06124i, C06194p c06194p) {
        return null;
    }

    public void A1t(int i10) {
    }

    public void A1u(int i10, int i11, C06194p c06194p, C4Y c4y) {
    }

    public void A1v(int i10, C4Y c4y) {
    }

    public void A1w(Parcelable parcelable) {
    }

    public void A1x(AccessibilityEvent accessibilityEvent) {
        A0K(this.A03.A0r, this.A03.A0s, accessibilityEvent);
    }

    public void A1y(C06124i c06124i, C06194p c06194p) {
        Log.e(A07(129, 12, 19), A07(141, 67, 101));
    }

    public void A1z(C06194p c06194p) {
    }

    public void A20(EB eb2, C06124i c06124i) {
    }

    public void A21(EB eb2, C06194p c06194p, int i10) {
        Log.e(A07(129, 12, 19), A07(208, 68, 14));
    }

    public void A22(String str) {
        EB eb2 = this.A03;
        if (eb2 != null) {
            eb2.A1q(str);
        }
    }

    public boolean A23() {
        return false;
    }

    public boolean A24() {
        return false;
    }

    public boolean A25() {
        return false;
    }

    public boolean A26() {
        return false;
    }
}
