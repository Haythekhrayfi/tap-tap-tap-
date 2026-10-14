package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0987Ke {
    public static int A00;
    public static byte[] A01;
    public static volatile EnumC0986Kd A02;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{60, 19, Ascii.EM, 15, 18, 20, Ascii.EM, 48, Ascii.FS, 19, 20, Ascii.ESC, Ascii.CAN, 14, 9, 83, 5, 16, 17, 119, 115, 116, 73, 126, 113, 76, Ascii.DEL, 104, 105, 115, 117, 116, 2, 4, 18, 4, 90, 4, 19, Ascii.FS};
    }

    static {
        A07();
        A00 = -1;
        A02 = EnumC0986Kd.A04;
    }

    public static int A01(Context context) {
        if (A02 == EnumC0986Kd.A04) {
            A08(context);
        }
        return A00;
    }

    public static int A02(Context context) {
        try {
            XmlResourceParser parser = context.getAssets().openXmlResourceParser(A06(0, 19, 71));
            return A05(parser);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int A03(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).minSdkVersion;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static int A05(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(A06(32, 8, 77))) {
                for (int i10 = 0; i10 < i; i10++) {
                    if (xmlPullParser.getAttributeName(i10).equals(A06(19, 13, 32))) {
                        int i11 = Integer.parseInt(xmlPullParser.getAttributeValue(i10));
                        return i11;
                    }
                }
            }
        }
        return 0;
    }

    public static void A08(Context context) {
        if (A0A()) {
            return;
        }
        A09(context);
    }

    public static void A09(Context context) {
        if (A02 != EnumC0986Kd.A04) {
            return;
        }
        A02 = EnumC0986Kd.A03;
        Executors.newSingleThreadExecutor().execute(new C1230Tp(context));
    }

    public static boolean A0A() {
        return A02 == EnumC0986Kd.A02;
    }
}
