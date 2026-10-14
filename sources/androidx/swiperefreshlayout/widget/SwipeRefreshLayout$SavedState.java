package androidx.swiperefreshlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class SwipeRefreshLayout$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SwipeRefreshLayout$SavedState> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2892c;

    public class a implements Parcelable.Creator<SwipeRefreshLayout$SavedState> {
        @Override // android.os.Parcelable.Creator
        public SwipeRefreshLayout$SavedState createFromParcel(Parcel parcel) {
            return new SwipeRefreshLayout$SavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public SwipeRefreshLayout$SavedState[] newArray(int i10) {
            return new SwipeRefreshLayout$SavedState[i10];
        }
    }

    public SwipeRefreshLayout$SavedState(Parcel parcel) {
        super(parcel);
        this.f2892c = parcel.readByte() != 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeByte(this.f2892c ? (byte) 1 : (byte) 0);
    }
}
