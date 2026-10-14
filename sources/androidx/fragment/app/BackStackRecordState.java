package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f1843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<String> f1844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f1845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f1846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f1850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CharSequence f1851k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1852l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CharSequence f1853m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList<String> f1854n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList<String> f1855o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f1856p;

    public class a implements Parcelable.Creator<BackStackRecordState> {
        @Override // android.os.Parcelable.Creator
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BackStackRecordState[] newArray(int i10) {
            return new BackStackRecordState[i10];
        }
    }

    public BackStackRecordState(Parcel parcel) {
        this.f1843c = parcel.createIntArray();
        this.f1844d = parcel.createStringArrayList();
        this.f1845e = parcel.createIntArray();
        this.f1846f = parcel.createIntArray();
        this.f1847g = parcel.readInt();
        this.f1848h = parcel.readString();
        this.f1849i = parcel.readInt();
        this.f1850j = parcel.readInt();
        this.f1851k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1852l = parcel.readInt();
        this.f1853m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1854n = parcel.createStringArrayList();
        this.f1855o = parcel.createStringArrayList();
        this.f1856p = parcel.readInt() != 0;
    }

    public BackStackRecordState(androidx.fragment.app.a aVar) {
        int size = aVar.f2005a.size();
        this.f1843c = new int[size * 6];
        if (!aVar.f2011g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1844d = new ArrayList<>(size);
        this.f1845e = new int[size];
        this.f1846f = new int[size];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            e0.a aVar2 = aVar.f2005a.get(i10);
            int i12 = i11 + 1;
            this.f1843c[i11] = aVar2.f2021a;
            ArrayList<String> arrayList = this.f1844d;
            Fragment fragment = aVar2.f2022b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f1843c;
            int i13 = i12 + 1;
            iArr[i12] = aVar2.f2023c ? 1 : 0;
            int i14 = i13 + 1;
            iArr[i13] = aVar2.f2024d;
            int i15 = i14 + 1;
            iArr[i14] = aVar2.f2025e;
            int i16 = i15 + 1;
            iArr[i15] = aVar2.f2026f;
            iArr[i16] = aVar2.f2027g;
            this.f1845e[i10] = aVar2.f2028h.ordinal();
            this.f1846f[i10] = aVar2.f2029i.ordinal();
            i10++;
            i11 = i16 + 1;
        }
        this.f1847g = aVar.f2010f;
        this.f1848h = aVar.f2013i;
        this.f1849i = aVar.f1969s;
        this.f1850j = aVar.f2014j;
        this.f1851k = aVar.f2015k;
        this.f1852l = aVar.f2016l;
        this.f1853m = aVar.f2017m;
        this.f1854n = aVar.f2018n;
        this.f1855o = aVar.f2019o;
        this.f1856p = aVar.f2020p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f1843c);
        parcel.writeStringList(this.f1844d);
        parcel.writeIntArray(this.f1845e);
        parcel.writeIntArray(this.f1846f);
        parcel.writeInt(this.f1847g);
        parcel.writeString(this.f1848h);
        parcel.writeInt(this.f1849i);
        parcel.writeInt(this.f1850j);
        TextUtils.writeToParcel(this.f1851k, parcel, 0);
        parcel.writeInt(this.f1852l);
        TextUtils.writeToParcel(this.f1853m, parcel, 0);
        parcel.writeStringList(this.f1854n);
        parcel.writeStringList(this.f1855o);
        parcel.writeInt(this.f1856p ? 1 : 0);
    }
}
