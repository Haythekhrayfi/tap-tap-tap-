package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public android.support.v4.os.a f453d;

    public class a implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ResultReceiver[] newArray(int i10) {
            return new ResultReceiver[i10];
        }
    }

    public class b extends android.support.v4.os.a.AbstractBinderC0020a {
        public b() {
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bundle f456d;

        public c(int i10, Bundle bundle) {
            this.f455c = i10;
            this.f456d = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.a(this.f455c, this.f456d);
        }
    }

    public ResultReceiver(Handler handler) {
        this.f452c = handler;
    }

    public ResultReceiver(Parcel parcel) {
        android.support.v4.os.a c0021a = null;
        this.f452c = null;
        IBinder strongBinder = parcel.readStrongBinder();
        int i10 = android.support.v4.os.a.AbstractBinderC0020a.f458c;
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            c0021a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof android.support.v4.os.a)) ? new android.support.v4.os.a.AbstractBinderC0020a.C0021a(strongBinder) : (android.support.v4.os.a) iInterfaceQueryLocalInterface;
        }
        this.f453d = c0021a;
    }

    public void a(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f453d == null) {
                this.f453d = new b();
            }
            parcel.writeStrongBinder(this.f453d.asBinder());
        }
    }
}
