package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IntentSender f525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Intent f526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f528f;

    public class a implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public IntentSenderRequest[] newArray(int i10) {
            return new IntentSenderRequest[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public IntentSender f529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Intent f530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f532d;

        public b(PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }

        public b(IntentSender intentSender) {
            this.f529a = intentSender;
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f525c = intentSender;
        this.f526d = intent;
        this.f527e = i10;
        this.f528f = i11;
    }

    public IntentSenderRequest(Parcel parcel) {
        this.f525c = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f526d = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f527e = parcel.readInt();
        this.f528f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f525c, i10);
        parcel.writeParcelable(this.f526d, i10);
        parcel.writeInt(this.f527e);
        parcel.writeInt(this.f528f);
    }
}
