package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.developer.filepicker.model.DialogConfigs;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class X6 implements W6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Um<String>> f15471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1603e8 f15472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Um<String> f15473c;

    public class a implements Um<String> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(String str) {
            X6.a(X6.this, str);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public X6(Context context) {
        String str;
        String strA = C1694i.a(context);
        File noBackupFilesDir = U2.a(21) ? context.getNoBackupFilesDir() : context.getFilesDir();
        if (noBackupFilesDir == null) {
            str = null;
        } else {
            str = noBackupFilesDir.getAbsolutePath() + DialogConfigs.DIRECTORY_SEPERATOR + "appmetrica_native_crashes";
        }
        this(new C1603e8(strA, str));
    }

    public X6(C1603e8 c1603e8) {
        this.f15471a = new ArrayList();
        this.f15473c = new a();
        this.f15472b = c1603e8;
    }

    public static void a(X6 x10, String str) {
        ArrayList arrayList;
        synchronized (x10) {
            arrayList = new ArrayList(x10.f15471a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Um) it.next()).b(str);
        }
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public void a() {
        this.f15472b.a(this.f15473c);
    }

    @Override // com.yandex.metrica.impl.ob.W6
    public synchronized void a(Um<String> um) {
        this.f15471a.add(um);
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public void b() {
        this.f15472b.b(this.f15473c);
    }

    @Override // com.yandex.metrica.impl.ob.W6
    public synchronized void b(Um<String> um) {
        this.f15471a.remove(um);
    }
}
