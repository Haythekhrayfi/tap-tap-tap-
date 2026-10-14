package a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import n.c;
import n.d;
import n.e;
import n.f;
import n.g;
import n.h;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0000a extends Binder implements a {

        /* JADX INFO: renamed from: a.a$a$a, reason: collision with other inner class name */
        public static class C0001a implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public IBinder f3c;

            public C0001a(IBinder iBinder) {
                this.f3c = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3c;
            }
        }

        public AbstractBinderC0000a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        public static a i0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0001a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            Bundle bundle;
            if (i10 == 1598968902) {
                parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            }
            switch (i10) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    int i12 = parcel.readInt();
                    bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    h hVar = (h) this;
                    if (hVar.f33564d != null) {
                        hVar.f33563c.post(new c(hVar, i12, bundle));
                    }
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    String string = parcel.readString();
                    bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    h hVar2 = (h) this;
                    if (hVar2.f33564d != null) {
                        hVar2.f33563c.post(new d(hVar2, string, bundle));
                    }
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    h hVar3 = (h) this;
                    if (hVar3.f33564d != null) {
                        hVar3.f33563c.post(new e(hVar3, bundle));
                    }
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    String string2 = parcel.readString();
                    bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    h hVar4 = (h) this;
                    if (hVar4.f33564d != null) {
                        hVar4.f33563c.post(new f(hVar4, string2, bundle));
                    }
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    int i13 = parcel.readInt();
                    Uri uri = parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null;
                    boolean z10 = parcel.readInt() != 0;
                    Bundle bundle2 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    h hVar5 = (h) this;
                    if (hVar5.f33564d != null) {
                        hVar5.f33563c.post(new g(hVar5, i13, uri, z10, bundle2));
                    }
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }
}
