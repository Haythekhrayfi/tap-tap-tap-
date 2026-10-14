package com.facebook.ads.redexgen.X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1334Xt extends AbstractC06777d {
    public static byte[] A00;
    public static final C7X A01;
    public static final C7X A02;
    public static final C7X[] A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final String A07;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 36);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{19, 14, 19, 91, 63, 44, 45, 36, 45, 60, 45, 72, 46, 58, 39, 37, 72, Ascii.FS, 7, 3, 13, 6, Ascii.ESC, 72, 63, 32, 45, 58, 45, 72, 38, 39, 60, 72, 45, 48, 33, 59, 60, 59, 72, 64, 59, 45, 36, 45, 43, 60, 72, 89, 72, 46, 58, 39, 37, 72, 13, Ascii.RS, 13, 6, Ascii.FS, Ascii.ESC, 72, 63, 32, 45, 58, 45, 72, Ascii.FS, 7, 3, 13, 6, Ascii.ESC, 70, 8, 53, 46, 40, 61, 57, 36, 34, 35, 109, 58, 37, 40, 35, 109, 57, 63, 52, 36, 35, 42, 109, 57, 34, 109, 41, 40, 33, 40, 57, 40, 109, 46, 37, 36, 33, 41, 33, 40, 62, 62, 109, 57, 34, 38, 40, 35, 62, 99, 22, 49, 41, 62, 51, 54, 59, Ascii.DEL, 43, 48, 52, 58, 49, 113, 92, 77, 80, 92, 74, 91, 70, 74, 62, 78, 76, 87, 83, 95, 76, 71, 62, 85, 91, 71, 36, 55, 36, 47, 53, 50, 2, Ascii.EM, Ascii.GS, 19, Ascii.CAN, Ascii.EM, 2, 6, 8, 3, 50, 4, 9, 80, 75, 79, 65, 74, 87};
    }

    static {
        A04();
        C7X c7x = new C7X(0, A00(170, 8, 73), A00(143, 16, 58));
        A02 = c7x;
        C7X c7x2 = new C7X(1, A00(165, 5, 82), A00(139, 4, 44));
        A01 = c7x2;
        C7X[] c7xArr = {c7x, c7x2};
        A03 = c7xArr;
        A07 = C1334Xt.class.getSimpleName();
        String strA00 = A00(178, 6, 0);
        A05 = AbstractC06777d.A02(strA00, c7xArr);
        A06 = AbstractC06777d.A03(strA00, c7xArr, c7x2);
        A04 = A00(5, 71, 76) + c7x.A01 + A00(0, 3, 23) + A00(159, 6, 101) + A00(4, 1, 53) + C1335Xu.A09.A01 + A00(3, 1, 86);
    }

    public C1334Xt(C7Z c7z) {
        super(c7z);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06777d
    public final String A06() {
        return A00(178, 6, 0);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06777d
    public final C7X[] A0A() {
        return A03;
    }

    public final Cursor A0B() {
        return A05().rawQuery(A05, null);
    }

    public final String A0C(String str) throws SQLiteException, IllegalArgumentException {
        if (!TextUtils.isEmpty(str)) {
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = A05().rawQuery(A06, new String[]{str});
                String string = cursorRawQuery.moveToNext() ? cursorRawQuery.getString(A02.A00) : null;
                if (!TextUtils.isEmpty(string)) {
                    return string;
                }
                String string2 = UUID.randomUUID().toString();
                ContentValues contentValues = new ContentValues(2);
                contentValues.put(A02.A01, string2);
                contentValues.put(A01.A01, str);
                A05().insertOrThrow(A00(178, 6, 0), null, contentValues);
                return string2;
            } finally {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
        }
        throw new IllegalArgumentException(A00(125, 14, 123));
    }

    public final void A0D(C1336Xv c1336Xv) {
        try {
            A05().execSQL(A04);
        } catch (SQLException e10) {
            if (c1336Xv.A04().A8n()) {
                Log.e(A07, A00(76, 49, 105), e10);
            }
        }
    }
}
