package e2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import x1.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<T> extends d<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f28976h = m.e("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BroadcastReceiver f28977g;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.g(context, intent);
            }
        }
    }

    public c(Context context, j2.a aVar) {
        super(context, aVar);
        this.f28977g = new a();
    }

    @Override // e2.d
    public void d() {
        m.c().a(f28976h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f28981b.registerReceiver(this.f28977g, f());
    }

    @Override // e2.d
    public void e() {
        m.c().a(f28976h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f28981b.unregisterReceiver(this.f28977g);
    }

    public abstract IntentFilter f();

    public abstract void g(Context context, Intent intent);
}
