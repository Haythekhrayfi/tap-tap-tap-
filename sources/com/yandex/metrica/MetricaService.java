package com.yandex.metrica;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.yandex.metrica.impl.ob.Am;
import com.yandex.metrica.impl.ob.B1;
import com.yandex.metrica.impl.ob.C2124z1;
import com.yandex.metrica.impl.ob.E2;
import com.yandex.metrica.impl.ob.InterfaceC2099y1;
import com.yandex.metrica.impl.ob.P0;

/* JADX INFO: loaded from: classes.dex */
public class MetricaService extends Service {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static InterfaceC2099y1 f13456e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f13457c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IMetricaService.a f13458d = new b();

    public class a implements e {
        public a() {
        }
    }

    public static class c extends Binder {
    }

    public static class d extends Binder {
    }

    public interface e {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IBinder cVar;
        String action = intent.getAction();
        if ("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER".equals(action)) {
            cVar = new d();
        } else {
            cVar = "com.yandex.metrica.ACTION_C_BG_L".equals(action) ? new c() : this.f13458d;
        }
        f13456e.a(intent);
        return cVar;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f13456e.onConfigurationChanged(configuration);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        P0.a(getApplicationContext());
        Am.a(getApplicationContext());
        InterfaceC2099y1 interfaceC2099y1 = f13456e;
        if (interfaceC2099y1 == null) {
            f13456e = new C2124z1(new B1(getApplicationContext(), this.f13457c));
        } else {
            interfaceC2099y1.a(this.f13457c);
        }
        f13456e.a();
        P0.i().a(new E2(f13456e));
    }

    @Override // android.app.Service
    public void onDestroy() {
        f13456e.b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        f13456e.c(intent);
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        f13456e.a(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        f13456e.a(intent, i10, i11);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        f13456e.b(intent);
        String action = intent.getAction();
        if ("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER".equals(action)) {
            return false;
        }
        if ("com.yandex.metrica.ACTION_C_BG_L".equals(action)) {
            return true;
        }
        return !(intent.getData() == null);
    }

    public class b extends IMetricaService.a {
        @Override // com.yandex.metrica.IMetricaService
        public void a(int i10, Bundle bundle) throws RemoteException {
            MetricaService.f13456e.a(i10, bundle);
        }

        @Override // com.yandex.metrica.IMetricaService
        public void b(Bundle bundle) throws RemoteException {
            MetricaService.f13456e.b(bundle);
        }

        @Override // com.yandex.metrica.IMetricaService
        public void reportData(Bundle bundle) throws RemoteException {
            MetricaService.f13456e.reportData(bundle);
        }

        @Override // com.yandex.metrica.IMetricaService
        public void a(Bundle bundle) throws RemoteException {
            MetricaService.f13456e.a(bundle);
        }
    }
}
