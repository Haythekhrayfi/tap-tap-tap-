package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.developer.filepicker.model.DialogConfigs;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import okhttp3.internal.http2.Http2Connection;
import r.f;
import v.g;
import v.i;
import v.j;
import v.l;
import v.n;
import v.o;
import w.k;
import w.m;
import w.q;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.1.4";
    private static z.e sSharedValues;
    public SparseArray<View> mChildrenByIds;
    private ArrayList<androidx.constraintlayout.widget.b> mConstraintHelpers;
    public z.a mConstraintLayoutSpec;
    private androidx.constraintlayout.widget.c mConstraintSet;
    private int mConstraintSetId;
    private z.b mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    public boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    public int mLastMeasureHeightMode;
    public int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    public int mLastMeasureWidthMode;
    public int mLastMeasureWidthSize;
    public g mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    public c mMeasurer;
    private f mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<v.f> mTempMapIdToWidget;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1426a;

        static {
            int[] iArr = new int[v.f.b.values().length];
            f1426a = iArr;
            try {
                iArr[v.f.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1426a[v.f.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1426a[v.f.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1426a[v.f.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E;
        public boolean F;
        public float G;
        public float H;
        public String I;
        public float J;
        public int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1427a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f1428a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1429b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public boolean f1430b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1431c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public String f1432c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1433d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f1434d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1435e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public boolean f1436e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1437f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public boolean f1438f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1439g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public boolean f1440g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1441h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public boolean f1442h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1443i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public boolean f1444i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1445j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public boolean f1446j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1447k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public int f1448k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1449l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public int f1450l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1451m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public int f1452m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1453n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public int f1454n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f1455o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public int f1456o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f1457p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f1458p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1459q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public float f1460q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f1461r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f1462r0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f1463s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f1464s0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f1465t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public float f1466t0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f1467u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public v.f f1468u0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f1469v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f1470w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f1471x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f1472y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f1473z;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f1474a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1474a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f1427a = -1;
            this.f1429b = -1;
            this.f1431c = -1.0f;
            this.f1433d = true;
            this.f1435e = -1;
            this.f1437f = -1;
            this.f1439g = -1;
            this.f1441h = -1;
            this.f1443i = -1;
            this.f1445j = -1;
            this.f1447k = -1;
            this.f1449l = -1;
            this.f1451m = -1;
            this.f1453n = -1;
            this.f1455o = -1;
            this.f1457p = -1;
            this.f1459q = 0;
            this.f1461r = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f1463s = -1;
            this.f1465t = -1;
            this.f1467u = -1;
            this.f1469v = -1;
            this.f1470w = Integer.MIN_VALUE;
            this.f1471x = Integer.MIN_VALUE;
            this.f1472y = Integer.MIN_VALUE;
            this.f1473z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1428a0 = false;
            this.f1430b0 = false;
            this.f1432c0 = null;
            this.f1434d0 = 0;
            this.f1436e0 = true;
            this.f1438f0 = true;
            this.f1440g0 = false;
            this.f1442h0 = false;
            this.f1444i0 = false;
            this.f1446j0 = false;
            this.f1448k0 = -1;
            this.f1450l0 = -1;
            this.f1452m0 = -1;
            this.f1454n0 = -1;
            this.f1456o0 = Integer.MIN_VALUE;
            this.f1458p0 = Integer.MIN_VALUE;
            this.f1460q0 = 0.5f;
            this.f1468u0 = new v.f();
        }

        public b(Context context, AttributeSet attributeSet) {
            String str;
            super(context, attributeSet);
            this.f1427a = -1;
            this.f1429b = -1;
            this.f1431c = -1.0f;
            this.f1433d = true;
            this.f1435e = -1;
            this.f1437f = -1;
            this.f1439g = -1;
            this.f1441h = -1;
            this.f1443i = -1;
            this.f1445j = -1;
            this.f1447k = -1;
            this.f1449l = -1;
            this.f1451m = -1;
            this.f1453n = -1;
            this.f1455o = -1;
            this.f1457p = -1;
            this.f1459q = 0;
            this.f1461r = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f1463s = -1;
            this.f1465t = -1;
            this.f1467u = -1;
            this.f1469v = -1;
            this.f1470w = Integer.MIN_VALUE;
            this.f1471x = Integer.MIN_VALUE;
            this.f1472y = Integer.MIN_VALUE;
            this.f1473z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1428a0 = false;
            this.f1430b0 = false;
            this.f1432c0 = null;
            this.f1434d0 = 0;
            this.f1436e0 = true;
            this.f1438f0 = true;
            this.f1440g0 = false;
            this.f1442h0 = false;
            this.f1444i0 = false;
            this.f1446j0 = false;
            this.f1448k0 = -1;
            this.f1450l0 = -1;
            this.f1452m0 = -1;
            this.f1454n0 = -1;
            this.f1456o0 = Integer.MIN_VALUE;
            this.f1458p0 = Integer.MIN_VALUE;
            this.f1460q0 = 0.5f;
            this.f1468u0 = new v.f();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.d.f44935b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = a.f1474a.get(index);
                switch (i11) {
                    case 1:
                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                        continue;
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1457p);
                        this.f1457p = resourceId;
                        if (resourceId == -1) {
                            this.f1457p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 3:
                        this.f1459q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1459q);
                        continue;
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f1461r) % 360.0f;
                        this.f1461r = f10;
                        if (f10 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                            this.f1461r = (360.0f - f10) % 360.0f;
                        } else {
                            continue;
                        }
                        break;
                    case 5:
                        this.f1427a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1427a);
                        continue;
                        break;
                    case 6:
                        this.f1429b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1429b);
                        continue;
                        break;
                    case 7:
                        this.f1431c = typedArrayObtainStyledAttributes.getFloat(index, this.f1431c);
                        continue;
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1435e);
                        this.f1435e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1435e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1437f);
                        this.f1437f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1437f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1439g);
                        this.f1439g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1439g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1441h);
                        this.f1441h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1441h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1443i);
                        this.f1443i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1443i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1445j);
                        this.f1445j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1445j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1447k);
                        this.f1447k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1447k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1449l);
                        this.f1449l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1449l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1451m);
                        this.f1451m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1451m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1463s);
                        this.f1463s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1463s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1465t);
                        this.f1465t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1465t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1467u);
                        this.f1467u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1467u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1469v);
                        this.f1469v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1469v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 21:
                        this.f1470w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1470w);
                        continue;
                        break;
                    case 22:
                        this.f1471x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1471x);
                        continue;
                        break;
                    case 23:
                        this.f1472y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1472y);
                        continue;
                        break;
                    case 24:
                        this.f1473z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1473z);
                        continue;
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        continue;
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        continue;
                        break;
                    case 27:
                        this.f1428a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1428a0);
                        continue;
                        break;
                    case 28:
                        this.f1430b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1430b0);
                        continue;
                        break;
                    case 29:
                        this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G);
                        continue;
                        break;
                    case 30:
                        this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                        continue;
                        break;
                    case 31:
                        int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.P = i12;
                        if (i12 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        }
                        break;
                    case 32:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.Q = i13;
                        if (i13 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        }
                        break;
                    case 33:
                        try {
                            this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            continue;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                            continue;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                            }
                        }
                        break;
                    case 35:
                        this.V = Math.max(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, typedArrayObtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        continue;
                        break;
                    case 36:
                        try {
                            this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            continue;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                            continue;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                            }
                        }
                        break;
                    case 38:
                        this.W = Math.max(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, typedArrayObtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        continue;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                androidx.constraintlayout.widget.c.m(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 46:
                                this.M = typedArrayObtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case 47:
                                this.N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 50:
                                this.Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case 51:
                                this.f1432c0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1453n);
                                this.f1453n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f1453n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1455o);
                                this.f1455o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f1455o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        androidx.constraintlayout.widget.c.l(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.E = true;
                                        continue;
                                    case 65:
                                        androidx.constraintlayout.widget.c.l(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.f1434d0 = typedArrayObtainStyledAttributes.getInt(index, this.f1434d0);
                                        break;
                                    case 67:
                                        this.f1433d = typedArrayObtainStyledAttributes.getBoolean(index, this.f1433d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
                Log.e(ConstraintLayout.TAG, str);
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1427a = -1;
            this.f1429b = -1;
            this.f1431c = -1.0f;
            this.f1433d = true;
            this.f1435e = -1;
            this.f1437f = -1;
            this.f1439g = -1;
            this.f1441h = -1;
            this.f1443i = -1;
            this.f1445j = -1;
            this.f1447k = -1;
            this.f1449l = -1;
            this.f1451m = -1;
            this.f1453n = -1;
            this.f1455o = -1;
            this.f1457p = -1;
            this.f1459q = 0;
            this.f1461r = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f1463s = -1;
            this.f1465t = -1;
            this.f1467u = -1;
            this.f1469v = -1;
            this.f1470w = Integer.MIN_VALUE;
            this.f1471x = Integer.MIN_VALUE;
            this.f1472y = Integer.MIN_VALUE;
            this.f1473z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1428a0 = false;
            this.f1430b0 = false;
            this.f1432c0 = null;
            this.f1434d0 = 0;
            this.f1436e0 = true;
            this.f1438f0 = true;
            this.f1440g0 = false;
            this.f1442h0 = false;
            this.f1444i0 = false;
            this.f1446j0 = false;
            this.f1448k0 = -1;
            this.f1450l0 = -1;
            this.f1452m0 = -1;
            this.f1454n0 = -1;
            this.f1456o0 = Integer.MIN_VALUE;
            this.f1458p0 = Integer.MIN_VALUE;
            this.f1460q0 = 0.5f;
            this.f1468u0 = new v.f();
        }

        public b(b bVar) {
            super((ViewGroup.MarginLayoutParams) bVar);
            this.f1427a = -1;
            this.f1429b = -1;
            this.f1431c = -1.0f;
            this.f1433d = true;
            this.f1435e = -1;
            this.f1437f = -1;
            this.f1439g = -1;
            this.f1441h = -1;
            this.f1443i = -1;
            this.f1445j = -1;
            this.f1447k = -1;
            this.f1449l = -1;
            this.f1451m = -1;
            this.f1453n = -1;
            this.f1455o = -1;
            this.f1457p = -1;
            this.f1459q = 0;
            this.f1461r = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f1463s = -1;
            this.f1465t = -1;
            this.f1467u = -1;
            this.f1469v = -1;
            this.f1470w = Integer.MIN_VALUE;
            this.f1471x = Integer.MIN_VALUE;
            this.f1472y = Integer.MIN_VALUE;
            this.f1473z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1428a0 = false;
            this.f1430b0 = false;
            this.f1432c0 = null;
            this.f1434d0 = 0;
            this.f1436e0 = true;
            this.f1438f0 = true;
            this.f1440g0 = false;
            this.f1442h0 = false;
            this.f1444i0 = false;
            this.f1446j0 = false;
            this.f1448k0 = -1;
            this.f1450l0 = -1;
            this.f1452m0 = -1;
            this.f1454n0 = -1;
            this.f1456o0 = Integer.MIN_VALUE;
            this.f1458p0 = Integer.MIN_VALUE;
            this.f1460q0 = 0.5f;
            this.f1468u0 = new v.f();
            this.f1427a = bVar.f1427a;
            this.f1429b = bVar.f1429b;
            this.f1431c = bVar.f1431c;
            this.f1433d = bVar.f1433d;
            this.f1435e = bVar.f1435e;
            this.f1437f = bVar.f1437f;
            this.f1439g = bVar.f1439g;
            this.f1441h = bVar.f1441h;
            this.f1443i = bVar.f1443i;
            this.f1445j = bVar.f1445j;
            this.f1447k = bVar.f1447k;
            this.f1449l = bVar.f1449l;
            this.f1451m = bVar.f1451m;
            this.f1453n = bVar.f1453n;
            this.f1455o = bVar.f1455o;
            this.f1457p = bVar.f1457p;
            this.f1459q = bVar.f1459q;
            this.f1461r = bVar.f1461r;
            this.f1463s = bVar.f1463s;
            this.f1465t = bVar.f1465t;
            this.f1467u = bVar.f1467u;
            this.f1469v = bVar.f1469v;
            this.f1470w = bVar.f1470w;
            this.f1471x = bVar.f1471x;
            this.f1472y = bVar.f1472y;
            this.f1473z = bVar.f1473z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.f1428a0 = bVar.f1428a0;
            this.f1430b0 = bVar.f1430b0;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.T = bVar.T;
            this.S = bVar.S;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f1436e0 = bVar.f1436e0;
            this.f1438f0 = bVar.f1438f0;
            this.f1440g0 = bVar.f1440g0;
            this.f1442h0 = bVar.f1442h0;
            this.f1448k0 = bVar.f1448k0;
            this.f1450l0 = bVar.f1450l0;
            this.f1452m0 = bVar.f1452m0;
            this.f1454n0 = bVar.f1454n0;
            this.f1456o0 = bVar.f1456o0;
            this.f1458p0 = bVar.f1458p0;
            this.f1460q0 = bVar.f1460q0;
            this.f1432c0 = bVar.f1432c0;
            this.f1434d0 = bVar.f1434d0;
            this.f1468u0 = bVar.f1468u0;
            this.E = bVar.E;
            this.F = bVar.F;
        }

        public void a() {
            this.f1442h0 = false;
            this.f1436e0 = true;
            this.f1438f0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f1428a0) {
                this.f1436e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f1430b0) {
                this.f1438f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f1436e0 = false;
                if (i10 == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f1428a0 = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f1438f0 = false;
                if (i11 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f1430b0 = true;
                }
            }
            if (this.f1431c == -1.0f && this.f1427a == -1 && this.f1429b == -1) {
                return;
            }
            this.f1442h0 = true;
            this.f1436e0 = true;
            this.f1438f0 = true;
            if (!(this.f1468u0 instanceof i)) {
                this.f1468u0 = new i();
            }
            ((i) this.f1468u0).d0(this.Z);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004e  */
        /* JADX WARN: Code duplicated, block: B:20:0x0055  */
        /* JADX WARN: Code duplicated, block: B:23:0x005c  */
        /* JADX WARN: Code duplicated, block: B:26:0x0062  */
        /* JADX WARN: Code duplicated, block: B:29:0x0068  */
        /* JADX WARN: Code duplicated, block: B:38:0x007e  */
        /* JADX WARN: Code duplicated, block: B:39:0x0086 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0088  */
        /* JADX WARN: Code duplicated, block: B:42:0x008f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:43:0x0091  */
        /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        public void resolveLayoutDirection(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i16 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i10);
            boolean z10 = false;
            boolean z11 = 1 == getLayoutDirection();
            this.f1452m0 = -1;
            this.f1454n0 = -1;
            this.f1448k0 = -1;
            this.f1450l0 = -1;
            this.f1456o0 = -1;
            this.f1458p0 = -1;
            this.f1456o0 = this.f1470w;
            this.f1458p0 = this.f1472y;
            float f10 = this.G;
            this.f1460q0 = f10;
            int i17 = this.f1427a;
            this.f1462r0 = i17;
            int i18 = this.f1429b;
            this.f1464s0 = i18;
            float f11 = this.f1431c;
            this.f1466t0 = f11;
            if (z11) {
                int i19 = this.f1463s;
                if (i19 != -1) {
                    this.f1452m0 = i19;
                } else {
                    int i20 = this.f1465t;
                    if (i20 != -1) {
                        this.f1454n0 = i20;
                    } else {
                        i11 = this.f1467u;
                        if (i11 != -1) {
                            this.f1450l0 = i11;
                            z10 = true;
                        }
                        i12 = this.f1469v;
                        if (i12 != -1) {
                            this.f1448k0 = i12;
                            z10 = true;
                        }
                        i13 = this.A;
                        if (i13 != Integer.MIN_VALUE) {
                            this.f1458p0 = i13;
                        }
                        i14 = this.B;
                        if (i14 != Integer.MIN_VALUE) {
                            this.f1456o0 = i14;
                        }
                        if (z10) {
                            this.f1460q0 = 1.0f - f10;
                        }
                        if (this.f1442h0 && this.Z == 1 && this.f1433d) {
                            if (f11 != -1.0f) {
                                this.f1466t0 = 1.0f - f11;
                                this.f1462r0 = -1;
                                this.f1464s0 = -1;
                            } else {
                                if (i17 != -1) {
                                    this.f1464s0 = i17;
                                    this.f1462r0 = -1;
                                } else if (i18 != -1) {
                                    this.f1462r0 = i18;
                                    this.f1464s0 = -1;
                                }
                                this.f1466t0 = -1.0f;
                            }
                        }
                    }
                }
                z10 = true;
                i11 = this.f1467u;
                if (i11 != -1) {
                    this.f1450l0 = i11;
                    z10 = true;
                }
                i12 = this.f1469v;
                if (i12 != -1) {
                    this.f1448k0 = i12;
                    z10 = true;
                }
                i13 = this.A;
                if (i13 != Integer.MIN_VALUE) {
                    this.f1458p0 = i13;
                }
                i14 = this.B;
                if (i14 != Integer.MIN_VALUE) {
                    this.f1456o0 = i14;
                }
                if (z10) {
                    this.f1460q0 = 1.0f - f10;
                }
                if (this.f1442h0) {
                    if (f11 != -1.0f) {
                        this.f1466t0 = 1.0f - f11;
                        this.f1462r0 = -1;
                        this.f1464s0 = -1;
                    } else {
                        if (i17 != -1) {
                            this.f1464s0 = i17;
                            this.f1462r0 = -1;
                        } else if (i18 != -1) {
                            this.f1462r0 = i18;
                            this.f1464s0 = -1;
                        }
                        this.f1466t0 = -1.0f;
                    }
                }
            } else {
                int i21 = this.f1463s;
                if (i21 != -1) {
                    this.f1450l0 = i21;
                }
                int i22 = this.f1465t;
                if (i22 != -1) {
                    this.f1448k0 = i22;
                }
                int i23 = this.f1467u;
                if (i23 != -1) {
                    this.f1452m0 = i23;
                }
                int i24 = this.f1469v;
                if (i24 != -1) {
                    this.f1454n0 = i24;
                }
                int i25 = this.A;
                if (i25 != Integer.MIN_VALUE) {
                    this.f1456o0 = i25;
                }
                int i26 = this.B;
                if (i26 != Integer.MIN_VALUE) {
                    this.f1458p0 = i26;
                }
            }
            if (this.f1467u == -1 && this.f1469v == -1 && this.f1465t == -1 && this.f1463s == -1) {
                int i27 = this.f1439g;
                if (i27 != -1) {
                    this.f1452m0 = i27;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                    }
                } else {
                    int i28 = this.f1441h;
                    if (i28 != -1) {
                        this.f1454n0 = i28;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                        }
                    }
                }
                int i29 = this.f1435e;
                if (i29 != -1) {
                    this.f1448k0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                } else {
                    int i30 = this.f1437f;
                    if (i30 == -1) {
                        return;
                    }
                    this.f1450l0 = i30;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
            }
        }
    }

    public class c implements w.b.InterfaceC0443b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ConstraintLayout f1475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1478d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1479e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1480f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1481g;

        public c(ConstraintLayout constraintLayout) {
            this.f1475a = constraintLayout;
        }

        public final boolean a(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:211:0x02a4  */
        /* JADX WARN: Code duplicated, block: B:212:0x02a6  */
        /* JADX WARN: Code duplicated, block: B:219:0x02b2  */
        /* JADX WARN: Code duplicated, block: B:222:0x02b9  */
        @SuppressLint({"WrongCall"})
        public final void b(v.f fVar, w.b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int iMakeMeasureSpec3;
            int baseline;
            int iMax;
            int iMakeMeasureSpec4;
            boolean z10;
            int measuredHeight;
            int i10;
            boolean z11;
            boolean z12;
            int i11;
            int i12;
            int i13;
            int i14;
            if (fVar == null) {
                return;
            }
            if (fVar.f36608q0 == 8 && !fVar.I) {
                aVar.f37024e = 0;
                aVar.f37025f = 0;
                aVar.f37026g = 0;
                return;
            }
            if (fVar.Y == null) {
                return;
            }
            v.f.b bVar = aVar.f37020a;
            v.f.b bVar2 = aVar.f37021b;
            int iZ = aVar.f37022c;
            int iQ = aVar.f37023d;
            int i15 = this.f1476b + this.f1477c;
            int i16 = this.f1478d;
            View view = (View) fVar.f36604o0;
            int[] iArr = a.f1426a;
            int i17 = iArr[bVar.ordinal()];
            if (i17 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iZ, 1073741824);
            } else {
                if (i17 == 2) {
                    i13 = this.f1480f;
                    i14 = -2;
                } else if (i17 == 3) {
                    i13 = this.f1480f;
                    v.d dVar = fVar.M;
                    int i18 = dVar != null ? dVar.f36571g + 0 : 0;
                    v.d dVar2 = fVar.O;
                    if (dVar2 != null) {
                        i18 += dVar2.f36571g;
                    }
                    i16 += i18;
                    i14 = -1;
                } else if (i17 != 4) {
                    iMakeMeasureSpec = 0;
                } else {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1480f, i16, -2);
                    boolean z13 = fVar.f36611s == 1;
                    int i19 = aVar.f37029j;
                    if (i19 == 1 || i19 == 2) {
                        if (aVar.f37029j == 2 || !z13 || (z13 && (view.getMeasuredHeight() == fVar.q())) || (view instanceof e) || fVar.J()) {
                            iZ = fVar.z();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iZ, 1073741824);
                        }
                    }
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i13, i16, i14);
            }
            int i20 = iArr[bVar2.ordinal()];
            if (i20 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iQ, 1073741824);
                iMakeMeasureSpec3 = iMakeMeasureSpec2;
            } else {
                if (i20 == 2) {
                    i11 = -2;
                    i12 = this.f1481g;
                } else if (i20 == 3) {
                    i12 = this.f1481g;
                    int i21 = fVar.M != null ? fVar.N.f36571g + 0 : 0;
                    if (fVar.O != null) {
                        i21 += fVar.P.f36571g;
                    }
                    i15 += i21;
                    i11 = -1;
                } else if (i20 != 4) {
                    iMakeMeasureSpec3 = 0;
                } else {
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1481g, i15, -2);
                    boolean z14 = fVar.f36613t == 1;
                    int i22 = aVar.f37029j;
                    if (i22 == 1 || i22 == 2) {
                        if (aVar.f37029j == 2 || !z14 || (z14 && (view.getMeasuredWidth() == fVar.z())) || (view instanceof e) || fVar.K()) {
                            iQ = fVar.q();
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iQ, 1073741824);
                        }
                    }
                    iMakeMeasureSpec3 = iMakeMeasureSpec2;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i15, i11);
                iMakeMeasureSpec3 = iMakeMeasureSpec2;
            }
            g gVar = (g) fVar.Y;
            if (gVar != null && l.b(ConstraintLayout.this.mOptimizationLevel, 256) && view.getMeasuredWidth() == fVar.z() && view.getMeasuredWidth() < gVar.z() && view.getMeasuredHeight() == fVar.q() && view.getMeasuredHeight() < gVar.q() && view.getBaseline() == fVar.f36594j0 && !fVar.I()) {
                if (a(fVar.K, iMakeMeasureSpec, fVar.z()) && a(fVar.L, iMakeMeasureSpec3, fVar.q())) {
                    aVar.f37024e = fVar.z();
                    aVar.f37025f = fVar.q();
                    aVar.f37026g = fVar.f36594j0;
                    return;
                }
            }
            v.f.b bVar3 = v.f.b.MATCH_CONSTRAINT;
            boolean z15 = bVar == bVar3;
            boolean z16 = bVar2 == bVar3;
            v.f.b bVar4 = v.f.b.MATCH_PARENT;
            boolean z17 = bVar2 == bVar4 || bVar2 == v.f.b.FIXED;
            boolean z18 = bVar == bVar4 || bVar == v.f.b.FIXED;
            boolean z19 = z15 && fVar.f36578b0 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            boolean z20 = z16 && fVar.f36578b0 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i23 = aVar.f37029j;
            if (i23 == 1 || i23 == 2 || !z15 || fVar.f36611s != 0 || !z16 || fVar.f36613t != 0) {
                if ((view instanceof z.g) && (fVar instanceof n)) {
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                }
                fVar.K = iMakeMeasureSpec;
                fVar.L = iMakeMeasureSpec3;
                fVar.f36587g = false;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i24 = fVar.f36617v;
                iMax = i24 > 0 ? Math.max(i24, measuredWidth) : measuredWidth;
                int i25 = fVar.f36619w;
                if (i25 > 0) {
                    iMax = Math.min(i25, iMax);
                }
                int i26 = fVar.f36623y;
                int iMax2 = i26 > 0 ? Math.max(i26, measuredHeight2) : measuredHeight2;
                int i27 = fVar.f36625z;
                if (i27 > 0) {
                    iMax2 = Math.min(i27, iMax2);
                }
                if (!l.b(ConstraintLayout.this.mOptimizationLevel, 1)) {
                    if (z19 && z17) {
                        iMax = (int) ((iMax2 * fVar.f36578b0) + 0.5f);
                    } else if (z20 && z18) {
                        iMax2 = (int) ((iMax / fVar.f36578b0) + 0.5f);
                    }
                }
                if (measuredWidth == iMax && measuredHeight2 == iMax2) {
                    measuredHeight = iMax2;
                    i10 = -1;
                } else {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    if (measuredHeight2 != iMax2) {
                        iMakeMeasureSpec4 = iMakeMeasureSpec;
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    }
                    iMakeMeasureSpec4 = iMakeMeasureSpec;
                    view.measure(iMakeMeasureSpec4, iMakeMeasureSpec3);
                    fVar.K = iMakeMeasureSpec4;
                    fVar.L = iMakeMeasureSpec3;
                    z10 = false;
                    fVar.f36587g = false;
                    int measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    iMax = measuredWidth2;
                    baseline = view.getBaseline();
                    i10 = -1;
                }
                if (baseline != i10) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (iMax == aVar.f37022c || measuredHeight != aVar.f37023d) {
                    z12 = true;
                } else {
                    z12 = z10;
                }
                aVar.f37028i = z12;
                if (bVar5.f1440g0) {
                    z11 = true;
                }
                if (z11 && baseline != -1 && fVar.f36594j0 != baseline) {
                    aVar.f37028i = true;
                }
                aVar.f37024e = iMax;
                aVar.f37025f = measuredHeight;
                aVar.f37027h = z11;
                aVar.f37026g = baseline;
            }
            i10 = -1;
            measuredHeight = 0;
            baseline = 0;
            iMax = 0;
            z10 = false;
            if (baseline != i10) {
                z11 = true;
            } else {
                z11 = z10;
            }
            if (iMax == aVar.f37022c) {
                z12 = true;
            } else {
                z12 = true;
            }
            aVar.f37028i = z12;
            if (bVar5.f1440g0) {
                z11 = true;
            }
            if (z11) {
                aVar.f37028i = true;
            }
            aVar.f37024e = iMax;
            aVar.f37025f = measuredHeight;
            aVar.f37027h = z11;
            aVar.f37026g = baseline;
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new g();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new g();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new g();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i10, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new g();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i10, i11);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static z.e getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new z.e();
        }
        return sSharedValues;
    }

    private final v.f getTargetWidget(int i10) {
        if (i10 == 0) {
            return this.mLayoutWidget;
        }
        View viewFindViewById = this.mChildrenByIds.get(i10);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i10)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f1468u0;
    }

    private void init(AttributeSet attributeSet, int i10, int i11) {
        g gVar = this.mLayoutWidget;
        gVar.f36604o0 = this;
        gVar.n0(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, z.d.f44935b, i10, i11);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == 16) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 17) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 14) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 15) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 113) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.mConstraintSet = cVar;
                        cVar.j(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.o0(this.mOptimizationLevel);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        String str;
        int iJ;
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            v.f viewWidget = getViewWidget(getChildAt(i10));
            if (viewWidget != null) {
                viewWidget.L();
            }
        }
        if (zIsInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).f36612s0 = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof d)) {
                    this.mConstraintSet = ((d) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.c cVar = this.mConstraintSet;
        if (cVar != null) {
            cVar.c(this, true);
        }
        this.mLayoutWidget.P0.clear();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                androidx.constraintlayout.widget.b bVar = this.mConstraintHelpers.get(i13);
                if (bVar.isInEditMode()) {
                    bVar.setIds(bVar.f1497g);
                }
                j jVar = bVar.f1496f;
                if (jVar != null) {
                    jVar.a();
                    for (int i14 = 0; i14 < bVar.f1494d; i14++) {
                        int i15 = bVar.f1493c[i14];
                        View viewById = getViewById(i15);
                        if (viewById == null && (iJ = bVar.j(this, (str = bVar.f1500j.get(Integer.valueOf(i15))))) != 0) {
                            bVar.f1493c[i14] = iJ;
                            bVar.f1500j.put(Integer.valueOf(iJ), str);
                            viewById = getViewById(iJ);
                        }
                        if (viewById != null) {
                            bVar.f1496f.b(getViewWidget(viewById));
                        }
                    }
                    bVar.f1496f.c(this.mLayoutWidget);
                }
            }
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt3 = getChildAt(i16);
            if (childAt3 instanceof e) {
                e eVar = (e) childAt3;
                if (eVar.f1614c == -1 && !eVar.isInEditMode()) {
                    eVar.setVisibility(eVar.f1616e);
                }
                View viewFindViewById = findViewById(eVar.f1614c);
                eVar.f1615d = viewFindViewById;
                if (viewFindViewById != null) {
                    ((b) viewFindViewById.getLayoutParams()).f1446j0 = true;
                    eVar.f1615d.setVisibility(0);
                    eVar.setVisibility(0);
                }
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt5 = getChildAt(i18);
            v.f viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                b bVar2 = (b) childAt5.getLayoutParams();
                g gVar = this.mLayoutWidget;
                gVar.P0.add(viewWidget2);
                v.f fVar = viewWidget2.Y;
                if (fVar != null) {
                    ((o) fVar).P0.remove(viewWidget2);
                    viewWidget2.L();
                }
                viewWidget2.Y = gVar;
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, bVar2, this.mTempMapIdToWidget);
            }
        }
    }

    private void setWidgetBaseline(v.f fVar, b bVar, SparseArray<v.f> sparseArray, int i10, v.d.b bVar2) {
        View view = this.mChildrenByIds.get(i10);
        v.f fVar2 = sparseArray.get(i10);
        if (fVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f1440g0 = true;
        v.d.b bVar3 = v.d.b.BASELINE;
        if (bVar2 == bVar3) {
            b bVar4 = (b) view.getLayoutParams();
            bVar4.f1440g0 = true;
            bVar4.f1468u0.H = true;
        }
        fVar.n(bVar3).b(fVar2.n(bVar2), bVar.D, bVar.C, true);
        fVar.H = true;
        fVar.n(v.d.b.TOP).k();
        fVar.n(v.d.b.BOTTOM).k();
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            setChildrenConstraints();
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:84:0x0183  */
    /* JADX WARN: Code duplicated, block: B:87:0x018b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x02b1 -> B:160:0x02b2). Please report as a decompilation issue!!! */
    public void applyConstraintsFromLayoutParams(boolean z10, View view, v.f fVar, b bVar, SparseArray<v.f> sparseArray) {
        v.f fVar2;
        v.d.b bVar2;
        int i10;
        v.d.b bVar3;
        v.f fVar3;
        v.d.b bVar4;
        v.d.b bVar5;
        int i11;
        v.f fVar4;
        v.d.b bVar6;
        int i12;
        int i13;
        v.d.b bVar7;
        v.f fVar5;
        v.f fVar6;
        v.d.b bVar8;
        int i14;
        int i15;
        v.f fVar7;
        v.d.b bVar9;
        v.d.b bVar10;
        float f10;
        int i16;
        int i17;
        float fAbs;
        int i18;
        bVar.a();
        fVar.f36608q0 = view.getVisibility();
        if (bVar.f1446j0) {
            fVar.I = true;
            fVar.f36608q0 = 8;
        }
        fVar.f36604o0 = view;
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).n(fVar, this.mLayoutWidget.U0);
        }
        int i19 = -1;
        if (bVar.f1442h0) {
            i iVar = (i) fVar;
            int i20 = bVar.f1462r0;
            int i21 = bVar.f1464s0;
            float f11 = bVar.f1466t0;
            if (f11 != -1.0f) {
                if (f11 > -1.0f) {
                    iVar.P0 = f11;
                    iVar.Q0 = -1;
                    iVar.R0 = -1;
                    return;
                }
                return;
            }
            if (i20 != -1) {
                if (i20 > -1) {
                    iVar.P0 = -1.0f;
                    iVar.Q0 = i20;
                    iVar.R0 = -1;
                    return;
                }
                return;
            }
            if (i21 == -1 || i21 <= -1) {
                return;
            }
            iVar.P0 = -1.0f;
            iVar.Q0 = -1;
            iVar.R0 = i21;
            return;
        }
        int i22 = bVar.f1448k0;
        int i23 = bVar.f1450l0;
        int i24 = bVar.f1452m0;
        int i25 = bVar.f1454n0;
        int i26 = bVar.f1456o0;
        int i27 = bVar.f1458p0;
        float f12 = bVar.f1460q0;
        int i28 = bVar.f1457p;
        float f13 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        if (i28 != -1) {
            v.f fVar8 = sparseArray.get(i28);
            if (fVar8 != null) {
                float f14 = bVar.f1461r;
                int i29 = bVar.f1459q;
                v.d.b bVar11 = v.d.b.CENTER;
                fVar.E(bVar11, fVar8, bVar11, i29, 0);
                fVar.G = f14;
            }
            f13 = 0.0f;
        } else {
            if (i22 != -1) {
                fVar2 = sparseArray.get(i22);
                if (fVar2 != null) {
                    bVar2 = v.d.b.LEFT;
                    bVar3 = bVar2;
                    i10 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                    fVar.E(bVar2, fVar2, bVar3, i10, i26);
                }
            } else if (i23 != -1 && (fVar2 = sparseArray.get(i23)) != null) {
                bVar2 = v.d.b.LEFT;
                v.d.b bVar12 = v.d.b.RIGHT;
                i10 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                bVar3 = bVar12;
                fVar.E(bVar2, fVar2, bVar3, i10, i26);
            }
            if (i24 != -1) {
                fVar3 = sparseArray.get(i24);
                if (fVar3 != null) {
                    bVar4 = v.d.b.RIGHT;
                    v.d.b bVar13 = v.d.b.LEFT;
                    i11 = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
                    bVar5 = bVar13;
                    fVar.E(bVar4, fVar3, bVar5, i11, i27);
                }
            } else if (i25 != -1 && (fVar3 = sparseArray.get(i25)) != null) {
                bVar4 = v.d.b.RIGHT;
                bVar5 = bVar4;
                i11 = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
                fVar.E(bVar4, fVar3, bVar5, i11, i27);
            }
            int i30 = bVar.f1443i;
            if (i30 != -1) {
                v.f fVar9 = sparseArray.get(i30);
                if (fVar9 != null) {
                    bVar6 = v.d.b.TOP;
                    i13 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                    i12 = bVar.f1471x;
                    fVar5 = fVar9;
                    bVar7 = bVar6;
                    fVar.E(bVar6, fVar5, bVar7, i13, i12);
                }
            } else {
                int i31 = bVar.f1445j;
                if (i31 != -1 && (fVar4 = sparseArray.get(i31)) != null) {
                    bVar6 = v.d.b.TOP;
                    v.d.b bVar14 = v.d.b.BOTTOM;
                    int i32 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                    i12 = bVar.f1471x;
                    i13 = i32;
                    bVar7 = bVar14;
                    fVar5 = fVar4;
                    fVar.E(bVar6, fVar5, bVar7, i13, i12);
                }
            }
            int i33 = bVar.f1447k;
            if (i33 != -1) {
                v.f fVar10 = sparseArray.get(i33);
                if (fVar10 != null) {
                    bVar8 = v.d.b.BOTTOM;
                    v.d.b bVar15 = v.d.b.TOP;
                    int i34 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
                    i15 = bVar.f1473z;
                    i14 = i34;
                    bVar9 = bVar15;
                    fVar7 = fVar10;
                    fVar.E(bVar8, fVar7, bVar9, i14, i15);
                }
            } else {
                int i35 = bVar.f1449l;
                if (i35 != -1 && (fVar6 = sparseArray.get(i35)) != null) {
                    bVar8 = v.d.b.BOTTOM;
                    i14 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
                    i15 = bVar.f1473z;
                    fVar7 = fVar6;
                    bVar9 = bVar8;
                    fVar.E(bVar8, fVar7, bVar9, i14, i15);
                }
            }
            int i36 = bVar.f1451m;
            if (i36 != -1) {
                bVar10 = v.d.b.BASELINE;
            } else {
                i36 = bVar.f1453n;
                if (i36 != -1) {
                    bVar10 = v.d.b.TOP;
                } else {
                    i36 = bVar.f1455o;
                    if (i36 != -1) {
                        bVar10 = v.d.b.BOTTOM;
                    } else {
                        if (f12 >= f13) {
                            fVar.f36600m0 = f12;
                        }
                        f10 = bVar.H;
                        if (f10 >= f13) {
                            fVar.f36602n0 = f10;
                        }
                    }
                }
            }
            setWidgetBaseline(fVar, bVar, sparseArray, i36, bVar10);
            if (f12 >= f13) {
                fVar.f36600m0 = f12;
            }
            f10 = bVar.H;
            if (f10 >= f13) {
                fVar.f36602n0 = f10;
            }
        }
        if (z10 && ((i18 = bVar.X) != -1 || bVar.Y != -1)) {
            int i37 = bVar.Y;
            fVar.f36582d0 = i18;
            fVar.f36584e0 = i37;
        }
        if (bVar.f1436e0) {
            fVar.V(v.f.b.FIXED);
            fVar.Z(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                fVar.V(v.f.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
            fVar.V(bVar.f1428a0 ? v.f.b.MATCH_CONSTRAINT : v.f.b.MATCH_PARENT);
            fVar.n(v.d.b.LEFT).f36571g = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            fVar.n(v.d.b.RIGHT).f36571g = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        } else {
            fVar.V(v.f.b.MATCH_CONSTRAINT);
            fVar.Z(0);
        }
        if (bVar.f1438f0) {
            fVar.Y(v.f.b.FIXED);
            fVar.U(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                fVar.Y(v.f.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
            fVar.Y(bVar.f1430b0 ? v.f.b.MATCH_CONSTRAINT : v.f.b.MATCH_PARENT);
            fVar.n(v.d.b.TOP).f36571g = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            fVar.n(v.d.b.BOTTOM).f36571g = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        } else {
            fVar.Y(v.f.b.MATCH_CONSTRAINT);
            fVar.U(0);
        }
        String str = bVar.I;
        if (str == null || str.length() == 0) {
            fVar.f36578b0 = f13;
        } else {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i16 = 1;
                i17 = 0;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i19 = 0;
                } else {
                    if (strSubstring.equalsIgnoreCase("H")) {
                        i16 = 1;
                        i19 = 1;
                    }
                    i17 = iIndexOf + i16;
                }
                i16 = 1;
                i17 = iIndexOf + i16;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - i16) {
                    String strSubstring2 = str.substring(i17);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    } else {
                        fAbs = f13;
                    }
                } else {
                    String strSubstring3 = str.substring(i17, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + i16);
                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                        fAbs = f13;
                    } else {
                        float f15 = Float.parseFloat(strSubstring3);
                        float f16 = Float.parseFloat(strSubstring4);
                        if (f15 <= f13 || f16 <= f13) {
                            fAbs = f13;
                        } else {
                            fAbs = i19 == 1 ? Math.abs(f16 / f15) : Math.abs(f15 / f16);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
            if (fAbs > f13) {
                fVar.f36578b0 = fAbs;
                fVar.f36580c0 = i19;
            }
        }
        float f17 = bVar.L;
        float[] fArr = fVar.I0;
        fArr[0] = f17;
        fArr[1] = bVar.M;
        fVar.E0 = bVar.N;
        fVar.F0 = bVar.O;
        int i38 = bVar.f1434d0;
        if (i38 >= 0 && i38 <= 3) {
            fVar.f36609r = i38;
        }
        int i39 = bVar.P;
        int i40 = bVar.R;
        int i41 = bVar.T;
        float f18 = bVar.V;
        fVar.f36611s = i39;
        fVar.f36617v = i40;
        if (i41 == Integer.MAX_VALUE) {
            i41 = 0;
        }
        fVar.f36619w = i41;
        fVar.f36621x = f18;
        if (f18 > f13 && f18 < 1.0f && i39 == 0) {
            fVar.f36611s = 2;
        }
        int i42 = bVar.Q;
        int i43 = bVar.S;
        int i44 = bVar.U;
        float f19 = bVar.W;
        fVar.f36613t = i42;
        fVar.f36623y = i43;
        fVar.f36625z = i44 != Integer.MAX_VALUE ? i44 : 0;
        fVar.A = f19;
        if (f19 <= f13 || f19 >= 1.0f || i42 != 0) {
            return;
        }
        fVar.f36613t = 2;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                Objects.requireNonNull(this.mConstraintHelpers.get(i10));
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        int i17 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + i17;
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(f fVar) {
        this.mMetrics = fVar;
        g gVar = this.mLayoutWidget;
        gVar.V0 = fVar;
        Objects.requireNonNull(gVar.W0);
        r.d.f34965r = fVar;
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    @Override // android.view.ViewGroup
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object getDesignInformation(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.f36632d1;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.mLayoutWidget.f36595k == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.mLayoutWidget.f36595k = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.mLayoutWidget.f36595k = "parent";
            }
        }
        g gVar = this.mLayoutWidget;
        if (gVar.f36612s0 == null) {
            gVar.f36612s0 = gVar.f36595k;
            StringBuilder sbA = defpackage.a.a(" setDebugName ");
            sbA.append(this.mLayoutWidget.f36612s0);
            Log.v(TAG, sbA.toString());
        }
        for (v.f fVar : this.mLayoutWidget.P0) {
            View view = (View) fVar.f36604o0;
            if (view != null) {
                if (fVar.f36595k == null && (id2 = view.getId()) != -1) {
                    fVar.f36595k = getContext().getResources().getResourceEntryName(id2);
                }
                if (fVar.f36612s0 == null) {
                    fVar.f36612s0 = fVar.f36595k;
                    StringBuilder sbA2 = defpackage.a.a(" setDebugName ");
                    sbA2.append(fVar.f36612s0);
                    Log.v(TAG, sbA2.toString());
                }
            }
        }
        this.mLayoutWidget.v(sb2);
        return sb2.toString();
    }

    public View getViewById(int i10) {
        return this.mChildrenByIds.get(i10);
    }

    public final v.f getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof b)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof b)) {
                return null;
            }
        }
        return ((b) view.getLayoutParams()).f1468u0;
    }

    public boolean isRtl() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i10) {
        if (i10 != 0) {
            try {
                this.mConstraintLayoutSpec = new z.a(getContext(), this, i10);
                return;
            } catch (Resources.NotFoundException unused) {
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            v.f fVar = bVar.f1468u0;
            if ((childAt.getVisibility() != 8 || bVar.f1442h0 || bVar.f1444i0 || zIsInEditMode) && !bVar.f1446j0) {
                int iA = fVar.A();
                int iB = fVar.B();
                int iZ = fVar.z() + iA;
                int iQ = fVar.q() + iB;
                childAt.layout(iA, iB, iZ, iQ);
                if ((childAt instanceof e) && (content = ((e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iA, iB, iZ, iQ);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                Objects.requireNonNull(this.mConstraintHelpers.get(i15));
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.mOnMeasureWidthMeasureSpec == i10) {
            int i12 = this.mOnMeasureHeightMeasureSpec;
        }
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
            }
        }
        boolean z10 = this.mDirtyHierarchy;
        this.mOnMeasureWidthMeasureSpec = i10;
        this.mOnMeasureHeightMeasureSpec = i11;
        this.mLayoutWidget.U0 = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                g gVar = this.mLayoutWidget;
                gVar.Q0.c(gVar);
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i10, i11);
        int iZ = this.mLayoutWidget.z();
        int iQ = this.mLayoutWidget.q();
        g gVar2 = this.mLayoutWidget;
        resolveMeasuredDimension(i10, i11, iZ, iQ, gVar2.f36633e1, gVar2.f36634f1);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        v.f viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof i)) {
            b bVar = (b) view.getLayoutParams();
            i iVar = new i();
            bVar.f1468u0 = iVar;
            bVar.f1442h0 = true;
            iVar.d0(bVar.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.o();
            ((b) view.getLayoutParams()).f1444i0 = true;
            if (!this.mConstraintHelpers.contains(bVar2)) {
                this.mConstraintHelpers.add(bVar2);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        v.f viewWidget = getViewWidget(view);
        this.mLayoutWidget.P0.remove(viewWidget);
        viewWidget.L();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i10) {
        this.mConstraintLayoutSpec = new z.a(getContext(), this, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.mMeasurer;
        int i14 = cVar.f1479e;
        int iResolveSizeAndState = ViewGroup.resolveSizeAndState(i12 + cVar.f1478d, i10, 0);
        int iResolveSizeAndState2 = ViewGroup.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (z10) {
            iMin |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z11) {
            iMin2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0325  */
    /* JADX WARN: Code duplicated, block: B:163:0x032f  */
    /* JADX WARN: Code duplicated, block: B:166:0x033d A[LOOP:11: B:164:0x0337->B:166:0x033d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:168:0x0386  */
    /* JADX WARN: Code duplicated, block: B:171:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:172:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:174:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:176:0x03bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x03be  */
    /* JADX WARN: Code duplicated, block: B:178:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:180:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:181:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:183:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:189:0x03db  */
    /* JADX WARN: Code duplicated, block: B:191:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:218:0x0437  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:245:0x0470  */
    /* JADX WARN: Code duplicated, block: B:247:0x0478  */
    /* JADX WARN: Code duplicated, block: B:24:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:251:0x048e  */
    /* JADX WARN: Code duplicated, block: B:253:0x0498  */
    /* JADX WARN: Code duplicated, block: B:256:0x049f  */
    /* JADX WARN: Code duplicated, block: B:258:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:261:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:266:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:268:0x04f0 A[LOOP:5: B:267:0x04ee->B:268:0x04f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:271:0x0511  */
    /* JADX WARN: Code duplicated, block: B:272:0x0516  */
    /* JADX WARN: Code duplicated, block: B:274:0x0519  */
    /* JADX WARN: Code duplicated, block: B:276:0x0521  */
    /* JADX WARN: Code duplicated, block: B:277:0x0524  */
    /* JADX WARN: Code duplicated, block: B:280:0x052c  */
    /* JADX WARN: Code duplicated, block: B:281:0x052e  */
    /* JADX WARN: Code duplicated, block: B:284:0x054b  */
    /* JADX WARN: Code duplicated, block: B:286:0x0557  */
    /* JADX WARN: Code duplicated, block: B:287:0x055b  */
    /* JADX WARN: Code duplicated, block: B:289:0x0572  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:292:0x0584  */
    /* JADX WARN: Code duplicated, block: B:299:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:309:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:311:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:321:0x05fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:329:0x0615  */
    /* JADX WARN: Code duplicated, block: B:332:0x062e  */
    /* JADX WARN: Code duplicated, block: B:335:0x063c  */
    /* JADX WARN: Code duplicated, block: B:336:0x0645  */
    /* JADX WARN: Code duplicated, block: B:339:0x0651  */
    /* JADX WARN: Code duplicated, block: B:341:0x0656  */
    /* JADX WARN: Code duplicated, block: B:346:0x0672  */
    /* JADX WARN: Code duplicated, block: B:348:0x0677  */
    /* JADX WARN: Code duplicated, block: B:354:0x0696  */
    /* JADX WARN: Code duplicated, block: B:357:0x069c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:361:0x06b2 A[LOOP:7: B:308:0x05db->B:361:0x06b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:363:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:366:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x047f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x047f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x04de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x04de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x06c1 A[EDGE_INSN: B:408:0x06c1->B:362:0x06c1 BREAK  A[LOOP:7: B:308:0x05db->B:361:0x06b2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0102 A[PHI: r7
  0x0102: PHI (r7v3 boolean) = (r7v2 boolean), (r7v53 boolean) binds: [B:19:0x00a4, B:366:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0117  */
    /* JADX WARN: Code duplicated, block: B:69:0x0128  */
    public void resolveSystem(g gVar, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        w.b bVar;
        w.b.InterfaceC0443b interfaceC0443b;
        int size;
        int iZ;
        int iQ;
        boolean zB;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean zJ0;
        int i16;
        int i17;
        int size2;
        int i18;
        int i19;
        int i20;
        v.f.b bVarR;
        v.f.b bVar2;
        int i21;
        int i22;
        int iMax;
        int iMax2;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        w.b bVar3;
        w.b.InterfaceC0443b interfaceC0443b2;
        int i28;
        v.f fVar;
        int iZ2;
        int iQ2;
        int i29;
        int i30;
        f fVar2;
        w.b bVar4;
        w.b.InterfaceC0443b interfaceC0443b3;
        int iZ3;
        int iQ3;
        v.f fVar3;
        int iZ4;
        int iQ4;
        f fVar4;
        int i31;
        int iZ5;
        int iQ5;
        int size3;
        w.b.InterfaceC0443b interfaceC0443b4;
        int i32;
        c cVar;
        int childCount;
        int i33;
        int size4;
        int i34;
        View childAt;
        e eVar;
        b bVar5;
        b bVar6;
        v.f.b bVarR2;
        v.f.b bVar7;
        v.f fVar5;
        v.f.b bVarP;
        v.f.b bVarP2;
        v.f.b bVar8;
        boolean z14;
        f fVar6;
        m mVar;
        w.o oVar;
        int iMin;
        int iMin2;
        w.f fVar7;
        int i35;
        int i36;
        int i37;
        boolean z15;
        boolean z16;
        int i38;
        boolean z17;
        boolean z18;
        f fVar8;
        int i39;
        v.f fVar9;
        v.f.b bVarR3;
        boolean z19;
        v.f.b bVar9;
        boolean z20;
        boolean z21;
        boolean z22;
        int mode = View.MeasureSpec.getMode(i11);
        int size5 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size6 = View.MeasureSpec.getSize(i12);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i40 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        c cVar2 = this.mMeasurer;
        cVar2.f1476b = iMax3;
        cVar2.f1477c = iMax4;
        cVar2.f1478d = paddingWidth;
        cVar2.f1479e = i40;
        cVar2.f1480f = i11;
        cVar2.f1481g = i12;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        if (iMax5 > 0 || iMax6 > 0) {
            if (isRtl()) {
                i13 = iMax6;
            }
            i14 = size5 - paddingWidth;
            i15 = size6 - i40;
            setSelfDimensionBehaviour(gVar, mode, i14, mode2, i15);
            gVar.X0 = i13;
            gVar.Y0 = iMax3;
            bVar = gVar.Q0;
            Objects.requireNonNull(bVar);
            interfaceC0443b = gVar.T0;
            size = gVar.P0.size();
            iZ = gVar.z();
            iQ = gVar.q();
            zB = l.b(i10, 128);
            if (!zB || l.b(i10, 64)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i39 = 0;
                while (true) {
                    if (i39 < size) {
                        fVar9 = gVar.P0.get(i39);
                        bVarR3 = fVar9.r();
                        z19 = z10;
                        bVar9 = v.f.b.MATCH_CONSTRAINT;
                        if (bVarR3 == bVar9) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        if (fVar9.y() == bVar9) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (z20 || !z21 || fVar9.f36578b0 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                            z22 = false;
                        } else {
                            z22 = true;
                        }
                        if ((fVar9.G() || !z22) && !((fVar9.H() && z22) || (fVar9 instanceof n) || fVar9.G() || fVar9.H())) {
                            i39++;
                            z10 = z19;
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = z10;
                    }
                }
            } else {
                z11 = z10;
            }
            if (!z11 && (fVar8 = r.d.f34965r) != null) {
                fVar8.f34984c++;
            }
            z12 = ((mode != 1073741824 && mode2 == 1073741824) || zB) & z11;
            if (z12) {
                iMin = Math.min(gVar.F[0], i14);
                iMin2 = Math.min(gVar.F[1], i15);
                if (mode == 1073741824 && gVar.z() != iMin) {
                    gVar.Z(iMin);
                    gVar.k0();
                }
                if (mode2 == 1073741824 && gVar.q() != iMin2) {
                    gVar.U(iMin2);
                    gVar.k0();
                }
                if (mode == 1073741824 || mode2 != 1073741824) {
                    z13 = z12;
                    iZ = iZ;
                    fVar7 = gVar.R0;
                    if (fVar7.f37033b) {
                        for (v.f fVar10 : fVar7.f37032a.P0) {
                            fVar10.m();
                            fVar10.f36575a = false;
                            m mVar2 = fVar10.f36581d;
                            mVar2.f37074e.f37049j = false;
                            mVar2.f37076g = false;
                            mVar2.n();
                            w.o oVar2 = fVar10.f36583e;
                            oVar2.f37074e.f37049j = false;
                            oVar2.f37076g = false;
                            oVar2.m();
                        }
                        i35 = 0;
                        fVar7.f37032a.m();
                        g gVar2 = fVar7.f37032a;
                        gVar2.f36575a = false;
                        m mVar3 = gVar2.f36581d;
                        mVar3.f37074e.f37049j = false;
                        mVar3.f37076g = false;
                        mVar3.n();
                        w.o oVar3 = fVar7.f37032a.f36583e;
                        oVar3.f37074e.f37049j = false;
                        oVar3.f37076g = false;
                        oVar3.m();
                        fVar7.c();
                    } else {
                        i35 = 0;
                    }
                    fVar7.b(fVar7.f37035d);
                    g gVar3 = fVar7.f37032a;
                    gVar3.f36582d0 = i35;
                    gVar3.f36584e0 = i35;
                    gVar3.f36581d.f37077h.c(i35);
                    fVar7.f37032a.f36583e.f37077h.c(i35);
                    i36 = 1073741824;
                    if (mode == 1073741824) {
                        i37 = 1;
                        zJ0 = gVar.j0(zB, i35) & true;
                        i16 = 1;
                    } else {
                        i37 = 1;
                        zJ0 = true;
                        i16 = 0;
                    }
                    if (mode2 == 1073741824) {
                        zJ0 &= gVar.j0(zB, i37);
                        i16++;
                    }
                } else {
                    w.f fVar11 = gVar.R0;
                    boolean z23 = zB & true;
                    if (fVar11.f37033b || fVar11.f37034c) {
                        for (v.f fVar12 : fVar11.f37032a.P0) {
                            fVar12.m();
                            fVar12.f36575a = false;
                            fVar12.f36581d.n();
                            fVar12.f36583e.m();
                        }
                        i38 = 0;
                        fVar11.f37032a.m();
                        g gVar4 = fVar11.f37032a;
                        gVar4.f36575a = false;
                        gVar4.f36581d.n();
                        fVar11.f37032a.f36583e.m();
                        fVar11.f37034c = false;
                    } else {
                        i38 = 0;
                    }
                    fVar11.b(fVar11.f37035d);
                    g gVar5 = fVar11.f37032a;
                    gVar5.f36582d0 = i38;
                    gVar5.f36584e0 = i38;
                    v.f.b bVarP3 = gVar5.p(i38);
                    v.f.b bVarP4 = fVar11.f37032a.p(1);
                    if (fVar11.f37033b) {
                        fVar11.c();
                    }
                    int iA = fVar11.f37032a.A();
                    int iB = fVar11.f37032a.B();
                    fVar11.f37032a.f36581d.f37077h.c(iA);
                    fVar11.f37032a.f36583e.f37077h.c(iB);
                    fVar11.g();
                    v.f.b bVar10 = v.f.b.WRAP_CONTENT;
                    if (bVarP3 == bVar10 || bVarP4 == bVar10) {
                        if (z23) {
                            Iterator<q> it = fVar11.f37036e.iterator();
                            while (it.hasNext()) {
                                if (!it.next().k()) {
                                    z23 = false;
                                    break;
                                }
                            }
                        }
                        if (z23 && bVarP3 == v.f.b.WRAP_CONTENT) {
                            fVar11.f37032a.V(v.f.b.FIXED);
                            g gVar6 = fVar11.f37032a;
                            gVar6.Z(fVar11.d(gVar6, 0));
                            g gVar7 = fVar11.f37032a;
                            gVar7.f36581d.f37074e.c(gVar7.z());
                        }
                        if (z23 && bVarP4 == v.f.b.WRAP_CONTENT) {
                            fVar11.f37032a.Y(v.f.b.FIXED);
                            g gVar8 = fVar11.f37032a;
                            gVar8.U(fVar11.d(gVar8, 1));
                            g gVar9 = fVar11.f37032a;
                            gVar9.f36583e.f37074e.c(gVar9.q());
                        }
                    } else {
                        iZ = iZ;
                    }
                    g gVar10 = fVar11.f37032a;
                    v.f.b[] bVarArr = gVar10.X;
                    v.f.b bVar11 = bVarArr[0];
                    z13 = z12;
                    v.f.b bVar12 = v.f.b.FIXED;
                    if (bVar11 == bVar12 || bVarArr[0] == v.f.b.MATCH_PARENT) {
                        int iZ6 = gVar10.z() + iA;
                        fVar11.f37032a.f36581d.f37078i.c(iZ6);
                        fVar11.f37032a.f36581d.f37074e.c(iZ6 - iA);
                        fVar11.g();
                        g gVar11 = fVar11.f37032a;
                        v.f.b[] bVarArr2 = gVar11.X;
                        if (bVarArr2[1] == bVar12 || bVarArr2[1] == v.f.b.MATCH_PARENT) {
                            int iQ6 = gVar11.q() + iB;
                            fVar11.f37032a.f36583e.f37078i.c(iQ6);
                            fVar11.f37032a.f36583e.f37074e.c(iQ6 - iB);
                        }
                        fVar11.g();
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    for (q qVar : fVar11.f37036e) {
                        if (qVar.f37071b != fVar11.f37032a || qVar.f37076g) {
                            qVar.e();
                        }
                    }
                    Iterator<q> it2 = fVar11.f37036e.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z18 = true;
                            break;
                        }
                        q next = it2.next();
                        if (z17 || next.f37071b != fVar11.f37032a) {
                            if (!next.f37077h.f37049j || ((!next.f37078i.f37049j && !(next instanceof k)) || (!next.f37074e.f37049j && !(next instanceof w.c) && !(next instanceof k)))) {
                                z18 = false;
                                break;
                            }
                        }
                    }
                    fVar11.f37032a.V(bVarP3);
                    fVar11.f37032a.Y(bVarP4);
                    zJ0 = z18;
                    i36 = 1073741824;
                    i16 = 2;
                }
                if (zJ0) {
                    if (mode == i36) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (mode2 == i36) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    gVar.a0(z15, z16);
                }
            } else {
                z13 = z12;
                iZ = iZ;
                zJ0 = false;
                i16 = 0;
            }
            if (zJ0 || i16 != 2) {
                i17 = gVar.f36632d1;
                if (size > 0) {
                    size3 = gVar.P0.size();
                    boolean zM0 = gVar.m0(64);
                    interfaceC0443b4 = gVar.T0;
                    for (i32 = 0; i32 < size3; i32++) {
                        fVar5 = gVar.P0.get(i32);
                        if (!(fVar5 instanceof i) && !(fVar5 instanceof v.a) && !fVar5.J && (!zM0 || (mVar = fVar5.f36581d) == null || (oVar = fVar5.f36583e) == null || !mVar.f37074e.f37049j || !oVar.f37074e.f37049j)) {
                            bVarP = fVar5.p(0);
                            bVarP2 = fVar5.p(1);
                            bVar8 = v.f.b.MATCH_CONSTRAINT;
                            if (bVarP == bVar8 || fVar5.f36611s == 1 || bVarP2 != bVar8 || fVar5.f36613t == 1) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                            if (!z14 && gVar.m0(1) && !(fVar5 instanceof n)) {
                                if (bVarP == bVar8 && fVar5.f36611s == 0 && bVarP2 != bVar8 && !fVar5.G()) {
                                    z14 = true;
                                }
                                if (bVarP2 == bVar8 && fVar5.f36613t == 0 && bVarP != bVar8 && !fVar5.G()) {
                                    z14 = true;
                                }
                                if ((bVarP != bVar8 || bVarP2 == bVar8) && fVar5.f36578b0 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                }
                            }
                            if (z14) {
                                bVar.a(interfaceC0443b4, fVar5, 0);
                                fVar6 = gVar.V0;
                                if (fVar6 != null) {
                                    fVar6.f34982a++;
                                }
                            }
                        }
                    }
                    cVar = (c) interfaceC0443b4;
                    childCount = cVar.f1475a.getChildCount();
                    for (i33 = 0; i33 < childCount; i33++) {
                        childAt = cVar.f1475a.getChildAt(i33);
                        if (childAt instanceof e) {
                            eVar = (e) childAt;
                            if (eVar.f1615d == null) {
                                bVar5 = (b) eVar.getLayoutParams();
                                bVar6 = (b) eVar.f1615d.getLayoutParams();
                                bVar6.f1468u0.f36608q0 = 0;
                                bVarR2 = bVar5.f1468u0.r();
                                bVar7 = v.f.b.FIXED;
                                if (bVarR2 != bVar7) {
                                    bVar5.f1468u0.Z(bVar6.f1468u0.z());
                                }
                                if (bVar5.f1468u0.y() != bVar7) {
                                    bVar5.f1468u0.U(bVar6.f1468u0.q());
                                }
                                bVar6.f1468u0.f36608q0 = 8;
                            }
                        }
                    }
                    size4 = cVar.f1475a.mConstraintHelpers.size();
                    if (size4 > 0) {
                        for (i34 = 0; i34 < size4; i34++) {
                            Objects.requireNonNull((androidx.constraintlayout.widget.b) cVar.f1475a.mConstraintHelpers.get(i34));
                        }
                    }
                }
                bVar.c(gVar);
                size2 = bVar.f37017a.size();
                i18 = iZ;
                if (size > 0) {
                    i19 = 0;
                    bVar.b(gVar, 0, i18, iQ);
                } else {
                    i19 = 0;
                }
                if (size2 > 0) {
                    bVarR = gVar.r();
                    bVar2 = v.f.b.WRAP_CONTENT;
                    if (bVarR == bVar2) {
                        i21 = 1;
                    } else {
                        i21 = i19;
                    }
                    if (gVar.y() == bVar2) {
                        i22 = 1;
                    } else {
                        i22 = i19;
                    }
                    iMax = Math.max(gVar.z(), bVar.f37019c.f36596k0);
                    iMax2 = Math.max(gVar.q(), bVar.f37019c.f36598l0);
                    i23 = i19;
                    i24 = i23;
                    while (i23 < size2) {
                        fVar3 = bVar.f37017a.get(i23);
                        if (!(fVar3 instanceof n)) {
                            iZ4 = fVar3.z();
                            iQ4 = fVar3.q();
                            int i41 = i24 | (bVar.a(interfaceC0443b, fVar3, 1) ? 1 : 0);
                            fVar4 = gVar.V0;
                            i31 = i41;
                            if (fVar4 != null) {
                                fVar4.f34983b++;
                            }
                            iZ5 = fVar3.z();
                            iQ5 = fVar3.q();
                            if (iZ5 != iZ4) {
                                fVar3.Z(iZ5);
                                if (i21 != 0 && fVar3.u() > iMax) {
                                    iMax = Math.max(iMax, fVar3.n(v.d.b.RIGHT).e() + fVar3.u());
                                }
                                i31 = 1;
                            }
                            if (iQ5 != iQ4) {
                                fVar3.U(iQ5);
                                if (i22 != 0 && fVar3.o() > iMax2) {
                                    iMax2 = Math.max(iMax2, fVar3.n(v.d.b.BOTTOM).e() + fVar3.o());
                                }
                                i31 = 1;
                            }
                            i24 = (((n) fVar3).R0 ? 1 : 0) | i31;
                        }
                        i23++;
                        i17 = i17;
                    }
                    int i42 = i17;
                    i25 = 0;
                    i26 = 2;
                    while (i25 < i26) {
                        i27 = 0;
                        while (i27 < size2) {
                            fVar = bVar.f37017a.get(i27);
                            if (((fVar instanceof j) || (fVar instanceof n)) && !(fVar instanceof i)) {
                                if (fVar.f36608q0 == 8 && ((!z13 || !fVar.f36581d.f37074e.f37049j || !fVar.f36583e.f37074e.f37049j) && !(fVar instanceof n))) {
                                    iZ2 = fVar.z();
                                    iQ2 = fVar.q();
                                    int i43 = fVar.f36594j0;
                                    i29 = size2;
                                    i30 = (bVar.a(interfaceC0443b, fVar, i25 == 1 ? 2 : 1) ? 1 : 0) | i24;
                                    fVar2 = gVar.V0;
                                    bVar4 = bVar;
                                    interfaceC0443b3 = interfaceC0443b;
                                    if (fVar2 != null) {
                                        fVar2.f34983b++;
                                    }
                                    iZ3 = fVar.z();
                                    iQ3 = fVar.q();
                                    if (iZ3 != iZ2) {
                                        fVar.Z(iZ3);
                                        if (i21 != 0 && fVar.u() > iMax) {
                                            iMax = Math.max(iMax, fVar.n(v.d.b.RIGHT).e() + fVar.u());
                                        }
                                        i30 = 1;
                                    }
                                    if (iQ3 != iQ2) {
                                        fVar.U(iQ3);
                                        if (i22 != 0 && fVar.o() > iMax2) {
                                            iMax2 = Math.max(iMax2, fVar.n(v.d.b.BOTTOM).e() + fVar.o());
                                        }
                                        i30 = 1;
                                    }
                                    if (fVar.H || i43 == fVar.f36594j0) {
                                        i24 = i30;
                                    } else {
                                        i24 = 1;
                                    }
                                }
                                i27++;
                                size2 = i29;
                                bVar = bVar4;
                                interfaceC0443b = interfaceC0443b3;
                            }
                            bVar4 = bVar;
                            interfaceC0443b3 = interfaceC0443b;
                            i29 = size2;
                            i27++;
                            size2 = i29;
                            bVar = bVar4;
                            interfaceC0443b = interfaceC0443b3;
                        }
                        bVar3 = bVar;
                        interfaceC0443b2 = interfaceC0443b;
                        i28 = size2;
                        if (i24 != 0) {
                            break;
                        }
                        i25++;
                        bVar = bVar3;
                        bVar.b(gVar, i25, i18, iQ);
                        size2 = i28;
                        interfaceC0443b = interfaceC0443b2;
                        i26 = 2;
                        i24 = 0;
                    }
                    i20 = i42;
                } else {
                    i20 = i17;
                }
                gVar.o0(i20);
            }
            return;
        }
        iMax5 = Math.max(0, getPaddingLeft());
        i13 = iMax5;
        i14 = size5 - paddingWidth;
        i15 = size6 - i40;
        setSelfDimensionBehaviour(gVar, mode, i14, mode2, i15);
        gVar.X0 = i13;
        gVar.Y0 = iMax3;
        bVar = gVar.Q0;
        Objects.requireNonNull(bVar);
        interfaceC0443b = gVar.T0;
        size = gVar.P0.size();
        iZ = gVar.z();
        iQ = gVar.q();
        zB = l.b(i10, 128);
        if (zB) {
            z10 = true;
        } else {
            z10 = true;
        }
        if (z10) {
            i39 = 0;
            while (true) {
                if (i39 < size) {
                    fVar9 = gVar.P0.get(i39);
                    bVarR3 = fVar9.r();
                    z19 = z10;
                    bVar9 = v.f.b.MATCH_CONSTRAINT;
                    if (bVarR3 == bVar9) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    if (fVar9.y() == bVar9) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if (z20) {
                        z22 = false;
                    } else {
                        z22 = false;
                    }
                    if (fVar9.G()) {
                        i39++;
                        z10 = z19;
                    } else {
                        i39++;
                        z10 = z19;
                    }
                    z11 = false;
                } else {
                    z11 = z10;
                }
            }
        } else {
            z11 = z10;
        }
        if (!z11) {
        }
        z12 = ((mode != 1073741824 && mode2 == 1073741824) || zB) & z11;
        if (z12) {
            iMin = Math.min(gVar.F[0], i14);
            iMin2 = Math.min(gVar.F[1], i15);
            if (mode == 1073741824) {
                gVar.Z(iMin);
                gVar.k0();
            }
            if (mode2 == 1073741824) {
                gVar.U(iMin2);
                gVar.k0();
            }
            if (mode == 1073741824) {
                z13 = z12;
                iZ = iZ;
                fVar7 = gVar.R0;
                if (fVar7.f37033b) {
                    while (r4.hasNext()) {
                        fVar10.m();
                        fVar10.f36575a = false;
                        m mVar4 = fVar10.f36581d;
                        mVar4.f37074e.f37049j = false;
                        mVar4.f37076g = false;
                        mVar4.n();
                        w.o oVar4 = fVar10.f36583e;
                        oVar4.f37074e.f37049j = false;
                        oVar4.f37076g = false;
                        oVar4.m();
                    }
                    i35 = 0;
                    fVar7.f37032a.m();
                    g gVar12 = fVar7.f37032a;
                    gVar12.f36575a = false;
                    m mVar5 = gVar12.f36581d;
                    mVar5.f37074e.f37049j = false;
                    mVar5.f37076g = false;
                    mVar5.n();
                    w.o oVar5 = fVar7.f37032a.f36583e;
                    oVar5.f37074e.f37049j = false;
                    oVar5.f37076g = false;
                    oVar5.m();
                    fVar7.c();
                } else {
                    i35 = 0;
                }
                fVar7.b(fVar7.f37035d);
                g gVar13 = fVar7.f37032a;
                gVar13.f36582d0 = i35;
                gVar13.f36584e0 = i35;
                gVar13.f36581d.f37077h.c(i35);
                fVar7.f37032a.f36583e.f37077h.c(i35);
                i36 = 1073741824;
                if (mode == 1073741824) {
                    i37 = 1;
                    zJ0 = gVar.j0(zB, i35) & true;
                    i16 = 1;
                } else {
                    i37 = 1;
                    zJ0 = true;
                    i16 = 0;
                }
                if (mode2 == 1073741824) {
                    zJ0 &= gVar.j0(zB, i37);
                    i16++;
                }
            } else {
                z13 = z12;
                iZ = iZ;
                fVar7 = gVar.R0;
                if (fVar7.f37033b) {
                    while (r4.hasNext()) {
                        fVar10.m();
                        fVar10.f36575a = false;
                        m mVar6 = fVar10.f36581d;
                        mVar6.f37074e.f37049j = false;
                        mVar6.f37076g = false;
                        mVar6.n();
                        w.o oVar6 = fVar10.f36583e;
                        oVar6.f37074e.f37049j = false;
                        oVar6.f37076g = false;
                        oVar6.m();
                    }
                    i35 = 0;
                    fVar7.f37032a.m();
                    g gVar14 = fVar7.f37032a;
                    gVar14.f36575a = false;
                    m mVar7 = gVar14.f36581d;
                    mVar7.f37074e.f37049j = false;
                    mVar7.f37076g = false;
                    mVar7.n();
                    w.o oVar7 = fVar7.f37032a.f36583e;
                    oVar7.f37074e.f37049j = false;
                    oVar7.f37076g = false;
                    oVar7.m();
                    fVar7.c();
                } else {
                    i35 = 0;
                }
                fVar7.b(fVar7.f37035d);
                g gVar15 = fVar7.f37032a;
                gVar15.f36582d0 = i35;
                gVar15.f36584e0 = i35;
                gVar15.f36581d.f37077h.c(i35);
                fVar7.f37032a.f36583e.f37077h.c(i35);
                i36 = 1073741824;
                if (mode == 1073741824) {
                    i37 = 1;
                    zJ0 = gVar.j0(zB, i35) & true;
                    i16 = 1;
                } else {
                    i37 = 1;
                    zJ0 = true;
                    i16 = 0;
                }
                if (mode2 == 1073741824) {
                    zJ0 &= gVar.j0(zB, i37);
                    i16++;
                }
            }
            if (zJ0) {
                if (mode == i36) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (mode2 == i36) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                gVar.a0(z15, z16);
            }
        } else {
            z13 = z12;
            iZ = iZ;
            zJ0 = false;
            i16 = 0;
        }
        if (zJ0) {
        }
        i17 = gVar.f36632d1;
        if (size > 0) {
            size3 = gVar.P0.size();
            boolean zM1 = gVar.m0(64);
            interfaceC0443b4 = gVar.T0;
            while (i32 < size3) {
                fVar5 = gVar.P0.get(i32);
                if (!(fVar5 instanceof i)) {
                    bVarP = fVar5.p(0);
                    bVarP2 = fVar5.p(1);
                    bVar8 = v.f.b.MATCH_CONSTRAINT;
                    if (bVarP == bVar8) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        if (bVarP == bVar8) {
                            z14 = true;
                        }
                        if (bVarP2 == bVar8) {
                            z14 = true;
                        }
                        z14 = bVarP != bVar8 ? true : true;
                    }
                    if (z14) {
                        bVar.a(interfaceC0443b4, fVar5, 0);
                        fVar6 = gVar.V0;
                        if (fVar6 != null) {
                            fVar6.f34982a++;
                        }
                    }
                }
            }
            cVar = (c) interfaceC0443b4;
            childCount = cVar.f1475a.getChildCount();
            while (i33 < childCount) {
                childAt = cVar.f1475a.getChildAt(i33);
                if (childAt instanceof e) {
                    eVar = (e) childAt;
                    if (eVar.f1615d == null) {
                        bVar5 = (b) eVar.getLayoutParams();
                        bVar6 = (b) eVar.f1615d.getLayoutParams();
                        bVar6.f1468u0.f36608q0 = 0;
                        bVarR2 = bVar5.f1468u0.r();
                        bVar7 = v.f.b.FIXED;
                        if (bVarR2 != bVar7) {
                            bVar5.f1468u0.Z(bVar6.f1468u0.z());
                        }
                        if (bVar5.f1468u0.y() != bVar7) {
                            bVar5.f1468u0.U(bVar6.f1468u0.q());
                        }
                        bVar6.f1468u0.f36608q0 = 8;
                    }
                }
            }
            size4 = cVar.f1475a.mConstraintHelpers.size();
            if (size4 > 0) {
                while (i34 < size4) {
                    Objects.requireNonNull((androidx.constraintlayout.widget.b) cVar.f1475a.mConstraintHelpers.get(i34));
                }
            }
        }
        bVar.c(gVar);
        size2 = bVar.f37017a.size();
        i18 = iZ;
        if (size > 0) {
            i19 = 0;
            bVar.b(gVar, 0, i18, iQ);
        } else {
            i19 = 0;
        }
        if (size2 > 0) {
            bVarR = gVar.r();
            bVar2 = v.f.b.WRAP_CONTENT;
            if (bVarR == bVar2) {
                i21 = 1;
            } else {
                i21 = i19;
            }
            if (gVar.y() == bVar2) {
                i22 = 1;
            } else {
                i22 = i19;
            }
            iMax = Math.max(gVar.z(), bVar.f37019c.f36596k0);
            iMax2 = Math.max(gVar.q(), bVar.f37019c.f36598l0);
            i23 = i19;
            i24 = i23;
            while (i23 < size2) {
                fVar3 = bVar.f37017a.get(i23);
                if (!(fVar3 instanceof n)) {
                    iZ4 = fVar3.z();
                    iQ4 = fVar3.q();
                    int i44 = i24 | (bVar.a(interfaceC0443b, fVar3, 1) ? 1 : 0);
                    fVar4 = gVar.V0;
                    i31 = i44;
                    if (fVar4 != null) {
                        fVar4.f34983b++;
                    }
                    iZ5 = fVar3.z();
                    iQ5 = fVar3.q();
                    if (iZ5 != iZ4) {
                        fVar3.Z(iZ5);
                        if (i21 != 0) {
                            iMax = Math.max(iMax, fVar3.n(v.d.b.RIGHT).e() + fVar3.u());
                        }
                        i31 = 1;
                    }
                    if (iQ5 != iQ4) {
                        fVar3.U(iQ5);
                        if (i22 != 0) {
                            iMax2 = Math.max(iMax2, fVar3.n(v.d.b.BOTTOM).e() + fVar3.o());
                        }
                        i31 = 1;
                    }
                    i24 = (((n) fVar3).R0 ? 1 : 0) | i31;
                }
                i23++;
                i17 = i17;
            }
            int i45 = i17;
            i25 = 0;
            i26 = 2;
            while (i25 < i26) {
                i27 = 0;
                while (i27 < size2) {
                    fVar = bVar.f37017a.get(i27);
                    if (fVar instanceof j) {
                        if (fVar.f36608q0 == 8) {
                            bVar4 = bVar;
                            interfaceC0443b3 = interfaceC0443b;
                            i29 = size2;
                        } else {
                            iZ2 = fVar.z();
                            iQ2 = fVar.q();
                            int i46 = fVar.f36594j0;
                            i29 = size2;
                            i30 = (bVar.a(interfaceC0443b, fVar, i25 == 1 ? 2 : 1) ? 1 : 0) | i24;
                            fVar2 = gVar.V0;
                            bVar4 = bVar;
                            interfaceC0443b3 = interfaceC0443b;
                            if (fVar2 != null) {
                                fVar2.f34983b++;
                            }
                            iZ3 = fVar.z();
                            iQ3 = fVar.q();
                            if (iZ3 != iZ2) {
                                fVar.Z(iZ3);
                                if (i21 != 0) {
                                    iMax = Math.max(iMax, fVar.n(v.d.b.RIGHT).e() + fVar.u());
                                }
                                i30 = 1;
                            }
                            if (iQ3 != iQ2) {
                                fVar.U(iQ3);
                                if (i22 != 0) {
                                    iMax2 = Math.max(iMax2, fVar.n(v.d.b.BOTTOM).e() + fVar.o());
                                }
                                i30 = 1;
                            }
                            if (fVar.H) {
                                i24 = i30;
                            } else {
                                i24 = i30;
                            }
                        }
                    } else if (fVar.f36608q0 == 8) {
                        bVar4 = bVar;
                        interfaceC0443b3 = interfaceC0443b;
                        i29 = size2;
                    } else {
                        iZ2 = fVar.z();
                        iQ2 = fVar.q();
                        int i47 = fVar.f36594j0;
                        i29 = size2;
                        i30 = (bVar.a(interfaceC0443b, fVar, i25 == 1 ? 2 : 1) ? 1 : 0) | i24;
                        fVar2 = gVar.V0;
                        bVar4 = bVar;
                        interfaceC0443b3 = interfaceC0443b;
                        if (fVar2 != null) {
                            fVar2.f34983b++;
                        }
                        iZ3 = fVar.z();
                        iQ3 = fVar.q();
                        if (iZ3 != iZ2) {
                            fVar.Z(iZ3);
                            if (i21 != 0) {
                                iMax = Math.max(iMax, fVar.n(v.d.b.RIGHT).e() + fVar.u());
                            }
                            i30 = 1;
                        }
                        if (iQ3 != iQ2) {
                            fVar.U(iQ3);
                            if (i22 != 0) {
                                iMax2 = Math.max(iMax2, fVar.n(v.d.b.BOTTOM).e() + fVar.o());
                            }
                            i30 = 1;
                        }
                        if (fVar.H) {
                            i24 = i30;
                        } else {
                            i24 = i30;
                        }
                    }
                    i27++;
                    size2 = i29;
                    bVar = bVar4;
                    interfaceC0443b = interfaceC0443b3;
                }
                bVar3 = bVar;
                interfaceC0443b2 = interfaceC0443b;
                i28 = size2;
                if (i24 != 0) {
                    break;
                    break;
                }
                i25++;
                bVar = bVar3;
                bVar.b(gVar, i25, i18, iQ);
                size2 = i28;
                interfaceC0443b = interfaceC0443b2;
                i26 = 2;
                i24 = 0;
            }
            i20 = i45;
        } else {
            i20 = i17;
        }
        gVar.o0(i20);
    }

    public void setConstraintSet(androidx.constraintlayout.widget.c cVar) {
        this.mConstraintSet = cVar;
    }

    public void setDesignInformation(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf(DialogConfigs.DIRECTORY_SEPERATOR);
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.mDesignIds.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.mChildrenByIds.remove(getId());
        super.setId(i10);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(z.b bVar) {
        this.mConstraintsChangedListener = bVar;
        z.a aVar = this.mConstraintLayoutSpec;
        if (aVar != null) {
            aVar.f44921f = bVar;
        }
    }

    public void setOptimizationLevel(int i10) {
        this.mOptimizationLevel = i10;
        g gVar = this.mLayoutWidget;
        gVar.f36632d1 = i10;
        r.d.f34963p = gVar.m0(512);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c A[PHI: r9
  0x002c: PHI (r9v2 v.f$b) = (r9v1 v.f$b), (r9v8 v.f$b) binds: [B:13:0x002a, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x004b A[PHI: r2
  0x004b: PHI (r2v2 v.f$b) = (r2v1 v.f$b), (r2v4 v.f$b) binds: [B:24:0x0049, B:21:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    public void setSelfDimensionBehaviour(g gVar, int i10, int i11, int i12, int i13) {
        v.f.b bVar;
        c cVar = this.mMeasurer;
        int i14 = cVar.f1479e;
        int i15 = cVar.f1478d;
        v.f.b bVar2 = v.f.b.FIXED;
        int childCount = getChildCount();
        if (i10 != Integer.MIN_VALUE) {
            if (i10 == 0) {
                bVar = v.f.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i11 = Math.max(0, this.mMinWidth);
                }
            } else if (i10 != 1073741824) {
                bVar = bVar2;
            } else {
                i11 = Math.min(this.mMaxWidth - i15, i11);
                bVar = bVar2;
            }
            i11 = 0;
        } else {
            bVar = v.f.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.mMinWidth);
            }
        }
        if (i12 != Integer.MIN_VALUE) {
            if (i12 == 0) {
                bVar2 = v.f.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i13 = Math.max(0, this.mMinHeight);
                }
            } else if (i12 == 1073741824) {
                i13 = Math.min(this.mMaxHeight - i14, i13);
            }
            i13 = 0;
        } else {
            bVar2 = v.f.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.mMinHeight);
            }
        }
        if (i11 != gVar.z() || i13 != gVar.q()) {
            gVar.R0.f37034c = true;
        }
        gVar.f36582d0 = 0;
        gVar.f36584e0 = 0;
        int i16 = this.mMaxWidth - i15;
        int[] iArr = gVar.F;
        iArr[0] = i16;
        iArr[1] = this.mMaxHeight - i14;
        gVar.X(0);
        gVar.W(0);
        gVar.V(bVar);
        gVar.Z(i11);
        gVar.Y(bVar2);
        gVar.U(i13);
        gVar.X(this.mMinWidth - i15);
        gVar.W(this.mMinHeight - i14);
    }

    public void setState(int i10, int i11, int i12) {
        z.a aVar = this.mConstraintLayoutSpec;
        if (aVar != null) {
            aVar.b(i10, i11, i12);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
