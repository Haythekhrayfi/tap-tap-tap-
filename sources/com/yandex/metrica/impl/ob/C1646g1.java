package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1646g1 implements Parcelable {
    public static final Parcelable.Creator<C1646g1> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC1596e1 f16161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16162c;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g1$a */
    public class a implements Parcelable.Creator<C1646g1> {
        @Override // android.os.Parcelable.Creator
        public C1646g1 createFromParcel(Parcel parcel) {
            return new C1646g1(parcel.readString(), EnumC1596e1.a(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public C1646g1[] newArray(int i10) {
            return new C1646g1[i10];
        }
    }

    public C1646g1(String str, EnumC1596e1 enumC1596e1, String str2) {
        this.f16160a = str;
        this.f16161b = enumC1596e1;
        this.f16162c = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1646g1.class != obj.getClass()) {
            return false;
        }
        C1646g1 c1646g1 = (C1646g1) obj;
        String str = this.f16160a;
        if (str == null ? c1646g1.f16160a != null : !str.equals(c1646g1.f16160a)) {
            return false;
        }
        if (this.f16161b != c1646g1.f16161b) {
            return false;
        }
        String str2 = this.f16162c;
        String str3 = c1646g1.f16162c;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    public int hashCode() {
        String str = this.f16160a;
        int iHashCode = (this.f16161b.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.f16162c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("IdentifiersResultInternal{mId='");
        l1.c.a(sbA, this.f16160a, CoreConstants.SINGLE_QUOTE_CHAR, ", mStatus=");
        sbA.append(this.f16161b);
        sbA.append(", mErrorExplanation='");
        sbA.append(this.f16162c);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append('}');
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f16160a);
        parcel.writeString(this.f16161b.a());
        parcel.writeString(this.f16162c);
    }
}
