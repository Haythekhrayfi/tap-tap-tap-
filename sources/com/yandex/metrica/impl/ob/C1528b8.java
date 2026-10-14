package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.metrica.impl.ac.CrashpadServiceHelper;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.b8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1528b8 implements M7<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1578d8 f15814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Vm<String, Bundle> f15815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callable<List<Bundle>> f15816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Um<String> f15817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1503a8 f15818e;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.b8$a */
    public class a implements Vm<String, Bundle> {
        @Override // com.yandex.metrica.impl.ob.Vm
        public Bundle a(String str) {
            return CrashpadServiceHelper.readCrash(str);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.b8$b */
    public class b implements Callable<List<Bundle>> {
        @Override // java.util.concurrent.Callable
        public List<Bundle> call() throws Exception {
            return CrashpadServiceHelper.readOldCrashes();
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.b8$c */
    public class c implements Um<String> {
        @Override // com.yandex.metrica.impl.ob.Um
        public void b(String str) {
            CrashpadServiceHelper.a(str);
        }
    }

    public C1528b8(C1578d8 c1578d8) {
        this(c1578d8, new C1503a8(), new a(), new b(), new c());
    }

    public C1528b8(C1578d8 c1578d8, C1503a8 c1503a8, Vm<String, Bundle> vm, Callable<List<Bundle>> callable, Um<String> um) {
        this.f15814a = c1578d8;
        this.f15818e = c1503a8;
        this.f15815b = vm;
        this.f15816c = callable;
        this.f15817d = um;
    }

    @Override // com.yandex.metrica.impl.ob.M7
    public void a() {
        try {
            for (Bundle bundle : this.f15816c.call()) {
                String string = bundle.getString("arg_ui");
                if (!TextUtils.isEmpty(string)) {
                    Z7 z7A = this.f15818e.a(string, bundle);
                    if (z7A != null) {
                        this.f15814a.b2(z7A);
                    } else {
                        this.f15817d.b(string);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.yandex.metrica.impl.ob.M7
    public void a(String str) {
        Z7 z7A;
        String str2 = str;
        try {
            Bundle bundleA = this.f15815b.a(str2);
            z7A = bundleA != null ? this.f15818e.a(str2, bundleA) : null;
        } catch (Throwable unused) {
        }
        if (z7A != null) {
            this.f15814a.a2(z7A);
        } else {
            this.f15817d.b(str2);
        }
    }
}
