package com.applovin.exoplayer2.i.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f6865a = {0, 7, 8, 15};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f6866b = {0, 119, -120, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f6867c = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f6868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f6869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Canvas f6870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C0099b f6871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f6872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final h f6873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Bitmap f6874j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f6876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f6877c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f6878d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f6875a = i10;
            this.f6876b = iArr;
            this.f6877c = iArr2;
            this.f6878d = iArr3;
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.i.b.b$b, reason: collision with other inner class name */
    public static final class C0099b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f6882d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f6883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f6884f;

        public C0099b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f6879a = i10;
            this.f6880b = i11;
            this.f6881c = i12;
            this.f6882d = i13;
            this.f6883e = i14;
            this.f6884f = i15;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f6887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f6888d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f6885a = i10;
            this.f6886b = z10;
            this.f6887c = bArr;
            this.f6888d = bArr2;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6891c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<e> f6892d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f6889a = i10;
            this.f6890b = i11;
            this.f6891c = i12;
            this.f6892d = sparseArray;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6894b;

        public e(int i10, int i11) {
            this.f6893a = i10;
            this.f6894b = i11;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f6898d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f6899e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f6900f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f6901g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f6902h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f6903i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f6904j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final SparseArray<g> f6905k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f6895a = i10;
            this.f6896b = z10;
            this.f6897c = i11;
            this.f6898d = i12;
            this.f6899e = i13;
            this.f6900f = i14;
            this.f6901g = i15;
            this.f6902h = i16;
            this.f6903i = i17;
            this.f6904j = i18;
            this.f6905k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f6905k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f6905k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f6909d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f6910e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f6911f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f6906a = i10;
            this.f6907b = i11;
            this.f6908c = i12;
            this.f6909d = i13;
            this.f6910e = i14;
            this.f6911f = i15;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f6914c = new SparseArray<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f6915d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f6916e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray<a> f6917f = new SparseArray<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f6918g = new SparseArray<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C0099b f6919h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f6920i;

        public h(int i10, int i11) {
            this.f6912a = i10;
            this.f6913b = i11;
        }

        public void a() {
            this.f6914c.clear();
            this.f6915d.clear();
            this.f6916e.clear();
            this.f6917f.clear();
            this.f6918g.clear();
            this.f6919h = null;
            this.f6920i = null;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f6868d = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f6869e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f6870f = new Canvas();
        this.f6871g = new C0099b(719, 575, 0, 719, 0, 575);
        this.f6872h = new a(0, b(), c(), d());
        this.f6873i = new h(i10, i11);
    }

    private static int a(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int a(x xVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int i12;
        int iC;
        int i13 = i10;
        boolean z10 = false;
        while (true) {
            int iC2 = xVar.c(2);
            if (iC2 != 0) {
                z10 = z10;
                i12 = 1;
            } else {
                if (xVar.e()) {
                    iC = xVar.c(3) + 3;
                } else {
                    if (xVar.e()) {
                        i12 = 1;
                    } else {
                        int iC3 = xVar.c(2);
                        if (iC3 == 0) {
                            z10 = true;
                        } else if (iC3 == 1) {
                            i12 = 2;
                        } else if (iC3 == 2) {
                            iC = xVar.c(4) + 12;
                        } else if (iC3 != 3) {
                            z10 = z10;
                        } else {
                            iC = xVar.c(8) + 29;
                        }
                        iC2 = 0;
                        i12 = 0;
                    }
                    iC2 = 0;
                }
                z10 = z10;
                i12 = iC;
                iC2 = xVar.c(2);
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iC2 = bArr[iC2];
                }
                paint.setColor(iArr[iC2]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z10 = z10;
        }
    }

    private static C0099b a(x xVar) {
        int i10;
        int i11;
        int i12;
        int iC;
        xVar.b(4);
        boolean zE = xVar.e();
        xVar.b(3);
        int iC2 = xVar.c(16);
        int iC3 = xVar.c(16);
        if (zE) {
            int iC4 = xVar.c(16);
            int iC5 = xVar.c(16);
            int iC6 = xVar.c(16);
            iC = xVar.c(16);
            i12 = iC5;
            i11 = iC6;
            i10 = iC4;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = iC2;
            iC = iC3;
        }
        return new C0099b(iC2, iC3, i10, i12, i11, iC);
    }

    private static d a(x xVar, int i10) {
        int iC = xVar.c(8);
        int iC2 = xVar.c(4);
        int iC3 = xVar.c(2);
        xVar.b(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int iC4 = xVar.c(8);
            xVar.b(8);
            i11 -= 6;
            sparseArray.put(iC4, new e(xVar.c(16), xVar.c(16)));
        }
        return new d(iC, iC2, iC3, sparseArray);
    }

    private static void a(c cVar, a aVar, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = aVar.f6878d;
        } else {
            iArr = i10 == 2 ? aVar.f6877c : aVar.f6876b;
        }
        int[] iArr2 = iArr;
        a(cVar.f6887c, iArr2, i10, i11, i12, paint, canvas);
        a(cVar.f6888d, iArr2, i10, i11, i12 + 1, paint, canvas);
    }

    private static void a(x xVar, h hVar) {
        f fVar;
        SparseArray sparseArray;
        a aVar;
        int i10;
        Object obj;
        c cVar;
        int iC = xVar.c(8);
        int iC2 = xVar.c(16);
        int iC3 = xVar.c(16);
        int iC4 = xVar.c() + iC3;
        if (iC3 * 8 > xVar.a()) {
            q.c("DvbParser", "Data field length exceeds limit");
            xVar.b(xVar.a());
            return;
        }
        switch (iC) {
            case 16:
                if (iC2 == hVar.f6912a) {
                    d dVar = hVar.f6920i;
                    d dVarA = a(xVar, iC3);
                    if (dVarA.f6891c != 0) {
                        hVar.f6920i = dVarA;
                        hVar.f6914c.clear();
                        hVar.f6915d.clear();
                        hVar.f6916e.clear();
                    } else if (dVar != null && dVar.f6890b != dVarA.f6890b) {
                        hVar.f6920i = dVarA;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f6920i;
                if (iC2 == hVar.f6912a && dVar2 != null) {
                    f fVarB = b(xVar, iC3);
                    if (dVar2.f6891c == 0 && (fVar = hVar.f6914c.get(fVarB.f6895a)) != null) {
                        fVarB.a(fVar);
                    }
                    hVar.f6914c.put(fVarB.f6895a, fVarB);
                }
                break;
            case 18:
                if (iC2 == hVar.f6912a) {
                    a aVarC = c(xVar, iC3);
                    sparseArray = hVar.f6915d;
                    aVar = aVarC;
                } else if (iC2 == hVar.f6913b) {
                    a aVarC2 = c(xVar, iC3);
                    sparseArray = hVar.f6917f;
                    aVar = aVarC2;
                }
                i10 = aVar.f6875a;
                obj = aVar;
                sparseArray.put(i10, obj);
                break;
            case 19:
                if (iC2 == hVar.f6912a) {
                    c cVarB = b(xVar);
                    sparseArray = hVar.f6916e;
                    cVar = cVarB;
                } else if (iC2 == hVar.f6913b) {
                    c cVarB2 = b(xVar);
                    sparseArray = hVar.f6918g;
                    cVar = cVarB2;
                }
                i10 = cVar.f6885a;
                obj = cVar;
                sparseArray.put(i10, obj);
                break;
            case 20:
                if (iC2 == hVar.f6912a) {
                    hVar.f6919h = a(xVar);
                }
                break;
        }
        xVar.e(iC4 - xVar.c());
    }

    private static void a(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        x xVar = new x(bArr);
        int iA = i11;
        int i13 = i12;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (xVar.a() != 0) {
            int iC = xVar.c(8);
            if (iC != 240) {
                switch (iC) {
                    case 16:
                        if (i10 != 3) {
                            if (i10 == 2) {
                                bArr3 = bArrA3 == null ? f6865a : bArrA3;
                            } else {
                                bArr2 = null;
                            }
                            iA = a(xVar, iArr, bArr2, iA, i13, paint, canvas);
                        } else {
                            bArr3 = bArrA == null ? f6866b : bArrA;
                        }
                        bArr2 = bArr3;
                        iA = a(xVar, iArr, bArr2, iA, i13, paint, canvas);
                        break;
                    case 17:
                        iA = b(xVar, iArr, i10 == 3 ? bArrA2 == null ? f6867c : bArrA2 : null, iA, i13, paint, canvas);
                        break;
                    case 18:
                        iA = c(xVar, iArr, null, iA, i13, paint, canvas);
                        continue;
                    default:
                        switch (iC) {
                            case 32:
                                bArrA3 = a(4, 4, xVar);
                                break;
                            case 33:
                                bArrA = a(4, 8, xVar);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, xVar);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
                xVar.f();
            } else {
                i13 += 2;
                iA = i11;
            }
        }
    }

    private static byte[] a(int i10, int i11, x xVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) xVar.c(i11);
        }
        return bArr;
    }

    private static int b(x xVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int i12;
        int iC;
        int i13 = i10;
        boolean z10 = false;
        while (true) {
            int iC2 = xVar.c(4);
            int i14 = 2;
            if (iC2 != 0) {
                z10 = z10;
                i12 = 1;
            } else if (xVar.e()) {
                if (xVar.e()) {
                    int iC3 = xVar.c(2);
                    if (iC3 != 0) {
                        if (iC3 != 1) {
                            if (iC3 == 2) {
                                iC = xVar.c(4) + 9;
                            } else if (iC3 != 3) {
                                z10 = z10;
                                iC2 = 0;
                                i12 = 0;
                            } else {
                                iC = xVar.c(8) + 25;
                            }
                        }
                        i12 = i14;
                    } else {
                        i12 = 1;
                    }
                    iC2 = 0;
                } else {
                    iC = xVar.c(2) + 4;
                }
                iC2 = xVar.c(4);
                z10 = z10;
                i12 = iC;
            } else {
                int iC4 = xVar.c(3);
                if (iC4 != 0) {
                    i14 = iC4 + 2;
                    i12 = i14;
                    iC2 = 0;
                } else {
                    z10 = true;
                    iC2 = 0;
                    i12 = 0;
                }
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iC2 = bArr[iC2];
                }
                paint.setColor(iArr[iC2]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z10 = z10;
        }
    }

    private static c b(x xVar) {
        byte[] bArr;
        int iC = xVar.c(16);
        xVar.b(4);
        int iC2 = xVar.c(2);
        boolean zE = xVar.e();
        xVar.b(1);
        byte[] bArr2 = ai.f7600f;
        if (iC2 != 1) {
            if (iC2 == 0) {
                int iC3 = xVar.c(16);
                int iC4 = xVar.c(16);
                if (iC3 > 0) {
                    bArr2 = new byte[iC3];
                    xVar.b(bArr2, 0, iC3);
                }
                if (iC4 > 0) {
                    bArr = new byte[iC4];
                    xVar.b(bArr, 0, iC4);
                }
            }
            return new c(iC, zE, bArr2, bArr);
        }
        xVar.b(xVar.c(8) * 16);
        bArr = bArr2;
        return new c(iC, zE, bArr2, bArr);
    }

    private static f b(x xVar, int i10) {
        int iC;
        int iC2;
        int iC3 = xVar.c(8);
        xVar.b(4);
        boolean zE = xVar.e();
        xVar.b(3);
        int i11 = 16;
        int iC4 = xVar.c(16);
        int iC5 = xVar.c(16);
        int iC6 = xVar.c(3);
        int iC7 = xVar.c(3);
        int i12 = 2;
        xVar.b(2);
        int iC8 = xVar.c(8);
        int iC9 = xVar.c(8);
        int iC10 = xVar.c(4);
        int iC11 = xVar.c(2);
        xVar.b(2);
        int i13 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int iC12 = xVar.c(i11);
            int iC13 = xVar.c(i12);
            int iC14 = xVar.c(i12);
            int iC15 = xVar.c(12);
            int i14 = iC11;
            xVar.b(4);
            int iC16 = xVar.c(12);
            i13 -= 6;
            if (iC13 == 1 || iC13 == 2) {
                i13 -= 2;
                iC = xVar.c(8);
                iC2 = xVar.c(8);
            } else {
                iC = 0;
                iC2 = 0;
            }
            sparseArray.put(iC12, new g(iC13, iC14, iC15, iC16, iC, iC2));
            iC11 = i14;
            i12 = 2;
            i11 = 16;
        }
        return new f(iC3, zE, iC4, iC5, iC6, iC7, iC8, iC9, iC10, iC11, sparseArray);
    }

    private static int[] b() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int c(x xVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int iC;
        int i12 = i10;
        boolean z11 = false;
        while (true) {
            int iC2 = xVar.c(8);
            if (iC2 != 0) {
                z10 = z11;
                iC = 1;
            } else if (xVar.e()) {
                z10 = z11;
                iC = xVar.c(7);
                iC2 = xVar.c(8);
            } else {
                int iC3 = xVar.c(7);
                if (iC3 != 0) {
                    z10 = z11;
                    iC = iC3;
                    iC2 = 0;
                } else {
                    z10 = true;
                    iC2 = 0;
                    iC = 0;
                }
            }
            if (iC != 0 && paint != null) {
                if (bArr != null) {
                    iC2 = bArr[iC2];
                }
                paint.setColor(iArr[iC2]);
                canvas.drawRect(i12, i11, i12 + iC, i11 + 1, paint);
            }
            i12 += iC;
            if (z10) {
                return i12;
            }
            z11 = z10;
        }
    }

    private static a c(x xVar, int i10) {
        int[] iArr;
        int iC;
        int i11;
        int iC2;
        int iC3;
        int iC4;
        int i12 = 8;
        int iC5 = xVar.c(8);
        xVar.b(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrB = b();
        int[] iArrC = c();
        int[] iArrD = d();
        while (i14 > 0) {
            int iC6 = xVar.c(i12);
            int iC7 = xVar.c(i12);
            int i15 = i14 - 2;
            if ((iC7 & 128) != 0) {
                iArr = iArrB;
            } else {
                iArr = (iC7 & 64) != 0 ? iArrC : iArrD;
            }
            if ((iC7 & 1) != 0) {
                iC3 = xVar.c(i12);
                iC4 = xVar.c(i12);
                iC = xVar.c(i12);
                iC2 = xVar.c(i12);
                i11 = i15 - 4;
            } else {
                int iC8 = xVar.c(6) << i13;
                int iC9 = xVar.c(4) << 4;
                iC = xVar.c(4) << 4;
                i11 = i15 - 2;
                iC2 = xVar.c(i13) << 6;
                iC3 = iC8;
                iC4 = iC9;
            }
            if (iC3 == 0) {
                iC2 = 255;
                iC4 = 0;
                iC = 0;
            }
            double d10 = iC3;
            double d11 = iC4 - 128;
            double d12 = iC - 128;
            iArr[iC6] = a((byte) (255 - (iC2 & 255)), ai.a((int) ((1.402d * d11) + d10), 0, 255), ai.a((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), ai.a((int) ((d12 * 1.772d) + d10), 0, 255));
            i14 = i11;
            iC5 = iC5;
            i12 = 8;
            i13 = 2;
        }
        return new a(iC5, iArrB, iArrC, iArrD);
    }

    private static int[] c() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = a(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] d() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & SyslogConstants.LOG_LOCAL1;
                if (i11 == 0) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = a(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public List<com.applovin.exoplayer2.i.a> a(byte[] bArr, int i10) {
        x xVar = new x(bArr, i10);
        while (xVar.a() >= 48 && xVar.c(8) == 15) {
            a(xVar, this.f6873i);
        }
        h hVar = this.f6873i;
        d dVar = hVar.f6920i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C0099b c0099b = hVar.f6919h;
        if (c0099b == null) {
            c0099b = this.f6871g;
        }
        Bitmap bitmap = this.f6874j;
        if (bitmap == null || c0099b.f6879a + 1 != bitmap.getWidth() || c0099b.f6880b + 1 != this.f6874j.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c0099b.f6879a + 1, c0099b.f6880b + 1, Bitmap.Config.ARGB_8888);
            this.f6874j = bitmapCreateBitmap;
            this.f6870f.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray = dVar.f6892d;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            this.f6870f.save();
            e eVarValueAt = sparseArray.valueAt(i11);
            f fVar = this.f6873i.f6914c.get(sparseArray.keyAt(i11));
            int i12 = eVarValueAt.f6893a + c0099b.f6881c;
            int i13 = eVarValueAt.f6894b + c0099b.f6883e;
            this.f6870f.clipRect(i12, i13, Math.min(fVar.f6897c + i12, c0099b.f6882d), Math.min(fVar.f6898d + i13, c0099b.f6884f));
            a aVar = this.f6873i.f6915d.get(fVar.f6901g);
            if (aVar == null && (aVar = this.f6873i.f6917f.get(fVar.f6901g)) == null) {
                aVar = this.f6872h;
            }
            int i14 = 0;
            for (SparseArray<g> sparseArray2 = fVar.f6905k; i14 < sparseArray2.size(); sparseArray2 = sparseArray2) {
                int iKeyAt = sparseArray2.keyAt(i14);
                g gVarValueAt = sparseArray2.valueAt(i14);
                c cVar = this.f6873i.f6916e.get(iKeyAt);
                c cVar2 = cVar == null ? this.f6873i.f6918g.get(iKeyAt) : cVar;
                if (cVar2 != null) {
                    a(cVar2, aVar, fVar.f6900f, gVarValueAt.f6908c + i12, i13 + gVarValueAt.f6909d, cVar2.f6886b ? null : this.f6868d, this.f6870f);
                }
                i14++;
            }
            if (fVar.f6896b) {
                int i15 = fVar.f6900f;
                this.f6869e.setColor(i15 == 3 ? aVar.f6878d[fVar.f6902h] : i15 == 2 ? aVar.f6877c[fVar.f6903i] : aVar.f6876b[fVar.f6904j]);
                this.f6870f.drawRect(i12, i13, fVar.f6897c + i12, fVar.f6898d + i13, this.f6869e);
            }
            arrayList.add(new com.applovin.exoplayer2.i.a.C0095a().a(Bitmap.createBitmap(this.f6874j, i12, i13, fVar.f6897c, fVar.f6898d)).a(i12 / c0099b.f6879a).b(0).a(i13 / c0099b.f6880b, 0).a(0).b(fVar.f6897c / c0099b.f6879a).c(fVar.f6898d / c0099b.f6880b).e());
            this.f6870f.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f6870f.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void a() {
        this.f6873i.a();
    }
}
