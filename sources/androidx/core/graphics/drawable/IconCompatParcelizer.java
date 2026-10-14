package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1654a = aVar.k(iconCompat.f1654a, 1);
        byte[] bArrG = iconCompat.f1656c;
        if (aVar.i(2)) {
            bArrG = aVar.g();
        }
        iconCompat.f1656c = bArrG;
        iconCompat.f1657d = aVar.m(iconCompat.f1657d, 3);
        iconCompat.f1658e = aVar.k(iconCompat.f1658e, 4);
        iconCompat.f1659f = aVar.k(iconCompat.f1659f, 5);
        iconCompat.f1660g = (ColorStateList) aVar.m(iconCompat.f1660g, 6);
        String strN = iconCompat.f1662i;
        if (aVar.i(7)) {
            strN = aVar.n();
        }
        iconCompat.f1662i = strN;
        String strN2 = iconCompat.f1663j;
        if (aVar.i(8)) {
            strN2 = aVar.n();
        }
        iconCompat.f1663j = strN2;
        iconCompat.f1661h = PorterDuff.Mode.valueOf(iconCompat.f1662i);
        switch (iconCompat.f1654a) {
            case -1:
                parcelable = iconCompat.f1657d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1655b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                parcelable = iconCompat.f1657d;
                if (parcelable != null) {
                    iconCompat.f1655b = parcelable;
                } else {
                    byte[] bArr = iconCompat.f1656c;
                    iconCompat.f1655b = bArr;
                    iconCompat.f1654a = 3;
                    iconCompat.f1658e = 0;
                    iconCompat.f1659f = bArr.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f1656c, Charset.forName("UTF-16"));
                iconCompat.f1655b = str;
                if (iconCompat.f1654a == 2 && iconCompat.f1663j == null) {
                    iconCompat.f1663j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1655b = iconCompat.f1656c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        Objects.requireNonNull(aVar);
        iconCompat.f1662i = iconCompat.f1661h.name();
        switch (iconCompat.f1654a) {
            case -1:
            case 1:
            case 5:
                iconCompat.f1657d = (Parcelable) iconCompat.f1655b;
                break;
            case 2:
                iconCompat.f1656c = ((String) iconCompat.f1655b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1656c = (byte[]) iconCompat.f1655b;
                break;
            case 4:
            case 6:
                iconCompat.f1656c = iconCompat.f1655b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f1654a;
        if (-1 != i10) {
            aVar.p(1);
            aVar.t(i10);
        }
        byte[] bArr = iconCompat.f1656c;
        if (bArr != null) {
            aVar.p(2);
            aVar.r(bArr);
        }
        Parcelable parcelable = iconCompat.f1657d;
        if (parcelable != null) {
            aVar.p(3);
            aVar.u(parcelable);
        }
        int i11 = iconCompat.f1658e;
        if (i11 != 0) {
            aVar.p(4);
            aVar.t(i11);
        }
        int i12 = iconCompat.f1659f;
        if (i12 != 0) {
            aVar.p(5);
            aVar.t(i12);
        }
        ColorStateList colorStateList = iconCompat.f1660g;
        if (colorStateList != null) {
            aVar.p(6);
            aVar.u(colorStateList);
        }
        String str = iconCompat.f1662i;
        if (str != null) {
            aVar.p(7);
            aVar.v(str);
        }
        String str2 = iconCompat.f1663j;
        if (str2 != null) {
            aVar.p(8);
            aVar.v(str2);
        }
    }
}
