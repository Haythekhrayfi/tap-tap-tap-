package com.applovin.exoplayer2.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable, Comparator<a> {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() { // from class: com.applovin.exoplayer2.d.e.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a[] f5134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5135d;

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.d.e.a.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f5136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f5137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f5138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f5139d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f5140e;

        public a(Parcel parcel) {
            this.f5136a = new UUID(parcel.readLong(), parcel.readLong());
            this.f5137b = parcel.readString();
            this.f5138c = (String) ai.a(parcel.readString());
            this.f5139d = parcel.createByteArray();
        }

        public a(UUID uuid, String str, String str2, byte[] bArr) {
            this.f5136a = (UUID) com.applovin.exoplayer2.l.a.b(uuid);
            this.f5137b = str;
            this.f5138c = (String) com.applovin.exoplayer2.l.a.b(str2);
            this.f5139d = bArr;
        }

        public a(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public a a(byte[] bArr) {
            return new a(this.f5136a, this.f5137b, this.f5138c, bArr);
        }

        public boolean a(UUID uuid) {
            return com.applovin.exoplayer2.h.f6457a.equals(this.f5136a) || uuid.equals(this.f5136a);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            a aVar = (a) obj;
            return ai.a((Object) this.f5137b, (Object) aVar.f5137b) && ai.a((Object) this.f5138c, (Object) aVar.f5138c) && ai.a(this.f5136a, aVar.f5136a) && Arrays.equals(this.f5139d, aVar.f5139d);
        }

        public int hashCode() {
            if (this.f5140e == 0) {
                int iHashCode = this.f5136a.hashCode() * 31;
                String str = this.f5137b;
                this.f5140e = Arrays.hashCode(this.f5139d) + l1.e.a(this.f5138c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f5140e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f5136a.getMostSignificantBits());
            parcel.writeLong(this.f5136a.getLeastSignificantBits());
            parcel.writeString(this.f5137b);
            parcel.writeString(this.f5138c);
            parcel.writeByteArray(this.f5139d);
        }
    }

    public e(Parcel parcel) {
        this.f5132a = parcel.readString();
        a[] aVarArr = (a[]) ai.a((a[]) parcel.createTypedArray(a.CREATOR));
        this.f5134c = aVarArr;
        this.f5133b = aVarArr.length;
    }

    private e(String str, boolean z10, a... aVarArr) {
        this.f5132a = str;
        aVarArr = z10 ? (a[]) aVarArr.clone() : aVarArr;
        this.f5134c = aVarArr;
        this.f5133b = aVarArr.length;
        Arrays.sort(aVarArr, this);
    }

    public e(String str, a... aVarArr) {
        this(str, true, aVarArr);
    }

    public e(List<a> list) {
        this(null, false, (a[]) list.toArray(new a[0]));
    }

    public e(a... aVarArr) {
        this(null, aVarArr);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(a aVar, a aVar2) {
        UUID uuid = com.applovin.exoplayer2.h.f6457a;
        if (uuid.equals(aVar.f5136a)) {
            return uuid.equals(aVar2.f5136a) ? 0 : 1;
        }
        return aVar.f5136a.compareTo(aVar2.f5136a);
    }

    public a a(int i10) {
        return this.f5134c[i10];
    }

    public e a(String str) {
        return ai.a((Object) this.f5132a, (Object) str) ? this : new e(str, false, this.f5134c);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return ai.a((Object) this.f5132a, (Object) eVar.f5132a) && Arrays.equals(this.f5134c, eVar.f5134c);
    }

    public int hashCode() {
        if (this.f5135d == 0) {
            String str = this.f5132a;
            this.f5135d = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f5134c);
        }
        return this.f5135d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5132a);
        parcel.writeTypedArray(this.f5134c, 0);
    }
}
