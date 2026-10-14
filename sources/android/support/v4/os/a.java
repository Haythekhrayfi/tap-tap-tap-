package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.os.ResultReceiver.c;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: android.support.v4.os.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0020a extends Binder implements a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f458c = 0;

        /* JADX INFO: renamed from: android.support.v4.os.a$a$a, reason: collision with other inner class name */
        public static class C0021a implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public IBinder f459c;

            public C0021a(IBinder iBinder) {
                this.f459c = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f459c;
            }
        }

        public AbstractBinderC0020a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            int i12 = parcel.readInt();
            Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f452c;
            if (handler != null) {
                handler.post(resultReceiver.new c(i12, bundle));
            } else {
                resultReceiver.a(i12, bundle);
            }
            return true;
        }
    }
}
