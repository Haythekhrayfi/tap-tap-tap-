package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Intent f502d;

    public class a implements Parcelable.Creator<ActivityResult> {
        @Override // android.os.Parcelable.Creator
        public ActivityResult createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ActivityResult[] newArray(int i10) {
            return new ActivityResult[i10];
        }
    }

    public ActivityResult(int i10, Intent intent) {
        this.f501c = i10;
        this.f502d = intent;
    }

    public ActivityResult(Parcel parcel) {
        this.f501c = parcel.readInt();
        this.f502d = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        String strValueOf;
        StringBuilder sbA = defpackage.a.a("ActivityResult{resultCode=");
        int i10 = this.f501c;
        if (i10 != -1) {
            strValueOf = i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sbA.append(strValueOf);
        sbA.append(", data=");
        sbA.append(this.f502d);
        sbA.append('}');
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f501c);
        parcel.writeInt(this.f502d == null ? 0 : 1);
        Intent intent = this.f502d;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
