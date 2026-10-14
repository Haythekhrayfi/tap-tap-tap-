package com.yandex.metrica;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface IMetricaService extends IInterface {

    public static abstract class a extends Binder implements IMetricaService {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f13454c = 0;

        /* JADX INFO: renamed from: com.yandex.metrica.IMetricaService$a$a, reason: collision with other inner class name */
        public static class C0170a implements IMetricaService {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public IBinder f13455c;

            public C0170a(IBinder iBinder) {
                this.f13455c = iBinder;
            }

            @Override // com.yandex.metrica.IMetricaService
            public void a(int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    parcelObtain.writeInt(i10);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f13455c.transact(5, parcelObtain, null, 1)) {
                        int i11 = a.f13454c;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.yandex.metrica.IMetricaService
            public void a(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f13455c.transact(4, parcelObtain, null, 1)) {
                        int i10 = a.f13454c;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13455c;
            }

            @Override // com.yandex.metrica.IMetricaService
            public void b(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f13455c.transact(3, parcelObtain, null, 1)) {
                        int i10 = a.f13454c;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.yandex.metrica.IMetricaService
            public void reportData(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f13455c.transact(2, parcelObtain, null, 1)) {
                        int i10 = a.f13454c;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.yandex.metrica.IMetricaService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1598968902) {
                parcel2.writeString("com.yandex.metrica.IMetricaService");
                return true;
            }
            if (i10 == 1) {
                parcel.enforceInterface("com.yandex.metrica.IMetricaService");
                MetricaService.f13456e.a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface("com.yandex.metrica.IMetricaService");
                MetricaService.f13456e.reportData(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i10 == 3) {
                parcel.enforceInterface("com.yandex.metrica.IMetricaService");
                MetricaService.f13456e.b(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i10 == 4) {
                parcel.enforceInterface("com.yandex.metrica.IMetricaService");
                MetricaService.f13456e.a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i10 != 5) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel.enforceInterface("com.yandex.metrica.IMetricaService");
            MetricaService.f13456e.a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
    }

    void a(int i10, Bundle bundle) throws RemoteException;

    void a(Bundle bundle) throws RemoteException;

    void b(Bundle bundle) throws RemoteException;

    void reportData(Bundle bundle) throws RemoteException;
}
