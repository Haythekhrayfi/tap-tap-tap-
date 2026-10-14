package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class Xa implements Parcelable {
    public static final Parcelable.Creator<Xa> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Wa f15479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Wa f15480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Wa f15481c;

    public class a implements Parcelable.Creator<Xa> {
        @Override // android.os.Parcelable.Creator
        public Xa createFromParcel(Parcel parcel) {
            return new Xa(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Xa[] newArray(int i10) {
            return new Xa[i10];
        }
    }

    public Xa() {
        this(null, null, null);
    }

    public Xa(Parcel parcel) {
        this.f15479a = (Wa) parcel.readParcelable(Wa.class.getClassLoader());
        this.f15480b = (Wa) parcel.readParcelable(Wa.class.getClassLoader());
        this.f15481c = (Wa) parcel.readParcelable(Wa.class.getClassLoader());
    }

    public Xa(Wa wa2, Wa wa3, Wa wa4) {
        this.f15479a = wa2;
        this.f15480b = wa3;
        this.f15481c = wa4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("DiagnosticsConfigsHolder{activationConfig=");
        sbA.append(this.f15479a);
        sbA.append(", clidsInfoConfig=");
        sbA.append(this.f15480b);
        sbA.append(", preloadInfoConfig=");
        sbA.append(this.f15481c);
        sbA.append('}');
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f15479a, i10);
        parcel.writeParcelable(this.f15480b, i10);
        parcel.writeParcelable(this.f15481c, i10);
    }
}
