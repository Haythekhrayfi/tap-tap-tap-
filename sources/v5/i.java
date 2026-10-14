package v5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f36691a;

    public i(Context context, String str) {
        this.f36691a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        long j10 = this.f36691a.getLong("fire-count", 0L);
        String str = null;
        String key = "";
        for (Map.Entry<String, ?> entry : this.f36691a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str == null || str.compareTo(str2) > 0) {
                        key = entry.getKey();
                        str = str2;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f36691a.getStringSet(key, new HashSet()));
        hashSet.remove(str);
        this.f36691a.edit().putStringSet(key, hashSet).putLong("fire-count", j10 - 1).commit();
    }

    public synchronized void b() {
        SharedPreferences.Editor editorEdit = this.f36691a.edit();
        for (Map.Entry<String, ?> entry : this.f36691a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                editorEdit.remove(entry.getKey());
            }
        }
        editorEdit.remove("fire-count");
        editorEdit.commit();
    }

    public synchronized List<j> c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f36691a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                arrayList.add(new a(entry.getKey(), new ArrayList((Set) entry.getValue())));
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            this.f36691a.edit().putLong("fire-global", jCurrentTimeMillis).commit();
        }
        return arrayList;
        return arrayList;
    }

    public final synchronized String d(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j10).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f36691a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void f(String str) {
        String strE = e(str);
        if (strE == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f36691a.getStringSet(strE, new HashSet()));
        hashSet.remove(str);
        (hashSet.isEmpty() ? this.f36691a.edit().remove(strE) : this.f36691a.edit().putStringSet(strE, hashSet)).commit();
    }

    public synchronized boolean g(String str, long j10) {
        if (!this.f36691a.contains(str)) {
            this.f36691a.edit().putLong(str, j10).commit();
            return true;
        }
        long j11 = this.f36691a.getLong(str, -1L);
        synchronized (this) {
            if (d(j11).equals(d(j10))) {
                return false;
            }
            this.f36691a.edit().putLong(str, j10).commit();
            return true;
        }
    }

    public synchronized void h(long j10, String str) {
        String strD = d(j10);
        if (this.f36691a.getString("last-used-date", "").equals(strD)) {
            return;
        }
        long j11 = this.f36691a.getLong("fire-count", 0L);
        if (j11 + 1 == 30) {
            a();
            j11 = this.f36691a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f36691a.getStringSet(str, new HashSet()));
        hashSet.add(strD);
        this.f36691a.edit().putStringSet(str, hashSet).putLong("fire-count", j11 + 1).putString("last-used-date", strD).commit();
    }
}
