package okhttp3;

import ch.qos.logback.core.CoreConstants;
import ed.q;
import ed.u;
import fd.j0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import jc.h;
import kc.w;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import vc.e0;
import vc.g;
import wc.a;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class Headers implements Iterable<h<? extends String, ? extends String>>, a {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String str) {
            j0.i(str, "line");
            int iD = u.D(str, CoreConstants.COLON_CHAR, 0, false, 6);
            if (!(iD != -1)) {
                throw new IllegalArgumentException(j0.p("Unexpected header: ", str).toString());
            }
            String strSubstring = str.substring(0, iD);
            j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = u.Y(strSubstring).toString();
            String strSubstring2 = str.substring(iD + 1);
            j0.h(strSubstring2, "this as java.lang.String).substring(startIndex)");
            add(string, strSubstring2);
            return this;
        }

        public final Builder add(String str, String str2) {
            j0.i(str, "name");
            j0.i(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            addLenient$okhttp(str, str2);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder add(String str, Instant instant) {
            j0.i(str, "name");
            j0.i(instant, "value");
            add(str, new Date(instant.toEpochMilli()));
            return this;
        }

        public final Builder add(String str, Date date) {
            j0.i(str, "name");
            j0.i(date, "value");
            add(str, DatesKt.toHttpDateString(date));
            return this;
        }

        public final Builder addAll(Headers headers) {
            j0.i(headers, "headers");
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                addLenient$okhttp(headers.name(i10), headers.value(i10));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String str) {
            j0.i(str, "line");
            int iD = u.D(str, CoreConstants.COLON_CHAR, 1, false, 4);
            if (iD != -1) {
                String strSubstring = str.substring(0, iD);
                j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = str.substring(iD + 1);
                j0.h(strSubstring2, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(strSubstring, strSubstring2);
            } else {
                if (str.charAt(0) == ':') {
                    str = str.substring(1);
                    j0.h(str, "this as java.lang.String).substring(startIndex)");
                }
                addLenient$okhttp("", str);
            }
            return this;
        }

        public final Builder addLenient$okhttp(String str, String str2) {
            j0.i(str, "name");
            j0.i(str2, "value");
            getNamesAndValues$okhttp().add(str);
            getNamesAndValues$okhttp().add(u.Y(str2).toString());
            return this;
        }

        public final Builder addUnsafeNonAscii(String str, String str2) {
            j0.i(str, "name");
            j0.i(str2, "value");
            Headers.Companion.checkName(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Headers build() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return new Headers((String[]) array, null);
        }

        public final String get(String str) {
            j0.i(str, "name");
            int size = this.namesAndValues.size() - 2;
            int iL = c0.l(size, 0, -2);
            if (iL > size) {
                return null;
            }
            while (true) {
                int i10 = size - 2;
                if (q.i(str, this.namesAndValues.get(size), true)) {
                    return this.namesAndValues.get(size + 1);
                }
                if (size == iL) {
                    return null;
                }
                size = i10;
            }
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String str) {
            j0.i(str, "name");
            int i10 = 0;
            while (i10 < getNamesAndValues$okhttp().size()) {
                if (q.i(str, getNamesAndValues$okhttp().get(i10), true)) {
                    getNamesAndValues$okhttp().remove(i10);
                    getNamesAndValues$okhttp().remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final Builder set(String str, String str2) {
            j0.i(str, "name");
            j0.i(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            removeAll(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder set(String str, Instant instant) {
            j0.i(str, "name");
            j0.i(instant, "value");
            return set(str, new Date(instant.toEpochMilli()));
        }

        public final Builder set(String str, Date date) {
            j0.i(str, "name");
            j0.i(date, "value");
            set(str, DatesKt.toHttpDateString(date));
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                char cCharAt = str.charAt(i10);
                if (!('!' <= cCharAt && cCharAt < 127)) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
                i10 = i11;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:15:0x0023  */
        public final void checkValue(String str, String str2) {
            boolean z10;
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                char cCharAt = str.charAt(i10);
                if (cCharAt == '\t') {
                    z10 = true;
                } else {
                    if (' ' <= cCharAt && cCharAt < 127) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (!z10) {
                    throw new IllegalArgumentException(j0.p(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2), Util.isSensitiveHeader(str2) ? "" : j0.p(": ", str)).toString());
                }
                i10 = i11;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iL = c0.l(length, 0, -2);
            if (iL > length) {
                return null;
            }
            while (true) {
                int i10 = length - 2;
                if (q.i(str, strArr[length], true)) {
                    return strArr[length + 1];
                }
                if (length == iL) {
                    return null;
                }
                length = i10;
            }
        }

        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m53deprecated_of(Map<String, String> map) {
            j0.i(map, "headers");
            return of(map);
        }

        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m54deprecated_of(String... strArr) {
            j0.i(strArr, "namesAndValues");
            return of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final Headers of(Map<String, String> map) {
            j0.i(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = u.Y(key).toString();
                String string2 = u.Y(value).toString();
                checkName(string);
                checkValue(string2, string);
                strArr[i10] = string;
                strArr[i10 + 1] = string2;
                i10 += 2;
            }
            return new Headers(strArr, null);
        }

        public final Headers of(String... strArr) {
            j0.i(strArr, "namesAndValues");
            int i10 = 0;
            if (!(strArr.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = i11 + 1;
                if (!(strArr2[i11] != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr2[i11] = u.Y(strArr2[i11]).toString();
                i11 = i12;
            }
            int iL = c0.l(0, strArr2.length - 1, 2);
            if (iL >= 0) {
                while (true) {
                    int i13 = i10 + 2;
                    String str = strArr2[i10];
                    String str2 = strArr2[i10 + 1];
                    checkName(str);
                    checkValue(str2, str);
                    if (i10 == iL) {
                        break;
                    }
                    i10 = i13;
                }
            }
            return new Headers(strArr2, null);
        }
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public /* synthetic */ Headers(String[] strArr, g gVar) {
        this(strArr);
    }

    public static final Headers of(Map<String, String> map) {
        return Companion.of(map);
    }

    public static final Headers of(String... strArr) {
        return Companion.of(strArr);
    }

    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m52deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i10 = 0; i10 < length2; i10++) {
            length += (long) this.namesAndValues[i10].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    public final String get(String str) {
        j0.i(str, "name");
        return Companion.get(this.namesAndValues, str);
    }

    public final Date getDate(String str) {
        j0.i(str, "name");
        String str2 = get(str);
        if (str2 == null) {
            return null;
        }
        return DatesKt.toHttpDateOrNull(str2);
    }

    @IgnoreJRERequirement
    public final Instant getInstant(String str) {
        j0.i(str, "name");
        Date date = getDate(str);
        if (date == null) {
            return null;
        }
        return date.toInstant();
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    public Iterator<h<? extends String, ? extends String>> iterator() {
        int size = size();
        h[] hVarArr = new h[size];
        for (int i10 = 0; i10 < size; i10++) {
            hVarArr[i10] = new h(name(i10), value(i10));
        }
        return c0.y(hVarArr);
    }

    public final String name(int i10) {
        return this.namesAndValues[i10 * 2];
    }

    public final Set<String> names() {
        q.j(e0.f37000a);
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(name(i10));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        j0.h(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        kc.q.m(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        q.j(e0.f37000a);
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            String strName = name(i10);
            Locale locale = Locale.US;
            j0.h(locale, "US");
            String lowerCase = strName.toLowerCase(locale);
            j0.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i10));
            i10 = i11;
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            String strName = name(i10);
            String strValue = value(i10);
            sb2.append(strName);
            sb2.append(": ");
            if (Util.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb2.append(strValue);
            sb2.append("\n");
            i10 = i11;
        }
        String string = sb2.toString();
        j0.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String value(int i10) {
        return this.namesAndValues[(i10 * 2) + 1];
    }

    public final List<String> values(String str) {
        j0.i(str, "name");
        int size = size();
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (q.i(str, name(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i10));
            }
            i10 = i11;
        }
        if (arrayList == null) {
            return w.f32009c;
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        j0.h(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }
}
