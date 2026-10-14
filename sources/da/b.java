package da;

import android.os.IBinder;
import android.os.IInterface;
import fd.j0;
import vc.l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l implements uc.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f28916c = new b();

    public b() {
        super(1);
    }

    @Override // uc.l
    public Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        j0.i(iBinder, "it");
        int i10 = com.yandex.metrica.identifiers.impl.b.f13587c;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        Object aVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof com.yandex.metrica.identifiers.impl.c)) ? new a(iBinder) : (com.yandex.metrica.identifiers.impl.c) iInterfaceQueryLocalInterface;
        j0.h(aVar, "YandexAdvIdInterface.Stub.asInterface(it)");
        return aVar;
    }
}
