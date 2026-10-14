package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<String> f1945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<String> f1946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BackStackRecordState[] f1947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f1949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<String> f1950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<BackStackState> f1951i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f1952j;

    public class a implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FragmentManagerState[] newArray(int i10) {
            return new FragmentManagerState[i10];
        }
    }

    public FragmentManagerState() {
        this.f1949g = null;
        this.f1950h = new ArrayList<>();
        this.f1951i = new ArrayList<>();
    }

    public FragmentManagerState(Parcel parcel) {
        this.f1949g = null;
        this.f1950h = new ArrayList<>();
        this.f1951i = new ArrayList<>();
        this.f1945c = parcel.createStringArrayList();
        this.f1946d = parcel.createStringArrayList();
        this.f1947e = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f1948f = parcel.readInt();
        this.f1949g = parcel.readString();
        this.f1950h = parcel.createStringArrayList();
        this.f1951i = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f1952j = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f1945c);
        parcel.writeStringList(this.f1946d);
        parcel.writeTypedArray(this.f1947e, i10);
        parcel.writeInt(this.f1948f);
        parcel.writeString(this.f1949g);
        parcel.writeStringList(this.f1950h);
        parcel.writeTypedList(this.f1951i);
        parcel.writeTypedList(this.f1952j);
    }
}
