package da;

import android.os.IBinder;
import android.os.IInterface;
import com.yandex.metrica.identifiers.impl.u;
import fd.j0;
import vc.l;

/* JADX INFO: loaded from: classes.dex */
public final class c extends l implements uc.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f28917c = new c();

    public c() {
        super(1);
    }

    @Override // uc.l
    public Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        j0.i(iBinder, "it");
        int i10 = u.f13610c;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        Object dVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e)) ? new d(iBinder) : (e) iInterfaceQueryLocalInterface;
        j0.h(dVar, "OpenDeviceIdentifierService.Stub.asInterface(it)");
        return dVar;
    }
}
