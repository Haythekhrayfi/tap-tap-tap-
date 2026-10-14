package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.em, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1617em implements Parcelable {
    public static final Parcelable.Creator<C1617em> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f16072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16073b;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.em$a */
    public class a implements Parcelable.Creator<C1617em> {
        @Override // android.os.Parcelable.Creator
        public C1617em createFromParcel(Parcel parcel) {
            return new C1617em(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C1617em[] newArray(int i10) {
            return new C1617em[i10];
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.em$b */
    public enum b {
        EQUALS(0),
        CONTAINS(1),
        MATCHES(2),
        DOES_NOT_MATCH(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16079a;

        b(int i10) {
            this.f16079a = i10;
        }

        public static b a(int i10) {
            b[] bVarArrValues = values();
            for (int i11 = 0; i11 < 4; i11++) {
                b bVar = bVarArrValues[i11];
                if (bVar.f16079a == i10) {
                    return bVar;
                }
            }
            return EQUALS;
        }
    }

    public C1617em(Parcel parcel) {
        this.f16072a = b.a(parcel.readInt());
        this.f16073b = (String) C2120ym.a(parcel.readString(), "");
    }

    public C1617em(b bVar, String str) {
        this.f16072a = bVar;
        this.f16073b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1617em.class != obj.getClass()) {
            return false;
        }
        C1617em c1617em = (C1617em) obj;
        if (this.f16072a != c1617em.f16072a) {
            return false;
        }
        return this.f16073b.equals(c1617em.f16073b);
    }

    public int hashCode() {
        return this.f16073b.hashCode() + (this.f16072a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("UiParsingFilter{type=");
        sbA.append(this.f16072a);
        sbA.append(", value='");
        sbA.append(this.f16073b);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append('}');
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16072a.f16079a);
        parcel.writeString(this.f16073b);
    }
}
