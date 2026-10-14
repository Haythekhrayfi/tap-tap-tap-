package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ac.CrashpadHelper;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.i8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1703i8 implements S7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U3 f16326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1653g8 f16327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Um<Bundle> f16328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1802m8 f16329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1902q8 f16330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Vm<Void, String> f16331g;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.i8$a */
    public class a implements Um<Bundle> {
        @Override // com.yandex.metrica.impl.ob.Um
        public void b(Bundle bundle) {
            CrashpadHelper.setUpNativeUncaughtExceptionHandler(bundle);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.i8$b */
    public class b implements Vm<Void, String> {
        @Override // com.yandex.metrica.impl.ob.Vm
        public String a(Void r10) {
            return CrashpadHelper.getLibraryVersion();
        }
    }

    public C1703i8(Context context, U3 u10) {
        this(context, u10, new L0(), new a());
    }

    private C1703i8(Context context, U3 u10, L0 l10, Um<Bundle> um) {
        this(context, u10, new C1653g8(context, l10, Y.g().d().b()), um, new C1802m8(), new C1902q8(), new b());
    }

    public C1703i8(Context context, U3 u10, C1653g8 c1653g8, Um<Bundle> um, C1802m8 c1802m8, C1902q8 c1902q8, Vm<Void, String> vm) {
        this.f16325a = context;
        this.f16326b = u10;
        this.f16327c = c1653g8;
        this.f16328d = um;
        this.f16329e = c1802m8;
        this.f16330f = c1902q8;
        this.f16331g = vm;
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public String a() {
        return "appmetrica_native_crashes";
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public void a(String str) {
        this.f16330f.a(str);
        CrashpadHelper.updateRuntimeConfig(this.f16330f.a());
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public void a(String str, String str2, String str3) {
        C1752k8 c1752k8B = this.f16327c.b();
        if (c1752k8B != null) {
            if (TextUtils.isEmpty(c1752k8B.f16570a) && c1752k8B.f16573d == null) {
                return;
            }
            this.f16330f.a(str3);
            String strEncodeToString = null;
            this.f16330f.b(this.f16331g.a(null));
            Um<Bundle> um = this.f16328d;
            String strA = this.f16330f.a();
            Bundle bundle = new Bundle();
            C1802m8 c1802m8 = this.f16329e;
            U3 u10 = this.f16326b;
            Objects.requireNonNull(c1802m8);
            try {
                strEncodeToString = Base64.encodeToString(new JSONObject().put("arg_cd", new JSONObject().put("arg_ak", str).put("arg_pn", u10.f()).put("arg_pd", u10.g()).put("arg_ps", u10.h()).put("arg_rt", CounterConfiguration.b.MAIN.a())).toString().getBytes(), 0);
            } catch (Throwable unused) {
            }
            bundle.putString("arg_cd", strEncodeToString);
            bundle.putString("arg_rc", strA);
            bundle.putString("arg_dd", str2);
            bundle.putString("arg_hp", c1752k8B.f16570a);
            bundle.putBoolean("arg_i64", c1752k8B.f16571b);
            bundle.putBoolean("arg_ul", c1752k8B.f16572c);
            bundle.putString("arg_sn", this.f16325a.getPackageName() + "-crashpad_new_crash_socket");
            if (c1752k8B.f16573d == null) {
                bundle.putBoolean("arg_ap", false);
            } else {
                bundle.putBoolean("arg_ap", true);
                Objects.requireNonNull(c1752k8B.f16573d);
                bundle.putString("arg_mc", "com.yandex.metrica.impl.ac.HandlerRunner");
                bundle.putString("arg_akp", c1752k8B.f16573d.f15475a);
                bundle.putString("arg_lp", c1752k8B.f16573d.f15476b);
                bundle.putString("arg_dp", c1752k8B.f16573d.f15477c);
            }
            um.b(bundle);
        }
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public void a(boolean z10) {
        CrashpadHelper.logsEnabled(z10);
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public void b() {
        CrashpadHelper.cancelSetUpNativeUncaughtExceptionHandler();
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public String c() {
        return "appmetrica-native";
    }
}
