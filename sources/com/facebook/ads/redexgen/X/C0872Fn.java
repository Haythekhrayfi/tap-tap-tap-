package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.Log;
import android.util.SparseArray;
import ch.qos.logback.core.net.SyslogConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0872Fn {
    public static byte[] A07;
    public static String[] A08 = {"qcU5l5rVDanZ0IBZnB67EILhI18GgdFe", "32XpuNghlFeF4zyqPL948gmCUNCGk", "bftD5DkqR73p2Uf2yBhEF5T9UOvyv9s", "0", "qryxRa4yOsFNWhLtu25s3YxhDLRy", "", "tLr9RBWs5E21", "UeFN6nMF8sjHvHxScJIKm37Ehl9oCVg2"};
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02;
    public final Paint A03;
    public final C0864Ff A04;
    public final C0865Fg A05;
    public final C0871Fm A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0864Ff A04(C0913He c0913He, int i10) {
        int[] iArr;
        int iA04;
        int iA05;
        int iA06;
        int iA07;
        int i11 = 8;
        int iA08 = c0913He.A04(8);
        c0913He.A08(8);
        int i12 = i10 - 2;
        int[] iArrA0F = A0F();
        int[] iArrA0G = A0G();
        int[] iArrA0H = A0H();
        while (i12 > 0) {
            int iA09 = c0913He.A04(i11);
            int iA010 = c0913He.A04(i11);
            int i13 = i12 - 2;
            if ((iA010 & 128) != 0) {
                iArr = iArrA0F;
            } else {
                iArr = (iA010 & 64) != 0 ? iArrA0G : iArrA0H;
            }
            if ((iA010 & 1) != 0) {
                iA04 = c0913He.A04(i11);
                iA05 = c0913He.A04(i11);
                iA06 = c0913He.A04(i11);
                iA07 = c0913He.A04(i11);
                i12 = i13 - 4;
            } else {
                iA04 = c0913He.A04(6) << 2;
                iA05 = c0913He.A04(4) << 4;
                iA06 = c0913He.A04(4) << 4;
                iA07 = c0913He.A04(2) << 6;
                i12 = i13 - 2;
            }
            if (iA04 == 0) {
                iA05 = 0;
                iA06 = 0;
                iA07 = 255;
            }
            iArr[iA09] = A00((byte) (255 - (iA07 & 255)), C0930Hv.A06((int) (((double) iA04) + (((double) (iA05 - 128)) * 1.402d)), 0, 255), C0930Hv.A06((int) ((((double) iA04) - (((double) (iA06 - 128)) * 0.34414d)) - (((double) (iA05 - 128)) * 0.71414d)), 0, 255), C0930Hv.A06((int) (((double) iA04) + (((double) (iA06 - 128)) * 1.772d)), 0, 255));
            i11 = 8;
        }
        return new C0864Ff(iA08, iArrA0F, iArrA0G, iArrA0H);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0865Fg A05(C0913He c0913He) {
        int iA04;
        int iA05;
        int iA06;
        int iA07;
        c0913He.A08(4);
        boolean zA0F = c0913He.A0F();
        c0913He.A08(3);
        int iA08 = c0913He.A04(16);
        int iA09 = c0913He.A04(16);
        if (zA0F) {
            iA04 = c0913He.A04(16);
            iA07 = c0913He.A04(16);
            iA05 = c0913He.A04(16);
            iA06 = c0913He.A04(16);
        } else {
            iA04 = 0;
            iA05 = 0;
            iA06 = iA09;
            iA07 = iA08;
        }
        return new C0865Fg(iA08, iA09, iA04, iA07, iA05, iA06);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0869Fk A08(C0913He c0913He, int i10) {
        int i11 = 8;
        int iA04 = c0913He.A04(8);
        c0913He.A08(4);
        boolean zA0F = c0913He.A0F();
        c0913He.A08(3);
        int iA05 = c0913He.A04(16);
        int iA06 = c0913He.A04(16);
        int iA07 = c0913He.A04(3);
        int iA08 = c0913He.A04(3);
        c0913He.A08(2);
        int iA09 = c0913He.A04(8);
        int iA010 = c0913He.A04(8);
        int iA011 = c0913He.A04(4);
        int iA012 = c0913He.A04(2);
        c0913He.A08(2);
        int i12 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i12 > 0) {
            int iA013 = c0913He.A04(16);
            int iA014 = c0913He.A04(2);
            int iA015 = c0913He.A04(2);
            int iA016 = c0913He.A04(12);
            c0913He.A08(4);
            int iA017 = c0913He.A04(12);
            i12 -= 6;
            int iA018 = 0;
            int iA019 = 0;
            if (iA014 == 1 || iA014 == 2) {
                iA018 = c0913He.A04(i11);
                iA019 = c0913He.A04(i11);
                i12 -= 2;
            }
            sparseArray.put(iA013, new C0870Fl(iA014, iA015, iA016, iA017, iA018, iA019));
            i11 = 8;
        }
        return new C0869Fk(iA04, zA0F, iA05, iA06, iA07, iA08, iA09, iA010, iA011, iA012, sparseArray);
    }

    public static String A09(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{18, 55, 34, 55, 118, 48, 63, 51, 58, 50, 118, 58, 51, 56, 49, 34, 62, 118, 51, 46, 53, 51, 51, 50, 37, 118, 58, 63, 59, 63, 34, 106, 88, 76, 126, 79, 92, 93, 75, 92};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final List<FT> A0I(byte[] bArr, int i10) {
        C0913He c0913He = new C0913He(bArr, i10);
        while (c0913He.A01() >= 48 && c0913He.A04(8) == 15) {
            A0C(c0913He, this.A06);
        }
        if (this.A06.A01 == null) {
            return Collections.emptyList();
        }
        C0865Fg c0865Fg = this.A06.A00 != null ? this.A06.A00 : this.A05;
        if (this.A00 == null || c0865Fg.A05 + 1 != this.A00.getWidth() || c0865Fg.A00 + 1 != this.A00.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c0865Fg.A05 + 1, c0865Fg.A00 + 1, Bitmap.Config.ARGB_8888);
            this.A00 = bitmapCreateBitmap;
            this.A01.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C0868Fj> sparseArray = this.A06.A01.A03;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            C0868Fj c0868FjValueAt = sparseArray.valueAt(i11);
            C0869Fk c0869Fk = this.A06.A08.get(sparseArray.keyAt(i11));
            int i12 = c0868FjValueAt.A00 + c0865Fg.A02;
            int i13 = c0868FjValueAt.A01 + c0865Fg.A04;
            this.A01.clipRect(i12, i13, Math.min(c0869Fk.A08 + i12, c0865Fg.A01), Math.min(c0869Fk.A02 + i13, c0865Fg.A03), Region.Op.REPLACE);
            C0864Ff c0864Ff = this.A06.A06.get(c0869Fk.A00);
            if (c0864Ff == null && (c0864Ff = this.A06.A04.get(c0869Fk.A00)) == null) {
                c0864Ff = this.A04;
            }
            SparseArray<C0870Fl> sparseArray2 = c0869Fk.A09;
            for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                int iKeyAt = sparseArray2.keyAt(i14);
                C0870Fl c0870FlValueAt = sparseArray2.valueAt(i14);
                C0866Fh c0866Fh = this.A06.A07.get(iKeyAt);
                String[] strArr = A08;
                if (strArr[0].charAt(24) == strArr[7].charAt(24)) {
                    throw new RuntimeException();
                }
                A08[1] = "0wDldquZfVkccfOmGfzJ1HL0d6oT0";
                if (c0866Fh == null) {
                    c0866Fh = this.A06.A05.get(iKeyAt);
                }
                if (c0866Fh != null) {
                    A0B(c0866Fh, c0864Ff, c0869Fk.A01, i12 + c0870FlValueAt.A02, i13 + c0870FlValueAt.A05, c0866Fh.A01 ? null : this.A02, this.A01);
                }
            }
            if (c0869Fk.A0A) {
                this.A03.setColor(c0869Fk.A01 == 3 ? c0864Ff.A03[c0869Fk.A07] : c0869Fk.A01 == 2 ? c0864Ff.A02[c0869Fk.A06] : c0864Ff.A01[c0869Fk.A05]);
                this.A01.drawRect(i12, i13, c0869Fk.A08 + i12, c0869Fk.A02 + i13, this.A03);
            }
            arrayList.add(new FT(Bitmap.createBitmap(this.A00, i12, i13, c0869Fk.A08, c0869Fk.A02), i12 / c0865Fg.A05, 0, i13 / c0865Fg.A00, 0, c0869Fk.A08 / c0865Fg.A05, c0869Fk.A02 / c0865Fg.A00));
            this.A01.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    static {
        A0A();
        A09 = new byte[]{0, 7, 8, 15};
        A0A = new byte[]{0, 119, -120, -1};
        A0B = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public C0872Fn(int i10, int i11) {
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.A03 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new C0865Fg(719, 575, 0, 719, 0, 575);
        this.A04 = new C0864Ff(0, A0F(), A0G(), A0H());
        this.A06 = new C0871Fm(i10, i11);
    }

    public static int A00(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static int A01(C0913He c0913He, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int i12 = i10;
        boolean z10 = false;
        do {
            int iA04 = 0;
            int iA05 = c0913He.A04(2);
            if (iA05 != 0) {
                iA04 = 1;
                if (A08[1].length() != 29) {
                    throw new RuntimeException();
                }
                A08[6] = "cKDkKJCaTP5Z";
            } else if (c0913He.A0F()) {
                iA04 = c0913He.A04(3) + 3;
                iA05 = c0913He.A04(2);
                if (A08[1].length() == 29) {
                    A08[1] = "Xe5wyvwrL1rxQiCfD8ENREY9AaRUH";
                }
            } else if (c0913He.A0F()) {
                iA04 = 1;
                iA05 = 0;
            } else {
                switch (c0913He.A04(2)) {
                    case 0:
                        z10 = true;
                        iA05 = 0;
                        break;
                    case 1:
                        iA04 = 2;
                        iA05 = 0;
                        break;
                    case 2:
                        iA04 = c0913He.A04(4) + 12;
                        iA05 = c0913He.A04(2);
                        break;
                    case 3:
                        iA04 = c0913He.A04(8) + 29;
                        if (A08[1].length() != 29) {
                            throw new RuntimeException();
                        }
                        A08[5] = "eZC8v48u";
                        iA05 = c0913He.A04(2);
                        break;
                    default:
                        iA05 = 0;
                        break;
                }
            }
            if (iA04 != 0 && paint != null) {
                if (bArr != null) {
                    iA05 = bArr[iA05];
                }
                paint.setColor(iArr[iA05]);
                canvas.drawRect(i12, i11, i12 + iA04, i11 + 1, paint);
            }
            i12 += iA04;
        } while (!z10);
        return i12;
    }

    public static int A02(C0913He c0913He, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int i12 = i10;
        boolean z10 = false;
        do {
            int peek = 0;
            int iA04 = c0913He.A04(4);
            if (iA04 != 0) {
                peek = 1;
            } else if (!c0913He.A0F()) {
                int iA05 = c0913He.A04(3);
                if (iA05 != 0) {
                    peek = iA05 + 2;
                    iA04 = 0;
                } else {
                    z10 = true;
                    iA04 = 0;
                }
            } else if (!c0913He.A0F()) {
                peek = c0913He.A04(2) + 4;
                iA04 = c0913He.A04(4);
            } else {
                switch (c0913He.A04(2)) {
                    case 0:
                        peek = 1;
                        if (A08[1].length() == 29) {
                            String[] strArr = A08;
                            strArr[3] = "b";
                            strArr[4] = "RKCQrML1KI9i2rbeBXbE06C32ORX";
                            iA04 = 0;
                        } else {
                            iA04 = 0;
                        }
                        break;
                    case 1:
                        peek = 2;
                        iA04 = 0;
                        break;
                    case 2:
                        peek = c0913He.A04(4) + 9;
                        iA04 = c0913He.A04(4);
                        break;
                    case 3:
                        peek = c0913He.A04(8) + 25;
                        String[] strArr2 = A08;
                        if (strArr2[3].length() == strArr2[4].length()) {
                            throw new RuntimeException();
                        }
                        A08[6] = "tDVEwF5JbpPt";
                        iA04 = c0913He.A04(4);
                        break;
                        break;
                    default:
                        iA04 = 0;
                        break;
                }
            }
            if (peek != 0 && paint != null) {
                if (bArr != null) {
                    iA04 = bArr[iA04];
                }
                paint.setColor(iArr[iA04]);
                float f10 = i12;
                float f11 = i11;
                if (A08[6].length() != 12) {
                    throw new RuntimeException();
                }
                A08[1] = "PxagUxU0Gd3Wd2jZQY5J7se2mW8fT";
                canvas.drawRect(f10, f11, i12 + peek, i11 + 1, paint);
            }
            i12 += peek;
        } while (!z10);
        return i12;
    }

    public static int A03(C0913He c0913He, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int clutIndex;
        int i12 = i10;
        boolean z10 = false;
        do {
            int iA04 = c0913He.A04(8);
            if (iA04 != 0) {
                clutIndex = 1;
            } else if (!c0913He.A0F()) {
                clutIndex = c0913He.A04(7);
                if (A08[6].length() != 12) {
                    throw new RuntimeException();
                }
                A08[1] = "SuejjuLnG0h9t9VMaryqiTg33Oi2Z";
                if (clutIndex != 0) {
                    iA04 = 0;
                } else {
                    z10 = true;
                    clutIndex = 0;
                    iA04 = 0;
                }
            } else {
                clutIndex = c0913He.A04(7);
                iA04 = c0913He.A04(8);
            }
            if (clutIndex != 0 && paint != null) {
                if (bArr != null) {
                    iA04 = bArr[iA04];
                }
                paint.setColor(iArr[iA04]);
                canvas.drawRect(i12, i11, i12 + clutIndex, i11 + 1, paint);
            }
            i12 += clutIndex;
        } while (!z10);
        return i12;
    }

    public static C0866Fh A06(C0913He c0913He) {
        int iA04 = c0913He.A04(16);
        c0913He.A08(4);
        int objectId = c0913He.A04(2);
        boolean zA0F = c0913He.A0F();
        c0913He.A08(1);
        byte[] bArr = null;
        byte[] bArr2 = null;
        if (objectId == 1) {
            int numberOfCodes = c0913He.A04(8);
            c0913He.A08(numberOfCodes * 16);
        } else if (objectId == 0) {
            int objectCodingMethod = c0913He.A04(16);
            int objectId2 = c0913He.A04(16);
            if (objectCodingMethod > 0) {
                bArr = new byte[objectCodingMethod];
                c0913He.A0E(bArr, 0, objectCodingMethod);
            }
            if (objectId2 > 0) {
                bArr2 = new byte[objectId2];
                c0913He.A0E(bArr2, 0, objectId2);
            } else {
                bArr2 = bArr;
            }
        }
        return new C0866Fh(iA04, zA0F, bArr, bArr2);
    }

    public static C0867Fi A07(C0913He c0913He, int i10) {
        int iA04 = c0913He.A04(8);
        int iA05 = c0913He.A04(4);
        int iA06 = c0913He.A04(2);
        c0913He.A08(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int remainingLength = c0913He.A04(8);
            c0913He.A08(8);
            int version = c0913He.A04(16);
            int timeoutSecs = c0913He.A04(16);
            i11 -= 6;
            sparseArray.put(remainingLength, new C0868Fj(version, timeoutSecs));
        }
        return new C0867Fi(iA04, iA05, iA06, sparseArray);
    }

    public static void A0B(C0866Fh c0866Fh, C0864Ff c0864Ff, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = c0864Ff.A03;
        } else {
            if (A08[2].length() == 20) {
                throw new RuntimeException();
            }
            A08[1] = "74G7JuTvJBV0INH1XI3DUfK6d2EWZ";
            if (i10 == 2) {
                iArr = c0864Ff.A02;
            } else {
                iArr = c0864Ff.A01;
            }
        }
        A0D(c0866Fh.A03, iArr, i10, i11, i12, paint, canvas);
        A0D(c0866Fh.A02, iArr, i10, i11, i12 + 1, paint, canvas);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006e  */
    /* JADX WARN: Code duplicated, block: B:19:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x008e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0094  */
    public static void A0C(C0913He c0913He, C0871Fm c0871Fm) {
        int dataFieldLength;
        int segmentType;
        int iA04 = c0913He.A04(8);
        int iA05 = c0913He.A04(16);
        int pageId = c0913He.A04(16);
        int dataFieldLimit = c0913He.A02() + pageId;
        int dataFieldLength2 = pageId * 8;
        int segmentType2 = c0913He.A01();
        if (dataFieldLength2 > segmentType2) {
            Log.w(A09(31, 9, 63), A09(0, 31, 71));
            int segmentType3 = c0913He.A01();
            c0913He.A08(segmentType3);
            return;
        }
        switch (iA04) {
            case 16:
                int segmentType4 = c0871Fm.A03;
                if (iA05 == segmentType4) {
                    C0867Fi pageComposition = c0871Fm.A01;
                    C0867Fi current = A07(c0913He, pageId);
                    int dataFieldLength3 = A08[2].length();
                    if (dataFieldLength3 != 20) {
                        String[] strArr = A08;
                        strArr[0] = "SOWWurFjCTsQ5JKY9OnGZdezCI3KtXYI";
                        strArr[7] = "V4dNvY88haURe4qy074bHXOdfnJc7iQY";
                        int segmentType5 = current.A00;
                        if (segmentType5 != 0) {
                            c0871Fm.A01 = current;
                            c0871Fm.A08.clear();
                            c0871Fm.A06.clear();
                            c0871Fm.A07.clear();
                        } else if (pageComposition != null) {
                            dataFieldLength = pageComposition.A02;
                            segmentType = current.A02;
                            if (dataFieldLength != segmentType) {
                                c0871Fm.A01 = current;
                            }
                        }
                    } else {
                        A08[5] = "eHaCLq5ayPLh";
                        int segmentType6 = current.A00;
                        if (segmentType6 != 0) {
                            c0871Fm.A01 = current;
                            c0871Fm.A08.clear();
                            c0871Fm.A06.clear();
                            c0871Fm.A07.clear();
                        } else if (pageComposition != null) {
                            dataFieldLength = pageComposition.A02;
                            segmentType = current.A02;
                            if (dataFieldLength != segmentType) {
                                c0871Fm.A01 = current;
                            }
                        }
                    }
                }
                break;
            case 17:
                C0867Fi c0867Fi = c0871Fm.A01;
                int segmentType7 = c0871Fm.A03;
                if (iA05 == segmentType7 && c0867Fi != null) {
                    C0869Fk regionComposition = A08(c0913He, pageId);
                    int segmentType8 = c0867Fi.A00;
                    if (segmentType8 == 0) {
                        SparseArray<C0869Fk> sparseArray = c0871Fm.A08;
                        int segmentType9 = regionComposition.A03;
                        regionComposition.A00(sparseArray.get(segmentType9));
                    }
                    SparseArray<C0869Fk> sparseArray2 = c0871Fm.A08;
                    String[] strArr2 = A08;
                    String str = strArr2[3];
                    String str2 = strArr2[4];
                    int dataFieldLength4 = str.length();
                    int segmentType10 = str2.length();
                    if (dataFieldLength4 == segmentType10) {
                        throw new RuntimeException();
                    }
                    A08[6] = "mahKYWCII7kQ";
                    int segmentType11 = regionComposition.A03;
                    sparseArray2.put(segmentType11, regionComposition);
                }
                break;
            case 18:
                int segmentType12 = c0871Fm.A03;
                if (iA05 == segmentType12) {
                    C0864Ff c0864FfA04 = A04(c0913He, pageId);
                    SparseArray<C0864Ff> sparseArray3 = c0871Fm.A06;
                    int segmentType13 = c0864FfA04.A00;
                    sparseArray3.put(segmentType13, c0864FfA04);
                } else {
                    int segmentType14 = c0871Fm.A02;
                    if (iA05 == segmentType14) {
                        C0864Ff c0864FfA05 = A04(c0913He, pageId);
                        SparseArray<C0864Ff> sparseArray4 = c0871Fm.A04;
                        int segmentType15 = c0864FfA05.A00;
                        sparseArray4.put(segmentType15, c0864FfA05);
                    }
                }
                break;
            case 19:
                int segmentType16 = c0871Fm.A03;
                if (iA05 == segmentType16) {
                    C0866Fh c0866FhA06 = A06(c0913He);
                    SparseArray<C0866Fh> sparseArray5 = c0871Fm.A07;
                    int segmentType17 = c0866FhA06.A00;
                    sparseArray5.put(segmentType17, c0866FhA06);
                } else {
                    int segmentType18 = c0871Fm.A02;
                    if (iA05 == segmentType18) {
                        C0866Fh c0866FhA07 = A06(c0913He);
                        SparseArray<C0866Fh> sparseArray6 = c0871Fm.A05;
                        int segmentType19 = c0866FhA07.A00;
                        sparseArray6.put(segmentType19, c0866FhA07);
                    }
                }
                break;
            case 20:
                int segmentType20 = c0871Fm.A03;
                if (iA05 == segmentType20) {
                    c0871Fm.A00 = A05(c0913He);
                }
                break;
        }
        int segmentType21 = c0913He.A02();
        c0913He.A09(dataFieldLimit - segmentType21);
    }

    public static void A0D(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] clutMapTable4To8;
        byte[] clutMapTable4To9;
        int line = i12;
        C0913He c0913He = new C0913He(bArr);
        byte[] clutMapTable2To8 = null;
        byte[] clutMapTable2To4 = null;
        int column = i11;
        while (c0913He.A01() != 0) {
            switch (c0913He.A04(8)) {
                case 16:
                    if (i10 == 3) {
                        clutMapTable4To9 = clutMapTable2To4 == null ? A0A : clutMapTable2To4;
                    } else if (i10 == 2) {
                        clutMapTable4To9 = clutMapTable2To8 == null ? A09 : clutMapTable2To8;
                    } else {
                        clutMapTable4To9 = null;
                        if (A08[5].length() == 5) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A08;
                        strArr[0] = "aCQdDxqS2bkmSWw219FL9FrVQLNlGxjh";
                        strArr[7] = "CXVqOrR1KNECyNPiemwICdwFVxmD3XsB";
                    }
                    if (A08[5].length() == 5) {
                        throw new RuntimeException();
                    }
                    A08[1] = "sxwfPuAvCy0meNXm9qprXKFgJpDmZ";
                    column = A01(c0913He, iArr, clutMapTable4To9, column, line, paint, canvas);
                    c0913He.A05();
                    break;
                    break;
                case 17:
                    if (i10 == 3) {
                        clutMapTable4To8 = 0 == 0 ? A0B : null;
                    } else {
                        clutMapTable4To8 = null;
                    }
                    column = A02(c0913He, iArr, clutMapTable4To8, column, line, paint, canvas);
                    c0913He.A05();
                    break;
                case 18:
                    column = A03(c0913He, iArr, null, column, line, paint, canvas);
                    break;
                case 32:
                    clutMapTable2To8 = A0E(4, 4, c0913He);
                    break;
                case 33:
                    clutMapTable2To4 = A0E(4, 8, c0913He);
                    break;
                case 34:
                    clutMapTable2To4 = A0E(16, 8, c0913He);
                    break;
                case 240:
                    line += 2;
                    column = i11;
                    break;
            }
        }
    }

    public static byte[] A0E(int i10, int i11, C0913He c0913He) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) c0913He.A04(i11);
        }
        return bArr;
    }

    public static int[] A0F() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] A0G() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < iArr.length; i10++) {
            if (i10 < 8) {
                int i11 = i10 & 1;
                if (A08[1].length() != 29) {
                    throw new RuntimeException();
                }
                A08[6] = "OBOqbcJ5TVgi";
                int i12 = i11 != 0 ? 255 : 0;
                iArr[i10] = A00(255, i12, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                int i13 = (i10 & 1) != 0 ? 127 : 0;
                iArr[i10] = A00(255, i13, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c3  */
    public static int[] A0H() {
        int i10;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (A08[5].length() != 5) {
                A08[5] = "yMmopDV0PROTT6iUygdI9MoWuRB";
                if (i11 < 8) {
                    int i12 = (i11 & 1) != 0 ? 255 : 0;
                    iArr[i11] = A00(63, i12, (i11 & 2) != 0 ? 255 : 0, (i11 & 4) == 0 ? 0 : 255);
                } else {
                    switch (i11 & SyslogConstants.LOG_LOCAL1) {
                        case 0:
                            int i13 = (i11 & 1) != 0 ? 85 : 0;
                            int i14 = i11 & 16;
                            if (A08[6].length() != 12) {
                                A08[6] = "5kFBsD3TZCPr";
                                if (i14 != 0) {
                                    i10 = 170;
                                } else {
                                    i10 = 0;
                                }
                            } else {
                                A08[5] = "e5fZNa";
                                if (i14 != 0) {
                                    i10 = 170;
                                } else {
                                    i10 = 0;
                                }
                            }
                            int i15 = i13 + i10;
                            int i16 = ((i11 & 2) != 0 ? 85 : 0) + ((i11 & 32) != 0 ? 170 : 0);
                            int i17 = ((i11 & 4) == 0 ? 0 : 85) + ((i11 & 64) == 0 ? 0 : 170);
                            String[] strArr = A08;
                            if (strArr[0].charAt(24) == strArr[7].charAt(24)) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A08;
                            strArr2[3] = "N";
                            strArr2[4] = "KgCT6FPPbQR5Gt38AZY6Kgkq0L3q";
                            iArr[i11] = A00(255, i15, i16, i17);
                            continue;
                            break;
                        case 8:
                            int i18 = (i11 & 1) != 0 ? 85 : 0;
                            iArr[i11] = A00(127, i18 + ((i11 & 16) != 0 ? 170 : 0), ((i11 & 2) != 0 ? 85 : 0) + ((i11 & 32) != 0 ? 170 : 0), ((i11 & 4) == 0 ? 0 : 85) + ((i11 & 64) == 0 ? 0 : 170));
                            continue;
                        case 128:
                            int i19 = (i11 & 1) != 0 ? 43 : 0;
                            int iA00 = A00(255, i19 + 127 + ((i11 & 16) != 0 ? 85 : 0), ((i11 & 2) != 0 ? 43 : 0) + 127 + ((i11 & 32) != 0 ? 85 : 0), ((i11 & 4) == 0 ? 0 : 43) + 127 + ((i11 & 64) == 0 ? 0 : 85));
                            String[] strArr3 = A08;
                            if (strArr3[3].length() == strArr3[4].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr4 = A08;
                            strArr4[0] = "aybqBWwtY0DT9MvKUrSszXiCsWNuAoGt";
                            strArr4[7] = "n5OaccyWXsmPzT0g59BcvtkeBPKtga8v";
                            iArr[i11] = iA00;
                            continue;
                            break;
                        case SyslogConstants.LOG_LOCAL1 /* 136 */:
                            int i20 = ((i11 & 1) != 0 ? 43 : 0) + ((i11 & 16) != 0 ? 85 : 0);
                            int i21 = ((i11 & 2) != 0 ? 43 : 0) + ((i11 & 32) != 0 ? 85 : 0);
                            if (A08[2].length() != 20) {
                                A08[5] = "gSUXJnsqi";
                                int i22 = (i11 & 4) == 0 ? 0 : 43;
                                int i23 = i11 & 64;
                                if (A08[2].length() != 20) {
                                    String[] strArr5 = A08;
                                    strArr5[0] = "whmrMiK0u12tANJBqhusYeSDK3rkmMFj";
                                    strArr5[7] = "x13RVeSrZB6JEJa4BQjiEaMCBMX5qcSw";
                                    iArr[i11] = A00(255, i20, i21, i22 + (i23 == 0 ? 0 : 85));
                                }
                            }
                            break;
                        default:
                            continue;
                    }
                }
            }
            throw new RuntimeException();
        }
        return iArr;
    }

    public final void A0J() {
        this.A06.A00();
    }
}
