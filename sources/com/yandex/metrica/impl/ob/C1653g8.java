package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import com.yandex.metrica.impl.ac.CrashpadHelper;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1653g8 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Set<String> f16187m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f16189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f16190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<String> f16191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f16192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final File f16193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Vm<Void, String> f16194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1866om f16195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1628f8 f16196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Callable<String> f16197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Y7 f16198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final L0 f16199l;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g8$a */
    public class a implements Vm<Void, String> {
        @Override // com.yandex.metrica.impl.ob.Vm
        public String a(Void r10) {
            return CrashpadHelper.getLibraryVersion();
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g8$b */
    public class b implements Callable<String> {
        @Override // java.util.concurrent.Callable
        public String call() throws Exception {
            return CrashpadHelper.getLibDirInsideApk();
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g8$c */
    public static class c implements Vm<File, Boolean> {
        @Override // com.yandex.metrica.impl.ob.Vm
        public /* bridge */ /* synthetic */ Boolean a(File file) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g8$d */
    public static class d implements Vm<File, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f16200a;

        public d(String str) {
            this.f16200a = str;
        }

        @Override // com.yandex.metrica.impl.ob.Vm
        public Boolean a(File file) {
            return Boolean.valueOf(!file.getName().endsWith(this.f16200a));
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f16187m = hashSet;
        hashSet.add("armeabi-v7a");
        hashSet.add("arm64-v8a");
        hashSet.add("x86");
        hashSet.add("x86_64");
    }

    public C1653g8(Context context, L0 l10, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this(context, l10, interfaceExecutorC1966sn, Arrays.asList("libappmetrica_crashpad_handler.so", "libappmetrica_handler.so"));
    }

    private C1653g8(Context context, L0 l10, InterfaceExecutorC1966sn interfaceExecutorC1966sn, List<String> list) {
        this(context, interfaceExecutorC1966sn, list, l10, l10.a(l10.a(context), list.get(0)), l10.b(context.getCacheDir(), "appmetrica_crashpad_handler_extracted"), new a(), new b(), new C1866om(f16187m));
    }

    private C1653g8(Context context, InterfaceExecutorC1966sn interfaceExecutorC1966sn, List<String> list, L0 l10, File file, File file2, Vm<Void, String> vm, Callable<String> callable, C1866om c1866om) {
        this(context, interfaceExecutorC1966sn, list, file, file2, vm, callable, c1866om, new C1628f8(context, file2), new Y7(), l10);
    }

    public C1653g8(Context context, InterfaceExecutorC1966sn interfaceExecutorC1966sn, List<String> list, File file, File file2, Vm<Void, String> vm, Callable<String> callable, C1866om c1866om, C1628f8 c1628f8, Y7 y10, L0 l10) {
        this.f16188a = context;
        this.f16189b = interfaceExecutorC1966sn;
        this.f16191d = list;
        this.f16190c = file;
        this.f16192e = context.getCacheDir();
        this.f16193f = file2;
        this.f16194g = vm;
        this.f16197j = callable;
        this.f16195h = c1866om;
        this.f16196i = c1628f8;
        this.f16198k = y10;
        this.f16199l = l10;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    private C1752k8 a() {
        boolean executable;
        File file;
        File file2 = this.f16190c;
        if (!(file2 == null || !file2.exists())) {
            return new C1752k8(this.f16190c.getAbsolutePath(), false, null);
        }
        SystemClock.elapsedRealtime();
        String str = "-" + this.f16194g.a(null);
        String strA = this.f16195h.a();
        if (strA == null) {
            return null;
        }
        File file3 = this.f16193f;
        if (file3 == null) {
            executable = false;
        } else if (file3.exists()) {
            executable = true;
        } else if (this.f16193f.mkdirs() && (file = this.f16192e) != null && file.setExecutable(true, false)) {
            executable = this.f16193f.setExecutable(true, false);
        } else {
            executable = false;
        }
        if (!executable) {
            return null;
        }
        ((C1941rn) this.f16189b).execute(new RunnableC1678h8(this, new d(str)));
        for (String str2 : this.f16191d) {
            String strA2 = this.f16196i.a(String.format("lib/%s/%s", strA, str2), i.f.a(str2, str));
            SystemClock.elapsedRealtime();
            if (strA2 != null) {
                return new C1752k8(strA2, false, null);
            }
        }
        return null;
    }

    private File c() {
        String strCall;
        try {
            strCall = this.f16197j.call();
        } catch (Throwable unused) {
            strCall = null;
        }
        if (TextUtils.isEmpty(strCall)) {
            return null;
        }
        Objects.requireNonNull(this.f16199l);
        return new File(strCall);
    }

    public void a(Vm<File, Boolean> vm) {
        File[] fileArrListFiles;
        File file = this.f16193f;
        if (file == null || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (vm.a(file2).booleanValue()) {
                file2.delete();
            }
        }
    }

    public C1752k8 b() {
        X7 x10;
        C1752k8 c1752k8 = null;
        if (U2.a(29)) {
            File fileC = c();
            if (fileC == null) {
                return null;
            }
            for (String str : this.f16191d) {
                Objects.requireNonNull(this.f16199l);
                File file = new File(fileC, str);
                if (file.exists()) {
                    return new C1752k8(file.getAbsolutePath(), true, null);
                }
            }
            return null;
        }
        if (!U2.a(23)) {
            return a();
        }
        Y7 y10 = this.f16198k;
        Context context = this.f16188a;
        String strA = this.f16195h.a();
        Objects.requireNonNull(y10);
        try {
            String[] strArrA = AbstractC1777l8.a(context, strA);
            x10 = new X7(strArrA[0], strArrA[1], Environment.getDataDirectory().getAbsolutePath());
        } catch (Throwable unused) {
            x10 = null;
        }
        if (x10 != null) {
            File fileC2 = c();
            if (fileC2 != null) {
                for (String str2 : this.f16191d) {
                    Objects.requireNonNull(this.f16199l);
                    File file2 = new File(fileC2, str2);
                    if (file2.exists()) {
                        c1752k8 = new C1752k8(file2.getAbsolutePath(), false, x10);
                        break;
                    }
                }
            } else {
                c1752k8 = new C1752k8("stub", false, x10);
            }
        }
        if (c1752k8 == null || c1752k8.f16573d == null) {
            return a();
        }
        ((C1941rn) this.f16189b).execute(new RunnableC1678h8(this, new c()));
        return c1752k8;
    }
}
