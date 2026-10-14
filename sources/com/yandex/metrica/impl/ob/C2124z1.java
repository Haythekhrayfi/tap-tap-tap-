package com.yandex.metrica.impl.ob;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import com.yandex.metrica.MetricaService;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2124z1 implements InterfaceC2099y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceExecutorC1966sn f17955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC2099y1 f17956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1845o1 f17957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17958d;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z1$a */
    public class a extends Km {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f17959a;

        public a(Bundle bundle) {
            this.f17959a = bundle;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C2124z1.this.f17956b.b(this.f17959a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z1$b */
    public class b extends Km {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f17961a;

        public b(Bundle bundle) {
            this.f17961a = bundle;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C2124z1.this.f17956b.a(this.f17961a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z1$c */
    public class c extends Km {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Configuration f17963a;

        public c(Configuration configuration) {
            this.f17963a = configuration;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C2124z1.this.f17956b.onConfigurationChanged(this.f17963a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z1$d */
    public class d extends Km {
        public d() {
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() {
            synchronized (C2124z1.this) {
                if (C2124z1.this.f17958d) {
                    C2124z1.this.f17957c.e();
                    C2124z1.this.f17956b.a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z1$e */
    public class e extends Km {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f17966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f17967b;

        public e(Intent intent, int i10) {
            this.f17966a = intent;
            this.f17967b = i10;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() {
            C2124z1.this.f17956b.a(this.f17966a, this.f17967b);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z1$f */
    public class f extends Km {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f17969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f17970b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f17971c;

        public f(Intent intent, int i10, int i11) {
            this.f17969a = intent;
            this.f17970b = i10;
            this.f17971c = i11;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() {
            C2124z1.this.f17956b.a(this.f17969a, this.f17970b, this.f17971c);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z1$g */
    public class g extends Km {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f17973a;

        public g(Intent intent) {
            this.f17973a = intent;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() {
            C2124z1.this.f17956b.a(this.f17973a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z1$h */
    public class h extends Km {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f17975a;

        public h(Intent intent) {
            this.f17975a = intent;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() {
            C2124z1.this.f17956b.c(this.f17975a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z1$i */
    public class i extends Km {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f17977a;

        public i(Intent intent) {
            this.f17977a = intent;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() {
            C2124z1.this.f17956b.b(this.f17977a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z1$j */
    public class j extends Km {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f17980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f17981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Bundle f17982d;

        public j(String str, int i10, String str2, Bundle bundle) {
            this.f17979a = str;
            this.f17980b = i10;
            this.f17981c = str2;
            this.f17982d = bundle;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws RemoteException {
            C2124z1.this.f17956b.a(this.f17979a, this.f17980b, this.f17981c, this.f17982d);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z1$k */
    public class k extends Km {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f17984a;

        public k(Bundle bundle) {
            this.f17984a = bundle;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C2124z1.this.f17956b.reportData(this.f17984a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z1$l */
    public class l extends Km {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f17986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f17987b;

        public l(int i10, Bundle bundle) {
            this.f17986a = i10;
            this.f17987b = bundle;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C2124z1.this.f17956b.a(this.f17986a, this.f17987b);
        }
    }

    public C2124z1(InterfaceExecutorC1966sn interfaceExecutorC1966sn, InterfaceC2099y1 interfaceC2099y1, C1845o1 c1845o1) {
        this.f17958d = false;
        this.f17955a = interfaceExecutorC1966sn;
        this.f17956b = interfaceC2099y1;
        this.f17957c = c1845o1;
    }

    public C2124z1(InterfaceC2099y1 interfaceC2099y1) {
        this(P0.i().s().d(), interfaceC2099y1, P0.i().j());
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public synchronized void a() {
        this.f17958d = true;
        ((C1941rn) this.f17955a).execute(new d());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2099y1
    public void a(int i10, Bundle bundle) {
        ((C1941rn) this.f17955a).execute(new l(i10, bundle));
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void a(Intent intent) {
        ((C1941rn) this.f17955a).execute(new g(intent));
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void a(Intent intent, int i10) {
        ((C1941rn) this.f17955a).execute(new e(intent, i10));
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void a(Intent intent, int i10, int i11) {
        ((C1941rn) this.f17955a).execute(new f(intent, i10, i11));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2099y1
    public void a(Bundle bundle) {
        ((C1941rn) this.f17955a).execute(new b(bundle));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2099y1
    public void a(MetricaService.e eVar) {
        this.f17956b.a(eVar);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2099y1
    public void a(String str, int i10, String str2, Bundle bundle) {
        ((C1941rn) this.f17955a).execute(new j(str, i10, str2, bundle));
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void b() {
        ((C1941rn) this.f17955a).d();
        synchronized (this) {
            this.f17957c.f();
            this.f17958d = false;
        }
        this.f17956b.b();
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void b(Intent intent) {
        ((C1941rn) this.f17955a).execute(new i(intent));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2099y1
    public void b(Bundle bundle) {
        ((C1941rn) this.f17955a).execute(new a(bundle));
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void c(Intent intent) {
        ((C1941rn) this.f17955a).execute(new h(intent));
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void onConfigurationChanged(Configuration configuration) {
        ((C1941rn) this.f17955a).execute(new c(configuration));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2099y1
    public void reportData(Bundle bundle) {
        ((C1941rn) this.f17955a).execute(new k(bundle));
    }
}
