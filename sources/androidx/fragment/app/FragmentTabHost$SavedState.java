package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class FragmentTabHost$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<FragmentTabHost$SavedState> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f1966c;

    public class a implements Parcelable.Creator<FragmentTabHost$SavedState> {
        @Override // android.os.Parcelable.Creator
        public FragmentTabHost$SavedState createFromParcel(Parcel parcel) {
            return new FragmentTabHost$SavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FragmentTabHost$SavedState[] newArray(int i10) {
            return new FragmentTabHost$SavedState[i10];
        }
    }

    public FragmentTabHost$SavedState(Parcel parcel) {
        super(parcel);
        this.f1966c = parcel.readString();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("FragmentTabHost.SavedState{");
        sbA.append(Integer.toHexString(System.identityHashCode(this)));
        sbA.append(" curTab=");
        return androidx.activity.k.a(sbA, this.f1966c, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f1966c);
    }
}
