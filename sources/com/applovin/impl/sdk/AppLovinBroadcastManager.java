package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinBroadcastManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Receiver, ArrayList<b>> f10052a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, ArrayList<b>> f10053b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ArrayList<a> f10054c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Handler f10055d = new Handler(Looper.getMainLooper()) { // from class: com.applovin.impl.sdk.AppLovinBroadcastManager.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.b();
            } else {
                super.handleMessage(message);
            }
        }
    };

    public interface Receiver {
        void onReceive(Intent intent, Map<String, Object> map);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f10056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, Object> f10057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<b> f10058c;

        public a(Intent intent, Map<String, Object> map, List<b> list) {
            this.f10056a = intent;
            this.f10057b = map;
            this.f10058c = list;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IntentFilter f10059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Receiver f10060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f10061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f10062d;

        public b(IntentFilter intentFilter, Receiver receiver) {
            this.f10059a = intentFilter;
            this.f10060b = receiver;
        }
    }

    private static List<b> a(Intent intent) {
        synchronized (f10052a) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            ArrayList<b> arrayList = f10053b.get(action);
            if (arrayList == null) {
                return null;
            }
            ArrayList arrayList2 = null;
            for (b bVar : arrayList) {
                if (!bVar.f10061c && bVar.f10059a.match(action, null, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(bVar);
                    bVar.f10061c = true;
                }
            }
            if (arrayList2 == null) {
                return null;
            }
            Iterator<b> it = arrayList2.iterator();
            while (it.hasNext()) {
                it.next().f10061c = false;
            }
            return arrayList2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        int size;
        a[] aVarArr;
        while (true) {
            synchronized (f10052a) {
                ArrayList<a> arrayList = f10054c;
                size = arrayList.size();
                if (size <= 0) {
                    return;
                }
                aVarArr = new a[size];
                arrayList.toArray(aVarArr);
                arrayList.clear();
            }
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = aVarArr[i10];
                if (aVar != null) {
                    for (b bVar : aVar.f10058c) {
                        if (bVar != null && !bVar.f10062d) {
                            bVar.f10060b.onReceive(aVar.f10056a, aVar.f10057b);
                        }
                    }
                }
            }
        }
    }

    public static void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        Map<Receiver, ArrayList<b>> map = f10052a;
        synchronized (map) {
            b bVar = new b(intentFilter, receiver);
            ArrayList<b> arrayList = map.get(receiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                map.put(receiver, arrayList);
            }
            arrayList.add(bVar);
            Iterator<String> itActionsIterator = intentFilter.actionsIterator();
            while (itActionsIterator.hasNext()) {
                String next = itActionsIterator.next();
                Map<String, ArrayList<b>> map2 = f10053b;
                ArrayList<b> arrayList2 = map2.get(next);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    map2.put(next, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    public static boolean sendBroadcast(Intent intent, Map<String, Object> map) {
        synchronized (f10052a) {
            List<b> listA = a(intent);
            if (listA == null) {
                return false;
            }
            f10054c.add(new a(intent, map, listA));
            Handler handler = f10055d;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
            return true;
        }
    }

    public static void sendBroadcastSync(Intent intent, Map<String, Object> map) {
        List<b> listA = a(intent);
        if (listA == null) {
            return;
        }
        for (b bVar : listA) {
            if (!bVar.f10062d) {
                bVar.f10060b.onReceive(intent, map);
            }
        }
    }

    public static void sendBroadcastSyncWithPendingBroadcasts(Intent intent, Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            b();
        }
    }

    public static boolean sendBroadcastWithAdObject(String str, Object obj) {
        HashMap map = new HashMap(1);
        map.put("ad", obj);
        return sendBroadcast(new Intent(str), map);
    }

    public static void unregisterReceiver(Receiver receiver) {
        Map<Receiver, ArrayList<b>> map = f10052a;
        synchronized (map) {
            ArrayList<b> arrayListRemove = map.remove(receiver);
            if (arrayListRemove == null) {
                return;
            }
            for (b bVar : arrayListRemove) {
                bVar.f10062d = true;
                Iterator<String> itActionsIterator = bVar.f10059a.actionsIterator();
                while (itActionsIterator.hasNext()) {
                    String next = itActionsIterator.next();
                    ArrayList<b> arrayList = f10053b.get(next);
                    if (arrayList != null) {
                        Iterator<b> it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (it.next().f10060b == receiver) {
                                bVar.f10062d = true;
                                it.remove();
                            }
                        }
                        if (arrayList.size() <= 0) {
                            f10053b.remove(next);
                        }
                    }
                }
            }
        }
    }
}
