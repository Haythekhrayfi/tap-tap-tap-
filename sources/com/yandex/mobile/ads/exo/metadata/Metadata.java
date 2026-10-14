package com.yandex.mobile.ads.exo.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.ec0;
import com.yandex.mobile.ads.impl.v60;
import com.yandex.mobile.ads.impl.yv;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Entry[] f18520a;

    public interface Entry extends Parcelable {
        default yv a() {
            return null;
        }

        default void a(ec0.a aVar) {
        }

        default byte[] b() {
            return null;
        }
    }

    public class a implements Parcelable.Creator<Metadata> {
        @Override // android.os.Parcelable.Creator
        public final Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Metadata[] newArray(int i10) {
            return new Metadata[i10];
        }
    }

    public Metadata(Parcel parcel) {
        this.f18520a = new Entry[parcel.readInt()];
        int i10 = 0;
        while (true) {
            Entry[] entryArr = this.f18520a;
            if (i10 >= entryArr.length) {
                return;
            }
            entryArr[i10] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
            i10++;
        }
    }

    public Metadata(List<? extends Entry> list) {
        this.f18520a = (Entry[]) list.toArray(new Entry[0]);
    }

    public Metadata(Entry... entryArr) {
        this.f18520a = entryArr;
    }

    public final Entry a(int i10) {
        return this.f18520a[i10];
    }

    public final Metadata a(Metadata metadata) {
        return metadata == null ? this : a(metadata.f18520a);
    }

    public final Metadata a(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata((Entry[]) da1.a((Object[]) this.f18520a, (Object[]) entryArr));
    }

    public final int c() {
        return this.f18520a.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f18520a, ((Metadata) obj).f18520a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18520a);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("entries=");
        sbA.append(Arrays.toString(this.f18520a));
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f18520a.length);
        for (Entry entry : this.f18520a) {
            parcel.writeParcelable(entry, 0);
        }
    }
}
