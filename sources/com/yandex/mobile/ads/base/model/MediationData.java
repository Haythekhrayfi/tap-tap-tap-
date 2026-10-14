package com.yandex.mobile.ads.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.ce0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MediationData implements Parcelable {
    public static final Parcelable.Creator<MediationData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ce0> f18216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, String> f18217b;

    public class a implements Parcelable.Creator<MediationData> {
        @Override // android.os.Parcelable.Creator
        public final MediationData createFromParcel(Parcel parcel) {
            return new MediationData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MediationData[] newArray(int i10) {
            return new MediationData[i10];
        }
    }

    public MediationData(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f18216a = arrayList;
        parcel.readList(arrayList, ce0.class.getClassLoader());
        int i10 = parcel.readInt();
        this.f18217b = new HashMap(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18217b.put(parcel.readString(), parcel.readString());
        }
    }

    public MediationData(ArrayList arrayList, HashMap map) {
        this.f18216a = arrayList;
        this.f18217b = map;
    }

    public final List<ce0> c() {
        return this.f18216a;
    }

    public final Map<String, String> d() {
        return this.f18217b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f18216a);
        parcel.writeInt(this.f18217b.size());
        for (Map.Entry<String, String> entry : this.f18217b.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }
}
