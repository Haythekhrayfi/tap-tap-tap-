package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import com.developer.filepicker.model.DialogConfigs;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import y.r;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f1501g = {0, 4, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static SparseIntArray f1502h = new SparseIntArray();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static SparseIntArray f1503i = new SparseIntArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1505b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1506c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.widget.a> f1507d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1508e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap<Integer, a> f1509f = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f1511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f1512c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C0027c f1513d = new C0027c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f1514e = new b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e f1515f = new e();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f1516g = new HashMap<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C0026a f1517h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$a$a, reason: collision with other inner class name */
        public static class C0026a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int[] f1518a = new int[10];

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int[] f1519b = new int[10];

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f1520c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int[] f1521d = new int[10];

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float[] f1522e = new float[10];

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f1523f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int[] f1524g = new int[5];

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public String[] f1525h = new String[5];

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public int f1526i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int[] f1527j = new int[4];

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean[] f1528k = new boolean[4];

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f1529l = 0;

            public void a(int i10, float f10) {
                int i11 = this.f1523f;
                int[] iArr = this.f1521d;
                if (i11 >= iArr.length) {
                    this.f1521d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1522e;
                    this.f1522e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1521d;
                int i12 = this.f1523f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f1522e;
                this.f1523f = i12 + 1;
                fArr2[i12] = f10;
            }

            public void b(int i10, int i11) {
                int i12 = this.f1520c;
                int[] iArr = this.f1518a;
                if (i12 >= iArr.length) {
                    this.f1518a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1519b;
                    this.f1519b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1518a;
                int i13 = this.f1520c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f1519b;
                this.f1520c = i13 + 1;
                iArr4[i13] = i11;
            }

            public void c(int i10, String str) {
                int i11 = this.f1526i;
                int[] iArr = this.f1524g;
                if (i11 >= iArr.length) {
                    this.f1524g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1525h;
                    this.f1525h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1524g;
                int i12 = this.f1526i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f1525h;
                this.f1526i = i12 + 1;
                strArr2[i12] = str;
            }

            public void d(int i10, boolean z10) {
                int i11 = this.f1529l;
                int[] iArr = this.f1527j;
                if (i11 >= iArr.length) {
                    this.f1527j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1528k;
                    this.f1528k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1527j;
                int i12 = this.f1529l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f1528k;
                this.f1529l = i12 + 1;
                zArr2[i12] = z10;
            }

            public void e(a aVar) {
                for (int i10 = 0; i10 < this.f1520c; i10++) {
                    int i11 = this.f1518a[i10];
                    int i12 = this.f1519b[i10];
                    int[] iArr = c.f1501g;
                    if (i11 == 6) {
                        aVar.f1514e.D = i12;
                    } else if (i11 == 7) {
                        aVar.f1514e.E = i12;
                    } else if (i11 == 8) {
                        aVar.f1514e.K = i12;
                    } else if (i11 == 27) {
                        aVar.f1514e.F = i12;
                    } else if (i11 == 28) {
                        aVar.f1514e.H = i12;
                    } else if (i11 == 41) {
                        aVar.f1514e.W = i12;
                    } else if (i11 == 42) {
                        aVar.f1514e.X = i12;
                    } else if (i11 == 61) {
                        aVar.f1514e.A = i12;
                    } else if (i11 == 62) {
                        aVar.f1514e.B = i12;
                    } else if (i11 == 72) {
                        aVar.f1514e.f1544g0 = i12;
                    } else if (i11 == 73) {
                        aVar.f1514e.f1546h0 = i12;
                    } else if (i11 == 2) {
                        aVar.f1514e.J = i12;
                    } else if (i11 == 31) {
                        aVar.f1514e.L = i12;
                    } else if (i11 == 34) {
                        aVar.f1514e.I = i12;
                    } else if (i11 == 38) {
                        aVar.f1510a = i12;
                    } else if (i11 == 64) {
                        aVar.f1513d.f1575b = i12;
                    } else if (i11 == 66) {
                        aVar.f1513d.f1579f = i12;
                    } else if (i11 == 76) {
                        aVar.f1513d.f1578e = i12;
                    } else if (i11 == 78) {
                        aVar.f1512c.f1590c = i12;
                    } else if (i11 == 97) {
                        aVar.f1514e.f1562p0 = i12;
                    } else if (i11 == 93) {
                        aVar.f1514e.M = i12;
                    } else if (i11 != 94) {
                        switch (i11) {
                            case 11:
                                aVar.f1514e.Q = i12;
                                break;
                            case 12:
                                aVar.f1514e.R = i12;
                                break;
                            case 13:
                                aVar.f1514e.N = i12;
                                break;
                            case 14:
                                aVar.f1514e.P = i12;
                                break;
                            case 15:
                                aVar.f1514e.S = i12;
                                break;
                            case 16:
                                aVar.f1514e.O = i12;
                                break;
                            case 17:
                                aVar.f1514e.f1539e = i12;
                                break;
                            case 18:
                                aVar.f1514e.f1541f = i12;
                                break;
                            default:
                                switch (i11) {
                                    case 21:
                                        aVar.f1514e.f1537d = i12;
                                        break;
                                    case 22:
                                        aVar.f1512c.f1589b = i12;
                                        break;
                                    case 23:
                                        aVar.f1514e.f1535c = i12;
                                        break;
                                    case 24:
                                        aVar.f1514e.G = i12;
                                        break;
                                    default:
                                        switch (i11) {
                                            case 54:
                                                aVar.f1514e.Y = i12;
                                                break;
                                            case 55:
                                                aVar.f1514e.Z = i12;
                                                break;
                                            case 56:
                                                aVar.f1514e.f1532a0 = i12;
                                                break;
                                            case 57:
                                                aVar.f1514e.f1534b0 = i12;
                                                break;
                                            case 58:
                                                aVar.f1514e.f1536c0 = i12;
                                                break;
                                            case 59:
                                                aVar.f1514e.f1538d0 = i12;
                                                break;
                                            default:
                                                switch (i11) {
                                                    case 82:
                                                        aVar.f1513d.f1576c = i12;
                                                        break;
                                                    case 83:
                                                        aVar.f1515f.f1602i = i12;
                                                        break;
                                                    case 84:
                                                        aVar.f1513d.f1584k = i12;
                                                        break;
                                                    default:
                                                        switch (i11) {
                                                            case 87:
                                                                break;
                                                            case 88:
                                                                aVar.f1513d.f1586m = i12;
                                                                break;
                                                            case 89:
                                                                aVar.f1513d.f1587n = i12;
                                                                break;
                                                            default:
                                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        aVar.f1514e.T = i12;
                    }
                }
                for (int i13 = 0; i13 < this.f1523f; i13++) {
                    int i14 = this.f1521d[i13];
                    float f10 = this.f1522e[i13];
                    int[] iArr2 = c.f1501g;
                    if (i14 == 19) {
                        aVar.f1514e.f1543g = f10;
                    } else if (i14 == 20) {
                        aVar.f1514e.f1570x = f10;
                    } else if (i14 == 37) {
                        aVar.f1514e.f1571y = f10;
                    } else if (i14 == 60) {
                        aVar.f1515f.f1595b = f10;
                    } else if (i14 == 63) {
                        aVar.f1514e.C = f10;
                    } else if (i14 == 79) {
                        aVar.f1513d.f1580g = f10;
                    } else if (i14 == 85) {
                        aVar.f1513d.f1583j = f10;
                    } else if (i14 != 87) {
                        if (i14 == 39) {
                            aVar.f1514e.V = f10;
                        } else if (i14 != 40) {
                            switch (i14) {
                                case 43:
                                    aVar.f1512c.f1591d = f10;
                                    break;
                                case 44:
                                    e eVar = aVar.f1515f;
                                    eVar.f1607n = f10;
                                    eVar.f1606m = true;
                                    break;
                                case 45:
                                    aVar.f1515f.f1596c = f10;
                                    break;
                                case 46:
                                    aVar.f1515f.f1597d = f10;
                                    break;
                                case 47:
                                    aVar.f1515f.f1598e = f10;
                                    break;
                                case 48:
                                    aVar.f1515f.f1599f = f10;
                                    break;
                                case 49:
                                    aVar.f1515f.f1600g = f10;
                                    break;
                                case 50:
                                    aVar.f1515f.f1601h = f10;
                                    break;
                                case 51:
                                    aVar.f1515f.f1603j = f10;
                                    break;
                                case 52:
                                    aVar.f1515f.f1604k = f10;
                                    break;
                                case 53:
                                    aVar.f1515f.f1605l = f10;
                                    break;
                                default:
                                    switch (i14) {
                                        case 67:
                                            aVar.f1513d.f1582i = f10;
                                            break;
                                        case 68:
                                            aVar.f1512c.f1592e = f10;
                                            break;
                                        case 69:
                                            aVar.f1514e.f1540e0 = f10;
                                            break;
                                        case 70:
                                            aVar.f1514e.f1542f0 = f10;
                                            break;
                                        default:
                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            aVar.f1514e.U = f10;
                        }
                    }
                }
                for (int i15 = 0; i15 < this.f1526i; i15++) {
                    int i16 = this.f1524g[i15];
                    String str = this.f1525h[i15];
                    int[] iArr3 = c.f1501g;
                    if (i16 == 5) {
                        aVar.f1514e.f1572z = str;
                    } else if (i16 == 65) {
                        aVar.f1513d.f1577d = str;
                    } else if (i16 == 74) {
                        b bVar = aVar.f1514e;
                        bVar.f1552k0 = str;
                        bVar.f1550j0 = null;
                    } else if (i16 == 77) {
                        aVar.f1514e.f1554l0 = str;
                    } else if (i16 != 87) {
                        if (i16 != 90) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            aVar.f1513d.f1585l = str;
                        }
                    }
                }
                for (int i17 = 0; i17 < this.f1529l; i17++) {
                    int i18 = this.f1527j[i17];
                    boolean z10 = this.f1528k[i17];
                    int[] iArr4 = c.f1501g;
                    if (i18 == 44) {
                        aVar.f1515f.f1606m = z10;
                    } else if (i18 == 75) {
                        aVar.f1514e.f1560o0 = z10;
                    } else if (i18 != 87) {
                        if (i18 == 80) {
                            aVar.f1514e.f1556m0 = z10;
                        } else if (i18 != 81) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            aVar.f1514e.f1558n0 = z10;
                        }
                    }
                }
            }
        }

        public void a(ConstraintLayout.b bVar) {
            b bVar2 = this.f1514e;
            bVar.f1435e = bVar2.f1547i;
            bVar.f1437f = bVar2.f1549j;
            bVar.f1439g = bVar2.f1551k;
            bVar.f1441h = bVar2.f1553l;
            bVar.f1443i = bVar2.f1555m;
            bVar.f1445j = bVar2.f1557n;
            bVar.f1447k = bVar2.f1559o;
            bVar.f1449l = bVar2.f1561p;
            bVar.f1451m = bVar2.f1563q;
            bVar.f1453n = bVar2.f1564r;
            bVar.f1455o = bVar2.f1565s;
            bVar.f1463s = bVar2.f1566t;
            bVar.f1465t = bVar2.f1567u;
            bVar.f1467u = bVar2.f1568v;
            bVar.f1469v = bVar2.f1569w;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.G;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.J;
            bVar.A = bVar2.S;
            bVar.B = bVar2.R;
            bVar.f1471x = bVar2.O;
            bVar.f1473z = bVar2.Q;
            bVar.G = bVar2.f1570x;
            bVar.H = bVar2.f1571y;
            bVar.f1457p = bVar2.A;
            bVar.f1459q = bVar2.B;
            bVar.f1461r = bVar2.C;
            bVar.I = bVar2.f1572z;
            bVar.X = bVar2.D;
            bVar.Y = bVar2.E;
            bVar.M = bVar2.U;
            bVar.L = bVar2.V;
            bVar.O = bVar2.X;
            bVar.N = bVar2.W;
            bVar.f1428a0 = bVar2.f1556m0;
            bVar.f1430b0 = bVar2.f1558n0;
            bVar.P = bVar2.Y;
            bVar.Q = bVar2.Z;
            bVar.T = bVar2.f1532a0;
            bVar.U = bVar2.f1534b0;
            bVar.R = bVar2.f1536c0;
            bVar.S = bVar2.f1538d0;
            bVar.V = bVar2.f1540e0;
            bVar.W = bVar2.f1542f0;
            bVar.Z = bVar2.F;
            bVar.f1431c = bVar2.f1543g;
            bVar.f1427a = bVar2.f1539e;
            bVar.f1429b = bVar2.f1541f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f1535c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f1537d;
            String str = bVar2.f1554l0;
            if (str != null) {
                bVar.f1432c0 = str;
            }
            bVar.f1434d0 = bVar2.f1562p0;
            bVar.setMarginStart(bVar2.L);
            bVar.setMarginEnd(this.f1514e.K);
            bVar.a();
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f1514e.a(this.f1514e);
            aVar.f1513d.a(this.f1513d);
            aVar.f1512c.a(this.f1512c);
            aVar.f1515f.a(this.f1515f);
            aVar.f1510a = this.f1510a;
            aVar.f1517h = this.f1517h;
            return aVar;
        }

        public final void c(int i10, ConstraintLayout.b bVar) {
            this.f1510a = i10;
            b bVar2 = this.f1514e;
            bVar2.f1547i = bVar.f1435e;
            bVar2.f1549j = bVar.f1437f;
            bVar2.f1551k = bVar.f1439g;
            bVar2.f1553l = bVar.f1441h;
            bVar2.f1555m = bVar.f1443i;
            bVar2.f1557n = bVar.f1445j;
            bVar2.f1559o = bVar.f1447k;
            bVar2.f1561p = bVar.f1449l;
            bVar2.f1563q = bVar.f1451m;
            bVar2.f1564r = bVar.f1453n;
            bVar2.f1565s = bVar.f1455o;
            bVar2.f1566t = bVar.f1463s;
            bVar2.f1567u = bVar.f1465t;
            bVar2.f1568v = bVar.f1467u;
            bVar2.f1569w = bVar.f1469v;
            bVar2.f1570x = bVar.G;
            bVar2.f1571y = bVar.H;
            bVar2.f1572z = bVar.I;
            bVar2.A = bVar.f1457p;
            bVar2.B = bVar.f1459q;
            bVar2.C = bVar.f1461r;
            bVar2.D = bVar.X;
            bVar2.E = bVar.Y;
            bVar2.F = bVar.Z;
            bVar2.f1543g = bVar.f1431c;
            bVar2.f1539e = bVar.f1427a;
            bVar2.f1541f = bVar.f1429b;
            bVar2.f1535c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f1537d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.G = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.M = bVar.D;
            bVar2.U = bVar.M;
            bVar2.V = bVar.L;
            bVar2.X = bVar.O;
            bVar2.W = bVar.N;
            bVar2.f1556m0 = bVar.f1428a0;
            bVar2.f1558n0 = bVar.f1430b0;
            bVar2.Y = bVar.P;
            bVar2.Z = bVar.Q;
            bVar2.f1532a0 = bVar.T;
            bVar2.f1534b0 = bVar.U;
            bVar2.f1536c0 = bVar.R;
            bVar2.f1538d0 = bVar.S;
            bVar2.f1540e0 = bVar.V;
            bVar2.f1542f0 = bVar.W;
            bVar2.f1554l0 = bVar.f1432c0;
            bVar2.O = bVar.f1471x;
            bVar2.Q = bVar.f1473z;
            bVar2.N = bVar.f1470w;
            bVar2.P = bVar.f1472y;
            bVar2.S = bVar.A;
            bVar2.R = bVar.B;
            bVar2.T = bVar.C;
            bVar2.f1562p0 = bVar.f1434d0;
            bVar2.K = bVar.getMarginEnd();
            this.f1514e.L = bVar.getMarginStart();
        }

        public final void d(int i10, androidx.constraintlayout.widget.d.a aVar) {
            c(i10, aVar);
            this.f1512c.f1591d = aVar.f1609v0;
            e eVar = this.f1515f;
            eVar.f1595b = aVar.f1612y0;
            eVar.f1596c = aVar.f1613z0;
            eVar.f1597d = aVar.A0;
            eVar.f1598e = aVar.B0;
            eVar.f1599f = aVar.C0;
            eVar.f1600g = aVar.D0;
            eVar.f1601h = aVar.E0;
            eVar.f1603j = aVar.F0;
            eVar.f1604k = aVar.G0;
            eVar.f1605l = aVar.H0;
            eVar.f1607n = aVar.f1611x0;
            eVar.f1606m = aVar.f1610w0;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static SparseIntArray f1530q0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1537d;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public int[] f1550j0;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public String f1552k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public String f1554l0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1531a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1533b = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1539e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1541f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f1543g = -1.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f1545h = true;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1547i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1549j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1551k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1553l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1555m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1557n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f1559o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f1561p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1563q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f1564r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f1565s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f1566t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f1567u = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f1568v = -1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f1569w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public float f1570x = 0.5f;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f1571y = 0.5f;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f1572z = null;
        public int A = -1;
        public int B = 0;
        public float C = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f1532a0 = 0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f1534b0 = 0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f1536c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f1538d0 = 0;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public float f1540e0 = 1.0f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public float f1542f0 = 1.0f;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public int f1544g0 = -1;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f1546h0 = 0;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f1548i0 = -1;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public boolean f1556m0 = false;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public boolean f1558n0 = false;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f1560o0 = true;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f1562p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1530q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            f1530q0.append(44, 25);
            f1530q0.append(46, 28);
            f1530q0.append(47, 29);
            f1530q0.append(52, 35);
            f1530q0.append(51, 34);
            f1530q0.append(24, 4);
            f1530q0.append(23, 3);
            f1530q0.append(19, 1);
            f1530q0.append(61, 6);
            f1530q0.append(62, 7);
            f1530q0.append(31, 17);
            f1530q0.append(32, 18);
            f1530q0.append(33, 19);
            f1530q0.append(15, 90);
            f1530q0.append(0, 26);
            f1530q0.append(48, 31);
            f1530q0.append(49, 32);
            f1530q0.append(30, 10);
            f1530q0.append(29, 9);
            f1530q0.append(66, 13);
            f1530q0.append(69, 16);
            f1530q0.append(67, 14);
            f1530q0.append(64, 11);
            f1530q0.append(68, 15);
            f1530q0.append(65, 12);
            f1530q0.append(55, 38);
            f1530q0.append(41, 37);
            f1530q0.append(40, 39);
            f1530q0.append(54, 40);
            f1530q0.append(39, 20);
            f1530q0.append(53, 36);
            f1530q0.append(28, 5);
            f1530q0.append(42, 91);
            f1530q0.append(50, 91);
            f1530q0.append(45, 91);
            f1530q0.append(22, 91);
            f1530q0.append(18, 91);
            f1530q0.append(3, 23);
            f1530q0.append(5, 27);
            f1530q0.append(7, 30);
            f1530q0.append(8, 8);
            f1530q0.append(4, 33);
            f1530q0.append(6, 2);
            f1530q0.append(1, 22);
            f1530q0.append(2, 21);
            f1530q0.append(56, 41);
            f1530q0.append(34, 42);
            f1530q0.append(17, 41);
            f1530q0.append(16, 42);
            f1530q0.append(71, 76);
            f1530q0.append(25, 61);
            f1530q0.append(27, 62);
            f1530q0.append(26, 63);
            f1530q0.append(60, 69);
            f1530q0.append(38, 70);
            f1530q0.append(12, 71);
            f1530q0.append(10, 72);
            f1530q0.append(11, 73);
            f1530q0.append(13, 74);
            f1530q0.append(9, 75);
        }

        public void a(b bVar) {
            this.f1531a = bVar.f1531a;
            this.f1535c = bVar.f1535c;
            this.f1533b = bVar.f1533b;
            this.f1537d = bVar.f1537d;
            this.f1539e = bVar.f1539e;
            this.f1541f = bVar.f1541f;
            this.f1543g = bVar.f1543g;
            this.f1545h = bVar.f1545h;
            this.f1547i = bVar.f1547i;
            this.f1549j = bVar.f1549j;
            this.f1551k = bVar.f1551k;
            this.f1553l = bVar.f1553l;
            this.f1555m = bVar.f1555m;
            this.f1557n = bVar.f1557n;
            this.f1559o = bVar.f1559o;
            this.f1561p = bVar.f1561p;
            this.f1563q = bVar.f1563q;
            this.f1564r = bVar.f1564r;
            this.f1565s = bVar.f1565s;
            this.f1566t = bVar.f1566t;
            this.f1567u = bVar.f1567u;
            this.f1568v = bVar.f1568v;
            this.f1569w = bVar.f1569w;
            this.f1570x = bVar.f1570x;
            this.f1571y = bVar.f1571y;
            this.f1572z = bVar.f1572z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f1532a0 = bVar.f1532a0;
            this.f1534b0 = bVar.f1534b0;
            this.f1536c0 = bVar.f1536c0;
            this.f1538d0 = bVar.f1538d0;
            this.f1540e0 = bVar.f1540e0;
            this.f1542f0 = bVar.f1542f0;
            this.f1544g0 = bVar.f1544g0;
            this.f1546h0 = bVar.f1546h0;
            this.f1548i0 = bVar.f1548i0;
            this.f1554l0 = bVar.f1554l0;
            int[] iArr = bVar.f1550j0;
            if (iArr == null || bVar.f1552k0 != null) {
                this.f1550j0 = null;
            } else {
                this.f1550j0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f1552k0 = bVar.f1552k0;
            this.f1556m0 = bVar.f1556m0;
            this.f1558n0 = bVar.f1558n0;
            this.f1560o0 = bVar.f1560o0;
            this.f1562p0 = bVar.f1562p0;
        }

        public void b(Context context, AttributeSet attributeSet) {
            StringBuilder sb2;
            String str;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.d.f44945l);
            this.f1533b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f1530q0.get(index);
                switch (i11) {
                    case 1:
                        int i12 = this.f1563q;
                        int[] iArr = c.f1501g;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, i12);
                        if (resourceId == -1) {
                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1563q = resourceId;
                        break;
                    case 2:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 3:
                        int i13 = this.f1561p;
                        int[] iArr2 = c.f1501g;
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, i13);
                        if (resourceId2 == -1) {
                            resourceId2 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1561p = resourceId2;
                        break;
                    case 4:
                        int i14 = this.f1559o;
                        int[] iArr3 = c.f1501g;
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, i14);
                        if (resourceId3 == -1) {
                            resourceId3 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1559o = resourceId3;
                        break;
                    case 5:
                        this.f1572z = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 7:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 8:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 9:
                        int i15 = this.f1569w;
                        int[] iArr4 = c.f1501g;
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, i15);
                        if (resourceId4 == -1) {
                            resourceId4 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1569w = resourceId4;
                        break;
                    case 10:
                        int i16 = this.f1568v;
                        int[] iArr5 = c.f1501g;
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, i16);
                        if (resourceId5 == -1) {
                            resourceId5 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1568v = resourceId5;
                        break;
                    case 11:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 12:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 13:
                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 14:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 15:
                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 16:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 17:
                        this.f1539e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1539e);
                        break;
                    case 18:
                        this.f1541f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1541f);
                        break;
                    case 19:
                        this.f1543g = typedArrayObtainStyledAttributes.getFloat(index, this.f1543g);
                        break;
                    case 20:
                        this.f1570x = typedArrayObtainStyledAttributes.getFloat(index, this.f1570x);
                        break;
                    case 21:
                        this.f1537d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1537d);
                        break;
                    case 22:
                        this.f1535c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1535c);
                        break;
                    case 23:
                        this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 24:
                        int i17 = this.f1547i;
                        int[] iArr6 = c.f1501g;
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, i17);
                        if (resourceId6 == -1) {
                            resourceId6 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1547i = resourceId6;
                        break;
                    case 25:
                        int i18 = this.f1549j;
                        int[] iArr7 = c.f1501g;
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, i18);
                        if (resourceId7 == -1) {
                            resourceId7 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1549j = resourceId7;
                        break;
                    case 26:
                        this.F = typedArrayObtainStyledAttributes.getInt(index, this.F);
                        break;
                    case 27:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 28:
                        int i19 = this.f1551k;
                        int[] iArr8 = c.f1501g;
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, i19);
                        if (resourceId8 == -1) {
                            resourceId8 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1551k = resourceId8;
                        break;
                    case 29:
                        int i20 = this.f1553l;
                        int[] iArr9 = c.f1501g;
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, i20);
                        if (resourceId9 == -1) {
                            resourceId9 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1553l = resourceId9;
                        break;
                    case 30:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 31:
                        int i21 = this.f1566t;
                        int[] iArr10 = c.f1501g;
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, i21);
                        if (resourceId10 == -1) {
                            resourceId10 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1566t = resourceId10;
                        break;
                    case 32:
                        int i22 = this.f1567u;
                        int[] iArr11 = c.f1501g;
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, i22);
                        if (resourceId11 == -1) {
                            resourceId11 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1567u = resourceId11;
                        break;
                    case 33:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 34:
                        int i23 = this.f1557n;
                        int[] iArr12 = c.f1501g;
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, i23);
                        if (resourceId12 == -1) {
                            resourceId12 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1557n = resourceId12;
                        break;
                    case 35:
                        int i24 = this.f1555m;
                        int[] iArr13 = c.f1501g;
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, i24);
                        if (resourceId13 == -1) {
                            resourceId13 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1555m = resourceId13;
                        break;
                    case 36:
                        this.f1571y = typedArrayObtainStyledAttributes.getFloat(index, this.f1571y);
                        break;
                    case 37:
                        this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 38:
                        this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 39:
                        this.W = typedArrayObtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 40:
                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 41:
                        c.l(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        c.l(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                int i25 = this.A;
                                int[] iArr14 = c.f1501g;
                                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, i25);
                                if (resourceId14 == -1) {
                                    resourceId14 = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                this.A = resourceId14;
                                break;
                            case 62:
                                this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                break;
                            case 63:
                                this.C = typedArrayObtainStyledAttributes.getFloat(index, this.C);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f1540e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.f1542f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.f1544g0 = typedArrayObtainStyledAttributes.getInt(index, this.f1544g0);
                                        continue;
                                    case 73:
                                        this.f1546h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1546h0);
                                        continue;
                                    case 74:
                                        this.f1552k0 = typedArrayObtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.f1560o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1560o0);
                                        continue;
                                    case 76:
                                        this.f1562p0 = typedArrayObtainStyledAttributes.getInt(index, this.f1562p0);
                                        continue;
                                    case 77:
                                        int i26 = this.f1564r;
                                        int[] iArr15 = c.f1501g;
                                        int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, i26);
                                        if (resourceId15 == -1) {
                                            resourceId15 = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        this.f1564r = resourceId15;
                                        continue;
                                    case 78:
                                        int i27 = this.f1565s;
                                        int[] iArr16 = c.f1501g;
                                        int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, i27);
                                        if (resourceId16 == -1) {
                                            resourceId16 = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        this.f1565s = resourceId16;
                                        continue;
                                    case 79:
                                        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        continue;
                                    case 80:
                                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        continue;
                                    case 81:
                                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                                        continue;
                                    case 82:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 83:
                                        this.f1534b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1534b0);
                                        continue;
                                    case 84:
                                        this.f1532a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1532a0);
                                        continue;
                                    case 85:
                                        this.f1538d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1538d0);
                                        continue;
                                    case 86:
                                        this.f1536c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1536c0);
                                        continue;
                                    case 87:
                                        this.f1556m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1556m0);
                                        continue;
                                    case 88:
                                        this.f1558n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1558n0);
                                        continue;
                                    case 89:
                                        this.f1554l0 = typedArrayObtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.f1545h = typedArrayObtainStyledAttributes.getBoolean(index, this.f1545h);
                                        continue;
                                    case 91:
                                        sb2 = new StringBuilder();
                                        str = "unused attribute 0x";
                                        break;
                                    default:
                                        sb2 = new StringBuilder();
                                        str = "Unknown attribute 0x";
                                        break;
                                }
                                sb2.append(str);
                                sb2.append(Integer.toHexString(index));
                                sb2.append("   ");
                                sb2.append(f1530q0.get(index));
                                Log.w("ConstraintSet", sb2.toString());
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$c, reason: collision with other inner class name */
    public static class C0027c {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static SparseIntArray f1573o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1574a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1575b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1576c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f1577d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1578e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1579f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f1580g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1581h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f1582i = Float.NaN;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f1583j = Float.NaN;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1584k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f1585l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1586m = -3;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1587n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1573o = sparseIntArray;
            sparseIntArray.append(3, 1);
            f1573o.append(5, 2);
            f1573o.append(9, 3);
            f1573o.append(2, 4);
            f1573o.append(1, 5);
            f1573o.append(0, 6);
            f1573o.append(4, 7);
            f1573o.append(8, 8);
            f1573o.append(7, 9);
            f1573o.append(6, 10);
        }

        public void a(C0027c c0027c) {
            this.f1574a = c0027c.f1574a;
            this.f1575b = c0027c.f1575b;
            this.f1577d = c0027c.f1577d;
            this.f1578e = c0027c.f1578e;
            this.f1579f = c0027c.f1579f;
            this.f1582i = c0027c.f1582i;
            this.f1580g = c0027c.f1580g;
            this.f1581h = c0027c.f1581h;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.d.f44946m);
            this.f1574a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f1573o.get(index)) {
                    case 1:
                        this.f1582i = typedArrayObtainStyledAttributes.getFloat(index, this.f1582i);
                        break;
                    case 2:
                        this.f1578e = typedArrayObtainStyledAttributes.getInt(index, this.f1578e);
                        break;
                    case 3:
                        this.f1577d = typedArrayObtainStyledAttributes.peekValue(index).type == 3 ? typedArrayObtainStyledAttributes.getString(index) : t.c.f35565c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f1579f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        int i11 = this.f1575b;
                        int[] iArr = c.f1501g;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, i11);
                        if (resourceId == -1) {
                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1575b = resourceId;
                        break;
                    case 6:
                        this.f1576c = typedArrayObtainStyledAttributes.getInteger(index, this.f1576c);
                        break;
                    case 7:
                        this.f1580g = typedArrayObtainStyledAttributes.getFloat(index, this.f1580g);
                        break;
                    case 8:
                        this.f1584k = typedArrayObtainStyledAttributes.getInteger(index, this.f1584k);
                        break;
                    case 9:
                        this.f1583j = typedArrayObtainStyledAttributes.getFloat(index, this.f1583j);
                        break;
                    case 10:
                        int i12 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i12 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f1587n = resourceId2;
                            if (resourceId2 != -1) {
                                this.f1586m = -2;
                            }
                        } else if (i12 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f1585l = string;
                            if (string.indexOf(DialogConfigs.DIRECTORY_SEPERATOR) > 0) {
                                this.f1587n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f1586m = -2;
                            } else {
                                this.f1586m = -1;
                            }
                        } else {
                            this.f1586m = typedArrayObtainStyledAttributes.getInteger(index, this.f1587n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1588a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1589b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1590c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f1591d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f1592e = Float.NaN;

        public void a(d dVar) {
            this.f1588a = dVar.f1588a;
            this.f1589b = dVar.f1589b;
            this.f1591d = dVar.f1591d;
            this.f1592e = dVar.f1592e;
            this.f1590c = dVar.f1590c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.d.f44952s);
            this.f1588a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f1591d = typedArrayObtainStyledAttributes.getFloat(index, this.f1591d);
                } else if (index == 0) {
                    int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f1589b);
                    this.f1589b = i11;
                    int[] iArr = c.f1501g;
                    this.f1589b = c.f1501g[i11];
                } else if (index == 4) {
                    this.f1590c = typedArrayObtainStyledAttributes.getInt(index, this.f1590c);
                } else if (index == 3) {
                    this.f1592e = typedArrayObtainStyledAttributes.getFloat(index, this.f1592e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static SparseIntArray f1593o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1594a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f1595b = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1596c = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f1597d = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f1598e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f1599f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f1600g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f1601h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1602i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f1603j = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f1604k = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f1605l = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f1606m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f1607n = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1593o = sparseIntArray;
            sparseIntArray.append(6, 1);
            f1593o.append(7, 2);
            f1593o.append(8, 3);
            f1593o.append(4, 4);
            f1593o.append(5, 5);
            f1593o.append(0, 6);
            f1593o.append(1, 7);
            f1593o.append(2, 8);
            f1593o.append(3, 9);
            f1593o.append(9, 10);
            f1593o.append(10, 11);
            f1593o.append(11, 12);
        }

        public void a(e eVar) {
            this.f1594a = eVar.f1594a;
            this.f1595b = eVar.f1595b;
            this.f1596c = eVar.f1596c;
            this.f1597d = eVar.f1597d;
            this.f1598e = eVar.f1598e;
            this.f1599f = eVar.f1599f;
            this.f1600g = eVar.f1600g;
            this.f1601h = eVar.f1601h;
            this.f1602i = eVar.f1602i;
            this.f1603j = eVar.f1603j;
            this.f1604k = eVar.f1604k;
            this.f1605l = eVar.f1605l;
            this.f1606m = eVar.f1606m;
            this.f1607n = eVar.f1607n;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.d.f44955v);
            this.f1594a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f1593o.get(index)) {
                    case 1:
                        this.f1595b = typedArrayObtainStyledAttributes.getFloat(index, this.f1595b);
                        break;
                    case 2:
                        this.f1596c = typedArrayObtainStyledAttributes.getFloat(index, this.f1596c);
                        break;
                    case 3:
                        this.f1597d = typedArrayObtainStyledAttributes.getFloat(index, this.f1597d);
                        break;
                    case 4:
                        this.f1598e = typedArrayObtainStyledAttributes.getFloat(index, this.f1598e);
                        break;
                    case 5:
                        this.f1599f = typedArrayObtainStyledAttributes.getFloat(index, this.f1599f);
                        break;
                    case 6:
                        this.f1600g = typedArrayObtainStyledAttributes.getDimension(index, this.f1600g);
                        break;
                    case 7:
                        this.f1601h = typedArrayObtainStyledAttributes.getDimension(index, this.f1601h);
                        break;
                    case 8:
                        this.f1603j = typedArrayObtainStyledAttributes.getDimension(index, this.f1603j);
                        break;
                    case 9:
                        this.f1604k = typedArrayObtainStyledAttributes.getDimension(index, this.f1604k);
                        break;
                    case 10:
                        this.f1605l = typedArrayObtainStyledAttributes.getDimension(index, this.f1605l);
                        break;
                    case 11:
                        this.f1606m = true;
                        this.f1607n = typedArrayObtainStyledAttributes.getDimension(index, this.f1607n);
                        break;
                    case 12:
                        int i11 = this.f1602i;
                        int[] iArr = c.f1501g;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, i11);
                        if (resourceId == -1) {
                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1602i = resourceId;
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f1502h.append(82, 25);
        f1502h.append(83, 26);
        f1502h.append(85, 29);
        f1502h.append(86, 30);
        f1502h.append(92, 36);
        f1502h.append(91, 35);
        f1502h.append(63, 4);
        f1502h.append(62, 3);
        f1502h.append(58, 1);
        f1502h.append(60, 91);
        f1502h.append(59, 92);
        f1502h.append(101, 6);
        f1502h.append(102, 7);
        f1502h.append(70, 17);
        f1502h.append(71, 18);
        f1502h.append(72, 19);
        f1502h.append(54, 99);
        f1502h.append(0, 27);
        f1502h.append(87, 32);
        f1502h.append(88, 33);
        f1502h.append(69, 10);
        f1502h.append(68, 9);
        f1502h.append(106, 13);
        f1502h.append(109, 16);
        f1502h.append(107, 14);
        f1502h.append(104, 11);
        f1502h.append(108, 15);
        f1502h.append(105, 12);
        f1502h.append(95, 40);
        f1502h.append(80, 39);
        f1502h.append(79, 41);
        f1502h.append(94, 42);
        f1502h.append(78, 20);
        f1502h.append(93, 37);
        f1502h.append(67, 5);
        f1502h.append(81, 87);
        f1502h.append(90, 87);
        f1502h.append(84, 87);
        f1502h.append(61, 87);
        f1502h.append(57, 87);
        f1502h.append(5, 24);
        f1502h.append(7, 28);
        f1502h.append(23, 31);
        f1502h.append(24, 8);
        f1502h.append(6, 34);
        f1502h.append(8, 2);
        f1502h.append(3, 23);
        f1502h.append(4, 21);
        f1502h.append(96, 95);
        f1502h.append(73, 96);
        f1502h.append(2, 22);
        f1502h.append(13, 43);
        f1502h.append(26, 44);
        f1502h.append(21, 45);
        f1502h.append(22, 46);
        f1502h.append(20, 60);
        f1502h.append(18, 47);
        f1502h.append(19, 48);
        f1502h.append(14, 49);
        f1502h.append(15, 50);
        f1502h.append(16, 51);
        f1502h.append(17, 52);
        f1502h.append(25, 53);
        f1502h.append(97, 54);
        f1502h.append(74, 55);
        f1502h.append(98, 56);
        f1502h.append(75, 57);
        f1502h.append(99, 58);
        f1502h.append(76, 59);
        f1502h.append(64, 61);
        f1502h.append(66, 62);
        f1502h.append(65, 63);
        f1502h.append(28, 64);
        f1502h.append(121, 65);
        f1502h.append(35, 66);
        f1502h.append(122, 67);
        f1502h.append(113, 79);
        f1502h.append(1, 38);
        f1502h.append(112, 68);
        f1502h.append(100, 69);
        f1502h.append(77, 70);
        f1502h.append(111, 97);
        f1502h.append(32, 71);
        f1502h.append(30, 72);
        f1502h.append(31, 73);
        f1502h.append(33, 74);
        f1502h.append(29, 75);
        f1502h.append(114, 76);
        f1502h.append(89, 77);
        f1502h.append(123, 78);
        f1502h.append(56, 80);
        f1502h.append(55, 81);
        f1502h.append(116, 82);
        f1502h.append(120, 83);
        f1502h.append(119, 84);
        f1502h.append(118, 85);
        f1502h.append(117, 86);
        f1503i.append(85, 6);
        f1503i.append(85, 7);
        f1503i.append(0, 27);
        f1503i.append(89, 13);
        f1503i.append(92, 16);
        f1503i.append(90, 14);
        f1503i.append(87, 11);
        f1503i.append(91, 15);
        f1503i.append(88, 12);
        f1503i.append(78, 40);
        f1503i.append(71, 39);
        f1503i.append(70, 41);
        f1503i.append(77, 42);
        f1503i.append(69, 20);
        f1503i.append(76, 37);
        f1503i.append(60, 5);
        f1503i.append(72, 87);
        f1503i.append(75, 87);
        f1503i.append(73, 87);
        f1503i.append(57, 87);
        f1503i.append(56, 87);
        f1503i.append(5, 24);
        f1503i.append(7, 28);
        f1503i.append(23, 31);
        f1503i.append(24, 8);
        f1503i.append(6, 34);
        f1503i.append(8, 2);
        f1503i.append(3, 23);
        f1503i.append(4, 21);
        f1503i.append(79, 95);
        f1503i.append(64, 96);
        f1503i.append(2, 22);
        f1503i.append(13, 43);
        f1503i.append(26, 44);
        f1503i.append(21, 45);
        f1503i.append(22, 46);
        f1503i.append(20, 60);
        f1503i.append(18, 47);
        f1503i.append(19, 48);
        f1503i.append(14, 49);
        f1503i.append(15, 50);
        f1503i.append(16, 51);
        f1503i.append(17, 52);
        f1503i.append(25, 53);
        f1503i.append(80, 54);
        f1503i.append(65, 55);
        f1503i.append(81, 56);
        f1503i.append(66, 57);
        f1503i.append(82, 58);
        f1503i.append(67, 59);
        f1503i.append(59, 62);
        f1503i.append(58, 63);
        f1503i.append(28, 64);
        f1503i.append(105, 65);
        f1503i.append(34, 66);
        f1503i.append(106, 67);
        f1503i.append(96, 79);
        f1503i.append(1, 38);
        f1503i.append(97, 98);
        f1503i.append(95, 68);
        f1503i.append(83, 69);
        f1503i.append(68, 70);
        f1503i.append(32, 71);
        f1503i.append(30, 72);
        f1503i.append(31, 73);
        f1503i.append(33, 74);
        f1503i.append(29, 75);
        f1503i.append(98, 76);
        f1503i.append(74, 77);
        f1503i.append(107, 78);
        f1503i.append(55, 80);
        f1503i.append(54, 81);
        f1503i.append(100, 82);
        f1503i.append(104, 83);
        f1503i.append(103, 84);
        f1503i.append(102, 85);
        f1503i.append(101, 86);
        f1503i.append(94, 97);
    }

    public static a d(Context context, XmlPullParser xmlPullParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, z.d.f44937d);
        n(aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0033  */
    /* JADX WARN: Code duplicated, block: B:22:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    public static void l(Object obj, TypedArray typedArray, int i10, int i11) {
        int i12;
        int i13;
        int dimensionPixelSize;
        a.C0026a c0026a;
        int i14;
        b bVar;
        ConstraintLayout.b bVar2;
        if (obj == null) {
            return;
        }
        int i15 = typedArray.peekValue(i10).type;
        boolean z10 = true;
        int i16 = 0;
        if (i15 != 3) {
            if (i15 != 5) {
                dimensionPixelSize = typedArray.getInt(i10, 0);
                if (dimensionPixelSize == -4) {
                    i16 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z10 = false;
                }
                if (obj instanceof ConstraintLayout.b) {
                    bVar2 = (ConstraintLayout.b) obj;
                    if (i11 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar2).width = i16;
                        bVar2.f1428a0 = z10;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar2).height = i16;
                        bVar2.f1430b0 = z10;
                        return;
                    }
                }
                if (obj instanceof b) {
                    bVar = (b) obj;
                    if (i11 == 0) {
                        bVar.f1535c = i16;
                        bVar.f1556m0 = z10;
                        return;
                    } else {
                        bVar.f1537d = i16;
                        bVar.f1558n0 = z10;
                        return;
                    }
                }
                if (obj instanceof a.C0026a) {
                    c0026a = (a.C0026a) obj;
                    if (i11 == 0) {
                        c0026a.b(23, i16);
                        i14 = 80;
                    } else {
                        c0026a.b(21, i16);
                        i14 = 81;
                    }
                    c0026a.d(i14, z10);
                    return;
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i10, 0);
            z10 = false;
            i16 = dimensionPixelSize;
            if (obj instanceof ConstraintLayout.b) {
                bVar2 = (ConstraintLayout.b) obj;
                if (i11 == 0) {
                    ((ViewGroup.MarginLayoutParams) bVar2).width = i16;
                    bVar2.f1428a0 = z10;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) bVar2).height = i16;
                    bVar2.f1430b0 = z10;
                    return;
                }
            }
            if (obj instanceof b) {
                bVar = (b) obj;
                if (i11 == 0) {
                    bVar.f1535c = i16;
                    bVar.f1556m0 = z10;
                    return;
                } else {
                    bVar.f1537d = i16;
                    bVar.f1558n0 = z10;
                    return;
                }
            }
            if (obj instanceof a.C0026a) {
                c0026a = (a.C0026a) obj;
                if (i11 == 0) {
                    c0026a.b(23, i16);
                    i14 = 80;
                } else {
                    c0026a.b(21, i16);
                    i14 = 81;
                }
                c0026a.d(i14, z10);
                return;
            }
            return;
        }
        String string = typedArray.getString(i10);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar3 = (ConstraintLayout.b) obj;
                    if (i11 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar3).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar3).height = 0;
                    }
                    m(bVar3, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).f1572z = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0026a) {
                        ((a.C0026a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f10 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.L = f10;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.M = f10;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i11 == 0) {
                            bVar5.f1535c = 0;
                            bVar5.V = f10;
                            return;
                        } else {
                            bVar5.f1537d = 0;
                            bVar5.U = f10;
                            return;
                        }
                    }
                    if (obj instanceof a.C0026a) {
                        a.C0026a c0026a2 = (a.C0026a) obj;
                        if (i11 == 0) {
                            c0026a2.b(23, 0);
                            i13 = 39;
                        } else {
                            c0026a2.b(21, 0);
                            i13 = 40;
                        }
                        c0026a2.a(i13, f10);
                        return;
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar6 = (ConstraintLayout.b) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar6).width = 0;
                            bVar6.V = fMax;
                            bVar6.P = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar6).height = 0;
                            bVar6.W = fMax;
                            bVar6.Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar7 = (b) obj;
                        if (i11 == 0) {
                            bVar7.f1535c = 0;
                            bVar7.f1540e0 = fMax;
                            bVar7.Y = 2;
                            return;
                        } else {
                            bVar7.f1537d = 0;
                            bVar7.f1542f0 = fMax;
                            bVar7.Z = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0026a) {
                        a.C0026a c0026a3 = (a.C0026a) obj;
                        if (i11 == 0) {
                            c0026a3.b(23, 0);
                            i12 = 54;
                        } else {
                            c0026a3.b(21, 0);
                            i12 = 55;
                        }
                        c0026a3.b(i12, 2);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void m(ConstraintLayout.b bVar, String str) {
        float fAbs = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i11 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i10 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i11);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i11, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f11 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                            fAbs = i10 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.I = str;
        bVar.J = fAbs;
        bVar.K = i10;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005d  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d5 A[PHI: r5
  0x01d5: PHI (r5v76 int) = (r5v55 int), (r5v78 int) binds: [B:65:0x01d3, B:38:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    public static void n(a aVar, TypedArray typedArray) {
        int i10;
        int i11;
        int i12;
        int i13;
        int dimensionPixelOffset;
        int i14;
        int i15;
        int i16;
        float f10;
        float dimension;
        int i17;
        int resourceId;
        int i18;
        boolean z10;
        int i19;
        C0027c c0027c;
        StringBuilder sb2;
        String str;
        int indexCount = typedArray.getIndexCount();
        a.C0026a c0026a = new a.C0026a();
        aVar.f1517h = c0026a;
        aVar.f1513d.f1574a = false;
        aVar.f1514e.f1533b = false;
        aVar.f1512c.f1588a = false;
        aVar.f1515f.f1594a = false;
        for (int i20 = 0; i20 < indexCount; i20++) {
            int index = typedArray.getIndex(i20);
            float f11 = 1.0f;
            switch (f1503i.get(index)) {
                case 2:
                    i10 = 2;
                    i11 = aVar.f1514e.J;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i11);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    sb2 = new StringBuilder();
                    str = "Unknown attribute 0x";
                    sb2.append(str);
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(f1502h.get(index));
                    Log.w("ConstraintSet", sb2.toString());
                    break;
                case 5:
                    i12 = 5;
                    c0026a.c(i12, typedArray.getString(index));
                    break;
                case 6:
                    i10 = 6;
                    i13 = aVar.f1514e.D;
                    dimensionPixelOffset = typedArray.getDimensionPixelOffset(index, i13);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 7:
                    i10 = 7;
                    i13 = aVar.f1514e.E;
                    dimensionPixelOffset = typedArray.getDimensionPixelOffset(index, i13);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 8:
                    i10 = 8;
                    i11 = aVar.f1514e.K;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i11);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 11:
                    i10 = 11;
                    i11 = aVar.f1514e.Q;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i11);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 12:
                    i10 = 12;
                    i11 = aVar.f1514e.R;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i11);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 13:
                    i10 = 13;
                    i11 = aVar.f1514e.N;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i11);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 14:
                    i10 = 14;
                    i11 = aVar.f1514e.P;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i11);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 15:
                    i10 = 15;
                    i11 = aVar.f1514e.S;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i11);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 16:
                    i10 = 16;
                    i11 = aVar.f1514e.O;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i11);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 17:
                    i10 = 17;
                    i13 = aVar.f1514e.f1539e;
                    dimensionPixelOffset = typedArray.getDimensionPixelOffset(index, i13);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 18:
                    i10 = 18;
                    i13 = aVar.f1514e.f1541f;
                    dimensionPixelOffset = typedArray.getDimensionPixelOffset(index, i13);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 19:
                    i14 = 19;
                    f11 = aVar.f1514e.f1543g;
                    dimension = typedArray.getFloat(index, f11);
                    c0026a.a(i14, dimension);
                    break;
                case 20:
                    i14 = 20;
                    f11 = aVar.f1514e.f1570x;
                    dimension = typedArray.getFloat(index, f11);
                    c0026a.a(i14, dimension);
                    break;
                case 21:
                    i10 = 21;
                    i15 = aVar.f1514e.f1537d;
                    dimensionPixelOffset = typedArray.getLayoutDimension(index, i15);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 22:
                    i10 = 22;
                    dimensionPixelOffset = f1501g[typedArray.getInt(index, aVar.f1512c.f1589b)];
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 23:
                    i10 = 23;
                    i15 = aVar.f1514e.f1535c;
                    dimensionPixelOffset = typedArray.getLayoutDimension(index, i15);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 24:
                    i10 = 24;
                    i11 = aVar.f1514e.G;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i11);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 27:
                    i10 = 27;
                    i16 = aVar.f1514e.F;
                    dimensionPixelOffset = typedArray.getInt(index, i16);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 28:
                    i10 = 28;
                    i11 = aVar.f1514e.H;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i11);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 31:
                    i10 = 31;
                    i11 = aVar.f1514e.L;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i11);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 34:
                    i10 = 34;
                    i11 = aVar.f1514e.I;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i11);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 37:
                    i14 = 37;
                    f11 = aVar.f1514e.f1571y;
                    dimension = typedArray.getFloat(index, f11);
                    c0026a.a(i14, dimension);
                    break;
                case 38:
                    dimensionPixelOffset = typedArray.getResourceId(index, aVar.f1510a);
                    aVar.f1510a = dimensionPixelOffset;
                    i10 = 38;
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 39:
                    i14 = 39;
                    f11 = aVar.f1514e.V;
                    dimension = typedArray.getFloat(index, f11);
                    c0026a.a(i14, dimension);
                    break;
                case 40:
                    i14 = 40;
                    f11 = aVar.f1514e.U;
                    dimension = typedArray.getFloat(index, f11);
                    c0026a.a(i14, dimension);
                    break;
                case 41:
                    i10 = 41;
                    i16 = aVar.f1514e.W;
                    dimensionPixelOffset = typedArray.getInt(index, i16);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 42:
                    i10 = 42;
                    i16 = aVar.f1514e.X;
                    dimensionPixelOffset = typedArray.getInt(index, i16);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 43:
                    i14 = 43;
                    f11 = aVar.f1512c.f1591d;
                    dimension = typedArray.getFloat(index, f11);
                    c0026a.a(i14, dimension);
                    break;
                case 44:
                    i14 = 44;
                    c0026a.d(44, true);
                    f10 = aVar.f1515f.f1607n;
                    dimension = typedArray.getDimension(index, f10);
                    c0026a.a(i14, dimension);
                    break;
                case 45:
                    i14 = 45;
                    f11 = aVar.f1515f.f1596c;
                    dimension = typedArray.getFloat(index, f11);
                    c0026a.a(i14, dimension);
                    break;
                case 46:
                    i14 = 46;
                    f11 = aVar.f1515f.f1597d;
                    dimension = typedArray.getFloat(index, f11);
                    c0026a.a(i14, dimension);
                    break;
                case 47:
                    i14 = 47;
                    f11 = aVar.f1515f.f1598e;
                    dimension = typedArray.getFloat(index, f11);
                    c0026a.a(i14, dimension);
                    break;
                case 48:
                    i14 = 48;
                    f11 = aVar.f1515f.f1599f;
                    dimension = typedArray.getFloat(index, f11);
                    c0026a.a(i14, dimension);
                    break;
                case 49:
                    i14 = 49;
                    f10 = aVar.f1515f.f1600g;
                    dimension = typedArray.getDimension(index, f10);
                    c0026a.a(i14, dimension);
                    break;
                case 50:
                    i14 = 50;
                    f10 = aVar.f1515f.f1601h;
                    dimension = typedArray.getDimension(index, f10);
                    c0026a.a(i14, dimension);
                    break;
                case 51:
                    i14 = 51;
                    f10 = aVar.f1515f.f1603j;
                    dimension = typedArray.getDimension(index, f10);
                    c0026a.a(i14, dimension);
                    break;
                case 52:
                    i14 = 52;
                    f10 = aVar.f1515f.f1604k;
                    dimension = typedArray.getDimension(index, f10);
                    c0026a.a(i14, dimension);
                    break;
                case 53:
                    i14 = 53;
                    f10 = aVar.f1515f.f1605l;
                    dimension = typedArray.getDimension(index, f10);
                    c0026a.a(i14, dimension);
                    break;
                case 54:
                    i10 = 54;
                    i16 = aVar.f1514e.Y;
                    dimensionPixelOffset = typedArray.getInt(index, i16);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 55:
                    i10 = 55;
                    i16 = aVar.f1514e.Z;
                    dimensionPixelOffset = typedArray.getInt(index, i16);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 56:
                    i10 = 56;
                    i11 = aVar.f1514e.f1532a0;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i11);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 57:
                    i10 = 57;
                    i11 = aVar.f1514e.f1534b0;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i11);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 58:
                    i10 = 58;
                    i11 = aVar.f1514e.f1536c0;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i11);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 59:
                    i10 = 59;
                    i11 = aVar.f1514e.f1538d0;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i11);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 60:
                    i14 = 60;
                    f11 = aVar.f1515f.f1595b;
                    dimension = typedArray.getFloat(index, f11);
                    c0026a.a(i14, dimension);
                    break;
                case 62:
                    i10 = 62;
                    i11 = aVar.f1514e.B;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i11);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 63:
                    i14 = 63;
                    f11 = aVar.f1514e.C;
                    dimension = typedArray.getFloat(index, f11);
                    c0026a.a(i14, dimension);
                    break;
                case 64:
                    i17 = 64;
                    resourceId = typedArray.getResourceId(index, aVar.f1513d.f1575b);
                    if (resourceId == -1) {
                        resourceId = typedArray.getInt(index, -1);
                    }
                    c0026a.b(i17, resourceId);
                    break;
                case 65:
                    c0026a.c(65, typedArray.peekValue(index).type == 3 ? typedArray.getString(index) : t.c.f35565c[typedArray.getInteger(index, 0)]);
                    break;
                case 66:
                    i10 = 66;
                    dimensionPixelOffset = typedArray.getInt(index, 0);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 67:
                    i14 = 67;
                    f11 = aVar.f1513d.f1582i;
                    dimension = typedArray.getFloat(index, f11);
                    c0026a.a(i14, dimension);
                    break;
                case 68:
                    i14 = 68;
                    f11 = aVar.f1512c.f1592e;
                    dimension = typedArray.getFloat(index, f11);
                    c0026a.a(i14, dimension);
                    break;
                case 69:
                    i14 = 69;
                    dimension = typedArray.getFloat(index, f11);
                    c0026a.a(i14, dimension);
                    break;
                case 70:
                    i14 = 70;
                    dimension = typedArray.getFloat(index, f11);
                    c0026a.a(i14, dimension);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    i10 = 72;
                    i16 = aVar.f1514e.f1544g0;
                    dimensionPixelOffset = typedArray.getInt(index, i16);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 73:
                    i10 = 73;
                    i11 = aVar.f1514e.f1546h0;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i11);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 74:
                    i12 = 74;
                    c0026a.c(i12, typedArray.getString(index));
                    break;
                case 75:
                    i18 = 75;
                    z10 = aVar.f1514e.f1560o0;
                    c0026a.d(i18, typedArray.getBoolean(index, z10));
                    break;
                case 76:
                    i10 = 76;
                    i16 = aVar.f1513d.f1578e;
                    dimensionPixelOffset = typedArray.getInt(index, i16);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 77:
                    i12 = 77;
                    c0026a.c(i12, typedArray.getString(index));
                    break;
                case 78:
                    i10 = 78;
                    i16 = aVar.f1512c.f1590c;
                    dimensionPixelOffset = typedArray.getInt(index, i16);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 79:
                    i14 = 79;
                    f11 = aVar.f1513d.f1580g;
                    dimension = typedArray.getFloat(index, f11);
                    c0026a.a(i14, dimension);
                    break;
                case 80:
                    i18 = 80;
                    z10 = aVar.f1514e.f1556m0;
                    c0026a.d(i18, typedArray.getBoolean(index, z10));
                    break;
                case 81:
                    i18 = 81;
                    z10 = aVar.f1514e.f1558n0;
                    c0026a.d(i18, typedArray.getBoolean(index, z10));
                    break;
                case 82:
                    i10 = 82;
                    i19 = aVar.f1513d.f1576c;
                    dimensionPixelOffset = typedArray.getInteger(index, i19);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 83:
                    i17 = 83;
                    resourceId = typedArray.getResourceId(index, aVar.f1515f.f1602i);
                    if (resourceId == -1) {
                        resourceId = typedArray.getInt(index, -1);
                    }
                    c0026a.b(i17, resourceId);
                    break;
                case 84:
                    i10 = 84;
                    i19 = aVar.f1513d.f1584k;
                    dimensionPixelOffset = typedArray.getInteger(index, i19);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 85:
                    i14 = 85;
                    f11 = aVar.f1513d.f1583j;
                    dimension = typedArray.getFloat(index, f11);
                    c0026a.a(i14, dimension);
                    break;
                case 86:
                    int i21 = typedArray.peekValue(index).type;
                    if (i21 == 1) {
                        aVar.f1513d.f1587n = typedArray.getResourceId(index, -1);
                        c0026a.b(89, aVar.f1513d.f1587n);
                        c0027c = aVar.f1513d;
                        if (c0027c.f1587n != -1) {
                            c0027c.f1586m = -2;
                            c0026a.b(88, -2);
                        }
                    } else if (i21 == 3) {
                        aVar.f1513d.f1585l = typedArray.getString(index);
                        c0026a.c(90, aVar.f1513d.f1585l);
                        if (aVar.f1513d.f1585l.indexOf(DialogConfigs.DIRECTORY_SEPERATOR) > 0) {
                            aVar.f1513d.f1587n = typedArray.getResourceId(index, -1);
                            c0026a.b(89, aVar.f1513d.f1587n);
                            c0027c = aVar.f1513d;
                            c0027c.f1586m = -2;
                            c0026a.b(88, -2);
                        } else {
                            aVar.f1513d.f1586m = -1;
                            c0026a.b(88, -1);
                        }
                    } else {
                        C0027c c0027c2 = aVar.f1513d;
                        c0027c2.f1586m = typedArray.getInteger(index, c0027c2.f1587n);
                        c0026a.b(88, aVar.f1513d.f1586m);
                    }
                    break;
                case 87:
                    sb2 = new StringBuilder();
                    str = "unused attribute 0x";
                    sb2.append(str);
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(f1502h.get(index));
                    Log.w("ConstraintSet", sb2.toString());
                    break;
                case 93:
                    i10 = 93;
                    i11 = aVar.f1514e.M;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i11);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 94:
                    i10 = 94;
                    i11 = aVar.f1514e.T;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i11);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 95:
                    l(c0026a, typedArray, index, 0);
                    break;
                case 96:
                    l(c0026a, typedArray, index, 1);
                    break;
                case 97:
                    i10 = 97;
                    i16 = aVar.f1514e.f1562p0;
                    dimensionPixelOffset = typedArray.getInt(index, i16);
                    c0026a.b(i10, dimensionPixelOffset);
                    break;
                case 98:
                    if (r.f37757r0) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f1510a);
                        aVar.f1510a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f1511b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f1511b = typedArray.getString(index);
                    } else {
                        aVar.f1510a = typedArray.getResourceId(index, aVar.f1510a);
                    }
                    break;
                case 99:
                    i18 = 99;
                    z10 = aVar.f1514e.f1545h;
                    c0026a.d(i18, typedArray.getBoolean(index, z10));
                    break;
            }
        }
    }

    public void a(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f1509f.containsKey(Integer.valueOf(id2))) {
                StringBuilder sbA = defpackage.a.a("id unknown ");
                sbA.append(y.a.d(childAt));
                Log.w("ConstraintSet", sbA.toString());
            } else {
                if (this.f1508e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f1509f.containsKey(Integer.valueOf(id2)) && (aVar = this.f1509f.get(Integer.valueOf(id2))) != null) {
                    androidx.constraintlayout.widget.a.f(childAt, aVar.f1516g);
                }
            }
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        c(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void c(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f1509f.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f1509f.containsKey(Integer.valueOf(id2))) {
                StringBuilder sbA = defpackage.a.a("id unknown ");
                sbA.append(y.a.d(childAt));
                Log.w("ConstraintSet", sbA.toString());
            } else {
                if (this.f1508e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f1509f.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f1509f.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f1514e.f1548i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(aVar.f1514e.f1544g0);
                                barrier.setMargin(aVar.f1514e.f1546h0);
                                barrier.setAllowsGoneWidget(aVar.f1514e.f1560o0);
                                b bVar = aVar.f1514e;
                                int[] iArr = bVar.f1550j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f1552k0;
                                    if (str != null) {
                                        bVar.f1550j0 = f(barrier, str);
                                        barrier.setReferencedIds(aVar.f1514e.f1550j0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.a(bVar2);
                            if (z10) {
                                androidx.constraintlayout.widget.a.f(childAt, aVar.f1516g);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.f1512c;
                            if (dVar.f1590c == 0) {
                                childAt.setVisibility(dVar.f1589b);
                            }
                            childAt.setAlpha(aVar.f1512c.f1591d);
                            childAt.setRotation(aVar.f1515f.f1595b);
                            childAt.setRotationX(aVar.f1515f.f1596c);
                            childAt.setRotationY(aVar.f1515f.f1597d);
                            childAt.setScaleX(aVar.f1515f.f1598e);
                            childAt.setScaleY(aVar.f1515f.f1599f);
                            e eVar = aVar.f1515f;
                            if (eVar.f1602i != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(aVar.f1515f.f1602i);
                                if (viewFindViewById != null) {
                                    float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                    float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left = right - childAt.getLeft();
                                        float top = bottom - childAt.getTop();
                                        childAt.setPivotX(left);
                                        childAt.setPivotY(top);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f1600g)) {
                                    childAt.setPivotX(aVar.f1515f.f1600g);
                                }
                                if (!Float.isNaN(aVar.f1515f.f1601h)) {
                                    childAt.setPivotY(aVar.f1515f.f1601h);
                                }
                            }
                            childAt.setTranslationX(aVar.f1515f.f1603j);
                            childAt.setTranslationY(aVar.f1515f.f1604k);
                            childAt.setTranslationZ(aVar.f1515f.f1605l);
                            e eVar2 = aVar.f1515f;
                            if (eVar2.f1606m) {
                                childAt.setElevation(eVar2.f1607n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = this.f1509f.get(num);
            if (aVar2 != null) {
                if (aVar2.f1514e.f1548i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f1514e;
                    int[] iArr2 = bVar3.f1550j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f1552k0;
                        if (str2 != null) {
                            bVar3.f1550j0 = f(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f1514e.f1550j0);
                        }
                    }
                    barrier2.setType(aVar2.f1514e.f1544g0);
                    barrier2.setMargin(aVar2.f1514e.f1546h0);
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.o();
                    aVar2.a(bVarGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, bVarGenerateDefaultLayoutParams);
                }
                if (aVar2.f1514e.f1531a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.a(bVarGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, bVarGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).i(constraintLayout);
            }
        }
    }

    public void e(ConstraintLayout constraintLayout) {
        androidx.constraintlayout.widget.a aVar;
        c cVar = this;
        int childCount = constraintLayout.getChildCount();
        cVar.f1509f.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (cVar.f1508e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!cVar.f1509f.containsKey(Integer.valueOf(id2))) {
                cVar.f1509f.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = cVar.f1509f.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                HashMap<String, androidx.constraintlayout.widget.a> map = cVar.f1507d;
                HashMap<String, androidx.constraintlayout.widget.a> map2 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : map.keySet()) {
                    androidx.constraintlayout.widget.a aVar3 = map.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            aVar = new androidx.constraintlayout.widget.a(aVar3, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                        } else {
                            aVar = new androidx.constraintlayout.widget.a(aVar3, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0]));
                        }
                        try {
                            map2.put(str, aVar);
                        } catch (IllegalAccessException e10) {
                            e = e10;
                            e.printStackTrace();
                        } catch (NoSuchMethodException e11) {
                            e = e11;
                            e.printStackTrace();
                        } catch (InvocationTargetException e12) {
                            e = e12;
                            e.printStackTrace();
                        }
                    } catch (IllegalAccessException e13) {
                        e = e13;
                    } catch (NoSuchMethodException e14) {
                        e = e14;
                    } catch (InvocationTargetException e15) {
                        e = e15;
                    }
                }
                aVar2.f1516g = map2;
                aVar2.c(id2, bVar);
                aVar2.f1512c.f1589b = childAt.getVisibility();
                aVar2.f1512c.f1591d = childAt.getAlpha();
                aVar2.f1515f.f1595b = childAt.getRotation();
                aVar2.f1515f.f1596c = childAt.getRotationX();
                aVar2.f1515f.f1597d = childAt.getRotationY();
                aVar2.f1515f.f1598e = childAt.getScaleX();
                aVar2.f1515f.f1599f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar2.f1515f;
                    eVar.f1600g = pivotX;
                    eVar.f1601h = pivotY;
                }
                aVar2.f1515f.f1603j = childAt.getTranslationX();
                aVar2.f1515f.f1604k = childAt.getTranslationY();
                aVar2.f1515f.f1605l = childAt.getTranslationZ();
                e eVar2 = aVar2.f1515f;
                if (eVar2.f1606m) {
                    eVar2.f1607n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar2.f1514e.f1560o0 = barrier.getAllowsGoneWidget();
                    aVar2.f1514e.f1550j0 = barrier.getReferencedIds();
                    aVar2.f1514e.f1544g0 = barrier.getType();
                    aVar2.f1514e.f1546h0 = barrier.getMargin();
                }
            }
            i10++;
            cVar = this;
        }
    }

    public final int[] f(View view, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = z.c.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, FacebookMediationAdapter.KEY_ID, context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    public final a g(Context context, AttributeSet attributeSet, boolean z10) {
        C0027c c0027c;
        String string;
        C0027c c0027c2;
        StringBuilder sb2;
        String str;
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? z.d.f44937d : z.d.f44934a);
        if (z10) {
            n(aVar, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index != 1 && 23 != index && 24 != index) {
                    aVar.f1513d.f1574a = true;
                    aVar.f1514e.f1533b = true;
                    aVar.f1512c.f1588a = true;
                    aVar.f1515f.f1594a = true;
                }
                switch (f1502h.get(index)) {
                    case 1:
                        b bVar = aVar.f1514e;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, bVar.f1563q);
                        if (resourceId == -1) {
                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        bVar.f1563q = resourceId;
                        continue;
                        break;
                    case 2:
                        b bVar2 = aVar.f1514e;
                        bVar2.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar2.J);
                        continue;
                        break;
                    case 3:
                        b bVar3 = aVar.f1514e;
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, bVar3.f1561p);
                        if (resourceId2 == -1) {
                            resourceId2 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        bVar3.f1561p = resourceId2;
                        continue;
                        break;
                    case 4:
                        b bVar4 = aVar.f1514e;
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, bVar4.f1559o);
                        if (resourceId3 == -1) {
                            resourceId3 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        bVar4.f1559o = resourceId3;
                        continue;
                        break;
                    case 5:
                        aVar.f1514e.f1572z = typedArrayObtainStyledAttributes.getString(index);
                        continue;
                        break;
                    case 6:
                        b bVar5 = aVar.f1514e;
                        bVar5.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar5.D);
                        continue;
                        break;
                    case 7:
                        b bVar6 = aVar.f1514e;
                        bVar6.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar6.E);
                        continue;
                        break;
                    case 8:
                        b bVar7 = aVar.f1514e;
                        bVar7.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar7.K);
                        continue;
                        break;
                    case 9:
                        b bVar8 = aVar.f1514e;
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, bVar8.f1569w);
                        if (resourceId4 == -1) {
                            resourceId4 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        bVar8.f1569w = resourceId4;
                        continue;
                        break;
                    case 10:
                        b bVar9 = aVar.f1514e;
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, bVar9.f1568v);
                        if (resourceId5 == -1) {
                            resourceId5 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        bVar9.f1568v = resourceId5;
                        continue;
                        break;
                    case 11:
                        b bVar10 = aVar.f1514e;
                        bVar10.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar10.Q);
                        continue;
                        break;
                    case 12:
                        b bVar11 = aVar.f1514e;
                        bVar11.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar11.R);
                        continue;
                        break;
                    case 13:
                        b bVar12 = aVar.f1514e;
                        bVar12.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar12.N);
                        continue;
                        break;
                    case 14:
                        b bVar13 = aVar.f1514e;
                        bVar13.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar13.P);
                        continue;
                        break;
                    case 15:
                        b bVar14 = aVar.f1514e;
                        bVar14.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar14.S);
                        continue;
                        break;
                    case 16:
                        b bVar15 = aVar.f1514e;
                        bVar15.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar15.O);
                        continue;
                        break;
                    case 17:
                        b bVar16 = aVar.f1514e;
                        bVar16.f1539e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar16.f1539e);
                        continue;
                        break;
                    case 18:
                        b bVar17 = aVar.f1514e;
                        bVar17.f1541f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar17.f1541f);
                        continue;
                        break;
                    case 19:
                        b bVar18 = aVar.f1514e;
                        bVar18.f1543g = typedArrayObtainStyledAttributes.getFloat(index, bVar18.f1543g);
                        continue;
                        break;
                    case 20:
                        b bVar19 = aVar.f1514e;
                        bVar19.f1570x = typedArrayObtainStyledAttributes.getFloat(index, bVar19.f1570x);
                        continue;
                        break;
                    case 21:
                        b bVar20 = aVar.f1514e;
                        bVar20.f1537d = typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar20.f1537d);
                        continue;
                        break;
                    case 22:
                        d dVar = aVar.f1512c;
                        dVar.f1589b = typedArrayObtainStyledAttributes.getInt(index, dVar.f1589b);
                        d dVar2 = aVar.f1512c;
                        dVar2.f1589b = f1501g[dVar2.f1589b];
                        continue;
                        break;
                    case 23:
                        b bVar21 = aVar.f1514e;
                        bVar21.f1535c = typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar21.f1535c);
                        continue;
                        break;
                    case 24:
                        b bVar22 = aVar.f1514e;
                        bVar22.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar22.G);
                        continue;
                        break;
                    case 25:
                        b bVar23 = aVar.f1514e;
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, bVar23.f1547i);
                        if (resourceId6 == -1) {
                            resourceId6 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        bVar23.f1547i = resourceId6;
                        continue;
                        break;
                    case 26:
                        b bVar24 = aVar.f1514e;
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, bVar24.f1549j);
                        if (resourceId7 == -1) {
                            resourceId7 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        bVar24.f1549j = resourceId7;
                        continue;
                        break;
                    case 27:
                        b bVar25 = aVar.f1514e;
                        bVar25.F = typedArrayObtainStyledAttributes.getInt(index, bVar25.F);
                        continue;
                        break;
                    case 28:
                        b bVar26 = aVar.f1514e;
                        bVar26.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar26.H);
                        continue;
                        break;
                    case 29:
                        b bVar27 = aVar.f1514e;
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, bVar27.f1551k);
                        if (resourceId8 == -1) {
                            resourceId8 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        bVar27.f1551k = resourceId8;
                        continue;
                        break;
                    case 30:
                        b bVar28 = aVar.f1514e;
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, bVar28.f1553l);
                        if (resourceId9 == -1) {
                            resourceId9 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        bVar28.f1553l = resourceId9;
                        continue;
                        break;
                    case 31:
                        b bVar29 = aVar.f1514e;
                        bVar29.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar29.L);
                        continue;
                        break;
                    case 32:
                        b bVar30 = aVar.f1514e;
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, bVar30.f1566t);
                        if (resourceId10 == -1) {
                            resourceId10 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        bVar30.f1566t = resourceId10;
                        continue;
                        break;
                    case 33:
                        b bVar31 = aVar.f1514e;
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, bVar31.f1567u);
                        if (resourceId11 == -1) {
                            resourceId11 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        bVar31.f1567u = resourceId11;
                        continue;
                        break;
                    case 34:
                        b bVar32 = aVar.f1514e;
                        bVar32.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar32.I);
                        continue;
                        break;
                    case 35:
                        b bVar33 = aVar.f1514e;
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, bVar33.f1557n);
                        if (resourceId12 == -1) {
                            resourceId12 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        bVar33.f1557n = resourceId12;
                        continue;
                        break;
                    case 36:
                        b bVar34 = aVar.f1514e;
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, bVar34.f1555m);
                        if (resourceId13 == -1) {
                            resourceId13 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        bVar34.f1555m = resourceId13;
                        continue;
                        break;
                    case 37:
                        b bVar35 = aVar.f1514e;
                        bVar35.f1571y = typedArrayObtainStyledAttributes.getFloat(index, bVar35.f1571y);
                        continue;
                        break;
                    case 38:
                        aVar.f1510a = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f1510a);
                        continue;
                        break;
                    case 39:
                        b bVar36 = aVar.f1514e;
                        bVar36.V = typedArrayObtainStyledAttributes.getFloat(index, bVar36.V);
                        continue;
                        break;
                    case 40:
                        b bVar37 = aVar.f1514e;
                        bVar37.U = typedArrayObtainStyledAttributes.getFloat(index, bVar37.U);
                        continue;
                        break;
                    case 41:
                        b bVar38 = aVar.f1514e;
                        bVar38.W = typedArrayObtainStyledAttributes.getInt(index, bVar38.W);
                        continue;
                        break;
                    case 42:
                        b bVar39 = aVar.f1514e;
                        bVar39.X = typedArrayObtainStyledAttributes.getInt(index, bVar39.X);
                        continue;
                        break;
                    case 43:
                        d dVar3 = aVar.f1512c;
                        dVar3.f1591d = typedArrayObtainStyledAttributes.getFloat(index, dVar3.f1591d);
                        continue;
                        break;
                    case 44:
                        e eVar = aVar.f1515f;
                        eVar.f1606m = true;
                        eVar.f1607n = typedArrayObtainStyledAttributes.getDimension(index, eVar.f1607n);
                        continue;
                        break;
                    case 45:
                        e eVar2 = aVar.f1515f;
                        eVar2.f1596c = typedArrayObtainStyledAttributes.getFloat(index, eVar2.f1596c);
                        continue;
                        break;
                    case 46:
                        e eVar3 = aVar.f1515f;
                        eVar3.f1597d = typedArrayObtainStyledAttributes.getFloat(index, eVar3.f1597d);
                        continue;
                        break;
                    case 47:
                        e eVar4 = aVar.f1515f;
                        eVar4.f1598e = typedArrayObtainStyledAttributes.getFloat(index, eVar4.f1598e);
                        continue;
                        break;
                    case 48:
                        e eVar5 = aVar.f1515f;
                        eVar5.f1599f = typedArrayObtainStyledAttributes.getFloat(index, eVar5.f1599f);
                        continue;
                        break;
                    case 49:
                        e eVar6 = aVar.f1515f;
                        eVar6.f1600g = typedArrayObtainStyledAttributes.getDimension(index, eVar6.f1600g);
                        continue;
                        break;
                    case 50:
                        e eVar7 = aVar.f1515f;
                        eVar7.f1601h = typedArrayObtainStyledAttributes.getDimension(index, eVar7.f1601h);
                        continue;
                        break;
                    case 51:
                        e eVar8 = aVar.f1515f;
                        eVar8.f1603j = typedArrayObtainStyledAttributes.getDimension(index, eVar8.f1603j);
                        continue;
                        break;
                    case 52:
                        e eVar9 = aVar.f1515f;
                        eVar9.f1604k = typedArrayObtainStyledAttributes.getDimension(index, eVar9.f1604k);
                        continue;
                        break;
                    case 53:
                        e eVar10 = aVar.f1515f;
                        eVar10.f1605l = typedArrayObtainStyledAttributes.getDimension(index, eVar10.f1605l);
                        continue;
                        break;
                    case 54:
                        b bVar40 = aVar.f1514e;
                        bVar40.Y = typedArrayObtainStyledAttributes.getInt(index, bVar40.Y);
                        continue;
                        break;
                    case 55:
                        b bVar41 = aVar.f1514e;
                        bVar41.Z = typedArrayObtainStyledAttributes.getInt(index, bVar41.Z);
                        continue;
                        break;
                    case 56:
                        b bVar42 = aVar.f1514e;
                        bVar42.f1532a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar42.f1532a0);
                        continue;
                        break;
                    case 57:
                        b bVar43 = aVar.f1514e;
                        bVar43.f1534b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar43.f1534b0);
                        continue;
                        break;
                    case 58:
                        b bVar44 = aVar.f1514e;
                        bVar44.f1536c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar44.f1536c0);
                        continue;
                        break;
                    case 59:
                        b bVar45 = aVar.f1514e;
                        bVar45.f1538d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar45.f1538d0);
                        continue;
                        break;
                    case 60:
                        e eVar11 = aVar.f1515f;
                        eVar11.f1595b = typedArrayObtainStyledAttributes.getFloat(index, eVar11.f1595b);
                        continue;
                        break;
                    case 61:
                        b bVar46 = aVar.f1514e;
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, bVar46.A);
                        if (resourceId14 == -1) {
                            resourceId14 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        bVar46.A = resourceId14;
                        continue;
                        break;
                    case 62:
                        b bVar47 = aVar.f1514e;
                        bVar47.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar47.B);
                        continue;
                        break;
                    case 63:
                        b bVar48 = aVar.f1514e;
                        bVar48.C = typedArrayObtainStyledAttributes.getFloat(index, bVar48.C);
                        continue;
                        break;
                    case 64:
                        C0027c c0027c3 = aVar.f1513d;
                        int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c0027c3.f1575b);
                        if (resourceId15 == -1) {
                            resourceId15 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        c0027c3.f1575b = resourceId15;
                        continue;
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c0027c = aVar.f1513d;
                            string = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c0027c = aVar.f1513d;
                            string = t.c.f35565c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        c0027c.f1577d = string;
                        continue;
                        break;
                    case 66:
                        aVar.f1513d.f1579f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        continue;
                        break;
                    case 67:
                        C0027c c0027c4 = aVar.f1513d;
                        c0027c4.f1582i = typedArrayObtainStyledAttributes.getFloat(index, c0027c4.f1582i);
                        continue;
                        break;
                    case 68:
                        d dVar4 = aVar.f1512c;
                        dVar4.f1592e = typedArrayObtainStyledAttributes.getFloat(index, dVar4.f1592e);
                        continue;
                        break;
                    case 69:
                        aVar.f1514e.f1540e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                        continue;
                        break;
                    case 70:
                        aVar.f1514e.f1542f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                        continue;
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        continue;
                        break;
                    case 72:
                        b bVar49 = aVar.f1514e;
                        bVar49.f1544g0 = typedArrayObtainStyledAttributes.getInt(index, bVar49.f1544g0);
                        continue;
                        break;
                    case 73:
                        b bVar50 = aVar.f1514e;
                        bVar50.f1546h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar50.f1546h0);
                        continue;
                        break;
                    case 74:
                        aVar.f1514e.f1552k0 = typedArrayObtainStyledAttributes.getString(index);
                        continue;
                        break;
                    case 75:
                        b bVar51 = aVar.f1514e;
                        bVar51.f1560o0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar51.f1560o0);
                        continue;
                        break;
                    case 76:
                        C0027c c0027c5 = aVar.f1513d;
                        c0027c5.f1578e = typedArrayObtainStyledAttributes.getInt(index, c0027c5.f1578e);
                        continue;
                        break;
                    case 77:
                        aVar.f1514e.f1554l0 = typedArrayObtainStyledAttributes.getString(index);
                        continue;
                        break;
                    case 78:
                        d dVar5 = aVar.f1512c;
                        dVar5.f1590c = typedArrayObtainStyledAttributes.getInt(index, dVar5.f1590c);
                        continue;
                        break;
                    case 79:
                        C0027c c0027c6 = aVar.f1513d;
                        c0027c6.f1580g = typedArrayObtainStyledAttributes.getFloat(index, c0027c6.f1580g);
                        continue;
                        break;
                    case 80:
                        b bVar52 = aVar.f1514e;
                        bVar52.f1556m0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar52.f1556m0);
                        continue;
                        break;
                    case 81:
                        b bVar53 = aVar.f1514e;
                        bVar53.f1558n0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar53.f1558n0);
                        continue;
                        break;
                    case 82:
                        C0027c c0027c7 = aVar.f1513d;
                        c0027c7.f1576c = typedArrayObtainStyledAttributes.getInteger(index, c0027c7.f1576c);
                        continue;
                        break;
                    case 83:
                        e eVar12 = aVar.f1515f;
                        int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, eVar12.f1602i);
                        if (resourceId16 == -1) {
                            resourceId16 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        eVar12.f1602i = resourceId16;
                        continue;
                        break;
                    case 84:
                        C0027c c0027c8 = aVar.f1513d;
                        c0027c8.f1584k = typedArrayObtainStyledAttributes.getInteger(index, c0027c8.f1584k);
                        continue;
                        break;
                    case 85:
                        C0027c c0027c9 = aVar.f1513d;
                        c0027c9.f1583j = typedArrayObtainStyledAttributes.getFloat(index, c0027c9.f1583j);
                        continue;
                        break;
                    case 86:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            aVar.f1513d.f1587n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c0027c2 = aVar.f1513d;
                            if (c0027c2.f1587n != -1) {
                                c0027c2.f1586m = -2;
                            } else {
                                continue;
                            }
                        } else {
                            C0027c c0027c10 = aVar.f1513d;
                            if (i11 == 3) {
                                c0027c10.f1585l = typedArrayObtainStyledAttributes.getString(index);
                                if (aVar.f1513d.f1585l.indexOf(DialogConfigs.DIRECTORY_SEPERATOR) > 0) {
                                    aVar.f1513d.f1587n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    c0027c2 = aVar.f1513d;
                                    c0027c2.f1586m = -2;
                                } else {
                                    aVar.f1513d.f1586m = -1;
                                }
                            } else {
                                c0027c10.f1586m = typedArrayObtainStyledAttributes.getInteger(index, c0027c10.f1587n);
                            }
                        }
                        break;
                    case 87:
                        sb2 = new StringBuilder();
                        str = "unused attribute 0x";
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        sb2 = new StringBuilder();
                        str = "Unknown attribute 0x";
                        break;
                    case 91:
                        b bVar54 = aVar.f1514e;
                        int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(index, bVar54.f1564r);
                        if (resourceId17 == -1) {
                            resourceId17 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        bVar54.f1564r = resourceId17;
                        continue;
                        break;
                    case 92:
                        b bVar55 = aVar.f1514e;
                        int resourceId18 = typedArrayObtainStyledAttributes.getResourceId(index, bVar55.f1565s);
                        if (resourceId18 == -1) {
                            resourceId18 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        bVar55.f1565s = resourceId18;
                        continue;
                        break;
                    case 93:
                        b bVar56 = aVar.f1514e;
                        bVar56.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar56.M);
                        continue;
                        break;
                    case 94:
                        b bVar57 = aVar.f1514e;
                        bVar57.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar57.T);
                        continue;
                        break;
                    case 95:
                        l(aVar.f1514e, typedArrayObtainStyledAttributes, index, 0);
                        continue;
                        break;
                    case 96:
                        l(aVar.f1514e, typedArrayObtainStyledAttributes, index, 1);
                        continue;
                        break;
                    case 97:
                        b bVar58 = aVar.f1514e;
                        bVar58.f1562p0 = typedArrayObtainStyledAttributes.getInt(index, bVar58.f1562p0);
                        continue;
                        break;
                }
                sb2.append(str);
                sb2.append(Integer.toHexString(index));
                sb2.append("   ");
                sb2.append(f1502h.get(index));
                Log.w("ConstraintSet", sb2.toString());
            }
            b bVar59 = aVar.f1514e;
            if (bVar59.f1552k0 != null) {
                bVar59.f1550j0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public final a h(int i10) {
        if (!this.f1509f.containsKey(Integer.valueOf(i10))) {
            this.f1509f.put(Integer.valueOf(i10), new a());
        }
        return this.f1509f.get(Integer.valueOf(i10));
    }

    public a i(int i10) {
        if (this.f1509f.containsKey(Integer.valueOf(i10))) {
            return this.f1509f.get(Integer.valueOf(i10));
        }
        return null;
    }

    public void j(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarG = g(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarG.f1514e.f1531a = true;
                    }
                    this.f1509f.put(Integer.valueOf(aVarG.f1510a), aVarG);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void k(Context context, XmlPullParser xmlPullParser) {
        a aVarG;
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    switch (xmlPullParser.getName()) {
                        case "Constraint":
                            aVarG = g(context, Xml.asAttributeSet(xmlPullParser), false);
                            break;
                        case "ConstraintOverride":
                            aVarG = g(context, Xml.asAttributeSet(xmlPullParser), true);
                            break;
                        case "Guideline":
                            aVarG = g(context, Xml.asAttributeSet(xmlPullParser), false);
                            b bVar = aVarG.f1514e;
                            bVar.f1531a = true;
                            bVar.f1533b = true;
                            break;
                        case "Barrier":
                            aVarG = g(context, Xml.asAttributeSet(xmlPullParser), false);
                            aVarG.f1514e.f1548i0 = 1;
                            break;
                        case "PropertySet":
                            if (aVar == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            aVar.f1512c.b(context, Xml.asAttributeSet(xmlPullParser));
                            continue;
                            break;
                            break;
                        case "Transform":
                            if (aVar == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            aVar.f1515f.b(context, Xml.asAttributeSet(xmlPullParser));
                            continue;
                            break;
                            break;
                        case "Layout":
                            if (aVar == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            aVar.f1514e.b(context, Xml.asAttributeSet(xmlPullParser));
                            continue;
                            break;
                            break;
                        case "Motion":
                            if (aVar == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            aVar.f1513d.b(context, Xml.asAttributeSet(xmlPullParser));
                            continue;
                            break;
                            break;
                        case "CustomAttribute":
                        case "CustomMethod":
                            if (aVar == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            androidx.constraintlayout.widget.a.e(context, xmlPullParser, aVar.f1516g);
                            continue;
                            break;
                            break;
                        default:
                            continue;
                            break;
                    }
                    aVar = aVarG;
                } else if (eventType == 3) {
                    String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (lowerCase.equals("guideline")) {
                            }
                            break;
                        case -190376483:
                            if (lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (lowerCase.equals("constraintset")) {
                            }
                            break;
                    }
                    if (r4 == 0) {
                        return;
                    }
                    if (r4 == 1 || r4 == 2 || r4 == 3) {
                        this.f1509f.put(Integer.valueOf(aVar.f1510a), aVar);
                        aVar = null;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}
