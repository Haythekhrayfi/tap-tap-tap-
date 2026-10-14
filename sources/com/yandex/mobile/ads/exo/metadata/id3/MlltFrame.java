package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.da1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f18590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f18591f;

    public class a implements Parcelable.Creator<MlltFrame> {
        @Override // android.os.Parcelable.Creator
        public final MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MlltFrame[] newArray(int i10) {
            return new MlltFrame[i10];
        }
    }

    public MlltFrame(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f18587b = i10;
        this.f18588c = i11;
        this.f18589d = i12;
        this.f18590e = iArr;
        this.f18591f = iArr2;
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f18587b = parcel.readInt();
        this.f18588c = parcel.readInt();
        this.f18589d = parcel.readInt();
        this.f18590e = (int[]) da1.a(parcel.createIntArray());
        this.f18591f = (int[]) da1.a(parcel.createIntArray());
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.f18587b == mlltFrame.f18587b && this.f18588c == mlltFrame.f18588c && this.f18589d == mlltFrame.f18589d && Arrays.equals(this.f18590e, mlltFrame.f18590e) && Arrays.equals(this.f18591f, mlltFrame.f18591f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18591f) + ((Arrays.hashCode(this.f18590e) + ((((((this.f18587b + 527) * 31) + this.f18588c) * 31) + this.f18589d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f18587b);
        parcel.writeInt(this.f18588c);
        parcel.writeInt(this.f18589d);
        parcel.writeIntArray(this.f18590e);
        parcel.writeIntArray(this.f18591f);
    }
}
