package com.facebook.ads.redexgen.X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$DecorView;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3T extends ViewGroup {
    public static byte[] A0u;
    public static String[] A0v = {"Pb5dMBpLoD8olSqqN3M1wt71s6WfJWWx", "mawes8eGWKEfT5kg0DwbKE", "yCX0UAcI", "nBGVAWTalDrx8Q3Q0HTp4hPpqgaJoZ5h", "", "", "gKpLqM1fc4CgqUT7jB7tIrf4xsKdVFyY", "wKHjR3FqXT8StRIGs0zAAfuJmbbhub4H"};
    public static final int[] A0w;
    public static final Interpolator A0x;
    public static final C3S A0y;
    public static final Comparator<C3L> A0z;
    public int A00;
    public AnonymousClass30 A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public Drawable A0S;
    public Parcelable A0T;
    public VelocityTracker A0U;
    public EdgeEffect A0V;
    public EdgeEffect A0W;
    public Scroller A0X;
    public C3O A0Y;
    public C3O A0Z;
    public C3P A0a;
    public C3Q A0b;
    public ClassLoader A0c;
    public ArrayList<View> A0d;
    public List<ViewPager.OnAdapterChangeListener> A0e;
    public List<C3O> A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public final Rect A0q;
    public final C3L A0r;
    public final Runnable A0s;
    public final ArrayList<C3L> A0t;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C3L A03() {
        int clientWidth = getClientWidth();
        float f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        if (clientWidth > 0) {
            f10 = this.A0M / clientWidth;
        }
        int i10 = -1;
        float f11 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        float f12 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        boolean z10 = true;
        C3L c3l = null;
        int i11 = 0;
        while (i11 < this.A0t.size()) {
            C3L c3l2 = this.A0t.get(i11);
            if (!z10 && c3l2.A02 != i10 + 1) {
                c3l2 = this.A0r;
                c3l2.A00 = f11 + f12 + f10;
                c3l2.A02 = i10 + 1;
                c3l2.A01 = this.A01.A04(c3l2.A02);
                i11--;
            }
            f11 = c3l2.A00;
            float f13 = c3l2.A01 + f11 + f10;
            if (!z10) {
                String[] strArr = A0v;
                if (strArr[4].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0v;
                strArr2[3] = "VrUwTTzuyHD2SkMMCenWDHvarMqbXCCI";
                strArr2[6] = "LX2NnyEsDXWEx3dFbPH8p7fzI1U1dTZ8";
                if (scrollX < f11) {
                    return c3l;
                }
            }
            if (scrollX >= f13) {
                int size = this.A0t.size() - 1;
                String[] strArr3 = A0v;
                if (strArr3[3].charAt(15) != strArr3[6].charAt(15)) {
                    A0v[2] = "sbP3P6ChvdnfvWI";
                    if (i11 != size) {
                        z10 = false;
                        i10 = c3l2.A02;
                        f12 = c3l2.A01;
                        c3l = c3l2;
                        i11++;
                    }
                } else {
                    A0v[1] = "kvGf4Zg53U8bz7GLeUNnCLzy4o";
                    if (i11 != size) {
                        z10 = false;
                        i10 = c3l2.A02;
                        f12 = c3l2.A01;
                        c3l = c3l2;
                        i11++;
                    }
                }
            }
            return c3l2;
        }
        return c3l;
    }

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0u, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0u = new byte[]{-99, -70, -69, -99, -62, -14, 3, 9, 7, 20, -62, 5, 14, 3, 21, 21, -36, -62, -48, 0, 17, 23, 21, 34, -48, Ascii.EM, 20, -22, -48, -34, 14, 48, 45, 32, 42, 35, 43, Ascii.US, 50, 39, 33, -34, Ascii.US, 34, Ascii.US, 46, 50, 35, 48, -8, -34, -30, 54, 49, 49, -30, 53, 47, 35, 46, 46, -3, -30, 38, 39, 40, 35, 55, 46, 54, 43, 48, 41, -30, 54, 49, -30, -66, -78, -8, 1, 7, 0, -10, -52, -78, -69, -39, -26, -26, -25, -20, -104, -39, -36, -36, -104, -24, -39, -33, -35, -22, -104, -36, -35, -37, -25, -22, -104, -18, -31, -35, -17, -104, -36, -19, -22, -31, -26, -33, -104, -28, -39, -15, -25, -19, -20, -10, 9, 21, Ascii.EM, 9, 23, Ascii.CAN, 9, 8, -60, 19, 10, 10, 23, 7, 22, 9, 9, 18, -60, 20, 5, 11, 9, -60, 16, 13, 17, 13, Ascii.CAN, -60, -10, 10, 7, -62, 3, 18, 18, 14, 11, 5, 3, 22, 11, 17, 16, -55, 21, -62, -14, 3, 9, 7, 20, -29, 6, 3, 18, 22, 7, 20, -62, 5, 10, 3, 16, 9, 7, 6, -62, 22, 10, 7, -62, 3, 6, 3, 18, 22, 7, 20, -55, 21, -62, 5, 17, 16, 22, 7, 16, 22, 21, -62, Ascii.EM, 11, 22, 10, 17, 23, 22, -62, 5, 3, 14, 14, 11, 16, 9, -62, -14, 3, 9, 7, 20, -29, 6, 3, 18, 22, 7, 20, -59, 16, 17, 22, 11, 8, Ascii.ESC, -26, 3, 22, 3, -11, 7, 22, -27, 10, 3, 16, 9, 7, 6, -61, -62, -25, Ascii.SUB, 18, 7, 5, 22, 7, 6, -62, 3, 6, 3, 18, 22, 7, 20, -62, 11, 22, 7, 15, -62, 5, 17, 23, 16, 22, -36, -62, -19, 0, -4, 14, -25, -8, -2, -4, 9, Ascii.EM, 42, 42, 39, 47, 11, Ascii.ESC, 42, 39, 36, 36, -40, 44, 42, 33, Ascii.GS, Ascii.FS, -40, 44, 39, -40, Ascii.RS, 33, 38, Ascii.FS, -40, Ascii.RS, 39, Ascii.ESC, 45, 43, -40, Ascii.SUB, Ascii.EM, 43, Ascii.GS, Ascii.FS, -40, 39, 38, -40, 38, 39, 38, -27, Ascii.ESC, 32, 33, 36, Ascii.FS, -40, Ascii.ESC, 45, 42, 42, Ascii.GS, 38, 44, -40, Ascii.RS, 39, Ascii.ESC, 45, 43, Ascii.GS, Ascii.FS, -40, 46, 33, Ascii.GS, 47, -40, 76, 75, Ascii.RS, 65, 62, 77, 81, 66, 79, 32, 69, 62, 75, 68, 66, 65, 19, 18, -12, 5, 11, 9, -9, 7, 22, 19, 16, 16, 9, 8, -60, 8, 13, 8, -60, 18, 19, Ascii.CAN, -60, 7, 5, 16, 16, -60, 23, Ascii.EM, 20, 9, 22, 7, 16, 5, 23, 23, -60, 13, 17, 20, 16, 9, 17, 9, 18, Ascii.CAN, 5, Ascii.CAN, 13, 19, 18, 85, 83, 66, 79, 84, 71, 80, 83, 78, 49, 66, 72, 70};
    }

    /* JADX WARN: Code duplicated, block: B:71:0x013a  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final void A0G(int i10) {
        String hexString;
        C3L c3l;
        float f10;
        C3L c3lA04 = null;
        int i11 = this.A00;
        if (i11 != i10) {
            c3lA04 = A04(i11);
            this.A00 = i10;
        }
        if (this.A01 == null) {
            A0B();
            return;
        }
        if (this.A0o) {
            A0B();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i12 = this.A0L;
        int iMax = Math.max(0, this.A00 - i12);
        int iA05 = this.A01.A05();
        int iMin = Math.min(iA05 - 1, this.A00 + i12);
        if (iA05 != this.A0G) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
                if (A0v[2].length() != 14) {
                    A0v[2] = "3cJ8G";
                }
                throw new RuntimeException();
            }
            throw new IllegalStateException(A08(158, 142, 58) + this.A0G + A08(77, 9, 42) + iA05 + A08(18, 11, 72) + hexString + A08(4, 14, 58) + getClass() + A08(29, 22, 86) + this.A01.getClass());
        }
        C3L c3lA05 = null;
        if (A0v[2].length() != 14) {
            A0v[1] = "Tot0RAE";
            int i13 = 0;
            while (i13 < this.A0t.size()) {
                C3L c3l2 = this.A0t.get(i13);
                if (c3l2.A02 >= this.A00) {
                    if (c3l2.A02 != this.A00) {
                        break;
                    }
                    c3lA05 = c3l2;
                    break;
                }
                i13++;
            }
            if (c3lA05 == null && iA05 > 0) {
                int i14 = this.A00;
                if (A0v[1].length() != 12) {
                    A0v[2] = "0";
                    c3lA05 = A05(i14, i13);
                } else {
                    String[] strArr = A0v;
                    strArr[4] = "";
                    strArr[5] = "";
                    c3lA05 = A05(i14, i13);
                }
            }
            if (c3lA05 != null) {
                float f11 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                int i15 = i13 - 1;
                if (i15 >= 0) {
                    C3L c3l3 = this.A0t.get(i15);
                    String[] strArr2 = A0v;
                    if (strArr2[3].charAt(15) != strArr2[6].charAt(15)) {
                        A0v[1] = "VNMCyWdkMCax4jTa2KYBa9F64T8dlp";
                        c3l = c3l3;
                    }
                } else {
                    c3l = null;
                }
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : (2.0f - c3lA05.A01) + (getPaddingLeft() / clientWidth);
                for (int i16 = this.A00 - 1; i16 >= 0; i16--) {
                    if (f11 >= paddingLeft && i16 < iMax) {
                        if (c3l == null) {
                            break;
                        }
                        if (i16 == c3l.A02 && !c3l.A04) {
                            this.A0t.remove(i15);
                            this.A01.A0B(this, i16, c3l.A03);
                            i15--;
                            i13--;
                            c3l = i15 >= 0 ? this.A0t.get(i15) : null;
                        }
                    } else if (c3l == null || i16 != c3l.A02) {
                        f11 += A05(i16, i15 + 1).A01;
                        i13++;
                        c3l = i15 >= 0 ? this.A0t.get(i15) : null;
                    } else {
                        f11 += c3l.A01;
                        String[] strArr3 = A0v;
                        if (strArr3[7].charAt(10) == strArr3[0].charAt(10)) {
                            String[] strArr4 = A0v;
                            strArr4[4] = "";
                            strArr4[5] = "";
                            i15--;
                            c3l = i15 >= 0 ? this.A0t.get(i15) : null;
                        }
                    }
                }
                float f12 = c3lA05.A01;
                int i17 = i13 + 1;
                if (f12 < 2.0f) {
                    C3L c3l4 = i17 < this.A0t.size() ? this.A0t.get(i17) : null;
                    if (clientWidth <= 0) {
                        f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                    } else {
                        float paddingRight = getPaddingRight();
                        float f13 = clientWidth;
                        String[] strArr5 = A0v;
                        if (strArr5[4].length() != strArr5[5].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr6 = A0v;
                        strArr6[4] = "";
                        strArr6[5] = "";
                        f10 = (paddingRight / f13) + 2.0f;
                    }
                    for (int i18 = this.A00 + 1; i18 < iA05; i18++) {
                        if (f12 >= f10 && i18 > iMin) {
                            if (c3l4 == null) {
                                break;
                            }
                            if (i18 == c3l4.A02 && !c3l4.A04) {
                                this.A0t.remove(i17);
                                this.A01.A0B(this, i18, c3l4.A03);
                                c3l4 = i17 < this.A0t.size() ? this.A0t.get(i17) : null;
                            }
                        } else if (c3l4 == null || i18 != c3l4.A02) {
                            C3L c3lA06 = A05(i18, i17);
                            i17++;
                            f12 += c3lA06.A01;
                            c3l4 = i17 < this.A0t.size() ? this.A0t.get(i17) : null;
                        } else {
                            f12 += c3l4.A01;
                            i17++;
                            c3l4 = i17 < this.A0t.size() ? this.A0t.get(i17) : null;
                        }
                    }
                }
                A0Q(c3lA05, i13, c3lA04);
            }
            int childCount = getChildCount();
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt = getChildAt(i19);
                C3M c3m = (C3M) childAt.getLayoutParams();
                c3m.A01 = i19;
                if (!c3m.A05 && c3m.A00 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    C3L c3lA07 = A07(childAt);
                    String[] strArr7 = A0v;
                    if (strArr7[7].charAt(10) == strArr7[0].charAt(10)) {
                        A0v[1] = "EEa7ILjnbFiKaMBJBW0FEjvS9loAIL";
                        if (c3lA07 != null) {
                            c3m.A00 = c3lA07.A01;
                            c3m.A02 = c3lA07.A02;
                        }
                    } else if (c3lA07 != null) {
                        c3m.A00 = c3lA07.A01;
                        c3m.A02 = c3lA07.A02;
                    }
                }
            }
            A0B();
            String[] strArr8 = A0v;
            if (strArr8[4].length() != strArr8[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr9 = A0v;
            strArr9[7] = "fAvJTe45YQ8jwRLJzle6w88GhXZAW5fe";
            strArr9[0] = "XHTmtVqtTM8ykl9XiQ4ZuPNQzfhQsr72";
            if (hasFocus()) {
                View viewFindFocus = findFocus();
                String[] strArr10 = A0v;
                if (strArr10[3].charAt(15) == strArr10[6].charAt(15)) {
                    throw new RuntimeException();
                }
                String[] strArr11 = A0v;
                strArr11[3] = "98nQxxcA6vj5924MyChW7mkeiNJnWKv2";
                strArr11[6] = "ju5RZqhAYuaQhiOPGNIJcLOaoEeV3OP8";
                C3L c3lA08 = viewFindFocus != null ? A06(viewFindFocus) : null;
                if (c3lA08 == null || c3lA08.A02 != this.A00) {
                    for (int i20 = 0; i20 < getChildCount(); i20++) {
                        View childAt2 = getChildAt(i20);
                        C3L c3lA09 = A07(childAt2);
                        if (c3lA09 != null && c3lA09.A02 == this.A00 && childAt2.requestFocus(2)) {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final void A0J(int i10, int i11, int i12) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.A0X;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.A0l ? this.A0X.getCurrX() : this.A0X.getStartX();
            this.A0X.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i13 = i10 - scrollX;
        int i14 = i11 - scrollY;
        if (i13 == 0 && i14 == 0) {
            A0R(false);
            A0f();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i15 = clientWidth / 2;
        float fA00 = i15 + (i15 * A00(Math.min(1.0f, (Math.abs(i13) * 1.0f) / clientWidth)));
        int iAbs2 = Math.abs(i12);
        if (iAbs2 > 0) {
            float f10 = iAbs2;
            if (A0v[1].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0v;
            strArr[4] = "";
            strArr[5] = "";
            iAbs = Math.round(Math.abs(fA00 / f10) * 1000.0f) * 4;
        } else {
            iAbs = (int) ((1.0f + (Math.abs(i13) / (this.A0M + (clientWidth * this.A01.A04(this.A00))))) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.A0l = false;
        this.A0X.startScroll(scrollX, scrollY, i13, i14, iMin);
        C3F.A07(this);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        C3L c3lA07;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (c3lA07 = A07(childAt)) != null && c3lA07.A02 == this.A00) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        C3M c3m;
        int i12;
        int i13;
        setMeasuredDimension(getDefaultSize(0, i10), getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.A0I = Math.min(measuredWidth / 10, this.A0E);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C3M c3m2 = (C3M) childAt.getLayoutParams();
                if (A0v[1].length() == 12) {
                    throw new RuntimeException();
                }
                String[] strArr = A0v;
                strArr[4] = "";
                strArr[5] = "";
                if (c3m2 != null && c3m2.A05) {
                    int i15 = c3m2.A04 & 7;
                    int i16 = c3m2.A04 & 112;
                    int i17 = Integer.MIN_VALUE;
                    int i18 = Integer.MIN_VALUE;
                    boolean z10 = i16 == 48 || i16 == 80;
                    boolean z11 = i15 == 3 || i15 == 5;
                    if (z10) {
                        i17 = 1073741824;
                    } else if (z11) {
                        i18 = 1073741824;
                    }
                    if (c3m2.width != -2) {
                        i17 = 1073741824;
                        i12 = c3m2.width != -1 ? c3m2.width : paddingLeft;
                    } else {
                        i12 = paddingLeft;
                    }
                    if (c3m2.height != -2) {
                        i18 = 1073741824;
                        if (c3m2.height != -1) {
                            i13 = c3m2.height;
                            if (A0v[1].length() != 12) {
                                A0v[1] = "VKsSzAx6pk9J5wmYrW5ACp";
                            }
                        } else {
                            i13 = measuredHeight;
                        }
                    } else {
                        i13 = measuredHeight;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, i17), View.MeasureSpec.makeMeasureSpec(i13, i18));
                    if (z10) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z11) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
            }
        }
        this.A0B = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.A0A = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.A0j = true;
        A0f();
        this.A0j = false;
        int childCount2 = getChildCount();
        for (int i19 = 0; i19 < childCount2; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8 && ((c3m = (C3M) childAt2.getLayoutParams()) == null || !c3m.A05)) {
                float f10 = paddingLeft;
                String[] strArr2 = A0v;
                if (strArr2[4].length() != strArr2[5].length()) {
                    throw new RuntimeException();
                }
                A0v[1] = "11cm9STM7FlxGR3";
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * c3m.A00), 1073741824), this.A0A);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x010c  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass30 anonymousClass30;
        if (this.A0h) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (anonymousClass30 = this.A01) == null || anonymousClass30.A05() == 0) {
            return false;
        }
        if (this.A0U == null) {
            this.A0U = VelocityTracker.obtain();
        }
        this.A0U.addMovement(motionEvent);
        boolean zA0U = false;
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.A0X.abortAnimation();
                this.A0o = false;
                A0f();
                float x10 = motionEvent.getX();
                this.A03 = x10;
                this.A05 = x10;
                float y10 = motionEvent.getY();
                this.A04 = y10;
                this.A06 = y10;
                this.A08 = motionEvent.getPointerId(0);
                break;
            case 1:
                if (this.A0k) {
                    VelocityTracker velocityTracker = this.A0U;
                    velocityTracker.computeCurrentVelocity(1000, this.A0J);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.A08);
                    this.A0o = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    C3L c3lA03 = A03();
                    A0O(A01(c3lA03.A02, ((scrollX / clientWidth) - c3lA03.A00) / (c3lA03.A01 + (this.A0M / clientWidth)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.A08)) - this.A03)), true, true, xVelocity);
                    zA0U = A0U();
                }
                break;
            case 2:
                if (!this.A0k) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.A08);
                    if (iFindPointerIndex != -1) {
                        float x11 = motionEvent.getX(iFindPointerIndex);
                        float fAbs = Math.abs(x11 - this.A05);
                        float y11 = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y11 - this.A06);
                        if (fAbs > this.A0R && fAbs > fAbs2) {
                            this.A0k = true;
                            A0T(true);
                            float f10 = this.A03;
                            this.A05 = x11 - f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? f10 + this.A0R : f10 - this.A0R;
                            this.A06 = y11;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (this.A0k) {
                            zA0U = false | A0X(motionEvent.getX(motionEvent.findPointerIndex(this.A08)));
                        }
                    } else {
                        zA0U = A0U();
                    }
                } else if (this.A0k) {
                    zA0U = false | A0X(motionEvent.getX(motionEvent.findPointerIndex(this.A08)));
                }
                break;
            case 3:
                if (this.A0k) {
                    A0M(this.A00, true, 0, false);
                    zA0U = A0U();
                }
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.A05 = motionEvent.getX(actionIndex);
                this.A08 = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                A0P(motionEvent);
                this.A05 = motionEvent.getX(motionEvent.findPointerIndex(this.A08));
                break;
        }
        if (zA0U) {
            C3F.A07(this);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.ads.redexgen.X.3S] */
    static {
        A0C();
        A0w = new int[]{R.attr.layout_gravity};
        A0z = new Comparator<C3L>() { // from class: com.facebook.ads.redexgen.X.3H
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(C3L c3l, C3L c3l2) {
                return c3l.A02 - c3l2.A02;
            }
        };
        A0x = new Interpolator() { // from class: com.facebook.ads.redexgen.X.3I
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        };
        A0y = new Comparator<View>() { // from class: com.facebook.ads.redexgen.X.3S
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(View view, View view2) {
                C3M c3m = (C3M) view.getLayoutParams();
                C3M c3m2 = (C3M) view2.getLayoutParams();
                if (c3m.A05 != c3m2.A05) {
                    return c3m.A05 ? 1 : -1;
                }
                return c3m.A02 - c3m2.A02;
            }
        };
    }

    public C3T(Context context) {
        super(context);
        this.A0t = new ArrayList<>();
        this.A0r = new C3L();
        this.A0q = new Rect();
        this.A0O = -1;
        this.A0T = null;
        this.A0c = null;
        this.A02 = -3.4028235E38f;
        this.A07 = Float.MAX_VALUE;
        this.A0L = 1;
        this.A08 = -1;
        this.A0i = true;
        this.A0n = false;
        this.A0s = new Runnable() { // from class: com.facebook.ads.redexgen.X.3J
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.setScrollState(0);
                this.A00.A0f();
            }
        };
        this.A0P = 0;
        A0D();
    }

    private final float A00(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private int A01(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) > this.A0H && Math.abs(i11) > this.A0K) {
            if (i11 <= 0) {
                i10++;
            }
        } else {
            int targetPage = this.A00;
            float truncator = i10 >= targetPage ? 0.4f : 0.6f;
            i10 = ((int) (f10 + truncator)) + i10;
        }
        int targetPage2 = this.A0t.size();
        if (targetPage2 > 0) {
            C3L lastItem = this.A0t.get(0);
            ArrayList<C3L> arrayList = this.A0t;
            int targetPage3 = arrayList.size();
            C3L c3l = arrayList.get(targetPage3 - 1);
            int i13 = lastItem.A02;
            int targetPage4 = c3l.A02;
            return Math.max(i13, Math.min(i10, targetPage4));
        }
        return i10;
    }

    private Rect A02(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private final C3L A04(int i10) {
        for (int i11 = 0; i11 < i; i11++) {
            C3L ii = this.A0t.get(i11);
            int i12 = ii.A02;
            if (i12 == i10) {
                return ii;
            }
        }
        return null;
    }

    private final C3L A05(int i10, int i11) {
        C3L c3l = new C3L();
        c3l.A02 = i10;
        c3l.A03 = this.A01.A08(this, i10);
        c3l.A01 = this.A01.A04(i10);
        if (i11 < 0 || i11 >= this.A0t.size()) {
            this.A0t.add(c3l);
        } else {
            this.A0t.add(i11, c3l);
        }
        return c3l;
    }

    private final C3L A06(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return A07(view);
            }
        }
    }

    private final C3L A07(View view) {
        for (int i10 = 0; i10 < i; i10++) {
            C3L c3l = this.A0t.get(i10);
            if (this.A01.A0C(view, c3l.A03)) {
                return c3l;
            }
        }
        String[] strArr = A0v;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A0v[1] = "T6ty";
        return null;
    }

    private void A09() {
        this.A0k = false;
        this.A0m = false;
        VelocityTracker velocityTracker = this.A0U;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            String[] strArr = A0v;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0v[1] = "yoRarqzFlsm2scdQtgnfRphmjo";
            this.A0U = null;
        }
    }

    private void A0A() {
        int i10 = 0;
        while (i10 < i) {
            if (!((C3M) getChildAt(i10).getLayoutParams()).A05) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private void A0B() {
        if (this.A0F != 0) {
            ArrayList<View> arrayList = this.A0d;
            if (arrayList == null) {
                this.A0d = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.A0d.add(getChildAt(i10));
            }
            Collections.sort(this.A0d, A0y);
        }
    }

    private final void A0D() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.A0X = new Scroller(context, A0x);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.A0R = viewConfiguration.getScaledPagingTouchSlop();
        this.A0K = (int) (400.0f * f10);
        this.A0J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0V = new EdgeEffect(context);
        this.A0W = new EdgeEffect(context);
        this.A0H = (int) (25.0f * f10);
        this.A0C = (int) (2.0f * f10);
        this.A0E = (int) (16.0f * f10);
        C3F.A0B(this, new Z9(this));
        if (C3F.A00(this) == 0) {
            C3F.A09(this, 1);
        }
        C3F.A0C(this, new ZA(this));
    }

    private void A0E(int i10) {
        C3O c3o = this.A0Z;
        List<C3O> list = this.A0f;
        if (list != null) {
            int i11 = list.size();
            for (int i12 = 0; i12 < i11; i12++) {
                this.A0f.get(i12);
            }
        }
        C3O c3o2 = this.A0Y;
    }

    private void A0F(int i10) {
        C3O c3o = this.A0Z;
        List<C3O> list = this.A0f;
        if (list != null) {
            int i11 = list.size();
            for (int i12 = 0; i12 < i11; i12++) {
                this.A0f.get(i12);
            }
        }
        C3O c3o2 = this.A0Y;
    }

    private void A0H(int i10, float f10, int i11) {
        C3O c3o = this.A0Z;
        List<C3O> list = this.A0f;
        if (list != null) {
            int i12 = list.size();
            for (int i13 = 0; i13 < i12; i13++) {
                this.A0f.get(i13);
            }
        }
        C3O c3o2 = this.A0Y;
    }

    private final void A0I(int childLeft, float f10, int i10) {
        int paddingLeft;
        if (this.A0D > 0) {
            int hgrav = getScrollX();
            int i11 = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingLeft2 = A0v[1].length();
            if (paddingLeft2 == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0v;
            strArr[3] = "hSwONVQ9BwzgmNPK4tziO3X6uj4eQvsQ";
            strArr[6] = "gKhZoL4mhYlFRC9fFMXnjqdiW6EOuKfZ";
            int width = getWidth();
            int childCount = getChildCount();
            for (int width2 = 0; width2 < childCount; width2++) {
                View childAt = getChildAt(width2);
                C3M c3m = (C3M) childAt.getLayoutParams();
                if (c3m.A05) {
                    int scrollX = c3m.A04;
                    switch (scrollX & 7) {
                        case 1:
                            int scrollX2 = childAt.getMeasuredWidth();
                            paddingLeft = Math.max((width - scrollX2) / 2, i11);
                            break;
                        case 2:
                        case 4:
                        default:
                            paddingLeft = i11;
                            break;
                        case 3:
                            paddingLeft = i11;
                            int scrollX3 = childAt.getWidth();
                            i11 += scrollX3;
                            break;
                        case 5:
                            int paddingLeft3 = width - paddingRight;
                            int scrollX4 = childAt.getMeasuredWidth();
                            paddingLeft = paddingLeft3 - scrollX4;
                            int scrollX5 = childAt.getMeasuredWidth();
                            paddingRight += scrollX5;
                            break;
                    }
                    int scrollX6 = childAt.getLeft();
                    int paddingLeft4 = (paddingLeft + hgrav) - scrollX6;
                    if (paddingLeft4 != 0) {
                        childAt.offsetLeftAndRight(paddingLeft4);
                    }
                }
            }
        }
        A0H(childLeft, f10, i10);
        if (this.A0a != null) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = getChildAt(i12);
                if (!((C3M) childAt2.getLayoutParams()).A05) {
                    childAt2.getLeft();
                    getClientWidth();
                    throw new NullPointerException(A08(450, 13, 121));
                }
            }
        }
        this.A0g = true;
    }

    private void A0K(int i10, int i11, int i12, int i13) {
        if (i11 > 0) {
            ArrayList<C3L> arrayList = this.A0t;
            String[] strArr = A0v;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0v[1] = "xS6wP2kv8Ukjp2mlI4OFB7EI";
            if (!arrayList.isEmpty()) {
                boolean zIsFinished = this.A0X.isFinished();
                if (A0v[1].length() == 12) {
                    throw new RuntimeException();
                }
                A0v[2] = "M3IvNYMGgF0qb538wmgDMK0nNkgqAt";
                if (!zIsFinished) {
                    this.A0X.setFinalX(getCurrentItem() * getClientWidth());
                    return;
                }
                int paddingLeft = ((i10 - getPaddingLeft()) - getPaddingRight()) + i12;
                int widthWithMargin = getPaddingLeft();
                int i14 = i11 - widthWithMargin;
                int widthWithMargin2 = getPaddingRight();
                int i15 = (i14 - widthWithMargin2) + i13;
                int widthWithMargin3 = getScrollX();
                int oldWidthWithMargin = (int) (paddingLeft * (widthWithMargin3 / i15));
                int widthWithMargin4 = getScrollY();
                scrollTo(oldWidthWithMargin, widthWithMargin4);
                return;
            }
        }
        C3L ii = A04(this.A00);
        float scrollOffset = ii != null ? Math.min(ii.A00, this.A07) : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        int paddingLeft2 = (int) (((i10 - getPaddingLeft()) - getPaddingRight()) * scrollOffset);
        if (paddingLeft2 != getScrollX()) {
            A0R(false);
            scrollTo(paddingLeft2, getScrollY());
        }
    }

    private final void A0L(int i10, boolean z10) {
        this.A0o = false;
        A0N(i10, z10, false);
    }

    private void A0M(int i10, boolean z10, int i11, boolean z11) {
        C3L c3lA04 = A04(i10);
        int clientWidth = 0;
        if (c3lA04 != null) {
            clientWidth = (int) (getClientWidth() * Math.max(this.A02, Math.min(c3lA04.A00, this.A07)));
        }
        int destX = A0v[2].length();
        if (destX == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A0v;
        strArr[3] = "qWyJthdIKprwmupmlWytZXkwKuTz6nwm";
        strArr[6] = "fDmSwMvEmt93O90vXMKXMmFP8biUMO95";
        if (z10) {
            A0J(clientWidth, 0, i11);
            if (z11) {
                A0E(i10);
                return;
            }
            return;
        }
        if (z11) {
            A0E(i10);
        }
        A0R(false);
        scrollTo(clientWidth, 0);
        A0Z(clientWidth);
    }

    private final void A0N(int i10, boolean z10, boolean z11) {
        A0O(i10, z10, z11, 0);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x0070 A[LOOP:0: B:30:0x0068->B:32:0x0070, LOOP_END] */
    private final void A0O(int i10, boolean z10, boolean z11, int i11) {
        int i12;
        AnonymousClass30 anonymousClass30 = this.A01;
        if (anonymousClass30 == null || anonymousClass30.A05() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z11 && this.A00 == i10 && this.A0t.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.A01.A05()) {
            i10 = this.A01.A05() - 1;
        }
        int i13 = this.A0L;
        int i14 = this.A00;
        if (i10 <= i14 + i13) {
            int i15 = i14 - i13;
            String[] strArr = A0v;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0v;
            strArr2[3] = "HdD8kb8A1NTv0LjA3C8pNf8B8Uhf5Rjf";
            strArr2[6] = "hEPxY7plOgAB5ujpSYVhyDABeqG0KedF";
            if (i10 < i15) {
                for (i12 = 0; i12 < this.A0t.size(); i12++) {
                    this.A0t.get(i12).A04 = true;
                }
            }
        } else {
            while (i12 < this.A0t.size()) {
                this.A0t.get(i12).A04 = true;
            }
        }
        boolean z12 = this.A00 != i10;
        boolean dispatchSelected = this.A0i;
        if (dispatchSelected) {
            this.A00 = i10;
            if (z12) {
                A0E(i10);
            }
            requestLayout();
            return;
        }
        A0G(i10);
        A0M(i10, z10, i11, z12);
    }

    private void A0P(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int pointerIndex = this.A08;
        if (pointerId == pointerIndex) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.A05 = motionEvent.getX(i10);
            String[] strArr = A0v;
            String str = strArr[4];
            String str2 = strArr[5];
            int pointerId2 = str.length();
            int pointerIndex2 = str2.length();
            if (pointerId2 != pointerIndex2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0v;
            strArr2[4] = "";
            strArr2[5] = "";
            int pointerIndex3 = motionEvent.getPointerId(i10);
            this.A08 = pointerIndex3;
            VelocityTracker velocityTracker = this.A0U;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x018b  */
    private void A0Q(C3L c3l, int i10, C3L c3l2) {
        float offset;
        float f10;
        C3L c3l3;
        C3L c3l4;
        int iA05 = this.A01.A05();
        int width = getClientWidth();
        if (width > 0) {
            int N = this.A0M;
            offset = N / width;
        } else {
            offset = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        if (c3l2 != null) {
            int width2 = c3l2.A02;
            int N2 = c3l.A02;
            if (width2 < N2) {
                int i11 = 0;
                float fA04 = c3l2.A00 + c3l2.A01 + offset;
                int i12 = width2 + 1;
                while (i12 <= N) {
                    int N3 = this.A0t.size();
                    if (i11 >= N3) {
                        break;
                    }
                    C3L c3l5 = this.A0t.get(i11);
                    while (true) {
                        c3l4 = c3l5;
                        int N4 = c3l4.A02;
                        if (i12 <= N4) {
                            break;
                        }
                        int N5 = this.A0t.size();
                        if (i11 >= N5 - 1) {
                            break;
                        }
                        i11++;
                        c3l5 = this.A0t.get(i11);
                    }
                    while (i12 < N) {
                        AnonymousClass30 anonymousClass30 = this.A01;
                        if (A0v[2].length() == 14) {
                            throw new RuntimeException();
                        }
                        A0v[2] = "unjnr1JPHveRA3A";
                        fA04 += anonymousClass30.A04(i12) + offset;
                        i12++;
                    }
                    c3l4.A00 = fA04;
                    fA04 += c3l4.A01 + offset;
                    i12++;
                }
            } else {
                int N6 = c3l.A02;
                if (width2 > N6) {
                    int N7 = this.A0t.size();
                    int i13 = N7 - 1;
                    float fA05 = c3l2.A00;
                    int i14 = width2 - 1;
                    while (i14 >= N && i13 >= 0) {
                        C3L c3l6 = this.A0t.get(i13);
                        while (true) {
                            c3l3 = c3l6;
                            int N8 = c3l3.A02;
                            if (i14 >= N8 || i13 <= 0) {
                                break;
                            }
                            i13--;
                            c3l6 = this.A0t.get(i13);
                        }
                        while (true) {
                            int i15 = c3l3.A02;
                            String[] strArr = A0v;
                            String str = strArr[4];
                            String str2 = strArr[5];
                            int width3 = str.length();
                            int N9 = str2.length();
                            if (width3 == N9) {
                                A0v[2] = "eK1wjFwqyv9CJUk";
                                if (i14 <= i15) {
                                    break;
                                }
                                fA05 -= this.A01.A04(i14) + offset;
                                i14--;
                            } else {
                                A0v[1] = "tUoZSKhLB59JJ";
                                if (i14 <= i15) {
                                    break;
                                }
                                fA05 -= this.A01.A04(i14) + offset;
                                i14--;
                            }
                        }
                        fA05 -= c3l3.A01 + offset;
                        c3l3.A00 = fA05;
                        i14--;
                    }
                }
            }
        }
        int i16 = this.A0t.size();
        float fA06 = c3l.A00;
        int N10 = c3l.A02;
        int i17 = N10 - 1;
        int N11 = c3l.A02;
        this.A02 = N11 == 0 ? c3l.A00 : -3.4028235E38f;
        int N12 = iA05 - 1;
        if (c3l.A02 == N12) {
            f10 = (c3l.A00 + c3l.A01) - 1.0f;
        } else {
            f10 = Float.MAX_VALUE;
        }
        this.A07 = f10;
        int itemCount = i10 - 1;
        while (itemCount >= 0) {
            C3L c3l7 = this.A0t.get(itemCount);
            while (i17 > N) {
                fA06 -= this.A01.A04(i17) + offset;
                i17--;
            }
            fA06 -= c3l7.A01 + offset;
            c3l7.A00 = fA06;
            int N13 = c3l7.A02;
            if (N13 == 0) {
                this.A02 = fA06;
            }
            itemCount--;
            i17--;
        }
        float fA07 = c3l.A00 + c3l.A01 + offset;
        int N14 = c3l.A02;
        int i18 = N14 + 1;
        int i19 = i10 + 1;
        while (i19 < i16) {
            C3L c3l8 = this.A0t.get(i19);
            while (i18 < N) {
                fA07 += this.A01.A04(i18) + offset;
                i18++;
            }
            int i20 = c3l8.A02;
            if (A0v[2].length() != 14) {
                String[] strArr2 = A0v;
                strArr2[3] = "LKMrFShf3NXE5XfaxsCGHUW3hns0S8Wh";
                strArr2[6] = "xptjAJKkekqR5TDnJjimQZvUd22mQJJ9";
                int N15 = iA05 - 1;
                if (i20 == N15) {
                    this.A07 = (c3l8.A01 + fA07) - 1.0f;
                }
            } else {
                int N16 = iA05 - 1;
                if (i20 == N16) {
                    this.A07 = (c3l8.A01 + fA07) - 1.0f;
                }
            }
            c3l8.A00 = fA07;
            fA07 += c3l8.A01 + offset;
            i19++;
            i18++;
        }
        this.A0n = false;
    }

    private void A0R(boolean z10) {
        boolean z11 = this.A0P == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            boolean needPopulate = this.A0X.isFinished();
            boolean wasScrolling = true ^ needPopulate;
            if (wasScrolling) {
                this.A0X.abortAnimation();
                if (A0v[1].length() == 12) {
                    throw new RuntimeException();
                }
                A0v[1] = "La7";
                int oldX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.A0X.getCurrX();
                int currY = this.A0X.getCurrY();
                if (oldX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != oldX) {
                        A0Z(currX);
                    }
                }
            }
        }
        this.A0o = false;
        for (int i10 = 0; i10 < this.A0t.size(); i10++) {
            C3L c3l = this.A0t.get(i10);
            boolean needPopulate2 = c3l.A04;
            if (needPopulate2) {
                z11 = true;
                c3l.A04 = false;
            }
        }
        if (z11) {
            if (z10) {
                C3F.A0D(this, this.A0s);
            } else {
                this.A0s.run();
            }
        }
    }

    private void A0S(boolean z10) {
        int layerType;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (z10) {
                layerType = this.A0N;
            } else {
                layerType = 0;
            }
            getChildAt(i10).setLayerType(layerType, null);
        }
    }

    private void A0T(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    private boolean A0U() {
        this.A08 = -1;
        A09();
        this.A0V.onRelease();
        this.A0W.onRelease();
        return this.A0V.isFinished() || this.A0W.isFinished();
    }

    private final boolean A0V() {
        int i10 = this.A00;
        if (i10 > 0) {
            A0L(i10 - 1, true);
            return true;
        }
        return false;
    }

    private final boolean A0W() {
        AnonymousClass30 anonymousClass30 = this.A01;
        if (anonymousClass30 != null && this.A00 < anonymousClass30.A05() - 1) {
            A0L(this.A00 + 1, true);
            return true;
        }
        if (A0v[2].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A0v;
        strArr[7] = "AXA5EDUbYu85ntxkUdYhY3hIIlQIUQar";
        strArr[0] = "7HhQN1X94o8BEMOAnE9vO9t08zapWTmy";
        return false;
    }

    private boolean A0X(float f10) {
        boolean z10 = false;
        float f11 = this.A05 - f10;
        this.A05 = f10;
        float scrollX = getScrollX() + f11;
        int clientWidth = getClientWidth();
        float oldScrollX = clientWidth;
        float oldScrollX2 = oldScrollX * this.A02;
        float leftBound = clientWidth;
        float leftBound2 = leftBound * this.A07;
        boolean rightAbsolute = true;
        boolean leftAbsolute = true;
        C3L c3l = this.A0t.get(0);
        ArrayList<C3L> arrayList = this.A0t;
        C3L c3l2 = arrayList.get(arrayList.size() - 1);
        if (c3l.A02 != 0) {
            rightAbsolute = false;
            float oldScrollX3 = c3l.A00;
            if (A0v[1].length() == 12) {
                throw new RuntimeException();
            }
            A0v[1] = "a";
            oldScrollX2 = oldScrollX3 * clientWidth;
        }
        if (c3l2.A02 != this.A01.A05() - 1) {
            leftAbsolute = false;
            float leftBound3 = c3l2.A00;
            leftBound2 = leftBound3 * clientWidth;
        }
        if (scrollX < oldScrollX2) {
            if (rightAbsolute) {
                this.A0V.onPull(Math.abs(oldScrollX2 - scrollX) / clientWidth);
                z10 = true;
            }
            scrollX = oldScrollX2;
        } else if (scrollX > leftBound2) {
            if (leftAbsolute) {
                EdgeEffect edgeEffect = this.A0W;
                float oldScrollX4 = Math.abs(scrollX - leftBound2);
                float deltaX = clientWidth;
                String[] strArr = A0v;
                if (strArr[4].length() != strArr[5].length()) {
                    edgeEffect.onPull(oldScrollX4 / deltaX);
                    z10 = true;
                } else {
                    A0v[1] = "TwKB2lBmR";
                    edgeEffect.onPull(oldScrollX4 / deltaX);
                    z10 = true;
                }
            }
            scrollX = leftBound2;
        }
        this.A05 += scrollX - ((int) scrollX);
        scrollTo((int) scrollX, getScrollY());
        A0Z((int) scrollX);
        return z10;
    }

    private final boolean A0Y(float f10, float f11) {
        if (f10 >= this.A0I || f11 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            if (f10 > getWidth() - this.A0I) {
                if (A0v[2].length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A0v;
                strArr[3] = "LoLbwLodEQ0RZhoADzk4YxqyeMxGbPNe";
                strArr[6] = "uXFtlpuRRgamX4n9Zkql1HjWorEkSQ7b";
                if (f11 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                }
            }
            return false;
        }
        return true;
    }

    private boolean A0Z(int i10) {
        int size = this.A0t.size();
        String strA08 = A08(397, 53, 60);
        if (size == 0) {
            if (this.A0i) {
                return false;
            }
            this.A0g = false;
            A0I(0, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0);
            String[] strArr = A0v;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0v[2] = "c3ramapljB1reDSufYjA";
            if (this.A0g) {
                return false;
            }
            throw new IllegalStateException(strA08);
        }
        C3L c3lA03 = A03();
        int currentPage = getClientWidth();
        int i11 = this.A0M;
        int i12 = c3lA03.A02;
        float f10 = ((i10 / currentPage) - c3lA03.A00) / (c3lA03.A01 + (i11 / currentPage));
        this.A0g = false;
        A0I(i12, f10, (int) ((currentPage + i11) * f10));
        if (this.A0g) {
            return true;
        }
        throw new IllegalStateException(strA08);
    }

    private final boolean A0a(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            boolean z10 = false;
            for (ViewParent parent = viewFindFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb2.append(A08(0, 4, 21)).append(parent2.getClass().getSimpleName());
                }
                Log.e(A08(300, 9, 47), A08(309, 72, 80) + sb2.toString());
                viewFindFocus = null;
            }
        }
        boolean zA0V = false;
        View nextFocused = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        if (nextFocused != null && nextFocused != viewFindFocus) {
            if (i10 == 17) {
                zA0V = (viewFindFocus == null || A02(this.A0q, nextFocused).left < A02(this.A0q, viewFindFocus).left) ? nextFocused.requestFocus() : A0V();
            } else if (i10 == 66) {
                zA0V = (viewFindFocus == null || A02(this.A0q, nextFocused).left > A02(this.A0q, viewFindFocus).left) ? nextFocused.requestFocus() : A0W();
            }
        } else if (i10 == 17 || i10 == 1) {
            zA0V = A0V();
        } else if (i10 == 66 || i10 == 2) {
            zA0V = A0W();
        }
        if (zA0V) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zA0V;
    }

    private final boolean A0b(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                boolean handled = keyEvent.hasModifiers(2);
                if (handled) {
                    return A0V();
                }
                return A0a(17);
            case 22:
                boolean zHasModifiers = keyEvent.hasModifiers(2);
                String[] strArr = A0v;
                if (strArr[4].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                A0v[1] = "lC1XoLB2bpdljamdt6Vm";
                if (zHasModifiers) {
                    return A0W();
                }
                return A0a(66);
            case 61:
                boolean handled2 = keyEvent.hasNoModifiers();
                if (handled2) {
                    return A0a(2);
                }
                boolean handled3 = keyEvent.hasModifiers(1);
                if (!handled3) {
                    return false;
                }
                return A0a(1);
            default:
                return false;
        }
    }

    public static boolean A0c(View view) {
        return view.getClass().getAnnotation(ViewPager$DecorView.class) != null;
    }

    private final boolean A0d(View view, boolean z10, int i10, int i11, int i12) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i13 = view.getScrollX();
            int count = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i11 + i13 >= childAt.getLeft() && i11 + i13 < childAt.getRight() && i12 + count >= childAt.getTop() && i12 + count < childAt.getBottom()) {
                    int left = (i11 + i13) - childAt.getLeft();
                    int i14 = i12 + count;
                    if (A0v[1].length() == 12) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0v;
                    strArr[4] = "";
                    strArr[5] = "";
                    if (A0d(childAt, true, i10, left, i14 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    public final void A0e() {
        boolean z10;
        int iA05 = this.A01.A05();
        this.A0G = iA05;
        int size = this.A0t.size();
        int adapterCount = this.A0L;
        if (size < (adapterCount * 2) + 1) {
            int adapterCount2 = this.A0t.size();
            if (adapterCount2 < iA05) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        int i10 = this.A00;
        boolean z11 = false;
        int newCurrItem = 0;
        while (newCurrItem < adapterCount) {
            C3L c3l = this.A0t.get(newCurrItem);
            int iA06 = this.A01.A06(c3l.A03);
            if (iA06 != -1) {
                if (iA06 == -2) {
                    this.A0t.remove(newCurrItem);
                    newCurrItem--;
                    if (!z11) {
                        z11 = true;
                    }
                    this.A01.A0B(this, c3l.A02, c3l.A03);
                    z10 = true;
                    int i11 = this.A00;
                    int adapterCount3 = c3l.A02;
                    if (i11 == adapterCount3) {
                        int adapterCount4 = iA05 - 1;
                        i10 = Math.max(0, Math.min(this.A00, adapterCount4));
                        z10 = true;
                    }
                } else {
                    int adapterCount5 = c3l.A02;
                    if (adapterCount5 != iA06) {
                        int i12 = c3l.A02;
                        int adapterCount6 = this.A00;
                        if (i12 == adapterCount6) {
                            i10 = iA06;
                        }
                        c3l.A02 = iA06;
                        z10 = true;
                    }
                }
            }
            newCurrItem++;
        }
        Collections.sort(this.A0t, A0z);
        if (z10) {
            int childCount = getChildCount();
            for (int newCurrItem2 = 0; newCurrItem2 < childCount; newCurrItem2++) {
                C3M c3m = (C3M) getChildAt(newCurrItem2).getLayoutParams();
                if (!c3m.A05) {
                    c3m.A00 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                }
            }
            A0N(i10, false, true);
            if (A0v[2].length() == 14) {
                throw new RuntimeException();
            }
            A0v[2] = "iBz2AIJ6C";
            requestLayout();
        }
    }

    public final void A0f() {
        A0G(this.A00);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        C3L c3lA07;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < focusableCount; i12++) {
                View childAt = getChildAt(i12);
                int focusableCount = childAt.getVisibility();
                if (focusableCount == 0 && (c3lA07 = A07(childAt)) != null) {
                    int descendantFocusability2 = c3lA07.A02;
                    int focusableCount2 = this.A00;
                    if (descendantFocusability2 == focusableCount2) {
                        childAt.addFocusables(arrayList, i10, i11);
                    }
                }
            }
        }
        if (descendantFocusability == 262144) {
            int focusableCount3 = arrayList.size();
            if (size != focusableCount3) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        int descendantFocusability3 = i11 & 1;
        if ((descendantFocusability3 != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C3M c3m = (C3M) layoutParams;
        c3m.A05 |= A0c(view);
        if (this.A0j) {
            if (c3m == null || !c3m.A05) {
                c3m.A03 = true;
                if (A0v[2].length() == 14) {
                    throw new RuntimeException();
                }
                A0v[1] = "XL6oa3uLuKs2IOpHyjfCXdHiJnTalh";
                addViewInLayout(view, i10, layoutParams);
                return;
            }
            throw new IllegalStateException(A08(86, 41, 16));
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        if (this.A01 == null) {
            return false;
        }
        int width = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            return scrollX > ((int) (((float) width) * this.A02));
        }
        return i10 > 0 && scrollX < ((int) (((float) width) * this.A07));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C3M) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.A0l = true;
        if (!this.A0X.isFinished() && this.A0X.computeScrollOffset()) {
            int scrollX = getScrollX();
            int y10 = getScrollY();
            int x10 = this.A0X.getCurrX();
            int oldY = this.A0X.getCurrY();
            if (scrollX != x10 || y10 != oldY) {
                scrollTo(x10, oldY);
                if (!A0Z(x10)) {
                    this.A0X.abortAnimation();
                    scrollTo(0, oldY);
                }
            }
            C3F.A07(this);
            return;
        }
        A0R(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || A0b(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C3L c3lA07;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int childCount2 = childAt.getVisibility();
            if (childCount2 == 0 && (c3lA07 = A07(childAt)) != null) {
                int i11 = c3lA07.A02;
                String[] strArr = A0v;
                String str = strArr[7];
                String str2 = strArr[0];
                int i12 = str.charAt(10);
                int childCount3 = str2.charAt(10);
                if (i12 != childCount3) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0v;
                strArr2[4] = "";
                strArr2[5] = "";
                int childCount4 = this.A00;
                if (i11 == childCount4 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:21:0x0094  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean zIsFinished;
        int overScrollMode;
        boolean needsInvalidate;
        super.draw(canvas);
        boolean z10 = false;
        int overScrollMode2 = getOverScrollMode();
        if (overScrollMode2 == 0) {
            zIsFinished = this.A0V.isFinished();
            overScrollMode = A0v[1].length();
            if (overScrollMode != 12) {
                A0v[1] = "sR19g1oBfMrUqPxbyG4ArbsnA";
                if (!zIsFinished) {
                    int iSave = canvas.save();
                    int width = (getHeight() - getPaddingTop()) - getPaddingBottom();
                    int height = getWidth();
                    canvas.rotate(270.0f);
                    int overScrollMode3 = -width;
                    canvas.translate(overScrollMode3 + getPaddingTop(), this.A02 * height);
                    this.A0V.setSize(width, height);
                    boolean needsInvalidate2 = this.A0V.draw(canvas);
                    z10 = false | needsInvalidate2;
                    canvas.restoreToCount(iSave);
                }
            } else {
                String[] strArr = A0v;
                strArr[4] = "";
                strArr[5] = "";
                if (!zIsFinished) {
                    int iSave2 = canvas.save();
                    int width2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                    int height2 = getWidth();
                    canvas.rotate(270.0f);
                    int overScrollMode4 = -width2;
                    canvas.translate(overScrollMode4 + getPaddingTop(), this.A02 * height2);
                    this.A0V.setSize(width2, height2);
                    boolean needsInvalidate3 = this.A0V.draw(canvas);
                    z10 = false | needsInvalidate3;
                    canvas.restoreToCount(iSave2);
                }
            }
            needsInvalidate = this.A0W.isFinished();
            if (!needsInvalidate) {
                int width3 = canvas.save();
                int width4 = getWidth();
                int height3 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.A07 + 1.0f)) * width4);
                this.A0W.setSize(height3, width4);
                boolean needsInvalidate4 = this.A0W.draw(canvas);
                z10 |= needsInvalidate4;
                canvas.restoreToCount(width3);
            }
        } else {
            if (overScrollMode2 == 1) {
                AnonymousClass30 anonymousClass30 = this.A01;
                String[] strArr2 = A0v;
                String str = strArr2[7];
                String str2 = strArr2[0];
                int overScrollMode5 = str.charAt(10);
                if (overScrollMode5 != str2.charAt(10)) {
                    throw new RuntimeException();
                }
                A0v[1] = "uCo1AgFx4bPu4bwpitwpleYcuNfeFds";
                if (anonymousClass30 != null && anonymousClass30.A05() > 1) {
                    zIsFinished = this.A0V.isFinished();
                    overScrollMode = A0v[1].length();
                    if (overScrollMode != 12) {
                        A0v[1] = "sR19g1oBfMrUqPxbyG4ArbsnA";
                        if (!zIsFinished) {
                            int iSave3 = canvas.save();
                            int width5 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                            int height4 = getWidth();
                            canvas.rotate(270.0f);
                            int overScrollMode6 = -width5;
                            canvas.translate(overScrollMode6 + getPaddingTop(), this.A02 * height4);
                            this.A0V.setSize(width5, height4);
                            boolean needsInvalidate5 = this.A0V.draw(canvas);
                            z10 = false | needsInvalidate5;
                            canvas.restoreToCount(iSave3);
                        }
                    } else {
                        String[] strArr3 = A0v;
                        strArr3[4] = "";
                        strArr3[5] = "";
                        if (!zIsFinished) {
                            int iSave4 = canvas.save();
                            int width6 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                            int height5 = getWidth();
                            canvas.rotate(270.0f);
                            int overScrollMode7 = -width6;
                            canvas.translate(overScrollMode7 + getPaddingTop(), this.A02 * height5);
                            this.A0V.setSize(width6, height5);
                            boolean needsInvalidate6 = this.A0V.draw(canvas);
                            z10 = false | needsInvalidate6;
                            canvas.restoreToCount(iSave4);
                        }
                    }
                    needsInvalidate = this.A0W.isFinished();
                    if (!needsInvalidate) {
                        int width7 = canvas.save();
                        int width8 = getWidth();
                        int height6 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                        canvas.rotate(90.0f);
                        canvas.translate(-getPaddingTop(), (-(this.A07 + 1.0f)) * width8);
                        this.A0W.setSize(height6, width8);
                        boolean needsInvalidate7 = this.A0W.draw(canvas);
                        z10 |= needsInvalidate7;
                        canvas.restoreToCount(width7);
                    }
                }
            }
            this.A0V.finish();
            this.A0W.finish();
        }
        if (z10) {
            C3F.A07(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0S;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C3M();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C3M(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AnonymousClass30 getAdapter() {
        return this.A01;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        int result = this.A0F == 2 ? (i10 - 1) - i11 : i11;
        int index = ((C3M) this.A0d.get(result).getLayoutParams()).A01;
        return index;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public int getCurrentItem() {
        return this.A00;
    }

    public int getOffscreenPageLimit() {
        return this.A0L;
    }

    public int getPageMargin() {
        return this.A0M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.A0s);
        Scroller scroller = this.A0X;
        if (scroller != null && !scroller.isFinished()) {
            this.A0X.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.A0M > 0 && this.A0S != null && this.A0t.size() > 0 && this.A01 != null) {
            int pos = getScrollX();
            int lastPos = getWidth();
            float f11 = this.A0M / lastPos;
            int itemCount = 0;
            C3L c3l = this.A0t.get(0);
            float marginOffset = c3l.A00;
            int size = this.A0t.size();
            int i10 = this.A0t.get(size - 1).A02;
            for (int i11 = c3l.A02; i11 < i10; i11++) {
                while (i11 > c3l.A02 && itemCount < size) {
                    itemCount++;
                    C3L c3l2 = this.A0t.get(itemCount);
                    String[] strArr = A0v;
                    String str = strArr[7];
                    String str2 = strArr[0];
                    int scrollX = str.charAt(10);
                    if (scrollX != str2.charAt(10)) {
                        throw new RuntimeException();
                    }
                    A0v[2] = "Qpfq";
                    c3l = c3l2;
                }
                if (i11 == c3l.A02) {
                    f10 = (c3l.A00 + c3l.A01) * lastPos;
                    float marginOffset2 = c3l.A00;
                    marginOffset = marginOffset2 + c3l.A01 + f11;
                } else {
                    float fA04 = this.A01.A04(i11);
                    f10 = (marginOffset + fA04) * lastPos;
                    marginOffset += fA04 + f11;
                }
                if (this.A0M + f10 > pos) {
                    Drawable drawable = this.A0S;
                    int iRound = Math.round(f10);
                    int i12 = this.A0Q;
                    int width = Math.round(this.A0M + f10);
                    drawable.setBounds(iRound, i12, width, this.A09);
                    Drawable drawable2 = this.A0S;
                    String[] strArr2 = A0v;
                    String str3 = strArr2[7];
                    String str4 = strArr2[0];
                    int width2 = str3.charAt(10);
                    if (width2 != str4.charAt(10)) {
                        A0v[1] = "";
                        drawable2.draw(canvas);
                    } else {
                        String[] strArr3 = A0v;
                        strArr3[4] = "";
                        strArr3[5] = "";
                        drawable2.draw(canvas);
                    }
                }
                int i13 = pos + lastPos;
                int width3 = A0v[1].length();
                if (width3 == 12) {
                    throw new RuntimeException();
                }
                A0v[1] = "DrXdt";
                if (f10 > i13) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            A0U();
            String[] strArr = A0v;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0v[2] = "iW5W";
            return false;
        }
        if (action != 0) {
            if (this.A0k) {
                return true;
            }
            if (this.A0m) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x10 = motionEvent.getX();
                this.A03 = x10;
                this.A05 = x10;
                float y10 = motionEvent.getY();
                this.A04 = y10;
                this.A06 = y10;
                this.A08 = motionEvent.getPointerId(0);
                this.A0m = false;
                this.A0l = true;
                this.A0X.computeScrollOffset();
                if (this.A0P != 2 || Math.abs(this.A0X.getFinalX() - this.A0X.getCurrX()) <= this.A0C) {
                    A0R(false);
                    this.A0k = false;
                } else {
                    this.A0X.abortAnimation();
                    this.A0o = false;
                    A0f();
                    this.A0k = true;
                    A0T(true);
                    setScrollState(1);
                }
                break;
            case 2:
                int i10 = this.A08;
                if (i10 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float f11 = x11 - this.A05;
                    float fAbs = Math.abs(f11);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float y12 = Math.abs(y11 - this.A04);
                    if (f11 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && !A0Y(this.A05, f11) && A0d(this, false, (int) f11, (int) x11, (int) y11)) {
                        this.A05 = x11;
                        this.A06 = y11;
                        this.A0m = true;
                        return false;
                    }
                    int i11 = this.A0R;
                    if (fAbs > i11 && 0.5f * fAbs > y12) {
                        this.A0k = true;
                        A0T(true);
                        setScrollState(1);
                        if (f11 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                            f10 = this.A03 - this.A0R;
                        } else {
                            float f12 = this.A03;
                            int i12 = this.A0R;
                            String[] strArr2 = A0v;
                            if (strArr2[7].charAt(10) != strArr2[0].charAt(10)) {
                                f10 = f12 + i12;
                            } else {
                                String[] strArr3 = A0v;
                                strArr3[7] = "WpQimEPBWZ8vG05HKhTxshBMY3NNEur0";
                                strArr3[0] = "BEtp4ufX6D8x3OZlDxdpMoFh1oKQqP0t";
                                f10 = f12 + i12;
                            }
                        }
                        this.A05 = f10;
                        this.A06 = y11;
                        setScrollingCacheEnabled(true);
                    } else if (y12 > i11) {
                        this.A0m = true;
                    }
                    if (this.A0k && A0X(x11)) {
                        C3F.A07(this);
                    }
                }
                break;
            case 6:
                A0P(motionEvent);
                break;
        }
        VelocityTracker velocityTracker = this.A0U;
        if (A0v[2].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0v;
        strArr4[3] = "qZEBvpK5WM51NnTYZj9Wv9V85vPNkfCF";
        strArr4[6] = "8DoAZte0LwUXg2aXlHvSBWFBy3vUeqDy";
        if (velocityTracker == null) {
            this.A0U = VelocityTracker.obtain();
        }
        this.A0U.addMovement(motionEvent);
        return this.A0k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        C3L c3lA07;
        int height;
        int count;
        int paddingBottom = getChildCount();
        int decorCount = i12 - i10;
        int scrollX = i13 - i11;
        int childTop = getPaddingLeft();
        int i14 = getPaddingTop();
        int childLeft = getPaddingRight();
        int paddingBottom2 = getPaddingBottom();
        int hgrav = getScrollX();
        int i15 = 0;
        int paddingRight = 0;
        while (true) {
            int width = 8;
            String[] strArr = A0v;
            String str = strArr[4];
            String str2 = strArr[5];
            int count2 = str.length();
            if (count2 == str2.length()) {
                A0v[1] = "";
                if (paddingRight < paddingBottom) {
                    View childAt = getChildAt(paddingRight);
                    if (childAt.getVisibility() != 8) {
                        C3M c3m = (C3M) childAt.getLayoutParams();
                        if (c3m.A05) {
                            int count3 = c3m.A04 & 7;
                            int childTop2 = c3m.A04 & 112;
                            switch (count3) {
                                case 1:
                                    height = Math.max((decorCount - childAt.getMeasuredWidth()) / 2, childTop);
                                    break;
                                case 2:
                                case 4:
                                default:
                                    height = childTop;
                                    break;
                                case 3:
                                    height = childTop;
                                    childTop += childAt.getMeasuredWidth();
                                    break;
                                case 5:
                                    int height2 = decorCount - childLeft;
                                    int measuredWidth = childAt.getMeasuredWidth();
                                    String[] strArr2 = A0v;
                                    String str3 = strArr2[7];
                                    String str4 = strArr2[0];
                                    int count4 = str3.charAt(10);
                                    if (count4 == str4.charAt(10)) {
                                        A0v[1] = "51Hkg";
                                        height = height2 - measuredWidth;
                                        childLeft += childAt.getMeasuredWidth();
                                    }
                                    break;
                            }
                            switch (childTop2) {
                                case 16:
                                    count = Math.max((scrollX - childAt.getMeasuredHeight()) / 2, i14);
                                    break;
                                case 48:
                                    count = i14;
                                    i14 += childAt.getMeasuredHeight();
                                    break;
                                case 80:
                                    int count5 = scrollX - paddingBottom2;
                                    count = count5 - childAt.getMeasuredHeight();
                                    paddingBottom2 += childAt.getMeasuredHeight();
                                    break;
                                default:
                                    count = i14;
                                    break;
                            }
                            int height3 = height + hgrav;
                            int width2 = height3 + childAt.getMeasuredWidth();
                            childAt.layout(height3, count, width2, childAt.getMeasuredHeight() + count);
                            i15++;
                        } else {
                            continue;
                        }
                    }
                    paddingRight++;
                } else {
                    int decorCount2 = (decorCount - childTop) - childLeft;
                    int paddingRight2 = 0;
                    while (paddingRight2 < paddingBottom) {
                        View childAt2 = getChildAt(paddingRight2);
                        if (childAt2.getVisibility() != width) {
                            C3M c3m2 = (C3M) childAt2.getLayoutParams();
                            if (!c3m2.A05 && (c3lA07 = A07(childAt2)) != null) {
                                int height4 = childTop + ((int) (decorCount2 * c3lA07.A00));
                                if (c3m2.A03) {
                                    c3m2.A03 = false;
                                    int widthSpec = View.MeasureSpec.makeMeasureSpec((int) (decorCount2 * c3m2.A00), 1073741824);
                                    childAt2.measure(widthSpec, View.MeasureSpec.makeMeasureSpec((scrollX - i14) - paddingBottom2, 1073741824));
                                }
                                int heightSpec = childAt2.getMeasuredWidth();
                                int widthSpec2 = childAt2.getMeasuredHeight();
                                int i16 = i14;
                                childAt2.layout(height4, i16, heightSpec + height4, widthSpec2 + i16);
                            }
                        }
                        paddingRight2++;
                        width = 8;
                    }
                    this.A0Q = i14;
                    this.A09 = scrollX - paddingBottom2;
                    this.A0D = i15;
                    if (this.A0i) {
                        int i17 = this.A00;
                        z11 = false;
                        String[] strArr3 = A0v;
                        if (strArr3[4].length() != strArr3[5].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr4 = A0v;
                        strArr4[4] = "";
                        strArr4[5] = "";
                        A0M(i17, false, 0, false);
                    } else {
                        z11 = false;
                    }
                    this.A0i = z11;
                    return;
                }
            }
        }
        throw new RuntimeException();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int end;
        int i11;
        C3L c3lA07;
        int i12 = getChildCount();
        int count = i10 & 2;
        if (count != 0) {
            end = 0;
            i11 = 1;
        } else {
            end = i12 - 1;
            i11 = -1;
            i12 = -1;
        }
        while (end != i12) {
            View child = getChildAt(end);
            int index = A0v[2].length();
            if (index == 14) {
                throw new RuntimeException();
            }
            String[] strArr = A0v;
            strArr[3] = "wvs0VrXDMEHK1ZrgMliCmQkmYIqFRPYZ";
            strArr[6] = "yeuyy9yC0QSIfk9tyj8D1No5khczL5F7";
            int count2 = child.getVisibility();
            if (count2 == 0 && (c3lA07 = A07(child)) != null) {
                int index2 = c3lA07.A02;
                int count3 = this.A00;
                if (index2 == count3 && child.requestFocus(i10, rect)) {
                    return true;
                }
            }
            end += i11;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            Context context = getContext();
            String[] strArr = A0v;
            if (strArr[3].charAt(15) == strArr[6].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0v;
            strArr2[7] = "Ly8LvMv3iU8o2fiJAVqvd6K7Aqz3gZKY";
            strArr2[0] = "HcNmsPXina8Ul250FP3kUGj1pgK53N1r";
            classLoader = context.getClassLoader();
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (!(state instanceof ViewPager$SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState) state;
        super.onRestoreInstanceState(viewPager$SavedState.A02());
        if (this.A01 != null) {
            A0N(viewPager$SavedState.A00, false, true);
            return;
        }
        this.A0O = viewPager$SavedState.A00;
        this.A0T = viewPager$SavedState.A01;
        this.A0c = viewPager$SavedState.A02;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable superState = super.onSaveInstanceState();
        ViewPager$SavedState ss = new ViewPager$SavedState(superState);
        ss.A00 = this.A00;
        AnonymousClass30 anonymousClass30 = this.A01;
        if (anonymousClass30 != null) {
            Parcelable superState2 = anonymousClass30.A07();
            ss.A01 = superState2;
        }
        Parcelable superState3 = new WrappedParcelable(ss);
        return superState3;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.A0M;
            A0K(i10, i12, i14, i14);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.A0j) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [com.facebook.ads.redexgen.X.3Q] */
    public void setAdapter(AnonymousClass30 anonymousClass30) {
        AnonymousClass30 anonymousClass31 = this.A01;
        if (anonymousClass31 != null) {
            anonymousClass31.A0A(null);
            for (int i10 = 0; i10 < i; i10++) {
                C3L c3l = this.A0t.get(i10);
                this.A01.A0B(this, c3l.A02, c3l.A03);
            }
            this.A0t.clear();
            A0A();
            this.A00 = 0;
            scrollTo(0, 0);
        }
        this.A01 = anonymousClass30;
        this.A0G = 0;
        if (anonymousClass30 != null) {
            if (this.A0b == null) {
                this.A0b = new DataSetObserver() { // from class: com.facebook.ads.redexgen.X.3Q
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        this.A00.A0e();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        this.A00.A0e();
                    }
                };
            }
            this.A01.A0A(this.A0b);
            this.A0o = false;
            boolean z10 = this.A0i;
            this.A0i = true;
            AnonymousClass30 oldAdapter = this.A01;
            this.A0G = oldAdapter.A05();
            if (this.A0O >= 0) {
                A0N(this.A0O, false, true);
                this.A0O = -1;
                this.A0T = null;
                this.A0c = null;
            } else if (!z10) {
                A0f();
            } else {
                requestLayout();
            }
        }
        List<ViewPager.OnAdapterChangeListener> list = this.A0e;
        if (list != null && !list.isEmpty() && 0 < this.A0e.size()) {
            this.A0e.get(0);
            throw new NullPointerException(A08(381, 16, 117));
        }
    }

    public void setCurrentItem(int i10) {
        this.A0o = false;
        A0N(i10, !this.A0i, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w(A08(300, 9, 47), A08(127, 31, 60) + i10 + A08(51, 26, 90) + 1);
            i10 = 1;
        }
        if (i10 != this.A0L) {
            this.A0L = i10;
            A0f();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C3O c3o) {
        this.A0Z = c3o;
    }

    public void setPageMargin(int i10) {
        int width = this.A0M;
        this.A0M = i10;
        int oldMargin = getWidth();
        A0K(oldMargin, oldMargin, i10, width);
        requestLayout();
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(C2W.A00(getContext(), i10));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.A0S = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.A0P == i10) {
            return;
        }
        this.A0P = i10;
        if (this.A0a != null) {
            A0S(i10 != 0);
        }
        A0F(i10);
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.A0p != z10) {
            this.A0p = z10;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0S;
    }
}
