package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new Parcelable.Creator<j>() { // from class: com.applovin.exoplayer2.g.e.j.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i10) {
            return new j[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f6384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f6385e;

    public j(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f6381a = i10;
        this.f6382b = i11;
        this.f6383c = i12;
        this.f6384d = iArr;
        this.f6385e = iArr2;
    }

    public j(Parcel parcel) {
        super("MLLT");
        this.f6381a = parcel.readInt();
        this.f6382b = parcel.readInt();
        this.f6383c = parcel.readInt();
        this.f6384d = (int[]) ai.a(parcel.createIntArray());
        this.f6385e = (int[]) ai.a(parcel.createIntArray());
    }

    @Override // com.applovin.exoplayer2.g.e.h, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f6381a == jVar.f6381a && this.f6382b == jVar.f6382b && this.f6383c == jVar.f6383c && Arrays.equals(this.f6384d, jVar.f6384d) && Arrays.equals(this.f6385e, jVar.f6385e);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f6385e) + ((Arrays.hashCode(this.f6384d) + ((((((527 + this.f6381a) * 31) + this.f6382b) * 31) + this.f6383c) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f6381a);
        parcel.writeInt(this.f6382b);
        parcel.writeInt(this.f6383c);
        parcel.writeIntArray(this.f6384d);
        parcel.writeIntArray(this.f6385e);
    }
}
