package com.inscode.autoclicker.shortcut;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.inscode.autoclicker.R;
import d7.g;
import d7.z;
import f7.i;
import fd.f;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import jc.e;
import lb.m;
import r6.k;
import vc.b0;
import vc.l;
import y6.d0;
import y6.j;
import y6.o1;
import y6.u2;
import yd.h;
import z6.r;
import z6.y0;

/* JADX INFO: loaded from: classes2.dex */
public final class ShortcutActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f13310h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f13311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f13312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f13313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nb.a f13315g;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13316a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.MANUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.RECORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13316a = iArr;
        }
    }

    public static final class b extends l implements uc.a<i7.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13319e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13320f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13317c = componentCallbacks;
            this.f13318d = str;
            this.f13319e = aVar;
            this.f13320f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [i7.d, java.lang.Object] */
        @Override // uc.a
        public final i7.d invoke() {
            return f.d(this.f13317c).f37311a.c(new h(this.f13318d, b0.a(i7.d.class), this.f13319e, this.f13320f));
        }
    }

    public static final class c extends l implements uc.a<u2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13322d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13324f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13321c = componentCallbacks;
            this.f13322d = str;
            this.f13323e = aVar;
            this.f13324f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, y6.u2] */
        @Override // uc.a
        public final u2 invoke() {
            return f.d(this.f13321c).f37311a.c(new h(this.f13322d, b0.a(u2.class), this.f13323e, this.f13324f));
        }
    }

    public static final class d extends l implements uc.a<q6.b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13328f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13325c = componentCallbacks;
            this.f13326d = str;
            this.f13327e = aVar;
            this.f13328f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, q6.b] */
        @Override // uc.a
        public final q6.b invoke() {
            return f.d(this.f13325c).f37311a.c(new h(this.f13326d, b0.a(q6.b.class), this.f13327e, this.f13328f));
        }
    }

    public ShortcutActivity() {
        new LinkedHashMap();
        ae.b bVar = ae.b.f348c;
        this.f13311c = jc.f.b(new b(this, "", null, bVar));
        this.f13312d = jc.f.b(new c(this, "", null, bVar));
        this.f13313e = jc.f.b(new d(this, "", null, bVar));
        this.f13315g = new nb.a();
    }

    public static final void g(ShortcutActivity shortcutActivity, boolean z10) {
        shortcutActivity.f13315g.d();
        nb.b bVarE = ec.a.e(((q6.b) shortcutActivity.f13313e.getValue()).f34781a.v(1L).u(fc.a.f29534b).p(mb.a.a()), null, null, new f7.l(z10, shortcutActivity), 3);
        p6.b.a(bVarE, "$receiver", shortcutActivity.f13315g, "compositeDisposable", bVarE);
    }

    public static final void h(ShortcutActivity shortcutActivity) {
        Objects.requireNonNull(shortcutActivity);
        try {
            if (!shortcutActivity.f13314f || shortcutActivity.isFinishing()) {
                return;
            }
            shortcutActivity.finish();
        } catch (Exception e10) {
            xe.a.f37601c.b(d0.b.a(e10, defpackage.a.a("[SHORTCUT] Finish error : ")), new Object[0]);
        }
    }

    public final u2 getServiceHolder() {
        return (u2) this.f13312d.getValue();
    }

    @Override // androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        k kVar;
        m<u6.a> mVarI;
        z zVar;
        z zVar2;
        super.onCreate(bundle);
        this.f13314f = true;
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("mode", -1);
        if (intExtra != -1) {
            if (intExtra != 1) {
                kVar = intExtra != 2 ? k.COMBINE : k.RECORD;
            } else {
                kVar = k.MANUAL;
            }
            if (!((i7.d) this.f13311c.getValue()).a(this)) {
                Toast.makeText(this, getString(R.string.no_service_enabled), 1).show();
                finish();
                return;
            }
            String stringExtra = intent.getStringExtra(FacebookMediationAdapter.KEY_ID);
            if (stringExtra == null) {
                stringExtra = "";
            }
            boolean booleanExtra = intent.getBooleanExtra("autostart", false);
            boolean booleanExtra2 = intent.getBooleanExtra("startHidden", false);
            boolean booleanExtra3 = intent.getBooleanExtra("closeOnFinish", false);
            if (kVar != getServiceHolder().f38398b) {
                StringBuilder sbA = defpackage.a.a("Widget service states: ");
                Objects.requireNonNull(o1.f38296s);
                sbA.append(o1.f38297t);
                sbA.append(' ');
                Objects.requireNonNull(d0.f38116t);
                sbA.append(d0.f38117u);
                sbA.append(' ');
                Objects.requireNonNull(j.f38212r);
                sbA.append(j.f38213s);
                xe.a.f37601c.a(sbA.toString(), new Object[0]);
                int i10 = o1.f38297t;
                if (i10 != 1 && i10 != 2 && d0.f38117u != 2 && j.f38213s != 2) {
                    stopWidgetService();
                    try {
                        getServiceHolder().c(kVar);
                    } catch (Exception e10) {
                        StringBuilder sbA2 = defpackage.a.a("[SERVICE_ERROR]: Starting service: ");
                        sbA2.append(getServiceHolder().f38398b);
                        sbA2.append("...");
                        xe.a.f37601c.d(e10, sbA2.toString(), new Object[0]);
                    }
                }
            }
            xe.a.f37601c.a("ShortcutActivity: " + stringExtra + " autostart: " + booleanExtra, new Object[0]);
            int i11 = a.f13316a[kVar.ordinal()];
            if (i11 == 1) {
                mVarI = ((a7.a) ((jc.k) jc.f.b(new f7.a(this, "", null, ae.b.f348c))).getValue()).b(stringExtra).n(fc.a.f29534b).i(mb.a.a());
                zVar = new z(new f7.d(booleanExtra3, this), 2);
                zVar2 = new z(new f7.e(this), 3);
            } else if (i11 != 2) {
                mVarI = ((r) ((jc.k) jc.f.b(new f7.c(this, "", null, ae.b.f348c))).getValue()).b(stringExtra).n(fc.a.f29534b).i(mb.a.a()).h(new y0(new i(booleanExtra, this, booleanExtra3), 27)).d(600L, TimeUnit.MILLISECONDS).i(mb.a.a());
                zVar = new z(new f7.j(booleanExtra2, this), 6);
                zVar2 = new z(new f7.k(this), 7);
            } else {
                mVarI = ((g) ((jc.k) jc.f.b(new f7.b(this, "", null, ae.b.f348c))).getValue()).b(stringExtra).n(fc.a.f29534b).i(mb.a.a()).h(new y0(new f7.f(booleanExtra, this, booleanExtra3), 26)).d(600L, TimeUnit.MILLISECONDS).i(mb.a.a());
                zVar = new z(new f7.g(booleanExtra2, this), 4);
                zVar2 = new z(new f7.h(this), 5);
            }
            mVarI.l(zVar, zVar2);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.n, android.app.Activity
    public void onDestroy() {
        this.f13314f = false;
        super.onDestroy();
    }

    public final void stopWidgetService() {
        try {
            getServiceHolder().d();
        } catch (Exception e10) {
            xe.a.f37601c.a(d0.b.a(e10, d0.c.a("[ERROR] Stopping widget service error: ", e10, ' ')), new Object[0]);
        }
    }
}
