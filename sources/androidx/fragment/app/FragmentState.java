package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f1959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f1960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f1961k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Bundle f1962l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f1963m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f1964n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Bundle f1965o;

    public class a implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FragmentState[] newArray(int i10) {
            return new FragmentState[i10];
        }
    }

    public FragmentState(Parcel parcel) {
        this.f1953c = parcel.readString();
        this.f1954d = parcel.readString();
        this.f1955e = parcel.readInt() != 0;
        this.f1956f = parcel.readInt();
        this.f1957g = parcel.readInt();
        this.f1958h = parcel.readString();
        this.f1959i = parcel.readInt() != 0;
        this.f1960j = parcel.readInt() != 0;
        this.f1961k = parcel.readInt() != 0;
        this.f1962l = parcel.readBundle();
        this.f1963m = parcel.readInt() != 0;
        this.f1965o = parcel.readBundle();
        this.f1964n = parcel.readInt();
    }

    public FragmentState(Fragment fragment) {
        this.f1953c = fragment.getClass().getName();
        this.f1954d = fragment.mWho;
        this.f1955e = fragment.mFromLayout;
        this.f1956f = fragment.mFragmentId;
        this.f1957g = fragment.mContainerId;
        this.f1958h = fragment.mTag;
        this.f1959i = fragment.mRetainInstance;
        this.f1960j = fragment.mRemoving;
        this.f1961k = fragment.mDetached;
        this.f1962l = fragment.mArguments;
        this.f1963m = fragment.mHidden;
        this.f1964n = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f1953c);
        sb2.append(" (");
        sb2.append(this.f1954d);
        sb2.append(")}:");
        if (this.f1955e) {
            sb2.append(" fromLayout");
        }
        if (this.f1957g != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f1957g));
        }
        String str = this.f1958h;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f1958h);
        }
        if (this.f1959i) {
            sb2.append(" retainInstance");
        }
        if (this.f1960j) {
            sb2.append(" removing");
        }
        if (this.f1961k) {
            sb2.append(" detached");
        }
        if (this.f1963m) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1953c);
        parcel.writeString(this.f1954d);
        parcel.writeInt(this.f1955e ? 1 : 0);
        parcel.writeInt(this.f1956f);
        parcel.writeInt(this.f1957g);
        parcel.writeString(this.f1958h);
        parcel.writeInt(this.f1959i ? 1 : 0);
        parcel.writeInt(this.f1960j ? 1 : 0);
        parcel.writeInt(this.f1961k ? 1 : 0);
        parcel.writeBundle(this.f1962l);
        parcel.writeInt(this.f1963m ? 1 : 0);
        parcel.writeBundle(this.f1965o);
        parcel.writeInt(this.f1964n);
    }
}
