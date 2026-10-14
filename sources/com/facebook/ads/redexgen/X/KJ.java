package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KJ {
    public static byte[] A00;
    public static String[] A01 = {"R2O7PMYP6nkOeNui3I4WlXx4fu7rpRKA", "y", "n9RLgUbY6qPVyxnn4C2MCNq6tOX6tKMu", "KtI8XvYnNiAs4lVQz", "VIjGruAAxxfbDEfj8", "jnPluIPOifq7BY1vqnqKLiUetY3DHsfM", "J5aiTqmsNT2689NKU", "zCaDldCe0EtEl2h3W"};
    public static final Package A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final Set<C1337Xw> A06;
    public static final AtomicReference<KS> A07;
    public static final AtomicReference<KU> A08;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-68, -49, -46, -36, -27, -19, -49, -46, -19, -35, -48, -40, -19, -41, -46, -19, -39, -45, -25, 102, 121, 124, -122, -113, -105, -121, -118, -127, Ascii.DEL, -127, -122, 121, -124, -105, 125, -112, -116, -118, 121, -117, -94, -75, -72, -62, -53, -45, -57, -75, -54, -71, -72, -45, -57, -56, -75, -56, -71, -45, -72, -75, -56, -75, -33, -19, 2, -15, -16, -84, -1, 0, -19, 0, -15, -84, -18, 1, -6, -16, -8, -15, -84, -11, -1, -84, -15, -7, -4, 0, 5, -83, -77, -75, -58, -79, -57, -58, -69, -66, -82, -69, -84, -80, -71, -74, -78, -69, -63, -84, -63, -68, -72, -78, -69};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0A(Intent intent, Set<String> set) {
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        String string = data.toString();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (string.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    static {
        A07();
        Package r10 = KJ.class.getPackage();
        A02 = r10;
        A04 = r10 + A06(40, 22, 98);
        A03 = r10 + A06(0, 19, 124);
        A05 = r10 + A06(19, 21, 38);
        A06 = Collections.newSetFromMap(new WeakHashMap());
        A07 = new AtomicReference<>();
        A08 = new AtomicReference<>();
    }

    public static Intent A00(Intent intent) {
        Intent intentCloneFilter = intent.cloneFilter();
        intentCloneFilter.setFlags(intent.getFlags());
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(intent.getExtras());
        intentCloneFilter.putExtra(A05, parcelObtain.marshall());
        parcelObtain.recycle();
        return intentCloneFilter;
    }

    public static Intent A01(Intent intent, ClassLoader classLoader) {
        Intent intentCloneFilter = intent.cloneFilter();
        intentCloneFilter.setFlags(intent.getFlags());
        Bundle audienceNetworkActivityBundle = new Bundle();
        Parcel parcelObtain = Parcel.obtain();
        byte[] byteArrayExtra = intent.getByteArrayExtra(A05);
        if (byteArrayExtra != null) {
            parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            parcelObtain.setDataPosition(0);
            audienceNetworkActivityBundle = parcelObtain.readBundle(classLoader);
            parcelObtain.recycle();
        }
        intentCloneFilter.putExtras(audienceNetworkActivityBundle);
        return intentCloneFilter;
    }

    public static Bundle A02(Bundle bundle, ClassLoader classLoader) {
        Parcel parcelObtain = Parcel.obtain();
        byte[] byteArray = bundle.getByteArray(A04);
        if (byteArray != null) {
            parcelObtain.unmarshall(byteArray, 0, byteArray.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle2 = parcelObtain.readBundle(classLoader);
            parcelObtain.recycle();
            String[] strArr = A01;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "08vXapB5qdF8q1e2g";
            strArr2[3] = "bPV7EQI3jYdBWJzP2";
            return bundle2;
        }
        throw new IllegalStateException(A06(62, 28, 122));
    }

    public static C1337Xw A03(Intent intent) {
        String stringExtra = intent.getStringExtra(A03);
        if (stringExtra != null) {
            for (C1337Xw c1337Xw : A06) {
                String adId = c1337Xw.A0E().getId();
                if (stringExtra.equals(adId)) {
                    return c1337Xw;
                }
            }
            return null;
        }
        return null;
    }

    public static AdActivityIntent A04(C1337Xw c1337Xw) {
        AdActivityIntent adActivityIntent = new AdActivityIntent(c1337Xw.getApplicationContext(), A05());
        adActivityIntent.putExtra(A03, c1337Xw.A0E().getId());
        A06.add(c1337Xw);
        return adActivityIntent;
    }

    public static Class A05() {
        if (A01[1].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "4NnM5dRGBMW0KGxzs";
        strArr[3] = "N6FCbEqQMIqNBYuck";
        return AudienceNetworkActivity.class;
    }

    public static void A08(Bundle bundle, Bundle bundle2) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle2);
        bundle.putByteArray(A04, parcelObtain.marshall());
        parcelObtain.recycle();
    }

    public static void A09(C1337Xw c1337Xw, AdActivityIntent adActivityIntent) throws KH {
        Context launchContext;
        Context applicationContext = c1337Xw.getApplicationContext();
        if (IN.A20(c1337Xw) && (launchContext = c1337Xw.A0D()) != null) {
            applicationContext = launchContext;
            if ((adActivityIntent.getFlags() & 268435456) == 268435456) {
                adActivityIntent.setFlags(adActivityIntent.getFlags() ^ 268435456);
            }
        }
        try {
            applicationContext.startActivity(A00(adActivityIntent));
        } catch (ActivityNotFoundException e10) {
            throw new KH(e10);
        }
    }

    public static boolean A0B(C1337Xw c1337Xw, Intent intent) throws KH {
        KS externalActivityLauncher = A07.get();
        return A0D(c1337Xw, intent, externalActivityLauncher);
    }

    public static boolean A0C(C1337Xw c1337Xw, Intent intent) throws KH {
        KS ks = A07.get();
        if (ks == null || c1337Xw.A0D() == null) {
            return false;
        }
        String strA0B = c1337Xw.A0B();
        try {
            Activity activityA0D = c1337Xw.A0D();
            if (strA0B == null) {
                strA0B = A06(0, 0, 81);
            }
            return ks.startActivityForResult(intent, 0, activityA0D, strA0B);
        } catch (ActivityNotFoundException e10) {
            throw new KH(e10);
        } catch (Exception e11) {
            c1337Xw.A07().A9K(A06(90, 8, 64), C06937v.A07, new C06947w(e11));
            return false;
        }
    }

    public static boolean A0D(C1337Xw c1337Xw, Intent intent, KS ks) throws KH {
        if (A0A(intent, IN.A0Y(c1337Xw))) {
            return false;
        }
        Context context = c1337Xw;
        String[] strArr = A01;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A01[1] = "W";
        Context startContext = c1337Xw.A0D();
        if (startContext != null) {
            context = startContext;
        } else {
            intent.addFlags(268435456);
        }
        if (ks != null && !A0A(intent, IN.A0a(c1337Xw))) {
            String strA0B = c1337Xw.A0B();
            if (strA0B == null) {
                try {
                    strA0B = A06(0, 0, 81);
                } catch (ActivityNotFoundException e10) {
                    throw new KH(e10);
                } catch (Exception e11) {
                    c1337Xw.A07().A9K(A06(90, 8, 64), C06937v.A08, new C06947w(e11));
                    return false;
                }
            }
            return ks.startActivity(context, intent, strA0B);
        }
        try {
            context.startActivity(intent);
            String[] strArr2 = A01;
            if (strArr2[6].length() != strArr2[7].length()) {
                return true;
            }
            String[] strArr3 = A01;
            strArr3[2] = "WDCv4eIjUMWn9vBjM5X6LVautGW56wKG";
            strArr3[0] = "ucZAZ4xNymzGZ0fLzzKXI63vhQI9uDah";
            return true;
        } catch (ActivityNotFoundException e12) {
            throw new KH(e12);
        }
    }

    public static boolean A0E(C1337Xw c1337Xw, Uri uri, String str) throws ActivityNotFoundException {
        KU onsiteUriHandler = A08.get();
        return A0F(c1337Xw, uri, str, onsiteUriHandler);
    }

    public static boolean A0F(C1337Xw c1337Xw, Uri uri, String str, KU ku) throws ActivityNotFoundException {
        if (ku == null || c1337Xw.A0D() == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString(A06(98, 15, 59), str);
        return ku.handleUriForResult(c1337Xw, uri.toString(), bundle, null, 0, c1337Xw.A0D());
    }
}
