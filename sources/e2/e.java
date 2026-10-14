package e2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import x1.m;

/* JADX INFO: loaded from: classes.dex */
public class e extends d<c2.b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f28987i = m.e("NetworkStateTracker");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f28988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f28989h;

    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            m.c().a(e.f28987i, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            m.c().a(e.f28987i, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }
    }

    public e(Context context, j2.a aVar) {
        super(context, aVar);
        this.f28988g = (ConnectivityManager) this.f28981b.getSystemService("connectivity");
        this.f28989h = new a();
    }

    @Override // e2.d
    public c2.b a() {
        return f();
    }

    @Override // e2.d
    public void d() {
        try {
            m.c().a(f28987i, "Registering network callback", new Throwable[0]);
            this.f28988g.registerDefaultNetworkCallback(this.f28989h);
        } catch (IllegalArgumentException | SecurityException e10) {
            m.c().b(f28987i, "Received exception while registering network callback", e10);
        }
    }

    @Override // e2.d
    public void e() {
        try {
            m.c().a(f28987i, "Unregistering network callback", new Throwable[0]);
            this.f28988g.unregisterNetworkCallback(this.f28989h);
        } catch (IllegalArgumentException | SecurityException e10) {
            m.c().b(f28987i, "Received exception while unregistering network callback", e10);
        }
    }

    public c2.b f() {
        boolean z10;
        NetworkInfo activeNetworkInfo = this.f28988g.getActiveNetworkInfo();
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilities = this.f28988g.getNetworkCapabilities(this.f28988g.getActiveNetwork());
            z10 = networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (SecurityException e10) {
            m.c().b(f28987i, "Unable to validate active network", e10);
        }
        return new c2.b(z11, z10, k0.a.a(this.f28988g), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
