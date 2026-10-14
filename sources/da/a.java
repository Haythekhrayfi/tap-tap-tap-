package da;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class a implements com.yandex.metrica.identifiers.impl.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IBinder f28915c;

    public a(IBinder iBinder) {
        this.f28915c = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f28915c;
    }

    @Override // com.yandex.metrica.identifiers.impl.c
    public String b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            if (!this.f28915c.transact(1, parcelObtain, parcelObtain2, 0)) {
                int i10 = com.yandex.metrica.identifiers.impl.b.f13587c;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.yandex.metrica.identifiers.impl.c
    public boolean d() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            if (!this.f28915c.transact(2, parcelObtain, parcelObtain2, 0)) {
                int i10 = com.yandex.metrica.identifiers.impl.b.f13587c;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
