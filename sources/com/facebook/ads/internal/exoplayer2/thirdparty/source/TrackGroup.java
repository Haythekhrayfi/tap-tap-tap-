package com.facebook.ads.internal.exoplayer2.thirdparty.source;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.redexgen.X.C0858Ez;
import com.facebook.ads.redexgen.X.HG;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TrackGroup implements Parcelable {
    public static String[] A03 = {"", "NMittKxTOqnCpR0XVNiGFQTgWBdVnSBQ", "6q2S2IWbxt3Au5KHDEjHre", "yesKExk412D9rxhfpJlSlvbFBwA7zIdr", "", "HTCNZO0GmLRgbnlHCzceXp", "rqCvvFRkFLctqovtMSwPdniKfX3FbXhx", "eUM"};
    public static final Parcelable.Creator<TrackGroup> CREATOR = new C0858Ez();
    public int A00;
    public final int A01;
    public final Format[] A02;

    public TrackGroup(Parcel parcel) {
        int i10 = parcel.readInt();
        this.A01 = i10;
        this.A02 = new Format[i10];
        for (int i11 = 0; i11 < i; i11++) {
            this.A02[i11] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }

    public TrackGroup(Format... formatArr) {
        HG.A04(formatArr.length > 0);
        this.A02 = formatArr;
        this.A01 = formatArr.length;
    }

    public final int A00(Format format) {
        int i10 = 0;
        while (true) {
            Format[] formatArr = this.A02;
            int i11 = formatArr.length;
            if (i10 < i11) {
                if (format == formatArr[i10]) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final Format A01(int i10) {
        return this.A02[i10];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        return this.A01 == trackGroup.A01 && Arrays.equals(this.A02, trackGroup.A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            if (A03[0].length() == 29) {
                throw new RuntimeException();
            }
            A03[6] = "7PEwa6COELc4k3zf5JXJInB5hEQAk2SR";
            int result = Arrays.hashCode(this.A02);
            this.A00 = (17 * 31) + result;
        }
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A01);
        int i11 = 0;
        while (true) {
            int i12 = this.A01;
            String[] strArr = A03;
            String str = strArr[2];
            String str2 = strArr[5];
            int length = str.length();
            int i13 = str2.length();
            if (length != i13) {
                throw new RuntimeException();
            }
            A03[6] = "BrTDzXvstLX2a3jCZEwFRrav1URrTsvk";
            if (i11 < i12) {
                parcel.writeParcelable(this.A02[i11], 0);
                i11++;
            } else {
                return;
            }
        }
    }
}
