package u3;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f35973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b.a f35974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f35976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BroadcastReceiver f35977e = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            d dVar = d.this;
            boolean z10 = dVar.f35975c;
            dVar.f35975c = dVar.i(context);
            if (z10 != d.this.f35975c) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    StringBuilder sbA = defpackage.a.a("connectivity changed, isConnected: ");
                    sbA.append(d.this.f35975c);
                    Log.d("ConnectivityMonitor", sbA.toString());
                }
                d dVar2 = d.this;
                b.a aVar = dVar2.f35974b;
                boolean z11 = dVar2.f35975c;
                a3.j.b bVar = (a3.j.b) aVar;
                Objects.requireNonNull(bVar);
                if (z11) {
                    synchronized (a3.j.this) {
                        l lVar = bVar.f71a;
                        for (x3.b bVar2 : (ArrayList) b4.j.e(lVar.f35992a)) {
                            if (!bVar2.e() && !bVar2.c()) {
                                bVar2.clear();
                                if (lVar.f35994c) {
                                    lVar.f35993b.add(bVar2);
                                } else {
                                    bVar2.d();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public d(Context context, b.a aVar) {
        this.f35973a = context.getApplicationContext();
        this.f35974b = aVar;
    }

    @SuppressLint({"MissingPermission"})
    public boolean i(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Objects.requireNonNull(connectivityManager, "Argument must not be null");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e10) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e10);
            }
            return true;
        }
    }

    @Override // u3.g
    public void onDestroy() {
    }

    @Override // u3.g
    public void onStart() {
        if (this.f35976d) {
            return;
        }
        this.f35975c = i(this.f35973a);
        try {
            this.f35973a.registerReceiver(this.f35977e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f35976d = true;
        } catch (SecurityException e10) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e10);
            }
        }
    }

    @Override // u3.g
    public void onStop() {
        if (this.f35976d) {
            this.f35973a.unregisterReceiver(this.f35977e);
            this.f35976d = false;
        }
    }
}
