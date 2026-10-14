package com.inscode.autoclicker.plugins;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import ch.qos.logback.core.CoreConstants;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.inscode.autoclicker.R;
import fd.j0;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import jc.f;
import lb.m;
import r6.k;
import vc.b0;
import vc.g;
import vc.l;
import x6.i;
import x6.n;
import x6.o;
import y6.d0;
import y6.j;
import y6.o1;
import y6.u2;
import yd.h;
import z6.r;

/* JADX INFO: loaded from: classes2.dex */
public final class TaskerFireReceiver extends BroadcastReceiver implements le.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f13079g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jc.e f13080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jc.e f13081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jc.e f13082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nb.a f13083f;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13084a;

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
            f13084a = iArr;
        }
    }

    public static final class c extends l implements uc.a<i7.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f13085c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13086d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13087e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13088f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f13085c = aVar;
            this.f13086d = str;
            this.f13087e = aVar2;
            this.f13088f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [i7.d, java.lang.Object] */
        @Override // uc.a
        public final i7.d invoke() {
            return this.f13085c.getKoin().f37311a.c(new h(this.f13086d, b0.a(i7.d.class), this.f13087e, this.f13088f));
        }
    }

    public static final class d extends l implements uc.a<u2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f13089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13091e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13092f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f13089c = aVar;
            this.f13090d = str;
            this.f13091e = aVar2;
            this.f13092f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, y6.u2] */
        @Override // uc.a
        public final u2 invoke() {
            return this.f13089c.getKoin().f37311a.c(new h(this.f13090d, b0.a(u2.class), this.f13091e, this.f13092f));
        }
    }

    public static final class e extends l implements uc.a<q6.b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f13093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13094d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13095e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13096f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f13093c = aVar;
            this.f13094d = str;
            this.f13095e = aVar2;
            this.f13096f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, q6.b] */
        @Override // uc.a
        public final q6.b invoke() {
            return this.f13093c.getKoin().f37311a.c(new h(this.f13094d, b0.a(q6.b.class), this.f13095e, this.f13096f));
        }
    }

    static {
        new a(null);
    }

    public TaskerFireReceiver() {
        ae.b bVar = ae.b.f348c;
        this.f13080c = f.b(new c(this, "", null, bVar));
        this.f13081d = f.b(new d(this, "", null, bVar));
        this.f13082e = f.b(new e(this, "", null, bVar));
        this.f13083f = new nb.a();
    }

    public static final void a(TaskerFireReceiver taskerFireReceiver, Context context, Intent intent) {
        taskerFireReceiver.f13083f.d();
        nb.b bVarE = ec.a.e(((q6.b) taskerFireReceiver.f13082e.getValue()).f34781a.v(1L).u(fc.a.f29534b).p(mb.a.a()), null, null, new x6.c(taskerFireReceiver, context, intent), 3);
        p6.b.a(bVarE, "$receiver", taskerFireReceiver.f13083f, "compositeDisposable", bVarE);
    }

    public final u2 b() {
        return (u2) this.f13081d.getValue();
    }

    public final void c() {
        try {
            b().d();
        } catch (Exception e10) {
            xe.a.f37601c.a(d0.b.a(e10, d0.c.a("[ERROR] Stopping widget service error: ", e10, ' ')), new Object[0]);
        }
    }

    @Override // le.a
    public wd.b getKoin() {
        return le.a.C0352a.a();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle bundleExtra;
        k kVar;
        m mVarI;
        x6.b bVar;
        x6.b bVar2;
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(intent, "intent");
        if (j0.d("com.twofortyfouram.locale.intent.action.FIRE_SETTING", intent.getAction()) && (bundleExtra = intent.getBundleExtra("com.twofortyfouram.locale.intent.extra.BUNDLE")) != null) {
            int i10 = 0;
            int i11 = bundleExtra.getInt("type", 0);
            String string = bundleExtra.getString(FacebookMediationAdapter.KEY_ID, "");
            int i12 = 1;
            boolean z10 = bundleExtra.getBoolean("autostart", true);
            boolean z11 = bundleExtra.getBoolean("startHidden", false);
            j0.h(string, "name");
            int i13 = 3;
            if (i11 != -1) {
                int i14 = 2;
                if (i11 != 1) {
                    kVar = i11 != 2 ? k.COMBINE : k.RECORD;
                } else {
                    kVar = k.MANUAL;
                }
                if (((i7.d) this.f13080c.getValue()).a(context)) {
                    if (kVar != b().f38398b) {
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
                        int i15 = o1.f38297t;
                        if (i15 != 1 && i15 != 2 && d0.f38117u != 2 && j.f38213s != 2) {
                            c();
                            try {
                                b().c(kVar);
                            } catch (Exception e10) {
                                StringBuilder sbA2 = defpackage.a.a("[SERVICE_ERROR]: Starting service: ");
                                sbA2.append(b().f38398b);
                                sbA2.append("...");
                                xe.a.f37601c.d(e10, sbA2.toString(), new Object[0]);
                            }
                        }
                    }
                    xe.a.f37601c.a("ShortcutActivity: " + string + " autostart: " + z10, new Object[0]);
                    int i16 = b.f13084a[kVar.ordinal()];
                    if (i16 == 1) {
                        mVarI = ((a7.a) ((jc.k) f.b(new x6.d(this, "", null, ae.b.f348c))).getValue()).b(string).n(fc.a.f29534b).i(mb.a.a()).h(new p6.a(new x6.g(z10, this, context, intent), 1)).d(600L, TimeUnit.MILLISECONDS).i(mb.a.a());
                        bVar = new x6.b(new x6.h(z11, this), i10);
                        bVar2 = new x6.b(new i(context, string), i12);
                    } else if (i16 != 2) {
                        mVarI = ((r) ((jc.k) f.b(new x6.f(this, "", null, ae.b.f348c))).getValue()).b(string).n(fc.a.f29534b).i(mb.a.a()).h(new p6.a(new x6.m(z10, this, context, intent), 3)).d(600L, TimeUnit.MILLISECONDS).i(mb.a.a());
                        bVar = new x6.b(new n(z11, this), 4);
                        bVar2 = new x6.b(new o(context, string), 5);
                    } else {
                        mVarI = ((d7.g) ((jc.k) f.b(new x6.e(this, "", null, ae.b.f348c))).getValue()).b(string).n(fc.a.f29534b).i(mb.a.a()).h(new p6.a(new x6.j(z10, this, context, intent), 2)).d(600L, TimeUnit.MILLISECONDS).i(mb.a.a());
                        bVar = new x6.b(new x6.k(z11, this), i14);
                        bVar2 = new x6.b(new x6.l(context, string), i13);
                    }
                    mVarI.l(bVar, bVar2);
                } else {
                    Toast.makeText(context, context.getString(R.string.no_service_enabled), 1).show();
                    Bundle bundle = new Bundle();
                    bundle.putString("%errmsg", context.getString(R.string.no_service_enabled));
                    nd.a.C0371a.c(context, intent, 2, bundle);
                }
            }
            setResultCode(3);
        }
    }
}
