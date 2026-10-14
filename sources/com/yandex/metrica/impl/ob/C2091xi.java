package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.xi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2091xi implements Parcelable {
    public static final a CREATOR = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f17853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC1596e1 f17854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f17855c;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.xi$a */
    public static final class a implements Parcelable.Creator<C2091xi> {
        private a() {
        }

        public /* synthetic */ a(vc.g gVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public C2091xi createFromParcel(Parcel parcel) {
            Object value = parcel.readValue(Boolean.TYPE.getClassLoader());
            if (!(value instanceof Boolean)) {
                value = null;
            }
            EnumC1596e1 enumC1596e1A = EnumC1596e1.a(parcel.readString());
            fd.j0.h(enumC1596e1A, "IdentifierStatus.from(parcel.readString())");
            return new C2091xi((Boolean) value, enumC1596e1A, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public C2091xi[] newArray(int i10) {
            return new C2091xi[i10];
        }
    }

    public C2091xi() {
        this(null, EnumC1596e1.UNKNOWN, null);
    }

    public C2091xi(Boolean bool, EnumC1596e1 enumC1596e1, String str) {
        this.f17853a = bool;
        this.f17854b = enumC1596e1;
        this.f17855c = str;
    }

    public final String a() {
        return this.f17855c;
    }

    public final Boolean b() {
        return this.f17853a;
    }

    public final EnumC1596e1 c() {
        return this.f17854b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2091xi)) {
            return false;
        }
        C2091xi c2091xi = (C2091xi) obj;
        return fd.j0.d(this.f17853a, c2091xi.f17853a) && fd.j0.d(this.f17854b, c2091xi.f17854b) && fd.j0.d(this.f17855c, c2091xi.f17855c);
    }

    public int hashCode() {
        Boolean bool = this.f17853a;
        int iHashCode = (bool != null ? bool.hashCode() : 0) * 31;
        EnumC1596e1 enumC1596e1 = this.f17854b;
        int iHashCode2 = (iHashCode + (enumC1596e1 != null ? enumC1596e1.hashCode() : 0)) * 31;
        String str = this.f17855c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("FeaturesInternal(sslPinning=");
        sbA.append(this.f17853a);
        sbA.append(", status=");
        sbA.append(this.f17854b);
        sbA.append(", errorExplanation=");
        return androidx.activity.k.a(sbA, this.f17855c, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(this.f17853a);
        parcel.writeString(this.f17854b.a());
        parcel.writeString(this.f17855c);
    }
}
