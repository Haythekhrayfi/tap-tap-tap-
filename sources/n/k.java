package n;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class k implements ServiceConnection {
    private Context mApplicationContext;

    public class a extends i {
        public a(k kVar, a.b bVar, ComponentName componentName, Context context) {
            super(bVar, componentName, context);
        }
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, i iVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a.b c0002a;
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i10 = a.b.a.f4c;
        if (iBinder == null) {
            c0002a = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            c0002a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a.b)) ? new a.b.a.C0002a(iBinder) : (a.b) iInterfaceQueryLocalInterface;
        }
        onCustomTabsServiceConnected(componentName, new a(this, c0002a, componentName, this.mApplicationContext));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
