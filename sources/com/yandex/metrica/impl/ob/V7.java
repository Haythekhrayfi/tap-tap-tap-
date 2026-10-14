package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class V7 implements M7<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f15220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G9 f15221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L0 f15222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Q7 f15223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final N7<String> f15224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f15225g;

    public static class a implements Um<File> {
        @Override // com.yandex.metrica.impl.ob.Um
        public void b(File file) {
            file.delete();
        }
    }

    public static class b implements Um<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final N7<String> f15226a;

        public b(N7<String> n10) {
            this.f15226a = n10;
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(String str) {
            String str2 = str;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f15226a.b(str2);
        }
    }

    public static class c implements Um<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final N7<String> f15227a;

        public c(N7<String> n10) {
            this.f15227a = n10;
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(String str) {
            String str2 = str;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f15227a.a(str2);
        }
    }

    public V7(Context context, L0 l10, Q7 q10, N7<String> n10, InterfaceExecutorC1966sn interfaceExecutorC1966sn, G9 g10) {
        this.f15219a = context;
        this.f15222d = l10;
        this.f15220b = l10.b(context);
        this.f15223e = q10;
        this.f15224f = n10;
        this.f15225g = interfaceExecutorC1966sn;
        this.f15221c = g10;
    }

    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists() || (fileArrListFiles = file.listFiles(new U7(this))) == null) {
            fileArrListFiles = new File[0];
        }
        for (File file2 : fileArrListFiles) {
            ((C1941rn) this.f15225g).execute(new RunnableC1527b7(file2, this.f15223e, new a(), new c(this.f15224f)));
        }
    }

    @Override // com.yandex.metrica.impl.ob.M7
    public synchronized void a() {
        File fileB;
        if (U2.a(21) && (fileB = this.f15222d.b(this.f15219a.getFilesDir(), "YandexMetricaNativeCrashes")) != null) {
            if (!this.f15221c.n()) {
                a2(fileB);
                this.f15221c.o();
            } else if (fileB.exists()) {
                try {
                    fileB.delete();
                } catch (Throwable unused) {
                }
            }
        }
        a2(this.f15220b);
    }

    @Override // com.yandex.metrica.impl.ob.M7
    public void a(File file) {
        b bVar = new b(this.f15224f);
        ((C1941rn) this.f15225g).execute(new RunnableC1527b7(file, this.f15223e, new a(), bVar));
    }
}
