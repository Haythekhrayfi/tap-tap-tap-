package com.applovin.exoplayer2.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.a.1
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
    private final InterfaceC0092a[] f6312a;

    /* JADX INFO: renamed from: com.applovin.exoplayer2.g.a$a, reason: collision with other inner class name */
    public interface InterfaceC0092a extends Parcelable {
        default v a() {
            return null;
        }

        default void a(ac.a aVar) {
        }

        default byte[] b() {
            return null;
        }
    }

    public a(Parcel parcel) {
        this.f6312a = new InterfaceC0092a[parcel.readInt()];
        int i10 = 0;
        while (true) {
            InterfaceC0092a[] interfaceC0092aArr = this.f6312a;
            if (i10 >= interfaceC0092aArr.length) {
                return;
            }
            interfaceC0092aArr[i10] = (InterfaceC0092a) parcel.readParcelable(InterfaceC0092a.class.getClassLoader());
            i10++;
        }
    }

    public a(List<? extends InterfaceC0092a> list) {
        this.f6312a = (InterfaceC0092a[]) list.toArray(new InterfaceC0092a[0]);
    }

    public a(InterfaceC0092a... interfaceC0092aArr) {
        this.f6312a = interfaceC0092aArr;
    }

    public int a() {
        return this.f6312a.length;
    }

    public InterfaceC0092a a(int i10) {
        return this.f6312a[i10];
    }

    public a a(a aVar) {
        return aVar == null ? this : a(aVar.f6312a);
    }

    public a a(InterfaceC0092a... interfaceC0092aArr) {
        return interfaceC0092aArr.length == 0 ? this : new a((InterfaceC0092a[]) ai.a((Object[]) this.f6312a, (Object[]) interfaceC0092aArr));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f6312a, ((a) obj).f6312a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f6312a);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("entries=");
        sbA.append(Arrays.toString(this.f6312a));
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f6312a.length);
        for (InterfaceC0092a interfaceC0092a : this.f6312a) {
            parcel.writeParcelable(interfaceC0092a, 0);
        }
    }
}
