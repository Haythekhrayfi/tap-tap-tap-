package com.yandex.mobile.ads.exo.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.cg;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.pa;
import com.yandex.mobile.ads.impl.z11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SchemeData[] f18409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18412d;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f18413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f18414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f18415c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f18416d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f18417e;

        public class a implements Parcelable.Creator<SchemeData> {
            @Override // android.os.Parcelable.Creator
            public final SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SchemeData[] newArray(int i10) {
                return new SchemeData[i10];
            }
        }

        public SchemeData() {
            throw null;
        }

        public SchemeData(Parcel parcel) {
            this.f18414b = new UUID(parcel.readLong(), parcel.readLong());
            this.f18415c = parcel.readString();
            this.f18416d = (String) da1.a(parcel.readString());
            this.f18417e = parcel.createByteArray();
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            this.f18414b = (UUID) pa.a(uuid);
            this.f18415c = str;
            this.f18416d = (String) pa.a(str2);
            this.f18417e = bArr;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return da1.a(this.f18415c, schemeData.f18415c) && da1.a(this.f18416d, schemeData.f18416d) && da1.a(this.f18414b, schemeData.f18414b) && Arrays.equals(this.f18417e, schemeData.f18417e);
        }

        public final int hashCode() {
            if (this.f18413a == 0) {
                int iHashCode = this.f18414b.hashCode() * 31;
                String str = this.f18415c;
                this.f18413a = Arrays.hashCode(this.f18417e) + z11.a(this.f18416d, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f18413a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f18414b.getMostSignificantBits());
            parcel.writeLong(this.f18414b.getLeastSignificantBits());
            parcel.writeString(this.f18415c);
            parcel.writeString(this.f18416d);
            parcel.writeByteArray(this.f18417e);
        }
    }

    public class a implements Parcelable.Creator<DrmInitData> {
        @Override // android.os.Parcelable.Creator
        public final DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DrmInitData[] newArray(int i10) {
            return new DrmInitData[i10];
        }
    }

    public DrmInitData(Parcel parcel) {
        this.f18411c = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) da1.a((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f18409a = schemeDataArr;
        this.f18412d = schemeDataArr.length;
    }

    private DrmInitData(String str, boolean z10, SchemeData... schemeDataArr) {
        this.f18411c = str;
        schemeDataArr = z10 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f18409a = schemeDataArr;
        this.f18412d = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public DrmInitData(ArrayList arrayList) {
        this(null, false, (SchemeData[]) arrayList.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(null, true, schemeDataArr);
    }

    public final SchemeData a(int i10) {
        return this.f18409a[i10];
    }

    public final DrmInitData a(String str) {
        return da1.a(this.f18411c, str) ? this : new DrmInitData(str, false, this.f18409a);
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = cg.f19498a;
        if (uuid.equals(schemeData3.f18414b)) {
            return uuid.equals(schemeData4.f18414b) ? 0 : 1;
        }
        return schemeData3.f18414b.compareTo(schemeData4.f18414b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return da1.a(this.f18411c, drmInitData.f18411c) && Arrays.equals(this.f18409a, drmInitData.f18409a);
    }

    public final int hashCode() {
        if (this.f18410b == 0) {
            String str = this.f18411c;
            this.f18410b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f18409a);
        }
        return this.f18410b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18411c);
        parcel.writeTypedArray(this.f18409a, 0);
    }
}
