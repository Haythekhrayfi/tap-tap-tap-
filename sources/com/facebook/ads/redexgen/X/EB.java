package com.facebook.ads.redexgen.X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EB extends ViewGroup implements ZD {
    public static byte[] A18;
    public static String[] A19 = {"EzQ8zede2M", "Jhjgeach8ubRdn89CHbftPIFCkhy8Cmz", "AI0RoC", "LwFgY3t3Qwi2PJUU36Pvm2", "gOCwMU1oDfpLVyXTNaTi7eQdHjis00sx", "GZYggCcl1OWg4VOzBYKk2kBvqjxmktta", "Te26Sy6xLG0KtVPzJaOHws0Kts3F9NRb", "K773CdyIAwEU"};
    public static final Interpolator A1A;
    public static final boolean A1B;
    public static final boolean A1C;
    public static final boolean A1D;
    public static final boolean A1E;
    public static final boolean A1F;
    public static final boolean A1G;
    public static final int[] A1H;
    public static final int[] A1I;
    public static final Class<?>[] A1J;
    public Z0 A00;
    public C06033y A01;
    public C1365Yz A02;
    public C4B A03;
    public C4O A04;
    public C4W A05;
    public AbstractC06054a A06;
    public InterfaceC06134j A07;
    public RunnableC06214r A08;
    public C1352Yl A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public float A0L;
    public float A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public VelocityTracker A0Y;
    public EdgeEffect A0Z;
    public EdgeEffect A0a;
    public EdgeEffect A0b;
    public EdgeEffect A0c;
    public C05772x A0d;
    public C4R A0e;
    public C4U A0f;
    public AbstractC06084d A0g;
    public InterfaceC06094e A0h;
    public AbstractC06104f A0i;
    public RecyclerView$SavedState A0j;
    public Runnable A0k;
    public List<RecyclerView.OnChildAttachStateChangeListener> A0l;
    public List<AbstractC06104f> A0m;
    public boolean A0n;
    public boolean A0o;
    public final Rect A0p;
    public final RectF A0q;
    public final C06124i A0r;
    public final C06194p A0s;
    public final AnonymousClass50 A0t;
    public final Runnable A0u;
    public final ArrayList<C4X> A0v;
    public final List<AbstractC06224s> A0w;
    public final int A0x;
    public final int A0y;
    public final Rect A0z;
    public final AccessibilityManager A10;
    public final C1354Yo A11;
    public final InterfaceC06294z A12;
    public final ArrayList<InterfaceC06094e> A13;
    public final int[] A14;
    public final int[] A15;
    public final int[] A16;
    public final int[] A17;

    public static String A0I(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A18, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 85);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0074  */
    /* JADX WARN: Code duplicated, block: B:17:0x0084  */
    /* JADX WARN: Code duplicated, block: B:20:0x00af  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0N() {
        int[] iArr;
        ArrayList<AbstractC06224s> arrayList;
        String[] strArr;
        this.A0s.A04(4);
        A1K();
        A1L();
        this.A0s.A04 = 1;
        if (!this.A0s.A0C) {
            this.A06.A1G(this.A0r);
            C06194p c06194p = this.A0s;
            c06194p.A05 = c06194p.A03;
            this.A0C = false;
            this.A0s.A0C = false;
            this.A0s.A0B = false;
            this.A06.A09 = false;
            if (this.A0r.A02 != null) {
                arrayList = this.A0r.A02;
                strArr = A19;
                if (strArr[3].length() != strArr[0].length()) {
                    A19[1] = "DxhhwSm2KO29M0snTVs4N8QFyNW6c8YZ";
                    arrayList.clear();
                }
            }
            if (this.A06.A08) {
                this.A06.A00 = 0;
                this.A06.A08 = false;
                this.A0r.A0O();
            }
            this.A06.A1z(this.A0s);
            A1M();
            A1s(false);
            this.A0t.A06();
            iArr = this.A14;
            if (A11(iArr[0], iArr[1])) {
                A1c(0, 0);
            }
            A0Q();
            A0S();
            return;
        }
        for (int iA05 = this.A01.A05() - 1; iA05 >= 0; iA05--) {
            AbstractC06224s abstractC06224sA0F = A0F(this.A01.A09(iA05));
            if (!abstractC06224sA0F.A0h()) {
                long jA0C = A0C(abstractC06224sA0F);
                C4V c4vA08 = this.A05.A08(this.A0s, abstractC06224sA0F);
                AbstractC06224s abstractC06224sA05 = this.A0t.A05(jA0C);
                if (abstractC06224sA05 == null || abstractC06224sA05.A0h()) {
                    this.A0t.A0E(abstractC06224sA0F, c4vA08);
                } else {
                    boolean zA0H = this.A0t.A0H(abstractC06224sA05);
                    AnonymousClass50 anonymousClass50 = this.A0t;
                    if (A19[5].charAt(2) == 'Y') {
                        A19[1] = "oIS3LUWJBkP0D1bim3OID749wsN9UxnV";
                        boolean zA0H2 = anonymousClass50.A0H(abstractC06224sA0F);
                        if (zA0H && abstractC06224sA05 == abstractC06224sA0F) {
                            this.A0t.A0E(abstractC06224sA0F, c4vA08);
                        } else {
                            C4V c4vA04 = this.A0t.A04(abstractC06224sA05);
                            this.A0t.A0E(abstractC06224sA0F, c4vA08);
                            C4V c4vA03 = this.A0t.A03(abstractC06224sA0F);
                            if (c4vA04 == null) {
                                A0m(jA0C, abstractC06224sA0F, abstractC06224sA05);
                            } else {
                                A0t(abstractC06224sA05, abstractC06224sA0F, c4vA04, c4vA03, zA0H, zA0H2);
                            }
                        }
                    }
                }
            }
        }
        this.A0t.A0G(this.A12);
        this.A06.A1G(this.A0r);
        C06194p c06194p2 = this.A0s;
        c06194p2.A05 = c06194p2.A03;
        this.A0C = false;
        this.A0s.A0C = false;
        this.A0s.A0B = false;
        this.A06.A09 = false;
        if (this.A0r.A02 != null) {
            arrayList = this.A0r.A02;
            strArr = A19;
            if (strArr[3].length() != strArr[0].length()) {
                A19[1] = "DxhhwSm2KO29M0snTVs4N8QFyNW6c8YZ";
                arrayList.clear();
            }
        }
        if (this.A06.A08) {
            this.A06.A00 = 0;
            this.A06.A08 = false;
            this.A0r.A0O();
        }
        this.A06.A1z(this.A0s);
        A1M();
        A1s(false);
        this.A0t.A06();
        iArr = this.A14;
        if (A11(iArr[0], iArr[1])) {
            A1c(0, 0);
        }
        A0Q();
        A0S();
        return;
        throw new RuntimeException();
    }

    public static void A0W() {
        A18 = new byte[]{-74, -74, -96, -74, -20, -1, -5, 13, -74, -34, 5, 2, -6, -5, 8, -74, -56, -48, -100, -33, -35, -22, -22, -21, -16, -100, -34, -31, -100, -30, -21, -15, -22, -32, -100, -34, -15, -16, -100, -27, -16, -100, -27, -17, -100, -22, -31, -33, -31, -17, -17, -35, -18, -11, -100, -30, -21, -18, -100, 126, -57, -47, 126, -65, -54, -48, -61, -65, -62, -41, 126, -65, -46, -46, -65, -63, -58, -61, -62, 126, -46, -51, 126, -65, 126, -80, -61, -63, -41, -63, -54, -61, -48, -76, -57, -61, -43, -104, -12, 61, 71, -12, 66, 67, 72, -12, 53, -12, 56, 61, 70, 57, 55, 72, -12, 55, 60, 61, 64, 56, -12, 67, 58, -12, -93, -15, -14, -9, -93, -23, -14, -8, -15, -25, -79, -93, -57, -20, -25, -93, -28, -15, -4, -93, -48, -14, -9, -20, -14, -15, -56, -7, -24, -15, -9, -10, -93, -22, -24, -9, -93, -10, -18, -20, -13, -13, -24, -25, -62, -45, -57, 8, 11, 8, 23, Ascii.ESC, 12, Ascii.EM, -31, -117, Ascii.DEL, -62, -50, -51, -45, -60, -41, -45, -103, -56, -68, 8, -3, 21, 11, 17, 16, -42, 9, -18, 67, 65, 55, 60, 53, -18, 50, 51, 52, 47, 67, 58, 66, -18, 68, 47, 58, 67, 51, -67, -37, -26, -26, -33, -34, -102, -20, -33, -25, -23, -16, -33, -66, -33, -18, -37, -35, -30, -33, -34, -48, -29, -33, -15, -102, -15, -29, -18, -30, -102, -37, -102, -16, -29, -33, -15, -102, -15, -30, -29, -35, -30, -102, -29, -19, -102, -24, -23, -18, -102, -32, -26, -37, -31, -31, -33, -34, -102, -37, -19, -102, -18, -25, -22, -102, -34, -33, -18, -37, -35, -30, -33, -34, -88, -80, -50, -37, -37, -36, -31, -115, -48, -50, -39, -39, -115, -31, -43, -42, -32, -115, -38, -46, -31, -43, -36, -47, -115, -42, -37, -115, -50, -115, -32, -48, -33, -36, -39, -39, -115, -48, -50, -39, -39, -49, -50, -48, -40, -101, -115, -64, -48, -33, -36, -39, -39, -115, -48, -50, -39, -39, -49, -50, -48, -40, -32, -115, -38, -42, -44, -43, -31, -49, -46, -115, -33, -30, -37, -115, -47, -30, -33, -42, -37, -44, -115, -50, -115, -38, -46, -50, -32, -30, -33, -46, -115, -109, -115, -39, -50, -26, -36, -30, -31, -115, -35, -50, -32, -32, -115, -28, -43, -46, -33, -46, -115, -26, -36, -30, -115, -48, -50, -37, -37, -36, -31, -115, -48, -43, -50, -37, -44, -46, -115, -31, -43, -46, -65, -46, -48, -26, -48, -39, -46, -33, -61, -42, -46, -28, -115, -47, -50, -31, -50, -101, -115, -82, -37, -26, -115, -38, -46, -31, -43, -36, -47, -115, -48, -50, -39, -39, -115, -31, -43, -50, -31, -115, -38, -42, -44, -43, -31, -115, -48, -43, -50, -37, -44, -46, -115, -31, -43, -46, -115, -32, -31, -33, -30, -48, -31, -30, -33, -46, -36, -45, -115, -31, -43, -46, -115, -65, -46, -48, -26, -48, -39, -46, -33, -61, -42, -46, -28, -115, -36, -33, -115, -31, -43, -46, -115, -50, -47, -50, -35, -31, -46, -33, -115, -48, -36, -37, -31, -46, -37, -31, -32, -115, -32, -43, -36, -30, -39, -47, -115, -49, -46, -115, -35, -36, -32, -31, -35, -36, -37, -46, -47, -115, -31, -36, -31, -43, -46, -115, -37, -46, -27, -31, -115, -45, -33, -50, -38, -46, -101, -55, -25, -12, -12, -11, -6, -90, -23, -25, -14, -14, -90, -6, -18, -17, -7, -90, -13, -21, -6, -18, -11, -22, -90, -3, -18, -17, -14, -21, -90, -40, -21, -23, -1, -23, -14, -21, -8, -36, -17, -21, -3, -90, -17, -7, -90, -23, -11, -13, -10, -5, -6, -17, -12, -19, -90, -25, -90, -14, -25, -1, -11, -5, -6, -90, -11, -8, -90, -7, -23, -8, -11, -14, -14, -17, -12, -19, -28, 2, 15, 15, 16, 21, -63, 7, 13, 10, 15, 8, -63, Ascii.CAN, 10, 21, 9, 16, 22, 21, -63, 2, -63, -19, 2, Ascii.SUB, 16, 22, 21, -18, 2, 15, 2, 8, 6, 19, -63, 20, 6, 21, -49, -63, -28, 2, 13, 13, -63, 20, 6, 21, -19, 2, Ascii.SUB, 16, 22, 21, -18, 2, 15, 2, 8, 6, 19, -63, Ascii.CAN, 10, 21, 9, -63, 2, -63, 15, 16, 15, -50, 15, 22, 13, 13, -63, 2, 19, 8, 22, 14, 6, 15, 21, -49, -35, -5, 8, 8, 9, 14, -70, 13, -3, 12, 9, 6, 6, -70, 14, 9, -70, 10, 9, 13, 3, 14, 3, 9, 8, -70, -5, -70, -26, -5, 19, 9, 15, 14, -25, -5, 8, -5, 1, -1, 12, -70, 13, -1, 14, -56, -70, -35, -5, 6, 6, -70, 13, -1, 14, -26, -5, 19, 9, 15, 14, -25, -5, 8, -5, 1, -1, 12, -70, 17, 3, 14, 2, -70, -5, -70, 8, 9, 8, -57, 8, 15, 6, 6, -70, -5, 12, 1, 15, 7, -1, 8, 14, -56, -33, -3, 10, 10, 11, 16, -68, 15, -1, 14, 11, 8, 8, -68, 19, 5, 16, 4, 11, 17, 16, -68, -3, -68, -24, -3, 21, 11, 17, 16, -23, -3, 10, -3, 3, 1, 14, -68, 15, 1, 16, -54, -68, -33, -3, 8, 8, -68, 15, 1, 16, -24, -3, 21, 11, 17, 16, -23, -3, 10, -3, 3, 1, 14, -68, 19, 5, 16, 4, -68, -3, -68, 10, 11, 10, -55, 10, 17, 8, 8, -68, -3, 14, 3, 17, 9, 1, 10, 16, -54, -29, 1, 14, 14, 15, 20, -64, 19, 13, 15, 15, 20, 8, -64, 19, 3, 18, 15, 12, 12, -64, 23, 9, 20, 8, 15, 21, 20, -64, 1, -64, -20, 1, Ascii.EM, 15, 21, 20, -19, 1, 14, 1, 7, 5, 18, -64, 19, 5, 20, -50, -64, -29, 1, 12, 12, -64, 19, 5, 20, -20, 1, Ascii.EM, 15, 21, 20, -19, 1, 14, 1, 7, 5, 18, -64, 23, 9, 20, 8, 
        -64, 1, -64, 14, 15, 14, -51, 14, 21, 12, 12, -64, 1, 18, 7, 21, 13, 5, 14, 20, -50, -18, Ascii.EM, -54, Ascii.CAN, Ascii.EM, Ascii.RS, -54, Ascii.GS, 15, Ascii.RS, -10, 11, 35, Ascii.EM, Ascii.US, Ascii.RS, -16, Ascii.FS, Ascii.EM, 36, 15, Ascii.CAN, -54, 19, Ascii.CAN, -54, 22, 11, 35, Ascii.EM, Ascii.US, Ascii.RS, -54, Ascii.EM, Ascii.FS, -54, Ascii.GS, 13, Ascii.FS, Ascii.EM, 22, 22, -52, -7, -7, -10, -7, -89, -9, -7, -10, -22, -20, -6, -6, -16, -11, -18, -89, -6, -22, -7, -10, -13, -13, -62, -89, -9, -10, -16, -11, -5, -20, -7, -89, -16, -11, -21, -20, -1, -89, -19, -10, -7, -89, -16, -21, -89, -7, 14, 38, Ascii.FS, 34, 33, -6, 14, Ascii.ESC, 14, 20, 18, Ascii.US, -51, -53, -20, -99, -34, -31, -34, -19, -15, -30, -17, -99, -34, -15, -15, -34, -32, -27, -30, -31, -72, -99, -16, -24, -26, -19, -19, -26, -21, -28, -99, -23, -34, -10, -20, -14, -15, -52, -19, -98, -22, -33, -9, -19, -13, -14, -98, -21, -33, -20, -33, -27, -29, -16, -98, -33, -14, -14, -33, -31, -26, -29, -30, -71, -98, -15, -23, -25, -18, -18, -25, -20, -27, -98, -22, -33, -9, -19, -13, -14, -1, 33, Ascii.RS, 17, Ascii.ESC, 20, Ascii.FS, -49, 38, 23, Ascii.CAN, Ascii.ESC, 20, -49, Ascii.FS, 16, 35, 18, 23, Ascii.CAN, Ascii.GS, 22, -49, 18, 23, 16, Ascii.GS, 22, 20, 19, -49, 37, Ascii.CAN, 20, 38, -49, 23, Ascii.RS, Ascii.ESC, 19, 20, 33, 34, -49, 38, Ascii.CAN, 35, 23, -49, 35, 23, 20, -49, Ascii.GS, 20, 38, Ascii.RS, Ascii.GS, 20, 34, -35, -49, 3, 23, 20, -49, Ascii.US, 33, 20, -36, Ascii.ESC, 16, 40, Ascii.RS, 36, 35, -49, Ascii.CAN, Ascii.GS, 21, Ascii.RS, 33, Ascii.FS, 16, 35, Ascii.CAN, Ascii.RS, Ascii.GS, -49, 21, Ascii.RS, 33, -49, 35, 23, 20, -49, 18, 23, 16, Ascii.GS, 22, 20, -49, 23, Ascii.RS, Ascii.ESC, 19, 20, 33, -49, 5, 9, -45, -7, 40, Ascii.US, Ascii.US, -4, 33, 41, 20, Ascii.US, Ascii.FS, 23, 20, 39, Ascii.CAN, -3, 1, -53, -6, Ascii.EM, -9, 12, 36, Ascii.SUB, 32, Ascii.US, -7, -3, -57, -9, 8, Ascii.EM, Ascii.ESC, 16, 8, 19, -16, 21, Ascii.GS, 8, 19, 16, 11, 8, Ascii.ESC, 12, -14, -10, -64, -13, 3, 18, 15, 12, 12, -10, 9, 7, Ascii.GS, 7, 16, 9, 22, -6, 13, 9, Ascii.ESC, 1, 20, 18, 40, 18, Ascii.ESC, 20, 33, 5, Ascii.CAN, 20, 38, -49, 19, Ascii.RS, 20, 34, -49, Ascii.GS, Ascii.RS, 35, -49, 34, 36, Ascii.US, Ascii.US, Ascii.RS, 33, 35, -49, 34, 18, 33, Ascii.RS, Ascii.ESC, Ascii.ESC, Ascii.CAN, Ascii.GS, 22, -49, 35, Ascii.RS, -49, 16, Ascii.GS, -49, 16, 17, 34, Ascii.RS, Ascii.ESC, 36, 35, 20, -49, Ascii.US, Ascii.RS, 34, Ascii.CAN, 35, Ascii.CAN, Ascii.RS, Ascii.GS, -35, -49, 4, 34, 20, -49, 34, 18, 33, Ascii.RS, Ascii.ESC, Ascii.ESC, 3, Ascii.RS, -1, Ascii.RS, 34, Ascii.CAN, 35, Ascii.CAN, Ascii.RS, Ascii.GS, -49, Ascii.CAN, Ascii.GS, 34, 35, 20, 16, 19, -72, -53, -55, -33, -55, -46, -53, -40, -68, -49, -53, -35, -122, -50, -57, -39, -122, -44, -43, -122, -78, -57, -33, -43, -37, -38, -77, -57, -44, -57, -51, -53, -40, Ascii.GS, 64, 56, -23, 45, 50, 47, 47, 46, 59, 46, 55, 61, -23, Ascii.US, 50, 46, 64, 17, 56, 53, 45, 46, 59, 60, -23, 49, 42, 63, 46, -23, 61, 49, 46, -23, 60, 42, 54, 46, -23, 44, 49, 42, 55, 48, 46, -23, 18, 13, -9, -23, Ascii.GS, 49, 50, 60, -23, 54, 50, 48, 49, 61, -23, 49, 42, 57, 57, 46, 55, -23, 45, 62, 46, -23, 61, 56, -23, 50, 55, 44, 56, 55, 60, 50, 60, 61, 46, 55, 61, -23, 10, 45, 42, 57, 61, 46, 59, -23, 62, 57, 45, 42, 61, 46, -23, 46, 63, 46, 55, 61, 60, -23, 56, 59, -23, 50, 47, -23, 61, 49, 46, -23, 21, 42, 66, 56, 62, 61, 22, 42, 55, 42, 48, 46, 59, -23, 53, 42, 66, 60, -23, 56, 62, 61, -23, 61, 49, 46, -23, 60, 42, 54, 46, -23, Ascii.US, 50, 46, 64, -23, 54, 62, 53, 61, 50, 57, 53, 46, -23, 61, 50, 54, 46, 60, -9, -45, -23, Ascii.US, 50, 46, 64, 17, 56, 53, 45, 46, 59, -23, -6, 3, -10, Ascii.EM, 17, -62, 6, 11, 8, 8, 7, 20, 7, 16, 22, -62, -8, 11, 7, Ascii.EM, -22, 17, 14, 6, 7, 20, 21, -62, 10, 3, Ascii.CAN, 7, -62, 22, 10, 7, -62, 21, 3, 15, 7, -62, 21, 22, 3, 4, 14, 7, -62, -21, -26, -48, -62, -11, 22, 3, 4, 14, 7, -62, -21, -26, 21, -62, 11, 16, -62, Ascii.ESC, 17, 23, 20, -62, 3, 6, 3, 18, 22, 7, 20, -62, -17, -9, -11, -10, -62, -28, -25, -62, 23, 16, 11, 19, 23, 7, -62, 3, 16, 6, -62, -11, -22, -15, -9, -18, -26, -62, -16, -15, -10, -62, 5, 10, 3, 16, 9, 7, -48, -84, -62, -8, 11, 7, Ascii.EM, -22, 17, 14, 6, 7, 20, -62, -45, -36, -29, -10, -14, 4, -83, 7, 9, 9, 11, Ascii.EM, Ascii.EM, 15, 8, 15, 18, 15, Ascii.SUB, Ascii.US, Ascii.US, 36, 45, 32, Ascii.RS, 47, 36, 42, 41, -37, 40, 48, 46, 47, -37, Ascii.GS, 32, -37, Ascii.FS, Ascii.GS, 46, 42, 39, 48, 47, 32, -23, -37, 45, 32, Ascii.RS, 32, 36, 49, 32, Ascii.US, -11, -42, -43, -86, -49, -48, -45, -53, -67, -48, -52, -34, -88, -37, -37, -56, -54, -49, -52, -53, -69, -42, -66, -48, -43, -53, -42, -34, -40, -41, -84, -47, -46, -43, -51, -65, -46, -50, -32, -83, -50, -35, -54, -52, -47, -50, -51, -81, -37, -40, -42, -64, -46, -41, -51, -40, -32, -30, -44, -29, -62, -46, -31, -34, -37, -37, -40, -35, -42, -61, -34, -28, -46, -41, -62, -37, -34, -33, -105, -104, -87, -113, -47, -48, -45, -113, -48, -31, -42, -28, -36, -44, -35, -29, -113, -46, -34, -35, -30, -29, -48, -35, -29, -113};
    }

    static {
        A0W();
        A1I = new int[]{R.attr.nestedScrollingEnabled};
        A1H = new int[]{R.attr.clipToPadding};
        A1C = Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 20;
        A1B = Build.VERSION.SDK_INT >= 23;
        A1D = Build.VERSION.SDK_INT >= 16;
        A1E = Build.VERSION.SDK_INT >= 21;
        A1F = Build.VERSION.SDK_INT <= 15;
        A1G = Build.VERSION.SDK_INT <= 15;
        A1J = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        A1A = new Interpolator() { // from class: com.facebook.ads.redexgen.X.4N
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        };
    }

    public EB(Context context) {
        this(context, null);
    }

    public EB(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EB(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.A11 = new C1354Yo(this);
        this.A0r = new C06124i(this);
        this.A0t = new AnonymousClass50();
        this.A0u = new Runnable() { // from class: com.facebook.ads.redexgen.X.4L
            @Override // java.lang.Runnable
            public final void run() {
                if (!this.A00.A0D || this.A00.isLayoutRequested()) {
                    return;
                }
                if (!this.A00.A0F) {
                    this.A00.requestLayout();
                } else if (this.A00.A0I) {
                    this.A00.A0J = true;
                } else {
                    this.A00.A1J();
                }
            }
        };
        this.A0p = new Rect();
        this.A0z = new Rect();
        this.A0q = new RectF();
        this.A0v = new ArrayList<>();
        this.A13 = new ArrayList<>();
        this.A0O = 0;
        this.A0C = false;
        this.A0U = 0;
        this.A0N = 0;
        this.A05 = new EE();
        this.A0W = 0;
        this.A0V = -1;
        this.A0L = Float.MIN_VALUE;
        this.A0M = Float.MIN_VALUE;
        this.A0o = true;
        this.A08 = new RunnableC06214r(this);
        this.A02 = A1E ? new C1365Yz() : null;
        this.A0s = new C06194p();
        this.A0G = false;
        this.A0H = false;
        this.A0f = new C1357Yr(this);
        this.A0K = false;
        this.A14 = new int[2];
        this.A17 = new int[2];
        this.A16 = new int[2];
        this.A15 = new int[2];
        this.A0w = new ArrayList();
        this.A0k = new Runnable() { // from class: com.facebook.ads.redexgen.X.4M
            @Override // java.lang.Runnable
            public final void run() {
                if (this.A00.A05 != null) {
                    this.A00.A05.A0J();
                }
                this.A00.A0K = false;
            }
        };
        this.A12 = new C1360Yu(this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1H, i10, 0);
            this.A0B = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.A0B = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0X = viewConfiguration.getScaledTouchSlop();
        this.A0L = C3G.A00(viewConfiguration, context);
        this.A0M = C3G.A01(viewConfiguration, context);
        this.A0y = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A0x = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.A05.A0B(this.A0f);
        A0e();
        A0O();
        if (C3F.A00(this) == 0) {
            C3F.A09(this, 1);
        }
        this.A10 = (AccessibilityManager) getContext().getSystemService(A0I(1831, 13, 81));
        setAccessibilityDelegateCompat(new C1352Yl(this));
        setDescendantFocusability(262144);
        setNestedScrollingEnabled(true);
    }

    private int A0B(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            int id3 = view.getId();
            if (id3 != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private final long A0C(AbstractC06224s abstractC06224s) {
        return this.A04.A0A() ? abstractC06224s.A0K() : abstractC06224s.A03;
    }

    private View A0D() {
        AbstractC06224s abstractC06224sA1F;
        int i10 = this.A0s.A01 != -1 ? this.A0s.A01 : 0;
        int iA03 = this.A0s.A03();
        for (int i11 = i10; i11 < iA03; i11++) {
            AbstractC06224s abstractC06224sA1F2 = A1F(i11);
            if (abstractC06224sA1F2 == null) {
                break;
            }
            if (abstractC06224sA1F2.A0H.hasFocusable()) {
                return abstractC06224sA1F2.A0H;
            }
        }
        int startFocusSearchIndex = Math.min(iA03, i10);
        for (int limit = startFocusSearchIndex - 1; limit >= 0 && (abstractC06224sA1F = A1F(limit)) != null; limit--) {
            if (abstractC06224sA1F.A0H.hasFocusable()) {
                return abstractC06224sA1F.A0H;
            }
        }
        return null;
    }

    private final AbstractC06224s A0E(long j10) {
        C4O c4o = this.A04;
        if (c4o == null || !c4o.A0A()) {
            return null;
        }
        int iA06 = this.A01.A06();
        AbstractC06224s abstractC06224s = null;
        for (int i10 = 0; i10 < iA06; i10++) {
            AbstractC06224s holder = A0F(this.A01.A0A(i10));
            if (holder != null && !holder.A0c()) {
                long jA0K = holder.A0K();
                String[] strArr = A19;
                String str = strArr[3];
                String str2 = strArr[0];
                int length = str.length();
                int childCount = str2.length();
                if (length == childCount) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A19;
                strArr2[2] = "zZZE93";
                strArr2[7] = "VhF552wVYFMR";
                if (jA0K != j10) {
                    continue;
                } else if (this.A01.A0K(holder.A0H)) {
                    abstractC06224s = holder;
                } else {
                    return holder;
                }
            }
        }
        return abstractC06224s;
    }

    public static AbstractC06224s A0F(View view) {
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (A19[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[6] = "BAOGG7B6SgQWpjs0haC4kmkQlPV7A4k9";
        strArr[4] = "PAhaNRNZ3VZ1U75Bha3wwWQKZTmx8jYI";
        return ((C06064b) layoutParams).A00;
    }

    private final AbstractC06224s A0G(View view) {
        View itemView = A1E(view);
        if (itemView == null) {
            return null;
        }
        return A1H(itemView);
    }

    public static EB A0H(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        boolean z10 = view instanceof EB;
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        A19[1] = "St3OXKQiThZ0lO5vTnfaG6NXMltPJG5W";
        if (z10) {
            return (EB) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int count = viewGroup.getChildCount();
        for (int i10 = 0; i10 < count; i10++) {
            EB ebA0H = A0H(viewGroup.getChildAt(i10));
            if (ebA0H != null) {
                return ebA0H;
            }
        }
        return null;
    }

    private void A0J() {
        A0T();
        setScrollState(0);
    }

    private void A0K() {
        int i10 = this.A0P;
        this.A0P = 0;
        if (i10 != 0) {
            boolean zA1t = A1t();
            String[] strArr = A19;
            String str = strArr[2];
            String str2 = strArr[7];
            int length = str.length();
            int flags = str2.length();
            if (length == flags) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[3] = "eU2cwXbbXfV7oR8qPBCYPw";
            strArr2[0] = "cj1lHsGs8Y";
            if (zA1t) {
                AccessibilityEvent event = AccessibilityEvent.obtain();
                event.setEventType(2048);
                C3Y.A01(event, i10);
                sendAccessibilityEventUnchecked(event);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:55:0x019d A[PHI: r7
  0x019d: PHI (r7v1 com.facebook.ads.redexgen.X.4s) = (r7v0 com.facebook.ads.redexgen.X.4s), (r7v2 com.facebook.ads.redexgen.X.4s) binds: [B:53:0x019a, B:50:0x0182] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bf A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0184 A[SYNTHETIC] */
    private void A0L() {
        AbstractC06224s abstractC06224sA0F;
        boolean didStructureChange;
        int iA00;
        boolean zA0k;
        C4V c4vA09;
        this.A0s.A04(1);
        A1m(this.A0s);
        this.A0s.A0A = false;
        A1K();
        this.A0t.A06();
        A1L();
        A0P();
        A0U();
        C06194p c06194p = this.A0s;
        c06194p.A0E = c06194p.A0C && this.A0H;
        this.A0H = false;
        this.A0G = false;
        C06194p c06194p2 = this.A0s;
        c06194p2.A09 = c06194p2.A0B;
        this.A0s.A03 = this.A04.A0D();
        A0x(this.A14);
        if (this.A0s.A0C) {
            int iA05 = this.A01.A05();
            for (int i10 = 0; i10 < iA05; i10++) {
                AbstractC06224s abstractC06224sA0F2 = A0F(this.A01.A09(i10));
                boolean zA0h = abstractC06224sA0F2.A0h();
                String[] strArr = A19;
                String str = strArr[2];
                String str2 = strArr[7];
                int i11 = str.length();
                int count = str2.length();
                if (i11 != count) {
                    A19[5] = "UNYHKTM9Pgc2Q8zoabZHHBhpghLQMYt4";
                    if (!zA0h) {
                        boolean zA0b = abstractC06224sA0F2.A0b();
                        String[] strArr2 = A19;
                        String str3 = strArr2[2];
                        String str4 = strArr2[7];
                        int i12 = str3.length();
                        int count2 = str4.length();
                        if (i12 != count2) {
                            A19[5] = "yAYMfY7gQPsOXL0bw1Y8FO5LYSWRNpHN";
                            if (zA0b) {
                                C4O c4o = this.A04;
                                int i13 = A19[5].charAt(2);
                                if (i13 != 89) {
                                    String[] strArr3 = A19;
                                    strArr3[2] = "S1msfb";
                                    strArr3[7] = "DqMDNTpz3t0S";
                                    if (c4o.A0A()) {
                                        C4W c4w = this.A05;
                                        C06194p c06194p3 = this.A0s;
                                        int i14 = C4W.A00(abstractC06224sA0F2);
                                        this.A0t.A0F(abstractC06224sA0F2, c4w.A09(c06194p3, abstractC06224sA0F2, i14, abstractC06224sA0F2.A0L()));
                                        if (!this.A0s.A0E && abstractC06224sA0F2.A0f() && !abstractC06224sA0F2.A0c() && !abstractC06224sA0F2.A0h() && !abstractC06224sA0F2.A0b()) {
                                            long jA0C = A0C(abstractC06224sA0F2);
                                            AnonymousClass50 anonymousClass50 = this.A0t;
                                            int i15 = A19[1].length();
                                            if (i15 == 32) {
                                                String[] strArr4 = A19;
                                                strArr4[3] = "VKmUie50Iu1ZqeQWLORu5w";
                                                strArr4[0] = "PYciOOvrvR";
                                                anonymousClass50.A08(jA0C, abstractC06224sA0F2);
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    String[] strArr5 = A19;
                                    strArr5[6] = "3GcQR0gwPdJ7qG9NsafqkCoBzG49WZbm";
                                    strArr5[4] = "xwZbJMHEvrrw2fWE8anB3sW9hLiJiwUw";
                                    if (c4o.A0A()) {
                                        C4W c4w2 = this.A05;
                                        C06194p c06194p4 = this.A0s;
                                        int i16 = C4W.A00(abstractC06224sA0F2);
                                        this.A0t.A0F(abstractC06224sA0F2, c4w2.A09(c06194p4, abstractC06224sA0F2, i16, abstractC06224sA0F2.A0L()));
                                        if (!this.A0s.A0E) {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                C4W c4w3 = this.A05;
                                C06194p c06194p5 = this.A0s;
                                int i17 = C4W.A00(abstractC06224sA0F2);
                                this.A0t.A0F(abstractC06224sA0F2, c4w3.A09(c06194p5, abstractC06224sA0F2, i17, abstractC06224sA0F2.A0L()));
                                if (!this.A0s.A0E) {
                                    continue;
                                }
                            }
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
        if (this.A0s.A0B) {
            A0i();
            boolean z10 = this.A0s.A0D;
            this.A0s.A0D = false;
            this.A06.A1y(this.A0r, this.A0s);
            this.A0s.A0D = z10;
            for (int i18 = 0; i18 < this.A01.A05(); i18++) {
                C06033y c06033y = this.A01;
                int i19 = A19[1].length();
                if (i19 != 32) {
                    String[] strArr6 = A19;
                    strArr6[2] = "4lQmW8";
                    strArr6[7] = "2Uq8uzi7rIEU";
                    abstractC06224sA0F = A0F(c06033y.A09(i18));
                    boolean didStructureChange2 = abstractC06224sA0F.A0h();
                    if (!didStructureChange2) {
                        didStructureChange = this.A0t.A0I(abstractC06224sA0F);
                        if (!didStructureChange) {
                            iA00 = C4W.A00(abstractC06224sA0F);
                            zA0k = abstractC06224sA0F.A0k(8192);
                            if (!zA0k) {
                                iA00 |= 4096;
                            }
                            c4vA09 = this.A05.A09(this.A0s, abstractC06224sA0F, iA00, abstractC06224sA0F.A0L());
                            if (zA0k) {
                                A1n(abstractC06224sA0F, c4vA09);
                            } else {
                                this.A0t.A0D(abstractC06224sA0F, c4vA09);
                            }
                        }
                    }
                } else {
                    A19[1] = "EzPEwBDGhSnYyJadD6vqsk9WPl8azgQD";
                    abstractC06224sA0F = A0F(c06033y.A09(i18));
                    boolean didStructureChange3 = abstractC06224sA0F.A0h();
                    if (!didStructureChange3) {
                        didStructureChange = this.A0t.A0I(abstractC06224sA0F);
                        if (!didStructureChange) {
                            iA00 = C4W.A00(abstractC06224sA0F);
                            zA0k = abstractC06224sA0F.A0k(8192);
                            if (!zA0k) {
                                iA00 |= 4096;
                            }
                            c4vA09 = this.A05.A09(this.A0s, abstractC06224sA0F, iA00, abstractC06224sA0F.A0L());
                            if (zA0k) {
                                A1n(abstractC06224sA0F, c4vA09);
                            } else {
                                this.A0t.A0D(abstractC06224sA0F, c4vA09);
                            }
                        }
                    }
                }
            }
            A0X();
        } else {
            A0X();
        }
        A1M();
        A1s(false);
        this.A0s.A04 = 2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0078  */
    private void A0M() {
        boolean z10;
        A1K();
        A1L();
        this.A0s.A04(6);
        this.A00.A0G();
        this.A0s.A03 = this.A04.A0D();
        this.A0s.A00 = 0;
        this.A0s.A09 = false;
        this.A06.A1y(this.A0r, this.A0s);
        this.A0s.A0D = false;
        this.A0j = null;
        C06194p c06194p = this.A0s;
        if (c06194p.A0C) {
            C4W c4w = this.A05;
            String[] strArr = A19;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[6] = "QyMu0uKDVMcIUQ2WaaKkjpUJvINNzfF4";
            strArr2[4] = "jnZHkwnP1Z9tC9uQsacmbdRp3FaoK01F";
            if (c4w != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        c06194p.A0C = z10;
        C06194p c06194p2 = this.A0s;
        if (A19[1].length() != 32) {
            c06194p2.A04 = 4;
            A1M();
            A1s(false);
        } else {
            A19[1] = "3IsVIAoReRfPbfS1EeUcjIwVgXkj1JVv";
            c06194p2.A04 = 4;
            A1M();
            A1s(false);
        }
    }

    private void A0O() {
        this.A01 = new C06033y(new C1359Yt(this));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x006f  */
    private void A0P() {
        boolean animationTypeSupported;
        boolean z10;
        boolean animationTypeSupported2;
        if (this.A0C) {
            this.A00.A0I();
            this.A06.A1M(this);
        }
        if (A0z()) {
            this.A00.A0H();
        } else {
            this.A00.A0G();
        }
        boolean z11 = false;
        boolean z12 = this.A0G || this.A0H;
        C06194p c06194p = this.A0s;
        boolean animationTypeSupported3 = this.A0D;
        if (!animationTypeSupported3 || this.A05 == null) {
            animationTypeSupported = false;
        } else {
            boolean animationTypeSupported4 = this.A0C;
            if (animationTypeSupported4 || z12) {
                z10 = this.A0C;
                if (A19[5].charAt(2) != 'Y') {
                    throw new RuntimeException();
                }
                String[] strArr = A19;
                strArr[6] = "q3lLGfTGOOnJqHZydaTklLew08TAvgTY";
                strArr[4] = "cayAc0YyiA2wrQyaXaOul4VyYlz5tKdZ";
                if (z10) {
                    animationTypeSupported2 = this.A04.A0A();
                    if (animationTypeSupported2) {
                        animationTypeSupported = false;
                    }
                }
                animationTypeSupported = true;
            } else {
                boolean animationTypeSupported5 = this.A06.A09;
                if (animationTypeSupported5) {
                    z10 = this.A0C;
                    if (A19[5].charAt(2) != 'Y') {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A19;
                    strArr2[6] = "q3lLGfTGOOnJqHZydaTklLew08TAvgTY";
                    strArr2[4] = "cayAc0YyiA2wrQyaXaOul4VyYlz5tKdZ";
                    if (z10) {
                        animationTypeSupported2 = this.A04.A0A();
                        if (animationTypeSupported2) {
                            animationTypeSupported = false;
                        }
                    }
                    animationTypeSupported = true;
                } else {
                    animationTypeSupported = false;
                }
            }
        }
        c06194p.A0C = animationTypeSupported;
        C06194p c06194p2 = this.A0s;
        boolean animationTypeSupported6 = c06194p2.A0C;
        if (animationTypeSupported6 && z12) {
            boolean animationTypeSupported7 = this.A0C;
            if (!animationTypeSupported7) {
                boolean animationTypeSupported8 = A0z();
                if (animationTypeSupported8) {
                    z11 = true;
                }
            }
        }
        c06194p2.A0B = z11;
        if (A19[1].length() == 32) {
            A19[5] = "vAY5NMbknnGVxibfJ54Fdf4KbFDo9MxQ";
            return;
        }
        String[] strArr3 = A19;
        strArr3[2] = "gWU7AH";
        strArr3[7] = "O2IXTNL1mXfE";
    }

    private void A0Q() {
        View viewToFocus;
        if (this.A0o && this.A04 != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() == 131072 && isFocused()) {
                return;
            }
            boolean zIsFocused = isFocused();
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            A19[5] = "GSYhD7ljhsNq0QcPBhSV8ATJlhol3xt1";
            if (!zIsFocused) {
                View focusedChild = getFocusedChild();
                if (A1G && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                    if (this.A01.A05() == 0) {
                        requestFocus();
                        return;
                    }
                } else if (!this.A01.A0K(focusedChild)) {
                    return;
                }
            }
            AbstractC06224s abstractC06224sA0E = null;
            if (this.A0s.A08 != -1 && this.A04.A0A()) {
                abstractC06224sA0E = A0E(this.A0s.A08);
            }
            View viewA0D = null;
            if (abstractC06224sA0E == null || this.A01.A0K(abstractC06224sA0E.A0H) || !abstractC06224sA0E.A0H.hasFocusable()) {
                if (this.A01.A05() > 0) {
                    viewA0D = A0D();
                }
            } else {
                viewA0D = abstractC06224sA0E.A0H;
            }
            if (viewA0D != null) {
                if (this.A0s.A02 != -1 && (viewToFocus = viewA0D.findViewById(this.A0s.A02)) != null && viewToFocus.isFocusable()) {
                    viewA0D = viewToFocus;
                }
                viewA0D.requestFocus();
            }
        }
    }

    private void A0R() {
        boolean zIsFinished = false;
        EdgeEffect edgeEffect = this.A0a;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.A0a.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A0c;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            boolean needsInvalidate = this.A0c.isFinished();
            zIsFinished |= needsInvalidate;
        }
        EdgeEffect edgeEffect3 = this.A0b;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            boolean needsInvalidate2 = this.A0b.isFinished();
            zIsFinished |= needsInvalidate2;
        }
        EdgeEffect edgeEffect4 = this.A0Z;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            boolean needsInvalidate3 = this.A0Z.isFinished();
            zIsFinished |= needsInvalidate3;
        }
        if (zIsFinished) {
            C3F.A07(this);
        }
    }

    private void A0S() {
        this.A0s.A08 = -1L;
        this.A0s.A01 = -1;
        this.A0s.A02 = -1;
    }

    private void A0T() {
        VelocityTracker velocityTracker = this.A0Y;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        A1Y(0);
        A0R();
    }

    private void A0U() {
        int iA0G;
        View focusedChild = null;
        if (this.A0o && hasFocus() && this.A04 != null) {
            focusedChild = getFocusedChild();
        }
        AbstractC06224s abstractC06224sA0G = focusedChild == null ? null : A0G(focusedChild);
        if (abstractC06224sA0G == null) {
            A0S();
            return;
        }
        this.A0s.A08 = this.A04.A0A() ? abstractC06224sA0G.A0K() : -1L;
        C06194p c06194p = this.A0s;
        if (this.A0C) {
            iA0G = -1;
        } else {
            iA0G = abstractC06224sA0G.A0c() ? abstractC06224sA0G.A01 : abstractC06224sA0G.A0G();
        }
        c06194p.A01 = iA0G;
        C06194p c06194p2 = this.A0s;
        View child = abstractC06224sA0G.A0H;
        c06194p2.A02 = A0B(child);
    }

    private void A0V() {
        this.A08.A08();
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a != null) {
            abstractC06054a.A0x();
        }
    }

    private final void A0X() {
        int iA06 = this.A01.A06();
        for (int i10 = 0; i10 < iA06; i10++) {
            C06033y c06033y = this.A01;
            String[] strArr = A19;
            String str = strArr[3];
            String str2 = strArr[0];
            int i11 = str.length();
            int childCount = str2.length();
            if (i11 == childCount) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[3] = "VFyFJGthyduvDNyVUqu48D";
            strArr2[0] = "uBjdUWzzez";
            AbstractC06224s abstractC06224sA0F = A0F(c06033y.A0A(i10));
            if (!abstractC06224sA0F.A0h()) {
                abstractC06224sA0F.A0M();
            }
        }
        this.A0r.A0K();
    }

    private final void A0Y() {
        C4O c4o = this.A04;
        String strA0I = A0I(1370, 12, 79);
        if (c4o == null) {
            Log.e(strA0I, A0I(1123, 36, 40));
            return;
        }
        if (this.A06 == null) {
            Log.e(strA0I, A0I(1159, 43, 41));
            return;
        }
        this.A0s.A0A = false;
        if (this.A0s.A04 == 1) {
            A0L();
            this.A06.A1O(this);
            A0M();
        } else if (this.A00.A0K() || this.A06.A0h() != getWidth() || this.A06.A0X() != getHeight()) {
            this.A06.A1O(this);
            A0M();
        } else {
            this.A06.A1O(this);
        }
        A0N();
    }

    private final void A0Z() {
        int state;
        for (int size = this.A0w.size() - 1; size >= 0; size--) {
            AbstractC06224s abstractC06224s = this.A0w.get(size);
            if (abstractC06224s.A0H.getParent() == this && !abstractC06224s.A0h() && (state = abstractC06224s.A02) != -1) {
                C3F.A09(abstractC06224s.A0H, state);
                abstractC06224s.A02 = -1;
            }
        }
        this.A0w.clear();
    }

    private final void A0a() {
        if (this.A0Z != null) {
            return;
        }
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.A0Z = edgeEffect;
        if (this.A0B) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    private final void A0b() {
        if (this.A0a != null) {
            return;
        }
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.A0a = edgeEffect;
        if (this.A0B) {
            int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int measuredWidth = getMeasuredWidth() - getPaddingLeft();
            int paddingRight = getPaddingRight();
            String[] strArr = A19;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[6] = "GMHrLIeJxdXYoHZyaa7kSwSfzExGbrBL";
            strArr2[4] = "0YT1HYXH3vPYSlLI8aOL6WZeFeHH6VHe";
            edgeEffect.setSize(measuredHeight, measuredWidth - paddingRight);
            return;
        }
        edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
    }

    private final void A0c() {
        if (this.A0b != null) {
            return;
        }
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.A0b = edgeEffect;
        if (this.A0B) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    private final void A0d() {
        if (this.A0c != null) {
            return;
        }
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.A0c = edgeEffect;
        if (this.A0B) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            return;
        }
        int measuredWidth = getMeasuredWidth();
        if (A19[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[2] = "10JS50";
        strArr[7] = "NY78MD5eAiV9";
        edgeEffect.setSize(measuredWidth, getMeasuredHeight());
    }

    private final void A0e() {
        this.A00 = new Z0(new C1358Ys(this));
    }

    private final void A0f() {
        this.A0Z = null;
        this.A0c = null;
        this.A0b = null;
        this.A0a = null;
    }

    private final void A0g() {
        int iA06 = this.A01.A06();
        for (int i10 = 0; i10 < iA06; i10++) {
            ((C06064b) this.A01.A0A(i10).getLayoutParams()).A01 = true;
        }
        this.A0r.A0M();
    }

    private final void A0h() {
        int iA06 = this.A01.A06();
        for (int i10 = 0; i10 < iA06; i10++) {
            AbstractC06224s abstractC06224sA0F = A0F(this.A01.A0A(i10));
            if (abstractC06224sA0F != null && !abstractC06224sA0F.A0h()) {
                abstractC06224sA0F.A0T(6);
            }
        }
        A0g();
        this.A0r.A0N();
    }

    private final void A0i() {
        int iA06 = this.A01.A06();
        for (int i10 = 0; i10 < iA06; i10++) {
            AbstractC06224s abstractC06224sA0F = A0F(this.A01.A0A(i10));
            if (!abstractC06224sA0F.A0h()) {
                abstractC06224sA0F.A0R();
            }
        }
    }

    private void A0j(float f10, float f11, float f12, float f13) {
        boolean z10 = false;
        if (f11 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            A0b();
            C05943p.A00(this.A0a, (-f11) / getWidth(), 1.0f - (f12 / getHeight()));
            z10 = true;
        } else if (f11 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            A0c();
            C05943p.A00(this.A0b, f11 / getWidth(), f12 / getHeight());
            z10 = true;
        }
        if (f13 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            A0d();
            C05943p.A00(this.A0c, (-f13) / getHeight(), f10 / getWidth());
            z10 = true;
        } else if (f13 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            A0a();
            C05943p.A00(this.A0Z, f13 / getHeight(), 1.0f - (f10 / getWidth()));
            z10 = true;
        }
        if (z10 || f11 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || f13 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            C3F.A07(this);
        }
    }

    private final void A0k(int i10) {
        AbstractC06054a abstractC06054a = this.A06;
        AbstractC06104f abstractC06104f = this.A0i;
        if (abstractC06104f != null) {
            abstractC06104f.A0L(this, i10);
        }
        List<AbstractC06104f> list = this.A0m;
        String[] strArr = A19;
        if (strArr[2].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[2] = "mB2qLC";
        strArr2[7] = "mQXIqdAaLius";
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.A0m.get(size).A0L(this, i10);
            }
        }
    }

    private final void A0l(int i10, int i11, Interpolator interpolator) {
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a == null) {
            Log.e(A0I(1370, 12, 79), A0I(924, 97, 75));
            return;
        }
        boolean z10 = this.A0I;
        if (A19[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[2] = "pqK8Y9";
        strArr[7] = "UiASdGbGWO9v";
        if (z10) {
            return;
        }
        if (!abstractC06054a.A24()) {
            i10 = 0;
        }
        if (!this.A06.A25()) {
            i11 = 0;
        }
        if (i10 != 0 || i11 != 0) {
            this.A08.A0D(i10, i11, interpolator);
        }
    }

    private void A0m(long j10, AbstractC06224s abstractC06224s, AbstractC06224s abstractC06224s2) {
        int iA05 = this.A01.A05();
        for (int i10 = 0; i10 < iA05; i10++) {
            AbstractC06224s abstractC06224sA0F = A0F(this.A01.A09(i10));
            if (abstractC06224sA0F != abstractC06224s && A0C(abstractC06224sA0F) == j10) {
                C4O c4o = this.A04;
                String strA0I = A0I(1, 17, 65);
                if (c4o != null && c4o.A0A()) {
                    throw new IllegalStateException(A0I(1696, 130, 77) + abstractC06224sA0F + strA0I + abstractC06224s + A1I());
                }
                throw new IllegalStateException(A0I(1508, 188, 116) + abstractC06224sA0F + strA0I + abstractC06224s + A1I());
            }
        }
        Log.e(A0I(1370, 12, 79), A0I(1202, 111, 90) + abstractC06224s2 + A0I(18, 41, 39) + abstractC06224s + A1I());
    }

    private void A0n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int actionIndex2 = this.A0V;
        if (pointerId != actionIndex2) {
            return;
        }
        int i10 = actionIndex == 0 ? 1 : 0;
        int actionIndex3 = motionEvent.getPointerId(i10);
        this.A0V = actionIndex3;
        int actionIndex4 = (int) (motionEvent.getX(i10) + 0.5f);
        this.A0S = actionIndex4;
        this.A0Q = actionIndex4;
        int actionIndex5 = (int) (motionEvent.getY(i10) + 0.5f);
        this.A0T = actionIndex5;
        this.A0R = actionIndex5;
    }

    public static void A0o(View view, Rect rect) {
        C06064b c06064b = (C06064b) view.getLayoutParams();
        Rect rect2 = c06064b.A03;
        rect.set((view.getLeft() - rect2.left) - c06064b.leftMargin, (view.getTop() - rect2.top) - c06064b.topMargin, view.getRight() + rect2.right + c06064b.rightMargin, view.getBottom() + rect2.bottom + c06064b.bottomMargin);
    }

    private void A0p(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.A0p.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams focusedLayoutParams = view3.getLayoutParams();
        if (focusedLayoutParams instanceof C06064b) {
            C06064b c06064b = (C06064b) focusedLayoutParams;
            if (!c06064b.A01) {
                Rect insets = c06064b.A03;
                this.A0p.left -= insets.left;
                this.A0p.right += insets.right;
                this.A0p.top -= insets.top;
                this.A0p.bottom += insets.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.A0p);
            offsetRectIntoDescendantCoords(view, this.A0p);
        }
        this.A06.A1e(this, view, this.A0p, !this.A0D, view2 == null);
    }

    private void A0q(C4O c4o, boolean z10, boolean z11) {
        C4O c4o2 = this.A04;
        if (c4o2 != null) {
            C1354Yo c1354Yo = this.A11;
            String[] strArr = A19;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[6] = "W0We85FJJqvSsXa60a6gd4EA7hDdiGkp";
            strArr2[4] = "7sp9VzUFxAlBM78ItapDbGKr6NkpOVCZ";
            c4o2.A08(c1354Yo);
        }
        if (!z10 || z11) {
            A1O();
        }
        this.A00.A0I();
        C4O c4o3 = this.A04;
        this.A04 = c4o;
        if (c4o != null) {
            c4o.A07(this.A11);
        }
        AbstractC06054a abstractC06054a = this.A06;
        C06124i c06124i = this.A0r;
        C4O oldAdapter = this.A04;
        c06124i.A0Y(c4o3, oldAdapter, z10);
        this.A0s.A0D = true;
        A1Q();
    }

    private void A0r(AbstractC06224s abstractC06224s) {
        View view = abstractC06224s.A0H;
        boolean z10 = view.getParent() == this;
        this.A0r.A0c(A1H(view));
        if (abstractC06224s.A0e()) {
            C06033y c06033y = this.A01;
            String[] strArr = A19;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[6] = "yAMck033yUmsKAwrNaBuaPdrYuAtD8a4";
            strArr2[4] = "2F1g5meBaFaT8Ughfaz4Efd5BOFwzFG2";
            c06033y.A0H(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.A01.A0J(view, true);
        } else {
            this.A01.A0E(view);
        }
    }

    public static void A0s(AbstractC06224s abstractC06224s) {
        if (abstractC06224s.A09 != null) {
            WeakReference<EB> weakReference = abstractC06224s.A09;
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[6] = "Lp0Vudgnjyr9htx58aJuOXSG6zR0Rms0";
            strArr[4] = "QnOoNSP4qihOpTYseackLt73SA9jbFjz";
            EB eb2 = weakReference.get();
            while (eb2 != null) {
                View item = abstractC06224s.A0H;
                if (eb2 == item) {
                    return;
                }
                Object parent = eb2.getParent();
                if (parent instanceof View) {
                    eb2 = (View) parent;
                } else {
                    eb2 = null;
                }
            }
            abstractC06224s.A09 = null;
        }
    }

    private void A0t(AbstractC06224s abstractC06224s, AbstractC06224s abstractC06224s2, C4V c4v, C4V c4v2, boolean z10, boolean z11) {
        abstractC06224s.A0Z(false);
        if (z10) {
            A0r(abstractC06224s);
        }
        if (abstractC06224s != abstractC06224s2) {
            if (z11) {
                A0r(abstractC06224s2);
            }
            abstractC06224s.A06 = abstractC06224s2;
            A0r(abstractC06224s);
            this.A0r.A0c(abstractC06224s);
            abstractC06224s2.A0Z(false);
            abstractC06224s2.A07 = abstractC06224s;
        }
        if (this.A05.A0H(abstractC06224s, abstractC06224s2, c4v, c4v2)) {
            A1N();
        }
    }

    private void A0x(int[] iArr) {
        int iA05 = this.A01.A05();
        if (iA05 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int maxPositionPreLayout = Integer.MAX_VALUE;
        int minPositionPreLayout = Integer.MIN_VALUE;
        for (int i10 = 0; i10 < iA05; i10++) {
            AbstractC06224s abstractC06224sA0F = A0F(this.A01.A09(i10));
            if (!abstractC06224sA0F.A0h()) {
                int count = abstractC06224sA0F.A0I();
                if (count < maxPositionPreLayout) {
                    maxPositionPreLayout = count;
                }
                if (count > minPositionPreLayout) {
                    minPositionPreLayout = count;
                }
            }
        }
        iArr[0] = maxPositionPreLayout;
        iArr[1] = minPositionPreLayout;
    }

    private boolean A0y() {
        int iA05 = this.A01.A05();
        for (int i10 = 0; i10 < iA05; i10++) {
            AbstractC06224s abstractC06224sA0F = A0F(this.A01.A09(i10));
            if (abstractC06224sA0F != null && !abstractC06224sA0F.A0h() && abstractC06224sA0F.A0f()) {
                return true;
            }
        }
        return false;
    }

    private boolean A0z() {
        return this.A05 != null && this.A06.A26();
    }

    private boolean A11(int i10, int i11) {
        A0x(this.A14);
        int[] iArr = this.A14;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    private final boolean A12(int i10, int i11) {
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a == null) {
            Log.e(A0I(1370, 12, 79), A0I(651, 89, 76));
            return false;
        }
        if (this.A0I) {
            return false;
        }
        boolean zA24 = abstractC06054a.A24();
        boolean canScroll = this.A06.A25();
        if (!zA24 || Math.abs(i10) < this.A0y) {
            i10 = 0;
        }
        if (!canScroll || Math.abs(i11) < this.A0y) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        boolean canScrollHorizontal = dispatchNestedPreFling(i10, i11);
        if (!canScrollHorizontal) {
            boolean canScrollVertical = zA24 || canScroll;
            dispatchNestedFling(i10, i11, canScrollVertical);
            AbstractC06084d abstractC06084d = this.A0g;
            if (abstractC06084d != null) {
                boolean canScrollHorizontal2 = abstractC06084d.A0B(i10, i11);
                if (canScrollHorizontal2) {
                    return true;
                }
            }
            if (canScrollVertical) {
                int i12 = 0;
                if (zA24) {
                    i12 = 0 | 1;
                }
                if (canScroll) {
                    i12 |= 2;
                }
                A1x(i12, 1);
                int i13 = this.A0x;
                int nestedScrollAxis = -i13;
                int iMax = Math.max(nestedScrollAxis, Math.min(i10, i13));
                int i14 = this.A0x;
                int nestedScrollAxis2 = -i14;
                this.A08.A09(iMax, Math.max(nestedScrollAxis2, Math.min(i11, i14)));
                return true;
            }
        }
        return false;
    }

    private final boolean A13(int i10, int i11, MotionEvent motionEvent) {
        int unconsumedY = 0;
        int consumedX = 0;
        int iA1h = 0;
        int unconsumedX = 0;
        A1J();
        if (this.A04 != null) {
            A1K();
            A1L();
            C05572c.A01(A0I(1361, 9, 75));
            A1m(this.A0s);
            if (i10 != 0) {
                iA1h = this.A06.A1h(i10, this.A0r, this.A0s);
                unconsumedY = i10 - iA1h;
            }
            if (i11 != 0) {
                unconsumedX = this.A06.A1i(i11, this.A0r, this.A0s);
                consumedX = i11 - unconsumedX;
            }
            C05572c.A00();
            A1P();
            A1M();
            A1s(false);
        }
        if (!this.A0v.isEmpty()) {
            invalidate();
        }
        if (A1y(iA1h, unconsumedX, unconsumedY, consumedX, this.A17, 0)) {
            int i12 = this.A0S;
            int[] iArr = this.A17;
            int i13 = iArr[0];
            this.A0S = i12 - i13;
            int i14 = this.A0T;
            int i15 = iArr[1];
            this.A0T = i14 - i15;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i13, i15);
            }
            int[] iArr2 = this.A15;
            int i16 = iArr2[0];
            int[] iArr3 = this.A17;
            int i17 = i16 + iArr3[0];
            String[] strArr = A19;
            if (strArr[6].charAt(17) != strArr[4].charAt(17)) {
                throw new RuntimeException();
            }
            A19[1] = "TzjapWGLjdNwrlMHhQTvw0KTjubTnl9R";
            iArr2[0] = i17;
            iArr2[1] = iArr2[1] + iArr3[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C05752v.A00(motionEvent, 8194)) {
                float x10 = motionEvent.getX();
                float f10 = unconsumedY;
                float y10 = motionEvent.getY();
                float f11 = consumedX;
                if (A19[1].length() != 32) {
                    throw new RuntimeException();
                }
                A19[1] = "Rb7Wd2rB1Bk4FJnk1H23iqiZozoKDKpI";
                A0j(x10, f10, y10, f11);
            }
            A1a(i10, i11);
        }
        if (iA1h != 0 || unconsumedX != 0) {
            A1c(iA1h, unconsumedX);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (iA1h == 0 && unconsumedX == 0) ? false : true;
    }

    private boolean A14(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.A0h != null) {
            if (action == 0) {
                this.A0h = null;
            } else {
                if (action == 3 || action == 1) {
                    this.A0h = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int i10 = this.A13.size();
            for (int i11 = 0; i11 < i10; i11++) {
                InterfaceC06094e interfaceC06094e = this.A13.get(i11);
                if (interfaceC06094e.onInterceptTouchEvent(this, motionEvent)) {
                    this.A0h = interfaceC06094e;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private boolean A15(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.A0h = null;
        }
        int i10 = this.A13.size();
        for (int listenerCount = 0; listenerCount < i10; listenerCount++) {
            InterfaceC06094e interfaceC06094e = this.A13.get(listenerCount);
            if (interfaceC06094e.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.A0h = interfaceC06094e;
                return true;
            }
        }
        return false;
    }

    private boolean A16(View view, View view2, int i10) {
        int absHorizontal;
        if (view2 == null || view2 == this) {
            return false;
        }
        if (view == null) {
            return true;
        }
        if (i10 == 2 || i10 == 1) {
            boolean z10 = this.A06.A0a() == 1;
            boolean rtl = i10 == 2;
            if (rtl ^ z10) {
                absHorizontal = 66;
            } else {
                absHorizontal = 17;
            }
            if (A17(view, view2, absHorizontal)) {
                return true;
            }
            if (i10 == 2) {
                return A17(view, view2, 130);
            }
            return A17(view, view2, 33);
        }
        return A17(view, view2, i10);
    }

    private boolean A17(View view, View view2, int i10) {
        this.A0p.set(0, 0, view.getWidth(), view.getHeight());
        this.A0z.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.A0p);
        offsetDescendantRectToMyCoords(view2, this.A0z);
        switch (i10) {
            case 17:
                return (this.A0p.right > this.A0z.right || this.A0p.left >= this.A0z.right) && this.A0p.left > this.A0z.left;
            case 33:
                return (this.A0p.bottom > this.A0z.bottom || this.A0p.top >= this.A0z.bottom) && this.A0p.top > this.A0z.top;
            case 66:
                int i11 = this.A0p.left;
                String[] strArr = A19;
                if (strArr[2].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A19;
                strArr2[3] = "H3chOpt4vkJfacRirYduge";
                strArr2[0] = "3wUmDedSMI";
                return (i11 < this.A0z.left || this.A0p.right <= this.A0z.left) && this.A0p.right < this.A0z.right;
            case 130:
                return (this.A0p.top < this.A0z.top || this.A0p.bottom <= this.A0z.top) && this.A0p.bottom < this.A0z.bottom;
            default:
                throw new IllegalArgumentException(A0I(1844, 37, 102) + i10 + A1I());
        }
    }

    private final boolean A18(AccessibilityEvent accessibilityEvent) {
        if (A1v()) {
            int iA00 = 0;
            if (accessibilityEvent != null) {
                iA00 = C3Y.A00(accessibilityEvent);
            }
            if (iA00 == 0) {
                iA00 = 0;
            }
            int type = this.A0P;
            this.A0P = type | iA00;
            return true;
        }
        return false;
    }

    public final int A1B(View view) {
        AbstractC06224s holder = A0F(view);
        if (holder != null) {
            return holder.A0I();
        }
        return -1;
    }

    public final int A1C(AbstractC06224s abstractC06224s) {
        if (!abstractC06224s.A0k(524) && abstractC06224s.A0a()) {
            return this.A00.A0E(abstractC06224s.A03);
        }
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[2] = "S0wUd1";
        strArr[7] = "zF1SY7WsjbFG";
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r3 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Rect A1D(android.view.View r9) {
        /*
            r8 = this;
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            com.facebook.ads.redexgen.X.4b r6 = (com.facebook.ads.redexgen.X.C06064b) r6
            boolean r0 = r6.A01
            if (r0 != 0) goto Ld
            android.graphics.Rect r0 = r6.A03
            return r0
        Ld:
            com.facebook.ads.redexgen.X.4p r0 = r8.A0s
            boolean r0 = r0.A07()
            if (r0 == 0) goto L44
            boolean r0 = r6.A01()
            if (r0 != 0) goto L41
            boolean r3 = r6.A03()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.EB.A19
            r0 = 5
            r1 = r1[r0]
            r0 = 2
            char r1 = r1.charAt(r0)
            r0 = 89
            if (r1 == r0) goto L33
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L33:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.EB.A19
            java.lang.String r1 = "R8RZJpxNRYJLmE7KdaIYiTLeL7r3Y7bS"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "BRrnvNJfpVwihHaR5a5gEdBxu0vp26qH"
            r0 = 4
            r2[r0] = r1
            if (r3 == 0) goto L44
        L41:
            android.graphics.Rect r0 = r6.A03
            return r0
        L44:
            android.graphics.Rect r5 = r6.A03
            r4 = 0
            r5.set(r4, r4, r4, r4)
            java.util.ArrayList<com.facebook.ads.redexgen.X.4X> r0 = r8.A0v
            int r3 = r0.size()
            r2 = 0
        L51:
            if (r2 >= r3) goto L8e
            android.graphics.Rect r0 = r8.A0p
            r0.set(r4, r4, r4, r4)
            java.util.ArrayList<com.facebook.ads.redexgen.X.4X> r0 = r8.A0v
            java.lang.Object r7 = r0.get(r2)
            com.facebook.ads.redexgen.X.4X r7 = (com.facebook.ads.redexgen.X.C4X) r7
            android.graphics.Rect r1 = r8.A0p
            com.facebook.ads.redexgen.X.4p r0 = r8.A0s
            r7.A01(r1, r9, r8, r0)
            int r1 = r5.left
            android.graphics.Rect r0 = r8.A0p
            int r0 = r0.left
            int r1 = r1 + r0
            r5.left = r1
            int r1 = r5.top
            android.graphics.Rect r0 = r8.A0p
            int r0 = r0.top
            int r1 = r1 + r0
            r5.top = r1
            int r1 = r5.right
            android.graphics.Rect r0 = r8.A0p
            int r0 = r0.right
            int r1 = r1 + r0
            r5.right = r1
            int r1 = r5.bottom
            android.graphics.Rect r0 = r8.A0p
            int r0 = r0.bottom
            int r1 = r1 + r0
            r5.bottom = r1
            int r2 = r2 + 1
            goto L51
        L8e:
            r6.A01 = r4
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.EB.A1D(android.view.View):android.graphics.Rect");
    }

    public final View A1E(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final AbstractC06224s A1F(int i10) {
        if (this.A0C) {
            return null;
        }
        int iA06 = this.A01.A06();
        AbstractC06224s hidden = null;
        for (int i11 = 0; i11 < iA06; i11++) {
            AbstractC06224s abstractC06224sA0F = A0F(this.A01.A0A(i11));
            if (abstractC06224sA0F != null && !abstractC06224sA0F.A0c()) {
                int childCount = A1C(abstractC06224sA0F);
                if (childCount != i10) {
                    continue;
                } else if (this.A01.A0K(abstractC06224sA0F.A0H)) {
                    hidden = abstractC06224sA0F;
                } else {
                    return abstractC06224sA0F;
                }
            }
        }
        return hidden;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[SYNTHETIC] */
    public final AbstractC06224s A1G(int i10, boolean z10) {
        C06033y c06033y;
        View view;
        int iCharAt;
        int childCount;
        int iA06 = this.A01.A06();
        AbstractC06224s hidden = null;
        for (int i11 = 0; i11 < iA06; i11++) {
            AbstractC06224s abstractC06224sA0F = A0F(this.A01.A0A(i11));
            if (abstractC06224sA0F != null && !abstractC06224sA0F.A0c()) {
                if (z10) {
                    int childCount2 = abstractC06224sA0F.A03;
                    if (childCount2 != i10) {
                        continue;
                    } else {
                        c06033y = this.A01;
                        view = abstractC06224sA0F.A0H;
                        String[] strArr = A19;
                        String str = strArr[6];
                        String str2 = strArr[4];
                        iCharAt = str.charAt(17);
                        childCount = str2.charAt(17);
                        if (iCharAt != childCount) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A19;
                        strArr2[6] = "j0pgcyCAMmCuelBFBaEKhw82BLWYdvOX";
                        strArr2[4] = "bxiKg4TrHtXBSvyNTaSo7IOhyUGlGIW4";
                        if (c06033y.A0K(view)) {
                            hidden = abstractC06224sA0F;
                        } else {
                            return abstractC06224sA0F;
                        }
                    }
                } else {
                    int childCount3 = abstractC06224sA0F.A0I();
                    if (childCount3 != i10) {
                        continue;
                    } else {
                        c06033y = this.A01;
                        view = abstractC06224sA0F.A0H;
                        String[] strArr3 = A19;
                        String str3 = strArr3[6];
                        String str4 = strArr3[4];
                        iCharAt = str3.charAt(17);
                        childCount = str4.charAt(17);
                        if (iCharAt != childCount) {
                            throw new RuntimeException();
                        }
                        String[] strArr4 = A19;
                        strArr4[6] = "j0pgcyCAMmCuelBFBaEKhw82BLWYdvOX";
                        strArr4[4] = "bxiKg4TrHtXBSvyNTaSo7IOhyUGlGIW4";
                        if (c06033y.A0K(view)) {
                            hidden = abstractC06224sA0F;
                        } else {
                            return abstractC06224sA0F;
                        }
                    }
                }
            }
        }
        return hidden;
    }

    public final AbstractC06224s A1H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return A0F(view);
        }
        throw new IllegalArgumentException(A0I(1826, 5, 56) + view + A0I(98, 26, 127) + this);
    }

    public final String A1I() {
        return A0I(0, 1, 65) + super.toString() + A0I(169, 10, 82) + this.A04 + A0I(189, 9, 71) + this.A06 + A0I(179, 10, 10) + getContext();
    }

    public final void A1J() {
        boolean z10 = this.A0D;
        String strA0I = A0I(1313, 17, 94);
        if (!z10 || this.A0C) {
            C05572c.A01(strA0I);
            A0Y();
            C05572c.A00();
            return;
        }
        if (!this.A00.A0J()) {
            return;
        }
        if (this.A00.A0L(4)) {
            boolean zA0L = this.A00.A0L(11);
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[6] = "e84NaKOnn7I9zpRn8aasqpcOMtbsg9mo";
            strArr[4] = "iuEMZhfSQYSf3gJ7Ya7A7FZe771rQXKi";
            if (!zA0L) {
                C05572c.A01(A0I(1341, 20, 82));
                A1K();
                A1L();
                this.A00.A0H();
                if (!this.A0J) {
                    if (A0y()) {
                        A0Y();
                    } else {
                        this.A00.A0F();
                    }
                }
                A1s(true);
                A1M();
                C05572c.A00();
                return;
            }
        }
        if (this.A00.A0J()) {
            C05572c.A01(strA0I);
            A0Y();
            C05572c.A00();
        }
    }

    public final void A1K() {
        int i10 = this.A0O + 1;
        this.A0O = i10;
        if (i10 == 1 && !this.A0I) {
            this.A0J = false;
        }
    }

    public final void A1L() {
        this.A0U++;
    }

    public final void A1M() {
        A1r(true);
    }

    public final void A1N() {
        if (!this.A0K && this.A0F) {
            C3F.A0D(this, this.A0k);
            this.A0K = true;
        }
    }

    public final void A1O() {
        C4W c4w = this.A05;
        if (c4w != null) {
            c4w.A0I();
        }
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a != null) {
            abstractC06054a.A1I(this.A0r);
            this.A06.A1G(this.A0r);
        }
        this.A0r.A0P();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x005f A[SYNTHETIC] */
    public final void A1P() {
        int width;
        int i10;
        int count;
        int iA05 = this.A01.A05();
        for (int i11 = 0; i11 < iA05; i11++) {
            View view = this.A01.A09(i11);
            AbstractC06224s abstractC06224sA1H = A1H(view);
            if (abstractC06224sA1H != null && abstractC06224sA1H.A07 != null) {
                View view2 = abstractC06224sA1H.A07.A0H;
                int left = view.getLeft();
                int top = view.getTop();
                int count2 = view2.getLeft();
                if (left == count2) {
                    int count3 = view2.getTop();
                    if (top != count3) {
                        width = view2.getWidth();
                        String[] strArr = A19;
                        String str = strArr[2];
                        String str2 = strArr[7];
                        i10 = str.length();
                        count = str2.length();
                        if (i10 != count) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A19;
                        strArr2[3] = "Uubm7UlJXcXPQblsDCbwus";
                        strArr2[0] = "kvvVMTFBun";
                        int count4 = view2.getHeight();
                        view2.layout(left, top, width + left, count4 + top);
                    } else {
                        continue;
                    }
                } else {
                    width = view2.getWidth();
                    String[] strArr3 = A19;
                    String str3 = strArr3[2];
                    String str4 = strArr3[7];
                    i10 = str3.length();
                    count = str4.length();
                    if (i10 != count) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A19;
                    strArr4[3] = "Uubm7UlJXcXPQblsDCbwus";
                    strArr4[0] = "kvvVMTFBun";
                    int count5 = view2.getHeight();
                    view2.layout(left, top, width + left, count5 + top);
                }
            }
        }
    }

    public final void A1Q() {
        this.A0C = true;
        A0h();
    }

    public final void A1R() {
        List<AbstractC06104f> list = this.A0m;
        if (list != null) {
            list.clear();
        }
    }

    public final void A1S() {
        setScrollState(0);
        A0V();
    }

    public final void A1T(int i10) {
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a == null) {
            return;
        }
        abstractC06054a.A1t(i10);
        awakenScrollBars();
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[2] = "0QEBPr";
        strArr[7] = "MYIDRbA0xlXg";
    }

    public final void A1U(int i10) {
        int iA05 = this.A01.A05();
        for (int i11 = 0; i11 < iA05; i11++) {
            this.A01.A09(i11).offsetLeftAndRight(i10);
        }
    }

    public final void A1V(int i10) {
        int iA05 = this.A01.A05();
        for (int i11 = 0; i11 < iA05; i11++) {
            this.A01.A09(i11).offsetTopAndBottom(i10);
        }
    }

    public final void A1W(int i10) {
        if (this.A0I) {
            return;
        }
        A1S();
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a == null) {
            String strA0I = A0I(1370, 12, 79);
            String[] strArr = A19;
            if (strArr[6].charAt(17) != strArr[4].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[6] = "bKq2dxkRCeugdKx9Xa6GvrcP2g1fh08B";
            strArr2[4] = "kU2aPHyT0THRQATybaGwdbwAtHBBu9qc";
            Log.e(strA0I, A0I(740, 94, 69));
            return;
        }
        abstractC06054a.A1t(i10);
        awakenScrollBars();
    }

    public final void A1X(int i10) {
        if (this.A0I) {
            return;
        }
        AbstractC06054a abstractC06054a = this.A06;
        String[] strArr = A19;
        if (strArr[3].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[6] = "WdHf0lV4QkHUB6jMNa4hJVyYAF4qnaeC";
        strArr2[4] = "5gGhKJie0DBDDFfkhapEv4fZOrT4upMj";
        if (abstractC06054a != null) {
            abstractC06054a.A21(this, this.A0s, i10);
            return;
        }
        String[] strArr3 = A19;
        if (strArr3[6].charAt(17) != strArr3[4].charAt(17)) {
            String[] strArr4 = A19;
            strArr4[6] = "tnW8WJDd0hyAXA7zkanproBVQy0r1bMC";
            strArr4[4] = "4Fp0w8uFB0Hn5lDXLaIQvmhL07bdVyXH";
            Log.e(A0I(1370, 10, 13), A0I(858, 46, 16));
            return;
        }
        String[] strArr5 = A19;
        strArr5[3] = "z3A7CLBHtBtrAEYqxn9jPo";
        strArr5[0] = "loKczzo2gT";
        Log.e(A0I(1370, 12, 79), A0I(924, 97, 75));
    }

    public final void A1Y(int i10) {
        getScrollingChildHelper().A03(i10);
    }

    public final void A1Z(int i10, int i11) {
        if (i10 < 0) {
            A0b();
            this.A0a.onAbsorb(-i10);
        } else if (i10 > 0) {
            A0c();
            this.A0b.onAbsorb(i10);
        }
        if (i11 < 0) {
            A0d();
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            A19[1] = "gyhAwDIMjNJoK3bJ2ki6wxmL7XFPannX";
            this.A0c.onAbsorb(-i11);
        } else if (i11 > 0) {
            A0a();
            this.A0Z.onAbsorb(i11);
        }
        if (i10 != 0 || i11 != 0) {
            C3F.A07(this);
        }
    }

    public final void A1a(int i10, int i11) {
        boolean zIsFinished = false;
        EdgeEffect edgeEffect = this.A0a;
        if (edgeEffect != null) {
            boolean needsInvalidate = edgeEffect.isFinished();
            if (!needsInvalidate && i10 > 0) {
                this.A0a.onRelease();
                zIsFinished = this.A0a.isFinished();
            }
        }
        EdgeEffect edgeEffect2 = this.A0b;
        if (edgeEffect2 != null) {
            boolean needsInvalidate2 = edgeEffect2.isFinished();
            if (!needsInvalidate2 && i10 < 0) {
                this.A0b.onRelease();
                boolean needsInvalidate3 = this.A0b.isFinished();
                zIsFinished |= needsInvalidate3;
            }
        }
        EdgeEffect edgeEffect3 = this.A0c;
        if (edgeEffect3 != null) {
            boolean needsInvalidate4 = edgeEffect3.isFinished();
            if (!needsInvalidate4 && i11 > 0) {
                EdgeEffect edgeEffect4 = this.A0c;
                if (A19[1].length() != 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A19;
                strArr[3] = "CkvbraPTkuNHVjG6c5toq1";
                strArr[0] = "anwNoWvWLV";
                edgeEffect4.onRelease();
                boolean needsInvalidate5 = this.A0c.isFinished();
                zIsFinished |= needsInvalidate5;
            }
        }
        EdgeEffect edgeEffect5 = this.A0Z;
        if (edgeEffect5 != null) {
            boolean needsInvalidate6 = edgeEffect5.isFinished();
            if (!needsInvalidate6 && i11 < 0) {
                this.A0Z.onRelease();
                boolean needsInvalidate7 = this.A0Z.isFinished();
                zIsFinished |= needsInvalidate7;
            }
        }
        if (zIsFinished) {
            C3F.A07(this);
        }
    }

    public final void A1b(int i10, int i11) {
        int iA00 = AbstractC06054a.A00(i10, getPaddingLeft() + getPaddingRight(), C3F.A03(this));
        int paddingTop = getPaddingTop();
        int width = getPaddingBottom();
        int i12 = paddingTop + width;
        int width2 = C3F.A02(this);
        setMeasuredDimension(iA00, AbstractC06054a.A00(i11, i12, width2));
    }

    public final void A1c(int i10, int i11) {
        this.A0N++;
        int scrollY = getScrollX();
        int scrollX = getScrollY();
        onScrollChanged(scrollY, scrollX, scrollY, scrollX);
        AbstractC06104f abstractC06104f = this.A0i;
        if (abstractC06104f != null) {
            abstractC06104f.A0M(this, i10, i11);
        }
        List<AbstractC06104f> list = this.A0m;
        if (list != null) {
            for (int scrollY2 = list.size() - 1; scrollY2 >= 0; scrollY2--) {
                this.A0m.get(scrollY2).A0M(this, i10, i11);
            }
        }
        this.A0N--;
    }

    public final void A1d(int i10, int i11) {
        int iA06 = this.A01.A06();
        for (int i12 = 0; i12 < iA06; i12++) {
            AbstractC06224s abstractC06224sA0F = A0F(this.A01.A0A(i12));
            if (abstractC06224sA0F != null && !abstractC06224sA0F.A0h()) {
                int i13 = abstractC06224sA0F.A03;
                int i14 = A19[5].charAt(2);
                if (i14 != 89) {
                    throw new RuntimeException();
                }
                A19[1] = "WfIl2QLxhpsV1cZ5bwDa0wyCBTSIuEWm";
                if (i13 >= i10) {
                    abstractC06224sA0F.A0W(i11, false);
                    this.A0s.A0D = true;
                }
            }
        }
        this.A0r.A0R(i10, i11);
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    public final void A1e(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int iA06 = this.A01.A06();
        if (i10 < i11) {
            i12 = i10;
            i13 = i11;
            i14 = -1;
        } else {
            i12 = i11;
            i13 = i10;
            i14 = 1;
        }
        for (int inBetweenOffset = 0; inBetweenOffset < iA06; inBetweenOffset++) {
            AbstractC06224s abstractC06224sA0F = A0F(this.A01.A0A(inBetweenOffset));
            int start = A19[5].charAt(2);
            if (start != 89) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[2] = "SA2Eyd";
            strArr[7] = "XMtlHmP9rGs3";
            if (abstractC06224sA0F != null) {
                int childCount = abstractC06224sA0F.A03;
                if (childCount >= i12) {
                    int childCount2 = abstractC06224sA0F.A03;
                    if (childCount2 <= i13) {
                        int i15 = abstractC06224sA0F.A03;
                        String[] strArr2 = A19;
                        String str = strArr2[6];
                        String str2 = strArr2[4];
                        int start2 = str.charAt(17);
                        int childCount3 = str2.charAt(17);
                        if (start2 == childCount3) {
                            String[] strArr3 = A19;
                            strArr3[6] = "BcaezuMb6aDfAWKozakh45MfYrs0kuIc";
                            strArr3[4] = "5erwLY6dW1OUzDMynaZgWLcHWlHtC3ze";
                            if (i15 == i10) {
                                int childCount4 = i11 - i10;
                                abstractC06224sA0F.A0W(childCount4, false);
                            } else {
                                abstractC06224sA0F.A0W(i14, false);
                            }
                        } else if (i15 == i10) {
                            int childCount5 = i11 - i10;
                            abstractC06224sA0F.A0W(childCount5, false);
                        } else {
                            abstractC06224sA0F.A0W(i14, false);
                        }
                        this.A0s.A0D = true;
                    }
                }
            }
        }
        this.A0r.A0S(i10, i11);
        requestLayout();
    }

    public final void A1f(int i10, int i11) {
        A0l(i10, i11, null);
    }

    public final void A1g(int i10, int i11, Object obj) {
        int iA06 = this.A01.A06();
        int i12 = i10 + i11;
        for (int i13 = 0; i13 < iA06; i13++) {
            View viewA0A = this.A01.A0A(i13);
            AbstractC06224s abstractC06224sA0F = A0F(viewA0A);
            if (abstractC06224sA0F != null && !abstractC06224sA0F.A0h()) {
                int i14 = abstractC06224sA0F.A03;
                int positionEnd = A19[1].length();
                if (positionEnd != 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A19;
                strArr[2] = "87XYbE";
                strArr[7] = "GV1T0vfadOcw";
                if (i14 >= i10) {
                    int childCount = abstractC06224sA0F.A03;
                    if (childCount < i12) {
                        abstractC06224sA0F.A0T(2);
                        abstractC06224sA0F.A0Y(obj);
                        ((C06064b) viewA0A.getLayoutParams()).A01 = true;
                    }
                }
            }
        }
        this.A0r.A0T(i10, i11);
    }

    public final void A1h(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iA06 = this.A01.A06();
        for (int i13 = 0; i13 < iA06; i13++) {
            AbstractC06224s abstractC06224sA0F = A0F(this.A01.A0A(i13));
            if (abstractC06224sA0F != null && !abstractC06224sA0F.A0h()) {
                int positionEnd = abstractC06224sA0F.A03;
                if (positionEnd >= i12) {
                    int positionEnd2 = -i11;
                    abstractC06224sA0F.A0W(positionEnd2, z10);
                    this.A0s.A0D = true;
                } else {
                    int positionEnd3 = abstractC06224sA0F.A03;
                    if (positionEnd3 >= i10) {
                        int childCount = i10 - 1;
                        int positionEnd4 = -i11;
                        abstractC06224sA0F.A0V(childCount, positionEnd4, z10);
                        int childCount2 = A19[1].length();
                        if (childCount2 != 32) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A19;
                        strArr[2] = "dcjb0S";
                        strArr[7] = "CcIDXd599Ygw";
                        this.A0s.A0D = true;
                    } else {
                        continue;
                    }
                }
            }
        }
        this.A0r.A0U(i10, i11, z10);
        requestLayout();
    }

    public final void A1i(View view) {
        int cnt;
        A0F(view);
        C4O c4o = this.A04;
        List<RecyclerView.OnChildAttachStateChangeListener> list = this.A0l;
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        A19[5] = "qDYnzfveQxKkK3O0opuqDthRtcgsED9a";
        if (list != null && (cnt = list.size() - 1) >= 0) {
            this.A0l.get(cnt);
            throw new NullPointerException(A0I(1881, 27, 18));
        }
    }

    public final void A1j(View view) {
        int cnt;
        A0F(view);
        C4O c4o = this.A04;
        List<RecyclerView.OnChildAttachStateChangeListener> list = this.A0l;
        if (list != null && (cnt = list.size() - 1) >= 0) {
            this.A0l.get(cnt);
            throw new NullPointerException(A0I(1908, 29, 20));
        }
    }

    public final void A1k(AbstractC06104f abstractC06104f) {
        if (this.A0m == null) {
            this.A0m = new ArrayList();
        }
        this.A0m.add(abstractC06104f);
    }

    public final void A1l(AbstractC06104f abstractC06104f) {
        List<AbstractC06104f> list = this.A0m;
        if (list != null) {
            list.remove(abstractC06104f);
        }
    }

    public final void A1m(C06194p c06194p) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.A08.A01;
            c06194p.A06 = overScroller.getFinalX() - overScroller.getCurrX();
            c06194p.A07 = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            c06194p.A06 = 0;
            c06194p.A07 = 0;
        }
    }

    public final void A1n(AbstractC06224s abstractC06224s, C4V c4v) {
        abstractC06224s.A0U(0, 8192);
        if (this.A0s.A0E && abstractC06224s.A0f() && !abstractC06224s.A0c() && !abstractC06224s.A0h()) {
            this.A0t.A08(A0C(abstractC06224s), abstractC06224s);
        }
        this.A0t.A0F(abstractC06224s, c4v);
    }

    public final void A1o(AbstractC06224s abstractC06224s, C4V c4v, C4V c4v2) {
        abstractC06224s.A0Z(false);
        if (this.A05.A0E(abstractC06224s, c4v, c4v2)) {
            A1N();
        }
    }

    public final void A1p(AbstractC06224s abstractC06224s, C4V c4v, C4V c4v2) {
        A0r(abstractC06224s);
        abstractC06224s.A0Z(false);
        if (this.A05.A0F(abstractC06224s, c4v, c4v2)) {
            A1N();
        }
    }

    public final void A1q(String str) {
        if (A1v()) {
            if (str == null) {
                throw new IllegalStateException(A0I(574, 77, 49) + A1I());
            }
            throw new IllegalStateException(str);
        }
        if (this.A0N > 0) {
            Log.w(A0I(1370, 12, 79), A0I(294, 280, 24), new IllegalStateException(A0I(0, 0, 62) + A1I()));
        }
    }

    public final void A1r(boolean z10) {
        int i10 = this.A0U - 1;
        this.A0U = i10;
        if (i10 < 1) {
            this.A0U = 0;
            if (z10) {
                A0K();
                if (A19[1].length() != 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A19;
                strArr[6] = "clcdgLago0QzUCUQna9RqUvMnx3zufId";
                strArr[4] = "dGTmnJIudyc2xKqsUaVYnInX4VXDIHXZ";
                A0Z();
            }
        }
    }

    public final void A1s(boolean z10) {
        if (this.A0O < 1) {
            this.A0O = 1;
        }
        if (!z10) {
            this.A0J = false;
        }
        if (this.A0O == 1) {
            if (z10 && this.A0J && !this.A0I && this.A06 != null && this.A04 != null) {
                A0Y();
            }
            if (!this.A0I) {
                this.A0J = false;
            }
        }
        this.A0O--;
    }

    public final boolean A1t() {
        AccessibilityManager accessibilityManager = this.A10;
        if (accessibilityManager != null) {
            boolean zIsEnabled = accessibilityManager.isEnabled();
            String[] strArr = A19;
            if (strArr[6].charAt(17) != strArr[4].charAt(17)) {
                throw new RuntimeException();
            }
            A19[5] = "qqYNnQooq1iBe19qNxONRBmcR9jcXf5d";
            if (zIsEnabled) {
                return true;
            }
        }
        return false;
    }

    public final boolean A1u() {
        return !this.A0D || this.A0C || this.A00.A0J();
    }

    public final boolean A1v() {
        return this.A0U > 0;
    }

    public final boolean A1w(int i10) {
        return getScrollingChildHelper().A09(i10);
    }

    public final boolean A1x(int i10, int i11) {
        return getScrollingChildHelper().A0B(i10, i11);
    }

    public final boolean A1y(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().A0D(i10, i11, i12, i13, iArr, i14);
    }

    public final boolean A1z(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().A0F(i10, i11, iArr, iArr2, i12);
    }

    public final boolean A20(View view) {
        A1K();
        boolean zA0L = this.A01.A0L(view);
        if (zA0L) {
            AbstractC06224s viewHolder = A0F(view);
            this.A0r.A0c(viewHolder);
            this.A0r.A0b(viewHolder);
        }
        boolean removed = !zA0L;
        A1s(removed);
        if (A19[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[3] = "2BT72D7B0XXfHPWJs3DbS8";
        strArr[0] = "RgGvPpmRJD";
        return zA0L;
    }

    public final boolean A21(AbstractC06224s abstractC06224s) {
        C4W c4w = this.A05;
        return c4w == null || c4w.A0M(abstractC06224s, abstractC06224s.A0L());
    }

    public final boolean A22(AbstractC06224s abstractC06224s, int i10) {
        if (A1v()) {
            abstractC06224s.A02 = i10;
            this.A0w.add(abstractC06224s);
            return false;
        }
        C3F.A09(abstractC06224s.A0H, i10);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a != null) {
            boolean zA1g = abstractC06054a.A1g(this, arrayList, i10, i11);
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[2] = "qzNrCd";
            strArr[7] = "bMAkXN6Kp1Dd";
            if (zA1g) {
                return;
            }
        }
        super.addFocusables(arrayList, i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C06064b) && this.A06.A1c((C06064b) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a != null && abstractC06054a.A24()) {
            return this.A06.A1j(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a != null && abstractC06054a.A24()) {
            return this.A06.A1k(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a == null) {
            return 0;
        }
        boolean zA24 = abstractC06054a.A24();
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        A19[1] = "GzwOa56ahdwGOmec9vc3XIggLcxaXOnz";
        if (zA24) {
            return this.A06.A1l(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a == null) {
            return 0;
        }
        boolean zA25 = abstractC06054a.A25();
        String[] strArr = A19;
        if (strArr[3].length() != strArr[0].length()) {
            String[] strArr2 = A19;
            strArr2[2] = "Wsbuah";
            strArr2[7] = "lDl9g1VSjrmk";
            if (!zA25) {
                return 0;
            }
            AbstractC06054a abstractC06054a2 = this.A06;
            String[] strArr3 = A19;
            if (strArr3[3].length() != strArr3[0].length()) {
                A19[5] = "sfYwg45p3roym5legx720iFNlg07mmUN";
                return abstractC06054a2.A1m(this.A0s);
            }
        }
        throw new RuntimeException();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a != null && abstractC06054a.A25()) {
            return this.A06.A1n(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a == null || !abstractC06054a.A25()) {
            return 0;
        }
        AbstractC06054a abstractC06054a2 = this.A06;
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[6] = "NPPquBudgt65Kfhzva46C14iIBYgw5ng";
        strArr[4] = "gzaMlk0wrsXS1BjbnaI8sjsGlzE0u55w";
        return abstractC06054a2.A1o(this.A0s);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().A08(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().A07(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().A0E(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().A0C(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        dispatchThawSelfOnly(container);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        dispatchFreezeSelfOnly(container);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0128  */
    /* JADX WARN: Code duplicated, block: B:76:0x014f  */
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int count;
        super.draw(canvas);
        int size = this.A0v.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A0v.get(i10);
        }
        int padding = 0;
        EdgeEffect edgeEffect = this.A0a;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int restore = canvas.save();
            int paddingBottom = this.A0B ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            int count2 = getHeight();
            canvas.translate((-count2) + paddingBottom, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            EdgeEffect edgeEffect2 = this.A0a;
            padding = (edgeEffect2 == null || !edgeEffect2.draw(canvas)) ? 0 : 1;
            canvas.restoreToCount(restore);
        }
        EdgeEffect edgeEffect3 = this.A0c;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int restore2 = canvas.save();
            if (this.A0B) {
                int count3 = getPaddingLeft();
                float f10 = count3;
                int count4 = getPaddingTop();
                canvas.translate(f10, count4);
            }
            EdgeEffect edgeEffect4 = this.A0c;
            int count5 = (edgeEffect4 == null || !edgeEffect4.draw(canvas)) ? 0 : 1;
            padding |= count5;
            canvas.restoreToCount(restore2);
        }
        EdgeEffect edgeEffect5 = this.A0b;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave = canvas.save();
            int restore3 = getWidth();
            int paddingTop = this.A0B ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            int count6 = -paddingTop;
            float f11 = count6;
            int count7 = -restore3;
            canvas.translate(f11, count7);
            EdgeEffect edgeEffect6 = this.A0b;
            if (edgeEffect6 != null) {
                boolean zDraw = edgeEffect6.draw(canvas);
                String[] strArr = A19;
                String str = strArr[2];
                String str2 = strArr[7];
                int length = str.length();
                int count8 = str2.length();
                if (length == count8) {
                    throw new RuntimeException();
                }
                A19[5] = "ItYbouux6ivob9pa5cwYanZ1Qwg84bbh";
                if (zDraw) {
                    count = 1;
                } else {
                    count = 0;
                }
            } else {
                count = 0;
            }
            padding |= count;
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect7 = this.A0Z;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave2 = canvas.save();
            canvas.rotate(180.0f);
            if (this.A0B) {
                int count9 = getWidth();
                int i11 = -count9;
                int count10 = getPaddingRight();
                float f12 = i11 + count10;
                int count11 = getHeight();
                int i12 = -count11;
                int count12 = getPaddingBottom();
                canvas.translate(f12, i12 + count12);
            } else {
                int count13 = getWidth();
                float f13 = -count13;
                int count14 = getHeight();
                canvas.translate(f13, -count14);
            }
            EdgeEffect edgeEffect8 = this.A0Z;
            padding |= (edgeEffect8 == null || !edgeEffect8.draw(canvas)) ? 0 : 1;
            canvas.restoreToCount(iSave2);
        }
        if (padding == 0 && this.A05 != null) {
            int count15 = this.A0v.size();
            if (count15 > 0) {
                C4W c4w = this.A05;
                if (A19[5].charAt(2) != 'Y') {
                    if (c4w.A0L()) {
                        padding = 1;
                    }
                } else {
                    A19[5] = "slYCg9imVkQI2IB5irC0agqTwBjTAdyw";
                    if (c4w.A0L()) {
                        padding = 1;
                    }
                }
            }
        }
        if (padding != 0) {
            C3F.A07(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i10) {
        boolean z10;
        View viewFindNextFocus;
        int i11;
        View result = this.A06.A0u(view, i10);
        if (result != null) {
            return result;
        }
        if (this.A04 != null) {
            AbstractC06054a abstractC06054a = this.A06;
            String[] strArr = A19;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[3] = "RhZxCClAx00iKsBYiNgalY";
            strArr2[0] = "xpwAZ9hAV8";
            if (abstractC06054a == null || A1v() || this.A0I) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z10 && (i10 == 2 || i10 == 1)) {
            int absDir = 0;
            if (this.A06.A25()) {
                int i12 = i10 == 2 ? 130 : 33;
                absDir = focusFinder.findNextFocus(this, view, i12) == null ? 1 : 0;
                if (A1F) {
                    i10 = i12;
                }
            }
            if (absDir == 0 && this.A06.A24()) {
                boolean canRunFocusFailure = this.A06.A0a() == 1;
                if ((i10 == 2) ^ canRunFocusFailure) {
                    i11 = 66;
                } else {
                    i11 = 17;
                }
                absDir = focusFinder.findNextFocus(this, view, i11) != null ? 0 : 1;
                if (A1F) {
                    i10 = i11;
                }
            }
            if (absDir != 0) {
                A1J();
                if (A1E(view) == null) {
                    return null;
                }
                A1K();
                this.A06.A1r(view, i10, this.A0r, this.A0s);
                A1s(false);
            }
            viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
        } else {
            viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z10) {
                A1J();
                if (A1E(view) == null) {
                    return null;
                }
                A1K();
                viewFindNextFocus = this.A06.A1r(view, i10, this.A0r, this.A0s);
                A1s(false);
            }
        }
        if (viewFindNextFocus == null || viewFindNextFocus.hasFocusable()) {
            return A16(view, viewFindNextFocus, i10) ? viewFindNextFocus : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        A0p(viewFindNextFocus, null);
        return view;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a != null) {
            return abstractC06054a.A1s();
        }
        throw new IllegalStateException(A0I(1475, 33, 17) + A1I());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a != null) {
            return abstractC06054a.A0v(getContext(), attributeSet);
        }
        throw new IllegalStateException(A0I(1475, 33, 17) + A1I());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a != null) {
            C06064b c06064bA0w = abstractC06054a.A0w(layoutParams);
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[3] = "4uZ9QAUZcjEo06EXHPHPN1";
            strArr[0] = "ePNmh1lbEA";
            return c06064bA0w;
        }
        throw new IllegalStateException(A0I(1475, 33, 17) + A1I());
    }

    public C4O getAdapter() {
        return this.A04;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a != null) {
            int iA0V = abstractC06054a.A0V();
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            A19[1] = "WUntfQVcja1qFzj09nDprclvV6sI7lKs";
            return iA0V;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        C4R c4r = this.A0e;
        if (c4r == null) {
            return super.getChildDrawingOrder(i10, i11);
        }
        return c4r.onGetChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.A0B;
    }

    public C1352Yl getCompatAccessibilityDelegate() {
        return this.A09;
    }

    public C4W getItemAnimator() {
        return this.A05;
    }

    public AbstractC06054a getLayoutManager() {
        return this.A06;
    }

    public int getMaxFlingVelocity() {
        return this.A0x;
    }

    public int getMinFlingVelocity() {
        return this.A0y;
    }

    public long getNanoTime() {
        if (A1E) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC06084d getOnFlingListener() {
        return this.A0g;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0o;
    }

    public C4h getRecycledViewPool() {
        return this.A0r.A0H();
    }

    public int getScrollState() {
        return this.A0W;
    }

    private C05772x getScrollingChildHelper() {
        if (this.A0d == null) {
            this.A0d = new C05772x(this);
        }
        return this.A0d;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().A05();
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.A0F;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().A06();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0U = 0;
        boolean z10 = true;
        this.A0F = true;
        if (!this.A0D || isLayoutRequested()) {
            z10 = false;
        }
        this.A0D = z10;
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a != null) {
            abstractC06054a.A1N(this);
        }
        this.A0K = false;
        if (A1E) {
            C4B c4b = C4B.A07.get();
            this.A03 = c4b;
            if (c4b == null) {
                this.A03 = new C4B();
                Display displayA04 = C3F.A04(this);
                float f10 = 60.0f;
                if (!isInEditMode() && displayA04 != null) {
                    float refreshRate = displayA04.getRefreshRate();
                    String[] strArr = A19;
                    if (strArr[2].length() == strArr[7].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A19;
                    strArr2[3] = "HPKMSTrO6rgllPECADdom7";
                    strArr2[0] = "yPSN9KqlOS";
                    if (refreshRate >= 30.0f) {
                        f10 = refreshRate;
                    }
                }
                this.A03.A00 = (long) (1.0E9f / f10);
                C4B.A07.set(this.A03);
            }
            this.A03.A09(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C4B c4b;
        super.onDetachedFromWindow();
        C4W c4w = this.A05;
        if (c4w != null) {
            c4w.A0I();
        }
        A1S();
        this.A0F = false;
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a != null) {
            abstractC06054a.A1U(this, this.A0r);
        }
        this.A0w.clear();
        removeCallbacks(this.A0k);
        this.A0t.A07();
        if (A1E && (c4b = this.A03) != null) {
            c4b.A0A(this);
            this.A03 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.A0v.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A0v.get(i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float vScroll;
        float axisValue;
        if (this.A06 == null) {
            return false;
        }
        boolean z10 = this.A0I;
        if (A19[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[2] = "hfCCVZ";
        strArr[7] = "6Rxn0wTGDCgs";
        if (!z10 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.A06.A25()) {
                    vScroll = -motionEvent.getAxisValue(9);
                } else {
                    vScroll = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                }
                if (this.A06.A24()) {
                    axisValue = motionEvent.getAxisValue(10);
                } else {
                    axisValue = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                }
            } else {
                int source = motionEvent.getSource();
                if (A19[5].charAt(2) == 'Y') {
                    A19[5] = "SrYzqcFycO4E61WX0CCI79FBiQDWLxq8";
                    if ((source & 4194304) != 0) {
                        axisValue = motionEvent.getAxisValue(26);
                        if (this.A06.A25()) {
                            vScroll = -axisValue;
                            axisValue = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                        } else if (this.A06.A24()) {
                            vScroll = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                        } else {
                            vScroll = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                            axisValue = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                        }
                    } else {
                        vScroll = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                        axisValue = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                    }
                } else if ((source & 4194304) != 0) {
                    axisValue = motionEvent.getAxisValue(26);
                    if (this.A06.A25()) {
                        vScroll = -axisValue;
                        axisValue = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                    } else if (this.A06.A24()) {
                        vScroll = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                    } else {
                        vScroll = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                        axisValue = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                    }
                } else {
                    vScroll = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                    axisValue = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                }
            }
            if (vScroll != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || axisValue != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                float hScroll = this.A0L;
                A13((int) (hScroll * axisValue), (int) (this.A0M * vScroll), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0148 A[PHI: r7
  0x0148: PHI (r7v2 'index' int) = (r7v1 'index' int), (r7v3 'index' int) binds: [B:59:0x017d, B:46:0x0146] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x016d  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int index;
        boolean z10;
        if (this.A0I) {
            return false;
        }
        if (A15(motionEvent)) {
            A0J();
            return true;
        }
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a == null) {
            return false;
        }
        boolean zA24 = abstractC06054a.A24();
        boolean zA25 = this.A06.A25();
        if (this.A0Y == null) {
            this.A0Y = VelocityTracker.obtain();
        }
        this.A0Y.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        String[] strArr = A19;
        if (strArr[2].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[3] = "Oz3Y31ex0QABqFtFM6aXix";
        strArr2[0] = "OpGO9pAa6R";
        switch (actionMasked) {
            case 0:
                boolean canScrollHorizontally = this.A0n;
                if (canScrollHorizontally) {
                    this.A0n = false;
                }
                this.A0V = motionEvent.getPointerId(0);
                int x10 = (int) (motionEvent.getX() + 0.5f);
                this.A0S = x10;
                this.A0Q = x10;
                int y10 = (int) (motionEvent.getY() + 0.5f);
                this.A0T = y10;
                this.A0R = y10;
                if (this.A0W == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                }
                int[] iArr = this.A15;
                iArr[1] = 0;
                iArr[0] = 0;
                int i10 = 0;
                if (zA24) {
                    i10 = 0 | 1;
                }
                if (zA25) {
                    i10 |= 2;
                }
                A1x(i10, 0);
                break;
            case 1:
                VelocityTracker velocityTracker = this.A0Y;
                String[] strArr3 = A19;
                if (strArr3[6].charAt(17) != strArr3[4].charAt(17)) {
                    String[] strArr4 = A19;
                    strArr4[3] = "RX1lNzZl9PHDMcdVrAJc1B";
                    strArr4[0] = "i2qb1YAFuc";
                    velocityTracker.clear();
                    A1Y(0);
                } else {
                    A19[1] = "VFVZbyoyfkMi6O34miIS2l4U7i7WEKsz";
                    velocityTracker.clear();
                    A1Y(0);
                }
                break;
            case 2:
                int iFindPointerIndex = motionEvent.findPointerIndex(this.A0V);
                if (iFindPointerIndex < 0) {
                    Log.e(A0I(1370, 12, 79), A0I(1063, 46, 50) + this.A0V + A0I(124, 45, 46));
                    return false;
                }
                int nestedScrollAxis = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                float y11 = motionEvent.getY(iFindPointerIndex);
                String[] strArr5 = A19;
                if (strArr5[2].length() != strArr5[7].length()) {
                    String[] strArr6 = A19;
                    strArr6[3] = "bk8L2DuoR6rlGazYt8IaCt";
                    strArr6[0] = "Sc1G85HZiT";
                    index = (int) (y11 + 0.5f);
                    if (this.A0W != 1) {
                        int i11 = nestedScrollAxis - this.A0Q;
                        int actionIndex2 = index - this.A0R;
                        z10 = false;
                        if (zA24 && Math.abs(i11) > this.A0X) {
                            this.A0S = nestedScrollAxis;
                            z10 = true;
                        }
                        if (zA25 && Math.abs(actionIndex2) > this.A0X) {
                            this.A0T = index;
                            z10 = true;
                        }
                        if (z10) {
                            setScrollState(1);
                        }
                    }
                } else {
                    A19[5] = "zyYUBzZDbxt5GKooJMB8Oo5URJ8cGTlk";
                    index = (int) (y11 + 0.5f);
                    if (this.A0W != 1) {
                        int i12 = nestedScrollAxis - this.A0Q;
                        int actionIndex3 = index - this.A0R;
                        z10 = false;
                        if (zA24) {
                            this.A0S = nestedScrollAxis;
                            z10 = true;
                        }
                        if (zA25) {
                            this.A0T = index;
                            z10 = true;
                        }
                        if (z10) {
                            setScrollState(1);
                        }
                    }
                }
                break;
                break;
            case 3:
                A0J();
                break;
            case 5:
                this.A0V = motionEvent.getPointerId(actionIndex);
                int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.A0S = x11;
                this.A0Q = x11;
                int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.A0T = y12;
                this.A0R = y12;
                break;
            case 6:
                A0n(motionEvent);
                break;
        }
        return this.A0W == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        C05572c.A01(A0I(1330, 11, 86));
        A0Y();
        C05572c.A00();
        this.A0D = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        if (r3 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c7, code lost:
    
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00df, code lost:
    
        if (r3 != false) goto L39;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.EB.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (A1v()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            classLoader = getContext().getClassLoader();
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (!(state instanceof RecyclerView$SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        RecyclerView$SavedState recyclerView$SavedState = (RecyclerView$SavedState) state;
        this.A0j = recyclerView$SavedState;
        super.onRestoreInstanceState(recyclerView$SavedState.A02());
        if (this.A06 != null && this.A0j.A00 != null) {
            this.A06.A1w(this.A0j.A00);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        RecyclerView$SavedState recyclerView$SavedState = new RecyclerView$SavedState(super.onSaveInstanceState());
        RecyclerView$SavedState state = this.A0j;
        if (state != null) {
            recyclerView$SavedState.A03(state);
        } else {
            AbstractC06054a abstractC06054a = this.A06;
            if (abstractC06054a != null) {
                recyclerView$SavedState.A00 = abstractC06054a.A1p();
            } else {
                recyclerView$SavedState.A00 = null;
            }
        }
        return new WrappedParcelable(recyclerView$SavedState);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            A0f();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f10;
        float f11;
        if (this.A0I || this.A0n) {
            return false;
        }
        boolean zA14 = A14(motionEvent);
        if (A19[5].charAt(2) == 'Y') {
            A19[5] = "8sYT0RnpvG2arPES2UJ12JYFoUL9IQDo";
            if (zA14) {
                A0J();
                return true;
            }
            AbstractC06054a abstractC06054a = this.A06;
            if (abstractC06054a == null) {
                return false;
            }
            boolean zA24 = abstractC06054a.A24();
            boolean eventAddedToVelocityTracker = this.A06.A25();
            if (this.A0Y == null) {
                this.A0Y = VelocityTracker.obtain();
            }
            boolean canScrollVertically = false;
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                int[] iArr = this.A15;
                iArr[1] = 0;
                String[] strArr = A19;
                if (strArr[2].length() != strArr[7].length()) {
                    A19[5] = "w9Y7A1oKaVmj8Ov6eZqRiF6tVMdmRve8";
                    iArr[0] = 0;
                } else {
                    String[] strArr2 = A19;
                    strArr2[6] = "DE62WFMw5Qbi4eBk1auhfUxeLGhnsE7e";
                    strArr2[4] = "A6rUAAhMCRWi1Exz9agrYLVLW1oNRabf";
                    iArr[0] = 0;
                }
            }
            int[] iArr2 = this.A15;
            motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
            switch (actionMasked) {
                case 0:
                    this.A0V = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.A0S = x10;
                    this.A0Q = x10;
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.A0T = y10;
                    this.A0R = y10;
                    int nestedScrollAxis = 0;
                    if (zA24) {
                        nestedScrollAxis = 0 | 1;
                    }
                    if (eventAddedToVelocityTracker) {
                        nestedScrollAxis |= 2;
                    }
                    A1x(nestedScrollAxis, 0);
                    if (!canScrollVertically) {
                        this.A0Y.addMovement(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    return true;
                case 1:
                    this.A0Y.addMovement(motionEventObtain);
                    canScrollVertically = true;
                    this.A0Y.computeCurrentVelocity(1000, this.A0x);
                    if (zA24) {
                        f10 = -this.A0Y.getXVelocity(this.A0V);
                    } else {
                        f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                    }
                    if (eventAddedToVelocityTracker) {
                        f11 = -this.A0Y.getYVelocity(this.A0V);
                    } else {
                        f11 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                    }
                    String[] strArr3 = A19;
                    if (strArr3[6].charAt(17) == strArr3[4].charAt(17)) {
                        A19[5] = "SfYw0o2VnAou7QhBgLkBGelaMPLfL2ni";
                        if ((f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f11 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) || !A12((int) f10, (int) f11)) {
                            setScrollState(0);
                        }
                        A0T();
                        if (!canScrollVertically) {
                            this.A0Y.addMovement(motionEventObtain);
                        }
                        motionEventObtain.recycle();
                        return true;
                    }
                    break;
                case 2:
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.A0V);
                    if (iFindPointerIndex < 0) {
                        Log.e(A0I(1370, 12, 79), A0I(1063, 46, 50) + this.A0V + A0I(124, 45, 46));
                        return false;
                    }
                    int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    int actionIndex2 = this.A0S - x11;
                    int dx = this.A0T - y11;
                    if (A1z(actionIndex2, dx, this.A16, this.A17, 0)) {
                        int[] iArr3 = this.A16;
                        actionIndex2 -= iArr3[0];
                        dx -= iArr3[1];
                        int[] iArr4 = this.A17;
                        motionEventObtain.offsetLocation(iArr4[0], iArr4[1]);
                        int[] iArr5 = this.A15;
                        int i10 = iArr5[0];
                        int[] iArr6 = this.A17;
                        iArr5[0] = i10 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                    }
                    int i11 = this.A0W;
                    String[] strArr4 = A19;
                    if (strArr4[3].length() != strArr4[0].length()) {
                        A19[1] = "vPk2qMMC5wpKDUMEcolEIRuedMAFiD5T";
                        if (i11 != 1) {
                            boolean z10 = false;
                            if (zA24) {
                                int iAbs = Math.abs(actionIndex2);
                                int dx2 = this.A0X;
                                if (iAbs > dx2) {
                                    if (actionIndex2 > 0) {
                                        actionIndex2 -= dx2;
                                    } else {
                                        actionIndex2 += dx2;
                                    }
                                    z10 = true;
                                }
                            }
                            if (eventAddedToVelocityTracker) {
                                int iAbs2 = Math.abs(dx);
                                int dx3 = this.A0X;
                                if (iAbs2 > dx3) {
                                    if (dx > 0) {
                                        dx -= dx3;
                                    } else {
                                        dx += dx3;
                                    }
                                    z10 = true;
                                }
                            }
                            if (z10) {
                                setScrollState(1);
                            }
                        }
                        if (this.A0W == 1) {
                            int[] iArr7 = this.A17;
                            this.A0S = x11 - iArr7[0];
                            this.A0T = y11 - iArr7[1];
                            if (A13(zA24 ? actionIndex2 : 0, eventAddedToVelocityTracker ? dx : 0, motionEventObtain)) {
                                ViewParent parent = getParent();
                                int dy = A19[5].charAt(2);
                                if (dy != 89) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                } else {
                                    String[] strArr5 = A19;
                                    strArr5[3] = "9Qb2BcK3cjm46xX51a5wS3";
                                    strArr5[0] = "GdK3mOIcF6";
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                            C4B c4b = this.A03;
                            if (c4b != null && (actionIndex2 != 0 || dx != 0)) {
                                c4b.A0B(this, actionIndex2, dx);
                            }
                        }
                        if (!canScrollVertically) {
                            this.A0Y.addMovement(motionEventObtain);
                        }
                        motionEventObtain.recycle();
                        return true;
                    }
                    throw new RuntimeException();
                case 3:
                    A0J();
                    if (!canScrollVertically) {
                        this.A0Y.addMovement(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    return true;
                case 4:
                default:
                    if (!canScrollVertically) {
                        this.A0Y.addMovement(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    return true;
                case 5:
                    this.A0V = motionEvent.getPointerId(actionIndex);
                    int dx4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.A0S = dx4;
                    this.A0Q = dx4;
                    int dx5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.A0T = dx5;
                    this.A0R = dx5;
                    if (!canScrollVertically) {
                        this.A0Y.addMovement(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    return true;
                case 6:
                    A0n(motionEvent);
                    if (!canScrollVertically) {
                        this.A0Y.addMovement(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    return true;
            }
        }
        throw new RuntimeException();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        AbstractC06224s abstractC06224sA0F = A0F(view);
        if (abstractC06224sA0F != null) {
            if (abstractC06224sA0F.A0e()) {
                abstractC06224sA0F.A0P();
            } else if (!abstractC06224sA0F.A0h()) {
                throw new IllegalArgumentException(A0I(219, 75, 37) + abstractC06224sA0F + A1I());
            }
        }
        view.clearAnimation();
        A1j(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.A06.A1f(this, this.A0s, view, view2) && view2 != null) {
            A0p(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.A06.A1d(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.A13.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A13.get(i10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.A0O == 0 && !this.A0I) {
            super.requestLayout();
        } else {
            this.A0J = true;
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        AbstractC06054a abstractC06054a = this.A06;
        if (abstractC06054a == null) {
            Log.e(A0I(1370, 12, 79), A0I(834, 90, 71));
            return;
        }
        if (this.A0I) {
            return;
        }
        boolean zA24 = abstractC06054a.A24();
        boolean canScrollHorizontal = this.A06.A25();
        if (zA24 || canScrollHorizontal) {
            if (!zA24) {
                i10 = 0;
            }
            A13(i10, canScrollHorizontal ? i11 : 0, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        Log.w(A0I(1370, 12, 79), A0I(1382, 93, 90));
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (A18(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C1352Yl c1352Yl) {
        this.A09 = c1352Yl;
        C3F.A0B(this, c1352Yl);
    }

    public void setAdapter(C4O c4o) {
        setLayoutFrozen(false);
        A0q(c4o, false, true);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C4R c4r) {
        if (c4r == this.A0e) {
            return;
        }
        this.A0e = c4r;
        setChildrenDrawingOrderEnabled(c4r != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.A0B) {
            A0f();
        }
        this.A0B = z10;
        super.setClipToPadding(z10);
        if (this.A0D) {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean z10) {
        this.A0E = z10;
    }

    public void setItemAnimator(C4W c4w) {
        C4W c4w2 = this.A05;
        if (c4w2 != null) {
            c4w2.A0I();
            this.A05.A0B(null);
        }
        this.A05 = c4w;
        if (c4w != null) {
            C4U c4u = this.A0f;
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[3] = "lbql160khUomfa8gG92Y7q";
            strArr[0] = "AtGY6u7EZb";
            c4w.A0B(c4u);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.A0r.A0Q(i10);
    }

    public void setLayoutFrozen(boolean z10) {
        if (z10 != this.A0I) {
            A1q(A0I(1021, 42, 85));
            if (!z10) {
                this.A0I = false;
                if (this.A0J && this.A06 != null && this.A04 != null) {
                    requestLayout();
                }
                this.A0J = false;
                return;
            }
            long now = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(now, now, 3, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0));
            this.A0I = true;
            this.A0n = true;
            A1S();
        }
    }

    public void setLayoutManager(AbstractC06054a abstractC06054a) {
        if (abstractC06054a == this.A06) {
            return;
        }
        A1S();
        if (this.A06 != null) {
            C4W c4w = this.A05;
            if (c4w != null) {
                c4w.A0I();
            }
            this.A06.A1I(this.A0r);
            this.A06.A1G(this.A0r);
            this.A0r.A0P();
            if (this.A0F) {
                this.A06.A1U(this, this.A0r);
            }
            this.A06.A1P(null);
            this.A06 = null;
        } else {
            this.A0r.A0P();
        }
        this.A01.A0B();
        this.A06 = abstractC06054a;
        if (abstractC06054a != null) {
            EB eb2 = abstractC06054a.A03;
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[6] = "5zwSvF43vthb6lIFeaOoDRJ244Dq07FI";
            strArr[4] = "COyIsU8he0MLuT7wFa9x9SZ5A7LzgdfA";
            if (eb2 == null) {
                this.A06.A1P(this);
                if (this.A0F) {
                    this.A06.A1N(this);
                }
            } else {
                throw new IllegalArgumentException(A0I(1109, 14, 88) + abstractC06054a + A0I(59, 39, 9) + abstractC06054a.A03.A1I());
            }
        }
        this.A0r.A0O();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().A04(z10);
    }

    public void setOnFlingListener(AbstractC06084d abstractC06084d) {
        this.A0g = abstractC06084d;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC06104f abstractC06104f) {
        this.A0i = abstractC06104f;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.A0o = z10;
    }

    public void setRecycledViewPool(C4h c4h) {
        this.A0r.A0Z(c4h);
    }

    public void setRecyclerListener(InterfaceC06134j interfaceC06134j) {
        this.A07 = interfaceC06134j;
    }

    public void setScrollState(int i10) {
        if (i10 == this.A0W) {
            return;
        }
        this.A0W = i10;
        if (i10 != 2) {
            A0V();
        }
        A0k(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i10) {
            case 0:
                break;
            case 1:
                this.A0X = viewConfiguration.getScaledPagingTouchSlop();
                return;
            default:
                Log.w(A0I(1370, 12, 79), A0I(1937, 47, 26) + i10 + A0I(198, 21, 121));
                break;
        }
        this.A0X = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC06204q abstractC06204q) {
        this.A0r.A0a(abstractC06204q);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().A0A(i10);
    }

    @Override // android.view.View, com.facebook.ads.redexgen.X.InterfaceC05762w
    public final void stopNestedScroll() {
        getScrollingChildHelper().A02();
    }
}
