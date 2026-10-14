package v4;

import android.content.Context;
import android.text.TextUtils;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x5.b<y4.a> f36677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f36679c = null;

    public c(Context context, x5.b<y4.a> bVar, String str) {
        this.f36677a = bVar;
        this.f36678b = str;
    }

    public final List<y4.a.c> a() {
        return this.f36677a.get().d(this.f36678b, "");
    }

    public final void b(Collection<y4.a.c> collection) {
        Iterator<y4.a.c> it = collection.iterator();
        while (it.hasNext()) {
            this.f36677a.get().clearConditionalUserProperty(it.next().f38064b, null, null);
        }
    }

    public void c(List<Map<String, String>> list) throws a {
        String str;
        if (this.f36677a.get() == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList<b> arrayList = new ArrayList();
        for (Map<String, String> map : list) {
            String[] strArr = b.f36669g;
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : b.f36669g) {
                if (!map.containsKey(str2)) {
                    arrayList2.add(str2);
                }
            }
            if (!arrayList2.isEmpty()) {
                throw new a(String.format("The following keys are missing from the experiment info map: %s", arrayList2));
            }
            try {
                arrayList.add(new b(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", b.f36670h.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis"))));
            } catch (NumberFormatException e10) {
                throw new a("Could not process experiment: one of the durations could not be converted into a long.", e10);
            } catch (ParseException e11) {
                throw new a("Could not process experiment: parsing experiment start time failed.", e11);
            }
        }
        if (arrayList.isEmpty()) {
            if (this.f36677a.get() == null) {
                throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
            }
            b(a());
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.add(((b) it.next()).f36671a);
        }
        List<y4.a.c> listA = a();
        HashSet hashSet2 = new HashSet();
        Iterator<y4.a.c> it2 = listA.iterator();
        while (it2.hasNext()) {
            hashSet2.add(it2.next().f38064b);
        }
        ArrayList arrayList3 = new ArrayList();
        for (y4.a.c cVar : listA) {
            if (!hashSet.contains(cVar.f38064b)) {
                arrayList3.add(cVar);
            }
        }
        b(arrayList3);
        ArrayList<b> arrayList4 = new ArrayList();
        for (b bVar : arrayList) {
            if (!hashSet2.contains(bVar.f36671a)) {
                arrayList4.add(bVar);
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(a());
        if (this.f36679c == null) {
            this.f36679c = Integer.valueOf(this.f36677a.get().c(this.f36678b));
        }
        int iIntValue = this.f36679c.intValue();
        for (b bVar2 : arrayList4) {
            while (true) {
                str = null;
                if (arrayDeque.size() < iIntValue) {
                    break;
                } else {
                    this.f36677a.get().clearConditionalUserProperty(((y4.a.c) arrayDeque.pollFirst()).f38064b, null, null);
                }
            }
            String str3 = this.f36678b;
            Objects.requireNonNull(bVar2);
            y4.a.c cVar2 = new y4.a.c();
            cVar2.f38063a = str3;
            cVar2.f38075m = bVar2.f36674d.getTime();
            cVar2.f38064b = bVar2.f36671a;
            cVar2.f38065c = bVar2.f36672b;
            if (!TextUtils.isEmpty(bVar2.f36673c)) {
                str = bVar2.f36673c;
            }
            cVar2.f38066d = str;
            cVar2.f38067e = bVar2.f36675e;
            cVar2.f38072j = bVar2.f36676f;
            this.f36677a.get().e(cVar2);
            arrayDeque.offer(cVar2);
        }
    }
}
