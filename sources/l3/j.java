package l3;

import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, List<i>> f32151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Map<String, String> f32152c;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Map<String, List<i>> f32153b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map<String, List<i>> f32154a = f32153b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb2 = new StringBuilder(property.length());
                for (int i10 = 0; i10 < length; i10++) {
                    char cCharAt = property.charAt(i10);
                    if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                        cCharAt = '?';
                    }
                    sb2.append(cCharAt);
                }
                property = sb2.toString();
            }
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                map.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f32153b = Collections.unmodifiableMap(map);
        }
    }

    public static final class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f32155a;

        public b(String str) {
            this.f32155a = str;
        }

        @Override // l3.i
        public String a() {
            return this.f32155a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f32155a.equals(((b) obj).f32155a);
            }
            return false;
        }

        public int hashCode() {
            return this.f32155a.hashCode();
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("StringHeaderFactory{value='");
            sbA.append(this.f32155a);
            sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
            sbA.append('}');
            return sbA.toString();
        }
    }

    public j(Map<String, List<i>> map) {
        this.f32151b = Collections.unmodifiableMap(map);
    }

    @Override // l3.h
    public Map<String, String> a() {
        if (this.f32152c == null) {
            synchronized (this) {
                if (this.f32152c == null) {
                    this.f32152c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f32152c;
    }

    public final Map<String, String> b() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<i>> entry : this.f32151b.entrySet()) {
            List<i> value = entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = value.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strA = value.get(i10).a();
                if (!TextUtils.isEmpty(strA)) {
                    sb2.append(strA);
                    if (i10 != value.size() - 1) {
                        sb2.append(CoreConstants.COMMA_CHAR);
                    }
                }
            }
            String string = sb2.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f32151b.equals(((j) obj).f32151b);
        }
        return false;
    }

    public int hashCode() {
        return this.f32151b.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("LazyHeaders{headers=");
        sbA.append(this.f32151b);
        sbA.append('}');
        return sbA.toString();
    }
}
