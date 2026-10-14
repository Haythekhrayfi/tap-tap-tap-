package g6;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.activity.j;
import androidx.activity.k;
import androidx.lifecycle.p;
import ch.qos.logback.core.rolling.helper.FileProvider;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.zipoapps.blytics.BLyticsEngine;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import w2.h;
import w2.i;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile c f30012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c f30013d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set<d> f30015b;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayDeque, java.util.Set<g6.d>] */
    public c(int i10) {
        this.f30014a = i10;
        if (i10 == 1) {
            this.f30015b = new ArrayDeque();
        } else if (i10 != 6) {
            this.f30015b = new HashSet();
        }
    }

    public static String d(String str) {
        String str2 = File.separator;
        if (!str.contains(str2)) {
            return j.a("(?:\ufffe)?", str, "(?:\uffff)?");
        }
        String[] strArrSplit = str.split(str2);
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            if (strArrSplit[i10].length() > 0) {
                strArrSplit[i10] = k.a(defpackage.a.a("(?:\ufffe)?"), strArrSplit[i10], "(?:\uffff)?");
            }
        }
        return TextUtils.join(File.separator, strArrSplit);
    }

    public void a(List<File> list, List<h> list2, int i10, List<File> list3) {
        if (i10 >= list2.size() - 1) {
            return;
        }
        h hVar = list2.get(i10);
        for (File file : list) {
            if (((FileProvider) this.f30015b).isDirectory(file) && hVar.c(file)) {
                list3.add(file);
                a(Arrays.asList(((FileProvider) this.f30015b).listFiles(file, null)), list2, i10 + 1, list3);
            }
        }
    }

    public List<File> b(List<File> list, List<h> list2, int i10) {
        ArrayList arrayList = new ArrayList();
        h hVar = list2.get(i10);
        int size = list2.size() - 1;
        Iterator<File> it = list.iterator();
        if (i10 >= size) {
            while (it.hasNext()) {
                File next = it.next();
                if (hVar.c(next)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        while (it.hasNext()) {
            File next2 = it.next();
            if (((FileProvider) this.f30015b).isDirectory(next2) && hVar.c(next2)) {
                arrayList.addAll(b(Arrays.asList(((FileProvider) this.f30015b).listFiles(next2, null)), list2, i10 + 1));
            }
        }
        return arrayList;
    }

    public Set<d> c() {
        Set<d> setUnmodifiableSet;
        synchronized (this.f30015b) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f30015b);
        }
        return setUnmodifiableSet;
    }

    public void e(String str) {
        Iterator<com.zipoapps.blytics.a> it = ((BLyticsEngine) this.f30015b).f28213f.iterator();
        while (it.hasNext()) {
            it.next().f(str);
        }
    }

    public <T> void f(String str, T t10) {
        BLyticsEngine bLyticsEngine = (BLyticsEngine) this.f30015b;
        com.zipoapps.blytics.e eVar = (com.zipoapps.blytics.e) bLyticsEngine.f28210c;
        Objects.requireNonNull(eVar);
        eVar.f28226a.edit().putString("blytics_user." + str, String.valueOf(t10)).apply();
        Iterator<com.zipoapps.blytics.a> it = bLyticsEngine.f28213f.iterator();
        while (it.hasNext()) {
            it.next().g(str, String.valueOf(t10));
        }
    }

    public List<h> g(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : str.split(File.separator)) {
            boolean z10 = str2.contains("(?:\ufffe)?") && str2.contains("(?:\uffff)?");
            String strReplace = str2.replace("(?:\ufffe)?", "").replace("(?:\uffff)?", "");
            if (z10) {
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new w2.g(TextUtils.join(File.separator, arrayList2)));
                    arrayList2.clear();
                }
                arrayList.add(new i(strReplace));
            } else {
                arrayList2.add(strReplace);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new w2.g(TextUtils.join(File.separator, arrayList2)));
        }
        return arrayList;
    }

    public List<String> h(List<File> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getAbsolutePath());
        }
        return arrayList;
    }

    public void i(ka.b bVar) {
        BLyticsEngine bLyticsEngine = (BLyticsEngine) this.f30015b;
        if (bLyticsEngine.f28212e == null) {
            bLyticsEngine.f28212e = new com.zipoapps.blytics.g(bLyticsEngine);
        }
        com.zipoapps.blytics.g gVar = bLyticsEngine.f28212e;
        ka.b bVar2 = new ka.b(bVar);
        synchronized (gVar) {
            Message message = new Message();
            message.what = 1;
            message.obj = bVar2;
            Handler handler = gVar.f28230d;
            if (handler != null) {
                handler.sendMessage(message);
            } else {
                gVar.f28231e.add(message);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.zipoapps.blytics.BLyticsEngine, java.util.Set<g6.d>] */
    public c(Application application, p pVar) {
        this.f30014a = 7;
        this.f30015b = new BLyticsEngine(application);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(FileProvider fileProvider) {
        this.f30014a = 4;
        this.f30015b = fileProvider;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.applovin.adview.AppLovinAdView, java.util.Set<g6.d>] */
    public c(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, Context context) {
        this.f30014a = 5;
        this.f30015b = new AppLovinAdView(appLovinSdk, appLovinAdSize, context);
    }
}
