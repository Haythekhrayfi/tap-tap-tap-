package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.util.SparseArray;
import com.yandex.metrica.YandexMetrica;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q1 {

    public interface a {
        void a(Context context);
    }

    public abstract int a(C2007ue c2007ue);

    public abstract SparseArray<a> a();

    public synchronized void a(Context context) {
        C2007ue c2007ue = new C2007ue(context);
        int iA = a(c2007ue);
        int libraryApiLevel = YandexMetrica.getLibraryApiLevel();
        if (iA != libraryApiLevel) {
            if (iA > 0 && iA < libraryApiLevel) {
                SparseArray<a> sparseArrayA = a();
                while (true) {
                    iA++;
                    if (iA > libraryApiLevel) {
                        break;
                    }
                    a aVar = sparseArrayA.get(iA);
                    if (aVar != null) {
                        aVar.a(context);
                    }
                }
            }
            a(c2007ue, libraryApiLevel);
            c2007ue.b();
        }
    }

    public abstract void a(C2007ue c2007ue, int i10);
}
